package labsurang.rid.mycustomer.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "customerdb";
    private static final int DATABASE_VERSION = 1;

    public static final String CUSTOMER_TABLE = "customer";

    public static final String ID_COLUMN = "id";
    public static final String NAME_COLUMN = "name";
    public static final String ADDRESS_COLUMN = "address";
    public static final String PHONE_COLUMN = "phone";
    public static final String RESI_COLUMN = "resi";
    public static final String EXPDS_COLUMN = "exspedisi";
    public static final String DATE_COLUMN = "tanggal";

    public static final String CREATE_TABLE = "CREATE TABLE "
            + CUSTOMER_TABLE + "(" + ID_COLUMN + " INTEGER PRIMARY KEY, "
            + NAME_COLUMN + " VARCHAR(255), " + ADDRESS_COLUMN + " TEXT, "
            + PHONE_COLUMN + " DECIMAL(10,5)," + RESI_COLUMN + " DECIMAL(10,5), "
            + EXPDS_COLUMN + " TEXT, " + DATE_COLUMN+ " DATE )";

    private static DataBaseHelper instance;

    public static synchronized DataBaseHelper getHelper(Context context) {
        if (instance == null)
            instance = new DataBaseHelper(context);
        return instance;
    }

    private DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}