// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.widget.FrameLayout$LayoutParams;
import android.view.View$AccessibilityDelegate;
import android.view.MotionEvent;
import android.os.Handler;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import androidx.cardview.widget.CardView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.DisplayMetrics;
import android.view.View$OnLayoutChangeListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.Animator$AnimatorListener;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.Animator;
import android.view.View;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import j$.util.Optional;
import android.widget.FrameLayout;

public class BottomUiContainer extends FrameLayout
{
    public int a;
    public int b;
    public int c;
    public Optional d;
    public Optional e;
    public Optional f;
    public gba g;
    public Snackbar h;
    public Mealbar i;
    public View j;
    public View k;
    public Animator l;
    public aqi m;
    public ark n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public final Object t;
    public hft u;
    private HatsContainer v;
    private Runnable w;
    private boolean x;
    private int y;
    private pvh z;
    
    public BottomUiContainer(final Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.o = 0;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = 0;
        this.t = new Object();
        this.x();
    }
    
    public BottomUiContainer(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.o = 0;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = 0;
        this.t = new Object();
        this.x();
    }
    
    public BottomUiContainer(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.o = 0;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = 0;
        this.t = new Object();
        this.x();
    }
    
    public BottomUiContainer(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.o = 0;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = 0;
        this.t = new Object();
        this.x();
    }
    
    public static hft p(final acvo acvo, final Object o) {
        return new hft(acvo, o);
    }
    
