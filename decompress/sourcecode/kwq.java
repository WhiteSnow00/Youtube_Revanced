import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwq implements uvd
{
    public final abno a;
    public final kwe b;
    public final gem c;
    public final hyq d;
    private final abns e;
    private final mrm f;
    
    public kwq(final abns e, final kwe b, final abno a, final fzo fzo, final gem c, final mrm f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new hyq(fzo, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
    }
    
    public final void a(final asgt asgt) {
        final asgt l = asgt.L((asjc)kus.m);
        final abns e = this.e;
        this.f.A((Callable)new lfj(this, asgt.e((aujo)e.q().k, (aujo)e.q().d, (asit)kwo.a).p().j(vem.t(l)), asgt, 1));
        this.f.A((Callable)new lax(this, asgt, 1));
    }
}
