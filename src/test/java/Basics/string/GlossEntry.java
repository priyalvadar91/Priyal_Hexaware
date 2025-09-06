package Basics.string;

public class GlossEntry{
	private String glossTerm;
	private String glossSee;
	private String sortAs;
	private GlossDef glossDef;
	private String iD;
	private String acronym;
	private String abbrev;

	public void setGlossTerm(String glossTerm){
		this.glossTerm = glossTerm;
	}

	public String getGlossTerm(){
		return glossTerm;
	}

	public void setGlossSee(String glossSee){
		this.glossSee = glossSee;
	}

	public String getGlossSee(){
		return glossSee;
	}

	public void setSortAs(String sortAs){
		this.sortAs = sortAs;
	}

	public String getSortAs(){
		return sortAs;
	}

	public void setGlossDef(GlossDef glossDef){
		this.glossDef = glossDef;
	}

	public GlossDef getGlossDef(){
		return glossDef;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setAcronym(String acronym){
		this.acronym = acronym;
	}

	public String getAcronym(){
		return acronym;
	}

	public void setAbbrev(String abbrev){
		this.abbrev = abbrev;
	}

	public String getAbbrev(){
		return abbrev;
	}

	@Override
 	public String toString(){
		return 
			"GlossEntry{" + 
			"glossTerm = '" + glossTerm + '\'' + 
			",glossSee = '" + glossSee + '\'' + 
			",sortAs = '" + sortAs + '\'' + 
			",glossDef = '" + glossDef + '\'' + 
			",iD = '" + iD + '\'' + 
			",acronym = '" + acronym + '\'' + 
			",abbrev = '" + abbrev + '\'' + 
			"}";
		}
}
