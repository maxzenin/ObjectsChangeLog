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

    public String getRecordID() {
        return recordID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setParentRecordID(String parentRecordID) {
        this.parentRecordID = parentRecordID;
    }

    public String getParentRecordID() {
        return parentRecordID;
    }

    public String getDatetimeStamp() {
        return datetimeStamp;
    }

    public void setDatetimeStamp(String datetimeStamp) {
        this.datetimeStamp = datetimeStamp;
    }

    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public String getObjectID() {
        return objectID;
    }
}
