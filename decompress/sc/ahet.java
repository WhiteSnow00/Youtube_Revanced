import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahet
{
    public static final ahet a;
    public static final ahet b;
    public final Map c;
    public final boolean d;
    
    static {
        a = new ahet(Collections.emptyMap(), false);
        b = new ahet(Collections.emptyMap(), true);
    }
    
    public ahet(final Map c, final boolean d) {
        this.c = c;
        this.d = d;
    }
    
    public static ahes b() {
        return new ahes();
    }
    
    public static ahet d(aeih aeih) {
        final ahes b = b();
        b.g(aeih.d);
        final Iterator<Object> iterator = ((List<Object>)aeih.c).iterator();
        while (iterator.hasNext()) {
            b.a.put((int)iterator.next(), ahet.b);
        }
        for (final aeig aeig : aeih.b) {
            final Map a = b.a;
            final int b2 = aeig.b;
            if ((aeih = aeig.c) == null) {
                aeih = aeih.a;
            }
            a.put(b2, d(aeih));
        }
        return b.b();
    }
    
    public final aeih a() {
        final ahaz builder = ((ahbh)aeih.a).createBuilder();
        final boolean d = this.d;
        builder.copyOnWrite();
        ((aeih)builder.instance).d = d;
        for (final int intValue : this.c.keySet()) {
            final ahet ahet = this.c.get(intValue);
            if (ahet.equals(ahet.b)) {
                builder.copyOnWrite();
                final aeih aeih = (aeih)builder.instance;
                final ahbp c = aeih.c;
                if (!c.c()) {
                    aeih.c = ahbh.mutableCopy(c);
                }
                aeih.c.g(intValue);
            }
            else {
                final ahaz builder2 = ((ahbh)aeig.a).createBuilder();
                builder2.copyOnWrite();
                ((aeig)builder2.instance).b = intValue;
                final aeih a = ahet.a();
                builder2.copyOnWrite();
                final aeig aeig = (aeig)builder2.instance;
                a.getClass();
                aeig.c = a;
                final aeig aeig2 = (aeig)builder2.build();
                builder.copyOnWrite();
                final aeih aeih2 = (aeih)builder.instance;
                aeig2.getClass();
                final ahbx b = aeih2.b;
                if (!b.c()) {
                    aeih2.b = ahbh.mutableCopy(b);
                }
                aeih2.b.add((Object)aeig2);
            }
        }
        return (aeih)builder.build();
    }
    
    public final ahes c() {
        final ahes b = b();
        b.c(this.g());
        return b;
    }
    
    public final ahet e(final int n) {
        ahet a;
        if ((a = this.c.get(n)) == null) {
            a = ahet.a;
        }
        ahet f = a;
        if (this.d) {
            f = a.f();
        }
        return f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (o.getClass() == this.getClass()) {
                final ahet ahet = (ahet)o;
                if (adkp.ae(this.c, ahet.c) && this.d == ahet.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final ahet f() {
        if (this.c.isEmpty()) {
            ahet ahet;
            if (this.d) {
                ahet = ahet.a;
            }
            else {
                ahet = ahet.b;
            }
            return ahet;
        }
        return new ahet(this.c, this.d ^ true);
    }
    
    public final ahev g() {
        final ahaz builder = ((ahbh)ahev.a).createBuilder();
        final boolean d = this.d;
        builder.copyOnWrite();
        ((ahev)builder.instance).d = d;
        for (final int intValue : this.c.keySet()) {
            final ahet ahet = this.c.get(intValue);
            if (ahet.equals(ahet.b)) {
                builder.copyOnWrite();
                final ahev ahev = (ahev)builder.instance;
                final ahbp c = ahev.c;
                if (!c.c()) {
                    ahev.c = ahbh.mutableCopy(c);
                }
                ahev.c.g(intValue);
            }
            else {
                final ahaz builder2 = ((ahbh)aheu.a).createBuilder();
                builder2.copyOnWrite();
                ((aheu)builder2.instance).b = intValue;
                final ahev g = ahet.g();
                builder2.copyOnWrite();
                final aheu aheu = (aheu)builder2.instance;
                g.getClass();
                aheu.c = g;
                final aheu aheu2 = (aheu)builder2.build();
                builder.copyOnWrite();
                final ahev ahev2 = (ahev)builder.instance;
                aheu2.getClass();
                final ahbx b = ahev2.b;
                if (!b.c()) {
                    ahev2.b = ahbh.mutableCopy(b);
                }
                ahev2.b.add((Object)aheu2);
            }
        }
        return (ahev)builder.build();
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.d });
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab(this);
        if (this.equals(ahet.a)) {
            ab.a((Object)"empty()");
        }
        else if (this.equals(ahet.b)) {
            ab.a((Object)"all()");
        }
        else {
            ab.b("fields", (Object)this.c);
            ab.g("inverted", this.d);
        }
        return ab.toString();
    }
}
