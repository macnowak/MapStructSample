package pl.net.nowak;

import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 05.11.15
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */
@ToString
public class AgreementDTO {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
