package espe.pac.pac.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import espe.pac.pac.model.Author;
import espe.pac.pac.repository.AuthorRepository;
import espe.pac.pac.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepository repository;

	@Override
	public List<Author> getAll() {
		return repository.findAll();
	}

	@Override
	public Author saveAuthor(Author author) {
		return repository.save(author);
	}

	@Override
	public Author updateAuthor(Author author) {
		return repository.save(author);
	}

	@Override
	public Optional<Author> getById(int id) {
		return repository.findById((long) id);
	}

	@Override
	public void deleteAuthor(Long id) {
		repository.deleteById((long) id);
	}

}
