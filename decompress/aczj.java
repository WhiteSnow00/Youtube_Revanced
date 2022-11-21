import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczj extends SQLiteOpenHelper
{
    public aczj(final Context context) {
        super(context, "history.db", (SQLiteDatabase$CursorFactory)null, 512);
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE suggestions (_id INTEGER PRIMARY KEY,display1 TEXT UNIQUE ON CONFLICT REPLACE,display2 TEXT,query TEXT,date LONG);");
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        throw new UnsupportedOperationException();
    }
}
