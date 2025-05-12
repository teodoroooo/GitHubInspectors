package br.com.githubinspector;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGitHub {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do usuário do GitHub para consultar informações: ");
        String username = leitura.nextLine();

        String endereco = "https://api.github.com/users/" +username.trim();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            Gson gson = new Gson();
            UsuarioGitHub usuario = gson.fromJson(json, UsuarioGitHub.class);

            // Exibindo informações formatadas
            System.out.println("Nome: " + usuario.getName());
            System.out.println("Login: " + usuario.getLogin());
            System.out.println("Bio: " + usuario.getBio());
            System.out.println("Repositórios públicos: " + usuario.getPublic_repos());
            System.out.println("Localização: " + usuario.getLocation());
            System.out.println("Perfil: " + usuario.getHtml_url());

        } catch (IOException | InterruptedException e){
            System.out.println("Opss... Houve um erro durante a consulta á API do github");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}