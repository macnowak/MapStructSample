package pl.net.nowak;

import lombok.AllArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 05.11.15
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
public class Agreement {

    private Long id;
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
