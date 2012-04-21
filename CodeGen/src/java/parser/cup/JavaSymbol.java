package uml.java.parser.cup;
public class JavaSymbol extends java_cup.runtime.Symbol {
  private int line;
  private int column;
  private int tag;
  
  
  public JavaSymbol(int type, int line, int column) {
    this(type, line, column, -1, -1, null);
  }

  public JavaSymbol(int type, int line, int column, Object value) {
    this(type, line, column, -1, -1, value);
  }

  public JavaSymbol(int type, int line, int column, int left, int right, Object value) {
    super(type, left, right, value);
    this.line = line;
    this.column = column;
  }
  

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public String toString() {   
    return "line "+line+", column "+column+", sym: "+sym+(value == null ? "" : (", value: '"+value+"'"));
  }

	public void setTag(int tag) {
		this.tag = tag;
	}
	
	public int getTag() {
		return tag;
	}
}
