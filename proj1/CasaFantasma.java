package proj1;

import java.util.Random;

public class CasaFantasma {
    String nomeCasa;
    Integer quantFantasmas;
    Long temperatura;
    Boolean temDono;

    // nomes de casas
    String[] nomesPossiveis = {
            "Mansão do Eclipse Sombrio",
            "Casa dos Sussurros Eternos",
            "Solar dos Lamentos Perdidos",
            "Refúgio da Noite Sem Fim",
            "A Abadia dos Olhos Vazios",
            "Residência do Último Suspiro",
            "Chalé dos Sussurros Macabros",
            "O Casarão das Sombras Profundas",
            "Vilarejo da Névoa Sangrenta",
            "Ruínas do Pacto Maldito"
    };

    public CasaFantasma() {
        gerarCasa();
    }

    public CasaFantasma(String nomeCasa, Integer quantFantasmas, Long temperatura, Boolean temDono) {
        this.nomeCasa = nomeCasa;
        this.quantFantasmas = quantFantasmas;
        this.temperatura = temperatura;
        this.temDono = temDono;
    }

    public void gerarCasa() {
        // cria uma nova instancia de "aleatorio" (tipo gerar uma seed)
        System.out.println("Estamos gerando sua casa dos pesadelos, por favor aguarde...");
        Random rn = new Random();
        // lembrando sempre de lembrar (top 10 frases) que o numero é exclusivo(digita
        // 10, vai no max 9)
        this.nomeCasa = nomesPossiveis[rn.nextInt(11)];

        this.quantFantasmas = rn.nextInt(9);
        // observacao do round:
        // Retorna int se for float, e retorna long se for Double
        this.temperatura = Math.round(rn.nextDouble(31));

        this.temDono = rn.nextBoolean();
        infoCasa();

    }

    public void infoCasa() {
        System.out.println("O nome da casa gerada foi: " + this.nomeCasa +
                "\nTem " + this.quantFantasmas + " fantasmas\nSua temperatura media é de: " + this.temperatura
                + "°c");
    }

}
