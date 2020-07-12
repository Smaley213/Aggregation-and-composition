package by.htp.less.agry;

public class Text {

	private String header;
    private String body = "";

    public Text(Words word) {
        header = word.getValue();
    }

    public Text(Phrase phrase) {
        header = phrase.getValue();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Words word) {
        body += " " + word.getValue();
    }

    public void addBody(Phrase phrase) {
        body += " " + phrase.getValue();
    }

    public String getBody() {
        return body;
    }

}
