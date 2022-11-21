import java.util.Set;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Iterator;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import java.util.Map;
import j$.util.DesugarCollections;
import java.util.HashSet;
import android.os.Build$VERSION;
import javax.crypto.Mac;
import javax.crypto.Cipher;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.List;
import java.security.Signature;
import java.util.HashMap;
import android.content.ComponentName;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import java.util.ArrayList;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajc
{
    public final Object a;
    public final Object b;
    public final Object c;
    
    public ajc() {
        this.b = new PointF();
        this.c = new PointF();
        this.a = new PointF();
    }
    
    public ajc(final long n, final String b, final ajc c, final byte[] array, final byte[] array2) {
        this.a = n;
        this.b = b;
        this.c = c;
    }
    
    public ajc(final abqv c, final agmq a, final acnz b, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ajc(final acu a) {
        this.c = new ArrayList();
        this.b = new adb();
        this.a = a;
    }
    
    public ajc(final Context c, final ion ion, final ion ion2, final oco b, final byte[] array) {
        this.c = c;
        this.a = afgm.n(0, ion, 1, ion2);
        this.b = b;
    }
    
    public ajc(final PointF b, final PointF c, final PointF a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public ajc(final View c, final atnb a) {
        this.c = c;
        this.a = a;
        this.b = new Rect();
    }
    
    public ajc(final View view, final YouTubeTextView a, final YouTubeTextView c) {
        final tqa b = new tqa(view, (tsk)new trk());
        this.b = b;
        final tqa tqa = b;
        b.a(false);
        this.a = a;
        this.c = c;
    }
    
    public ajc(final aq c, final ap a, final ComponentName b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ajc(final atnb b, final atnb a, final atnb c) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public ajc(final atnb a, final atnb c, final atnb b, final byte[] array) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        b.getClass();
        this.b = b;
    }
    
    public ajc(final atnb b, final atnb a, final atnb c, final byte[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public ajc(final atnb b, final atnb a, final atnb c, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public ajc(final atnb c, final atnb a, final atnb b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public ajc(final atnb c, final atnb b, final atnb a, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ajc(final atnb b, final atnb a, final atnb c, final char[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ajc(final atnb c, final atnb a, final atnb b, final char[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public ajc(final aup c, final gab b, final byte[] array, final byte[] array2) {
        this.a = new HashMap();
        this.c = c;
        this.b = b;
    }
    
    public ajc(final bu b, final acxo a, final adgg c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ajc(final CharSequence b, final CharSequence c, final CharSequence a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public ajc(final Class c, final Class a, final ddu b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ajc(final Class a, final Class b, final vbs c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ajc(final String b, final String c, final String a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public ajc(final Signature a) {
        this.a = a;
        this.b = null;
        this.c = null;
    }
    
    public ajc(final List c) {
        this.c = c;
        this.b = new ArrayList(c.size());
        this.a = new ArrayList(c.size());
        for (int i = 0; i < c.size(); ++i) {
            ((List<cvu>)this.b).add(((cwx)((afcb)c.get(i)).d).a());
            ((List<cvu>)this.a).add(((cwt)((afcb)c.get(i)).c).a());
        }
    }
    
    public ajc(final Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.a = new ctp(this, (byte[])null, (byte[])null, (byte[])null);
        this.c = new csr(executor, 0);
    }
    
    public ajc(final Cipher b) {
        this.b = b;
        this.a = null;
        this.c = null;
    }
    
    public ajc(final Mac c) {
        this.c = c;
        this.b = null;
        this.a = null;
    }
    
    public ajc(final qdr a, final qdr b, final fly c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ajc(final thg b, final tpj a, final ffh c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ajc(final tt tt, final kh kh, final byte[] array) {
        final ve b = new ve(this, (byte[])null);
        this.b = b;
        Object a;
        if (Build$VERSION.SDK_INT >= 30 && z(kh) != null) {
            a = new tp(kh, (byte[])null);
        }
        else {
            a = new ur(kh, (byte[])null);
        }
        this.a = a;
        final vg c = new vg(((vf)a).a(), ((vf)a).b());
        this.c = c;
        final vg vg = c;
        final float b2 = c.b;
        float d = 1.0f;
        if (b2 >= 1.0f) {
            final float c2 = c.c;
            if (c2 <= 1.0f) {
                c.a = 1.0f;
                Label_0185: {
                    if (b2 != c2) {
                        if (b2 == 1.0f) {
                            break Label_0185;
                        }
                        if (c2 != 1.0f) {
                            final float n = 1.0f / b2;
                            final float n2 = 1.0f / c2;
                            d = (1.0f - n2) / (n - n2);
                            break Label_0185;
                        }
                    }
                    d = 0.0f;
                }
                c.d = d;
                new auz((Object)new aan(b2, c2, d));
                tt.a((ts)b);
                return;
            }
        }
        final StringBuilder sb = new StringBuilder("Requested zoomRatio 1.0 is not within valid range [");
        sb.append(c.c);
        sb.append(" , ");
        sb.append(c.b);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public ajc(final vbo a, final tdu b, final aske aske, final wza c, final askz askz) {
        this.a = a;
        this.b = b;
        this.c = c;
        aosy aosy;
        if ((aosy = a.b().s) == null) {
            aosy = aosy.a;
        }
        if (aosy.f) {
            aske.P(askz).am((asmi)new fda(this, 10, (byte[])null, (byte[])null));
        }
    }
    
    public ajc(final vey a, final zoa c, final flm b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ajc(final wwr c, final Object a, final byte[] array, final byte[] array2) {
        this.b = new HashSet();
        this.c = c;
        this.a = a;
    }
    
    public ajc(final byte[] array) {
        this.c = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.b = new HashMap();
        this.a = new HashSet();
    }
    
    private final boolean A() {
        return ((vbs)this.c).f(45363863L);
    }
    
    public static boolean v(final aadc aadc, final int n) {
        return aadc.t() && n == 1;
    }
    
    private static Range z(final kh kh) {
        try {
            return (Range)kh.A(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        }
        catch (final AssertionError assertionError) {
            yj.d("ZoomControl", "AssertionError, fail to get camera characteristic.", (Throwable)assertionError);
            return null;
        }
    }
    
    public final void a(final acu acu) {
        ((ArrayList)this.c).clear();
        for (int size = acu.aI.size(), i = 0; i < size; ++i) {
            final act act = acu.aI.get(i);
            if (act.M() == 3 || act.N() == 3) {
                ((ArrayList)this.c).add(act);
            }
        }
        acu.c();
    }
    
    public final boolean b(final adt adt, final act act, int i) {
        ((adb)this.b).i = act.M();
        ((adb)this.b).j = act.N();
        ((adb)this.b).a = act.j();
        ((adb)this.b).b = act.h();
        final adb adb = (adb)this.b;
        adb.g = false;
        adb.h = i;
        i = adb.i;
        final int j = adb.j;
        if (i == 3 && act.X > 0.0f) {
            i = 1;
        }
        else {
            i = 0;
        }
        final boolean b = j == 3 && act.X > 0.0f;
        if (i != 0 && act.u[0] == 4) {
            adb.i = 1;
        }
        if (b && act.u[1] == 4) {
            adb.j = 1;
        }
        adt.a(act, adb);
        act.C(((adb)this.b).c);
        act.x(((adb)this.b).d);
        final adb adb2 = (adb)this.b;
        act.F = adb2.f;
        act.u(adb2.e);
        final adb adb3 = (adb)this.b;
        adb3.h = 0;
        return adb3.g;
    }
    
    public final void c(final acu acu, final int b, final int n, final int n2) {
        final int ac = acu.ac;
        final int ad = acu.ad;
        acu.B(0);
        acu.A(0);
        acu.C(n);
        acu.x(n2);
        acu.B(ac);
        acu.A(ad);
        final Object a = this.a;
        ((acu)a).b = b;
        ((ada)a).T();
    }
    
    public final askj d(final String s) {
        final flm flm = (flm)this.b;
        return flm.c.c(flm.b).N(((vgx)((vey)this.a).a(((zoa)this.c).c())).g(s));
    }
    
    public final ega e() {
        final egd h = ((egc)((wwr)this.c).c).h();
        if (h != null) {
            return (ega)h.a;
        }
        return null;
    }
    
    public final void f(final long n, final boolean b) {
        if (!this.h(n)) {
            ((Set<Long>)this.b).add(Long.valueOf(n));
            if (b) {
                final dwc dwc = (dwc)((wwr)this.c).c;
                final dvi o = dwc.o;
                if (o != null) {
                    final int b2 = o.b(n);
                    if (b2 >= 0 && dwc.g(b2) == null) {
                        final egh e = dwc.o.e(b2);
                        dwc.q(b2, e, dvg.c(e), dwc.o);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Cannot acquire the same reference more than once.");
    }
    
    public final void g() {
        final Iterator<Object> iterator = ((Set<Object>)this.b).iterator();
        while (iterator.hasNext()) {
            iterator.next().longValue();
        }
        ((Set)this.b).clear();
    }
    
    public final boolean h(final long n) {
        return ((Set)this.b).contains(n);
    }
    
    public final void i(final long n) {
        if (this.h(n)) {
            ((Set)this.b).remove(n);
            return;
        }
        throw new IllegalStateException("Trying to release a reference that wasn't acquired.");
    }
    
    public final void j(final dwv dwv) {
        synchronized (this) {
            ((Set<dwv>)this.a).add(dwv);
        }
    }
    
    public final void k(final dwv dwv) {
        synchronized (this) {
            ((Set)this.a).remove(dwv);
            if (((Set)this.a).isEmpty()) {
                ((Map)this.b).clear();
                ((Map)this.c).clear();
            }
        }
    }
    
    public final boolean l(final Class clazz, final Class clazz2) {
        return ((Class)this.c).isAssignableFrom(clazz) && clazz2.isAssignableFrom((Class)this.a);
    }
    
    public final jbs m(final int n) {
        final Context context = (Context)((atnb)this.b).a();
        context.getClass();
        final jbq jbq = (jbq)((atnb)this.a).a();
        jbq.getClass();
        final jbk jbk = (jbk)((atnb)this.c).a();
        jbk.getClass();
        return new jbs(context, jbq, jbk, n);
    }
    
    public final Rect n() {
        final View view = (View)((atnb)this.a).a();
        if (view.getWindowToken() != ((View)this.c).getWindowToken()) {
            ((Rect)this.b).setEmpty();
            return (Rect)this.b;
        }
        final int[] array = new int[2];
        final int[] array2 = new int[2];
        view.getLocationInWindow(array);
        ((View)this.c).getLocationInWindow(array2);
        final int n = array[0] - array2[0];
        final int n2 = array[1] - array2[1];
        ((Rect)this.b).set(n, n2, view.getWidth() + n, view.getHeight() + n2);
        return (Rect)this.b;
    }
    
    public final void o() {
        final Object a = this.a;
        final Object c = this.c;
        final gcb d = gcd.d();
        d.j();
        d.k((CharSequence)((bu)this.b).getString(2132018807));
        d.c(-1);
        ((acxo)a).n(((adgg)c).j((acxp)d));
    }
    
    public final void p(final SubtitleTrack subtitleTrack) {
        if (subtitleTrack != null && !subtitleTrack.t()) {
            if (!subtitleTrack.r()) {
                String s;
                if (subtitleTrack.s()) {
                    s = ((bu)this.b).getString(2132017525, new Object[] { itp.c(subtitleTrack) });
                }
                else {
                    s = ((bu)this.b).getString(2132019908, new Object[] { itp.c(subtitleTrack) });
                }
                final Object a = this.a;
                final Object c = this.c;
                final gcb d = gcd.d();
                d.j();
                d.k((CharSequence)s);
                d.c(-1);
                ((acxo)a).n(((adgg)c).j((acxp)d));
            }
            return;
        }
        final Object a2 = this.a;
        final Object c2 = this.c;
        final gcb d2 = gcd.d();
        d2.j();
        d2.k((CharSequence)((bu)this.b).getString(2132019907));
        d2.c(-1);
        ((acxo)a2).n(((adgg)c2).j((acxp)d2));
    }
    
    public final PaneDescriptor q() {
        return this.r(flk.a);
    }
    
    public final PaneDescriptor r(final aisc aisc) {
        return this.s(aisc, false, false);
    }
    
    public final PaneDescriptor s(final aisc aisc, final boolean b, final boolean b2) {
        final Bundle a = PaneDescriptor.a();
        a.putBoolean("detail_pane", b);
        a.putBoolean("selection_panel_selection_changed", b2);
        return PaneDescriptor.d(this.t(), aisc, a, this.A());
    }
    
    public final Class t() {
        Object o;
        if (this.A()) {
            o = this.b;
        }
        else {
            o = this.a;
        }
        return (Class)o;
    }
    
    public final boolean u(final PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.t();
    }
    
    public final void w(final String s) {
        twd.n(s);
        ((fly)this.c).d().J((asmn)new ijs(s, 11)).aa((asmi)new ins(this, s, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final ilr x(final String s, final OfflineArrowView offlineArrowView, final int n, final View$OnClickListener view$OnClickListener) {
        final fmu fmu = (fmu)((atnb)this.c).a();
        fmu.getClass();
        final Object a = this.a;
        ((atnb)this.b).a().getClass();
        s.getClass();
        offlineArrowView.getClass();
        return new ilr(fmu, (atnb)a, s, offlineArrowView, n, view$OnClickListener);
    }
    
    public final ilg y(final int n, final String s, final OfflineArrowView offlineArrowView, final View$OnClickListener view$OnClickListener) {
        final fmu fmu = (fmu)((atnb)this.c).a();
        fmu.getClass();
        final Object a = this.a;
        final ffa ffa = (ffa)((atnb)this.b).a();
        offlineArrowView.getClass();
        return new ilg(fmu, (atnb)a, n, s, offlineArrowView, view$OnClickListener);
    }
}
