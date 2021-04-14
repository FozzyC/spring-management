package com.example.management;

public class RestPreconditions  {
    public static <T> T checkFound(T resource) throws MyResourceNotFoundException {
        if (resource == null) {
            throw new MyResourceNotFoundException(resource.toString() + " not Found");
        }
        return resource;
    }

    public static <T> T checkNotNull(T resource) throws MyResourceNotFoundException {
        if (resource == null) {
            throw new MyResourceNotFoundException(resource.toString() + " not Found");
        }
        return resource;
    }
}
