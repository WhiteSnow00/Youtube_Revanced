import java.util.Collections;
import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaay implements bbk
{
    private final bbk a;
    
    public aaay(final bbk a) {
        this.a = a;
    }
    
    public final int a(final byte[] array, final int n, final int n2) {
        return this.a.a(array, n, n2);
    }
    
    public final long b(final bbo bbo) {
        final Uri a = bbo.a;
        if (a != null && tmy.cL(a)) {
            throw new zab();
        }
        return this.a.b(bbo);
    }
    
    public final Uri c() {
        return this.a.c();
    }
    
    public final void e(final bcn bcn) {
        this.a.e(bcn);
    }
    
    public final void f() {
        this.a.f();
    }
}
