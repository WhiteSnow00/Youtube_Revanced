import android.os.Build$VERSION;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import android.os.WorkSource;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nao
{
    public boolean a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public WorkSource f;
    private final int g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final int l;
    private final float m;
    private String n;
    private final ClientIdentity o;
    
    public nao(final LocationRequest locationRequest) {
        this.g = locationRequest.a;
        this.h = locationRequest.b;
        this.i = locationRequest.c;
        this.j = locationRequest.d;
        this.k = locationRequest.e;
        this.l = locationRequest.f;
        this.m = locationRequest.g;
        this.a = locationRequest.h;
        this.b = locationRequest.i;
        this.c = locationRequest.j;
        this.d = locationRequest.k;
        this.n = locationRequest.l;
        this.e = locationRequest.m;
        this.f = locationRequest.n;
        this.o = locationRequest.o;
    }
    
    public final LocationRequest a() {
        final int g = this.g;
        final long h = this.h;
        long n = this.i;
        if (n == -1L) {
            n = h;
        }
        else if (g != 105) {
            n = Math.min(n, h);
        }
        final long max = Math.max(this.j, this.h);
        final long k = this.k;
        final int l = this.l;
        final float m = this.m;
        final boolean a = this.a;
        long n2 = this.b;
        if (n2 == -1L) {
            n2 = this.h;
        }
        return new LocationRequest(g, h, n, max, Long.MAX_VALUE, k, l, m, a, n2, this.c, this.d, this.n, this.e, new WorkSource(this.f), this.o);
    }
    
    @Deprecated
    public final void b(final String n) {
        if (Build$VERSION.SDK_INT < 30) {
            this.n = n;
        }
    }
}
