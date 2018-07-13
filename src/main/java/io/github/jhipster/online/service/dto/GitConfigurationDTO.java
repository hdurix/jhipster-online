package io.github.jhipster.online.service.dto;

import java.util.Objects;

public class GitConfigurationDTO {

    private String githubHost;
    private String githubClientId;
    private boolean isGithubAvailable;
    private String gitlabHost;
    private String gitlabRedirectUri;
    private String gitlabClientId;
    private boolean isGitlabAvailable;

    public GitConfigurationDTO(String githubHost,
                               String githubClientId,
                               boolean isGithubAvailable,
                               String gitlabHost,
                               String gitlabRedirectUri,
                               String gitlabClientId,
                               boolean isGitlabAvailable) {
        this.githubHost = githubHost;
        this.githubClientId = githubClientId;
        this.isGithubAvailable = isGithubAvailable;
        this.gitlabHost = gitlabHost;
        this.gitlabRedirectUri = gitlabRedirectUri;
        this.gitlabClientId = gitlabClientId;
        this.isGitlabAvailable = isGitlabAvailable;
    }

    public String getGithubHost() {
        return githubHost;
    }

    public void setGithubHost(String githubHost) {
        this.githubHost = githubHost;
    }

    public String getGithubClientId() {
        return githubClientId;
    }

    public void setGithubClientId(String githubClientId) {
        this.githubClientId = githubClientId;
    }

    public boolean getIsGithubAvailable() {
        return isGithubAvailable;
    }

    public void setIsGithubAvailable(boolean isGithubAvailable) {
        this.isGithubAvailable = isGithubAvailable;
    }

    public String getGitlabHost() {
        return gitlabHost;
    }

    public void setGitlabHost(String gitlabHost) {
        this.gitlabHost = gitlabHost;
    }

    public String getGitlabRedirectUri() {
        return gitlabRedirectUri;
    }

    public void setGitlabRedirectUri(String gitlabRedirectUri) {
        this.gitlabRedirectUri = gitlabRedirectUri;
    }

    public String getGitlabClientId() {
        return gitlabClientId;
    }

    public void setGitlabClientId(String gitlabClientId) {
        this.gitlabClientId = gitlabClientId;
    }

    public boolean getIsGitlabAvailable() {
        return isGitlabAvailable;
    }

    public void setIsGitlabAvailable(boolean isGitlabAvailable) {
        this.isGitlabAvailable = isGitlabAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitConfigurationDTO that = (GitConfigurationDTO) o;
        return isGithubAvailable == that.isGithubAvailable &&
            isGitlabAvailable == that.isGitlabAvailable &&
            Objects.equals(githubHost, that.githubHost) &&
            Objects.equals(githubClientId, that.githubClientId) &&
            Objects.equals(gitlabHost, that.gitlabHost) &&
            Objects.equals(gitlabRedirectUri, that.gitlabRedirectUri) &&
            Objects.equals(gitlabClientId, that.gitlabClientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(githubHost, githubClientId, isGithubAvailable,
            gitlabHost, gitlabRedirectUri, gitlabClientId, isGitlabAvailable);
    }
}