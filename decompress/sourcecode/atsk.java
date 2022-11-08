import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class atsk implements attd
{
    public final atuv a;
    private final atou b;
    
    public atsk() {
        this.a = new atuv();
        this.b = auet.h(null);
    }
    
    private static final Throwable a(final attc attc) {
        u(attc);
        Object a;
        if ((a = attc.a) == null) {
            a = new atst();
        }
        return (Throwable)a;
    }
    
    public static final void u(final attc attc) {
        Object a = null;
        while (true) {
            final atuz i = ((atuz)attc).i();
            Object o;
            if (i instanceof atsy) {
                o = i;
            }
            else {
                o = null;
            }
            if (o == null) {
                break;
            }
            if (!((atuz)o).tE()) {
                ((atuz)o).l();
            }
            else {
                a = atut.a(a, o);
            }
        }
        if (a != null) {
            if (!(a instanceof ArrayList)) {
                ((atsy)a).c(attc);
                return;
            }
            final ArrayList list = (ArrayList)a;
            int size = list.size();
            while (--size >= 0) {
                ((atsy)list.get(size)).c(attc);
            }
        }
    }
    
    protected atta c() {
        throw null;
    }
    
    protected Object l(final Object o) {
        atta c;
        do {
            c = this.c();
            if (c == null) {
                return atsj.c;
            }
        } while (c.d(o) == null);
        final boolean a = atqb.a;
        c.b(o);
        return c.e();
    }
    
    public final Object m(Object o) {
        o = this.l(o);
        if (o == atsj.b) {
            o = atjv.a;
        }
        else if (o == atsj.c) {
            final attc t = this.t();
            if (t == null) {
                return atsr.a;
            }
            o = aqqn.u(a(t));
        }
        else {
            if (!(o instanceof attc)) {
                new StringBuilder("trySend returned ").append(o);
                throw new IllegalStateException("trySend returned ".concat(o.toString()));
            }
            o = aqqn.u(a((attc)o));
        }
        return o;
    }
    
    protected String n() {
        return "";
    }
    
    protected final attc o() {
        final atuv a = this.a;
        atuz atuz;
        while (true) {
            final Object g = ((atuz)a).g();
            g.getClass();
            atuz = (atuz)g;
            if (atuz == a || !(atuz instanceof attc)) {
                atuz = null;
                break;
            }
            final attc attc = (attc)atuz;
            if (!atuz.tD()) {
                break;
            }
            final atuz j = atuz.j();
            if (j == null) {
                break;
            }
            j.m();
        }
        return (attc)atuz;
    }
    
    public final void p(final atml atml) {
        if (this.b.d((Object)null, (Object)atml)) {
            final attc t = this.t();
            if (t != null && this.b.d((Object)atml, (Object)atsj.e)) {
                atml.invoke(t.a);
            }
            return;
        }
        final Object a = this.b.a;
        if (a == atsj.e) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        new StringBuilder("Another handler was already registered: ").append(a);
        throw new IllegalStateException("Another handler was already registered: ".concat(String.valueOf(a)));
    }
    
    public final boolean q(final Throwable t) {
        attc attc = new attc(t);
        final atuv a = this.a;
        while (true) {
            atuz i;
            do {
                i = ((atuz)a).i();
                if (!(i instanceof attc)) {
                    continue;
                }
                final boolean b = false;
                if (!b) {
                    final atuz j = ((atuz)this.a).i();
                    j.getClass();
                    attc = (attc)j;
                }
                u(attc);
                if (b) {
                    final Object a2 = this.b.a;
                    if (a2 != null) {
                        final atvj e = atsj.e;
                        if (a2 != e && this.b.d(a2, (Object)e)) {
                            atnp.c(a2, 1);
                            ((atml)a2).invoke(t);
                        }
                    }
                }
                return b;
            } while (!i.n((atuz)attc, (atuz)a));
            final boolean b = true;
            continue;
        }
    }
    
    public final boolean s() {
        return this.t() != null;
    }
    
    protected final attc t() {
        final atuz i = ((atuz)this.a).i();
        attc attc;
        if (i instanceof attc) {
            attc = (attc)i;
        }
        else {
            attc = null;
        }
        if (attc != null) {
            u(attc);
            return attc;
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final String a = atqc.a((Object)this);
        final String b = atqc.b((Object)this);
        final atuz h = ((atuz)this.a).h();
        String s;
        if (h == this.a) {
            s = "EmptyQueue";
        }
        else {
            if (h instanceof attc) {
                s = h.toString();
            }
            else if (h instanceof atsy) {
                s = "ReceiveQueued";
            }
            else {
                new StringBuilder("UNEXPECTED:").append(h);
                s = "UNEXPECTED:".concat(h.toString());
            }
            final atuz i = ((atuz)this.a).i();
            if (i != h) {
                final atuv a2 = this.a;
                final Object g = ((atuz)a2).g();
                g.getClass();
                atuz h2 = (atuz)g;
                int n = 0;
                while (!atnh.c(h2, a2)) {
                    ++n;
                    h2 = h2.h();
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(",queueSize=");
                sb.append(n);
                final String s2 = s = sb.toString();
                if (i instanceof attc) {
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
