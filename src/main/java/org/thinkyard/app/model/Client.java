package org.thinkyard.app.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "oauth_client_details")
public class Client {
	@Id
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String clientId;

	@Column(name = "resource_ids")
	private String clientResourceIds;

	@Column(name = "client_secret")
	private String clientSecret;

	@Column(name = "scope")
	private String clientScope;

	@Column(name = "authorized_grant_types")
	private String clientGrantTypes;

	@Column(name = "web_server_redirect_uri")
	private String clientRedirectUrl;

	@Column(name = "authorities")
	private String clientAuthorities;

	@Column(name = "access_token_validity")
	private Integer accessTokenValidity;

	@Column(name = "refresh_token_validity")
	private Integer refreshTokenValidity;

	@Column(name = "additionalInformation")
	private String appAdditionalInformation;

	@Column(name = "autoapprove")
	private Boolean autoApproveScopes;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientResourceIds() {
		return clientResourceIds;
	}

	public void setClientResourceIds(String clientResourceIds) {
		this.clientResourceIds = clientResourceIds;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getClientScope() {
		return clientScope;
	}

	public void setClientScope(String clientScope) {
		this.clientScope = clientScope;
	}

	public String getClientGrantTypes() {
		return clientGrantTypes;
	}

	public void setClientGrantTypes(String clientGrantTypes) {
		this.clientGrantTypes = clientGrantTypes;
	}

	public String getClientRedirectUrl() {
		return clientRedirectUrl;
	}

	public void setClientRedirectUrl(String clientRedirectUrl) {
		this.clientRedirectUrl = clientRedirectUrl;
	}

	public String getClientAuthorities() {
		return clientAuthorities;
	}

	public void setClientAuthorities(String clientAuthorities) {
		this.clientAuthorities = clientAuthorities;
	}

	public Integer getAccessTokenValidity() {
		return accessTokenValidity;
	}

	public void setAccessTokenValidity(Integer accessTokenValidity) {
		this.accessTokenValidity = accessTokenValidity;
	}

	public Integer getRefreshTokenValidity() {
		return refreshTokenValidity;
	}

	public void setRefreshTokenValidity(Integer refreshTokenValidity) {
		this.refreshTokenValidity = refreshTokenValidity;
	}

	public String getAppAdditionalInformation() {
		return appAdditionalInformation;
	}

	public void setAppAdditionalInformation(String appAdditionalInformation) {
		this.appAdditionalInformation = appAdditionalInformation;
	}

	public Boolean getAutoApproveScopes() {
		return autoApproveScopes;
	}

	public void setAutoApproveScopes(Boolean autoApproveScopes) {
		this.autoApproveScopes = autoApproveScopes;
	}

	public Client(){

	}

	public Client(Client client) {
		this.clientId = client.getClientId();
		this.clientResourceIds = client.getClientResourceIds();
		this.clientSecret = client.getClientSecret();
		this.clientScope = client.getClientScope();
		this.clientGrantTypes = client.getClientGrantTypes();
		this.clientRedirectUrl = client.getClientRedirectUrl();
		this.clientAuthorities = client.getClientAuthorities();
		this.accessTokenValidity = client.getAccessTokenValidity();
		this.refreshTokenValidity = client.getRefreshTokenValidity();
		this.appAdditionalInformation = client.getAppAdditionalInformation();
		this.autoApproveScopes = client.getAutoApproveScopes();
	}
}
