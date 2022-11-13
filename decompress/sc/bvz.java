import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bvz extends bwb
{
    public final long a;
    public final List b;
    public final List c;
    
    public bvz(final int n, final long a) {
        super(n);
        this.a = a;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    public final bvz a(final int n) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final bvz bvz = this.c.get(i);
            if (bvz.d == n) {
                return bvz;
            }
        }
        return null;
    }
    
    public final bwa b(final int n) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final bwa bwa = this.b.get(i);
            if (bwa.d == n) {
                return bwa;
            }
        }
        return null;
    }
    
    public final void c(final bvz bvz) {
        this.c.add(bvz);
    }
    
    public final void d(final bwa bwa) {
        this.b.add(bwa);
    }
    
    public final String toString() {
        final String g = g(this.d);
        final String string = Arrays.toString(this.b.toArray());
        final String string2 = Arrays.toString(this.c.toArray());
        final StringBuilder sb = new StringBuilder();
        sb.append(g);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
