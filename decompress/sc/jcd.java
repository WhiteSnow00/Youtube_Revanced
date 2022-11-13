import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcd implements jcb
{
    public final asid a;
    public final int b;
    private final abap c;
    private final asid d;
    private final int e;
    
    public jcd(final abap c, final asid a, final asid d, final int e, final int b) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    public static Boolean c() {
        return false;
    }
    
    @Override
    public final ashc a(ashc c) {
        final abap c2 = this.c;
        final int e = this.e;
        final argj m = new argj(e, (byte[])null);
        c2.m = m;
        if (e < c2.n(abea.f).length) {
            ((atjo)m.b).tx();
        }
        c2.m(3);
        c = ((ashc)m.b).T((Object)true).n((asih)c.S((Callable)eiz.c)).c((asjr)new jbe(this, 3)).A((ashf)c).C(this.d);
        final abap c3 = this.c;
        c3.getClass();
        return c.o((asjg)new jcc(c3, 0));
    }
    
    @Override
    public final boolean b() {
        return true;
    }
}
