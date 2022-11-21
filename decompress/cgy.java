import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgy implements cgp
{
    public static final String[] a;
    private static final String[] c;
    public final SQLiteDatabase b;
    
    static {
        a = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
        c = new String[0];
    }
    
    public cgy(final SQLiteDatabase b) {
        this.b = b;
    }
    
    @Override
    public final Cursor a(final cgv cgv) {
        final Cursor rawQueryWithFactory = this.b.rawQueryWithFactory((SQLiteDatabase$CursorFactory)new cgw((atqj)new cgx(cgv)), cgv.b(), cgy.c, (String)null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }
    
    @Override
    public final Cursor b(final String s) {
        return this.a(new cgo(s));
    }
    
    @Override
    public final String c() {
        return this.b.getPath();
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
    
    @Override
    public final void d() {
        this.b.beginTransaction();
    }
    
    @Override
    public final void e() {
        this.b.beginTransactionNonExclusive();
    }
    
    @Override
    public final void f() {
        this.b.endTransaction();
    }
    
    @Override
    public final void g(final String s) {
        this.b.execSQL(s);
    }
    
    @Override
    public final void h() {
        this.b.setTransactionSuccessful();
    }
    
    @Override
    public final boolean i() {
        return this.b.inTransaction();
    }
    
    @Override
    public final boolean j() {
        return this.b.isOpen();
    }
    
    @Override
    public final chf k(final String s) {
        final SQLiteStatement compileStatement = this.b.compileStatement(s);
        compileStatement.getClass();
        return new chf(compileStatement);
    }
    
    @Override
    public final void l(final Object[] array) {
        this.b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", array);
    }
}
