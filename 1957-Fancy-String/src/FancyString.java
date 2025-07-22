public class FancyString{

    public String makeFancyString(String s) {
        StringBuilder resultado = new StringBuilder();

        // Aqui eu entro com a logica do loop
        for (int i = 0; i < s.length(); i++) {
            char letraAtual = s.charAt(i);

            // Verifico se posso adicionar a letra de volta na string ou nao
            if (resultado.length() >= 2) { // Por padrao o valor de resultado precisa ser maior ou igual a dois
                char ultimo = resultado.charAt(resultado.length() - 1);
                char penultimo = resultado.charAt(resultado.length() -2);

                // Verificamos entao se a ultima e penultima e letras sao iguais
                if (ultimo == letraAtual && penultimo == letraAtual) { //
                    continue;
                }
            }
            resultado.append(letraAtual);
        }
        return resultado.toString();
    }

    public static void main(String[] args){
        FancyString fs = new FancyString();
        System.out.println(fs.makeFancyString("leeetcode")); // Esperado -> leetcode
        System.out.println(fs.makeFancyString("aaabaaaa")); // Esperado -> aabaa
        System.out.println(fs.makeFancyString("aab")); // Esperado -> aab
    }
}