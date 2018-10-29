`mvn spring-boot:run`

@Entity  
Add in class level. Declares that this class is an entity  
`@Entity`  
 `public class Employee`

@Table  
Add in class level. Define table, schema, catalog. Use name property to add the name of the table unless class name is used as the table name.  
`@Entity`  
`@Table(name = "tbl_employee")`  
 `public class Employee`

@Column  
Add column properties.  
`@Column(name = "first_name")`  
`private String firstName;`  

@Id  
Declares property as the identifier of this class.
`@Id`  
`private Long id;`  

@GeneratedValue  
use along with @Id to generate primary key automatically. JPA defines 5 strategies.  
`@Id`  
`@GeneratedValue(strategy = GenerationType.IDENTITY)`  
`private Long id;`  
- AUTO - select depending on the underlying database.
- IDENTITY
- SEQUENCE
- TABLE
- identity copy - identity is copied form another entity.  

@Version  
Adding this will add optimistic locking capability. For an update query Hibernate will automatically add version number validity in where clause. Numeric is preferred but a timestamp can also be used.  
`@Version`  
`@Column(name="optimistic_lock")`  
`private Integer version;`  

@Temporal  
Use to mark date field format like DATE (date only), TIME (time only) or TIMESTAMP (date and time).  
`@Column(name = "dob")`  
`@Temporal(TemporalType.DATE)`  
`private Date dateOfBirth;`  

@Enumerated  
Use to map enum. By default it used enum's ordinal and EnumType can be used to override default behaviour.  
`@Column(name = "employee_type")`  
`@Enumerated(EnumType.STRING)`  
`private EmployeeType employeeType;`  

@Embedded  
Define to use value object inside the entity class.

@Embeddable  
Define a value object to use in an entity.

@Transient  
Skip persisting a property.