import j$.util.Optional;
import java.security.Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaiq
{
    public final lyf a;
    public zcj b;
    private final afci c;
    private Key d;
    private Key e;
    private final oco f;
    private final Object g;
    private final yae h;
    private final Optional i;
    private final yaw j;
    private final zeo k;
    private final xjl l;
    private final agpw m;
    
    public aaiq(final aaiq aaiq) {
        this.c = aaiq.c;
        this.a = aaiq.a;
        this.d = aaiq.d;
        this.e = aaiq.e;
        this.b = aaiq.b;
        this.l = aaiq.l;
        this.f = aaiq.f;
        this.g = aaiq.g;
        this.h = aaiq.h;
        this.m = aaiq.m;
        this.i = aaiq.i;
        this.j = aaiq.j;
        this.k = aaiq.k;
    }
    
    public aaiq(final afci c, final lyf a, final oco f, final Object g, final yae h, final agpw m, final Optional i, final yaw j, final zeo k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.f = f;
        this.g = g;
        this.h = h;
        this.m = m;
        this.l = new xjl(a, k);
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final yhm a() {
        final afci c = this.c;
        final lyf a = this.a;
        final Key d = this.d;
        final Key e = this.e;
        final zcj b = this.b;
        b.getClass();
        return new yhm(c, a, d, e, b, this.l, this.f, this.g, this.h, this.m, this.i, this.j, this.k, 2, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void b(final Key key) {
        this.d = key;
        this.e = key;
    }
}
