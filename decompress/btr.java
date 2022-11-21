// 
// Decompiled by Procyon v0.6.0
// 

public final class btr implements bud
{
    private final bts a;
    private final long b;
    
    public btr(final bts a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    private final bue d(final long n, final long n2) {
        return new bue(n * 1000000L / this.a.e, this.b + n2);
    }
    
    public final long a() {
        return this.a.a();
    }
    
    public final bub b(final long n) {
        bad.c(this.a.k);
        final bts a = this.a;
        final dmo k = a.k;
        final Object a2 = k.a;
        final Object b = k.b;
        final long b2 = a.b(n);
        final long[] array = (long[])a2;
        int av = baz.av(array, b2, false);
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
        final bue d = this.d(n3, n2);
        if (d.b != n && av != array.length - 1) {
            ++av;
            return new bub(d, this.d(array[av], ((long[])b)[av]));
        }
        return new bub(d, d);
    }
    
    public final boolean c() {
        return true;
    }
}
