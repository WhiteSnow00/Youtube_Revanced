import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteProgram;
import android.database.Cursor;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgt implements SQLiteDatabase$CursorFactory
{
    public final atnm a;
    
    public cgt(final atnm a) {
        this.a = a;
    }
    
    public final Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
        final atnm a = this.a;
        final String[] a2 = cgv.a;
        final cgs a3 = ((cgu)a).a;
        sqLiteQuery.getClass();
        a3.h((cgr)new chb((SQLiteProgram)sqLiteQuery));
        return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
    }
}
