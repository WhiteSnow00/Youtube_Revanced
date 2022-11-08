// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import java.util.List;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.os.Message;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.i;
import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import android.os.Handler$Callback;
import android.view.animation.Animation$AnimationListener;
import android.view.View$OnClickListener;

public final class l extends abry implements View$OnClickListener, Animation$AnimationListener, Handler$Callback, aazx, absb, abbm, abcm, abbe, h
{
    public MinimalTimeBar a;
    public ProgressBar b;
    public abag c;
    public TouchImageView d;
    public TouchImageView e;
    public TouchImageView f;
    public TextView g;
    public Animation h;
    public Animation i;
    public Handler j;
    private final p k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ControlsOverlayStyle p;
    private ControlsState q;
    
    public l(final Context context, final i i) {
        super(context);
        this.k = new p(new sin(i), null);
        this.q = ControlsState.b();
    }
    
    private final void C(final View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.h);
            return;
        }
        if (this.p.o) {
            this.oE();
        }
    }
    
    private final void D(final boolean b) {
        final Animation h = this.h;
        long duration;
        if (!b) {
            duration = 500L;
        }
        else {
            duration = 100L;
        }
        h.setDuration(duration);
        this.C((View)this.d);
        this.C((View)this.e);
        this.C((View)this.f);
    }
    
    private final void E(final View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.i);
        }
    }
    
    private final void F() {
        this.j.removeMessages(2);
        this.c.a(this.q);
        tmy.v((View)this.g, this.q.i());
        final ProgressBar b = this.b;
        final boolean d = ControlsOverlayStyle.d(this.p);
        final boolean b2 = true;
        boolean b3 = false;
        Label_0084: {
            if (!d) {
                final ControlsState q = this.q;
                if (q.b || q.a == abac.a) {
                    b3 = true;
                    break Label_0084;
                }
            }
            b3 = false;
        }
        tmy.v((View)b, b3);
        tmy.v((View)this.a, this.n ^ true);
        if (!this.n && !this.o && !this.q.i()) {
            final TouchImageView d2 = this.d;
            final boolean k = this.q.k();
            int visibility = 4;
            if (k) {
                visibility = visibility;
                if (this.p.t) {
                    visibility = 0;
                }
            }
            d2.setVisibility(visibility);
            final boolean b4 = this.p.u && (this.l || this.m) && this.q.a != abac.a && b2;
            tmy.v((View)this.e, b4);
            tmy.v((View)this.f, b4);
            this.e.setEnabled(this.l);
            this.f.setEnabled(this.m);
            return;
        }
        tmy.v((View)this.d, false);
        tmy.v((View)this.e, false);
        tmy.v((View)this.f, false);
    }
    
    protected final void A() {
        this.j.removeMessages(1);
        this.e.clearAnimation();
        this.f.clearAnimation();
        this.d.clearAnimation();
    }
    
    public final void B(final boolean n) {
        this.n = n;
        if (n) {
            this.oE();
            return;
        }
        final abac a = this.q.a;
        if (a != abac.c && a != abac.f) {
            this.F();
            return;
        }
        this.v();
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void b(final boolean m) {
        this.m = m;
        this.F();
    }
    
    public final void d() {
        this.a.b(0L, 0L, 0L);
    }
    
    public final void f(ControlsState q) {
        if (this.q.equals((Object)q)) {
            q = this.q;
            if ((q.a == abac.b || q.b) && !this.j.hasMessages(1)) {
                this.j.sendEmptyMessageDelayed(1, 2500L);
            }
            return;
        }
        this.q = q;
        this.v();
    }
    
    public final void g(final boolean b) {
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 1) {
            this.D(false);
            return true;
        }
        if (message.what == 2) {
            this.F();
            return true;
        }
        return false;
    }
    
    public final void j(final SubtitleTrack subtitleTrack) {
    }
    
    public final void k(final ControlsOverlayStyle p) {
        this.p = p;
        this.a.a(p);
    }
    
    public final void l(final abbl b) {
        this.k.b = b;
    }
    
    public final void m(final boolean b) {
    }
    
    public final View md() {
        return (View)this;
    }
    
    public final void n(final long n, final long n2, final long n3, final long n4) {
        this.a.b(n, n3, n4);
    }
    
    public final void o(final VideoQuality[] array, final int n, final boolean b) {
    }
    
    public final void oD(final boolean l) {
        this.l = l;
        this.F();
    }
    
    public final void oE() {
        this.A();
        this.o = true;
        this.F();
        final p k = this.k;
        if (k != null) {
            k.d();
        }
    }
    
    public final void oF() {
        this.q = ControlsState.b();
        this.l = false;
        this.m = false;
        this.k(ControlsOverlayStyle.a);
        this.d();
        this.F();
    }
    
    public final void oG(final String s, final boolean b) {
        ControlsState q;
        if (b) {
            q = ControlsState.g();
        }
        else {
            q = ControlsState.h();
        }
        this.q = q;
        String s2;
        if (tmy.bm(this.getContext())) {
            s2 = this.getContext().getString(2132019932);
        }
        else {
            s2 = this.getContext().getString(2132017710);
        }
        final TextView g = this.g;
        String concat;
        if (b) {
            concat = "\n\n".concat(String.valueOf(s2));
        }
        else {
            concat = "";
        }
        g.setText((CharSequence)String.valueOf(s).concat(concat));
        this.v();
    }
    
    public final void oH(final boolean b) {
    }
    
    public final void onAnimationEnd(final Animation animation) {
        if (animation == this.h) {
            this.oE();
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
    
    public final void onClick(final View view) {
        final p k = this.k;
        if (k != null) {
            if (view == this.e) {
                this.oE();
                this.k.a();
                return;
            }
            if (view == this.f) {
                this.oE();
                this.k.b();
                return;
            }
            if (view == this.d) {
                final abac a = this.q.a;
                if (a == abac.f) {
                    k.n();
                    return;
                }
                if (a == abac.b) {
                    k.e();
                    return;
                }
                if (a == abac.c) {
                    k.f();
                }
            }
        }
    }
    
    public final boolean onFilterTouchEventForSecurity(final MotionEvent motionEvent) {
        final p k = this.k;
        final int flags = motionEvent.getFlags();
        boolean b = true;
        if (0x1 != (flags & 0x1)) {
            b = false;
        }
        k.h(b);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() == 1) {
            if (this.q.a == abac.d) {
                final p k = this.k;
                if (k != null) {
                    k.o();
                    return true;
                }
            }
            if (this.o) {
                if (!this.p.o) {
                    this.v();
                    this.E((View)this.d);
                    this.E((View)this.e);
                    this.E((View)this.f);
                }
            }
            else {
                this.A();
                this.D(true);
            }
        }
        return true;
    }
    
    public final void pj(final aazw a) {
        this.k.a = a;
    }
    
    public final void pk(final boolean b) {
    }
    
    public final void q(final List list) {
    }
    
    public final void qW(final boolean b) {
    }
    
    public final void qX(final boolean b) {
    }
    
    public final void qY(final abbd d) {
        this.k.d = d;
    }
    
    public final void qZ(final g f) {
        this.k.f = f;
    }
    
    public final void r(final boolean b) {
    }
    
    public final void rb(final boolean b) {
    }
    
    public final void re(final abcl c) {
        this.k.c = c;
    }
    
    public final void rf() {
    }
    
    public final void s(final CharSequence charSequence) {
    }
    
    public final void u(final Map map) {
    }
    
    public final void v() {
        this.A();
        this.o = false;
        this.F();
        final p k = this.k;
        if (k != null) {
            k.v();
        }
        final ControlsState q = this.q;
        if ((q.a == abac.b || q.b) && !this.o && !this.j.hasMessages(1)) {
            this.j.sendEmptyMessageDelayed(1, 2500L);
        }
    }
}
