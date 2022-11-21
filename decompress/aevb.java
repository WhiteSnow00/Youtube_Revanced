import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class aevb
{
    private final aevb a;
    public final abp b;
    public boolean c;
    
    public aevb(final aevb a, final abp b) {
        this.c = false;
        if (a != null) {
            adme.K(a.c);
        }
        this.a = a;
        this.b = b;
    }
    
    public static aeuz b() {
        return new aeva(aeva.a, new abp());
    }
    
    static aevb c(final Set set) {
        if (set.isEmpty()) {
            return aeva.a;
        }
        if (set.size() == 1) {
            return set.iterator().next();
        }
        final Iterator iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            aevb aevb = (aevb)iterator.next();
            int n2 = n;
            aevb a;
            do {
                n = n2 + aevb.b.d;
                a = aevb.a;
                n2 = n;
            } while ((aevb = a) != null);
        }
        if (n == 0) {
            return aeva.a;
        }
        final abp abp = new abp(n);
        for (aevb a2 : set) {
            do {
                int n3 = 0;
                while (true) {
                    final abp b = a2.b;
                    if (n3 >= b.d) {
                        break;
                    }
                    adme.P(abp.put((Object)b.c(n3), a2.b.f(n3)) == null, "Duplicate bindings: %s", a2.b.c(n3));
                    ++n3;
                }
            } while ((a2 = a2.a) != null);
        }
        return new aeva(null, abp).e();
    }
    
    static aevb d(final aevb aevb, final aevb aevb2) {
        if (aevb.f()) {
            return aevb2;
        }
        if (aevb2.f()) {
            return aevb;
        }
        return c(afhk.t(aevb, aevb2));
    }
    
    public final aevb e() {
        if (this.c) {
            throw new IllegalStateException("Already frozen");
        }
        this.c = true;
        final aevb a = this.a;
        if (a != null && this.b.isEmpty()) {
            return a;
        }
        return this;
    }
    
    final boolean f() {
        return this == aeva.a;
    }
    
    final Object g(final agpx agpx) {
        adme.T(this.c);
        final Object value = this.b.get((Object)agpx);
        if (value == null) {
            final aevb a = this.a;
            if (a != null) {
                return a.g(agpx);
            }
        }
        return value;
    }
    
    final boolean h(final agpx agpx) {
        final boolean containsKey = this.b.containsKey((Object)agpx);
        boolean b = true;
        if (!containsKey) {
            final aevb a = this.a;
            if (a != null) {
                if (!a.h(agpx)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SpanExtras<");
        for (aevb a = this; a != null; a = a.a) {
            for (int i = 0; i < a.b.d; ++i) {
                sb.append(this.b.f(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