    private static int t(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)viewGroup$LayoutParams;
            return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
        }
        return 0;
    }
    
    private final Optional u() {
        for (Context context = this.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return Optional.of((Object)context);
            }
        }
        return Optional.empty();
    }
    
    private final void v(final Animator animator) {
        if (this.x) {
            animator.start();
            return;
        }
        animator.end();
    }
    
    private final void w(final Animator animator, final View view) {
        final int t = t(view.getLayoutParams());
        animator.addListener((Animator$AnimatorListener)new gaw(this, view, t));
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator)animator).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new gaq(this, view, t));
        }
    }
    
    private final void x() {
        this.y = this.getVisibility();
        this.x = true;
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.a = tpe.aZ(displayMetrics, 528);
        this.b = tpe.aZ(displayMetrics, 300);
        this.c = tpe.aZ(displayMetrics, 400);
        final View rootView = this.getRootView();
        if (rootView != null) {
            rootView.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fti(this, 4));
        }
    }
    
    private final boolean y() {
        return this.u().isPresent();
    }
    
    public final float a(final View view, int n) {
        if (this.q) {
            n = this.o - n;
        }
        else {
            n -= this.o;
        }
        return 1.0f - n / (float)view.getHeight();
    }
    
    public final int b(final View view) {
        return this.c(view, t(view.getLayoutParams()));
    }
    
    public final int c(final View view, final int n) {
        final int height = view.getHeight();
        float n2;
        if (this.q) {
            n2 = this.o - view.getTop() - view.getTranslationY();
        }
        else {
            n2 = view.getTop() - this.o + view.getTranslationY();
        }
        final float n3 = (float)height;
        final float n4 = (float)Math.min(height, 1);
        final float n5 = (float)n;
        final float n6 = n3 - n2;
        return aei.t((int)(n6 + n5 * aei.u(n6 / n4, 1.0f)), 0, height + n);
    }
    
    public final View d(final int n) {
        return this.e(this.getContext(), n);
    }
    
    public final View e(final Context context, final int n) {
        return LayoutInflater.from(context).inflate(n, (ViewGroup)this, false);
    }
    
    public final ark f(final View view, final float g) {
        final ark ark = new ark(new arj());
        final arl n = new arl(0.0f);
        n.c();
        n.e(1500.0f);
        ark.n = n;
        ark.g((float)view.getTop());
        ark.g = g;
        ark.f((arf)new gas(this, view, 1));
        ark.f((arf)new gas(this, view, 0));
        return ark;
    }
    
    public final HatsContainer g() {
        if (this.v == null) {
            this.v = (HatsContainer)this.d(2131624513);
            if (this.d.isPresent() && ((vai)this.d.get()).aU()) {
                final HatsContainer v = this.v;
                ((CardView)v.findViewById(2131428027)).d(tpe.cr(v.getContext(), 2130970893));
            }
        }
        return this.v;
    }
    
    public final void h(final View view) {
        final PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[] { 0.0f, 1.0f });
        int height;
        if (this.q) {
            height = -view.getHeight();
        }
        else {
            height = view.getHeight();
        }
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { ofFloat, PropertyValuesHolder.ofFloat("translationY", new float[] { (float)height, 0.0f }) });
        ofPropertyValuesHolder.setInterpolator((TimeInterpolator)acvc.a);
        ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new gax(view));
        this.w((Animator)ofPropertyValuesHolder, view);
        this.v((Animator)ofPropertyValuesHolder);
        final hft u = this.u;
        if (u != null) {
            u.d();
        }
    }
    
    public final void i() {
        final Optional u = this.u();
        if (this.y() && u.isPresent()) {
            final AccessibilityLayerLayout q = fbu.q((Activity)u.get());
            if (q != null) {
                q.e = null;
            }
        }
    }
    
    public final void j(int height) {
        final View j = this.j;
        if (j != null) {
            if (j != this.k) {
                int n;
                if ((n = height) == 2) {
                    synchronized (this.t) {
                        if (this.s == 1) {
                            this.s = 2;
                            return;
                        }
                        this.s = 0;
                        monitorexit(this.t);
                        n = 2;
                    }
                }
                final aqi m = this.m;
                if (m != null) {
                    m.d();
                }
                final hft u = this.u;
                if (u != null) {
                    u.c(n);
                }
                final ark n2 = this.n;
                if (n2 != null) {
                    n2.i();
                }
                final Animator l = this.l;
                if (l != null) {
                    l.cancel();
                }
                final View i = this.j;
                final PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[] { 1.0f, 0.0f });
                if (this.q) {
                    height = -i.getHeight();
                }
                else {
                    height = i.getHeight();
                }
                final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)i, new PropertyValuesHolder[] { ofFloat, PropertyValuesHolder.ofFloat("translationY", new float[] { 0.0f, (float)height }) });
                ofPropertyValuesHolder.setInterpolator((TimeInterpolator)acvc.a);
                ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new gay(i));
                this.w((Animator)ofPropertyValuesHolder, i);
                (this.l = (Animator)ofPropertyValuesHolder).addListener((Animator$AnimatorListener)new gav(this));
                this.v(this.l);
            }
        }
    }
    
    public final void k(final int n) {
        final gba g = this.g;
        if (g != null && !this.q) {
            if (this.r != 1) {
                final lju lju = (lju)g;
                lju.G.v(fxz.b, n);
                lju.j.i(fxz.b, n);
            }
        }
    }
    
    public final void l(final float n) {
        final View j = this.j;
        if (j != null) {
            if (j != this.k) {
                final ark n2 = this.n;
                if (n2 != null) {
                    n2.i();
                }
                final Animator l = this.l;
                if (l != null) {
                    l.cancel();
                }
                final ark f = this.f(this.j, n);
                f.e((are)new gar(this, 1));
                (this.n = f).h((float)this.o);
            }
        }
    }
    
    public final void m(final Context context) {
        this.f = Optional.of((Object)context);
    }
    
    public final void n(final boolean x) {
        this.x = x;
        this.setVisibility(this.y);
    }
    
    public final void o(final Snackbar snackbar) {
        if (!this.d.isEmpty()) {
            if (((vai)this.d.get()).aU()) {
                final Drawable a = agx.a(this.getContext(), 2131233293);
                if (a == null) {
                    return;
                }
                a.setTint(tpe.cr((Context)this.f.get(), 2130970867));
                snackbar.setBackground(a);
            }
        }
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = aqi.c((ViewGroup)this, 1.0f, (aqh)new gbb(this));
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        if (this.w == null) {
            this.w = (Runnable)new eym(this, 17);
        }
        final Handler handler = this.getHandler();
        if (handler == null) {
            return;
        }
        handler.post(this.w);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.j != null) {
            return this.m.k(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final View j = this.j;
        if (j != null) {
            this.o = j.getTop();
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.m.f(motionEvent);
        final int action = motionEvent.getAction();
        if (action != 0) {
            return action != 1 && action != 3;
        }
        final View j = this.j;
        return j != null && this.m.i(j, (int)motionEvent.getX(), (int)motionEvent.getY());
    }
    
    public final void q(final View j, final hft u) {
        this.removeAllViews();
        this.j = j;
        this.u = u;
        final Animator l = this.l;
        if (l != null) {
            l.cancel();
            this.l = null;
        }
        final ark n = this.n;
        if (n != null) {
            n.i();
            this.n = null;
        }
        if (j != null) {
            this.addView(j);
            if (j.getLayoutDirection() != this.getLayoutDirection()) {
                j.setLayoutDirection(this.getLayoutDirection());
            }
            final Optional u2 = this.u();
            if (this.y() && u2.isPresent()) {
                final AccessibilityLayerLayout q = fbu.q((Activity)u2.get());
                if (q != null && tpe.z((View)q, (View)this)) {
                    q.e = (View)this;
                }
            }
            this.setVisibility(0);
            return;
        }
        this.i();
        this.setVisibility(8);
    }
    
    public final void r(final gbd gbd, final gbe gbe, final hft hft) {
        this.j(4);
        final Animator l = this.l;
        if (l == null) {
            this.s(gbd, gbe, hft);
            return;
        }
        l.addListener((Animator$AnimatorListener)new gat(this, gbd, gbe, hft, (byte[])null, (byte[])null));
    }
    
    public final void s(final gbd gbd, final gbe gbe, final hft hft) {
        if (this.z == null) {
            this.z = new pvh(this);
        }
        final View a = gbe.a(gbd, this.z);
        a.setClickable(true);
        if ((this.r = gbd.a()) == 1) {
            a.setAccessibilityDelegate((View$AccessibilityDelegate)new gau(this));
        }
        if (this.e.isPresent()) {
            final fzw fzw = (fzw)this.e.get();
            final boolean b = ((ghb)((hzn)fzw.a).a).f() instanceof hpo || ((cyb)fzw.b).j();
            final int a2 = gbd.a();
            int n;
            if (!(this.q = (b && a2 == 1))) {
                n = 80;
            }
            else {
                n = 48;
            }
            tpe.aF(a, tpe.as(n | 0x800003), (Class)FrameLayout$LayoutParams.class);
        }
        this.q(a, hft);
        if (a.getHeight() == 0) {
            a.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fti(this, 5, (byte[])null));
            a.setVisibility(0);
            return;
        }
        this.h(a);
    }
    
    public final void setVisibility(int n) {
        this.y = n;
        if (!this.x) {
            n = 8;
        }
        super.setVisibility(n);
    }
}
