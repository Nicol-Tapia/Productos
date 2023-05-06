package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBAyudante extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NOMBRE = "productos3.db";
    public static final String TABLA_PRODUCTOS = "t_productos";


    public DBAyudante(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLA_PRODUCTOS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL,"+
                "cantidad TEXT NOT NULL,"+
                "precio TEXT NOT NULL,"+
                "lugar TEXT NOT NULL)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " + TABLA_PRODUCTOS);
        onCreate(sqLiteDatabase);

    }
}
