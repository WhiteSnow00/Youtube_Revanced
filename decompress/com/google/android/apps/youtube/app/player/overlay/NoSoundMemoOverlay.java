// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import android.text.Spanned;
import android.animation.AnimatorSet;
import android.content.Context;

public class NoSoundMemoOverlay extends abcq implements abqx, tio
{
    private static final long a;
    private final Context b;
    private final aslm c;
    private AnimatorSet d;
    private Spanned e;
    private TextView f;
    
    static {
        a = TimeUnit.SECONDS.toMillis(1L);
    }
    
    public NoSoundMemoOverlay(final Context b) {
        super(b);
        this.c = new aslm();
        this.b = b;
    }
    
    private static ObjectAnimator m(final TextView textView, final float n) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)textView, "alpha", new float[] { n });
        ofFloat.setInterpolator((TimeInterpolator)new fys());
        ofFloat.setDuration(300L);
        return ofFloat;
    }
    
    private static boolean n(final Spanned spanned) {
        return !TextUtils.isEmpty((CharSequence)spanned);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        final FrameLayout frameLayout = (FrameLayout)View.inflate(context, 2131624916, (ViewGroup)null);
        final TextView f = (TextView)frameLayout.findViewById(2131429859);
        this.f = f;
        final AnimatorSet d = new AnimatorSet();
        d.play((Animator)m(f, 0.0f)).after(NoSoundMemoOverlay.a).after((Animator)m(f, 1.0f));
        this.d = d;
        return (View)frameLayout;
    }
    
    public final void e(final Context context, final View view) {
        final TextView f = this.f;
        if (f == null) {
            return;
        }
        f.setText((CharSequence)this.e);
        this.l();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void k(final Spanned e) {
        if (!TextUtils.equals((CharSequence)this.e, (CharSequence)e)) {
            this.e = e;
            this.Y();
        }
        if (n(this.e)) {
            this.ow();
            return;
        }
        this.mk();
    }
    
    public final void l() {
        final AnimatorSet d = this.d;
        if (d != null && !d.isRunning()) {
            if (this.oW()) {
                this.d.start();
            }
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final asln[] lX(final abqz abqz) {
        return new asln[] { ((aske)abqz.p().b).an((asmi)new ixu(this, 1), (asmi)ixz.b) };
    }
    
    protected final abct mj(final Context context) {
        final abct mj = super.mj(context);
        mj.a = 0;
        mj.b = 0;
        return mj;
    }
    
    public final void mp(final aup aup) {
    }
    
    public final String mq() {
        return "player_overlay_no_sound_memo";
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.c.b();
        this.c.c(aske.m((askg)new ixv(this.b, 0), asjx.e).am((asmi)new ixu(this, 0)));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final boolean oW() {
        return n(this.e);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.c.b();
    }
}
