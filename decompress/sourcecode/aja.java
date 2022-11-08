import java.util.Set;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
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

public final class aja
{
    public final Object a;
    public final Object b;
    public final Object c;
    
    public aja() {
        this.b = new PointF();
        this.c = new PointF();
        this.a = new PointF();
    }
    
    public aja(final long n, final String b, final aja c, final byte[] array, final byte[] array2) {
        this.a = n;
        this.b = b;
        this.c = c;
    }
    
    public aja(final abno b, final agiy a, final ackj c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aja(final acs a) {
        this.c = new ArrayList();
        this.b = new acz();
        this.a = a;
    }
    
    public aja(final Context b, final ine ine, final ine ine2, final oas c, final byte[] array) {
        this.b = b;
        this.a = afcw.n((Object)0, (Object)ine, (Object)1, (Object)ine2);
        this.c = c;
    }
    
    public aja(final PointF b, final PointF c, final PointF a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aja(final View b, final atjj a) {
        this.b = b;
        this.a = a;
        this.c = new Rect();
    }
    
    public aja(final View view, final YouTubeTextView a, final YouTubeTextView c) {
        final tmt b = new tmt(view, (tpe)new toe());
        this.b = b;
        final tmt tmt = b;
        b.a(false);
        this.a = a;
        this.c = c;
    }
    
    public aja(final aq c, final ap a, final ComponentName b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aja(final atjj a, final atjj c, final atjj b) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = b;
    }
    
    public aja(final atjj b, final atjj c, final atjj a, final byte[] array) {
        b.getClass();
        this.b = b;
        this.c = c;
        a.getClass();
        this.a = a;
    }
    
    public aja(final atjj a, final atjj b, final atjj c, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public aja(final atjj c, final atjj a, final atjj b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aja(final atjj b, final atjj a, final atjj c, final byte[] array, final char[] array2) {
        b.getClass();
        this.b = b;
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aja(final atjj a, final atjj b, final atjj c, final char[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public aja(final atjj b, final atjj c, final atjj a, final int[] array) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aja(final atjj b, final atjj a, final atjj c, final short[] array) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
    }
    
    public aja(final aum c, final fzo b, final byte[] array, final byte[] array2) {
        this.a = new HashMap();
        this.c = c;
        this.b = b;
    }
    
    public aja(final bu b, final actx a, final aeby c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aja(final CharSequence b, final CharSequence c, final CharSequence a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aja(final Class c, final Class a, final ddq b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aja(final Class a, final Class b, final uyi c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aja(final String b, final String c, final String a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aja(final Signature a) {
        this.a = a;
        this.b = null;
        this.c = null;
    }
    
    public aja(final List c) {
        this.c = c;
        this.b = new ArrayList(c.size());
        this.a = new ArrayList(c.size());
        for (int i = 0; i < c.size(); ++i) {
            ((List<cvq>)this.b).add(((cwt)((aeyk)c.get(i)).d).a());
            ((List<cvq>)this.a).add(((cwp)((aeyk)c.get(i)).c).a());
        }
    }
    
    public aja(final Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.a = new ctl(this, (byte[])null, (byte[])null, (byte[])null);
        this.c = new csn(executor, 0);
    }
    
    public aja(final Cipher b) {
        this.b = b;
        this.a = null;
        this.c = null;
    }
    
    public aja(final Mac c) {
        this.c = c;
        this.b = null;
        this.a = null;
    }
    
    public aja(final qbo a, final qbo b, final flo c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aja(final tdz b, final tmd a, final fex c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aja(final ts ts, final kg kg, final byte[] array) {
        final vd b = new vd(this, (byte[])null);
        this.b = b;
        Object a;
        if (Build$VERSION.SDK_INT >= 30 && y(kg) != null) {
            a = new to(kg, (byte[])null);
        }
        else {
            a = new uq(kg, (byte[])null);
        }
        this.a = a;
        final vf c = new vf(((ve)a).a(), ((ve)a).b());
        this.c = c;
        final vf vf = c;
        final float b2 = c.b;
        float d = 1.0f;
        if (b2 >= 1.0f) {
            final float c2 = c.c;
            if (c2 <= 1.0f) {
                c.a = 1.0f;
                Label_0181: {
                    if (b2 != c2) {
                        if (b2 == 1.0f) {
                            break Label_0181;
                        }
                        if (c2 != 1.0f) {
                            final float n = 1.0f / c2;
                            d = (1.0f - n) / (1.0f / b2 - n);
                            break Label_0181;
                        }
                    }
                    d = 0.0f;
                }
                c.d = d;
                new aux((Object)new aam(b2, c2, d));
                ts.a((tr)b);
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
    
    public aja(final uyf a, final tal b, final asgt asgt, final wvu c, final asho asho) {
        this.a = a;
        this.b = b;
        this.c = c;
        aook aook;
        if ((aook = a.b().s) == null) {
            aook = aook.a;
        }
        if (aook.f) {
            asgt.P(asho).al((asix)new fcs(this, 10, null, null));
        }
    }
    
    public aja(final vbq a, final zki c, final flc b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aja(final wtl c, final Object a, final byte[] array, final byte[] array2) {
        this.b = new HashSet();
        this.c = c;
        this.a = a;
    }
    
    public aja(final byte[] array) {
        this.c = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.b = new HashMap();
        this.a = new HashSet();
    }
    
    public static boolean v(final zzl zzl, final int n) {
        return zzl.t() && n == 1;
    }
    
    private static Range y(final kg kg) {
        try {
            return (Range)kg.A(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        }
        catch (final AssertionError assertionError) {
            yi.d("ZoomControl", "AssertionError, fail to get camera characteristic.", (Throwable)assertionError);
            return null;
        }
    }
    
    private final boolean z() {
        return ((uyi)this.c).f(45363863L);
    }
    
    public final void a(final acs acs) {
        ((ArrayList)this.c).clear();
        for (int size = acs.aI.size(), i = 0; i < size; ++i) {
            final acr acr = acs.aI.get(i);
            if (acr.M() == 3 || acr.N() == 3) {
                ((ArrayList)this.c).add(acr);
            }
        }
        acs.c();
    }
    
    public final boolean b(final adr adr, final acr acr, int i) {
        ((acz)this.b).i = acr.M();
        ((acz)this.b).j = acr.N();
        ((acz)this.b).a = acr.j();
        ((acz)this.b).b = acr.h();
        final acz acz = (acz)this.b;
        acz.g = false;
        acz.h = i;
        i = acz.i;
        final int j = acz.j;
        if (i == 3 && acr.X > 0.0f) {
            i = 1;
        }
        else {
            i = 0;
        }
        final boolean b = j == 3 && acr.X > 0.0f;
        if (i != 0 && acr.u[0] == 4) {
            acz.i = 1;
        }
        if (b && acr.u[1] == 4) {
            acz.j = 1;
        }
        adr.a(acr, acz);
        acr.C(((acz)this.b).c);
        acr.x(((acz)this.b).d);
        final acz acz2 = (acz)this.b;
        acr.F = acz2.f;
        acr.u(acz2.e);
        final acz acz3 = (acz)this.b;
        acz3.h = 0;
        return acz3.g;
    }
    
    public final void c(final acs acs, final int b, final int n, final int n2) {
        final int ac = acs.ac;
        final int ad = acs.ad;
        acs.B(0);
        acs.A(0);
        acs.C(n);
        acs.x(n2);
        acs.B(ac);
        acs.A(ad);
        final Object a = this.a;
        ((acs)a).b = b;
        ((acy)a).T();
    }
    
    public final asgy d(final String s) {
        final flc flc = (flc)this.b;
        return flc.c.c((asgq)flc.b).N((ashb)((vdo)((vbq)this.a).a(((zki)this.c).c())).f(s));
    }
    
    public final efw e() {
        final efz h = ((efy)((wtl)this.c).c).h();
        if (h != null) {
            return (efw)h.a;
        }
        return null;
    }
    
    public final void f(final long n, final boolean b) {
        if (!this.h(n)) {
            ((Set<Long>)this.b).add(Long.valueOf(n));
            if (b) {
                final dvy dvy = (dvy)((wtl)this.c).c;
                final dve o = dvy.o;
                if (o != null) {
                    final int b2 = o.b(n);
                    if (b2 >= 0 && dvy.g(b2) == null) {
                        final egd e = dvy.o.e(b2);
                        dvy.q(b2, e, dvc.c(e), dvy.o);
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
    
    public final void j(final dwr dwr) {
        synchronized (this) {
            ((Set<dwr>)this.a).add(dwr);
        }
    }
    
    public final void k(final dwr dwr) {
        synchronized (this) {
            ((Set)this.a).remove(dwr);
            if (((Set)this.a).isEmpty()) {
                ((Map)this.b).clear();
                ((Map)this.c).clear();
            }
        }
    }
    
    public final boolean l(final Class clazz, final Class clazz2) {
        return ((Class)this.c).isAssignableFrom(clazz) && clazz2.isAssignableFrom((Class)this.a);
    }
    
    public final jak m(final int n) {
        final Context context = (Context)((atjj)this.b).a();
        context.getClass();
        final jai jai = (jai)((atjj)this.a).a();
        jai.getClass();
        final jad jad = (jad)((atjj)this.c).a();
        jad.getClass();
        return new jak(context, jai, jad, n);
    }
    
    public final Rect n() {
        final View view = (View)((atjj)this.a).a();
        if (view.getWindowToken() != ((View)this.b).getWindowToken()) {
            ((Rect)this.c).setEmpty();
            return (Rect)this.c;
        }
        final int[] array = new int[2];
        final int[] array2 = new int[2];
        view.getLocationInWindow(array);
        ((View)this.b).getLocationInWindow(array2);
        final int n = array[0] - array2[0];
        final int n2 = array[1] - array2[1];
        ((Rect)this.c).set(n, n2, view.getWidth() + n, view.getHeight() + n2);
        return (Rect)this.c;
    }
    
    public final void o() {
        final Object a = this.a;
        final Object c = this.c;
        final gbo d = gbq.d();
        d.j();
        d.k((CharSequence)((bu)this.b).getString(2132018804));
        d.c(-1);
        ((actx)a).n(((aeby)c).P((acty)d));
    }
    
    public final void p(final SubtitleTrack subtitleTrack) {
        if (subtitleTrack != null && !subtitleTrack.t()) {
            if (!subtitleTrack.r()) {
                String s;
                if (subtitleTrack.s()) {
                    s = ((bu)this.b).getString(2132017525, new Object[] { ish.c(subtitleTrack) });
                }
                else {
                    s = ((bu)this.b).getString(2132019904, new Object[] { ish.c(subtitleTrack) });
                }
                final Object a = this.a;
                final Object c = this.c;
                final gbo d = gbq.d();
                d.j();
                d.k((CharSequence)s);
                d.c(-1);
                ((actx)a).n(((aeby)c).P((acty)d));
            }
            return;
        }
        final Object a2 = this.a;
        final Object c2 = this.c;
        final gbo d2 = gbq.d();
        d2.j();
        d2.k((CharSequence)((bu)this.b).getString(2132019903));
        d2.c(-1);
        ((actx)a2).n(((aeby)c2).P((acty)d2));
    }
    
    public final PaneDescriptor q() {
        return this.r(fla.a);
    }
    
    public final PaneDescriptor r(final aioe aioe) {
        return this.s(aioe, false, false);
    }
    
    public final PaneDescriptor s(final aioe aioe, final boolean b, final boolean b2) {
        final Bundle a = PaneDescriptor.a();
        a.putBoolean("detail_pane", b);
        a.putBoolean("selection_panel_selection_changed", b2);
        return PaneDescriptor.d(this.t(), aioe, a, this.z());
    }
    
    public final Class t() {
        Object o;
        if (this.z()) {
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
        tsx.n(s);
        ((flo)this.c).d().J((asjc)new iir(s, 9)).Z((asix)new jpm(this, s, 1, null, null, null, null));
    }
    
    public final tyh x(final PrivacySpinner privacySpinner) {
        final vax vax = (vax)((atjj)this.b).a();
        vax.getClass();
        final acng acng = (acng)((atjj)this.c).a();
        acng.getClass();
        privacySpinner.getClass();
        final uyi uyi = (uyi)((atjj)this.a).a();
        uyi.getClass();
        return new tyh(vax, acng, privacySpinner, uyi);
    }
}
