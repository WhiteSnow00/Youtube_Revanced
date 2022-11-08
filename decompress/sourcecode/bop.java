// 
// Decompiled by Procyon v0.6.0
// 

public final class bop implements bob
{
    private final bbj b;
    private bks c;
    private brh d;
    private int e;
    private qpt f;
    
    public bop(final bbj bbj) {
        this(bbj, (btm)new btf());
    }
    
    public bop(final bbj b, final btm btm) {
        final qpt f = new qpt(btm);
        final bkj c = new bkj();
        final brg d = new brg();
        this.b = b;
        this.f = f;
        this.c = (bks)c;
        this.d = (brh)d;
        this.e = 1048576;
    }
    
    public final boq b(final ayt ayt) {
        dk.d((Object)ayt.b);
        final ayp b = ayt.b;
        final Object h = b.h;
        final String f = b.f;
        return new boq(ayt, this.b, this.f, this.c.a(ayt), this.d, this.e, null, null, null, null, null);
    }
}
