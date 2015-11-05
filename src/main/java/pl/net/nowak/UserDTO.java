package pl.net.nowak;

import lombok.ToString;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 05.11.15
 * Time: 23:58
 * To change this template use File | Settings | File Templates.
 */
@ToString
public class UserDTO {

    private String name;
    private Set<AgreementDTO> agreements;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AgreementDTO> getAgreements() {
        return agreements;
    }

    public void setAgreements(Set<AgreementDTO> agreements) {
        this.agreements = agreements;
    }
}
