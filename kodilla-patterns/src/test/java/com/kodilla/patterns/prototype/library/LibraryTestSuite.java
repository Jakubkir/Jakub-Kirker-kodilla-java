package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library frist:");

        Book book1 = new Book("Potop", "Sienkiewicz", LocalDate.of(1912, 2, 1));
        Book book2 = new Book("Achaia", "Ziemiański", LocalDate.of(2012, 5, 8));
        Book book3 = new Book("Pan Lodowego ogrodu", "Lewandowski", LocalDate.of(2010, 3, 8));
        Book book4 = new Book("Virion", "Ziemiański", LocalDate.of(2016, 7, 13));
        Book book5 = new Book("Gra o Tron", "R.R. Martin", LocalDate.of(1996, 9, 26));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library Second:");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());


    }
}
