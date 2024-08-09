package Busresersationsystem;

public class Bus {
    private int busno;
    private int capacity;
    private Boolean Ac;
    private String From;
    private String To;
    private int Duration;
    private String nameofthedriver;

    public int getbusno() {
        return busno;
    }

    public void setbusno(int busno) {
        this.busno = busno;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean getAc() {
        return Ac;
    }

    public void setAc(Boolean ac) {
        Ac = ac;
    }

    public String getStart() {
        return From;
    }

    public void setStart(String start) {
        this.From = start;
    }

    public String getEnd() {
        return To;
    }

    public void setEnd(String end) {
        this.To = end;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getNameofthedriver() {
        return nameofthedriver;
    }

    public void setNameofthedriver(String nameofthedriver) {
        this.nameofthedriver = nameofthedriver;
    }

    Bus(int busno, String From,String To, int capacity, int duration, Boolean Ac,String nameofthedriver) {
        this.busno = busno;
        this.From=From;
        this.To=To;
        this.capacity = capacity;
        this.Duration=duration;
        this.Ac = Ac;
        this.nameofthedriver=nameofthedriver;

    }


}


