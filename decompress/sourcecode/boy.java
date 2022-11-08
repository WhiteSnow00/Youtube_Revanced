import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class boy implements bnu
{
    private static final bpd a;
    private final long b;
    private final ArrayList c;
    
    static {
        a = new bpd(new azm[] { new azm(new ayf[] { bpa.a }) });
    }
    
    public boy(final long b) {
        this.b = b;
        this.c = new ArrayList();
    }
    
    private final long b(final long n) {
        return baw.r(n, 0L, this.b);
    }
    
    public final long a(final long n, final bfu bfu) {
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
            ((boz)this.c.get(i)).c(b);
        }
        return b;
    }
    
    public final long g(final bqv[] array, final boolean[] array2, final bov[] array3, final boolean[] array4, long b) {
        b = this.b(b);
        for (int i = 0; i < array.length; ++i) {
            final bov bov = array3[i];
            bov bov2 = null;
            Label_0069: {
                if ((bov2 = bov) != null) {
                    if (array[i] != null) {
                        bov2 = bov;
                        if (array2[i]) {
                            break Label_0069;
                        }
                    }
                    this.c.remove(bov);
                    bov2 = null;
                    array3[i] = null;
                }
            }
            if (bov2 == null && array[i] != null) {
                final boz boz = new boz(this.b);
                boz.c(b);
                this.c.add(boz);
                array3[i] = (bov)boz;
                array4[i] = true;
            }
        }
        return b;
    }
    
    public final bpd h() {
        return boy.a;
    }
    
    public final void i(final long n, final boolean b) {
    }
    
    public final void j() {
    }
    
    public final void l(final bnt bnt, final long n) {
        bnt.kX((bnu)this);
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
