// 
// Decompiled by Procyon v0.6.0
// 

public final class brf implements Runnable
{
    public final int a;
    public final long b;
    public final long c;
    public final Object d;
    private final int e;
    
    public brf(final eae d, final int a, final long b, final long c, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public brf(final qw d, final int a, final long b, final long c, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.e != 0) {
            final Object d = this.d;
            final int a = this.a;
            final long b = this.b;
            final long c = this.c;
            final Object b2 = ((eae)d).b;
            final int a2 = baz.a;
            ((bhh)b2).k(a, b, c);
            return;
        }
        ((brg)((qw)this.d).c).af(this.a, this.b, this.c);
    }
}
