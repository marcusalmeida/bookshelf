package bookshelf.entities

import java.lang.{Long => LongJava}
import javax.persistence.{Entity, Id, GeneratedValue}
import scala.beans.BeanProperty

@Entity
class Book extends Serializable {
  
  @Id
  @GeneratedValue
  var id: LongJava = _

  var title: String = _

  var isbn: String = _
}
