import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcg implements bbk
{
    private final bbk a;
    private final int b;
    private final agmd c;
    
    public bcg(final bbk a, final agmd c, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        dk.d((Object)a);
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final int a(final byte[] array, final int n, final int n2) {
        this.c.D(this.b);
        return this.a.a(array, n, n2);
    }
    
    public final long b(final bbo bbo) {
        this.c.D(this.b);
        return this.a.b(bbo);
    }
    
    public final Uri c() {
        return this.a.c();
    }
    
    public final Map d() {
        return this.a.d();
    }
    
    public final void e(final bcn bcn) {
        dk.d((Object)bcn);
        this.a.e(bcn);
    }
    
    public final void f() {
        this.a.f();
    }
}
