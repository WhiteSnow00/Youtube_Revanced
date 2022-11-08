import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mq
{
    final SparseIntArray a;
    final SparseIntArray b;
    
    public mq() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }
    
    public int a(final int n, final int n2) {
        final int b = this.b(n);
        if (b != n2) {
            int i = 0;
            int n3 = 0;
            while (i < n) {
                final int b2 = this.b(i);
                final int n4 = n3 + b2;
                if (n4 == n2) {
                    n3 = 0;
                }
                else if ((n3 = n4) > n2) {
                    n3 = b2;
                }
                ++i;
            }
            if (b + n3 <= n2) {
                return n3;
            }
        }
        return 0;
    }
    
    public abstract int b(final int p0);
    
    public final int c(int n, final int n2) {
        final int b = this.b(n);
        int i = 0;
        int n3 = 0;
        int n4 = 0;
        while (i < n) {
            final int b2 = this.b(i);
            final int n5 = n3 + b2;
            int n6;
            if (n5 == n2) {
                n6 = n4 + 1;
                n3 = 0;
            }
            else {
                n3 = n5;
                n6 = n4;
                if (n5 > n2) {
                    n6 = n4 + 1;
                    n3 = b2;
                }
            }
            ++i;
            n4 = n6;
        }
        n = n4;
        if (n3 + b > n2) {
            n = n4 + 1;
        }
        return n;
    }
    
    public final void d() {
        this.b.clear();
    }
    
    public final void e() {
        this.a.clear();
    }
}
