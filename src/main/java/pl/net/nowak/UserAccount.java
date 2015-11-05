package pl.net.nowak;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 05.11.15
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */
public class UserAccount {

    private Long id;
    private String name;
    private Set<Agreement> agreements;


    public UserAccount(Long id, String name, Set<Agreement> agreements) {
        this.id = id;
        this.name = name;
        this.agreements = agreements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Agreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(Set<Agreement> agreements) {
        this.agreements = agreements;
    }
}
