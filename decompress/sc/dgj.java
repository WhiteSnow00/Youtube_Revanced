import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class dgj
{
    private final dgi a;
    private final Map b;
    
    public dgj() {
        this.a = new dgi(null);
        this.b = new HashMap();
    }
    
    private static void d(final dgi dgi) {
        final dgi d = dgi.d;
        d.c = dgi.c;
        dgi.c.d = d;
    }
    
    private static void e(final dgi dgi) {
        dgi.c.d = dgi;
        dgi.d.c = dgi;
    }
    
    public final Object a(final dgq dgq) {
        final dgi dgi = this.b.get(dgq);
        dgi dgi3;
        if (dgi == null) {
            final dgi dgi2 = new dgi(dgq);
            this.b.put(dgq, dgi2);
            dgi3 = dgi2;
        }
        else {
            dgq.a();
            dgi3 = dgi;
        }
        d(dgi3);
        final dgi a = this.a;
        dgi3.d = a;
        dgi3.c = a.c;
        e(dgi3);
        return dgi3.b();
    }
    
    public final Object b() {
        for (dgi dgi = this.a.d; !dgi.equals(this.a); dgi = dgi.d) {
            final Object b = dgi.b();
            if (b != null) {
                return b;
            }
            d(dgi);
            this.b.remove(dgi.a);
            ((dgq)dgi.a).a();
        }
        return null;
    }
    
    public final void c(final dgq dgq, final Object o) {
        final dgi dgi = this.b.get(dgq);
        dgi dgi3;
        if (dgi == null) {
            final dgi dgi2 = new dgi(dgq);
            d(dgi2);
            final dgi a = this.a;
            dgi2.d = a.d;
            dgi2.c = a;
            e(dgi2);
            this.b.put(dgq, dgi2);
            dgi3 = dgi2;
        }
        else {
            dgq.a();
            dgi3 = dgi;
        }
        if (dgi3.b == null) {
            dgi3.b = new ArrayList();
        }
        dgi3.b.add(o);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        dgi dgi = this.a.c;
        boolean b = false;
        while (!dgi.equals(this.a)) {
            sb.append('{');
            sb.append(dgi.a);
            sb.append(':');
            sb.append(dgi.a());
            sb.append("}, ");
            dgi = dgi.c;
            b = true;
        }
        if (b) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
