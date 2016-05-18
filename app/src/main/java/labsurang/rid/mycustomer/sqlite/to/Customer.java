package labsurang.rid.mycustomer.sqlite.to;


import java.util.Date;
import android.os.Parcel;
import android.os.Parcelable;

public class Customer implements Parcelable {

    private int id;
    private String name;
    private String adress;
    private String phone;
    private long resi;
    private String exspds;
    private Date tglTrans;

    public Customer() {
        super();
    }

    private Customer(Parcel in) {
        super();
        this.id = in.readInt();
        this.name = in.readString();
        this.adress = in.readString();
        this.phone = in.readString();
        this.resi = in.readLong();
        this.tglTrans = new Date(in.readLong());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getResi() {
        return resi;
    }

    public void setResi(long resi) {
        this.resi = resi;
    }

    public String getExspds() {
        return exspds;
    }

    public void setExspds(String exspds) {
        this.exspds = exspds;
    }

    public Date getTglTrans() {
        return tglTrans;
    }

    public void setTglTrans(Date tglTrans) {
        this.tglTrans = tglTrans;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", address="
                + adress + ", phone=" + phone + ", resi="
                + resi + ", exspedisi=" + exspds + ", tanggal=" + tglTrans + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(getId());
        parcel.writeString(getName());
        parcel.writeLong(getDateOfBirth().getTime());
        parcel.writeDouble(getSalary());
    }

    public static final Parcelable.Creator<Customer> CREATOR = new Parcelable.Creator<Customer>() {
        public Customer createFromParcel(Parcel in) {
            return new Customer(in);
        }

        public Customer[] newArray(int size) {
            return new Customer[size];
        }
    };

}