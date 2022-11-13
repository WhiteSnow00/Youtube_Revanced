import java.io.File;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtu extends SQLiteOpenHelper
{
    private static final afkk a;
    
    static {
        a = afkk.m("com/google/mediapipe/framework/AssetCacheDbHelper");
    }
    
    public agtu(final Context context) {
        super(context, "drishti.db", (SQLiteDatabase$CursorFactory)null, 2);
    }
    
    public static final Cursor a(final SQLiteDatabase sqLiteDatabase, final String[] array, final String s, final String[] array2) {
        return sqLiteDatabase.query("AssetVersion", array, s, array2, (String)null, (String)null, (String)null);
    }
    
    public static final void b(final SQLiteDatabase sqLiteDatabase, String string, final String[] array) {
        final Cursor a = a(sqLiteDatabase, new String[] { "cache_path" }, string, array);
        if (a.moveToFirst()) {
            do {
                string = a.getString(a.getColumnIndexOrThrow("cache_path"));
                final File file = new File(string);
                if (file.exists() && !file.delete()) {
                    ((afki)((afki)((afkg)agtu.a).h()).j("com/google/mediapipe/framework/AssetCacheDbHelper", "removeCachedFiles", 168, "AssetCacheDbHelper.java")).t("Stale cached file: %s can't be deleted.", (Object)string);
                }
            } while (a.moveToNext());
        }
        a.close();
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE AssetVersion (_id INTEGER PRIMARY KEY,asset TEXT NOT NULL UNIQUE,cache_path TEXT,version INTEGER )");
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.onUpgrade(sqLiteDatabase, n, n2);
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS AssetVersion");
        this.onCreate(sqLiteDatabase);
    }
}
