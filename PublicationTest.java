
package publicationtest;



 class Publication {
    public String title;
    private int noOfPages; 

    public Publication(String title, int noOfPages) {
        this.title = title;
        if (noOfPages > 0) {
            this.noOfPages = noOfPages;
        } else {
            this.noOfPages = 1;
        }
    }

    public void setNoOfPages(int noOfPages) {
        if (noOfPages > 0) {
            this.noOfPages = noOfPages;
        } else {
            this.noOfPages = 1;
        }
    }

    public int getNoOfPages() {
        return this.noOfPages;
    }

    public double getCost() {
        return (noOfPages - 10) * 50.0;
    }

    public String getPublicationInfo() {
        return "Title: " + this.title + ", Pages: " + this.noOfPages + ", Cost: " + this.getCost();
    }
}

public class PublicationTest {
    public static void main(String[] args) {
        Publication[] publications = new Publication[2];
        publications[0] = new Publication("Java Programming", 15);
        publications[1] = new Publication("Data Structures", 5);

        for (Publication publication : publications) {
            System.out.println(publication.getPublicationInfo());
        }
    }
}