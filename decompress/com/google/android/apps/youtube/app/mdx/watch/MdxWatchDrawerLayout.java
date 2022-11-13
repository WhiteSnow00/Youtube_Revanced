// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.view.ViewStub;
import android.view.ViewGroup;
import java.util.Iterator;
import android.view.ViewParent;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import android.view.MotionEvent;
import java.util.concurrent.CopyOnWriteArraySet;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.View;
import j$.util.Optional;
import java.util.Set;
import android.view.View$OnClickListener;

public class MdxWatchDrawerLayout extends ibr implements View$OnClickListener, icm
{
    public final Set a;
    public icl b;
    public Optional c;
    public View d;
    public View e;
    public View f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final float n;
    private final float o;
    private final atjz p;
    private View q;
    private View r;
    private View s;
    private ImageView t;
    private boolean u;
    private Rect v;
    private Optional w;
    private Optional x;
    private Optional y;
    
    public MdxWatchDrawerLayout(final Context context) {
        this(context, null, 0);
    }
    
    public MdxWatchDrawerLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MdxWatchDrawerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new CopyOnWriteArraySet();
        this.p = ((atjz)atjm.e()).bc();
        this.u = true;
        this.v = new Rect();
        this.n = context.getResources().getDimension(2131167884);
        this.o = context.getResources().getDimension(2131167885);
        this.w = Optional.empty();
        this.x = Optional.empty();
        this.y = Optional.empty();
        this.c = Optional.empty();
    }
    
    private final void k(final float n) {
        if (this.d == null) {
            return;
        }
        final int i = this.i;
        final float n2 = (float)i;
        final float n3 = (float)(this.h - i);
        if (this.c.isPresent()) {
            final aqi aqi = (aqi)this.c.get();
            final View d = this.d;
            if (aqi.l(d, d.getLeft(), (int)(n2 + n * n3))) {
                anb.H((View)this);
            }
        }
    }
    
    private final boolean l(final MotionEvent motionEvent, final View view) {
        return view.getGlobalVisibleRect(this.v) && this.v.contains((int)motionEvent.getRawX(), (int)motionEvent.getRawY());
    }
    
    public final icv a() {
        return new icv(this.d());
    }
    
    public final asht b() {
        return (asht)this.p;
    }
    
    public final void c() {
        this.k(1.0f);
    }
    
    public final void computeScroll() {
        if (this.c.isPresent() && ((aqi)this.c.get()).n()) {
            anb.H((View)this);
        }
    }
    
    public final float d() {
        final int h = this.h;
        return (h - this.g) / (float)(h - this.i);
    }
    
    public final int e(final int n, final int n2) {
        return (int)(n - this.d() * (n - n2));
    }
    
    public final void f() {
        final View e = this.e;
        if (e != null) {
            final View s = this.s;
            if (s != null) {
                final ImageView t = this.t;
                if (t != null) {
                    final int measuredHeight = e.getMeasuredHeight();
                    final int n = this.h - measuredHeight;
                    final View e2 = this.e;
                    final int n2 = n + measuredHeight;
                    this.w = Optional.of((Object)new icp(e2, n, n2, 0.0f, 1.0f));
                    final int n3 = (int)(n - measuredHeight * 0.9f);
                    this.x = Optional.of((Object)new icp(s, n3, n3 + measuredHeight, 1.0f, 0.0f));
                    this.y = Optional.of((Object)new icq((View)t, n3, n2));
                }
            }
        }
    }
    
    public final void g(final boolean b) {
        final ViewParent parentForAccessibility = this.getParentForAccessibility();
        if (parentForAccessibility instanceof AccessibilityLayerLayout) {
            ((AccessibilityLayerLayout)parentForAccessibility).c(b);
        }
    }
    
    public final void h(int visibility, final boolean b) {
        if (b || visibility != this.g) {
            this.g = visibility;
            final int i = this.i;
            final int n = 0;
            this.m = (visibility == i);
            if (!this.w.isEmpty() && !this.x.isEmpty()) {
                final View e = this.e;
                if (e != null) {
                    final View q = this.q;
                    if (q != null) {
                        ((icp)this.w.get()).b(this.g);
                        ((icp)this.x.get()).b(this.g);
                        if (!this.m) {
                            visibility = 0;
                        }
                        else {
                            visibility = 4;
                        }
                        e.setVisibility(visibility);
                        final float d = this.d();
                        final float o = this.o;
                        final float n2 = this.n;
                        q.setMinimumHeight(Math.round(d * (o - n2) + n2));
                        if (this.f != null && this.t != null && !this.y.isEmpty()) {
                            final ImageView t = this.t;
                            final int g = this.g;
                            final int h = this.h;
                            final View f = this.f;
                            visibility = n;
                            if (g == h) {
                                visibility = 4;
                            }
                            f.setVisibility(visibility);
                            ((icq)this.y.get()).b(this.g);
                            if (this.m) {
                                t.setContentDescription(this.getResources().getText(2132018580));
                            }
                            else if (g == h) {
                                t.setContentDescription(this.getResources().getText(2132018514));
                            }
                        }
                    }
                }
            }
            if (!anb.an((View)this)) {
                this.requestLayout();
            }
            this.p.tu((Object)this.a());
            if (!this.a.isEmpty()) {
                for (final pvh pvh : this.a) {
                    final icv a = ((icm)this).a();
                    ((ick)pvh.a).g(a.a);
                    ((ick)pvh.a).f(a.a());
                }
            }
        }
    }
    
    public final void i() {
        final View e = this.e;
        if (e == null) {
            return;
        }
        final int h = this.getMeasuredHeight() - e.getMeasuredHeight() - this.j;
        if (this.h != h) {
            final int e2 = this.e(h, this.i);
            this.h = h;
            this.f();
            this.h(e2, false);
        }
    }
    
    protected final boolean j(final MotionEvent motionEvent) {
        final View e = this.e;
        final boolean b = true;
        if (e != null) {
            final boolean b2 = b;
            if (this.l(motionEvent, e)) {
                return b2;
            }
        }
        final View q = this.q;
        boolean b2;
        if (q != null) {
            if (!this.l(motionEvent, q)) {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    public final void onClick(final View view) {
        if (view != this.e && view != this.q) {
            return;
        }
        float n;
        if (this.g > (this.h - this.i) / 2) {
            n = 0.0f;
        }
        else {
            n = 1.0f;
        }
        this.k(n);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        anb.N((View)this, (akw)new icn(this));
        final Optional of = Optional.of((Object)aqi.c((ViewGroup)this, 10.0f, (aqh)new ico(this)));
        this.c = of;
        ((aqi)of.get()).g = this.getResources().getDisplayMetrics().density * 400.0f;
        final View viewById = this.findViewById(2131429753);
        viewById.getClass();
        this.d = viewById;
        final ViewStub viewStub = (ViewStub)this.findViewById(2131429758);
        viewStub.getClass();
        viewStub.setInflatedId(2131429760);
        viewStub.setLayoutResource(2131624799);
        final View inflate = viewStub.inflate();
        inflate.getClass();
        (this.e = inflate).setOnClickListener((View$OnClickListener)this);
        final View viewById2 = this.findViewById(2131429761);
        viewById2.getClass();
        this.f = viewById2;
        final View viewById3 = this.findViewById(2131429762);
        viewById3.getClass();
        (this.q = viewById3).setOnClickListener((View$OnClickListener)this);
        final View viewById4 = this.findViewById(2131429755);
        viewById4.getClass();
        this.r = viewById4;
        final View viewById5 = this.findViewById(2131429767);
        viewById5.getClass();
        this.s = viewById5;
        final ImageView t = (ImageView)this.findViewById(2131429882);
        t.getClass();
        this.t = t;
        final Drawable a = agx.a(this.getContext(), 2131233695);
        if (a != null) {
            a.mutate();
            a.setColorFilter(tpe.cr(this.getContext(), 2130970924), PorterDuff$Mode.SRC_ATOP);
            t.setImageDrawable(a);
        }
        this.p.tu((Object)this.a());
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.c.isEmpty()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return (this.j(motionEvent) && ((aqi)this.c.get()).k(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
        }
        ((aqi)this.c.get()).d();
        return false;
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final View d = this.d;
        if (d == null) {
            return;
        }
        final int g = this.g;
        final int measuredHeight = d.getMeasuredHeight();
        final int j = this.j;
        if (this.u) {
            this.h(this.h, true);
            this.u = false;
            if (!this.m && tsy.e(this.getContext())) {
                this.g(true);
            }
        }
        d.layout(n, this.g, n3, g + measuredHeight + j);
        final View r = this.r;
        if (r != null) {
            r.layout(n, n2, n3, n4);
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.i();
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        final MdxWatchDrawerLayout$SavedState mdxWatchDrawerLayout$SavedState = (MdxWatchDrawerLayout$SavedState)parcelable;
        super.onRestoreInstanceState(mdxWatchDrawerLayout$SavedState.getSuperState());
        final boolean a = mdxWatchDrawerLayout$SavedState.a;
        this.m = a;
        int g;
        if (a) {
            g = this.i;
        }
        else {
            g = this.h;
        }
        this.g = g;
    }
    
    protected final Parcelable onSaveInstanceState() {
        final Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        final MdxWatchDrawerLayout$SavedState mdxWatchDrawerLayout$SavedState = new MdxWatchDrawerLayout$SavedState(onSaveInstanceState);
        mdxWatchDrawerLayout$SavedState.a = this.m;
        return (Parcelable)mdxWatchDrawerLayout$SavedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.c.isEmpty()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.k && !this.j(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        ((aqi)this.c.get()).f(motionEvent);
        return true;
    }
}
