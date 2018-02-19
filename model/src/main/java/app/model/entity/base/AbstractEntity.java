package app.model.entity.base;


import app.model.entity.person.Account;

import java.time.LocalDateTime;

/**
 * Base class for all business entities
 * @author Plotnyk
 *
 */
public abstract class AbstractEntity {
    public static final String FIELD_CREATED_AT = "createdAt";
    /**
     * Unique entity identifier
     */
    private int id;
    /**
    * Timestamp of entity creation
    *
    * */
    private LocalDateTime createdAt;
    /**
     * Timestamp of entity last modification
     * */
    private LocalDateTime modifiedAt;
    /**
     * Person who create specific entity
     * */
    private Account createdBy;
    /**
     * Last person who modified entity
     * */
    private Account modifiedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Account createdBy) {
        this.createdBy = createdBy;
    }

    public Account getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Account modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void prePersist() {
        if (getId() == 0) {
            setCreatedAt(LocalDateTime.now());
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractEntity other = (AbstractEntity) obj;
        if (id != other.id)
            return false;
        return true;
    }
}