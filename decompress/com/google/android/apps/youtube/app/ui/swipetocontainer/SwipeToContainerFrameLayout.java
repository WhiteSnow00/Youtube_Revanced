// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.swipetocontainer;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.content.SharedPreferences;
import android.animation.Animator$AnimatorListener;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ObjectAnimator;
import android.view.View;
import android.graphics.Rect;

public class SwipeToContainerFrameLayout extends kqy
{
    public ashe a;
    public arhr b;
    public int c;
    public int d;
    public tnz e;
    public krd f;
    public final Rect g;
    public boolean h;
    public boolean i;
    public uyf j;
    public uyi k;
    private int l;
    private final asib m;
    private View n;
    private View o;
    private ObjectAnimator p;
    private ObjectAnimator q;
    private kre r;
    private float s;
    private float t;
    
    public SwipeToContainerFrameLayout(final Context context) {
        super(context);
        this.c = 0;
        this.m = new asib();
        this.g = new Rect();
        this.l(context, null);
    }
    
    public SwipeToContainerFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0;
        this.m = new asib();
        this.g = new Rect();
        this.l(context, set);
    }
    
    public SwipeToContainerFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = 0;
        this.m = new asib();
        this.g = new Rect();
        this.l(context, set);
    }
    
    public SwipeToContainerFrameLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.c = 0;
        this.m = new asib();
        this.g = new Rect();
        this.l(context, set);
    }
    
    private final float g() {
        return this.n.getMeasuredWidth() - (this.getLeft() - this.n.getX());
    }
    
    private final float h() {
        return Math.abs(this.n.getX());
    }
    
    private final void i() {
        final ObjectAnimator p = this.p;
        if (p != null) {
            p.cancel();
        }
        final ObjectAnimator q = this.q;
        if (q != null) {
            q.cancel();
        }
    }
    
    private final void j(final long n) {
        final kre r = this.r;
        r.a = this.n;
        r.b = 0;
        this.q.addListener((Animator$AnimatorListener)r);
        this.q.setDuration(n);
        this.q.setFloatValues(new float[] { (float)(-this.getRight()) });
        this.p.setDuration(n);
        this.p.setFloatValues(new float[] { 0.0f });
        this.q.start();
        this.p.start();
        final krd f = this.f;
        if (f != null) {
            f.r(this.d, 0.0f);
        }
    }
    
    private final void k(final long n) {
        final kre r = this.r;
        r.a = this.o;
        r.b = 1;
        this.p.addListener((Animator$AnimatorListener)r);
        this.p.setDuration(n);
        this.p.setFloatValues(new float[] { (float)this.getRight() });
        this.q.setDuration(n);
        this.q.setFloatValues(new float[] { 0.0f });
        this.q.start();
        this.p.start();
        final krd f = this.f;
        if (f != null) {
            f.r(this.d, 1.0f);
        }
    }
    
    private final void l(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, kqz.a);
        final boolean b = false;
        final boolean b2 = false;
        this.d = obtainStyledAttributes.getResourceId(0, 0);
        this.l = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        agot.v(this.d != 0, (Object)"containerViewId must be specified");
        agot.v(this.l != 0, (Object)"watchWhileRootViewId must be specified");
        boolean b3;
        if (!this.k.aJ()) {
            final SharedPreferences sharedPreferences = (SharedPreferences)this.b.a();
            final uyf j = this.j;
            b3 = b2;
            if (j != null) {
                b3 = b2;
                if (sharedPreferences != null) {
                    b3 = b2;
                    if (gkt.N(j)) {
                        b3 = b2;
                        if (sharedPreferences.getBoolean("enable_swipe_container", false)) {
                            b3 = true;
                        }
                    }
                }
            }
            this.h = b3;
        }
        else {
            final uyf i = this.j;
            b3 = b;
            if (i != null) {
                b3 = b;
                if (gkt.N(i)) {
                    b3 = true;
                }
            }
            this.h = b3;
        }
        if (b3) {
            this.e = new tnz(this.getContext());
            this.r = new kre(this);
        }
    }
    
    private final void m() {
        if (this.c == 2) {
            return;
        }
        this.c = 2;
        if (!q(this.n)) {
            this.n.setVisibility(0);
            this.n.bringToFront();
            this.n.setX((float)(-this.getRight()));
            this.t = this.n.getTranslationX();
        }
        if (!q(this.o)) {
            this.o.setVisibility(0);
        }
    }
    
    private final void n(final int n) {
        this.q.removeAllListeners();
        this.p.removeAllListeners();
        float n2;
        if (n != 1) {
            if (n != 2) {
                if (this.p()) {
                    n2 = this.h();
                }
                else {
                    n2 = this.g();
                }
            }
            else {
                n2 = this.g();
            }
        }
        else {
            n2 = this.h();
        }
        final int round = Math.round(Math.min(Math.max(n2 / this.getRight(), 0.0f), 1.0f) * 400.0f);
        int n3 = 0;
        Label_0103: {
            if (n != 2) {
                n3 = round;
                if (n != 1) {
                    break Label_0103;
                }
            }
            n3 = (int)(round * 0.8f);
        }
        final long n4 = n3;
        if (n != 0) {
            if (n != 1) {
                this.j(n4);
                return;
            }
            this.k(n4);
        }
        else {
            if (this.p()) {
                this.k(n4);
                return;
            }
            this.j(n4);
        }
    }
    
    private final boolean o() {
        if (this.n != null && this.o != null) {
            final krd f = this.f;
            if (f != null) {
                final krc krc = (krc)f;
                final boolean f2 = gej.f(krc.a.getResources().getConfiguration().orientation);
                final boolean b = krc.f.I() && krc.f.d() != null && "FEwhat_to_watch".equals(gej.k(krc.f.d().f()));
                final boolean b2 = krc.g.j() == fkk.a || krc.g.j() == fkk.j;
                boolean b3 = false;
                Label_0251: {
                    Label_0248: {
                        if (krc.n) {
                            final hhl q = krc.q;
                            if (q != null) {
                                final hhl hhl = (hhl)((hhk)q.ap).a;
                                if (hhl.ar()) {
                                    final br e = hhl.og().e(2131430844);
                                    if (!(e instanceof hid)) {
                                        if (!(e instanceof hhi)) {
                                            break Label_0248;
                                        }
                                        final hhi hhi = (hhi)e;
                                        if (!hhi.aY()) {
                                            if (hhi.al) {
                                                break Label_0248;
                                            }
                                        }
                                    }
                                }
                                b3 = true;
                                break Label_0251;
                            }
                        }
                    }
                    b3 = false;
                }
                if (krc.m != null && f2 && b && b2 && !b3 && !krc.s.d()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final boolean p() {
        return this.c == 2 && this.h() < this.getRight() / 2;
    }
    
    private static final boolean q(final View view) {
        return view != null && view.getVisibility() == 0;
    }
    
    public final boolean d() {
        if (this.c == 0) {
            return false;
        }
        this.m();
        this.n(2);
        return true;
    }
    
    public final boolean e() {
        if (!this.f() && this.o()) {
            this.m();
            this.n(1);
            return true;
        }
        return false;
    }
    
    public final boolean f() {
        final int c = this.c;
        boolean b = true;
        if (c != 1) {
            if (c == 2) {
                if (this.r.b != 1) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    protected final void onAttachedToWindow() {
        this.m.b();
        if (this.h) {
            this.m.c(this.a.aB((asix)new kca(this, 18)));
        }
        super.onAttachedToWindow();
    }
    
    protected final void onDetachedFromWindow() {
        this.m.b();
        super.onDetachedFromWindow();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.o()) {
            if (this.e != null) {
                final int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 6) {
                                    return false;
                                }
                                this.e.f(motionEvent);
                                return false;
                            }
                        }
                        else {
                            final int d = this.e.d(motionEvent, 3);
                            if (d != 1) {
                                if (d != 2) {
                                    if (d != 3) {
                                        if (d != 4) {
                                            return false;
                                        }
                                    }
                                    else {
                                        final int c = this.c;
                                        if (c == 1) {
                                            this.e.g();
                                            return false;
                                        }
                                        if (c == 2) {
                                            this.i();
                                        }
                                        return true;
                                    }
                                }
                                this.e.g();
                                return false;
                            }
                            final int c2 = this.c;
                            if (c2 == 0) {
                                this.e.g();
                                return false;
                            }
                            if (c2 == 2) {
                                this.i();
                            }
                            return true;
                        }
                    }
                    this.e.g();
                    this.s = 0.0f;
                    this.t = 0.0f;
                }
                else {
                    final Rect rect = new Rect(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
                    final Rect g = this.g;
                    if (!new Rect(rect.left + g.left, rect.top + g.top, rect.right - g.right, rect.bottom - g.bottom).contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                        return false;
                    }
                    this.e.h(motionEvent);
                    this.s = this.o.getTranslationX();
                    this.t = this.n.getTranslationX();
                }
            }
        }
        return false;
    }
    
    protected final void onLayout(final boolean b, int c, final int n, final int n2, final int n3) {
        super.onLayout(b, c, n, n2, n3);
        if (b) {
            final View o = this.o;
            if (o != null && this.n != null) {
                c = this.c;
                if (c != 0) {
                    if (c != 1) {
                        this.d();
                        return;
                    }
                    o.setTranslationX((float)this.getRight());
                    this.n.setTranslationX(0.0f);
                }
                else {
                    o.setTranslationX(0.0f);
                    this.n.setTranslationX((float)(-this.getRight()));
                }
            }
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SwipeToContainerFrameLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SwipeToContainerFrameLayout$SavedState swipeToContainerFrameLayout$SavedState = (SwipeToContainerFrameLayout$SavedState)parcelable;
        super.onRestoreInstanceState(swipeToContainerFrameLayout$SavedState.getSuperState());
        if (swipeToContainerFrameLayout$SavedState.a) {
            this.e();
            return;
        }
        this.d();
    }
    
    public final Parcelable onSaveInstanceState() {
        final SwipeToContainerFrameLayout$SavedState swipeToContainerFrameLayout$SavedState = new SwipeToContainerFrameLayout$SavedState(super.onSaveInstanceState());
        this.i();
        swipeToContainerFrameLayout$SavedState.a = this.f();
        return (Parcelable)swipeToContainerFrameLayout$SavedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.o()) {
            final tnz e = this.e;
            if (e != null) {
                e.e(motionEvent);
                this.m();
                final int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return true;
                        }
                    }
                    else {
                        final float n = (float)(-this.e.a(motionEvent));
                        if (n == 0.0f) {
                            return true;
                        }
                        final View o = this.o;
                        final int left = o.getLeft();
                        final int right = this.getRight();
                        final float n2 = this.s + n;
                        float x = (float)left;
                        if (n2 > x && n2 < (x = (float)right)) {
                            x = n2;
                        }
                        o.setX(x);
                        final View n3 = this.n;
                        final int left2 = this.getLeft();
                        final int right2 = this.getRight();
                        final float n4 = this.t + n;
                        float max;
                        if (n4 <= (max = (float)left2)) {
                            max = Math.max((float)(-right2), n4);
                        }
                        n3.setX(max);
                        final krd f = this.f;
                        if (f != null) {
                            final int d = this.d;
                            float n5;
                            if (this.c != 2) {
                                n5 = -1.0f;
                            }
                            else {
                                n5 = this.g() / this.getRight();
                            }
                            f.r(d, n5);
                            return true;
                        }
                        return true;
                    }
                }
                this.n(this.e.j(motionEvent, 2));
                this.e.g();
                return true;
            }
        }
        return false;
    }
    
    public final void onViewAdded(final View view) {
        super.onViewAdded(view);
        if (this.h) {
            if (view != null) {
                final int id = view.getId();
                if (this.d == id) {
                    (this.n = view).setVisibility(8);
                    this.q = ObjectAnimator.ofFloat((Object)this.n, "translationX", new float[] { 0.0f });
                    return;
                }
                if (this.l == id) {
                    this.o = view;
                    this.p = ObjectAnimator.ofFloat((Object)view, "translationX", new float[] { 0.0f });
                }
            }
        }
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if (this.h) {
            if (view != null) {
                final int id = view.getId();
                if (this.d == id) {
                    this.n = null;
                    this.q = null;
                    return;
                }
                if (this.l == id) {
                    this.o = null;
                    this.p = null;
                }
            }
        }
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        final tnz e = this.e;
        if (e != null) {
            e.g();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
}
