import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgu implements cgl
{
    public static final String[] a;
    private static final String[] c;
    public final SQLiteDatabase b;
    
    static {
        a = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
        c = new String[0];
    }
    
    public cgu(final SQLiteDatabase b) {
        this.b = b;
    }
    
    public final Cursor a(final cgr cgr) {
        final Cursor rawQueryWithFactory = this.b.rawQueryWithFactory((SQLiteDatabase$CursorFactory)new cgs((atmr)new cgt(cgr)), cgr.b(), cgu.c, (String)null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }
    
    public final Cursor b(final String s) {
        return this.a((cgr)new cgk(s));
    }
    
    public final String c() {
        return this.b.getPath();
    }
    
    public final void close() {
        this.b.close();
    }
    
    public final void d() {
        this.b.beginTransaction();
    }
    
    public final void e() {
        this.b.beginTransactionNonExclusive();
    }
    
    public final void f() {
        this.b.endTransaction();
    }
    
    public final void g(final String s) {
        this.b.execSQL(s);
    }
    
    public final void h() {
        this.b.setTransactionSuccessful();
    }
    
    public final boolean i() {
        return this.b.inTransaction();
    }
    
    public final boolean j() {
        return this.b.isOpen();
    }
    
    public final chb k(final String s) {
        final SQLiteStatement compileStatement = this.b.compileStatement(s);
        compileStatement.getClass();
        return new chb(compileStatement);
    }
    
    public final void l(final Object[] array) {
        this.b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", array);
    }
}
