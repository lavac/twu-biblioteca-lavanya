package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookTest {

        @Test
        public void instanceOfBooksWithSameAttributesAreSame() {
            Book book1=new Book("2 States", "Chetan Bhagat", 2009);
            Book book2=new Book("2 States", "Chetan Bhagat", 2009);
            assertEquals(book1,book2);
        }

        @Test
        public void shouldDisplayBookinStringFormat() {
            Book book=new Book("2 States", "Chetan Bhagat", 2009);
            String expectedString = "2 States             | Chetan Bhagat        | 2009";
            assertTrue(expectedString.equals(book.toString()));

        }
}

