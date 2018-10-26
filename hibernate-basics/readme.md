`mvn spring-boot:run`

@Entity
Add in class level. Declares that this class is an entity

@Table
Add in class level. Define table, schema, catalog. Use name property to add the name of the table unless class name is used as the table name.

@Column
Add column properties.

@Id
Declares property as the identifier of this class.

@GeneratedValue
use along with @Id to generate primary key automatically. JPA defines 5 strategies.
- AUTO - select depending on the underlying database.
- IDENTITY
- SEQUENCE
- TABLE
- identity copy - identity is copied form another entity.

@Version
Adding this will add optimistic locking capability. For an update query Hibernate will automatically add version number validity in where clause. Numeric is preferred but a timestamp can also be used.

@Temporal
Use to mark date field format like DATE (date only), TIME (time only) or TIMESTAMP (date and time)

@Enumerated
Use to map enum. By default it used enum's ordinal and EnumType can be used to override default behaviour.


