package podChat.mainmodel.useLess;


public class Inviter  {


    private long id;
    private String name;
    private String firstName;
    private String image;
    private String lastName;
    private long notSeenDuration;
    private long coreUserId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNotSeenDuration() {
        return notSeenDuration;
    }

    public void setNotSeenDuration(long notSeenDuration) {
        this.notSeenDuration = notSeenDuration;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getCoreUserId() {
        return coreUserId;
    }

    public void setCoreUserId(long coreUserId) {
        this.coreUserId = coreUserId;
    }
}
