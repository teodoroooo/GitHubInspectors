package br.com.githubinspector;

public class UsuarioGitHub {
    private String login;
    private String name;
    private String bio;
    private String location;
    private int public_repos;
    private String html_url;

    // Getters
    public String getLogin() { return login; }
    public String getName() { return name; }
    public String getBio() { return bio; }
    public String getLocation() { return location; }
    public int getPublic_repos() { return public_repos; }
    public String getHtml_url() { return html_url; }
}

