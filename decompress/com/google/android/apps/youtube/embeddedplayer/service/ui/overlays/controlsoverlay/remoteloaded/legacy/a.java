// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import java.util.List;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import android.os.Message;
import android.view.ViewGroup$LayoutParams;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AlphaAnimation;
import android.graphics.drawable.Drawable;
import android.graphics.Color;
import android.util.TypedValue;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.f;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.i;
import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.view.animation.Animation;
import android.os.Handler;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.p;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import android.os.Handler$Callback;
import android.view.animation.Animation$AnimationListener;
import android.view.View$OnClickListener;

public final class a extends abvl implements View$OnClickListener, Animation$AnimationListener, Handler$Callback, abcy, abvm, abeo, abfm, abee, h
{
    public final p a;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a b;
    public final MinimalTimeBar c;
    public final ProgressBar d;
    public final ImageButton e;
    public final ImageButton f;
    public final ImageButton g;
    public final ImageView h;
    public final TextView i;
    public Handler j;
    public final Animation k;
    public boolean l;
    private ControlsOverlayStyle m;
    private ControlsState n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final agop v;
    
    public a(final Context context, final i i) {
        super(context);
        this.a = new p(new slt(i), null);
        final oqz oqz = new oqz(this);
        final oqz oqz2 = new oqz(this);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a b = new com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a(context);
        final Context context2 = b.getContext();
        final float density = b.getResources().getDisplayMetrics().density;
        b.a = (int)(50.0f * density + 0.5f);
        b.b = (int)(45.0f * density + 0.5f);
        b.c = (int)(density * 7.0f + 0.5f);
        b.addView((View)(b.d = com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.c.a(context2, oqz)));
        (b.e = new View(context2)).setBackgroundResource(2131230951);
        b.addView(b.e);
        final f f = new f(context2, oqz2, null, null);
        final Context context3 = f.getContext();
        final DisplayMetrics displayMetrics = f.getResources().getDisplayMetrics();
        final float density2 = displayMetrics.density;
        f.c = (int)(230.0f * density2 + 0.5f);
        f.e = (int)(5.0f * density2 + 0.5f);
        f.f = (int)(12.0f * density2 + 0.5f);
        f.d = (int)(density2 * 8.0f + 0.5f);
        f.a = new e(context3);
        (f.b = new StateListDrawable()).addState(View.PRESSED_ENABLED_STATE_SET, agy.a(context3, 2131230956));
        f.b.addState(View.ENABLED_STATE_SET, agy.a(context3, 2131230955));
        f.b.setState(View.ENABLED_STATE_SET);
        f.g = new Rect();
        (f.k = new Paint()).setTextSize(TypedValue.applyDimension(2, 14.0f, displayMetrics));
        f.k.setColor(-1);
        f.k.setAntiAlias(true);
        f.k.getTextBounds("00:00", 0, 5, f.g);
        f.h = new Rect();
        f.i = new Rect();
        f.j = new Rect();
        (f.l = new Paint()).setColor(Color.parseColor("#B2FFFF00"));
        f.a(ControlsOverlayStyle.a);
        f.b(0L, 0L, 0L);
        b.addView((View)(b.f = f));
        (b.j = new TextView(context2)).setBackgroundResource(2131230945);
        b.j.setText((CharSequence)"LIVE");
        b.j.setTextSize(16.0f);
        b.j.setTextColor(-1);
        b.j.setGravity(16);
        b.addView((View)b.j);
        final StateListDrawable imageDrawable = new StateListDrawable();
        imageDrawable.addState(View.PRESSED_ENABLED_STATE_SET, agy.a(context2, 2131230947));
        imageDrawable.addState(View.ENABLED_STATE_SET, agy.a(context2, 2131230946));
        (b.g = new ImageButton(context2)).setBackground((Drawable)null);
        b.g.setImageDrawable((Drawable)imageDrawable);
        final ImageButton g = b.g;
        final int c = b.c;
        g.setPadding(c, c, c, c);
        b.g.setOnClickListener((View$OnClickListener)b);
        b.g.setContentDescription(context2.getText(2132017405));
        b.addView((View)b.g);
        final StateListDrawable imageDrawable2 = new StateListDrawable();
        imageDrawable2.addState(View.PRESSED_ENABLED_SELECTED_STATE_SET, agy.a(context2, 2131230949));
        imageDrawable2.addState(View.ENABLED_SELECTED_STATE_SET, agy.a(context2, 2131230948));
        imageDrawable2.addState(View.PRESSED_ENABLED_STATE_SET, agy.a(context2, 2131230944));
        imageDrawable2.addState(View.ENABLED_STATE_SET, agy.a(context2, 2131230943));
        (b.h = new ImageButton(context2)).setBackground((Drawable)null);
        b.h.setImageDrawable((Drawable)imageDrawable2);
        final ImageButton g2 = b.g;
        final int c2 = b.c;
        g2.setPadding(c2, c2, c2, c2);
        b.h.setOnClickListener((View$OnClickListener)b);
        b.h.setContentDescription(context2.getText(2132017255));
        b.addView((View)b.h);
        this.b = b;
        this.c = new MinimalTimeBar(context);
        this.n = ControlsState.b();
        (this.d = new ProgressBar(context)).setIndeterminate(true);
        final ImageButton e = new ImageButton(context);
        (this.e = e).setBackgroundResource(2131230939);
        e.setContentDescription(context.getText(2132017326));
        (this.h = new ImageView(context)).setBackgroundResource(2131230942);
        final TextView j = new TextView(context);
        (this.i = j).setGravity(17);
        j.setBackgroundResource(2131230951);
        j.setTextColor(-1);
        j.setMinimumHeight(b.a);
        final ImageButton f2 = new ImageButton(context);
        (this.f = f2).setBackgroundResource(2131230937);
        f2.setContentDescription(context.getText(2132017307));
        final ImageButton g3 = new ImageButton(context);
        (this.g = g3).setBackgroundResource(2131230940);
        g3.setContentDescription(context.getText(2132017358));
        (this.k = (Animation)new AlphaAnimation(1.0f, 0.0f)).setInterpolator((Interpolator)new LinearInterpolator());
        this.v = new agop(context);
    }
    
