package org.thinkyard.app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.util.StringUtils;

public class AppClientDetails extends Client implements ClientDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppClientDetails(Client client) {
		super(client);
	}

	@Override
	public Integer getAccessTokenValiditySeconds() {
		return super.getAccessTokenValidity();
	}

	@Override
	public Map<String, Object> getAdditionalInformation() {
		return null;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		for (String authority : super.getClientAuthorities().split(",")) {
			grantedAuthorities.add(new SimpleGrantedAuthority(authority));
		}
		return grantedAuthorities;
	}

	@Override
	public Set<String> getAuthorizedGrantTypes() {
		return StringUtils.isEmpty(super.getClientGrantTypes()) ? null
				: new HashSet<>(Arrays.asList(super.getClientGrantTypes().split(",")));
	}

	@Override
	public Integer getRefreshTokenValiditySeconds() {
		return super.getRefreshTokenValidity();
	}

	@Override
	public Set<String> getRegisteredRedirectUri() {
		return StringUtils.isEmpty(super.getClientRedirectUrl()) ? null
				: new HashSet<>(Arrays.asList(super.getClientRedirectUrl().split(",")));
	}

	@Override
	public Set<String> getResourceIds() {
		return StringUtils.isEmpty(super.getClientResourceIds()) ? null
				: new HashSet<>(Arrays.asList(super.getClientResourceIds().split(",")));
	}

	@Override
	public Set<String> getScope() {
		return StringUtils.isEmpty(super.getClientScope()) ? null
				: new HashSet<>(Arrays.asList(super.getClientScope().split(",")));
	}

	@Override
	public boolean isAutoApprove(String arg0) {
		return super.getAutoApproveScopes();
	}

	@Override
	public boolean isScoped() {
		return true;
	}

	@Override
	public boolean isSecretRequired() {
		return true;
	}

}
