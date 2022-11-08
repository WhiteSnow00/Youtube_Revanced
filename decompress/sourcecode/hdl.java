import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.animation.Animator$AnimatorListener;
import android.view.View$OnClickListener;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.edit.preview.UnifyTrimVideoControllerView;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.app.Activity;
import android.widget.TextView;
import android.net.Uri;
import com.google.android.libraries.video.media.VideoMetaData;
import android.content.Context;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdl implements hem
{
    private boolean A;
    private final gxa B;
    private final int C;
    private auip D;
    CreationButtonView a;
    YouTubeButton b;
    View c;
    YouTubeButton d;
    YouTubeButton e;
    ViewGroup f;
    LottieAnimationView g;
    final avt h;
    private final String i;
    private final String j;
    private final heo k;
    private final ShortsVideoTrimView2 l;
    private final rbi m;
    private final hga n;
    private final Context o;
    private final ucs p;
    private final urf q;
    private final wwv r;
    private VideoMetaData s;
    private uac t;
    private hel u;
    private Uri v;
    private TextView w;
    private final int x;
    private final boolean y;
    private boolean z;
    
    public hdl(final Activity o, final wwv r, final avt h, final hga n, final gxa b, final ucs p10, final hdk hdk, final byte[] array, final byte[] array2, final byte[] array3) {
        this.z = false;
        this.A = false;
        this.o = (Context)o;
        this.r = r;
        this.h = h;
        this.n = n;
        this.B = b;
        this.p = p10;
        this.l = hdk.b;
        this.k = hdk.a;
        this.m = hdk.c;
        this.x = hdk.d;
        this.q = hdk.e;
        this.y = hdk.f;
        this.C = hdk.g;
        this.i = ((Context)o).getString(2132019702);
        this.j = ((Context)o).getString(2132019703);
    }
    
    private final int n(final View view) {
        if (view == this.d) {
            return 141308;
        }
        if (view == this.e) {
            return 141309;
        }
        if (view == this.f) {
            return 141307;
        }
        return -1;
    }
    
    private final EditableVideo o() {
        EditableVideo editableVideo;
        if (this.l()) {
            final urf q = this.q;
            q.getClass();
            editableVideo = q.d;
            editableVideo.getClass();
        }
        else {
            final uac t = this.t;
            t.getClass();
            editableVideo = t.b;
            editableVideo.getClass();
        }
        return editableVideo;
    }
    
    private final void p(final wyb wyb) {
        this.h.S(wyb).d();
    }
    
    private final void q(final boolean b) {
        if (b) {
            this.h.S(wya.c(110247)).h();
            if (!this.y()) {
                this.h.S(wya.c(110246)).h();
            }
        }
        else {
            this.h.S(wya.c(110247)).f();
            if (!this.y()) {
                this.h.S(wya.c(110246)).f();
            }
        }
    }
    
    private final void r() {
        this.t(this.A = true);
        this.v();
        this.u((View)this.d, false);
        this.u((View)this.e, true);
        this.k.i(this.y());
        final VideoMetaData s = this.s;
        s.getClass();
        final float a = s.a();
        if (a > 0.5625f && a <= 1.0f) {
            this.u((View)this.f, true);
        }
        else if (a > 1.0f) {
            this.z = false;
            this.s();
            this.u((View)this.f, false);
        }
        this.w(true);
        this.q(true);
    }
    
    private final void s() {
        final EditableVideo o = this.o();
        if (!this.z) {
            final auip d = this.D;
            d.getClass();
            d.bl(o, this.y);
        }
        else {
            final auip d2 = this.D;
            d2.getClass();
            d2.bk(o);
        }
        final LottieAnimationView g = this.g;
        if (g != null) {
            g.d.b.j();
            this.g.e();
        }
        this.z ^= true;
        final hel u = this.u;
        if (u != null) {
            final maw ac = ((hej)u).a.aC;
            if (ac != null) {
                ((urf)ac.b).m();
            }
        }
    }
    
    private final void t(final boolean b) {
        final rbi m = this.m;
        if (m instanceof UnifyTrimVideoControllerView) {
            ((UnifyTrimVideoControllerView)m).B(b);
        }
    }
    
    private final void u(final View view, final boolean b) {
        if (view != null) {
            if (this.n(view) >= 0) {
                int visibility;
                if (!b) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                view.setVisibility(visibility);
                final int n = this.n(view);
                if (b) {
                    this.h.S(wya.c(n)).h();
                    return;
                }
                this.h.S(wya.c(n)).f();
            }
        }
    }
    
    private final void v() {
        this.o().r(this.A);
    }
    
    private final void w(final boolean b) {
        final YouTubeButton b2 = this.b;
        b2.getClass();
        String contentDescription;
        if (b) {
            contentDescription = this.i;
        }
        else {
            contentDescription = this.j;
        }
        b2.setContentDescription((CharSequence)contentDescription);
    }
    
    private final boolean x() {
        if (this.y()) {
            final VideoMetaData s = this.s;
            s.getClass();
            if (s.a() <= 1.0f) {
                return true;
            }
        }
        return false;
    }
    
    private final boolean y() {
        return hgd.p((uck)this.l) <= TimeUnit.SECONDS.toMicros(this.x);
    }
    
    public final void a(final View view) {
        view.getClass();
        ((YouTubeButton)view.findViewById(2131431522)).setVisibility(8);
        (this.b = (YouTubeButton)view.findViewById(2131431520)).setEnabled(true);
        this.b.setVisibility(0);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.b.setText((CharSequence)this.o.getResources().getString(2132019337));
        this.b.setContentDescription((CharSequence)this.j);
        (this.a = (CreationButtonView)view.findViewById(2131431517)).setOnClickListener((View$OnClickListener)this);
        (this.c = view.findViewById(2131432197)).setVisibility(0);
        (this.d = (YouTubeButton)view.findViewById(2131428800)).setEnabled(true);
        this.d.setOnClickListener((View$OnClickListener)this);
        (this.e = (YouTubeButton)view.findViewById(2131428801)).setEnabled(true);
        this.e.setOnClickListener((View$OnClickListener)this);
        (this.f = (ViewGroup)view.findViewById(2131431518)).setEnabled(true);
        this.f.setOnClickListener((View$OnClickListener)this);
        (this.g = (LottieAnimationView)view.findViewById(2131428538)).a((Animator$AnimatorListener)new hdj(0));
        this.g.m(1.0f);
        this.g.p(1.0f);
        (this.w = (TextView)view.findViewById(2131432196)).setText((CharSequence)this.o.getResources().getString(2132019799));
    }
    
    public final void b() {
        final YouTubeButton b = this.b;
        if (b != null) {
            b.setEnabled(true);
        }
    }
    
    public final void c() {
        final YouTubeButton b = this.b;
        if (b != null) {
            b.setEnabled(false);
        }
    }
    
    public final void e(final Uri v) {
        this.v = v;
        final YouTubeButton b = this.b;
        b.getClass();
        boolean b2 = true;
        b.setEnabled(true);
        this.s = this.o().b;
        final wwv r = this.r;
        final wyb c = wya.c(97092);
        final ShortsVideoTrimView2 l = this.l;
        hgd.q(r, c, l.n, afqo.c(l.h()).toMillis());
        if (this.x()) {
            final View c2 = this.c;
            c2.getClass();
            c2.setVisibility(0);
            this.u((View)this.d, false);
            this.u((View)this.e, false);
            final TextView w = this.w;
            w.getClass();
            w.setVisibility(0);
            final VideoMetaData s = this.s;
            s.getClass();
            final float a = s.a();
            if (a > 0.5625f && a <= 1.0f) {
                this.u((View)this.f, true);
            }
            else {
                this.u((View)this.f, false);
            }
            this.k.h();
            if (this.l()) {
                this.k();
            }
            else {
                this.g();
            }
            this.w(true);
            this.q(true);
        }
        else {
            final View c3 = this.c;
            c3.getClass();
            c3.setVisibility(0);
            final TextView w2 = this.w;
            w2.getClass();
            w2.setVisibility(8);
            this.u((View)this.d, true);
            this.u((View)this.e, false);
            if (this.l()) {
                this.k();
            }
            else {
                final uac t = this.t;
                if (t != null) {
                    final EditableVideo b3 = t.b;
                    if (b3 == null || !b3.L()) {
                        b2 = false;
                    }
                    if (this.A || b2) {
                        this.r();
                    }
                    this.g();
                }
            }
            this.m.j(this.A);
            this.w(this.A);
        }
        final gxa b4 = this.B;
        final wyn d = b4.d;
        if (d == null) {
            return;
        }
        d.c("aft");
        b4.d = null;
    }
    
    public final void f() {
        this.u = null;
    }
    
    public final void g() {
        final uac t = this.t;
        t.getClass();
        final EditableVideo b = t.b;
        if (b == null) {
            return;
        }
        this.l.C(b.n());
        this.l.D(b.l());
        this.m.n();
        this.D.getClass();
        if (auip.bi(b) && !this.z) {
            this.s();
        }
    }
    
    public final void h(final hel u) {
        this.u = u;
    }
    
    public final void i(final uac t) {
        this.t = t;
    }
    
    public final void j(final apmt apmt) {
        if (this.D != null) {
            final int c = this.C;
            final EditableVideo o = this.o();
            final avt h = this.h;
            this.D.getClass();
            hgd.E(apmt, c, o, h, this.l, 96644);
            return;
        }
        zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Trim]Unable to log trim client data in Trim-to-Editor.");
    }
    
    public final void k() {
        final urf q = this.q;
        q.getClass();
        final EditableVideo d = q.d;
        if (d != null) {
            final uac t = this.t;
            t.getClass();
            t.b = d;
        }
    }
    
    public final boolean l() {
        final uac t = this.t;
        t.getClass();
        return t.b == null;
    }
    
    public final void m(final auip d) {
        this.D = d;
    }
    
    public final void onClick(final View view) {
        if (view == this.b) {
            if (!this.A && !this.x()) {
                final agza builder = ((agzi)amob.a).createBuilder();
                builder.copyOnWrite();
                final amob amob = (amob)builder.instance;
                amob.b |= 0x2;
                amob.d = 96644;
                final InteractionLoggingScreen a = this.r.a();
                if (a != null) {
                    final String a2 = a.a;
                    builder.copyOnWrite();
                    final amob amob2 = (amob)builder.instance;
                    a2.getClass();
                    amob2.b |= 0x1;
                    amob2.c = a2;
                }
                this.p.s(false);
                final Uri v = this.v;
                if (v != null) {
                    this.p.r(v);
                }
                Uri b = Uri.EMPTY;
                final urf q = this.q;
                q.getClass();
                final EditableVideo d = q.d;
                if (d != null) {
                    b = uro.e(d);
                }
                final hgb a3 = hgc.a();
                a3.k = hgd.a(this.o, this.v);
                a3.i = afqo.c(hgd.p((uck)this.l)).toMillis();
                a3.c(apfo.h);
                a3.p = 2;
                a3.b = b;
                a3.c = (amob)builder.build();
                a3.b(this.x());
                final Uri v2 = this.v;
                if (v2 != null) {
                    a3.a = v2;
                }
                final String a4 = this.p.a();
                if (a4 != null) {
                    a3.n = a4;
                }
                this.n.a(a3.a());
                return;
            }
            final uac t = this.t;
            EditableVideo b2;
            if (t == null) {
                b2 = null;
            }
            else {
                b2 = t.b;
            }
            this.p.s(true);
            final hel u = this.u;
            if (u != null && b2 != null) {
                u.b(b2);
            }
        }
        else if (view == this.a) {
            final hel u2 = this.u;
            if (u2 != null) {
                u2.a();
            }
        }
        else {
            if (view == this.d) {
                this.r();
                this.p(wya.c(141308));
                return;
            }
            if (view == this.e) {
                this.t(this.A = false);
                this.v();
                this.u((View)this.d, true);
                this.u((View)this.e, false);
                final heo k = this.k;
                k.c = false;
                uji.I((tvl)k);
                this.u((View)this.f, false);
                this.z = true;
                this.s();
                this.w(false);
                this.q(false);
                this.p(wya.c(141309));
                return;
            }
            if (view == this.f) {
                this.s();
                this.p(wya.c(141307));
            }
        }
    }
}
