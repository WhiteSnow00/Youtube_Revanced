import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class boz implements bnv
{
    private static final bpe a;
    private final long b;
    private final ArrayList c;
    
    static {
        a = new bpe(new azn[] { new azn(new ayg[] { bpb.a }) });
    }
    
    public boz(final long b) {
        this.b = b;
        this.c = new ArrayList();
    }
    
    private final long b(final long n) {
        return bax.r(n, 0L, this.b);
    }
    
    public final long a(final long n, final bfv bfv) {
        return this.b(n);
    }
    
    public final long c() {
        return Long.MIN_VALUE;
    }
    
    public final long d() {
        return Long.MIN_VALUE;
    }
    
    public final long e() {
        return -9223372036854775807L;
    }
    
    public final long f(long b) {
        b = this.b(b);
        for (int i = 0; i < this.c.size(); ++i) {
            ((bpa)this.c.get(i)).c(b);
        }
        return b;
    }
    
    public final long g(final bqw[] array, final boolean[] array2, final bow[] array3, final boolean[] array4, long b) {
        b = this.b(b);
        for (int i = 0; i < array.length; ++i) {
            final bow bow = array3[i];
            bow bow2 = null;
            Label_0069: {
                if ((bow2 = bow) != null) {
                    if (array[i] != null) {
                        bow2 = bow;
                        if (array2[i]) {
                            break Label_0069;
                        }
                    }
                    this.c.remove(bow);
                    bow2 = null;
                    array3[i] = null;
                }
            }
            if (bow2 == null && array[i] != null) {
                final bpa bpa = new bpa(this.b);
                bpa.c(b);
                this.c.add(bpa);
                array3[i] = (bow)bpa;
                array4[i] = true;
            }
        }
        return b;
    }
    
    public final bpe h() {
        return boz.a;
    }
    
    public final void i(final long n, final boolean b) {
    }
    
    public final void j() {
    }
    
    public final void l(final bnu bnu, final long n) {
        bnu.kX((bnv)this);
    }
    
    public final void m(final long n) {
    }
    
    public final boolean n(final long n) {
        return false;
    }
    
    public final boolean o() {
        return false;
    }
}
