package mx.edu.utez.FizzBuzz.controller;

import mx.edu.utez.FizzBuzz.controller.dto.RequestBodyDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiciosController {

    @GetMapping("/fizzbuzz/servicio1/{n}")
    public RequestBodyDTO fizzBuzz(@PathVariable int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return new RequestBodyDTO("Juan Manuel Calvo Velez");
    }

    @GetMapping("/fibonacci/servicio2/{n}")
    public RequestBodyDTO fibonacci(@PathVariable int n) {
        long anterior = 0;
        long actual = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(anterior);
            } else if (i == 1) {
                System.out.println(actual);
            } else {
                long siguiente = anterior + actual;
                System.out.println(siguiente);
                anterior = actual;
                actual = siguiente;
            }
        }
        return new RequestBodyDTO("Juan Manuel Calvo Velez");
    }
}