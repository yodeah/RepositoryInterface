package com.ge.academy.contact_list.exception;

/**
 * Created by 212564370 on 6/13/2016.
 */
public class  EntityNotFoundException extends RuntimeException {
    private final Class<?> entityType;
    private final Object entityId;

    public EntityNotFoundException(Class<?> entityType, Object id) {
        this(entityType, id, null);
    }

    public EntityNotFoundException(String message, Class<?> entityType, Object entityId) {
        super(message);
        this.entityType = entityType;
        this.entityId = entityId;
    }

    public EntityNotFoundException(String message, Throwable cause, Class<?> entityType, Object entityId) {
        super(message, cause);
        this.entityType = entityType;
        this.entityId = entityId;
    }

    public EntityNotFoundException(Throwable cause, Class<?> entityType, Object entityId) {
        super(cause);
        this.entityType = entityType;
        this.entityId = entityId;
    }

    public EntityNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Class<?> entityType, Object entityId) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.entityType = entityType;
        this.entityId = entityId;
    }

    public EntityNotFoundException(Class<?> entityType, Object id, Throwable cause) {
        super(entityType.getSimpleName() + " not found with id=" + id, cause);
        this.entityType = entityType;
        this.entityId = id;
    }

    public Class<?> getEntityType() {
        return entityType;
    }

    public Object getEntityId() {
        return entityId;
    }
}