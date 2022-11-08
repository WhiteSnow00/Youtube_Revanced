// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.widget;

import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;

public class NestedScrollView extends FrameLayout implements als, alp
{
    private static final float d;
    private static final apl e;
    private static final int[] f;
    private NestedScrollView$SavedState A;
    private final alu B;
    private final alq C;
    private float D;
    public EdgeEffect a;
    public EdgeEffect b;
    public apn c;
    private final float g;
    private long h;
    private final Rect i;
    private OverScroller j;
    private int k;
    private boolean l;
    private boolean m;
    private View n;
    private boolean o;
    private VelocityTracker p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private final int[] w;
    private final int[] x;
    private int y;
    private int z;
    
    static {
        d = (float)(Math.log(0.78) / Math.log(0.9));
        e = new apl();
        f = new int[] { 16843130 };
    }
    
    public NestedScrollView(final Context context) {
        this(context, null);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set) {
        this(context, set, 2130970005);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.i = new Rect();
        this.l = true;
        this.m = false;
        this.n = null;
        this.o = false;
        this.r = true;
        this.v = -1;
        this.w = new int[2];
        this.x = new int[2];
        this.a = aph.d(context, set);
        this.b = aph.d(context, set);
        this.g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.j = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        this.s = value.getScaledTouchSlop();
        this.t = value.getScaledMinimumFlingVelocity();
        this.u = value.getScaledMaximumFlingVelocity();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, NestedScrollView.f, n, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        if (boolean1 != this.q) {
            this.q = boolean1;
            this.requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.B = new alu();
        this.C = new alq((View)this);
        this.setNestedScrollingEnabled(true);
        ana.N((View)this, (akv)NestedScrollView.e);
    }
    
    private final void A() {
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
    }
    
    private final void B(final int n, final int n2, final int[] array) {
        final int scrollY = this.getScrollY();
        this.scrollBy(0, n);
        final int n3 = this.getScrollY() - scrollY;
        if (array != null) {
            array[1] += n3;
        }
        this.C.i(0, n3, 0, n - n3, (int[])null, n2, array);
    }
    
    private final void C(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.v) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.k = (int)motionEvent.getY(n);
            this.v = motionEvent.getPointerId(n);
            final VelocityTracker p = this.p;
            if (p != null) {
                p.clear();
            }
        }
    }
    
    private final void D() {
        final VelocityTracker p = this.p;
        if (p != null) {
            p.recycle();
            this.p = null;
        }
    }
    
    private final void E(final boolean b) {
        if (b) {
            this.lx(2, 1);
        }
        else {
            this.j(1);
        }
        this.z = this.getScrollY();
        ana.H((View)this);
    }
    
    private final void F(final View view) {
        view.getDrawingRect(this.i);
        this.offsetDescendantRectToMyCoords(view, this.i);
        final int lw = this.lw(this.i);
        if (lw != 0) {
            this.scrollBy(0, lw);
        }
    }
    
    private final boolean G() {
        final int overScrollMode = this.getOverScrollMode();
        boolean b = true;
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
                if (this.b() <= 0) {
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
    
    private final boolean H(final View view) {
        return !this.J(view, 0, this.getHeight());
    }
    
    private static boolean I(final View view, final View view2) {
        if (view == view2) {
            return true;
        }
        final ViewParent parent = view.getParent();
        return parent instanceof ViewGroup && I((View)parent, view2);
    }
    
    private final boolean J(final View view, final int n, final int n2) {
        view.getDrawingRect(this.i);
        this.offsetDescendantRectToMyCoords(view, this.i);
        return this.i.bottom + n >= this.getScrollY() && this.i.top - n <= this.getScrollY() + n2;
    }
    
    private final boolean K(final int n, int n2, final int n3) {
        final int height = this.getHeight();
        final int scrollY = this.getScrollY();
        final int n4 = height + scrollY;
        final ArrayList focusables = this.getFocusables(2);
        final int size = focusables.size();
        View view = null;
        int i = 0;
        int n5 = 0;
        while (i < size) {
            final View view2 = (View)focusables.get(i);
            final int top = view2.getTop();
            final int bottom = view2.getBottom();
            View view3 = view;
            int n6 = n5;
            Label_0252: {
                if (n2 < bottom) {
                    view3 = view;
                    n6 = n5;
                    if (top < n3) {
                        final boolean b = n2 < top && bottom < n3;
                        if (view == null) {
                            view3 = view2;
                            n6 = (b ? 1 : 0);
                        }
                        else {
                            boolean b2 = false;
                            Label_0182: {
                                Label_0179: {
                                    if (n == 33) {
                                        if (top >= view.getTop()) {
                                            break Label_0179;
                                        }
                                    }
                                    else if (bottom <= view.getBottom()) {
                                        break Label_0179;
                                    }
                                    b2 = true;
                                    break Label_0182;
                                }
                                b2 = false;
                            }
                            if (n5 != 0) {
                                view3 = view;
                                n6 = n5;
                                if (!b) {
                                    break Label_0252;
                                }
                                view3 = view;
                                n6 = n5;
                                if (!b2) {
                                    break Label_0252;
                                }
                            }
                            else {
                                if (b) {
                                    view3 = view2;
                                    n6 = 1;
                                    break Label_0252;
                                }
                                view3 = view;
                                n6 = n5;
                                if (!b2) {
                                    break Label_0252;
                                }
                            }
                            view3 = view2;
                            n6 = n5;
                        }
                    }
                }
            }
            ++i;
            view = view3;
            n5 = n6;
        }
        Object o;
        if ((o = view) == null) {
            o = this;
        }
        boolean b3;
        if (n2 >= scrollY && n3 <= n4) {
            b3 = false;
        }
        else {
            if (n == 33) {
                n2 -= scrollY;
            }
            else {
                n2 = n3 - n4;
            }
            this.y(n2);
            b3 = true;
        }
        if (o != this.findFocus()) {
            ((View)o).requestFocus(n);
        }
        return b3;
    }
    
    private final boolean L(final EdgeEffect edgeEffect, int abs) {
        if (abs > 0) {
            return true;
        }
        final float b = aph.b(edgeEffect);
        final int height = this.getHeight();
        abs = Math.abs(-abs);
        final double log = Math.log(abs * 0.35f / (this.g * 0.015f));
        final double n = NestedScrollView.d;
        final double n2 = this.g * 0.015f;
        Double.isNaN(n);
        Double.isNaN(n);
        final double exp = Math.exp(n / (-1.0 + n) * log);
        Double.isNaN(n2);
        return (float)(n2 * exp) < b * height;
    }
    
    private final boolean M(final MotionEvent motionEvent) {
        boolean b;
        if (aph.b(this.a) != 0.0f) {
            aph.c(this.a, 0.0f, motionEvent.getX() / this.getWidth());
            b = true;
        }
        else {
            b = false;
        }
        if (aph.b(this.b) != 0.0f) {
            aph.c(this.b, 0.0f, 1.0f - motionEvent.getX() / this.getWidth());
            return true;
        }
        return b;
    }
    
    private final void N(int scrollY, int max, final boolean b) {
        if (this.getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.h > 250L) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int height = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            final int height2 = this.getHeight();
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            scrollY = this.getScrollY();
            max = Math.max(0, Math.min(max + scrollY, Math.max(0, height + topMargin + bottomMargin - (height2 - paddingTop - paddingBottom))));
            this.j.startScroll(this.getScrollX(), scrollY, 0, max - scrollY, 250);
            this.E(b);
        }
        else {
            if (!this.j.isFinished()) {
                this.x();
            }
            this.scrollBy(scrollY, max);
        }
        this.h = AnimationUtils.currentAnimationTimeMillis();
    }
    
    private static int w(final int n, final int n2, final int n3) {
        if (n2 >= n3 || n < 0) {
            return 0;
        }
        if (n2 + n > n3) {
            return n3 - n2;
        }
        return n;
    }
    
    private final void x() {
        this.j.abortAnimation();
        this.j(1);
    }
    
    private final void y(final int n) {
        if (n != 0) {
            if (this.r) {
                this.s(n);
                return;
            }
            this.scrollBy(0, n);
        }
    }
    
    private final void z() {
        this.o = false;
        this.D();
        this.j(0);
        this.a.onRelease();
        this.b.onRelease();
    }
    
    public final void addView(final View view) {
        if (this.getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final int n) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final int b() {
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            return Math.max(0, child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }
    
    public void c(final int n) {
        if (this.getChildCount() > 0) {
            this.j.fling(this.getScrollX(), this.getScrollY(), 0, n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.E(true);
        }
    }
    
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }
    
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }
    
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }
    
    public final void computeScroll() {
        if (this.j.isFinished()) {
            return;
        }
        this.j.computeScrollOffset();
        final int currY = this.j.getCurrY();
        final int n = currY - this.z;
        final int height = this.getHeight();
        int n3 = 0;
        Label_0191: {
            int n2;
            if (n > 0 && aph.b(this.a) != 0.0f) {
                final int round = Math.round(-height / 4.0f * aph.c(this.a, -n * 4.0f / height, 0.5f));
                if ((n2 = round) != n) {
                    this.a.finish();
                    n2 = round;
                }
            }
            else {
                if ((n3 = n) >= 0) {
                    break Label_0191;
                }
                n3 = n;
                if (aph.b(this.b) == 0.0f) {
                    break Label_0191;
                }
                final float n4 = (float)height;
                final int round2 = Math.round(n4 / 4.0f * aph.c(this.b, n * 4.0f / n4, 0.5f));
                if ((n2 = round2) != n) {
                    this.b.finish();
                    n2 = round2;
                }
            }
            n3 = n - n2;
        }
        this.z = currY;
        final int[] x = this.x;
        this.l(x[1] = 0, n3, x, null, 1);
        final int n5 = n3 - this.x[1];
        final int b = this.b();
        int n6;
        if ((n6 = n5) != 0) {
            final int scrollY = this.getScrollY();
            this.r(n5, this.getScrollX(), scrollY, b);
            final int n7 = this.getScrollY() - scrollY;
            final int n8 = n5 - n7;
            final int[] x2 = this.x;
            x2[1] = 0;
            this.ly(n7, n8, this.w, 1, x2);
            n6 = n8 - this.x[1];
        }
        if (n6 != 0) {
            final int overScrollMode = this.getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && b > 0)) {
                if (n6 < 0) {
                    if (this.a.isFinished()) {
                        this.a.onAbsorb((int)this.j.getCurrVelocity());
                    }
                }
                else if (this.b.isFinished()) {
                    this.b.onAbsorb((int)this.j.getCurrVelocity());
                }
            }
            this.x();
        }
        if (!this.j.isFinished()) {
            ana.H((View)this);
            return;
        }
        this.j(1);
    }
    
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }
    
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }
    
    public final int computeVerticalScrollRange() {
        final int childCount = this.getChildCount();
        final int n = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if (childCount == 0) {
            return n;
        }
        final View child = this.getChildAt(0);
        int n2 = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin;
        final int scrollY = this.getScrollY();
        final int max = Math.max(0, n2 - n);
        if (scrollY < 0) {
            n2 -= scrollY;
        }
        else if (scrollY > max) {
            return n2 + (scrollY - max);
        }
        return n2;
    }
    
    public final void d(final View view, final int n, final int n2, final int[] array, final int n3) {
        this.l(n, n2, array, null, n3);
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.m(keyEvent);
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.C.d(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.C.e(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.l(n, n2, array, array2, 0);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.C.h(n, n2, n3, n4, array);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final int scrollY = this.getScrollY();
        final boolean finished = this.a.isFinished();
        final int n = 0;
        if (!finished) {
            final int save = canvas.save();
            int width = this.getWidth();
            final int height = this.getHeight();
            final int min = Math.min(0, scrollY);
            int paddingLeft;
            if (apm.a((ViewGroup)this)) {
                width -= this.getPaddingLeft() + this.getPaddingRight();
                paddingLeft = this.getPaddingLeft();
            }
            else {
                paddingLeft = 0;
            }
            int n2 = height;
            int n3 = min;
            if (apm.a((ViewGroup)this)) {
                n2 = height - (this.getPaddingTop() + this.getPaddingBottom());
                n3 = min + this.getPaddingTop();
            }
            canvas.translate((float)paddingLeft, (float)n3);
            this.a.setSize(width, n2);
            if (this.a.draw(canvas)) {
                ana.H((View)this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.b.isFinished()) {
            final int save2 = canvas.save();
            final int width2 = this.getWidth();
            final int height2 = this.getHeight();
            final int n4 = Math.max(this.b(), scrollY) + height2;
            int paddingLeft2 = n;
            int n5 = width2;
            if (apm.a((ViewGroup)this)) {
                n5 = width2 - (this.getPaddingLeft() + this.getPaddingRight());
                paddingLeft2 = this.getPaddingLeft();
            }
            int n6 = n4;
            int n7 = height2;
            if (apm.a((ViewGroup)this)) {
                n7 = height2 - (this.getPaddingTop() + this.getPaddingBottom());
                n6 = n4 - this.getPaddingBottom();
            }
            canvas.translate((float)(paddingLeft2 - n5), (float)n6);
            canvas.rotate(180.0f, (float)n5, 0.0f);
            this.b.setSize(n5, n7);
            if (this.b.draw(canvas)) {
                ana.H((View)this);
            }
            canvas.restoreToCount(save2);
        }
    }
    
    public final void e(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.B(n4, n5, null);
    }
    
    public final void f(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.B(n4, n5, array);
    }
    
    public final void g(final View view, final View view2, final int n, final int n2) {
        this.B.b(n, n2);
        this.lx(2, n2);
    }
    
    protected final float getBottomFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        final View child = this.getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int n = child.getBottom() + frameLayout$LayoutParams.bottomMargin - this.getScrollY() - (this.getHeight() - this.getPaddingBottom());
        if (n < verticalFadingEdgeLength) {
            return n / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public final int getNestedScrollAxes() {
        return this.B.a();
    }
    
    protected final float getTopFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int scrollY = this.getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public final void h(final View view, final int n) {
        this.B.c(n);
        this.j(n);
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.o(0);
    }
    
    public final void i(final int n, final int n2) {
        this.u(n, n2, false);
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.C.a;
    }
    
    public final void j(final int n) {
        this.C.c(n);
    }
    
    public final boolean k(int descendantFocusability) {
        View focus;
        if ((focus = this.findFocus()) == this) {
            focus = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, descendantFocusability);
        final int n = (int)(this.getHeight() * 0.5f);
        if (nextFocus != null && this.J(nextFocus, n, this.getHeight())) {
            nextFocus.getDrawingRect(this.i);
            this.offsetDescendantRectToMyCoords(nextFocus, this.i);
            this.y(this.lw(this.i));
            nextFocus.requestFocus(descendantFocusability);
        }
        else {
            int n2;
            if (descendantFocusability == 33 && this.getScrollY() < n) {
                n2 = this.getScrollY();
            }
            else {
                n2 = n;
                if (descendantFocusability == 130) {
                    n2 = n;
                    if (this.getChildCount() > 0) {
                        final View child = this.getChildAt(0);
                        n2 = Math.min(child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), n);
                    }
                }
            }
            if (n2 == 0) {
                return false;
            }
            if (descendantFocusability != 130) {
                n2 = -n2;
            }
            this.y(n2);
        }
        if (focus != null && focus.isFocused() && this.H(focus)) {
            descendantFocusability = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(descendantFocusability);
        }
        return true;
    }
    
    public final boolean l(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.C.g(n, n2, array, array2, n3);
    }
    
    protected final int lw(final Rect rect) {
        final int childCount = this.getChildCount();
        final boolean b = false;
        if (childCount == 0) {
            return 0;
        }
        final int height = this.getHeight();
        final int scrollY = this.getScrollY();
        final int n = scrollY + height;
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        int n2 = scrollY;
        if (rect.top > 0) {
            n2 = scrollY + verticalFadingEdgeLength;
        }
        final View child = this.getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        int n3;
        if (rect.bottom < child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin) {
            n3 = n - verticalFadingEdgeLength;
        }
        else {
            n3 = n;
        }
        int n5;
        if (rect.bottom > n3 && rect.top > n2) {
            int n4;
            if (rect.height() > height) {
                n4 = rect.top - n2;
            }
            else {
                n4 = rect.bottom - n3;
            }
            n5 = Math.min(n4, child.getBottom() + frameLayout$LayoutParams.bottomMargin - n);
        }
        else {
            n5 = (b ? 1 : 0);
            if (rect.top < n2) {
                n5 = (b ? 1 : 0);
                if (rect.bottom < n3) {
                    int n6;
                    if (rect.height() > height) {
                        n6 = -(n3 - rect.bottom);
                    }
                    else {
                        n6 = -(n2 - rect.top);
                    }
                    n5 = Math.max(n6, -this.getScrollY());
                }
            }
        }
        return n5;
    }
    
    public final boolean lx(final int n, final int n2) {
        return this.C.m(n, n2);
    }
    
    public final void ly(final int n, final int n2, final int[] array, final int n3, final int[] array2) {
        this.C.i(0, n, 0, n2, array, n3, array2);
    }
    
    public final boolean m(final KeyEvent keyEvent) {
        this.i.setEmpty();
        final int childCount = this.getChildCount();
        final boolean b = false;
        if (childCount > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            if (child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                boolean b2 = b;
                if (keyEvent.getAction() == 0) {
                    final int keyCode = keyEvent.getKeyCode();
                    int n = 33;
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode == 62) {
                                if (!keyEvent.isShiftPressed()) {
                                    n = 130;
                                }
                                final int height = this.getHeight();
                                if (n == 130) {
                                    this.i.top = this.getScrollY() + height;
                                    final int childCount2 = this.getChildCount();
                                    if (childCount2 > 0) {
                                        final View child2 = this.getChildAt(childCount2 - 1);
                                        final int n2 = child2.getBottom() + ((FrameLayout$LayoutParams)child2.getLayoutParams()).bottomMargin + this.getPaddingBottom();
                                        if (this.i.top + height > n2) {
                                            this.i.top = n2 - height;
                                        }
                                    }
                                }
                                else {
                                    this.i.top = this.getScrollY() - height;
                                    if (this.i.top < 0) {
                                        this.i.top = 0;
                                    }
                                }
                                final Rect i = this.i;
                                i.bottom = i.top + height;
                                this.K(n, this.i.top, this.i.bottom);
                                return false;
                            }
                            b2 = b;
                        }
                        else if (!keyEvent.isAltPressed()) {
                            b2 = this.k(130);
                        }
                        else {
                            b2 = this.n(130);
                        }
                    }
                    else if (!keyEvent.isAltPressed()) {
                        b2 = this.k(33);
                    }
                    else {
                        b2 = this.n(33);
                    }
                }
                return b2;
            }
        }
        if (this.isFocused() && keyEvent.getKeyCode() != 4) {
            View focus;
            if ((focus = this.findFocus()) == this) {
                focus = null;
            }
            final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, 130);
            if (nextFocus != null && nextFocus != this && nextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }
    
    protected final void measureChild(final View view, final int n, final int n2) {
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight(), view.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    
    protected final void measureChildWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + n2, viewGroup$MarginLayoutParams.width), View$MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, 0));
    }
    
    public final boolean n(final int n) {
        final int height = this.getHeight();
        this.i.top = 0;
        this.i.bottom = height;
        if (n == 130) {
            final int childCount = this.getChildCount();
            if (childCount > 0) {
                final View child = this.getChildAt(childCount - 1);
                this.i.bottom = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin + this.getPaddingBottom();
                final Rect i = this.i;
                i.top = i.bottom - height;
            }
        }
        return this.K(n, this.i.top, this.i.bottom);
    }
    
    public final boolean o(final int n) {
        return this.C.k(n);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = false;
    }
    
    public final boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final int n = 0;
        final int n2 = 0;
        final boolean b = false;
        if (action == 8 && !this.o) {
            float n3;
            if (afk.d(motionEvent, 2)) {
                n3 = motionEvent.getAxisValue(9);
            }
            else if (afk.d(motionEvent, 4194304)) {
                n3 = motionEvent.getAxisValue(26);
            }
            else {
                n3 = 0.0f;
            }
            if (n3 != 0.0f) {
                float d;
                if ((d = this.D) == 0.0f) {
                    final TypedValue typedValue = new TypedValue();
                    final Context context = this.getContext();
                    if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                    d = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    this.D = d;
                }
                int b2 = this.b();
                final int scrollY = this.getScrollY();
                final int n4 = scrollY - (int)(n3 * d);
                boolean b3 = false;
                Label_0325: {
                    if (n4 < 0) {
                        b2 = n;
                        if (this.G()) {
                            b2 = n;
                            if (!afk.d(motionEvent, 8194)) {
                                aph.c(this.a, -(float)n4 / this.getHeight(), 0.5f);
                                this.a.onRelease();
                                this.invalidate();
                                b3 = true;
                                b2 = n2;
                                break Label_0325;
                            }
                        }
                    }
                    else {
                        if (n4 > b2) {
                            b3 = b;
                            if (this.G()) {
                                b3 = b;
                                if (!afk.d(motionEvent, 8194)) {
                                    aph.c(this.b, (n4 - b2) / (float)this.getHeight(), 0.5f);
                                    this.b.onRelease();
                                    this.invalidate();
                                    b3 = true;
                                }
                            }
                            break Label_0325;
                        }
                        b2 = n4;
                    }
                    b3 = false;
                }
                if (b2 != scrollY) {
                    super.scrollTo(this.getScrollX(), b2);
                    return true;
                }
                return b3;
            }
        }
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final boolean b = true;
        final boolean b2 = true;
        int n = action;
        if (action == 2) {
            if (this.o) {
                return true;
            }
            n = 2;
        }
        final int n2 = n & 0xFF;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 6) {
                            return this.o;
                        }
                        this.C(motionEvent);
                        return this.o;
                    }
                }
                else {
                    final int v = this.v;
                    if (v == -1) {
                        return this.o;
                    }
                    final int pointerIndex = motionEvent.findPointerIndex(v);
                    if (pointerIndex == -1) {
                        final StringBuilder sb = new StringBuilder("Invalid pointerId=");
                        sb.append(v);
                        sb.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", sb.toString());
                        return this.o;
                    }
                    final int k = (int)motionEvent.getY(pointerIndex);
                    if (Math.abs(k - this.k) <= this.s || (0x2 & this.getNestedScrollAxes()) != 0x0) {
                        return this.o;
                    }
                    this.o = true;
                    this.k = k;
                    this.A();
                    this.p.addMovement(motionEvent);
                    this.y = 0;
                    final ViewParent parent = this.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        return this.o;
                    }
                    return this.o;
                }
            }
            this.o = false;
            this.v = -1;
            this.D();
            if (this.j.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.b())) {
                ana.H((View)this);
            }
            this.j(0);
        }
        else {
            final int i = (int)motionEvent.getY();
            final int n3 = (int)motionEvent.getX();
            if (this.getChildCount() > 0) {
                final int scrollY = this.getScrollY();
                final View child = this.getChildAt(0);
                if (i >= child.getTop() - scrollY && i < child.getBottom() - scrollY && n3 >= child.getLeft() && n3 < child.getRight()) {
                    this.k = i;
                    this.v = motionEvent.getPointerId(0);
                    final VelocityTracker p = this.p;
                    if (p == null) {
                        this.p = VelocityTracker.obtain();
                    }
                    else {
                        p.clear();
                    }
                    this.p.addMovement(motionEvent);
                    this.j.computeScrollOffset();
                    boolean o = b2;
                    if (!this.M(motionEvent)) {
                        o = (!this.j.isFinished() && b2);
                    }
                    this.o = o;
                    this.lx(2, 0);
                    return this.o;
                }
            }
            boolean o2 = b;
            if (!this.M(motionEvent)) {
                o2 = (!this.j.isFinished() && b);
            }
            this.o = o2;
            this.D();
        }
        return this.o;
    }
    
    protected final void onLayout(final boolean b, int w, final int n, int scrollY, final int n2) {
        super.onLayout(b, w, n, scrollY, n2);
        w = 0;
        this.l = false;
        final View n3 = this.n;
        if (n3 != null && I(n3, (View)this)) {
            this.F(this.n);
        }
        this.n = null;
        if (!this.m) {
            if (this.A != null) {
                this.scrollTo(this.getScrollX(), this.A.a);
                this.A = null;
            }
            if (this.getChildCount() > 0) {
                final View child = this.getChildAt(0);
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
                w = child.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
            }
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            scrollY = this.getScrollY();
            w = w(scrollY, n2 - n - paddingTop - paddingBottom, w);
            if (w != scrollY) {
                this.scrollTo(this.getScrollX(), w);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.m = true;
    }
    
    protected final void onMeasure(final int n, int measuredHeight) {
        super.onMeasure(n, measuredHeight);
        if (!this.q) {
            return;
        }
        if (View$MeasureSpec.getMode(measuredHeight) == 0) {
            return;
        }
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            measuredHeight = child.getMeasuredHeight();
            final int n2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - frameLayout$LayoutParams.topMargin - frameLayout$LayoutParams.bottomMargin;
            if (measuredHeight < n2) {
                child.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + frameLayout$LayoutParams.leftMargin + frameLayout$LayoutParams.rightMargin, frameLayout$LayoutParams.width), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
            }
        }
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (!b) {
            this.dispatchNestedFling(0.0f, n2, true);
            this.c((int)n2);
            return true;
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.d(view, n, n2, array, 0);
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.B(n4, 0, null);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.g(view, view2, n, 0);
    }
    
    protected void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        super.scrollTo(n, n2);
    }
    
    protected final boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2;
        if (n == 2) {
            n2 = 130;
        }
        else if ((n2 = n) == 1) {
            n2 = 33;
        }
        View view;
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, (View)null, n2);
        }
        else {
            view = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, rect, n2);
        }
        return view != null && !this.H(view) && view.requestFocus(n2, rect);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof NestedScrollView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final NestedScrollView$SavedState a = (NestedScrollView$SavedState)parcelable;
        super.onRestoreInstanceState(a.getSuperState());
        this.A = a;
        this.requestLayout();
    }
    
    protected final Parcelable onSaveInstanceState() {
        final NestedScrollView$SavedState nestedScrollView$SavedState = new NestedScrollView$SavedState(super.onSaveInstanceState());
        nestedScrollView$SavedState.a = this.getScrollY();
        return (Parcelable)nestedScrollView$SavedState;
    }
    
    protected void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
        final apn c = this.c;
        if (c != null) {
            c.a(this, n, n2);
        }
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final View focus = this.findFocus();
        if (focus != null) {
            if (this != focus) {
                if (this.J(focus, 0, n4)) {
                    focus.getDrawingRect(this.i);
                    this.offsetDescendantRectToMyCoords(focus, this.i);
                    this.y(this.lw(this.i));
                }
            }
        }
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.t(view, view2, n, 0);
    }
    
    public final void onStopNestedScroll(final View view) {
        this.h(view, 0);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.A();
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 0) {
            this.y = 0;
            actionMasked = 0;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        final float n = (float)this.y;
        float c = 0.0f;
        obtain.offsetLocation(0.0f, n);
        Label_1143: {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    this.C(motionEvent);
                                    this.k = (int)motionEvent.getY(motionEvent.findPointerIndex(this.v));
                                }
                            }
                            else {
                                final int actionIndex = motionEvent.getActionIndex();
                                this.k = (int)motionEvent.getY(actionIndex);
                                this.v = motionEvent.getPointerId(actionIndex);
                            }
                        }
                        else {
                            if (this.o && this.getChildCount() > 0 && this.j.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.b())) {
                                ana.H((View)this);
                            }
                            this.v = -1;
                            this.z();
                        }
                    }
                    else {
                        final int pointerIndex = motionEvent.findPointerIndex(this.v);
                        if (pointerIndex == -1) {
                            final StringBuilder sb = new StringBuilder("Invalid pointerId=");
                            sb.append(this.v);
                            sb.append(" in onTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        }
                        else {
                            final int n2 = (int)motionEvent.getY(pointerIndex);
                            final int n3 = this.k - n2;
                            final float n4 = motionEvent.getX(pointerIndex) / this.getWidth();
                            final float n5 = n3 / (float)this.getHeight();
                            if (aph.b(this.a) != 0.0f) {
                                c = -aph.c(this.a, -n5, n4);
                                if (aph.b(this.a) == 0.0f) {
                                    this.a.onRelease();
                                    c = c;
                                }
                            }
                            else if (aph.b(this.b) != 0.0f) {
                                final float n6 = c = aph.c(this.b, n5, 1.0f - n4);
                                if (aph.b(this.b) == 0.0f) {
                                    this.b.onRelease();
                                    c = n6;
                                }
                            }
                            final int round = Math.round(c * this.getHeight());
                            if (round != 0) {
                                this.invalidate();
                            }
                            int n8;
                            final int n7 = n8 = n3 - round;
                            if (!this.o) {
                                n8 = n7;
                                if (Math.abs(n7) > this.s) {
                                    final ViewParent parent = this.getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    this.o = true;
                                    if (n7 > 0) {
                                        n8 = n7 - this.s;
                                    }
                                    else {
                                        n8 = n7 + this.s;
                                    }
                                }
                            }
                            final int n9 = n8;
                            if (this.o) {
                                int n10 = n9;
                                if (this.l(0, n9, this.x, this.w, 0)) {
                                    n10 = n9 - this.x[1];
                                    this.y += this.w[1];
                                }
                                this.k = n2 - this.w[1];
                                final int scrollY = this.getScrollY();
                                final int b = this.b();
                                final int overScrollMode = this.getOverScrollMode();
                                final boolean b2 = overScrollMode == 0 || (overScrollMode == 1 && b > 0);
                                final boolean b3 = this.r(n10, 0, this.getScrollY(), b) && !this.o(0);
                                final int n11 = this.getScrollY() - scrollY;
                                final int[] x = this.x;
                                x[1] = 0;
                                this.ly(n11, n10 - n11, this.w, 0, x);
                                final int k = this.k;
                                final int n12 = this.w[1];
                                this.k = k - n12;
                                this.y += n12;
                                if (b2) {
                                    final int n13 = n10 - this.x[1];
                                    final int n14 = scrollY + n13;
                                    if (n14 < 0) {
                                        aph.c(this.a, -n13 / (float)this.getHeight(), motionEvent.getX(pointerIndex) / this.getWidth());
                                        if (!this.b.isFinished()) {
                                            this.b.onRelease();
                                        }
                                    }
                                    else if (n14 > b) {
                                        aph.c(this.b, n13 / (float)this.getHeight(), 1.0f - motionEvent.getX(pointerIndex) / this.getWidth());
                                        if (!this.a.isFinished()) {
                                            this.a.onRelease();
                                        }
                                    }
                                    if (!this.a.isFinished() || !this.b.isFinished()) {
                                        ana.H((View)this);
                                        break Label_1143;
                                    }
                                }
                                if (b3) {
                                    this.p.clear();
                                }
                            }
                        }
                    }
                }
                else {
                    final VelocityTracker p = this.p;
                    p.computeCurrentVelocity(1000, (float)this.u);
                    final int n15 = (int)p.getYVelocity(this.v);
                    if (Math.abs(n15) >= this.t) {
                        if (aph.b(this.a) != 0.0f) {
                            if (this.L(this.a, n15)) {
                                this.a.onAbsorb(n15);
                            }
                            else {
                                this.c(-n15);
                            }
                        }
                        else if (aph.b(this.b) != 0.0f) {
                            final int n16 = -n15;
                            if (this.L(this.b, n16)) {
                                this.b.onAbsorb(n16);
                            }
                            else {
                                this.c(n16);
                            }
                        }
                        else {
                            final int n17 = -n15;
                            final float n18 = (float)n17;
                            if (!this.dispatchNestedPreFling(0.0f, n18)) {
                                this.dispatchNestedFling(0.0f, n18, true);
                                this.c(n17);
                            }
                        }
                    }
                    else if (this.j.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.b())) {
                        ana.H((View)this);
                    }
                    this.v = -1;
                    this.z();
                }
            }
            else {
                if (this.getChildCount() == 0) {
                    return false;
                }
                if (this.o) {
                    final ViewParent parent2 = this.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                }
                if (!this.j.isFinished()) {
                    this.x();
                }
                this.k = (int)motionEvent.getY();
                this.v = motionEvent.getPointerId(0);
                this.lx(2, 0);
            }
        }
        final VelocityTracker p2 = this.p;
        if (p2 != null) {
            p2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
    
    final boolean r(int n, final int n2, final int n3, int n4) {
        this.getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        n += n3;
        final boolean b = n2 > 0 || n2 < 0;
        boolean b2;
        if (n > n4) {
            b2 = true;
        }
        else if (n < 0) {
            b2 = true;
            n4 = 0;
        }
        else {
            n4 = n;
            b2 = false;
        }
        if (b2 && !this.o(1)) {
            this.j.springBack(0, n4, 0, 0, 0, this.b());
        }
        this.onOverScrolled(0, n4, b, b2);
        return b || b2;
    }
    
    public final void requestChildFocus(final View view, final View n) {
        if (!this.l) {
            this.F(n);
        }
        else {
            this.n = n;
        }
        super.requestChildFocus(view, n);
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        final int lw = this.lw(rect);
        final boolean b2 = lw != 0;
        if (b2) {
            if (b) {
                this.scrollBy(0, lw);
            }
            else {
                this.s(lw);
            }
        }
        return b2;
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        if (b) {
            this.D();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public final void requestLayout() {
        this.l = true;
        super.requestLayout();
    }
    
    public final void s(final int n) {
        this.N(0, n, false);
    }
    
    public final void scrollTo(int w, int w2) {
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            w = w(w, this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), child.getWidth() + frameLayout$LayoutParams.leftMargin + frameLayout$LayoutParams.rightMargin);
            w2 = w(w2, this.getHeight() - this.getPaddingTop() - this.getPaddingBottom(), child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin);
            if (w != this.getScrollX() || w2 != this.getScrollY()) {
                super.scrollTo(w, w2);
            }
        }
    }
    
    public final void setNestedScrollingEnabled(final boolean b) {
        this.C.a(b);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.lx(n, 0);
    }
    
    public void stopNestedScroll() {
        this.j(0);
    }
    
    public final boolean t(final View view, final View view2, final int n, final int n2) {
        return (n & 0x2) != 0x0;
    }
    
    final void u(final int n, final int n2, final boolean b) {
        this.N(n - this.getScrollX(), n2 - this.getScrollY(), b);
    }
    
    public final void v(final int n) {
        this.u(0, n, true);
    }
}
