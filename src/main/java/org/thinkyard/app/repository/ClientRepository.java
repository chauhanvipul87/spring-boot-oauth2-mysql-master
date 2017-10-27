package org.thinkyard.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.thinkyard.app.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

	Client findByClientId(String cliendId);
}
