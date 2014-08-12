package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Phone {
    private final boolean mobile;
    private final String number;

    public Phone(final String number, final boolean mobile) {
        this.number = number;
        this.mobile = mobile;
    }

    public boolean isMobile() {
        return mobile;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Phone phone = (Phone) o;

        if (mobile != phone.mobile) return false;
        if (number != null ? !number.equals(phone.number) : phone.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (mobile ? 1 : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
