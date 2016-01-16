package br.com.cursorandroid.caraoucoroa;

/**
 * Created by jonathan_campos on 16/01/2016.
 */


public enum OpcaoMoeda {
    CARA(0),
    COROA(1);

    private int anInt;

    OpcaoMoeda(int anInt) {
        this.anInt = anInt;
    }

    public int getValue() {
        return anInt;
    }
}
