package co.edu.usbcali.gymsoft.web;

import co.edu.usbcali.gymsoft.domain.Client;
import co.edu.usbcali.gymsoft.dto.ClientDto;
import co.edu.usbcali.gymsoft.dto.request.CreateClientRequest;
import co.edu.usbcali.gymsoft.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientServiceImpl clientService;

    public ClientController(ClientServiceImpl clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<ClientDto>> getAll(){
        return ResponseEntity.ok(this.clientService.getAll());
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<Client> getById(@PathVariable int clientId){
        return ResponseEntity.ok(this.clientService.getById(clientId));
    }

    @PostMapping
    public ResponseEntity<ClientDto> save(@RequestBody CreateClientRequest createClientRequest){
        return ResponseEntity.ok(this.clientService.save(createClientRequest));
    }

}
