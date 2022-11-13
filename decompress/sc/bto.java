// 
// Decompiled by Procyon v0.6.0
// 

public final class bto implements bua
{
    private final btp a;
    private final long b;
    
    public bto(final btp a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    private final bub d(final long n, final long n2) {
        return new bub(n * 1000000L / this.a.e, this.b + n2);
    }
    
    public final long a() {
        return this.a.a();
    }
    
    public final bty b(final long n) {
        dk.e((Object)this.a.k);
        final btp a = this.a;
        final dml k = a.k;
        final Object a2 = k.a;
        final Object b = k.b;
        final long b2 = a.b(n);
        final long[] array = (long[])a2;
        int av = bax.av(array, b2, false);
        long n2 = 0L;
        long n3;
        if (av == -1) {
            n3 = 0L;
        }
        else {
            n3 = array[av];
        }
        if (av != -1) {
            n2 = ((long[])b)[av];
        }
        final bub d = this.d(n3, n2);
        if (d.b != n && av != array.length - 1) {
            ++av;
            return new bty(d, this.d(array[av], ((long[])b)[av]));
        }
        return new bty(d, d);
    }
    
    public final boolean c() {
        return true;
    }
}
