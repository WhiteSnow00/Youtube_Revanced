import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class bvt implements bvv
{
    private final long[] a;
    private final long[] b;
    private final long c;
    
    public bvt(final long[] a, final long[] b, long w) {
        this.a = a;
        this.b = b;
        if (w == -9223372036854775807L) {
            w = baw.w(b[b.length - 1]);
        }
        this.c = w;
    }
    
    private static Pair d(final long n, final long[] array, final long[] array2) {
        int av = baw.av(array, n, true);
        final long n2 = array[av];
        final long n3 = array2[av];
        if (++av == array.length) {
            return Pair.create((Object)n2, (Object)n3);
        }
        final long n4 = array[av];
        final long n5 = array2[av];
        double n6;
        if (n4 == n2) {
            n6 = 0.0;
        }
        else {
            final double n7 = (double)n;
            final double n8 = (double)n2;
            Double.isNaN(n7);
            Double.isNaN(n8);
            final double n9 = (double)(n4 - n2);
            Double.isNaN(n9);
            n6 = (n7 - n8) / n9;
        }
        final double n10 = (double)(n5 - n3);
        Double.isNaN(n10);
        return Pair.create((Object)n, (Object)((long)(n6 * n10) + n3));
    }
    
    public final long a() {
        return this.c;
    }
    
    public final btx b(long longValue) {
        final Pair d = d(baw.A(baw.r(longValue, 0L, this.c)), this.b, this.a);
        longValue = (long)d.first;
        final bua bua = new bua(baw.w(longValue), (long)d.second);
        return new btx(bua, bua);
    }
    
    public final boolean c() {
        return true;
    }
    
    public final long e() {
        return -1L;
    }
    
    public final long f(final long n) {
        return baw.w((long)d(n, this.a, this.b).second);
    }
}
