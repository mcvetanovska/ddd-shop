package org.example.sharedkernel;

import java.util.Objects;

public class Size {
    private final String value;

    public Size(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Size value cannot be null or empty");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isValid() {
        // Example validation, you can customize this
        String[] validSizes = {"XS", "S", "M", "L", "XL"};
        for (String size : validSizes) {
            if (size.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return value.equals(size.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Size{" +
                "value='" + value + '\'' +
                '}';
    }
}
