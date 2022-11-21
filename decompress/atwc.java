import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class atwc implements atwv
{
    public final atyp a;
    private final atsm b;
    
    public atwc() {
        this.a = new atyp();
        this.b = auop.j((Object)null);
    }
    
    private static final Throwable a(final atwu atwu) {
        u(atwu);
        Object a;
        if ((a = atwu.a) == null) {
            a = new atwl();
        }
        return (Throwable)a;
    }
    
    public static final void u(final atwu atwu) {
        Object a = null;
        while (true) {
            final atyt i = atwu.i();
            atwq atwq;
            if (i instanceof atwq) {
                atwq = (atwq)i;
            }
            else {
                atwq = null;
            }
            if (atwq == null) {
                break;
            }
            if (!atwq.tG()) {
                atwq.l();
            }
            else {
                a = atyn.a(a, (Object)atwq);
            }
        }
        if (a != null) {
            if (!(a instanceof ArrayList)) {
                ((atwq)a).c(atwu);
                return;
            }
            final ArrayList list = (ArrayList)a;
            int size = list.size();
            while (--size >= 0) {
                ((atwq)list.get(size)).c(atwu);
            }
        }
    }
    
    protected atws c() {
        throw null;
    }
    
    protected Object l(final Object o) {
        atws c;
        do {
            c = this.c();
            if (c == null) {
                return atwb.c;
            }
        } while (c.d(o) == null);
        final boolean a = attt.a;
        c.b(o);
        return c.e();
    }
    
    public final Object m(Object o) {
        o = this.l(o);
        if (o == atwb.b) {
            o = atnn.a;
        }
        else if (o == atwb.c) {
            final atwu t = this.t();
            if (t == null) {
                return atwj.a;
            }
            o = arxu.r(a(t));
        }
        else {
            if (!(o instanceof atwu)) {
                new StringBuilder("trySend returned ").append(o);
                throw new IllegalStateException("trySend returned ".concat(o.toString()));
            }
            o = arxu.r(a((atwu)o));
        }
        return o;
    }
    
    protected String n() {
        return "";
    }
    
    protected final atwu o() {
        final atyp a = this.a;
        atyt atyt;
        while (true) {
            final Object g = a.g();
            g.getClass();
            atyt = (atyt)g;
            if (atyt == a || !(atyt instanceof atwu)) {
                atyt = null;
                break;
            }
            final atwu atwu = (atwu)atyt;
            if (!atyt.tF()) {
                break;
            }
            final atyt j = atyt.j();
            if (j == null) {
                break;
            }
            j.m();
        }
        return (atwu)atyt;
    }
    
    public final void p(final atqd atqd) {
        if (this.b.d(null, atqd)) {
            final atwu t = this.t();
            if (t != null && this.b.d(atqd, atwb.e)) {
                atqd.invoke(t.a);
            }
            return;
        }
        final Object a = this.b.a;
        if (a == atwb.e) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        new StringBuilder("Another handler was already registered: ").append(a);
        throw new IllegalStateException("Another handler was already registered: ".concat(String.valueOf(a)));
    }
    
    public final boolean q(final Throwable t) {
        atwu atwu = new atwu(t);
        final atyp a = this.a;
        while (true) {
            atyt i;
            do {
                i = a.i();
                if (!(i instanceof atwu)) {
                    continue;
                }
                final boolean b = false;
                if (!b) {
                    final atyt j = this.a.i();
                    j.getClass();
                    atwu = (atwu)j;
                }
                u(atwu);
                if (b) {
                    final Object a2 = this.b.a;
                    if (a2 != null) {
                        final atzc e = atwb.e;
                        if (a2 != e && this.b.d(a2, e)) {
                            atrh.c(a2, 1);
                            ((atqd)a2).invoke(t);
                        }
                    }
                }
                return b;
            } while (!i.n((atyt)atwu, (atyt)a));
            final boolean b = true;
            continue;
        }
    }
    
    public final boolean s() {
        return this.t() != null;
    }
    
    protected final atwu t() {
        final atyt i = this.a.i();
        atwu atwu;
        if (i instanceof atwu) {
            atwu = (atwu)i;
        }
        else {
            atwu = null;
        }
        if (atwu != null) {
            u(atwu);
            return atwu;
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final String a = attu.a(this);
        final String b = attu.b(this);
        final atyt h = this.a.h();
        String s;
        if (h == this.a) {
            s = "EmptyQueue";
        }
        else {
            if (h instanceof atwu) {
                s = h.toString();
            }
            else if (h instanceof atwq) {
                s = "ReceiveQueued";
            }
            else {
                new StringBuilder("UNEXPECTED:").append(h);
                s = "UNEXPECTED:".concat(h.toString());
            }
            final atyt i = this.a.i();
            if (i != h) {
                final atyp a2 = this.a;
                final Object g = a2.g();
                g.getClass();
                atyt h2 = (atyt)g;
                int n = 0;
                while (!atqz.c(h2, a2)) {
                    ++n;
                    h2 = h2.h();
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(",queueSize=");
                sb.append(n);
                final String s2 = s = sb.toString();
                if (i instanceof atwu) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s2);
                    sb2.append(",closedForSend=");
                    sb2.append(i);
                    s = sb2.toString();
                }
            }
        }
        final String n2 = this.n();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(a);
        sb3.append("@");
        sb3.append(b);
        sb3.append("{");
        sb3.append(s);
        sb3.append("}");
        sb3.append(n2);
        return sb3.toString();
    }
}
