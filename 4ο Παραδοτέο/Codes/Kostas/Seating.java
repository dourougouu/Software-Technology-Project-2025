// Seating Class
class Seating {
    private int seatingId;
    private String section;
    private String row;
    private int number;

    public Seating(int seatingId, String section, String row, int number) {
        this.seatingId = seatingId;
        this.section = section;
        this.row = row;
        this.number = number;
    }

    public int getSeatingId() {
        return seatingId;
    }

    public String getSection() {
        return section;
    }

    public String getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }
}
