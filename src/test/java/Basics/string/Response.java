package Basics.string;

public class Response{
	private Glossary glossary;

	public void setGlossary(Glossary glossary){
		this.glossary = glossary;
	}

	public Glossary getGlossary(){
		return glossary;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"glossary = '" + glossary + '\'' + 
			"}";
		}
}
