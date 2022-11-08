// 
// Decompiled by Procyon v0.6.0
// 

public final class bnc implements box
{
    protected final box[] a;
    
    public bnc(final box[] a) {
        this.a = a;
    }
    
    public final long c() {
        final box[] a = this.a;
        final int length = a.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long c = a[i].c();
            long min = n;
            if (c != Long.MIN_VALUE) {
                min = Math.min(n, c);
            }
            ++i;
            n = min;
        }
        if (n == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return n;
    }
    
    public final long d() {
        final box[] a = this.a;
        final int length = a.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long d = a[i].d();
            long min = n;
            if (d != Long.MIN_VALUE) {
                min = Math.min(n, d);
            }
            ++i;
            n = min;
        }
        if (n == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return n;
    }
    
    public final void m(final long n) {
        final box[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].m(n);
        }
    }
    
    public final boolean n(final long n) {
        boolean b = false;
        int i;
        boolean b3;
        do {
            final long d = this.d();
            if (d == Long.MIN_VALUE) {
                return b;
            }
            final box[] a = this.a;
            final int length = a.length;
            int j = 0;
            i = 0;
            while (j < length) {
                final box box = a[j];
                final long d2 = box.d();
                final boolean b2 = d2 != Long.MIN_VALUE && d2 <= n;
                int n2 = 0;
                Label_0115: {
                    if (d2 != d) {
                        n2 = i;
                        if (!b2) {
                            break Label_0115;
                        }
                    }
                    n2 = (i | (box.n(n) ? 1 : 0));
                }
                ++j;
                i = n2;
            }
            b3 = (b |= (i != 0));
        } while (i != 0);
        b = b3;
        return b;
    }
    
    public final boolean o() {
        final box[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (a[i].o()) {
                return true;
            }
        }
        return false;
    }
}
