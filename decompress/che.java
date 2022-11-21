import android.database.sqlite.SQLiteProgram;

// 
// Decompiled by Procyon v0.6.0
// 

public class che implements cgu
{
    private final SQLiteProgram a;
    
    public che(final SQLiteProgram a) {
        this.a = a;
    }
    
    @Override
    public final void c(final int n, final byte[] array) {
        this.a.bindBlob(n, array);
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final void d(final int n, final double n2) {
        this.a.bindDouble(n, n2);
    }
    
    @Override
    public final void e(final int n, final long n2) {
        this.a.bindLong(n, n2);
    }
    
    @Override
    public final void f(final int n) {
        this.a.bindNull(n);
    }
    
    @Override
    public final void g(final int n, final String s) {
        this.a.bindString(n, s);
    }
}
