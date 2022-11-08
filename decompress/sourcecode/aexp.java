import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexp
{
    private final String a;
    private final aexo b;
    private aexo c;
    private boolean d;
    
    public aexp(final String a) {
        final aexo aexo = new aexo();
        this.b = aexo;
        this.c = aexo;
        this.d = false;
        a.getClass();
        this.a = a;
    }
    
    private final aexo i() {
        final aexo aexo = new aexo();
        this.c.c = aexo;
        return this.c = aexo;
    }
    
    public final void a(final Object b) {
        this.i().b = b;
    }
    
    public final void b(final String a, final Object b) {
        final aexo i = this.i();
        i.b = b;
        i.a = a;
    }
    
    public final void c(final String a, final Object b) {
        final aexn aexn = new aexn();
        this.c.c = (aexo)aexn;
        this.c = (aexo)aexn;
        aexn.b = b;
        aexn.a = a;
    }
    
    public final void d() {
        this.d = true;
    }
    
    public final void e(final String s, final float n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void f(final String s, final int n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void g(final String s, final long n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void h(final String s, final boolean b) {
        this.c(s, String.valueOf(b));
    }
    
    @Override
    public final String toString() {
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        aexo aexo = this.b.c;
        String s = "";
        while (aexo != null) {
            final Object b = aexo.b;
            String s2 = null;
            Label_0164: {
                if (!(aexo instanceof aexn) && b == null) {
                    s2 = s;
                    if (d) {
                        break Label_0164;
                    }
                }
                sb.append(s);
                final String a = aexo.a;
                if (a != null) {
                    sb.append(a);
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
            aexo = aexo.c;
            s = s2;
        }
        sb.append('}');
        return sb.toString();
    }
}
