// 
// Decompiled by Procyon v0.6.0
// 

public final class iit implements iix
{
    public final int a;
    public final Class b;
    private final vdr c;
    private final aezf d;
    private final hzn e;
    
    public iit(final vdr c, final hzn e, final int a, final Class b, final aezf d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final int b() {
        return this.a;
    }
    
    public final aezp c(final String s) {
        return aezp.k((Object)s);
    }
    
    public final afft d(final String s) {
        return afft.s((Object)this.e.H(s));
    }
    
    public final Class e() {
        return this.b;
    }
    
    public final Class f() {
        return this.b;
    }
    
    public final argj g(final String s) {
        return new argj(1, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, final String s, final iiw iiw) {
        final vdq b = this.c.b();
        if (vfn != null) {
            return fzw.aC(vfn.a().a((vfp)b));
        }
        final vfk vfk = (vfk)this.d.apply((Object)s);
        vfk.getClass();
        return fzw.aC(vfk.a((vfp)b));
    }
}
