package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Client;
import tn.esprit.autoloc.Repositories.ClientRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClient{
    private final ClientRepo clientRepo;
    @Override
    public Client ajouterClient(Client cl) {
        return clientRepo.save(cl);
    }

    @Override
    public Void supprimerClient(long idClient) {
        clientRepo.deleteById(idClient);
        return null;
    }

    @Override
    public List<Client> recupererClients() {
        return clientRepo.findAll();
    }

    @Override
    public Set<Client> findClients() {
        return new HashSet<>(clientRepo.findAll());
    }



    @Override
    public Client recupererClientByid(long idClient) {
        return clientRepo.findById(idClient).get();
    }
}
