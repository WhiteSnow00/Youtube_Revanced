import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class aevf
{
    public final int[] a;
    public final aevd b;
    public aevd c;
    public int d;
    public int e;
    public int f;
    
    public aevf(final int[] a) {
        this.a = a;
        final aevd aevd = new aevd(-1, -1);
        this.b = aevd;
        this.c = aevd;
    }
    
    private final void d(final aevd aevd, final StringBuilder sb) {
        for (final aevd aevd2 : aevd.d.values()) {
            sb.append("  ");
            sb.append(aevd);
            sb.append(" -> ");
            sb.append(aevd2);
            sb.append(" [label=\"");
            final int[] a = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(a, aevd2.a, Math.min(a.length, aevd2.b + 1))));
            sb.append("\"]\n");
            this.d(aevd2, sb);
        }
    }
    
    final void a() {
        final aevd c = this.c.c;
        if (c != null) {
            this.c = c;
        }
        else {
            this.c = this.b;
            final int e = this.e;
            if (e > 0) {
                this.e = e - 1;
            }
            if (this.f > 0) {
                ++this.d;
            }
        }
        this.b();
    }
    
    final void b() {
        if (this.e == 0) {
            return;
        }
        aevd c = this.c.d.get(this.a[this.d]);
        while (true) {
            final int n = c.b - c.a + 1;
            final int e = this.e;
            if (n > e) {
                break;
            }
            final int d = this.d + n;
            this.d = d;
            this.c = c;
            if ((this.e = e - n) <= 0) {
                continue;
            }
            c = (aevd)c.d.get(this.a[d]);
        }
    }
    
    public final boolean c(final int n, int i, final int n2, final int n3) {
        if (n >= 0) {
            if (n2 >= 0) {
                final int min = Math.min(this.a.length, i);
                if (min - n == Math.min(this.a.length, n3) - n2) {
                    int[] a;
                    for (i = n; i <= min; ++i) {
                        a = this.a;
                        if (a[i] != a[n2 + i - n]) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("digraph {\n");
        this.d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
