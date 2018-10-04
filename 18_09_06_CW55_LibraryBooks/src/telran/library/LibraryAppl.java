package telran.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import telran.library.service.ILibrary;

@SpringBootApplication
@RestController
@ComponentScan(basePackages="telran.library.service")
public class LibraryAppl {
@Autowired		
ILibrary library;


	public static void main(String[] args) {

		SpringApplication.run(LibraryAppl.class, args);

	}

}
