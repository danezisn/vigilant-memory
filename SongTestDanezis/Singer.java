public class Singer {
	private String name;
	private int id;
	private static int counter=0;
    static Singer [] singer = new Singer[10];
    
	public int getId() {
		return id;
	}

	public Singer(String name) {
		this.name = name;
		singer [counter] = this;
		this.id = counter++;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Singer [name=" + name + ", id=" + id + "]";
	}

}


