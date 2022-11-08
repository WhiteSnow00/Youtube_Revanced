import java.util.Set;
import java.io.File;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.creation.common.ui.ShortsEditCoordinatorLayout;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.apps.tiktok.account.AccountId;
import java.util.Locale;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver;
import android.app.Activity;
import java.util.List;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.widget.TextView;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerViewContainer;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxr extends gya implements aemu, arix, aenp, aerp
{
    private gxz a;
    private Context c;
    private final aun d;
    private boolean e;
    
    @Deprecated
    public gxr() {
        this.d = new aun((aum)this);
        qcj.s();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.b.p();
        try {
            ((aenl)this).aS(layoutInflater, viewGroup, bundle);
            final gxz a = this.a();
            a.p = a.J.bI();
            a.q = a.J.bz();
            a.h.h();
            a.b.b(wya.b(96658), a.r, (alff)null);
            a.b.l((wxz)new wws(wya.c(96638)));
            a.b.l((wxz)new wws(wya.c(96644)));
            if (a.J.bw()) {
                a.b.l((wxz)new wws(wya.c(106443)));
                a.b.D((wxz)new wws(wya.c(106444)));
                a.b.D((wxz)new wws(wya.c(115550)));
                a.b.D((wxz)new wws(wya.c(115549)));
            }
            a.b.l((wxz)new wws(wya.c(109823)));
            if (a.p) {
                a.b.D((wxz)new wws(wya.c(106445)));
            }
            final qpt k = a.K;
            final cl og = ((br)a.a).og();
            final gxy gxy = new gxy(a, a.b);
            final tuz a2 = tva.a();
            a2.e(2131233645);
            a2.f(2132019751);
            a2.b(2131233840);
            a2.c(2132019750);
            a.u = k.P(og, (tvb)gxy, a2.a());
            final View inflate = layoutInflater.inflate(2131625392, viewGroup, false);
            final ShortsPlayerView shortsPlayerView = (ShortsPlayerView)inflate.findViewById(2131431475);
            final ShortsPlayerViewContainer shortsPlayerViewContainer = (ShortsPlayerViewContainer)inflate.findViewById(2131431476);
            final twf a3 = twg.a();
            a3.c((boolean)((uyi)a.J.b).l(45373605L).aG());
            a3.d(false);
            a3.b(0.5625f);
            a.z = a3.a();
            final tvx c = a.c;
            final avt h = a.H;
            final twg z = a.z;
            z.getClass();
            c.q(h, shortsPlayerView, shortsPlayerViewContainer, (tvw)a, (ukp)null, z);
            final tvx c2 = a.c;
            if (bundle != null) {
                if (bundle.containsKey("shorts_editor_preview_audio_balance") && bundle.containsKey("shorts_editor_preview_currently_playing_track_id")) {
                    c2.q = bundle.getString("shorts_editor_preview_currently_playing_track_id");
                }
                if (bundle.containsKey("shorts_editor_selected_preset_effects")) {
                    final String string = bundle.getString("shorts_editor_selected_preset_effects");
                    if (string != null) {
                        c2.e().c(string);
                    }
                }
                if (bundle.containsKey("shorts_editor_video_duration_ms")) {
                    c2.j = bundle.getLong("shorts_editor_video_duration_ms");
                }
                if (c2.x) {
                    c2.u.j(bundle);
                }
            }
            tmy.cg(a.x = a.D.g((TextView)inflate.findViewById(2131431501)), a.e.getString(2132019337), false, 36);
            ((acqt)a.x).c = (acqs)new ezi(a, 8);
            inflate.findViewById(2131431500).setVisibility(0);
            final CreationButtonView creationButtonView = (CreationButtonView)inflate.findViewById(2131431472);
            creationButtonView.c.getDrawable().setAutoMirrored(true);
            creationButtonView.setOnClickListener((View$OnClickListener)new gxu(a, 0));
            a.v = a.G.M((ImageView)shortsPlayerView.c, ((br)a.a).nZ().getColor(2131102055), ((br)a.a).nZ().getColor(2131102056));
            final boolean bh = a.J.bH();
            a.o = bh;
            if (bh) {
                final uqs a4 = uqs.a((br)a.a, (List)tyj.n);
                a4.d = (trb)new gnx(a, 15);
                a.A = a4;
                a.l.j(inflate, a.A);
            }
            if (a.p) {
                a.m.h(inflate, avt.Q((wwv)a.H.a, a.r, 96658));
            }
            final abpj e = a.E;
            final tvx c3 = a.c;
            final twy v = a.v;
            final atjj i = a.i;
            final gxv gxv = new gxv(a);
            final twg z2 = a.z;
            z2.getClass();
            (a.w = e.aq(c3, v, i, viewGroup, inflate, (twi)gxv, z2, 119242)).k(inflate, bundle, (umv)a, 116194);
            aesw.k();
            return inflate;
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                hvr.g((Throwable)viewGroup, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.b.p();
        try {
            super.V(activity);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                hvr.g((Throwable)activity, t);
            }
        }
    }
    
    public final void Y() {
        this.b.p();
        try {
            ((aenl)this).s();
            final gxz a = this.a();
            a.w.l();
            final hcn t = a.t;
            if (t != null) {
                t.f();
            }
            final ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver s = a.s;
            s.b = false;
            ((Set)a.F.a).remove(s);
            a.d.g();
            final gbq y = a.y;
            if (y != null) {
                a.n.l((actz)y);
                a.y = null;
            }
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t2;
                final Throwable t3;
                hvr.g(t2, t3);
            }
        }
    }
    
    public final void Z(final int n, final String[] array, final int[] array2) {
        final gxz a = this.a();
        if (a.o) {
            final uqs a2 = a.A;
            if (a2 != null) {
                a2.b(n, array, array2);
            }
        }
    }
    
    public final gxz a() {
        final gxz a = this.a;
        if (a == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.e) {
            return a;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final aeso aM() {
        return (aeso)this.b.c;
    }
    
    public final Locale aO() {
        return aesy.a((br)this);
    }
    
    public final void aa() {
        final aers h = this.b.h();
        try {
            ((aenl)this).aK();
            final gxz a = this.a();
            a.w.m((twl)a);
            final gxa b = a.B;
            final wyn e = b.e;
            if (e != null) {
                e.c("aft");
                b.e = null;
            }
            ((Set<ShortsEditFragmentPeer$DestroyableBrowseFragmentLifecycleObserver>)a.F.a).add(a.s);
            a.s.b = true;
            final acqu x = a.x;
            if (x != null) {
                x.d(true);
            }
            a.d.h();
            h.close();
        }
        finally {
            try {
                h.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hvr.g(t, t2);
            }
        }
    }
    
    public final auh getLifecycle() {
        return (auh)this.d;
    }
    
    public final void lP(final Context context) {
        this.b.p();
        try {
            if (!this.e) {
                super.lP(context);
                if (this.a == null) {
                    try {
                        final Object ar = this.aR();
                        final br br = (br)((arje)((eso)ar).b).a;
                        if (!(br instanceof gxr)) {
                            final String string = gxz.class.toString();
                            final String value = String.valueOf(br.getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        final gxr gxr = (gxr)br;
                        gxr.getClass();
                        final wwv wwv = (wwv)((eso)ar).h.a();
                        final avt avt = (avt)((eso)ar).i.a();
                        final tvx tvx = (tvx)((eso)ar).C.a();
                        final gxa af = ((eso)ar).aO.af();
                        final auip auip = (auip)((eso)ar).a.a.aq.a();
                        final gzb gzb = (gzb)((eso)ar).D.a();
                        final hnc ax = ((eso)ar).ax();
                        final Context context2 = (Context)((eso)ar).aO.L.a();
                        final hcu hcu = (hcu)((eso)ar).n.a();
                        final twm twm = (twm)((eso)ar).x.a();
                        final ucs ucs = (ucs)((eso)ar).aO.O.a();
                        final atjj f = ((eso)ar).F;
                        final cya ay = ((eso)ar).aO.aY();
                        final avt avt2 = (avt)((eso)ar).G.a();
                        final tzs k = ((eso)ar).aO.K();
                        final hce hce = (hce)((eso)ar).l.a();
                        final gko gko = (gko)((eso)ar).a.fo.a();
                        final tyj tyj = (tyj)((eso)ar).A.a();
                        final tyl tyl = (tyl)((eso)ar).y.a();
                        final abpj abpj = (abpj)((eso)ar).H.a();
                        final zhb zhb = (zhb)((eso)ar).s.a();
                        final gbn g = ((eso)ar).aO.g();
                        final qpt qpt = (qpt)((eso)ar).u.a();
                        final AccountId accountId = (AccountId)((eso)ar).aM.c.a();
                        final aeby aeby = (aeby)((eso)ar).a.jW.a();
                        final Bundle aw = adwd.aW((br)((arje)((eso)ar).b).a);
                        final ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite)((eso)ar).a.a.az.a();
                        agot.v(aw.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), (Object)"Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        final hdm hdm = (hdm)aeda.ar(aw, "TIKTOK_FRAGMENT_ARGUMENT", (MessageLite)hdm.a, extensionRegistryLite);
                        hdm.getClass();
                        this.a = new gxz(gxr, wwv, avt, tvx, af, auip, gzb, ax, context2, hcu, twm, ucs, f, ay, avt2, k, hce, gko, tyj, tyl, abpj, zhb, g, qpt, aeby, hdm, null, null, null, null, null, null, null, null);
                        ((auh)((br)this).X).b((aul)new TracedFragmentLifecycle(this.b, this.d, (byte[])null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                    }
                }
                aesw.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hvr.g(t, t2);
            }
        }
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.c == null) {
                this.c = (Context)new aenq((br)this, super.nT());
            }
            return this.c;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.b.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)aenz.d(aa, (br)this));
            final LayoutInflater cloneInContext2 = cloneInContext.cloneInContext((Context)new aenq((br)this, cloneInContext));
            aesw.k();
            return cloneInContext2;
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hvr.g(t, t2);
            }
        }
    }
    
    public final void nm() {
        final aers f = this.b.f();
        try {
            ((aenl)this).q();
            final gxz a = this.a();
            a.f.u();
            a.c.h();
            a.w.d();
            a.s.a = null;
            if (a.o) {
                a.l.g();
            }
            if (a.p) {
                a.m.g();
            }
            f.close();
        }
        finally {
            try {
                f.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hvr.g(t, t2);
            }
        }
    }
    
    public final void nn() {
        final aers g = this.b.g();
        try {
            ((aenl)this).r();
            this.e = true;
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hvr.g(t, t2);
            }
        }
    }
    
    public final void nq(final Bundle bundle) {
        super.nq(bundle);
        final gxz a = this.a();
        final View o = ((br)a.a).O;
        if (o != null) {
            o.findViewById(2131431480).setVisibility(0);
            a.d.c(o);
            a.w.a(a.d.a().aB((asix)new gxt(a, 1)));
            if (a.p) {
                a.w.a(a.m.d().aB((asix)new gxt(a, 1)));
            }
            ((ShortsEditCoordinatorLayout)o).i = (trb)new gnx(a, 14);
            final tvr w = a.w;
            final ashe a2 = ((tya)a.i.a()).a();
            final tvr w2 = a.w;
            w2.getClass();
            w.a(a2.aB((asix)new gxt(w2, 0)));
            if (a.o) {
                a.w.a(a.l.c().aB((asix)new gxt(a, 2)));
                if (bundle != null) {
                    a.l.n(bundle);
                }
                if (a.p) {
                    a.m.r(a.l.v());
                }
            }
        }
    }
    
    public final void oq(final Bundle bundle) {
        this.b.p();
        try {
            ((aenl)this).p(bundle);
            final gxr a = this.a().a;
            hjp.f(((br)a).od(), ((br)a).nZ().getColor(2131102338));
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hvr.g(t, t2);
            }
        }
    }
    
    public final void pK(final Bundle bundle) {
        this.b.p();
        try {
            final gxz a = this.a();
            final twm g = a.g;
            if (g != null) {
                final File d = g.d;
                if (d != null) {
                    bundle.putString("SHORTS_STATE_EVENT_FILE_PATH_KEY", d.getAbsolutePath());
                }
            }
            final tvx c = a.c;
            bundle.putString("shorts_editor_preview_currently_playing_track_id", c.q);
            final String b = c.o.i().b;
            if (!FilterMapTable$FilterDescriptor.g(b)) {
                bundle.putString("shorts_editor_selected_preset_effects", b);
            }
            bundle.putLong("shorts_editor_video_duration_ms", c.j);
            if (c.x) {
                c.u.k(bundle);
            }
            if (a.o) {
                a.l.o(bundle);
            }
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                hvr.g((Throwable)bundle, t);
            }
        }
    }
    
    public final void sb(final aeso aeso, final boolean b) {
        this.b.j(aeso, b);
    }
}
