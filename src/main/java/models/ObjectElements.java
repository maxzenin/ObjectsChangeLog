package models;


import javax.persistence.*;


@Entity
@Table(name = "object_elements")

public class ObjectElements {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String elementID;
    @Column(name = "record_id")
    private String recordID;
    @Column(name = "element_name")
    private String elementName;
    @Column(name = "element_type")
    private String elementType;
    @Column(name = "element_value")
    private String elementValue;

    public ObjectElements() {
    }
}
