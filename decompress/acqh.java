import java.util.Map;
import android.content.Intent;
import java.util.TimerTask;
import java.util.Timer;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.HashMap;
import java.util.Queue;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acqh implements tum, acsa
{
    public final List A;
    public final Queue B;
    public acbk C;
    public acbk D;
    public acbk E;
    public final HashMap F;
    public acqb G;
    public acqc H;
    private acqm a;
    private final vnq b;
    private final tre c;
    private final thg d;
    private final vnp e;
    public final Executor w;
    public final Object x;
    public final HashMap y;
    public final xab z;
    
    public acqh(final acsx acsx, final vnq vnq, final thg thg, final Object o, final tre tre, final xab xab, final Executor executor) {
        this(acsx, vnq, thg, o, tre, xab, executor, new ArrayDeque());
    }
    
    protected acqh(final acsx acsx, final vnq b, final thg d, final Object x, final tre c, final xab z, final Executor w, final Queue b2) {
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        z.getClass();
        this.z = z;
        this.x = x;
        this.F = new HashMap();
        w.getClass();
        this.w = w;
        this.B = b2;
        this.e = new acpu(this);
        if (acsx instanceof acqg) {
            final acqg acqg = (acqg)acsx;
            this.y = acqg.a;
            this.E = acqg.b;
            this.A = acqg.c;
            this.D = acqg.d;
        }
        else {
            this.y = new HashMap();
            this.A = new ArrayList();
            this.D = null;
        }
        for (final byte[] array : this.A) {
            if (array != null) {
                z.D((xbe)new wzy(array));
            }
        }
    }
    
    public acqh(final vnq vnq, final thg thg, final Object o, final tre tre, final xab xab) {
        this(null, vnq, thg, o, tre, xab, afwd.a);
    }
    
    public acqh(final vnq vnq, final thg thg, final tre tre, final xab xab) {
        this(vnq, thg, null, tre, xab);
    }
    
    static /* bridge */ void am(final acqh acqh) {
        acqh.C = null;
    }
    
    private final void l(final acbk c, final boolean b, final aisc aisc, final tui tui, final acqm acqm, final acqa acqa, final alji alji) {
        this.th(new acqe(c));
        if (this.lO() && c.e() != null && c.e().length > 0) {
            this.z.J(3, (xbe)new wzy(c.e()), alji);
        }
        this.C = c;
        final vmz a = this.b.a(c);
        if (tui != null) {
            tui.a((Object)a);
        }
        if ((acbj.f.a(c) || b) && ((vls)a).q()) {
            ((vls)a).s(2);
        }
        this.lK((vls)a, acqa);
        this.b.b(a, this.e, (zrb)new acpy(this, c, b, aisc, acqm));
    }
    
    private final void th(final Object o) {
        final Object x = this.x;
        if (x != null) {
            this.d.e(x, o);
            return;
        }
        this.d.d(o);
    }
    
    protected acpc U() {
        return null;
    }
    
    public acbk X(final acbj acbj) {
        return this.y.get(acbj);
    }
    
    public final acqm Y() {
        if (this.a == null) {
            this.a = new acpx(this);
        }
        return this.a;
    }
    
    public Object Z() {
        return this.x;
    }
    
    public final void aa(final Object o) {
        if (this.F.containsKey(o)) {
            this.F.remove(o).cancel();
        }
    }
    
    public final void ab() {
        final Iterator iterator = this.F.values().iterator();
        while (iterator.hasNext()) {
            ((Timer)iterator.next()).cancel();
        }
        this.F.clear();
    }
    
    public final void ac(final acbk acbk, final acqm acqm) {
        this.af(acbk, null, (tui)xrh.l, acqm, acqa.a());
    }
    
    public final void ad(final acbk acbk, final aisc aisc) {
        this.af(acbk, aisc, (tui)xrh.n, this.Y(), acqa.a());
    }
    
    public final void ae(final tui tui, final acqm acqm, final acbk acbk, final aisc aisc) {
        this.af(acbk, aisc, tui, new acpw(this, acqm), acqa.a());
    }
    
    public final void af(final acbk acbk, final aisc aisc, final tui tui, final acqm acqm, final acqa acqa) {
        this.ag(acbk, aisc, tui, acqm, acqa, alji.a);
    }
    
    public final void ag(final acbk acbk, final aisc aisc, final tui tui, final acqm acqm, final acqa acqa, final alji alji) {
        acqm.getClass();
        if (acbk != null) {
            if (acbk != this.C) {
                this.l(acbk, false, aisc, tui, acqm, acqa, alji);
            }
        }
    }
    
    public final void ah() {
        final acbk e = this.E;
        if (e == null) {
            return;
        }
        if (e == this.C) {
            return;
        }
        this.l(e, true, null, (tui)xrh.k, this.Y(), acqa.a(), alji.a);
    }
    
    public final void ai(final acbk acbk, final Timer timer) {
        if (acbk != null) {
            this.aj(acbk, acbk, timer);
        }
    }
    
    public final void aj(final Object o, final acbk acbk, final Timer timer) {
        tcl.l();
        if (acbk == null) {
            return;
        }
        final aowm aowm = (aowm)aamp.y(acbk, aowm.class);
        long n2 = 0L;
        Label_0070: {
            int n;
            if (aowm != null) {
                n = aowm.c;
            }
            else {
                final allj allj = (allj)aamp.y(acbk, allj.class);
                if (allj == null) {
                    n2 = 0L;
                    break Label_0070;
                }
                n = allj.d;
            }
            n2 = n;
        }
        if (n2 == 0L) {
            this.mB(acbk);
            return;
        }
        if (this.F.containsKey(o)) {
            this.F.get(o).cancel();
        }
        this.F.put(o, timer);
        timer.schedule(new acpv(this, o, acbk), n2);
    }
    
    protected final void ak(final acbk acbk) {
        this.y.put(acbk.a(), acbk);
    }
    
    public boolean al(final acbj acbj) {
        return (acbj == acbj.d && this.E != null) || this.y.containsKey(acbj);
    }
    
    protected abstract Object lE(final anxa p0);
    
    protected void lJ(final dbm dbm, final acbk acbk) {
        final tun a = this.c.a((Throwable)dbm);
        while (true) {
            for (Object cause = dbm; cause != null; cause = ((Throwable)cause).getCause()) {
                if (cause instanceof day) {
                    final Intent a2 = ((day)cause).a;
                    this.th(new acqd(a, true, a2, acbk));
                    final acqb g = this.G;
                    if (g != null) {
                        g.a(dbm, acbk);
                    }
                    return;
                }
            }
            final Intent a2 = null;
            continue;
        }
    }
    
    protected void lK(final vls vls, final acqa acqa) {
    }
    
    public void lL(final acbj acbj) {
        final acbk acbk = this.y.get(acbj);
        if (acbk != null) {
            this.mB(acbk);
        }
    }
    
    public void lM(final List list) {
        this.rW();
        for (final acbk e : list) {
            this.y.put(e.a(), e);
            if (e.a() == acbj.d) {
                this.E = e;
            }
        }
    }
    
    protected boolean lN() {
        return false;
    }
    
    protected boolean lO() {
        return true;
    }
    
    public void mB(final acbk acbk) {
        this.ac(acbk, this.Y());
    }
    
    protected void my(final Object o, final acbk acbk) {
        if (o == null && acbk.a() == acbj.b) {
            this.rW();
        }
        this.th(new acpz(acbk.a(), o != null, acbk.c()));
    }
    
    public acsx qz() {
        return new acqg(new HashMap(this.y), this.E, this.C, this.A);
    }
    
    public void rW() {
        this.y.clear();
        this.C = null;
    }
    
    public void sa() {
        this.G = null;
        this.H = null;
        this.ab();
        this.rW();
    }
}
