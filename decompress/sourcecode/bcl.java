import java.util.Map;
import java.util.Collections;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcl implements bbk
{
    public long a;
    public Uri b;
    private final bbk c;
    
    public bcl(final bbk c) {
        dk.d((Object)c);
        this.c = c;
        this.b = Uri.EMPTY;
        Collections.emptyMap();
    }
    
    public final int a(final byte[] array, int a, final int n) {
        a = this.c.a(array, a, n);
        if (a != -1) {
            this.a += a;
        }
        return a;
    }
    
    public final long b(final bbo bbo) {
        this.b = bbo.a;
        Collections.emptyMap();
        final long b = this.c.b(bbo);
        final Uri c = this.c();
        dk.d((Object)c);
        this.b = c;
        this.d();
        return b;
    }
    
    public final Uri c() {
        return this.c.c();
    }
    
    public final Map d() {
        return this.c.d();
    }
    
    public final void e(final bcn bcn) {
        dk.d((Object)bcn);
        this.c.e(bcn);
    }
    
    public final void f() {
        this.c.f();
    }
}
