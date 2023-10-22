package br.com.taianesb.iocdi;

import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class MeuComponent {
    
    public String chamarMeuComponent() {
        return "Chamando MeuComponent...";
    }
}
