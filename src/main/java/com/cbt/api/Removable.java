package com.cbt.api;

public interface Removable {

    /**
     * should remove the record from the relevant table belonging to the entity with the given ID
     * @param id primary key-value for the record to be removed
     */
    public void remove(); // IMPLEMENTATION REQS ARE WRITTEN IN THE API SPECS
}
