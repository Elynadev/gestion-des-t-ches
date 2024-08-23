public class Task {

    private int id;
    private String title;
    private boolean status;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = false;

    }

    public int getId() {
        return this.id;
    }

    public int setId (int id) {
       return this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public boolean getStatut() {
         return this.status;
    }

    public boolean setStatut( boolean status) {
         return this.status = status;
    }

}