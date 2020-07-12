package by.htp.less.agry;

public class Start {

	public static void main(String[] args) {
		
        Words word = new Words("quote");
        Text text = new Text(word);

        Words word1 = new Words("quote's");
        Words word2 = new Words("Les");
        Words word3 = new Words("Brawn");

        Phrase phrase = new Phrase();
        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);

        text.addBody(phrase);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Body: "+text.getBody());

    }

}
