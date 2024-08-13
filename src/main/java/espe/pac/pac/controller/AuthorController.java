package espe.pac.pac.controller;

import java.util.List;
import java.util.Optional;

import espe.pac.pac.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import espe.pac.pac.model.Author;
import espe.pac.pac.service.AuthorService;

@RestController
@RequestMapping("/author")
@CrossOrigin(origins = "*")
public class AuthorController {

	@Autowired
	private AuthorService service;

	@GetMapping("/")
	public List<Author> getAll() {
		return service.getAll();
	}

	@PostMapping("/")
	public ResponseEntity<Author> saveAuthor(@RequestBody Author author) throws Exception {
		Author authorCreated = service.saveAuthor(author);
		return new ResponseEntity<>(authorCreated, HttpStatus.CREATED);
	}

	@PutMapping("/")
	public ResponseEntity<Author> updateBook(@RequestBody Author author) throws Exception {
		Author authorCreated = service.updateAuthor(author);
		return new ResponseEntity<>(authorCreated, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public Optional<Author> getById(@PathVariable int id) {
		return service.getById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteAuthor(@PathVariable Long id) {
		service.deleteAuthor(id);
	}
}
