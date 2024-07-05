package br.com.alura.projetofinaloo.models;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é consideradosucesso absoluto e perferido por todos ");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo esta curtindo ");
        }
    }
}
