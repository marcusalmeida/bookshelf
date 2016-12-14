package bookshelf.entities

import java.lang.{Long => LongJava}
import javax.persistence.{Column, Entity, Id, GeneratedValue, Table}
import scala.beans.BeanProperty

@Entity
@Table(name="Books")
class Book extends Serializable {
  
  @Id
  @GeneratedValue
  @BeanProperty
  var id: LongJava = _
  
  @BeanProperty
  var title: String = _

  @Column(unique=true)
  @BeanProperty
  var isbn: String = _
}
