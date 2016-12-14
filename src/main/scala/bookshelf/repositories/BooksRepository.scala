package bookshelf.repositories

import java.lang.{Long => LongJava}
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.repository.PagingAndSortingRepository

import bookshelf.entities.Book

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
trait BooksRepository extends PagingAndSortingRepository[Book, LongJava] {
}
