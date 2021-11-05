//package com.kodilla.testing.library;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.BDDMockito;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class BookDirectoryTestSuite {
//
//    @Test
//    void testListBooksWithConditionsReturnList() {
//        assertTrue(false);
//    }
//
//    @Test
//    void testListBooksWithConditionMoreThan20() {
//        assertTrue(false);
//    }
//
//    @Test
//    void testListBooksWithConditionFragmentShorterThan3() {
//        assertTrue(false);
//    }
//    @Mock
//    private LibraryDatabase libraryDatabaseMock;
//    @Test                                                                               // [1]
////    void testListBooksWithConditionsReturnList() {                                      // [2]
////
////        // Given
////        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
////        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
////        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
////        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
////        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
////        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
////        resultListOfBooks.add(book1);                                                    // [9]
////        resultListOfBooks.add(book2);                                                    // [10]
////        resultListOfBooks.add(book3);                                                    // [11]
////        resultListOfBooks.add(book4);                                                    // [12]
////        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]
////
////        // When
////        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]
////
////        // Then
////        assertEquals(4, theListOfBooks.size());                                          // [15]
////    }
//
////    private List<Book> generateListOfNBooks(int booksQuantity) {
////        List<Book> resultList = new ArrayList<>();
////        for (int n = 1; n <= booksQuantity; n++) {
////            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
////            resultList.add(theBook);
////        }
////        return resultList;
////    }
////    @Test
////    void testListBooksWithConditionMoreThan20() {
////
////        // Given
////        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
////        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
////        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
////        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
////        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
////                .thenReturn(resultListOf15Books);                                             // [6]
////        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
////                .thenReturn(resultListOf0Books);                                              // [8]
////        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
////                .thenReturn(resultListOf40Books);                                             // [10]
////
////        // When
////        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
////        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
////        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
////        // Then
////
////        assertEquals(0, theListOfBooks0.size());                                         // [14]
////        assertEquals(15, theListOfBooks15.size());                                       // [15]
////        assertEquals(40, theListOfBooks40.size());                                        // [16]
////    }
//
////    private void assertEquals(int i, int size) {
////    }
////    @Test
////    void testListBooksWithConditionFragmentShorterThan3() {                          // [1]
////        // Given
////        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
////        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]
////
////        // When
////        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]
////
////        // Then
////        assertEquals(0, theListOfBooks10.size());                                     // [5]
////        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
////    }
////    @Test
////    void testlistBooksInHandsOf0book() {
////        //Given
////        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
////        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
////        List<Book> theEmptyList = new ArrayList<Book>();
////        when(libraryDatabaseMock.listBooksInHandsOf(anyString()))
////                .thenReturn(theEmptyList);
////        //When
////        List<Book> theEmptyList = bookLibrary.listBooksInHandsOf("ZeroBooks");
////
////        //Then
////        assertEquals(0, theEmptyList.size());
////
////    }
////    @Test
////    void testlistBooksInHandsOf1book() {
////        //Given
////        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
////        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
////        List<Book> theEmptyList = new ArrayList<Book>();
////        List<Book> theListOf1 = generateListOfNBooks(1);
////        List<Book> theListOf5 = generateListOfNBooks(5);
////        when(libraryDatabaseMock.listBooksInHandsOf(anyString()))
////                .thenReturn(theEmptyList);
////        when(libraryDatabaseMock.listBooksInHandsOf("An"))
////                .thenReturn(theListOf1);
////        when(libraryDatabaseMock.listBooksInHandsOf("Zero"))
////                .thenReturn(theListOf5);
////        //When
////        List<Book> theEmptyList = bookLibrary.listBooksInHandsOf("ZeroBooks");
////        List<Book> theListOf1 = bookLibrary.listBooksInHandsOf("An");
////        List<Book> theListOf5 = bookLibrary.listBooksInHandsOf("Zero");
////
////        //Then
////        assertEquals(0, theEmptyList.size());
////        assertEquals(1, theListOf1.size());
////        assertEquals(5, theListOf5.size());
////    }
////    @Test
////    void testlistBooksInHandsOf5book() {
////        // Given
////        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
////        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
////
////        //When
////        List<Book> theListOf5 = bookLibrary.listBooksInHandsOf("An");
////
////        //Then
////        assertEquals(5, theListOf5.size());
////        verify(libraryDatabaseMock, times(0)).listBooksInHandsOf(anyString());
////    }
////}