    private static void F(final View view, int measuredWidth, int n) {
        final int n2 = view.getMeasuredWidth() / 2;
        final int n3 = view.getMeasuredHeight() / 2;
        final int n4 = measuredWidth - n2;
        measuredWidth = view.getMeasuredWidth();
        n -= n3;
        view.layout(n4, n, measuredWidth + n4, view.getMeasuredHeight() + n);
    }
    
    private final void G(final View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.k);
        }
    }
    
    private final void H(final boolean b) {
        this.u = true;
        final Animation k = this.k;
        long duration;
        if (!b) {
            duration = 500L;
        }
        else {
            duration = 100L;
        }
        k.setDuration(duration);
        if (!this.q) {
            this.G((View)this.b);
        }
        this.G((View)this.e);
        this.G((View)this.f);
        this.G((View)this.g);
    }
    
    private static final void I(final View view, final boolean b) {
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view.setVisibility(visibility);
    }
    
    public final void A() {
        this.u = false;
        this.j.removeMessages(1);
        this.k.setAnimationListener((Animation$AnimationListener)null);
        if (!this.q) {
            this.b.clearAnimation();
        }
        this.f.clearAnimation();
        this.g.clearAnimation();
        this.e.clearAnimation();
        this.k.setAnimationListener((Animation$AnimationListener)this);
    }
    
    public final void B() {
        final ControlsState n = this.n;
        if ((n.a == abde.b || n.b) && !this.t && !this.j.hasMessages(1)) {
            this.j.sendEmptyMessageDelayed(1, 2500L);
        }
    }
    
    public final void C(final boolean s) {
        this.s = s;
        if (s) {
            this.oC();
            this.E();
            return;
        }
        final abde a = this.n.a;
        if (a != abde.c && a != abde.f) {
            this.E();
            return;
        }
        this.v();
    }
    
    public final void D(final boolean q) {
        this.q = q;
        this.E();
    }
    
    public final void E() {
        final abde a = this.n.a;
        if (a == abde.c) {
            this.e.setBackgroundResource(2131230939);
            this.e.setContentDescription(this.getContext().getText(2132017326));
        }
        else if (a == abde.b) {
            this.e.setBackgroundResource(2131230938);
            this.e.setContentDescription(this.getContext().getText(2132017324));
        }
        else {
            this.e.setBackgroundResource(2131230941);
            this.e.setContentDescription(this.getContext().getText(2132017375));
        }
        final boolean l = this.l;
        final boolean b = true;
        final boolean b2 = l && this.b.getTop() < this.e.getBottom();
        Label_0548: {
            if (!this.t && !this.n.i()) {
                final ControlsState n = this.n;
                if (n.a != abde.a) {
                    I((View)this.h, n.i() && !b2);
                    I((View)this.i, this.n.i() && !b2);
                    I((View)this.d, this.n.b && !b2);
                    I((View)this.e, !this.n.i() && !this.n.b && this.m.t && !b2);
                    I((View)this.b, this.q ^ true);
                    I(this.c, this.m.p && this.q);
                    this.setVisibility(0);
                    break Label_0548;
                }
            }
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                I(child, (child == this.d && this.n.b) || ((child == this.h || child == this.i) && this.n.i()) || (child == this.c && this.q));
            }
            boolean b3 = false;
            Label_0543: {
                if (!this.q || this.s) {
                    final ControlsState n2 = this.n;
                    if (!n2.b) {
                        if (!n2.i()) {
                            b3 = false;
                            break Label_0543;
                        }
                    }
                }
                b3 = true;
            }
            I((View)this, b3);
        }
        final boolean b4 = !this.t && !this.n.b && this.m.u && !b2;
        I((View)this.f, b4 && this.o);
        I((View)this.g, b4 && this.p && b);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void b(final boolean p) {
        this.p = p;
        this.E();
    }
    
    public final void d() {
        this.b.c(0L, 0L, 0L);
        this.c.b(0L, 0L, 0L);
    }
    
    public final void f(final ControlsState n) {
        if (!this.n.equals((Object)n)) {
            this.n = n;
            this.v();
            return;
        }
        this.B();
    }
    
    public final void g(final boolean b) {
        final ImageButton b2 = this.b.d.b;
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        b2.setVisibility(visibility);
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 1) {
            this.H(false);
            return true;
        }
        return false;
    }
    
    public final void j(final SubtitleTrack subtitleTrack) {
    }
    
    public final void l(final aben b) {
        this.a.b = b;
    }
    
    public final void m(final boolean b) {
        final ImageButton a = this.b.d.a;
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        a.setVisibility(visibility);
    }
    
    public final void n(final long n, final long n2, final long n3, final long n4) {
        this.b.c(n, n3, n4);
        this.c.b(n, n3, n4);
    }
    
    public final void o(final VideoQuality[] f, final int g, final boolean b) {
        final c d = this.b.d;
        d.f = f;
        d.g = g;
    }
    
    public final void oB(final boolean o) {
        this.o = o;
        this.E();
    }
    
    public final void oC() {
        this.A();
        if (this.t) {
            return;
        }
        this.t = true;
        this.b.d.setVisibility(4);
        this.E();
        this.setFocusable(true);
        this.requestFocus();
        final p a = this.a;
        if (a != null) {
            a.d();
        }
    }
    
    public final void oD() {
        this.v.e();
        this.oV(ControlsOverlayStyle.a);
    }
    
    public final void oE(final String text, final boolean b) {
        ControlsState n;
        if (b) {
            n = ControlsState.g();
        }
        else {
            n = ControlsState.h();
        }
        this.n = n;
        final ImageView h = this.h;
        int imageResource;
        if (!b) {
            imageResource = 2131230942;
        }
        else {
            imageResource = 2131230941;
        }
        h.setImageResource(imageResource);
        this.i.setText((CharSequence)text);
        this.E();
        this.v();
    }
    
    public final void oF(final boolean b) {
        this.b.b(b);
    }
    
    public final void oV(final ControlsOverlayStyle m) {
        this.m = m;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a b = this.b;
        if (m == ControlsOverlayStyle.k) {
            b.f.setVisibility(8);
            b.j.setVisibility(0);
        }
        else {
            b.f.a(m);
            b.f.setVisibility(0);
            b.j.setVisibility(8);
        }
        this.c.a(m);
    }
    
    public final void onAnimationEnd(final Animation animation) {
        this.u = false;
        this.oC();
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
    
    public final void onClick(final View view) {
        final p a = this.a;
        if (a != null) {
            if (view == this.f) {
                this.oC();
                this.a.a();
                return;
            }
            if (view == this.g) {
                this.oC();
                this.a.b();
                return;
            }
            if (view == this.e) {
                final abde a2 = this.n.a;
                if (a2 == abde.f) {
                    a.n();
                    return;
                }
                if (a2 == abde.b) {
                    a.e();
                    return;
                }
                if (a2 == abde.c) {
                    a.f();
                }
            }
        }
    }
    
    public final boolean onFilterTouchEventForSecurity(final MotionEvent motionEvent) {
        final p a = this.a;
        final int flags = motionEvent.getFlags();
        boolean b = true;
        if (0x1 != (flags & 0x1)) {
            b = false;
        }
        a.h(b);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (!keyEvent.isSystem() || aamp.j(n)) {
            this.v();
            if (this.n.a == abde.d) {
                this.a.o();
                return true;
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    protected final void onLayout(final boolean b, int n, int n2, final int n3, int n4) {
        final int paddingLeft = this.getPaddingLeft();
        n4 -= n2;
        n2 = n4 - this.getPaddingBottom();
        Object o;
        if (this.q) {
            o = this.c;
        }
        else {
            o = this.b;
        }
        n4 /= 2;
        ((View)o).layout(paddingLeft, n2 - ((View)o).getMeasuredHeight(), ((View)o).getMeasuredWidth() + paddingLeft, n2);
        final ImageButton e = this.e;
        n = (n3 - n) / 2;
        F((View)e, n, n4);
        F((View)this.h, n, n4);
        F((View)this.d, n, n4);
        F((View)this.g, this.e.getLeft() - this.g.getMeasuredWidth() / 2, n4);
        F((View)this.f, this.e.getRight() + this.f.getMeasuredWidth() / 2, n4);
        final TextView i = this.i;
        i.layout(paddingLeft, n2 - i.getMeasuredHeight(), this.i.getMeasuredWidth() + paddingLeft, n2);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int defaultSize = getDefaultSize(0, n);
        this.setMeasuredDimension(defaultSize, getDefaultSize(0, n2));
        final TextView i = this.i;
        final int paddingTop = i.getPaddingTop();
        final int paddingBottom = this.i.getPaddingBottom();
        final int n3 = defaultSize * 10 / 100;
        i.setPadding(n3, paddingTop, n3, paddingBottom);
        this.measureChild((View)this.d, n, n2);
        this.measureChild((View)this.e, n, n2);
        this.measureChild((View)this.h, n, n2);
        this.measureChild((View)this.i, n, n2);
        this.measureChild((View)this.f, n, n2);
        this.measureChild((View)this.g, n, n2);
        Object o;
        if (this.q) {
            o = this.c;
        }
        else {
            o = this.b;
        }
        this.measureChild((View)o, n, n2);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        boolean r = false;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.r = false;
                }
            }
            else {
                if (this.n.a == abde.d) {
                    this.a.o();
                }
                else if (!this.t && !this.r) {
                    this.H(true);
                }
                this.r = false;
            }
        }
        else {
            Label_0217: {
                if (!this.t) {
                    final float x = motionEvent.getX();
                    final float y = motionEvent.getY();
                    final boolean q = this.q;
                    Object o;
                    if (q) {
                        o = this.c;
                    }
                    else {
                        o = this.b;
                    }
                    int top;
                    if (!q && !this.l) {
                        top = this.b.getBottom() - this.b.a;
                    }
                    else {
                        top = ((View)o).getTop();
                    }
                    if (((View)o).getLeft() > x || x > ((View)o).getRight() || top > y || y > ((View)o).getBottom()) {
                        if (!this.u) {
                            break Label_0217;
                        }
                    }
                }
                r = true;
            }
            this.r = r;
            this.v();
        }
        return true;
    }
    
    public final void pm(final abcx a) {
        final p a2 = this.a;
        a2.a = a;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a b = this.b;
        b.i = (abcx)a2;
        final c d = b.d;
        a2.getClass();
        d.h = (abcx)a2;
    }
    
    public final void pn(final boolean enabled) {
        this.b.f.setEnabled(enabled);
    }
    
    public final void q(final List list) {
        this.v.f(list, (aben)this.a);
    }
    
    public final void r(final boolean b) {
        final ImageButton h = this.b.h;
        int visibility;
        if (!b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        h.setVisibility(visibility);
    }
    
    public final void rb(final boolean selected) {
        this.b.d.b.setSelected(selected);
    }
    
    public final void rc(final boolean b) {
    }
    
    public final void rd(final abed d) {
        this.a.d = d;
    }
    
    public final void re(final g f) {
        this.a.f = f;
    }
    
    public final void rg(final boolean b) {
    }
    
    public final void rj(final long n, final long n2, final long n3, final long n4, final long n5) {
        aana.e((abcy)this, n, n3, n4, n5);
    }
    
    public final void rk(final abfl c) {
        this.a.c = c;
    }
    
    public final void rl() {
        tqf.y(this.getContext(), this.getContext().getText(2132018807), 0);
    }
    
    public final void s(final CharSequence charSequence) {
    }
    
    public final void u(final Map m) {
        this.b.f.m = m;
    }
    
    public final void v() {
        if (this.s) {
            return;
        }
        final boolean t = this.t;
        this.A();
        this.t = false;
        this.E();
        this.setFocusable(false);
        if (t) {
            final p a = this.a;
            if (a != null) {
                a.v();
            }
        }
        this.B();
    }
    
    public final void x() {
        aana.c((abcy)this);
    }
    
    public final void y(final anhd anhd, final boolean b) {
        aana.d((abcy)this, anhd, b);
    }
}
