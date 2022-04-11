package com.company;
import java.util.*;

        class BangunPersegi {
            int sisi;
            public BangunPersegi(int sisiii) {
                this.sisi = sisiii;
                int LuasPersegi = sisiii * sisiii;
                System.out.println(LuasPersegi);
            }
        }
        class BangunSegitiga {
            int alas;
            int tinggi;

            public BangunSegitiga(int alass, int tinggii) {
                this.alas = alass;
                this.tinggi = tinggii;
                int LuasSegitiga = alass * tinggii / 2;
                System.out.println(LuasSegitiga);
            }
        }
        class BangunLingkaran {
            float jari;
            public BangunLingkaran(float jarii) {
                this.jari = jarii;
                float lingkaran;
                if (jarii % 7 == 0) {
                    lingkaran = 22 / 7 * jarii * jarii;
                    System.out.println(lingkaran);
                } else {
                    lingkaran = 3.14f * jarii * jarii;
                    int hasil = (int) (lingkaran);
                    float hasil2 = hasil;
                    System.out.println(hasil2);
                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                Scanner hasil = new Scanner(System.in);
                int pilihan = hasil.nextInt();
                switch (pilihan) {
                    case 1:
                        int sisi = hasil.nextInt();
                        BangunPersegi persegi1 = new BangunPersegi(sisi);
                        break;
                    case 2:
                        int alas = hasil.nextInt();
                        int tinggi = hasil.nextInt();
                        BangunSegitiga segitiga2 = new BangunSegitiga(alas,tinggi);
                        break;
                    case 3:
                        float jarijari = hasil.nextFloat();
                        BangunLingkaran lingkaran3 = new BangunLingkaran(jarijari);
                        break;
                    default:
                        System.out.println("Input yang anda masukan tidak sesuai");
                }
            }
        }

