package by.htp.less.agry;

public class Phrase {

	 private String value="";

	    public void addValue(Words word) {
	        value += " " + word.getValue();
	    }

	    public String getValue() {
	        return value;
	    }
}
