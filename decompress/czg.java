import java.util.Arrays;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class czg implements Closeable
{
    public static final String[] a;
    int b;
    int[] c;
    String[] d;
    int[] e;
    
    static {
        a = new String[128];
        for (int i = 0; i <= 31; ++i) {
            czg.a[i] = String.format("\\u%04x", i);
        }
        final String[] a2 = czg.a;
        a2[34] = "\\\"";
        a2[92] = "\\\\";
        a2[9] = "\\t";
        a2[8] = "\\b";
        a2[10] = "\\n";
        a2[13] = "\\r";
        a2[12] = "\\f";
    }
    
    public czg() {
        this.c = new int[32];
        this.d = new String[32];
        this.e = new int[32];
    }
    
    public static czg d(final atzm atzm) {
        return new czh(atzm);
    }
    
    public abstract double a();
    
    public abstract int b();
    
    final czf c(final String s) {
        final String e = this.e();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" at path ");
        sb.append(e);
        throw new czf(sb.toString());
    }
    
    public final String e() {
        final int b = this.b;
        final int[] c = this.c;
        final String[] d = this.d;
        final int[] e = this.e;
        final StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < b; ++i) {
            final int n = c[i];
            if (n != 1 && n != 2) {
                if (n == 3 || n == 4 || n == 5) {
                    sb.append('.');
                    final String s = d[i];
                    if (s != null) {
                        sb.append(s);
                    }
                }
            }
            else {
                sb.append('[');
                sb.append(e[i]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
    
    public abstract String f();
    
    public abstract String g();
    
    public abstract void h();
    
    public abstract void i();
    
    public abstract void j();
    
    public abstract void k();
    
    final void l(final int n) {
        final int b = this.b;
        final int[] c = this.c;
        final int length = c.length;
        if (b == length) {
            if (b == 256) {
                throw new cze("Nesting too deep at ".concat(this.e()));
            }
            this.c = Arrays.copyOf(c, length + length);
            final String[] d = this.d;
            final int length2 = d.length;
            this.d = Arrays.copyOf(d, length2 + length2);
            final int[] e = this.e;
            final int length3 = e.length;
            this.e = Arrays.copyOf(e, length3 + length3);
        }
        this.c[this.b++] = n;
    }
    
    public abstract void m();
    
    public abstract void n();
    
    public abstract boolean o();
    
    public abstract boolean p();
    
    public abstract int q();
    
    public abstract int r(final eab p0);
}
