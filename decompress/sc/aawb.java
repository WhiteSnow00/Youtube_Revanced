// 
// Decompiled by Procyon v0.6.0
// 

public final class aawb
{
    public aaua a;
    public aavv b;
    public aawe c;
    public aawf d;
    public aawf e;
    public aawg f;
    public aawd g;
    public aawd h;
    public aawd i;
    public aawd j;
    private final aanx k;
    
    public aawb(final aanx k, final aaua a, final byte[] array, final byte[] array2) {
        this.k = k;
        this.a = a;
        this.d();
    }
    
    public final atke a() {
        return (atke)new aavb(this, 2);
    }
    
    public final atke b() {
        return (atke)new aavb(this, 3);
    }
    
    public final atke c() {
        return (atke)new aavb(this, 4);
    }
    
    public final void d() {
        this.b = new aavv(this.k, null, null);
        final aanx k = this.k;
        this.f = new aawg(k.d(2131951665), k.d(2131951664));
        this.c = new aawe(this.k, (byte[])null, (byte[])null);
        this.e = new aawf(this.k, true, this.a.a(), (byte[])null, (byte[])null);
        this.d = new aawf(this.k, false, this.a.a(), (byte[])null, (byte[])null);
        this.g = new aawd(this.k, false, this.a.a(), null, null);
        this.h = new aawd(this.k, true, this.a.a(), null, null);
        this.i = new aawd(this.k, false, this.a.a(), null, null, null);
        this.j = new aawd(this.k, true, this.a.a(), null, null, null);
    }
    
    public final void e() {
        this.b.i();
        this.f.i();
        ((aavz)this.c).i();
        ((aavz)this.d).i();
        ((aavz)this.e).i();
        this.g.i();
        this.h.i();
        this.i.i();
        this.j.i();
    }
    
    public final atke f(final int n) {
        return (atke)new aawa(this, n, 1);
    }
    
    public final atke g(final int n) {
        return (atke)new aawa(this, n, 0);
    }
}
