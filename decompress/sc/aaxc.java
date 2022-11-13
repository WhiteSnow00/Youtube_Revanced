import android.view.View;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxc implements wyw
{
    private static final String d = "aaxc";
    public final wyw a;
    public final List b;
    public final List c;
    private final Executor e;
    private final aezs f;
    private Object g;
    
    public aaxc(final wyw a, final Executor e, final aezs f, final Object g) {
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    private final void N(final Runnable runnable) {
        if (tbi.h()) {
            this.b.add(runnable);
            return;
        }
        this.e.execute((Runnable)new aagj(this, runnable, 18));
    }
    
    private final void O(final Runnable runnable) {
        if (tbi.h()) {
            this.c.add(runnable);
            return;
        }
        this.e.execute(new aaxb(this, runnable, 0));
    }
    
    private final void P() {
        if (tbi.h()) {
            this.C();
            return;
        }
        Log.e(aaxc.d, "Tried to perform interaction logging outside of application's main thread");
        this.e.execute(new aavc(this, 6));
    }
    
    public final void A() {
        this.b.clear();
        this.c.clear();
        this.a.y();
    }
    
    public final void B(final InteractionLoggingScreen interactionLoggingScreen) {
        this.a.B(interactionLoggingScreen);
    }
    
    public final void C() {
        if (this.f.a(this.g)) {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
            this.b.clear();
            final Iterator iterator2 = this.c.iterator();
            while (iterator2.hasNext()) {
                ((Runnable)iterator2.next()).run();
            }
            this.c.clear();
        }
    }
    
    public final /* bridge */ void D(final wzz wzz) {
        this.L(wzz);
    }
    
    public final void E(final Object g) {
        this.g = g;
        this.P();
    }
    
    public final /* bridge */ void F(final wzz wzz, final wzz wzz2) {
        this.M(wzz, wzz2);
    }
    
    public final InteractionLoggingScreen G(final xab xab, final wzr wzr, final aiqj aiqj) {
        return this.a.G(xab, wzr, aiqj);
    }
    
    public final InteractionLoggingScreen H(final xab xab, final aiqj aiqj, final ainb ainb) {
        return this.a.H(xab, aiqj, ainb);
    }
    
    public final void I(final MessageLite messageLite, final ahab ahab, final View view) {
        this.O((Runnable)new ufq(this, messageLite, ahab, view, 20));
        this.P();
    }
    
    public final void J(final int n, final wzz wzz, final alhi alhi) {
        this.O((Runnable)new gki(this, n, wzz, alhi, 12));
        this.P();
    }
    
    public final aeea K() {
        return this.a.K();
    }
    
    public final void L(final wzz wzz) {
        this.N(new aaxb(this, wzz, 1));
        this.P();
    }
    
    public final void M(final wzz wzz, final wzz wzz2) {
        this.N((Runnable)new ztq(this, wzz, wzz2, 13));
        this.P();
    }
    
    public final InteractionLoggingScreen a() {
        return this.a.a();
    }
    
    public final InteractionLoggingScreen b(final xab xab, final aiqj aiqj, final alhi alhi) {
        return this.a.b(xab, aiqj, alhi);
    }
    
    public final InteractionLoggingScreen c(final xab xab, final wzr wzr, final aiqj aiqj, final alhi alhi, final alhi alhi2) {
        return this.a.c(xab, wzr, aiqj, alhi, alhi2);
    }
    
    public final /* bridge */ xah d(final wzz wzz) {
        this.L(wzz);
        return (xah)this;
    }
    
    public final /* bridge */ xah e(final wzz wzz, final wzz wzz2) {
        this.M(wzz, wzz2);
        return (xah)this;
    }
    
    public final aiqj f(final aiqj aiqj) {
        return this.a.f(aiqj);
    }
    
    public final appm g(final Object o, final xab xab) {
        return this.a.g(o, xab);
    }
    
    public final appm h(final Object o, final xab xab, final int n) {
        return this.a.h(o, xab, n);
    }
    
    public final String i() {
        return this.a.i();
    }
    
    public final void j(final Object o, final xab xab, final int n) {
    }
    
    public final void k(final List list) {
        this.N((Runnable)new aagj(this, list, 19));
        this.P();
    }
    
    public final void l(final wzz wzz) {
        this.N((Runnable)new aagj(this, wzz, 20));
        this.P();
    }
    
    public final void m(final wzz wzz, final wzz wzz2) {
        this.N((Runnable)new ztq(this, wzz, wzz2, 11));
        this.P();
    }
    
    public final void n(final wzr wzr) {
        this.a.n(wzr);
    }
    
    public final void o(final wzz wzz, final alhi alhi) {
        this.O((Runnable)new ztq(this, wzz, alhi, 15));
        this.P();
    }
    
    public final void p(final wzz wzz, final aqss aqss, final alhi alhi) {
        this.O((Runnable)new ufq(this, wzz, aqss, alhi, 18));
        this.P();
    }
    
    public final void q(final String s) {
        this.a.q(s);
    }
    
    public final void r(final wzz wzz, final String s) {
        this.a.r(wzz, s);
    }
    
    public final void s() {
        this.a.s();
    }
    
    public final void t(final wzz wzz, final alhi alhi) {
        this.O((Runnable)new ztq(this, wzz, alhi, 12));
        this.P();
    }
    
    public final void u(final wzz wzz, final aqss aqss, final alhi alhi) {
        this.O(new aaxa(this, wzz, aqss, alhi, 0));
        this.P();
    }
    
    public final void v(final MessageLite messageLite, final ahab ahab, final alhi alhi) {
        this.O(new aaxa(this, messageLite, ahab, alhi, 1));
        this.P();
    }
    
    public final void w(final wzz wzz, final alhi alhi) {
        this.O((Runnable)new ztq(this, wzz, alhi, 14));
        this.P();
    }
    
    public final void x(final String s, final wzz wzz, final alhi alhi) {
        this.O((Runnable)new ufq(this, s, wzz, alhi, 19));
        this.P();
    }
    
    public final void y() {
        if (tbi.h()) {
            this.A();
            return;
        }
        this.e.execute(new aavc(this, 7));
    }
    
    public final void z(final wzr wzr, final InteractionLoggingScreen interactionLoggingScreen) {
        this.a.z(wzr, interactionLoggingScreen);
    }
}
