package espe.pac.pac.service;

import java.util.List;
import java.util.Optional;

import espe.pac.pac.model.Author;
import espe.pac.pac.model.Book;

public interface AuthorService {

	List<Author> getAll();

	public Author saveAuthor(Author author);

	public Author updateAuthor(Author author);

	public Optional<Author> getById(int id);
	public void deleteAuthor(Long id);
}
