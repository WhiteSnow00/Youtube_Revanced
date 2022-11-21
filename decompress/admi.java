import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

final class admi extends SQLiteOpenHelper
{
    public admi(final Context context) {
        super(context, "youtube_upload_service", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS job_storage_jobs");
        sqLiteDatabase.execSQL("CREATE TABLE job_storage_jobs (id TEXT PRIMARY KEY,version INTEGER,data BLOB)");
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        final boolean b = false;
        adme.K(n > 1);
        boolean b2 = b;
        if (n2 == 1) {
            b2 = true;
        }
        adme.K(b2);
        this.onCreate(sqLiteDatabase);
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        final boolean b = false;
        adme.K(n <= 0);
        boolean b2 = b;
        if (n2 == 1) {
            b2 = true;
        }
        adme.K(b2);
        this.onCreate(sqLiteDatabase);
    }
}
