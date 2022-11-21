import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bwc extends bwe
{
    public final long a;
    public final List b;
    public final List c;
    
    public bwc(final int n, final long a) {
        super(n);
        this.a = a;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    public final bwc a(final int n) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final bwc bwc = this.c.get(i);
            if (bwc.d == n) {
                return bwc;
            }
        }
        return null;
    }
    
    public final bwd b(final int n) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final bwd bwd = this.b.get(i);
            if (bwd.d == n) {
                return bwd;
            }
        }
        return null;
    }
    
    public final void c(final bwc bwc) {
        this.c.add(bwc);
    }
    
    public final void d(final bwd bwd) {
        this.b.add(bwd);
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
