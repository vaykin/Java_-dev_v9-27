package org.example;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers =new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager(),new OgretmenKrediManager()};
        for (BaseKrediManager krediManager :krediManagers){
            double tutar;
            System.out.println(krediManager.hesapla(tutar= 1000));

        }
    }
}