import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahcv
{
    public static final ahcv a;
    public static final ahcv b;
    public final Map c;
    public final boolean d;
    
    static {
        a = new ahcv(Collections.emptyMap(), false);
        b = new ahcv(Collections.emptyMap(), true);
    }
    
    public ahcv(final Map c, final boolean d) {
        this.c = c;
        this.d = d;
    }
    
    public static ahcu b() {
        return new ahcu();
    }
    
    public static ahcv d(aegg aegg) {
        final ahcu b = b();
        b.g(aegg.d);
        final Iterator<Object> iterator = ((List<Object>)aegg.c).iterator();
        while (iterator.hasNext()) {
            b.a.put((int)iterator.next(), ahcv.b);
        }
        for (final aegf aegf : aegg.b) {
            final Map a = b.a;
            final int b2 = aegf.b;
            if ((aegg = aegf.c) == null) {
                aegg = aegg.a;
            }
            a.put(b2, d(aegg));
        }
        return b.b();
    }
    
    public final aegg a() {
        final agza builder = ((agzi)aegg.a).createBuilder();
        final boolean d = this.d;
        builder.copyOnWrite();
        ((aegg)builder.instance).d = d;
        for (final int intValue : this.c.keySet()) {
            final ahcv ahcv = this.c.get(intValue);
            if (ahcv.equals(ahcv.b)) {
                builder.copyOnWrite();
                final aegg aegg = (aegg)builder.instance;
                final agzq c = aegg.c;
                if (!c.c()) {
                    aegg.c = agzi.mutableCopy(c);
                }
                aegg.c.g(intValue);
            }
            else {
                final agza builder2 = ((agzi)aegf.a).createBuilder();
                builder2.copyOnWrite();
                ((aegf)builder2.instance).b = intValue;
                final aegg a = ahcv.a();
                builder2.copyOnWrite();
                final aegf aegf = (aegf)builder2.instance;
                a.getClass();
                aegf.c = a;
                final aegf aegf2 = (aegf)builder2.build();
                builder.copyOnWrite();
                final aegg aegg2 = (aegg)builder.instance;
                aegf2.getClass();
                final agzy b = aegg2.b;
                if (!b.c()) {
                    aegg2.b = agzi.mutableCopy(b);
                }
                aegg2.b.add(aegf2);
            }
        }
        return (aegg)builder.build();
    }
    
    public final ahcu c() {
        final ahcu b = b();
        b.c(this.g());
        return b;
    }
    
    public final ahcv e(final int n) {
        ahcv a;
        if ((a = this.c.get(n)) == null) {
            a = ahcv.a;
        }
        ahcv f = a;
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
                final ahcv ahcv = (ahcv)o;
                if (aeda.v((Object)this.c, (Object)ahcv.c) && this.d == ahcv.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final ahcv f() {
        if (this.c.isEmpty()) {
            ahcv ahcv;
            if (this.d) {
                ahcv = ahcv.a;
            }
            else {
                ahcv = ahcv.b;
            }
            return ahcv;
        }
        return new ahcv(this.c, this.d ^ true);
    }
    
    public final ahcx g() {
        final agza builder = ((agzi)ahcx.a).createBuilder();
        final boolean d = this.d;
        builder.copyOnWrite();
        ((ahcx)builder.instance).d = d;
        for (final int intValue : this.c.keySet()) {
            final ahcv ahcv = this.c.get(intValue);
            if (ahcv.equals(ahcv.b)) {
                builder.copyOnWrite();
                final ahcx ahcx = (ahcx)builder.instance;
                final agzq c = ahcx.c;
                if (!c.c()) {
                    ahcx.c = agzi.mutableCopy(c);
                }
                ahcx.c.g(intValue);
            }
            else {
                final agza builder2 = ((agzi)ahcw.a).createBuilder();
                builder2.copyOnWrite();
                ((ahcw)builder2.instance).b = intValue;
                final ahcx g = ahcv.g();
                builder2.copyOnWrite();
                final ahcw ahcw = (ahcw)builder2.instance;
                g.getClass();
                ahcw.c = g;
                final ahcw ahcw2 = (ahcw)builder2.build();
                builder.copyOnWrite();
                final ahcx ahcx2 = (ahcx)builder.instance;
                ahcw2.getClass();
                final agzy b = ahcx2.b;
                if (!b.c()) {
                    ahcx2.b = agzi.mutableCopy(b);
                }
                ahcx2.b.add(ahcw2);
            }
        }
        return (ahcx)builder.build();
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.d });
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        if (this.equals(ahcv.a)) {
            o.a("empty()");
        }
        else if (this.equals(ahcv.b)) {
            o.a("all()");
        }
        else {
            o.b("fields", this.c);
            o.h("inverted", this.d);
        }
        return o.toString();
    }
}
