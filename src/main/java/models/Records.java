package models;


import javax.persistence.*;

@Entity
@Table(name = "records")
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String recordID;
    @Column(name = "user_id")
    private String userID;
    @Column(name = "parent_record_id")
    private String parentRecordID;
    @Column(name = "datetime_stamp")
    private String datetimeStamp;
    @Column(name = "object_class")
    private String objectClass;
    @Column(name = "object_id")
    private String objectID;


    public Records() {
    }
}
