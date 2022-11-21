import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class adl
{
    public static int a;
    ado b;
    final ArrayList c;
    
    public adl(final ado b) {
        this.b = null;
        this.c = new ArrayList();
        ++adl.a;
        this.b = b;
    }
    
    public final long a(adf i, long n) {
        final ado d = i.d;
        if (d instanceof adj) {
            return n;
        }
        final int size = i.j.size();
        int j = 0;
        long n2 = n;
        while (j < size) {
            final add add = i.j.get(j);
            long min = n2;
            if (add instanceof adf) {
                final adf adf = (adf)add;
                if (adf.d == d) {
                    min = n2;
                }
                else {
                    min = Math.min(n2, this.a(adf, adf.e + n));
                }
            }
            ++j;
            n2 = min;
        }
        if (i == d.j) {
            final long a = d.a();
            i = d.i;
            n -= a;
            return Math.min(Math.min(n2, this.a(i, n)), n - d.i.e);
        }
        return n2;
    }
    
    public final long b(adf j, long n) {
        final ado d = j.d;
        if (d instanceof adj) {
            return n;
        }
        final int size = j.j.size();
        int i = 0;
        long n2 = n;
        while (i < size) {
            final add add = j.j.get(i);
            long max = n2;
            if (add instanceof adf) {
                final adf adf = (adf)add;
                if (adf.d == d) {
                    max = n2;
                }
                else {
                    max = Math.max(n2, this.b(adf, adf.e + n));
                }
            }
            ++i;
            n2 = max;
        }
        if (j == d.i) {
            final long a = d.a();
            j = d.j;
            n += a;
            return Math.max(Math.max(n2, this.b(j, n)), n - d.j.e);
        }
        return n2;
    }
}
