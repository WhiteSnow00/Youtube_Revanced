// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxo extends aaxp implements aaxh
{
    public final aaxl b;
    public final aaxq d;
    public final int e;
    public final int f;
    public final int g;
    
    public aaxo(final abwe abwe, final boolean b, final boolean b2, final byte[] array) {
        final String concat = aaxl.f(abwe).concat(abwe.f(2131951675));
        final String e = aaxl.e(abwe, b);
        final String b3 = aaxq.b(abwe, b2);
        final String f = abwe.f(2131951674);
        final StringBuilder sb = new StringBuilder();
        sb.append(e);
        sb.append(b3);
        sb.append(f);
        super(concat, sb.toString());
        this.e = ((aaxi)this).f("uTexMultiplier");
        this.f = ((aaxi)this).f("uTexOffset");
        this.g = ((aaxi)this).f("uTextureMatrix");
        this.b = new aaxl((aaxi)this, b);
        this.d = new aaxq((aaxi)this, b2);
    }
    
    public final void a(final boolean b, final byte[] array, final long n, final long n2) {
        this.b.b(b, array, n, n2);
    }
    
    public final void b(final int n, final int n2, final int n3, final int n4) {
        this.b.d(n, n2, n3, n4);
    }
    
    public final void i() {
        this.b.a();
        super.i();
    }
}
