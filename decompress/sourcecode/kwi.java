// 
// Decompiled by Procyon v0.6.0
// 

public final class kwi implements uti
{
    public final arhr a;
    public final ashp b;
    public final ashp c;
    public final asib d;
    public kwh e;
    public kwh f;
    private final kwe g;
    private final kwj h;
    private final arud i;
    
    public kwi(final arhr a, final kwe g, final arud i, final ashp b, final ashp c, final kwj h, final byte[] array, final byte[] array2) {
        this.g = g;
        this.a = a;
        this.d = new asib();
        this.i = i;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    
    public final void D(final utd utd, final boolean b) {
        final kwd f = this.g.f;
        kwh kwh;
        if (f == kwd.b) {
            kwh = this.f;
        }
        else {
            kwh = this.e;
        }
        if (kwh != null) {
            kwh.D(utd, kyp.g(utd, f, this.i) ^ true);
        }
    }
    
    public final void E(final utd utd, final boolean b) {
        kwh kwh;
        if (this.g.f == kwd.b) {
            this.h.c();
            kwh = this.f;
        }
        else {
            kwh = this.e;
        }
        if (kwh != null) {
            kwh.E(utd, b);
        }
    }
}
