import java.util.Iterator;
import android.database.Cursor;
import java.util.Locale;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

final class aadl extends SQLiteOpenHelper
{
    private final int a;
    
    public aadl(Context writableDatabase) {
        super(writableDatabase, "bgol_tasks.db", (SQLiteDatabase$CursorFactory)null, Math.max(12, 8));
        this.a = Math.max(12, 8);
        writableDatabase = (Context)this.getWritableDatabase();
        Object o = ((SQLiteDatabase)writableDatabase).query("transfers", (String[])null, (String)null, (String[])null, (String)null, (String)null, (String)null);
        final int columnIndexOrThrow = ((Cursor)o).getColumnIndexOrThrow("file_path");
        final int columnIndexOrThrow2 = ((Cursor)o).getColumnIndexOrThrow("extras");
        final int columnIndexOrThrow3 = ((Cursor)o).getColumnIndexOrThrow("output_extras");
        final HashSet set = new HashSet();
        try {
            while (((Cursor)o).moveToNext()) {
                try {
                    new zzn(((Cursor)o).getBlob(columnIndexOrThrow2));
                    new zzn(((Cursor)o).getBlob(columnIndexOrThrow3));
                }
                catch (final Exception ex) {
                    set.add(((Cursor)o).getString(columnIndexOrThrow));
                }
            }
            ((Cursor)o).close();
            o = set.iterator();
            while (((Iterator)o).hasNext()) {
                ((SQLiteDatabase)writableDatabase).delete("transfers", "file_path = ?", new String[] { (String)((Iterator)o).next() });
            }
        }
        finally {
            ((Cursor)o).close();
            while (true) {}
        }
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        this.onUpgrade(sqLiteDatabase, 0, this.a);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        tdl.f(sqLiteDatabase);
        this.onUpgrade(sqLiteDatabase, 0, this.a);
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, int n, final int n2) {
        Cursor query = null;
        Label_0274: {
            if (n < 8) {
                try {
                    sqLiteDatabase.execSQL("DROP TABLE IF EXISTS transfers");
                    sqLiteDatabase.execSQL("CREATE TABLE transfers (file_path TEXT PRIMARY KEY,network_uri TEXT,status INTEGER,status_reason INTEGER,bytes_transferred BIGINT,bytes_total BIGINT,extras BLOB,output_extras BLOB, accountname TEXT,priority INTEGER DEFAULT 0)");
                    sqLiteDatabase.execSQL("CREATE INDEX idx_transfers_accountname ON transfers (accountname)");
                    n = 8;
                }
                catch (final SQLiteException query) {
                    break Label_0274;
                }
            }
            if (n == 8 && n2 > 8) {
                try {
                    query = sqLiteDatabase.query("transfers", (String[])null, (String)null, (String[])null, (String)null, (String)null, (String)null);
                    final int columnIndexOrThrow = query.getColumnIndexOrThrow("file_path");
                    final int columnIndexOrThrow2 = query.getColumnIndexOrThrow("extras");
                    try {
                        while (query.moveToNext()) {
                            final String string = query.getString(columnIndexOrThrow);
                            final zzn zzn = new zzn(query.getBlob(columnIndexOrThrow2));
                            if (zzn.p("thumbnail", false)) {
                                aadj.T((zyq)zzn, 2);
                            }
                            else if (zzn.p("ad", false)) {
                                aadj.T((zyq)zzn, 3);
                            }
                            else {
                                aadj.T((zyq)zzn, 1);
                            }
                            final ContentValues contentValues = new ContentValues();
                            contentValues.put("file_path", string);
                            contentValues.put("extras", zzn.r());
                            sqLiteDatabase.update("transfers", contentValues, "file_path = ?", new String[] { string });
                        }
                        query.close();
                        n = 9;
                    }
                    finally {
                        query.close();
                    }
                }
                catch (final SQLiteException query) {
                    break Label_0274;
                }
            }
            if (n != 9 || n2 <= 9) {
                return;
            }
            try {
                sqLiteDatabase.execSQL("ALTER TABLE transfers ADD COLUMN failure_count INTEGER NOT NULL DEFAULT 0");
                return;
            }
            catch (final SQLiteException ex) {}
        }
        trn.d(String.format(Locale.US, "[Offline] Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", n, n2), (Throwable)query);
        tdl.f(sqLiteDatabase);
        this.onUpgrade(sqLiteDatabase, 0, this.a);
    }
}
