package kohb.polikek.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "flat")
public class Flat {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "seller_id")
    private int sellerId;

    @Column(name = "cadastral_number")
    private String cadastralNumber;

    @Column(name = "rooms")
    private int rooms;

    @Column(name = "square_flat")
    private int square;

    @Column(name = "cost")
    private int cost;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "street_house")
    private String streetHouse;

    public Flat() {
    }

    public Flat(int sellerId, String cadastralNumber, int rooms, int square, int cost, String city, String district, String streetHouse) {
        this.sellerId = sellerId;
        this.cadastralNumber = cadastralNumber;
        this.rooms = rooms;
        this.square = square;
        this.cost = cost;
        this.city = city;
        this.district = district;
        this.streetHouse = streetHouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreetHouse() {
        return streetHouse;
    }

    public void setStreetHouse(String streetHouse) {
        this.streetHouse = streetHouse;
    }
}
