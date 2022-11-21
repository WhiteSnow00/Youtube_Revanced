import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aumk
{
    public int a;
    public List b;
    private int c;
    private boolean d;
    private boolean e;
    private aume[] f;
    
    static {
        new ConcurrentHashMap();
    }
    
    public aumk() {
        this.a = 1;
        this.c = 2;
        final List b = this.b;
        if (b == null) {
            this.b = new ArrayList();
        }
        else {
            b.clear();
        }
        this.d = false;
        this.e = false;
        this.f = new aume[10];
    }
    
    public static Object[] b(final List list) {
        final int size = list.size();
        if (size == 0) {
            final aumg a = aumg.a;
            return new Object[] { a, a };
        }
        if (size != 1) {
            final aumc aumc = new aumc(list);
            return new Object[] { aumc, aumc };
        }
        return new Object[] { list.get(0), list.get(1) };
    }
    
    private static aapu j(final List list, final boolean b, final boolean b2) {
        if (b && b2) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        final int size = list.size();
        if (size >= 2 && list.get(0) instanceof aumi) {
            final aumi aumi = list.get(0);
            if (aumi.b == null) {
                if (aumi.a == null) {
                    final aapu j = j(list.subList(2, size), b, b2);
                    final Object a = j.a;
                    final Object c = j.c;
                    aumi.a = (aumm)a;
                    aumi.b = (auml)c;
                    return new aapu((aumm)aumi, (auml)aumi);
                }
            }
        }
        final Object[] b3 = b(list);
        if (b) {
            return new aapu(null, (auml)b3[1]);
        }
        if (b2) {
            return new aapu((aumm)b3[0], null);
        }
        return new aapu((aumm)b3[0], (auml)b3[1]);
    }
    
    public final void a(final int n) {
        final aume aume = new aume(this.a, this.c, n, this.f);
        this.c((aumm)aume, (auml)aume);
        this.f[n] = aume;
    }
    
    public final void c(final aumm aumm, final auml auml) {
        this.b.add(aumm);
        this.b.add(auml);
        final boolean d = this.d;
        final boolean b = true;
        this.d = (aumm == null | d);
        this.e |= (auml == null && b);
    }
    
    public final void d() {
        this.a(4);
    }
    
    public final void e() {
        this.a(5);
    }
    
    public final void f() {
        this.a(6);
    }
    
    public final void g() {
        this.c = 4;
    }
    
    public final void h(final String s) {
        final aumj aumj = new aumj(s);
        Object value;
        Object value2;
        if (this.b.size() > 0) {
            final List b = this.b;
            value = b.get(b.size() - 2);
            final List b2 = this.b;
            value2 = b2.get(b2.size() - 1);
        }
        else {
            value = null;
            value2 = null;
        }
        if (value != null && value2 != null && value == value2 && value instanceof aume) {
            final aume aume = new aume((aume)value, (aumh)aumj);
            final List b3 = this.b;
            b3.set(b3.size() - 2, aume);
            final List b4 = this.b;
            b4.set(b4.size() - 1, aume);
            this.f[aume.a] = aume;
            return;
        }
        throw new IllegalStateException("No field to apply suffix to");
    }
    
    public final aapu i() {
        final aapu j = j(this.b, this.d, this.e);
        for (final aume aume : this.f) {
            if (aume != null) {
                final aume[] f2 = this.f;
                final HashSet set = new HashSet();
                final HashSet set2 = new HashSet();
                for (final aume aume2 : f2) {
                    if (aume2 != null && !aume.equals(aume2)) {
                        set.add(null);
                        set2.add(aume2.b);
                    }
                }
                final aumh b = aume.b;
                if (b != null) {
                    b.d(set2);
                }
            }
        }
        this.f = this.f.clone();
        return j;
    }
}
