package exam20.upper;

public class BookStore {

	public static void main(String[] args) {
		ComicBook comic = new ComicBook("내친구 뽀로로", 15000);
		comic.info();
		
		Novel novel = new Novel("해리포터", 30000);
		novel.info();
	}

}
