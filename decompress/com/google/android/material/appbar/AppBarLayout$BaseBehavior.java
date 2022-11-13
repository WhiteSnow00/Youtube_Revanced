// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.animation.Interpolator;
import android.graphics.Rect;
import android.view.View$BaseSavedState;
import android.view.View$MeasureSpec;
import android.view.View$OnKeyListener;
import android.view.View$OnUnhandledKeyEventListener;
import android.os.Build$VERSION;
import androidx.customview.view.AbsSavedState;
import android.os.Parcelable;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.widget.ScrollView;
import android.widget.ListView;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.KeyEvent;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.animation.ValueAnimator;

public class AppBarLayout$BaseBehavior extends adsx
{
    public int a;
    public boolean b;
    public afhd c;
    private int e;
    private ValueAnimator f;
    private AppBarLayout$BaseBehavior$SavedState g;
    private WeakReference h;
    
    public AppBarLayout$BaseBehavior() {
    }
    
    public AppBarLayout$BaseBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public static final void E(final KeyEvent keyEvent, final View view, final AppBarLayout appBarLayout) {
        if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
            final int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.l(false);
                }
            }
            else {
                final double n = view.getScrollY();
                final double n2 = view.getMeasuredHeight();
                Double.isNaN(n2);
                if (n < n2 * 0.1) {
                    appBarLayout.l(true);
                }
            }
        }
    }
    
    private final void K(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout) {
        final int n = appBarLayout.f() + appBarLayout.getPaddingTop();
        final int n2 = this.y() - n;
        while (true) {
            for (int childCount = appBarLayout.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = appBarLayout.getChildAt(i);
                final int top = child.getTop();
                final int bottom = child.getBottom();
                final adsq adsq = (adsq)child.getLayoutParams();
                int n3 = top;
                int n4 = bottom;
                if (M(adsq.a, 32)) {
                    n3 = top - adsq.topMargin;
                    n4 = bottom + adsq.bottomMargin;
                }
                final int n5 = -n2;
                if (n3 <= n5 && n4 >= n5) {
                    if (i >= 0) {
                        final View child2 = appBarLayout.getChildAt(i);
                        final adsq adsq2 = (adsq)child2.getLayoutParams();
                        final int a = adsq2.a;
                        if ((a & 0x11) == 0x11) {
                            final int n6 = -child2.getTop();
                            final int n7 = -child2.getBottom();
                            int n8 = n6;
                            if (i == 0) {
                                n8 = n6;
                                if (anb.ai((View)appBarLayout)) {
                                    n8 = n6;
                                    if (anb.ai(child2)) {
                                        n8 = n6 - appBarLayout.f();
                                    }
                                }
                            }
                            int n9;
                            int n10;
                            if (M(a, 2)) {
                                n9 = n7 + anb.g(child2);
                                n10 = n8;
                            }
                            else {
                                n10 = n8;
                                n9 = n7;
                                if (M(a, 5)) {
                                    n9 = anb.g(child2) + n7;
                                    if (n2 < n9) {
                                        n10 = n9;
                                        n9 = n7;
                                    }
                                    else {
                                        n10 = n8;
                                    }
                                }
                            }
                            int n11 = n10;
                            int n12 = n9;
                            if (M(a, 32)) {
                                n11 = n10 + adsq2.topMargin;
                                n12 = n9 - adsq2.bottomMargin;
                            }
                            if (n2 >= (n12 + n11) / 2) {
                                n12 = n11;
                            }
                            this.N(coordinatorLayout, appBarLayout, aei.t(n12 + n, -appBarLayout.g(), 0));
                        }
                    }
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    private final void L(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout) {
        anb.K((View)coordinatorLayout, aol.d.a());
        anb.K((View)coordinatorLayout, aol.e.a());
        if (appBarLayout.g() != 0) {
            final int childCount = coordinatorLayout.getChildCount();
            boolean b = false;
            int i = 0;
            while (true) {
                while (i < childCount) {
                    final View child = coordinatorLayout.getChildAt(i);
                    if (((aek)child.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior) {
                        if (child == null) {
                            return;
                        }
                        for (int childCount2 = appBarLayout.getChildCount(), j = 0; j < childCount2; ++j) {
                            if (((adsq)appBarLayout.getChildAt(j).getLayoutParams()).a != 0) {
                                if (anb.p((View)coordinatorLayout) == null) {
                                    anb.N((View)coordinatorLayout, (akw)new adsm(this));
                                }
                                final int y = this.y();
                                final int n = -appBarLayout.g();
                                final boolean b2 = true;
                                if (y != n) {
                                    P(coordinatorLayout, appBarLayout, aol.d, false);
                                    b = true;
                                }
                                if (this.y() != 0) {
                                    if (child.canScrollVertically(-1)) {
                                        final int n2 = -appBarLayout.c();
                                        if (n2 != 0) {
                                            anb.av((View)coordinatorLayout, aol.e, (apb)new adsn(this, coordinatorLayout, appBarLayout, child, n2));
                                            b = b2;
                                        }
                                    }
                                    else {
                                        P(coordinatorLayout, appBarLayout, aol.e, true);
                                        b = b2;
                                    }
                                }
                                this.b = b;
                                return;
                            }
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final View child = null;
                continue;
            }
        }
    }
    
    private static boolean M(final int n, final int n2) {
        return (n & n2) == n2;
    }
    
    private final void N(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final int n) {
        final int abs = Math.abs(this.y() - n);
        final float abs2 = Math.abs(0.0f);
        int n2;
        if (abs2 > 0.0f) {
            n2 = Math.round(abs / abs2 * 1000.0f) * 3;
        }
        else {
            n2 = (int)((abs / (float)appBarLayout.getHeight() + 1.0f) * 150.0f);
        }
        final int y = this.y();
        if (y == n) {
            final ValueAnimator f = this.f;
            if (f != null && f.isRunning()) {
                this.f.cancel();
            }
            return;
        }
        final ValueAnimator f2 = this.f;
        if (f2 == null) {
            (this.f = new ValueAnimator()).setInterpolator(adsf.e);
            this.f.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adzt(this, coordinatorLayout, appBarLayout, 1));
        }
        else {
            f2.cancel();
        }
        this.f.setDuration((long)Math.min(n2, 600));
        this.f.setIntValues(new int[] { y, n });
        this.f.start();
    }
    
    private static final View O(final CoordinatorLayout coordinatorLayout) {
        for (int childCount = coordinatorLayout.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = coordinatorLayout.getChildAt(i);
            if (child instanceof alq || child instanceof ListView || child instanceof ScrollView) {
                return child;
            }
        }
        return null;
    }
    
    private static final void P(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final aol aol, final boolean b) {
        anb.av((View)coordinatorLayout, aol, (apb)new adso(appBarLayout, b));
    }
    
    private static final void Q(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, int size, final boolean b) {
        final int abs = Math.abs(i);
        final int childCount = appBarLayout.getChildCount();
        final int n = 0;
        int n2 = 0;
        List list;
        View child;
        while (true) {
            list = null;
            if (n2 >= childCount) {
                child = null;
                break;
            }
            child = appBarLayout.getChildAt(n2);
            if (abs >= child.getTop() && abs <= child.getBottom()) {
                break;
            }
            ++n2;
        }
        boolean p5 = false;
        Label_0167: {
            if (child != null) {
                final int a = ((adsq)child.getLayoutParams()).a;
                if ((a & 0x1) != 0x0) {
                    final int g = anb.g(child);
                    p5 = true;
                    if (size > 0 && (a & 0xC) != 0x0) {
                        if (-i >= child.getBottom() - g - appBarLayout.f()) {
                            break Label_0167;
                        }
                    }
                    else if ((a & 0x2) != 0x0 && -i >= child.getBottom() - g - appBarLayout.f()) {
                        break Label_0167;
                    }
                }
            }
            p5 = false;
        }
        if (appBarLayout.d) {
            p5 = appBarLayout.p(O(coordinatorLayout));
        }
        final boolean o = appBarLayout.o(p5);
        Label_0306: {
            if (!b) {
                if (o) {
                    final ArrayList a2 = coordinatorLayout.e.a(appBarLayout);
                    List list2;
                    if (a2 == null) {
                        list2 = list;
                    }
                    else {
                        list2 = new ArrayList(a2);
                    }
                    List<Object> emptyList = list2;
                    if (list2 == null) {
                        emptyList = Collections.emptyList();
                    }
                    size = emptyList.size();
                    i = n;
                    while (i < size) {
                        final aei a3 = ((aek)emptyList.get(i).getLayoutParams()).a;
                        if (a3 instanceof AppBarLayout$ScrollingViewBehavior) {
                            if (((AppBarLayout$ScrollingViewBehavior)a3).g != 0) {
                                break Label_0306;
                            }
                            break;
                        }
                        else {
                            ++i;
                        }
                    }
                }
                return;
            }
        }
        appBarLayout.jumpDrawablesToCurrentState();
    }
    
    final AppBarLayout$BaseBehavior$SavedState A(final Parcelable parcelable, final AppBarLayout appBarLayout) {
        final int i = ((adta)this).I();
        final int childCount = appBarLayout.getChildCount();
        final boolean b = false;
        for (int j = 0; j < childCount; ++j) {
            final View child = appBarLayout.getChildAt(j);
            final int n = child.getBottom() + i;
            if (child.getTop() + i <= 0 && n >= 0) {
                Object c;
                if ((c = parcelable) == null) {
                    c = AbsSavedState.c;
                }
                final AppBarLayout$BaseBehavior$SavedState appBarLayout$BaseBehavior$SavedState = new AppBarLayout$BaseBehavior$SavedState((Parcelable)c);
                final boolean b2 = i == 0;
                appBarLayout$BaseBehavior$SavedState.b = b2;
                appBarLayout$BaseBehavior$SavedState.a = (!b2 && -i >= appBarLayout.g());
                appBarLayout$BaseBehavior$SavedState.e = j;
                boolean g = b;
                if (n == anb.g(child) + appBarLayout.f()) {
                    g = true;
                }
                appBarLayout$BaseBehavior$SavedState.g = g;
                appBarLayout$BaseBehavior$SavedState.f = n / (float)child.getHeight();
                return appBarLayout$BaseBehavior$SavedState;
            }
        }
        return null;
    }
    
    public final /* bridge */ void B(final CoordinatorLayout coordinatorLayout, final View view) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        this.K(coordinatorLayout, appBarLayout);
        if (appBarLayout.d) {
            appBarLayout.o(appBarLayout.p(O(coordinatorLayout)));
        }
    }
    
    final void C(final AppBarLayout$BaseBehavior$SavedState g, final boolean b) {
        if (this.g != null && !b) {
            return;
        }
        this.g = g;
    }
    
    public final /* bridge */ boolean D(View view) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        final afhd c = this.c;
        final boolean b = true;
        if (c != null) {
            final jye h = ((jyb)c.a).h;
            if (h.n && !h.y()) {
                return b;
            }
        }
        else {
            final WeakReference h2 = this.h;
            boolean b2 = b;
            if (h2 == null) {
                return b2;
            }
            view = (View)h2.get();
            if (view != null && view.isShown()) {
                b2 = b;
                if (!view.canScrollVertically(-1)) {
                    return b2;
                }
            }
        }
        return false;
    }
    
    public final void F(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final View view, final int n, final int[] array) {
        if (n != 0) {
            int n5;
            int n6;
            if (n < 0) {
                final int n2 = -appBarLayout.g();
                final int c = appBarLayout.c();
                final int n3 = n2;
                final int n4 = c + n2;
                n5 = n3;
                n6 = n4;
            }
            else {
                n5 = -appBarLayout.g();
                n6 = 0;
            }
            if (n5 != n6) {
                array[1] = this.G(coordinatorLayout, (View)appBarLayout, n, n5, n6);
            }
        }
        if (appBarLayout.d) {
            appBarLayout.o(appBarLayout.p(view));
        }
    }
    
    public final /* bridge */ boolean h(final CoordinatorLayout coordinatorLayout, final View view, int round) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        super.h(coordinatorLayout, (View)appBarLayout, round);
        final int b = appBarLayout.b;
        final AppBarLayout$BaseBehavior$SavedState g = this.g;
        if (g != null && (b & 0x8) == 0x0) {
            if (g.a) {
                this.H(coordinatorLayout, (View)appBarLayout, -appBarLayout.g());
            }
            else if (g.b) {
                this.H(coordinatorLayout, (View)appBarLayout, 0);
            }
            else {
                final View child = appBarLayout.getChildAt(g.e);
                final int n = -child.getBottom();
                if (this.g.g) {
                    round = anb.g(child) + appBarLayout.f();
                }
                else {
                    round = Math.round(child.getHeight() * this.g.f);
                }
                this.H(coordinatorLayout, (View)appBarLayout, n + round);
            }
        }
        else if (b != 0) {
            round = (b & 0x4);
            if ((b & 0x2) != 0x0) {
                final int n2 = -appBarLayout.g();
                if (round != 0) {
                    this.N(coordinatorLayout, appBarLayout, n2);
                }
                else {
                    this.H(coordinatorLayout, (View)appBarLayout, n2);
                }
            }
            else if ((b & 0x1) != 0x0) {
                if (round != 0) {
                    this.N(coordinatorLayout, appBarLayout, 0);
                }
                else {
                    this.H(coordinatorLayout, (View)appBarLayout, 0);
                }
            }
        }
        appBarLayout.b = 0;
        this.g = null;
        ((adta)this).J(aei.t(((adta)this).I(), -appBarLayout.g(), 0));
        Q(coordinatorLayout, appBarLayout, ((adta)this).I(), 0, true);
        appBarLayout.j(((adta)this).I());
        this.L(coordinatorLayout, appBarLayout);
        final View o = O(coordinatorLayout);
        if (o != null) {
            if (Build$VERSION.SDK_INT >= 28) {
                o.addOnUnhandledKeyEventListener((View$OnUnhandledKeyEventListener)new adsk(o, appBarLayout));
            }
            else {
                o.setOnKeyListener((View$OnKeyListener)new adsl(o, appBarLayout));
            }
        }
        return true;
    }
    
    public final /* bridge */ boolean l(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int n, final int e) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        boolean b2;
        final boolean b = b2 = false;
        Label_0060: {
            if ((n & 0x2) != 0x0) {
                if (!appBarLayout.d) {
                    b2 = b;
                    if (appBarLayout.g() == 0) {
                        break Label_0060;
                    }
                    b2 = b;
                    if (coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()) {
                        break Label_0060;
                    }
                }
                b2 = true;
            }
        }
        if (b2) {
            final ValueAnimator f = this.f;
            if (f != null) {
                f.cancel();
            }
        }
        this.h = null;
        this.e = e;
        return b2;
    }
    
    public final /* bridge */ boolean p(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        if (((aek)appBarLayout.getLayoutParams()).height == -2) {
            coordinatorLayout.n((View)appBarLayout, n, n2, View$MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }
        return false;
    }
    
    public final /* bridge */ void q(final View view, final Parcelable parcelable) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        if (parcelable instanceof AppBarLayout$BaseBehavior$SavedState) {
            this.C((AppBarLayout$BaseBehavior$SavedState)parcelable, true);
            final Parcelable d = this.g.d;
            return;
        }
        this.g = null;
    }
    
    public final /* bridge */ void qH(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        if (this.e == 0 || n == 1) {
            this.K(coordinatorLayout, appBarLayout);
            if (appBarLayout.d) {
                appBarLayout.o(appBarLayout.p(view2));
            }
        }
        this.h = new WeakReference((T)view2);
    }
    
    public final /* bridge */ Parcelable r(final View view) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        final android.view.AbsSavedState empty_STATE = View$BaseSavedState.EMPTY_STATE;
        final AppBarLayout$BaseBehavior$SavedState a = this.A((Parcelable)empty_STATE, appBarLayout);
        if (a == null) {
            return (Parcelable)empty_STATE;
        }
        return (Parcelable)a;
    }
    
    public final /* bridge */ void ss(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int[] array, final int n3) {
        this.F(coordinatorLayout, (AppBarLayout)view, view2, n2, array);
    }
    
    public final /* bridge */ void st(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        if (n4 < 0) {
            array[1] = this.G(coordinatorLayout, (View)appBarLayout, n4, -appBarLayout.d(), 0);
        }
        if (n4 == 0) {
            this.L(coordinatorLayout, appBarLayout);
        }
    }
    
    public final /* bridge */ int w(final View view) {
        return -((AppBarLayout)view).d();
    }
    
    public final int x(final View view) {
        return ((AppBarLayout)view).g();
    }
    
    public final int y() {
        return ((adta)this).I() + this.a;
    }
    
    public final /* bridge */ int z(final CoordinatorLayout coordinatorLayout, final View view, int i, int childCount, int t) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        final int y = this.y();
        final int n = 0;
        if (childCount != 0 && y >= childCount && y <= t) {
            t = aei.t(i, childCount, t);
            i = n;
            if (y != t) {
                Label_0272: {
                    if (appBarLayout.a) {
                        final int abs = Math.abs(t);
                        childCount = appBarLayout.getChildCount();
                        i = 0;
                        while (i < childCount) {
                            final View child = appBarLayout.getChildAt(i);
                            final adsq adsq = (adsq)child.getLayoutParams();
                            final Interpolator b = adsq.b;
                            if (abs >= child.getTop() && abs <= child.getBottom()) {
                                if (b == null) {
                                    break;
                                }
                                final int a = adsq.a;
                                if ((a & 0x1) != 0x0) {
                                    childCount = (i = child.getHeight() + adsq.topMargin + adsq.bottomMargin);
                                    if ((a & 0x2) != 0x0) {
                                        i = childCount - anb.g(child);
                                    }
                                }
                                else {
                                    i = 0;
                                }
                                childCount = i;
                                if (anb.ai(child)) {
                                    childCount = i - appBarLayout.f();
                                }
                                if (childCount > 0) {
                                    final float n2 = (float)(abs - child.getTop());
                                    final float n3 = (float)childCount;
                                    i = Math.round(n3 * b.getInterpolation(n2 / n3));
                                    i = Integer.signum(t) * (child.getTop() + i);
                                    break Label_0272;
                                }
                                break;
                            }
                            else {
                                ++i;
                            }
                        }
                    }
                    i = t;
                }
                final boolean j = ((adta)this).J(i);
                this.a = t - i;
                childCount = 1;
                if (j) {
                    adsq adsq2;
                    aekp c;
                    View child2;
                    float n4;
                    Rect rect;
                    float n5;
                    float u;
                    float n6;
                    float n7;
                    float n8;
                    float translationY;
                    for (i = 0; i < appBarLayout.getChildCount(); ++i) {
                        adsq2 = (adsq)appBarLayout.getChildAt(i).getLayoutParams();
                        c = adsq2.c;
                        if (c != null && (adsq2.a & 0x1) != 0x0) {
                            child2 = appBarLayout.getChildAt(i);
                            n4 = (float)((adta)this).I();
                            rect = (Rect)c.a;
                            child2.getDrawingRect(rect);
                            appBarLayout.offsetDescendantRectToMyCoords(child2, rect);
                            rect.offset(0, -appBarLayout.f());
                            n5 = ((Rect)c.a).top - Math.abs(n4);
                            if (n5 <= 0.0f) {
                                u = aei.u(Math.abs(n5 / ((Rect)c.a).height()), 1.0f);
                                n6 = -n5;
                                n7 = (float)((Rect)c.a).height();
                                n8 = 1.0f - u;
                                translationY = n6 - n7 * 0.3f * (1.0f - n8 * n8);
                                child2.setTranslationY(translationY);
                                child2.getDrawingRect((Rect)c.b);
                                ((Rect)c.b).offset(0, (int)(-translationY));
                                anb.T(child2, (Rect)c.b);
                            }
                            else {
                                anb.T(child2, null);
                                child2.setTranslationY(0.0f);
                            }
                        }
                    }
                }
                else if (appBarLayout.a) {
                    coordinatorLayout.c((View)appBarLayout);
                }
                appBarLayout.j(((adta)this).I());
                i = childCount;
                if (t < y) {
                    i = -1;
                }
                Q(coordinatorLayout, appBarLayout, t, i, false);
                i = y - t;
            }
        }
        else {
            this.a = 0;
            i = n;
        }
        this.L(coordinatorLayout, appBarLayout);
        return i;
    }
}
