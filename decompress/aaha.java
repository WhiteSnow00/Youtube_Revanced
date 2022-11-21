// 
// Decompiled by Procyon v0.6.0
// 

public final class aaha
{
    public final String a;
    public int b;
    public long c;
    public long d;
    public final aach e;
    public aach f;
    public final String g;
    public final int h;
    public int i;
    public aozk j;
    public aozl k;
    public final znz l;
    private final boolean m;
    
    public aaha(final String g, final String a, final int h, final aach e, final int i) {
        this.j = aozk.a;
        twd.o(a, (Object)"transferId may not be empty");
        this.a = a;
        this.e = e;
        this.j = aozk.b;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = (aach)new aade();
        this.g = g;
        this.h = h;
        this.i = i;
        this.l = zny.a;
        this.m = false;
    }
    
    public aaha(final znz l, final String a, final aach aach, final int i, final aozk j, final aozl k) {
        this.j = aozk.a;
        this.a = a;
        this.e = aach;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = aach;
        this.g = l.b();
        this.h = 0;
        this.i = i;
        this.l = l;
        this.m = true;
        this.j = j;
        this.k = k;
    }
    
    public final aadf a() {
        return new aadf(this.a, this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.m, this.l);
    }
    
    public final boolean b() {
        return this.j == aozk.e;
    }
    
    public final boolean c() {
        return this.j == aozk.d;
    }
    
    public final boolean d() {
        return this.c() || this.j == aozk.b;
    }
}
