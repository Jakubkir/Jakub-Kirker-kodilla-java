//package com.kodilla.TicTacTou;
//
//import java.util.Scanner;
//
//public class TicTacTou {
//
//    public static void main(String[] args) {
//        System.out.println("Witaj w grze, podaj wymiar planszy");
//        int wymiar = new Scanner(System.in).nextInt();
//        char symbolGracza = 'X';
//        char[][] plansza = new char[wymiar][wymiar];
//
//        boolean grajDalej = true;
//        int licznikRuchów = 0;
//        while (grajDalej && licznikRuchów <= wymiar*wymiar) {
//            TicTacTou.drukujPlansze(plansza);
//            boolean poprawnyRuch = wykonajRuch(plansza, symbolGracza);
//            if (poprawnyRuch) {
//                licznikRuchów++;
//                boolean wygranaWiersze = sprawdzWiersze(plansza, symbolGracza);
//                boolean wygranaKolumna = sprawdzKolumny(plansza, symbolGracza);
//                boolean wygranaKrzyz1 = sprawdzKrzyz1(plansza, symbolGracza);
//                boolean wygranaKrzyz2 = sprawdzKrzyz2(plansza, symbolGracza);
//                if (wygranaWiersze || wygranaKolumna || wygranaKrzyz1) {
//                    System.out.println("Gratulacje wygrałes" + " " + symbolGracza);
//                    grajDalej = false;
//                }
//
//                if (symbolGracza == 'X') {
//                    symbolGracza = 'O';
//                } else {
//                    symbolGracza = 'X';
//                }
//            }
//        }
//    }
//
//    public static boolean sprawdzWiersze(char[][] plansza, char symbol) {
//        int wymiar = plansza.length;
//        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
//            boolean wygrana = true;
//            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
//                if (plansza[wiersz][kolumna] != symbol) {
//                    wygrana = false;
//                    break;
//                }
//            }
//            if (wygrana) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean sprawdzKolumny(char[][] plansza, char symbol) {
//        int wymiar = plansza.length;
//        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
//            boolean wygrana = true;
//            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
//                if (plansza[wiersz][kolumna] != symbol) {
//                    wygrana = false;
//                    break;
//                }
//            }
//            if (wygrana) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean sprawdzKrzyz1(char[][] plansza, char symbol) {
//        int wymiar = plansza.length;
//        for (int i = 0; i < wymiar; i++) {
//            if (plansza[i][i] != symbol) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean sprawdzKrzyz2 (char[][] plansza, char symbol) {
//        int wymiar = plansza.length;
//        for (int i = 0; i < wymiar; i++) {
//            if (plansza[i][wymiar - i - 1] != symbol) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    public static boolean wykonajRuch(char[][] plansza, char symbol) {
//        System.out.println(symbol + " twój ruch");
//        System.out.println("Podaj numer wiersza");
//        int wiersz = new Scanner(System.in).nextInt();
//        System.out.println("Podaj numer kolumny");
//        int kolumna = new Scanner(System.in).nextInt();
//        boolean poprawnyRuch = plansza[wiersz][kolumna] == 0;
//        if (!poprawnyRuch) {
//            System.out.println("Niepoprawny ruch");
//            return false;
//        }
//        plansza[wiersz][kolumna] = symbol;
//        return true;
//
//    }
//
//
//    public static void drukujPlansze(char plansza[][]) {
//        int wymiar = plansza.length;
//        System.out.print("\t");
//        for (int i = 0; i < wymiar; i++) {
//            System.out.print(i + "\t");
//        }
//        System.out.println();
//        for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
//            System.out.print(wiersz + ":\t");
//            for (int kolumna = 0; kolumna < plansza[wiersz].length; kolumna++) {
//                System.out.print(plansza[wiersz][kolumna] + "\t");
//            }
//            System.out.println();
//        }
//    }
//
//
//}
//
//
