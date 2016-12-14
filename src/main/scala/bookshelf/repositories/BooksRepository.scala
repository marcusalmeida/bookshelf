package bookshelf.repositories

import java.lang.{Long => JavaLong}
import org.springframework.data.rest.core.annotation.{RepositoryRestResource, RestResource}
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import bookshelf.entities.Book

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
trait BooksRepository extends PagingAndSortingRepository[Book, JavaLong] {
  
  @RestResource(path= "isbn", rel = "isbn")
  def findByIsbn(@Param("isbn") isbn : String): Book
}
