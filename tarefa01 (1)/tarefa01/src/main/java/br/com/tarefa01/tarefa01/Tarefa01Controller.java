package br.com.tarefa01.tarefa01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Tarefa01Controller {


    @GetMapping ("Hello")
    public String getHelloWorld()
           {
        return "Hello World!";
    }

    @GetMapping ("ListaBSM")
    public List<String> getListaBSM()
    {
        return new BSM().bsmList;
    }
    
    @GetMapping ("ListaObjetivos")
    public List<String> getListaObjetivos()
    {
        return new ObjetivosAprendizagem().objetivosList;
    }
}
