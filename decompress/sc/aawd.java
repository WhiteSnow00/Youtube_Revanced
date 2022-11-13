// 
// Decompiled by Procyon v0.6.0
// 

public final class aawd extends aavz implements aavy
{
    public final int a;
    public final aawc b;
    public final aawh d;
    
    public aawd(final aanx aanx, String concat, final String s, final boolean b, final boolean b2, final byte[] array, final byte[] array2) {
        concat = aawc.f(aanx).concat(concat);
        final String e = aawc.e(aanx, b);
        final String b3 = aawh.b(aanx, b2);
        final StringBuilder sb = new StringBuilder();
        sb.append(e);
        sb.append(b3);
        sb.append(s);
        super(concat, sb.toString());
        this.a = this.e("aVertPos");
        this.b = new aawc(this, b);
        this.d = new aawh(this, b2);
    }
    
    public aawd(final aanx aanx, final boolean b, final boolean b2, final byte[] array, final byte[] array2) {
        this(aanx, aanx.d(2131951667), aanx.d(2131951666), b, b2, null, null);
    }
    
    public aawd(final aanx aanx, final boolean b, final boolean b2, final byte[] array, final byte[] array2, final byte[] array3) {
        this(aanx, aanx.d(2131951671), aanx.d(2131951670), b, b2, null, null);
    }
    
    @Override
    public final void a(final boolean b, final byte[] array, final long n, final long n2) {
        this.b.b(b, array, n, n2);
    }
    
    @Override
    public final void b(final int n, final int n2, final int n3, final int n4) {
        this.b.d(n, n2, n3, n4);
    }
    
    @Override
    public final void i() {
        this.b.a();
        super.i();
    }
}
