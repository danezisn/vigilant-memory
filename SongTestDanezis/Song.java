public class Song {
	private String title;
	private Singer singer;
	private String url;
	static Song [] songs= new Song [10];
	private static int counter=0;
	
	public Song(String title, Singer singer, String url) {
		this.title = title;
		this.singer = singer;
		this.url = url;
		songs[counter++]=this;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Song(String title1, Singer singer1) {
		title = title1;
		singer = singer1;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title1) {
		title = title1;
	}
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer1) {
		singer = singer1;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", singer=" + singer + ", url=" + url
				+ "]";
	}


}
