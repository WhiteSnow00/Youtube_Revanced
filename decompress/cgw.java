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

public final class cgw implements SQLiteDatabase$CursorFactory
{
    public final atqj a;
    
    public cgw(final atqj a) {
        this.a = a;
    }
    
    public final Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
        final atqj a = this.a;
        final String[] a2 = cgy.a;
        final cgv a3 = ((cgx)a).a;
        sqLiteQuery.getClass();
        a3.h(new che((SQLiteProgram)sqLiteQuery));
        return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
    }
}
