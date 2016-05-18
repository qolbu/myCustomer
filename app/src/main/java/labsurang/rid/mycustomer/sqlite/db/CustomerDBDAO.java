package labsurang.rid.mycustomer.sqlite.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class CustomerDBDAO {

    protected SQLiteDatabase database;
    private DataBaseHelper dbHelper;
    private Context mContext;

    public CustomerDBDAO(Context context) {
        this.mContext = context;
        dbHelper = DataBaseHelper.getHelper(mContext);
        open();

    }

    public void open() throws SQLException {
        if(dbHelper == null)
            dbHelper = DataBaseHelper.getHelper(mContext);
        database = dbHelper.getWritableDatabase();
    }

	/*public void close() {
		dbHelper.close();
		database = null;
	}*/
}