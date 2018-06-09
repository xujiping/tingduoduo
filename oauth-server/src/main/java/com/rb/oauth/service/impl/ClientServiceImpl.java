package com.rb.oauth.service.impl;

import com.rb.oauth.model.Client;
import com.rb.oauth.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xujiping
 * @date 2018/6/8 17:02
 */
@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public Client createClient(Client client) {
        return null;
    }

    @Override
    public Client updateClient(Client client) {
        return null;
    }

    @Override
    public void deleteClient(Long clientId) {

    }

    @Override
    public Client findOne(Long clientId) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client findByClientId(String clientId) {
        return null;
    }

    @Override
    public Client findByClientSecret(String clientSecret) {
        return null;
    }
}
