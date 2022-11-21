import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afbg
{
    public boolean a;
    private final String b;
    private final afbf c;
    private afbf d;
    
    public afbg(final String b) {
        final afbf afbf = new afbf();
        this.c = afbf;
        this.d = afbf;
        this.a = false;
        b.getClass();
        this.b = b;
    }
    
    private final afbf h() {
        final afbf afbf = new afbf();
        this.d.c = afbf;
        return this.d = afbf;
    }
    
    public final void a(final Object b) {
        this.h().b = b;
    }
    
    public final void b(final String a, final Object b) {
        final afbf h = this.h();
        h.b = b;
        h.a = a;
    }
    
    public final void c(final String a, final Object b) {
        final afbe afbe = new afbe();
        this.d.c = afbe;
        this.d = afbe;
        afbe.b = b;
        afbe.a = a;
    }
    
    public final void d(final String s, final float n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void e(final String s, final int n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void f(final String s, final long n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void g(final String s, final boolean b) {
        this.c(s, String.valueOf(b));
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        afbf afbf = this.c.c;
        String s = "";
        while (afbf != null) {
            final Object b = afbf.b;
            String s2 = null;
            Label_0164: {
                if (!(afbf instanceof afbe) && b == null) {
                    s2 = s;
                    if (a) {
                        break Label_0164;
                    }
                }
                sb.append(s);
                final String a2 = afbf.a;
                if (a2 != null) {
                    sb.append(a2);
                    sb.append('=');
                }
                if (b != null && b.getClass().isArray()) {
                    final String deepToString = Arrays.deepToString(new Object[] { b });
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                else {
                    sb.append(b);
                }
                s2 = ", ";
            }
            afbf = afbf.c;
            s = s2;
        }
        sb.append('}');
        return sb.toString();
    }
}
