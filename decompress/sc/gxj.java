import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$System;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.DurationButtonView;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import android.content.res.Resources;
import android.os.Looper;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
import j$.time.Duration;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Handler;
import android.content.Context;
import com.google.android.libraries.youtube.edit.ui.DurationMsSeekBar;
import android.os.CountDownTimer;
import android.media.SoundPool;
import android.widget.Button;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.CountdownNumeralView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxj extends utv implements View$OnClickListener, utu, uud
{
    public final bu a;
    public final View b;
    public final hci c;
    public final ubi d;
    public asir e;
    final View f;
    final View g;
    final CountdownNumeralView h;
    final SegmentedControl i;
    final Button j;
    int k;
    int l;
    SoundPool m;
    CountDownTimer n;
    public DurationMsSeekBar o;
    public String p;
    public long q;
    public final aujg r;
    public final pvh s;
    public final aeea t;
    private final Context u;
    private final View v;
    private final ucb w;
    private final Handler x;
    private boolean y;
    
    public gxj(final Context u, final bu a, final View b, final View f, final aeea t, final pvh s, final ucb w, final hci c, final ubi d, final aujg r, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(u, a.getSupportFragmentManager(), (wyw)t.a, true, true);
        this.u = u;
        final View inflate = LayoutInflater.from(u).inflate(2131625180, (ViewGroup)null);
        this.v = inflate;
        this.i = (SegmentedControl)inflate.findViewById(2131428496);
        final Resources resources = u.getResources();
        final int[] array9 = { resources.getInteger(2131493103), resources.getInteger(2131493102), resources.getInteger(2131493101) };
        final ArrayList h = new ArrayList(3);
        for (int i = 0; i < 3; ++i) {
            final int n = array9[i];
            final Integer value = n;
            final String string = resources.getString(2132017954, new Object[] { value });
            if (string == null) {
                throw new NullPointerException("Null text");
            }
            final int n2 = (int)Duration.ofSeconds((long)n).toMillis();
            final String quantityString = resources.getQuantityString(2131886150, n, new Object[] { value });
            if (quantityString == null) {
                throw new NullPointerException("Null contentDescription");
            }
            h.add(new gxi(n2, string, quantityString));
        }
        this.i.h = h;
        for (int j = 0; j < h.size(); ++j) {
            final gxi b2 = this.b(j);
            final SegmentedControlSegment segmentedControlSegment = (SegmentedControlSegment)LayoutInflater.from(u).inflate(2131625179, (ViewGroup)null);
            segmentedControlSegment.setText((CharSequence)b2.b);
            segmentedControlSegment.setTextOn((CharSequence)b2.b);
            segmentedControlSegment.setTextOff((CharSequence)b2.b);
            segmentedControlSegment.setContentDescription((CharSequence)b2.c);
            segmentedControlSegment.setChecked(j == 0);
            this.i.addView((View)segmentedControlSegment);
        }
        this.a = a;
        this.w = w;
        final DurationMsSeekBar o = (DurationMsSeekBar)this.v.findViewById(2131430798);
        this.o = o;
        o.a = w.c();
        this.o.setMax(w.c);
        this.b = b;
        this.f = f;
        this.g = f.findViewById(2131431456);
        this.h = (CountdownNumeralView)f.findViewById(2131431466);
        this.j = (Button)this.v.findViewById(2131431692);
        this.t = t;
        this.s = s;
        this.c = c;
        this.x = new Handler(Looper.getMainLooper());
        this.r = r;
        final SoundPool m = new SoundPool(5, 3, 0);
        this.m = m;
        this.k = m.load(u, 2131951637, 0);
        this.l = this.m.load(u, 2131951636, 0);
        this.d = d;
    }
    
    protected final View a() {
        return this.v;
    }
    
    final gxi b(final int n) {
        return this.i.h.get(n);
    }
    
    protected final xab c() {
        return xaa.c(99621);
    }
    
    public final void e(final int n, final boolean b) {
        this.t.cG(xaa.c(99623)).d();
    }
    
    protected final String f() {
        return this.u.getString(2132017608);
    }
    
    public final void g(final boolean b) {
        final CountDownTimer n = this.n;
        if (n == null) {
            return;
        }
        n.cancel();
        this.n = null;
        this.h.a();
        this.f.setVisibility(4);
        this.t.cG(xaa.c(98570)).f();
        final gww gww = (gww)this.s.a;
        gww.H();
        final ShortsRecordButtonView o = gww.O;
        if (o != null) {
            o.setVisibility(0);
        }
        if (b) {
            this.K();
        }
    }
    
    public final void h() {
        final hci c = this.c;
        if (c.e) {
            c.d(c.b());
            this.c.g(false);
        }
        this.t.cG(xaa.c(99623)).f();
        this.t.cG(xaa.c(99622)).f();
        this.t.cG(xaa.c(98535)).f();
        this.i.d(0, false, true);
        final pvh s = this.s;
        final gwy bs = ((gww)s.a).bs;
        if (bs != null) {
            bs.c(false);
        }
        final View ab = ((gww)s.a).aB;
        if (ab != null) {
            ab.setVisibility(0);
        }
        final gww gww = (gww)s.a;
        final gxj am = gww.am;
        if (am != null) {
            if (am.n == null) {
                gww.z();
                final DurationButtonView y = ((gww)s.a).Y;
                if (y != null) {
                    y.setVisibility(0);
                }
                final gwy bs2 = ((gww)s.a).bs;
                if (bs2 != null) {
                    bs2.a();
                }
            }
        }
        final View ak = ((gww)s.a).aK;
        if (ak != null) {
            ak.setVisibility(4);
        }
        super.h();
    }
    
    public final void i() {
        this.c.c();
        this.x.removeCallbacksAndMessages((Object)null);
    }
    
    public final void j() {
    }
    
    public final void k() {
        final pvh s = this.s;
        ((gww)s.a).m();
        final DurationButtonView y = ((gww)s.a).Y;
        if (y != null) {
            y.setVisibility(8);
        }
        final gwy bs = ((gww)s.a).bs;
        if (bs != null) {
            bs.c(true);
        }
        final View ak = ((gww)s.a).aK;
        boolean y2 = false;
        if (ak != null) {
            ak.setVisibility(0);
        }
        this.s.H(this.o.a());
        this.c.j();
        try {
            if (Settings$System.getFloat(this.u.getContentResolver(), "animator_duration_scale") != 0.0f) {
                y2 = true;
            }
            this.y = y2;
        }
        catch (final Settings$SettingNotFoundException ex) {
            this.y = true;
        }
        this.m();
    }
    
    public final void l() {
        super.l();
        final twx cg = this.t.cG(xaa.c(99623));
        cg.k(true);
        cg.c();
        final twx cg2 = this.t.cG(xaa.c(99622));
        cg2.k(true);
        cg2.c();
        final twx cg3 = this.t.cG(xaa.c(98535));
        cg3.k(true);
        cg3.c();
        this.o.d = this.w.a();
        this.o.a = this.w.c();
        final DurationMsSeekBar o = this.o;
        final int d = this.w.d;
        o.c = d;
        o.setProgress(d + o.d);
        o.postInvalidate();
        this.s.H(this.o.a());
    }
    
    public final void m() {
        final long n = this.c.a() - this.c.b();
        if (n > this.o.a()) {
            final hci c = this.c;
            c.d(c.b());
        }
        if (this.y) {
            final DurationMsSeekBar o = this.o;
            o.e = (int)Math.min(Math.max(0L, n), o.getMax());
            o.j = n / o.g.e + o.i;
            o.postInvalidate();
        }
        this.x.postDelayed((Runnable)new gsb(this, 19), 60L);
    }
    
    public final void n(int b) {
        final DurationMsSeekBar o = this.o;
        o.b = b;
        b = o.b();
        if (o.getProgress() > b) {
            o.setProgress(b);
        }
    }
    
    protected final boolean o() {
        return false;
    }
    
    public final void onClick(final View view) {
        if (view == this.b) {
            this.c.f(1.0f);
            this.c.g(true);
            final hci c = this.c;
            c.d(c.b());
            this.t.cG(xaa.c(96647)).d();
            if (!this.M()) {
                this.K();
            }
        }
        else {
            if (view == this.j) {
                final int a = this.b(this.i.d).a;
                final int a2 = this.o.a();
                final long n = a;
                final gxh n2 = new gxh(this, n, Duration.ofSeconds(1L).toMillis(), a2, a);
                this.n = n2;
                final CountdownNumeralView h = this.h;
                final int a3 = (int)Duration.ofMillis(n).getSeconds();
                h.a = a3;
                h.setCurrentText((CharSequence)"");
                h.setVisibility(0);
                h.b = true;
                if (tsy.e(h.getContext())) {
                    tsy.c(h.getContext(), (View)h, (CharSequence)h.getContext().getResources().getQuantityString(2131886151, a3, new Object[] { a3 }));
                }
                this.t.cG(xaa.c(98535)).d();
                final gww gww = (gww)this.s.a;
                gww.n();
                final ShortsRecordButtonView o = gww.O;
                if (o != null) {
                    o.setVisibility(4);
                }
                this.E();
                this.f.setVisibility(0);
                final twx cg = this.t.cG(xaa.c(98570));
                cg.k(true);
                cg.c();
                n2.start();
                return;
            }
            if (view == this.g) {
                this.t.cG(xaa.c(98570)).d();
                if (tsy.e(this.u)) {
                    final Context u = this.u;
                    tsy.c(u, this.g, (CharSequence)u.getString(2132019719));
                }
                this.g(true);
            }
        }
    }
}
