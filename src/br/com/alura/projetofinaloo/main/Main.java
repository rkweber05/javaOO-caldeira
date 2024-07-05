package br.com.alura.projetofinaloo.main;

import br.com.alura.projetofinaloo.models.MinhasPreferidas;
import br.com.alura.projetofinaloo.models.Musica;
import br.com.alura.projetofinaloo.models.Poscast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Poscast poscast = new Poscast();
        poscast.setTitulo("Primo Rico");
        poscast.setApresentador("Renato Perini");

        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);preferidas.inclui(poscast);

    }
}