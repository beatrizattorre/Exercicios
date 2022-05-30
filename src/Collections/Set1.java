package Collections;

import java.util.*;
public class Set1 {
    public static void main(String[] args) {

                System.out.println("--\tOrdem gênero\t--");
                Set<Serie> series1 = new LinkedHashSet<>() {{
                    add(new Serie("Game of Thrones", "fantasia", 60));
                    add(new Serie("Modern Family", "comedia", 20));
                    add(new Serie("The Big Bang Theory", "comedia", 20));
                }};
        for (Serie serie: series1) {
            System.out.println();
        }

                System.out.println("--\tOrdem Tempo Episódio\t--");
    }
}

        class Serie implements Comparable<Serie>{
            private String nome;
            private String genero;
            private Integer tempoEpisodio;

            public Serie(String nome, String genero, Integer tempoEpisodio) {
                this.nome = nome;
                this.genero = genero;
                this.tempoEpisodio = tempoEpisodio;
            }

            public String getNome() {
                return nome;
            }

            public String getGenero() {
                return genero;
            }

            public Integer getTempoEpisodio() {
                return tempoEpisodio;
            }

            @Override
            public String toString() {
                return "{" +
                        "nome='" + nome + '\'' +
                        ", genero='" + genero + '\'' +
                        ", tempoEpisodio=" + tempoEpisodio +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Serie serie = (Serie) o;
                return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
            }

            @Override
            public int hashCode() {
                return Objects.hash(nome, genero, tempoEpisodio);
            }

            @Override
            public int compareTo(Serie serie) {
                int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
                if (tempoEpisodio != 0) return tempoEpisodio;

                return this.getGenero().compareTo(serie.getGenero());
            }
        }

        class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

            @Override
            public int compare(Serie s1, Serie s2) {
                int nome = s1.getNome().compareTo(s2.getNome());
                if (nome != 0) return nome;

                int genero = s1.getGenero().compareTo(s2.getGenero());
                if (genero != 0) return genero;

                return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
            }
        }
