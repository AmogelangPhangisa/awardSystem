/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.co.visionzar.awards.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.envers.Audited;

/**
 *
 * @author Amogelang Phangisa
 */

@MappedSuperclass
public class BaseEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false, unique = true, updatable = false, insertable = false)
    private Long id;

    @Audited
    @Column(name = "Created_by", updatable = false, nullable = false, length = 65)
    private String ceatedBy;

    @Audited
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_Date")
    private Date createdDate;

    @Audited
    @Column(name = "Updated_by", length = 65)
    private String updatedBy;

    @Audited
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_Date")
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCeatedBy() {
        return ceatedBy;
    }

    public void setCeatedBy(String ceatedBy) {
        this.ceatedBy = ceatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
