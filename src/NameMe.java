/**
 * Created by blayhem on 24/06/15.
 */
public class NameMe {
    protected String firstName;
    protected String lastName;
    protected String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = first+last;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        this.fullName = this.firstName+" "+this.lastName;
        return this.fullName;
    }
}

