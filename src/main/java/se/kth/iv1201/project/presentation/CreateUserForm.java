package se.kth.iv1201.project.presentation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


class CreateUserForm {

    @NotBlank(message = "Please specify user name")

    @Pattern(regexp = "^[\\p{L}\\p{M}*]*$", message = "Only letters are allowed")
    @Size(min = 2, max = 30, message = "Name must have min 2 and max 30 characters")
 
    private String firstName;
    private String lastName;
    private String  personNr;
    private String  email;
    private String password;
    private String username;

    /**
     * @return The initial FirstName of the account that will be created.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param FirstName The initial FirstName of the account that will be created.
     */
    public void setFirstName(String newElem) {
        firstName = newElem;
    }

    /**
     * @return The name of the holderName of the account that will be created.
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param holderName The name of the holderName of the account that will be
     *               created.
     */
    public void setUsername(String newElem) {
        username = newElem;
    }
    /**
     * @return The name of the holderName of the account that will be created.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param holderName The name of the holderName of the account that will be
     *               created.
     */
    public void setPassword(String newElem) {
        password = newElem;
    }
        /**
     * @return The name of the holderName of the account that will be created.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param holderName The name of the holderName of the account that will be
     *               created.
     */
    public void setEmail(String newElem) {
        email = newElem;
    }
        /**
     * @return The name of the holderName of the account that will be created.
     */
    public String getPersonNr() {
        return personNr;
    }

    /**
     * @param holderName The name of the holderName of the account that will be
     *               created.
     */
    public void setPersonNr(String newElem) {
        personNr = newElem;
    }
    /**
     * @return The name of the holderName of the account that will be created.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param holderName The name of the holderName of the account that will be
     *               created.
     */
    public void setLastName(String newName) {
        lastName = newName;
    }
}