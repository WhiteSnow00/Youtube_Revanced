import java.util.Collections;
import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjh
{
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final bjy i;
    public final bjw j;
    public final Uri k;
    public final bjl l;
    private final List m;
    
    public bjh(final long a, final long b, final long c, final boolean d, final long e, final long f, final long g, final long h, final bjl l, final bjy i, final bjw j, final Uri k, final List list) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.l = l;
        this.i = i;
        this.k = k;
        this.j = j;
        List<Object> emptyList;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        else {
            emptyList = list;
        }
        this.m = emptyList;
    }
    
    public final int a() {
        return this.m.size();
    }
    
    public final long b(final int n) {
        long n2;
        if (n == this.m.size() - 1) {
            final long b = this.b;
            n2 = -9223372036854775807L;
            if (b != -9223372036854775807L) {
                return b - this.m.get(n).a;
            }
        }
        else {
            n2 = this.m.get(n + 1).a - this.m.get(n).a;
        }
        return n2;
    }
    
    public final long c(final int n) {
        return bax.w(this.b(n));
    }
    
    public final adhi d(final int n) {
        return this.m.get(n);
    }
}
