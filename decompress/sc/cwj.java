import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwj
{
    public static final cwj a;
    public cwk b;
    private final List c;
    
    static {
        a = new cwj(new String[] { "COMPOSITION" });
    }
    
    private cwj(final cwj cwj) {
        this.c = new ArrayList(cwj.c);
        this.b = cwj.b;
    }
    
    public cwj(final String... array) {
        this.c = Arrays.asList(array);
    }
    
    private final boolean g() {
        final List c = this.c;
        return ((String)c.get(c.size() - 1)).equals("**");
    }
    
    private static final boolean h(final String s) {
        return "__container".equals(s);
    }
    
    public final int a(final String s, final int n) {
        if (h(s)) {
            return 0;
        }
        if (!this.c.get(n).equals("**")) {
            return 1;
        }
        if (n == this.c.size() - 1) {
            return 0;
        }
        if (this.c.get(n + 1).equals(s)) {
            return 2;
        }
        return 0;
    }
    
    public final cwj b(final String s) {
        final cwj cwj = new cwj(this);
        cwj.c.add(s);
        return cwj;
    }
    
    public final cwj c(final cwk b) {
        final cwj cwj = new cwj(this);
        cwj.b = b;
        return cwj;
    }
    
    public final boolean d(final String s, final int n) {
        final int size = this.c.size();
        boolean b = false;
        if (n >= size) {
            return false;
        }
        final int n2 = this.c.size() - 1;
        final String s2 = this.c.get(n);
        if (!s2.equals("**")) {
            final boolean b2 = s2.equals(s) || s2.equals("*");
            return (n == n2 || (n == this.c.size() - 2 && this.g())) && b2;
        }
        if (n == n2) {
            return true;
        }
        final List c = this.c;
        final int n3 = n + 1;
        if (((String)c.get(n3)).equals(s)) {
            if (n != this.c.size() - 2) {
                if (n != this.c.size() - 3) {
                    return b;
                }
                if (!this.g()) {
                    return false;
                }
            }
            b = true;
            return b;
        }
        return n3 >= this.c.size() - 1 && ((String)this.c.get(n3)).equals(s);
    }
    
    public final boolean e(final String s, final int n) {
        return h(s) || (n < this.c.size() && (this.c.get(n).equals(s) || this.c.get(n).equals("**") || this.c.get(n).equals("*")));
    }
    
    public final boolean f(final String s, final int n) {
        return "__container".equals(s) || n < this.c.size() - 1 || this.c.get(n).equals("**");
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final cwk b = this.b;
        final StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(value);
        sb.append(",resolved=");
        sb.append(b != null);
        sb.append("}");
        return sb.toString();
    }
}
