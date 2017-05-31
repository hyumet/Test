package bg.pragmatic.notepads;

public interface Notepad {
	void createAndWriteOnNewPage(String title, String text);
	void replaceText(int pageNumber, String text) throws PageNotFoundException;
	void deleteText(int pageNumber) throws PageNotFoundException;
	void deletePage(int pageNumber) throws PageNotFoundException;
	void printAllPages();
}



alksjalksjlakjs