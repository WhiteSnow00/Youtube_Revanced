import android.content.Intent;
import com.google.android.youtube.api.jar.client.c;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aets
{
    public aevk a;
    public boolean b;
    public aevk c;
    public boolean d;
    public aevl e;
    private final Runnable f;
    private final Activity g;
    private final Context h;
    private final aevl i;
    private final aevl j;
    private aevk k;
    private boolean l;
    private boolean m;
    private aevl n;
    private aevl o;
    
    private aets(final Activity g, final Context h) {
        this.f = (Runnable)new c(this, 19);
        this.i = new aetr(this, 0);
        this.j = new aetr(this, 2);
        this.l = false;
        this.m = false;
        this.d = false;
        this.g = g;
        this.h = h;
    }
    
    private final aevb A(final aevb aevb) {
        return aevb.d(aevb, aevb.c(((aevr)aqvs.i((Object)this.h, (Class)aevr.class)).dZ()));
    }
    
    private final aevl B(final String s) {
        if (aewp.r()) {
            return aewp.p(s, this.A(aeva.a));
        }
        return afot.l(this.h).a(s);
    }
    
    private final String C(final String s) {
        final String simpleName = this.h.getClass().getSimpleName();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" ");
        sb.append(simpleName);
        return sb.toString();
    }
    
    private final void D(final String s, final String s2, final Intent intent) {
        this.c = aewp.a();
        final aevk a = (aevk)aewf.m(intent);
        final aevb a2 = aevh.a;
        final aeut aeut = new aeut(1);
        final aeuz b = aevb.b();
        b.a(aevh.c, aeut);
        final aevb e = ((aevb)b).e();
        aevb aevb;
        if (a != null) {
            aewp.n(a);
            this.a = a;
            aevb = this.A(a2);
        }
        else {
            final aevk a3 = this.a;
            if (a3 != null) {
                aewp.n(a3);
                aevb = this.A(a2);
            }
            else {
                this.m = aewp.u();
                if (!aewp.r()) {
                    final aevk d = aewp.d();
                    if (d != null) {
                        aewp.n((aevk)(this.n = d));
                        this.o = aewp.p(this.C(s), aevb.d(e, aevh.a(aevg.h)));
                        aevb = a2;
                    }
                    else {
                        this.n = afot.l(this.h).b(this.C(s), aevb.d(a2, aevh.a(aevg.h)));
                        aevb = a2;
                    }
                }
                else {
                    aevb = this.A(a2);
                }
                this.a = aewp.a();
            }
        }
        this.e = aewp.p(this.C(s2), aevb.d(aevb, aevh.a(aevg.b)));
        qem.t(this.f);
    }
    
    private final void E() {
        if (this.l) {
            this.a = null;
            this.l = false;
        }
    }
    
    private final void F() {
        final aevk k = this.k;
        if (k != null) {
            this.a = k;
            this.k = null;
        }
    }
    
    private final void G() {
        final aevl e = this.e;
        if (e == null) {
            return;
        }
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was:".concat(e.toString()));
    }
    
    public static aets a(final Activity activity) {
        return new aets(activity, (Context)activity);
    }
    
    public final aevl b() {
        final aevl b = this.B("finish");
        final aevk a = aewp.a();
        this.k = a;
        return new aetq(b, aewf.o(a), 0);
    }
    
    public final aevl c() {
        this.G();
        return new aetq(this.B("Back pressed"), aewp.s(), 1);
    }
    
    public final aevl d() {
        this.F();
        this.p("onDestroy", aevh.a(aevg.g));
        return new aetr(this, 4);
    }
    
    public final aevl e(final Intent intent) {
        adme.T(this.g != null);
        this.D("Reintenting into", "onNewIntent", intent);
        return this.i;
    }
    
    public final aevl f() {
        this.F();
        this.p("onPause", aevh.a(aevg.e));
        return this.j;
    }
    
    public final aevl g() {
        this.c = aewp.a();
        aewp.n(this.a);
        return new aetr(this, 1);
    }
    
    public final aevl h() {
        this.E();
        this.o();
        this.p("onResume", aevh.a(aevg.d));
        return this.i;
    }
    
    public final aevl i() {
        this.E();
        this.o();
        this.p("onStart", aevh.a(aevg.c));
        return this.i;
    }
    
    public final aevl j() {
        this.F();
        this.p("onStop", aevh.a(aevg.f));
        return this.j;
    }
    
    public final aevl k() {
        this.G();
        return this.B("onSupportNavigateUp");
    }
    
    public final aevl l() {
        this.G();
        return this.B("onUserInteraction");
    }
    
    public final void m(final aui aui) {
        final aui on_CREATE = aui.ON_CREATE;
        final int ordinal = aui.ordinal();
        if (ordinal == 0) {
            if (this.d) {
                this.q();
                this.d = false;
            }
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
            throw new UnsupportedOperationException("Unknown lifecycle: ".concat(String.valueOf(String.valueOf(aui))));
        }
        this.q();
    }
    
    public final void n() {
        this.l = true;
        final Activity g = this.g;
        if (g != null && !g.isChangingConfigurations() && !this.g.isFinishing()) {
            this.a = null;
        }
    }
    
    public final void o() {
        if (this.b) {
            return;
        }
        synchronized (aewf.c) {
            final aevl d = aewf.d;
            aewf.d = null;
            monitorexit(aewf.c);
            if (d != null) {
                this.b = true;
                this.a = (aevk)d;
            }
        }
    }
    
    public final void p(final String s, aevb aevb) {
        this.c = aewp.a();
        aevb = aevb.d(aevh.a, aevb);
        final aevk a = this.a;
        if (a != null) {
            aewp.n(a);
            aevb = this.A(aevb);
        }
        else {
            this.m = aewp.u();
            if (!aewp.r()) {
                final aevn l = afot.l(this.h);
                final String simpleName = this.h.getClass().getSimpleName();
                final StringBuilder sb = new StringBuilder();
                sb.append(simpleName);
                sb.append(": ");
                sb.append(s);
                final String string = sb.toString();
                final Object b = l.b;
                final aevb d = aevb.d((aevb)l.c, aevb);
                final int a2 = l.a;
                this.n = ((aevu)b).b(string, d);
            }
            else {
                aevb = this.A(aevb);
            }
            this.a = aewp.a();
        }
        this.e = aewp.p(this.C(s), aevb);
    }
    
    public final void q() {
        final aevl e = this.e;
        e.getClass();
        e.close();
        this.e = null;
        if (this.m) {
            this.m = false;
            aewp.k();
        }
        final aevl o = this.o;
        if (o != null) {
            o.close();
            this.o = null;
        }
        final aevl n = this.n;
        if (n != null) {
            n.close();
            this.n = null;
        }
        aewp.n(this.c);
        this.c = null;
    }
    
    public final aevl r() {
        this.G();
        return this.B("onActivityResult");
    }
    
    public final aevl s() {
        return this.B("onConfigurationChanged");
    }
    
    public final aevl t() {
        this.o();
        final Activity g = this.g;
        if (g != null) {
            this.D("Intenting into", "onCreate", g.getIntent());
        }
        else {
            this.E();
            this.p("onCreate", aevh.a(aevg.b));
        }
        return this.i;
    }
    
    public final aevl u() {
        final aevl f = aewp.f();
        if (aewp.r()) {
            return f;
        }
        return new aetr(afot.l(this.h).a(String.valueOf(this.h.getClass().getSimpleName()).concat(": onCreatePanelMenu")), 3);
    }
    
    public final aevl v() {
        this.G();
        return this.B("onOptionsItemSelected");
    }
    
    public final aevl w() {
        this.G();
        return this.B("onPictureInPictureModeChanged");
    }
    
    public final aevl x() {
        this.E();
        this.p("onPostCreate", aeva.a);
        return this.i;
    }
    
    public final aevl y() {
        return this.B("onRequestPermissionsResult");
    }
    
    public final aevl z() {
        this.p("onSaveInstanceState", aeva.a);
        return this.j;
    }
}
