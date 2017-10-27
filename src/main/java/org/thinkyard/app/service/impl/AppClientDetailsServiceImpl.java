package org.thinkyard.app.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;
import org.thinkyard.app.model.AppClientDetails;
import org.thinkyard.app.model.Client;
import org.thinkyard.app.repository.ClientRepository;
import org.thinkyard.app.service.AppClientDetailsService;

@Service
public class AppClientDetailsServiceImpl implements AppClientDetailsService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		Client client = clientRepository.findByClientId(clientId);
		if (Objects.isNull(client)) {
			throw new ClientRegistrationException("client id not found");
		}
		return new AppClientDetails(client);
	}

}
