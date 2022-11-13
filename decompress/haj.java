import java.util.Deque;
import android.view.MotionEvent;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import java.util.function.Predicate;
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.ArrayList;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.os.Build$VERSION;
import android.view.View$OnTouchListener;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.voiceover.VoiceoverViewControllerImpl$2;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import com.google.android.libraries.youtube.creation.common.ui.UndoRedoButtonView;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.voiceover.VoiceoverSeekBar;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haj implements View$OnClickListener, tyy, uam, uai
{
    public static final int m = 0;
    private tyz A;
    private usn B;
    private gbx C;
    private boolean D;
    private boolean E;
    private final cyb F;
    private pvh G;
    private final aeea H;
    public final txz a;
    public final uaj b;
    public final uak c;
    public final aun d;
    final asiq e;
    public VoiceoverSeekBar f;
    public ShortsRecordButtonView g;
    public hah h;
    public arbo i;
    public ListenableFuture j;
    public ual k;
    public boolean l;
    private final afvt o;
    private final atjs p;
    private final gbu q;
    private final gkx r;
    private final wyw s;
    private View t;
    private View u;
    private View v;
    private UndoRedoButtonView w;
    private UndoRedoButtonView x;
    private hag y;
    private ShortsPlayerView z;
    
    public haj(final txz a, final afvt o, final msr msr, final wyw wyw, final cyb f, final uak c, final uaj b, final aun d, final gbu q, final gkx r, final wyw s, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.p = atjs.e();
        this.e = new asiq();
        this.a = a;
        this.o = o;
        this.H = new aeea(wyw, (byte[])null);
        this.F = f;
        this.c = c;
        this.b = b;
        this.d = d;
        this.q = q;
        this.r = r;
        this.s = s;
        d.getLifecycle().b((aum)new VoiceoverViewControllerImpl$2(this));
        msr.R((Callable)new gqw(this, 9));
    }
    
    public static final void A(final String s) {
        ttr.l("VoiceoverViewCtrlImpl.".concat(s));
        hko.L(zll.a, zlk.f, "[ShortsCreation][Android][Voiceover]".concat(s));
    }
    
    private final aezp B(final int n) {
        final afeq a = this.c.a();
        for (int size = ((List)a).size(), i = 0; i < size; ++i) {
            final arbo arbo = (arbo)((List)a).get(i);
            arbj arbj;
            if ((arbj = arbo.d) == null) {
                arbj = arbj.a;
            }
            if (n >= arbj.c) {
                final arbj d = arbo.d;
                arbj a2;
                if (d == null) {
                    a2 = arbj.a;
                }
                else {
                    a2 = d;
                }
                final int c = a2.c;
                arbj a3 = d;
                if (d == null) {
                    a3 = arbj.a;
                }
                if (n <= c + a3.d) {
                    this.E(true);
                    arbj arbj2;
                    if ((arbj2 = arbo.d) == null) {
                        arbj2 = arbj.a;
                    }
                    return aezp.k((Object)Math.max(arbj2.c - 1, 0));
                }
            }
        }
        this.E(false);
        return (aezp)aeyo.a;
    }
    
    private final void C(final boolean b, final hah hah) {
        final ShortsRecordButtonView g = this.g;
        if (g == null) {
            return;
        }
        if (b) {
            g.setEnabled(true);
            final hjq e = hah.e;
            e.getClass();
            g.setOnTouchListener((View$OnTouchListener)e);
            return;
        }
        g.setEnabled(false);
        g.setOnTouchListener((View$OnTouchListener)gmn.c);
    }
    
    private final void D(final int n) {
        this.H.cG(xaa.c(n)).d();
    }
    
    private final void E(final boolean d) {
        if (this.f != null && this.D != d) {
            if (Build$VERSION.SDK_INT < 30) {
                this.f.performHapticFeedback(1);
            }
            else {
                this.f.performHapticFeedback(16);
            }
            this.D = d;
        }
    }
    
    private final void F(final boolean e) {
        this.p.tu((Object)e);
        this.E = e;
    }
    
    private final void G(final int progress) {
        this.a.W();
        final VoiceoverSeekBar f = this.f;
        if (f != null) {
            f.setProgress(progress);
            this.f.invalidate();
        }
        this.h(progress);
    }
    
    private final void H(final int n) {
        final hag y = this.y;
        y.getClass();
        String string;
        if (n == 0) {
            string = "";
        }
        else {
            final View t = this.t;
            t.getClass();
            string = t.getContext().getString(n);
        }
        if (string.equals(y.f)) {
            return;
        }
        if (y.c.isRunning()) {
            y.c.cancel();
        }
        y.b.setText((CharSequence)y.f);
        y.a.setText((CharSequence)string);
        y.f = string;
        final AnimatorSet c = y.c;
        if (y.e == null) {
            (y.e = (ValueAnimator)ObjectAnimator.ofFloat((Object)y.b, View.ALPHA, new float[] { 1.0f, 0.0f }).setDuration(300L)).addListener((Animator$AnimatorListener)new haf(y));
        }
        final ValueAnimator e = y.e;
        if (y.d == null) {
            y.d = (ValueAnimator)ObjectAnimator.ofFloat((Object)y.a, View.ALPHA, new float[] { 0.0f, 1.0f }).setDuration(300L);
        }
        c.playTogether(new Animator[] { (Animator)e, (Animator)y.d });
        y.c.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        y.c.start();
    }
    
    private final void I(final boolean b) {
        if (b) {
            final UndoRedoButtonView w = this.w;
            w.getClass();
            w.setVisibility(4);
            final UndoRedoButtonView x = this.x;
            x.getClass();
            x.setVisibility(4);
            return;
        }
        if (this.c.e()) {
            final UndoRedoButtonView w2 = this.w;
            w2.getClass();
            w2.a();
        }
        else {
            final UndoRedoButtonView w3 = this.w;
            w3.getClass();
            w3.b();
        }
        if (this.c.d()) {
            final UndoRedoButtonView x2 = this.x;
            x2.getClass();
            x2.a();
        }
        else {
            final UndoRedoButtonView x3 = this.x;
            x3.getClass();
            x3.b();
        }
        final VoiceoverSeekBar f = this.f;
        if (f != null) {
            f.invalidate();
        }
    }
    
    public final View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View viewById = layoutInflater.inflate(2131625757, viewGroup, false).findViewById(2131432402);
        viewById.setOnClickListener((View$OnClickListener)null);
        (this.v = viewById.findViewById(2131429275)).setOnClickListener((View$OnClickListener)this);
        (this.w = (UndoRedoButtonView)viewById.findViewById(2131432404)).c();
        this.w.setOnClickListener((View$OnClickListener)this);
        (this.x = (UndoRedoButtonView)viewById.findViewById(2131432401)).c();
        this.x.setOnClickListener((View$OnClickListener)this);
        this.y = new hag((TextView)viewById.findViewById(2131432400), (TextView)viewById.findViewById(2131432399));
        this.I(false);
        final VoiceoverSeekBar voiceoverSeekBar = (VoiceoverSeekBar)viewById.findViewById(2131432403);
        this.f = voiceoverSeekBar;
        final txz a = this.a;
        final afvt o = this.o;
        final uak c = this.c;
        final aeea h = this.H;
        voiceoverSeekBar.c = a;
        voiceoverSeekBar.d = (ScheduledExecutorService)o;
        voiceoverSeekBar.f = c;
        voiceoverSeekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)voiceoverSeekBar);
        voiceoverSeekBar.g = h;
        voiceoverSeekBar.setProgressDrawable(voiceoverSeekBar.getResources().getDrawable(2131233426, voiceoverSeekBar.getContext().getTheme()));
        voiceoverSeekBar.setThumb(voiceoverSeekBar.getResources().getDrawable(2131233427, voiceoverSeekBar.getContext().getTheme()));
        voiceoverSeekBar.setMax((int)a.I());
        if (a.ah()) {
            voiceoverSeekBar.a(true);
        }
        this.e.c(((ashi)this.f.a).ai().aI((asjm)new gyi(this, 14), (asjm)new gpg(16)));
        final asiq e = this.e;
        final VoiceoverSeekBar f = this.f;
        f.getClass();
        e.c(((ashi)f.b).ai().aH((asjm)new gyi(this, 12)));
        this.g = (ShortsRecordButtonView)viewById.findViewById(2131430794);
        return this.t = viewById;
    }
    
    public final afeq b() {
        return this.c.a();
    }
    
    public final asht c() {
        return (asht)this.p;
    }
    
    public final void d() {
        this.i = null;
        final VoiceoverSeekBar f = this.f;
        if (f != null) {
            f.e = null;
        }
    }
    
    public final void e() {
        final tyz a = this.A;
        if (a != null) {
            a.d();
        }
    }
    
    public final void f(long i) {
        final arbo j = this.i;
        long n = i;
        if (j != null) {
            arbj arbj;
            if ((arbj = j.d) == null) {
                arbj = arbj.a;
            }
            final long n2 = arbj.c + i;
            final aezp b = this.B((int)n2);
            Label_0186: {
                int n3;
                if (b.h()) {
                    i = (int)b.c();
                    arbj arbj2;
                    if ((arbj2 = j.d) == null) {
                        arbj2 = arbj.a;
                    }
                    n3 = arbj2.c;
                }
                else {
                    n = i;
                    if (this.a.I() <= 0L) {
                        break Label_0186;
                    }
                    n = i;
                    if (n2 <= this.a.I()) {
                        break Label_0186;
                    }
                    i = this.a.I();
                    arbj arbj3;
                    if ((arbj3 = j.d) == null) {
                        arbj3 = arbj.a;
                    }
                    n3 = arbj3.c;
                }
                n = i - n3;
            }
            final VoiceoverSeekBar f = this.f;
            f.getClass();
            arbj arbj4;
            if ((arbj4 = j.d) == null) {
                arbj4 = arbj.a;
            }
            f.setProgress((int)(arbj4.c + n + 1L));
        }
        if (j != null && n >= 300L) {
            final ahaz builder = ((ahbh)j).toBuilder();
            arbj arbj5;
            if ((arbj5 = j.d) == null) {
                arbj5 = arbj.a;
            }
            final ahaz builder2 = ((ahbh)arbj5).toBuilder();
            final int d = hcc.d(n);
            builder2.copyOnWrite();
            final arbj arbj6 = (arbj)builder2.instance;
            arbj6.b |= 0x2;
            arbj6.d = d;
            final arbj d2 = (arbj)builder2.build();
            builder.copyOnWrite();
            final arbo arbo = (arbo)builder.instance;
            d2.getClass();
            arbo.d = d2;
            arbo.b |= 0x2;
            final arbo arbo2 = (arbo)builder.build();
            final uak c = this.c;
            final ArrayList list = new ArrayList((Collection<?>)c.c);
            if (!Collection$_EL.stream((Collection)list).anyMatch((Predicate)new law(arbo2, 11))) {
                list.add((Object)arbo2);
                c.c((List)list);
                c.b();
            }
            this.l = true;
        }
        this.d();
        this.I(false);
    }
    
    public final void g() {
        final VoiceoverSeekBar f = this.f;
        if (f != null) {
            f.a(false);
        }
        this.u = null;
        this.e.b();
    }
    
    public final void h(final int n) {
        final ShortsRecordButtonView g = this.g;
        final hah h = this.h;
        if (g == null) {
            return;
        }
        if (h == null) {
            return;
        }
        final gbx c = this.C;
        if (c != null) {
            this.q.l((acwd)c);
        }
        final ShortsPlayerView z = this.z;
        z.getClass();
        z.c(false);
        if (this.B(n).h()) {
            this.H(2132019809);
            this.C(false, h);
            return;
        }
        if (h.c) {
            this.H(0);
            this.C(true, h);
            return;
        }
        if (this.a.I() - n < 300L) {
            this.H(2132019807);
            this.C(false, h);
            return;
        }
        this.H(2132019808);
        this.C(true, h);
    }
    
    public final void i(final aezp aezp, final String s) {
        this.u(false);
        final hah h = this.h;
        h.getClass();
        h.d = false;
        h.f();
        h.c = false;
        this.d();
        if (!this.w()) {
            if (this.r.a() == gkv.b) {
                final gbv d = gbx.d();
                d.c(-2);
                final View t = this.t;
                t.getClass();
                d.k((CharSequence)t.getContext().getString(2132018038));
                final View t2 = this.t;
                t2.getClass();
                ((acwc)d).m((CharSequence)t2.getContext().getString(2132019521), (View$OnClickListener)new gcd(this, aezp, 10));
                final gbx a = d.a();
                this.C = a;
                final gbu q = this.q;
                a.getClass();
                q.n((acwd)a);
            }
            final ShortsPlayerView z = this.z;
            z.getClass();
            z.c(true);
        }
        A(s);
    }
    
    public final void j(final View view, final usn b) {
        this.A = tyz.c(view, (tyy)this);
        (this.u = view.findViewById(2131431492)).setVisibility(0);
        this.u.setOnClickListener((View$OnClickListener)this);
        (this.z = (ShortsPlayerView)view.findViewById(2131431478)).a();
        this.B = b;
    }
    
    public final void k() {
        if (this.A != null && !this.E) {
            return;
        }
        this.H.cD(xaa.b(159428)).a();
        final VoiceoverSeekBar f = this.f;
        if (f != null) {
            f.a(false);
        }
        if (this.b.J()) {
            this.t();
        }
        this.F(false);
        if (!this.a.ah()) {
            this.a.X();
        }
        final ShortsPlayerView z = this.z;
        if (z != null) {
            z.a();
        }
        final gbx c = this.C;
        if (c != null) {
            this.q.l((acwd)c);
        }
        final ual k = this.k;
        if (k != null) {
            final tye tye = (tye)k;
            if (tye.B) {
                final long j = tye.t.J();
                tye.n();
                tye.t.ab(j);
            }
        }
    }
    
    public final void l() {
        if (this.w()) {
            return;
        }
        this.m(this.a.ah());
        final ShortsRecordButtonView g = this.g;
        if (g != null) {
            g.c();
            final cyb f = this.F;
            if (this.G == null) {
                this.G = new pvh(this);
            }
            final pvh g2 = this.G;
            final aeea h = this.H;
            final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)((atke)f.a).a();
            scheduledExecutorService.getClass();
            g2.getClass();
            final hah h2 = new hah(scheduledExecutorService, (View)g, g2, h, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            this.h = h2;
            h2.e = new hjq((hjp)h2, h2.a, true, true);
            this.C(true, this.h);
        }
        this.F(true);
        this.x();
    }
    
    public final void m(final boolean b) {
        if (this.w()) {
            return;
        }
        if (b) {
            final VoiceoverSeekBar f = this.f;
            if (f != null) {
                f.setMax((int)this.a.I());
            }
            final VoiceoverSeekBar f2 = this.f;
            if (f2 != null) {
                f2.a(true);
            }
            final ShortsPlayerView z = this.z;
            if (z != null) {
                final tyj d = z.d;
                d.a();
                d.c.m(0.0f);
                d.c.setVisibility(0);
                d.c.e();
            }
        }
        else {
            final VoiceoverSeekBar f3 = this.f;
            if (f3 != null) {
                f3.a(false);
            }
            final ShortsPlayerView z2 = this.z;
            if (z2 != null) {
                final tyj d2 = z2.d;
                d2.a();
                d2.b.m(0.0f);
                d2.b.setVisibility(0);
                d2.b.e();
            }
        }
    }
    
    public final void n(final Bundle bundle) {
        final uak c = this.c;
        try {
            if (bundle.containsKey("REDO_VOICEOVER_SEGMENTS_KEY")) {
                final List ay = adyf.ay(bundle, "REDO_VOICEOVER_SEGMENTS_KEY", (MessageLite)arbo.a, ExtensionRegistryLite.getGeneratedRegistry());
                ((Collection)c.d).clear();
                ((Collection<Object>)c.d).addAll(ay);
            }
        }
        catch (final ahca ahca) {
            ttr.o("VoiceoverState.", "restoreStateFromBundle of redoVoiceoverSegments error", (Throwable)ahca);
        }
        if (c.e != null) {
            return;
        }
        try {
            if (bundle.containsKey("VOICEOVER_SEGMENTS_KEY")) {
                c.c(adyf.ay(bundle, "VOICEOVER_SEGMENTS_KEY", (MessageLite)arbo.a, ExtensionRegistryLite.getGeneratedRegistry()));
            }
        }
        catch (final ahca ahca2) {
            ttr.o("VoiceoverState.", "restoreStateFromBundle of voiceoverSegments error", (Throwable)ahca2);
        }
    }
    
    public final void o(final Bundle bundle) {
        adyf.aB(bundle, "VOICEOVER_SEGMENTS_KEY", (List)this.c.a());
        adyf.aB(bundle, "REDO_VOICEOVER_SEGMENTS_KEY", (List)afeq.o((Collection)this.c.d));
    }
    
    public final void onClick(final View view) {
        if (view == this.u) {
            final tyz a = this.A;
            if (a != null) {
                a.e();
            }
            final twx cd = this.H.cD(xaa.b(159428));
            cd.a = null;
            cd.b = (ahbh)aeea.cE(this.s, aiqj.a, 159426);
            cd.b();
            final twx cg = this.H.cG(xaa.c(159424));
            cg.k(true);
            cg.c();
            final twx cg2 = this.H.cG(xaa.c(147678));
            cg2.k(true);
            cg2.c();
            final twx cg3 = this.H.cG(xaa.c(159425));
            cg3.k(true);
            cg3.c();
            final twx cg4 = this.H.cG(xaa.c(159427));
            cg4.k(true);
            cg4.c();
            return;
        }
        if (view == this.v) {
            final tyz a2 = this.A;
            if (a2 != null) {
                a2.d();
            }
            final ShortsPlayerView z = this.z;
            if (z != null) {
                z.a();
            }
        }
        else if (view == this.w) {
            if (!this.c.f()) {
                ttr.l("VoiceoverViewCtrlImpl.voiceover segment is empty while undo.");
                return;
            }
            arbj arbj;
            if ((arbj = ((Deque<arbo>)this.c.c).getLast().d) == null) {
                arbj = arbj.a;
            }
            final int c = arbj.c;
            final uak c2 = this.c;
            if (c2.e()) {
                ((Deque<arbo>)c2.d).push((arbo)((Deque<Object>)c2.c).removeLast());
                c2.b();
            }
            this.G(c);
            this.I(false);
            final ual k = this.k;
            if (k != null) {
                this.b();
                k.p((long)c);
            }
            this.l = false;
            this.D(159427);
        }
        else if (view == this.x) {
            final uak c3 = this.c;
            if (c3.d()) {
                ((Deque<arbo>)c3.c).addLast((arbo)((Deque<Object>)c3.d).pop());
                c3.b();
            }
            if (!this.c.f()) {
                ttr.l("VoiceoverViewCtrlImpl.voiceover segment is empty while after redo.");
                return;
            }
            final arbo arbo = ((Deque<arbo>)this.c.c).getLast();
            arbj arbj2;
            if ((arbj2 = arbo.d) == null) {
                arbj2 = arbj.a;
            }
            final int c4 = arbj2.c;
            arbj arbj3;
            if ((arbj3 = arbo.d) == null) {
                arbj3 = arbj.a;
            }
            this.G(c4 + arbj3.d + 1);
            this.I(false);
            this.l = true;
            this.D(159425);
        }
    }
    
    public final void p(final MotionEvent motionEvent) {
        if (this.w()) {
            return;
        }
        if (motionEvent.getAction() == 1) {
            if (this.a.ah()) {
                this.a.W();
                if (this.b.J()) {
                    final ShortsRecordButtonView g = this.g;
                    g.getClass();
                    g.h();
                    final hah h = this.h;
                    h.getClass();
                    h.g();
                    this.t();
                }
            }
            else {
                this.a.X();
            }
        }
    }
    
    public final void q() {
        this.k = null;
    }
    
    public final void r(final ual k) {
        this.k = k;
    }
    
    public final void s(final uca e) {
        final uak c = this.c;
        c.e = e;
        c.c((List)e.f);
    }
    
    public final void t() {
        this.u(false);
        final ListenableFuture j = this.j;
        if (j != null && !j.isDone()) {
            j.cancel(false);
        }
        else {
            final hah h = this.h;
            h.getClass();
            h.d = true;
        }
        this.a.W();
        final aun d = this.d;
        final uaj b = this.b;
        b.I();
        final ListenableFuture e = b.e;
        ListenableFuture listenableFuture;
        if (e == null) {
            listenableFuture = afwm.l((Throwable)new IllegalStateException("recording is not started"));
        }
        else {
            if (!e.isDone()) {
                b.H();
            }
            listenableFuture = b.e;
            listenableFuture.getClass();
        }
        teu.n(d, listenableFuture, (ttg)new hai(this, 1), (ttg)new hai(this, 0));
    }
    
    public final void u(final boolean b) {
        if (b) {
            final ShortsRecordButtonView g = this.g;
            g.getClass();
            g.g();
            final VoiceoverSeekBar f = this.f;
            f.getClass();
            f.setEnabled(false);
        }
        else {
            final ShortsRecordButtonView g2 = this.g;
            g2.getClass();
            g2.h();
            final VoiceoverSeekBar f2 = this.f;
            f2.getClass();
            f2.setEnabled(true);
        }
        this.I(b);
    }
    
    public final boolean v() {
        return this.c.f();
    }
    
    public final boolean w() {
        final tyz a = this.A;
        return a == null || a.f();
    }
    
    public final boolean x() {
        final View t = this.t;
        t.getClass();
        if (td.c(t.getContext(), "android.permission.RECORD_AUDIO") != 0) {
            ttr.l("VoiceoverViewCtrlImpl.No microphone permission for voiceover recording.");
            final usn b = this.B;
            if (b != null) {
                b.c();
            }
            return true;
        }
        return false;
    }
    
    public final void y() {
    }
    
    public final void z() {
    }
}
