// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager.widget;

import androidx.customview.view.AbsSavedState;
import android.view.ViewConfiguration;
import android.graphics.drawable.Drawable;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import android.view.View$MeasureSpec;
import com.google.android.material.tabs.TabLayout;
import android.database.DataSetObserver;
import android.content.res.Resources$NotFoundException;
import java.util.Collections;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.MotionEvent;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Scroller;
import android.os.Parcelable;
import android.graphics.Rect;
import java.util.ArrayList;
import android.widget.EdgeEffect;
import java.util.List;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import java.util.Comparator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    public static final int[] a;
    private static final Comparator h;
    private static final Interpolator i;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private int R;
    private List S;
    private final Runnable T;
    private int U;
    public cko b;
    public int c;
    public EdgeEffect d;
    public EdgeEffect e;
    public cku f;
    public List g;
    private int j;
    private final ArrayList k;
    private final ckr l;
    private final Rect m;
    private int n;
    private Parcelable o;
    private ClassLoader p;
    private Scroller q;
    private boolean r;
    private ckv s;
    private float t;
    private float u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;
    
    static {
        a = new int[] { 16842931 };
        h = (Comparator)new mm(6);
        i = (Interpolator)new qe(4);
    }
    
    public ViewPager(final Context context) {
        super(context);
        this.k = new ArrayList();
        this.l = new ckr();
        this.m = new Rect();
        this.n = -1;
        this.o = null;
        this.p = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.y = 1;
        this.E = true;
        this.J = -1;
        this.P = true;
        this.T = (Runnable)new cdi(this, 8);
        this.U = 0;
        this.w(context);
    }
    
    public ViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.k = new ArrayList();
        this.l = new ckr();
        this.m = new Rect();
        this.n = -1;
        this.o = null;
        this.p = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.y = 1;
        this.E = true;
        this.J = -1;
        this.P = true;
        this.T = (Runnable)new cdi(this, 8);
        this.U = 0;
        this.w(context);
    }
    
    private final void A(final boolean b) {
        int n;
        if (this.U == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.E(false);
            if (!this.q.isFinished()) {
                this.q.abortAnimation();
                final int scrollX = this.getScrollX();
                final int scrollY = this.getScrollY();
                final int currX = this.q.getCurrX();
                final int currY = this.q.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    this.scrollTo(currX, currY);
                    if (currX != scrollX) {
                        this.F(currX);
                    }
                }
            }
        }
        this.x = false;
        for (int i = 0; i < this.k.size(); ++i) {
            final ckr ckr = this.k.get(i);
            if (ckr.c) {
                ckr.c = false;
                n = 1;
            }
        }
        if (n != 0) {
            if (b) {
                ana.I((View)this, this.T);
                return;
            }
            this.T.run();
        }
    }
    
    private final void B(final int n) {
        final cku f = this.f;
        if (f != null) {
            f.c(n);
        }
        final List s = this.S;
        if (s != null) {
            for (int size = s.size(), i = 0; i < size; ++i) {
                final cku cku = this.S.get(i);
                if (cku != null) {
                    cku.c(n);
                }
            }
        }
    }
    
    private final void C(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.F = motionEvent.getX(n);
            this.J = motionEvent.getPointerId(n);
            final VelocityTracker k = this.K;
            if (k != null) {
                k.clear();
            }
        }
    }
    
    private final void D(final int n, final boolean b, int n2, final boolean b2) {
        final ckr d = this.d(n);
        int n3;
        if (d != null) {
            n3 = (int)(this.x() * Math.max(this.t, Math.min(d.e, this.u)));
        }
        else {
            n3 = 0;
        }
        if (b) {
            Label_0328: {
                if (this.getChildCount() == 0) {
                    this.E(false);
                }
                else {
                    final Scroller q = this.q;
                    int n4;
                    if (q != null && !q.isFinished()) {
                        if (this.r) {
                            n4 = this.q.getCurrX();
                        }
                        else {
                            n4 = this.q.getStartX();
                        }
                        this.q.abortAnimation();
                        this.E(false);
                    }
                    else {
                        n4 = this.getScrollX();
                    }
                    final int scrollY = this.getScrollY();
                    int n5 = n3 - n4;
                    final int n6 = -scrollY;
                    if (n5 == 0) {
                        if (n6 == 0) {
                            this.A(false);
                            this.h();
                            this.r(0);
                            break Label_0328;
                        }
                        n5 = 0;
                    }
                    this.E(true);
                    this.r(2);
                    final int x = this.x();
                    final float n7 = (float)x;
                    final float n8 = (float)(x / 2);
                    final float n9 = (float)Math.sin((Math.min(1.0f, Math.abs(n5) / n7) - 0.5f) * 0.47123894f);
                    n2 = Math.abs(n2);
                    if (n2 > 0) {
                        n2 = Math.round(Math.abs((n8 + n9 * n8) / n2) * 1000.0f) * 4;
                    }
                    else {
                        n2 = (int)((Math.abs(n5) / (n7 + 0.0f) + 1.0f) * 100.0f);
                    }
                    n2 = Math.min(n2, 600);
                    this.r = false;
                    this.q.startScroll(n4, scrollY, n5, n6, n2);
                    ana.H((View)this);
                }
            }
            if (b2) {
                this.B(n);
            }
            return;
        }
        if (b2) {
            this.B(n);
        }
        this.A(false);
        this.scrollTo(n3, 0);
        this.F(n3);
    }
    
    private final void E(final boolean w) {
        if (this.w != w) {
            this.w = w;
        }
    }
    
    private final boolean F(final int n) {
        if (this.k.size() == 0) {
            if (this.P) {
                return false;
            }
            this.Q = false;
            this.g(0, 0.0f, 0);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        else {
            final ckr z = this.z();
            final float n2 = (float)this.x();
            final int b = z.b;
            final float n3 = (n / n2 - z.e) / (z.d + 0.0f / n2);
            this.Q = false;
            this.g(b, n3, (int)(n2 * n3));
            if (this.Q) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }
    
    private final boolean G(float c, final float n) {
        final float n2 = this.F - c;
        this.F = c;
        final float n3 = n / this.getHeight();
        c = n2 / this.getWidth();
        if (aph.b(this.d) != 0.0f) {
            c = -aph.c(this.d, -c, 1.0f - n3);
        }
        else if (aph.b(this.e) != 0.0f) {
            c = aph.c(this.e, c, n3);
        }
        else {
            c = 0.0f;
        }
        c *= this.getWidth();
        final float n4 = n2 - c;
        boolean b = false;
        final int n5 = true ? 1 : 0;
        final int n6 = true ? 1 : 0;
        int n7 = (c != 0.0f) ? 1 : 0;
        if (Math.abs(n4) < 1.0E-4f) {
            return n7 != 0;
        }
        final float n8 = this.getScrollX() + n4;
        final float n9 = (float)this.x();
        c = this.t * n9;
        float n10 = this.u * n9;
        final ckr ckr = this.k.get(0);
        final ArrayList k = this.k;
        final ckr ckr2 = k.get(k.size() - 1);
        boolean b2;
        if (ckr.b != 0) {
            c = ckr.e * n9;
            b2 = false;
        }
        else {
            b2 = true;
        }
        if (ckr2.b != this.b.j() - 1) {
            n10 = ckr2.e * n9;
        }
        else {
            b = true;
        }
        boolean b3;
        if (n8 < c) {
            if (b2) {
                aph.c(this.d, (c - n8) / n9, 1.0f - n / this.getHeight());
                n7 = n6;
            }
            b3 = (n7 != 0);
        }
        else {
            c = n8;
            b3 = (n7 != 0);
            if (n8 > n10) {
                if (b) {
                    aph.c(this.e, (n8 - n10) / n9, n / this.getHeight());
                    n7 = n5;
                }
                c = n10;
                b3 = (n7 != 0);
            }
        }
        final int n11 = (int)c;
        this.F += c - n11;
        this.scrollTo(n11, this.getScrollY());
        this.F(n11);
        return b3;
    }
    
    private final boolean H() {
        this.J = -1;
        this.z = false;
        this.A = false;
        final VelocityTracker k = this.K;
        if (k != null) {
            k.recycle();
            this.K = null;
        }
        this.d.onRelease();
        this.e.onRelease();
        return !this.d.isFinished() || !this.e.isFinished();
    }
    
    private final void I() {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    private final int x() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }
    
    private final Rect y(final Rect rect, final View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewGroup viewGroup;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = viewGroup.getParent()) {
            viewGroup = (ViewGroup)viewParent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
        }
        return rect2;
    }
    
    private final ckr z() {
        final int x = this.x();
        float e = 0.0f;
        float n;
        if (x > 0) {
            n = this.getScrollX() / (float)x;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (x > 0) {
            n2 = 0.0f / x;
        }
        else {
            n2 = 0.0f;
        }
        ckr ckr = null;
        float d = 0.0f;
        int i = 0;
        int n3 = 1;
        int b = -1;
        while (i < this.k.size()) {
            final ckr ckr2 = this.k.get(i);
            int n4 = i;
            ckr l = ckr2;
            if (n3 == 0) {
                ++b;
                n4 = i;
                l = ckr2;
                if (ckr2.b != b) {
                    l = this.l;
                    l.e = e + d + n2;
                    l.b = b;
                    l.d = 1.0f;
                    n4 = i - 1;
                }
            }
            e = l.e;
            final float d2 = l.d;
            if (n3 == 0 && n < e) {
                return ckr;
            }
            if (n < d2 + e + n2 || n4 == this.k.size() - 1) {
                return l;
            }
            b = l.b;
            d = l.d;
            i = n4 + 1;
            n3 = 0;
            ckr = l;
        }
        return ckr;
    }
    
    public int a() {
        return this.c;
    }
    
    public final void addFocusables(final ArrayList list, final int n, final int n2) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() == 0) {
                    final ckr c = this.c(child);
                    if (c != null && c.b == this.c) {
                        child.addFocusables(list, n, n2);
                    }
                }
            }
            if (descendantFocusability == 262144 && size != list.size()) {
                return;
            }
        }
        if (!this.isFocusable()) {
            return;
        }
        if ((n2 & 0x1) == 0x1 && this.isInTouchMode() && !this.isFocusableInTouchMode()) {
            return;
        }
        if (list != null) {
            list.add(this);
        }
    }
    
    public final void addTouchables(final ArrayList list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final ckr c = this.c(child);
                if (c != null && c.b == this.c) {
                    child.addTouchables(list);
                }
            }
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        ViewGroup$LayoutParams generateDefaultLayoutParams = viewGroup$LayoutParams;
        if (!this.checkLayoutParams(viewGroup$LayoutParams)) {
            generateDefaultLayoutParams = this.generateDefaultLayoutParams();
        }
        final cks cks = (cks)generateDefaultLayoutParams;
        final boolean a = cks.a | view.getClass().getAnnotation(ckq.class) != null;
        cks.a = a;
        if (!this.v) {
            super.addView(view, n, generateDefaultLayoutParams);
            return;
        }
        if (cks != null && a) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        cks.d = true;
        this.addViewInLayout(view, n, generateDefaultLayoutParams);
    }
    
    final ckr b(final int b, final int n) {
        final ckr ckr = new ckr();
        ckr.b = b;
        ckr.a = this.b.c((ViewGroup)this, b);
        ckr.d = 1.0f;
        if (n >= 0 && n < this.k.size()) {
            this.k.add(n, ckr);
        }
        else {
            this.k.add(ckr);
        }
        return ckr;
    }
    
    final ckr c(final View view) {
        for (int i = 0; i < this.k.size(); ++i) {
            final ckr ckr = this.k.get(i);
            if (this.b.g(view, ckr.a)) {
                return ckr;
            }
        }
        return null;
    }
    
    public final boolean canScrollHorizontally(final int n) {
        if (this.b == null) {
            return false;
        }
        final int x = this.x();
        final int scrollX = this.getScrollX();
        if (n < 0) {
            return scrollX > (int)(x * this.t);
        }
        return n > 0 && scrollX < (int)(x * this.u);
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof cks && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void computeScroll() {
        this.r = true;
        if (!this.q.isFinished() && this.q.computeScrollOffset()) {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.q.getCurrX();
            final int currY = this.q.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (!this.F(currX)) {
                    this.q.abortAnimation();
                    this.scrollTo(0, currY);
                }
            }
            ana.H((View)this);
            return;
        }
        this.A(true);
    }
    
    final ckr d(final int n) {
        for (int i = 0; i < this.k.size(); ++i) {
            final ckr ckr = this.k.get(i);
            if (ckr.b == n) {
                return ckr;
            }
        }
        return null;
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            boolean b = false;
            Label_0128: {
                if (keyEvent.getAction() == 0) {
                    final int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 21) {
                        if (keyCode != 22) {
                            if (keyCode == 61) {
                                if (keyEvent.hasNoModifiers()) {
                                    b = this.s(2);
                                    break Label_0128;
                                }
                                if (keyEvent.hasModifiers(1)) {
                                    b = this.s(1);
                                    break Label_0128;
                                }
                            }
                        }
                        else {
                            if (keyEvent.hasModifiers(2)) {
                                b = this.v();
                                break Label_0128;
                            }
                            b = this.s(66);
                            break Label_0128;
                        }
                    }
                    else {
                        if (keyEvent.hasModifiers(2)) {
                            b = this.u();
                            break Label_0128;
                        }
                        b = this.s(17);
                        break Label_0128;
                    }
                }
                b = false;
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final ckr c = this.c(child);
                if (c != null && c.b == this.c) {
                    if (child.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int overScrollMode = this.getOverScrollMode();
        Label_0054: {
            if (overScrollMode != 0) {
                if (overScrollMode == 1) {
                    final cko b = this.b;
                    if (b != null && b.j() > 1) {
                        break Label_0054;
                    }
                }
                this.d.finish();
                this.e.finish();
                return;
            }
        }
        int draw;
        if (!this.d.isFinished()) {
            final int save = canvas.save();
            final int n = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            final int width = this.getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float)(-n + this.getPaddingTop()), this.t * width);
            this.d.setSize(n, width);
            draw = (this.d.draw(canvas) ? 1 : 0);
            canvas.restoreToCount(save);
        }
        else {
            draw = 0;
        }
        int n2 = draw;
        if (!this.e.isFinished()) {
            final int save2 = canvas.save();
            final int width2 = this.getWidth();
            final int height = this.getHeight();
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float)(-this.getPaddingTop()), -(this.u + 1.0f) * width2);
            this.e.setSize(height - paddingTop - paddingBottom, width2);
            n2 = (draw | (this.e.draw(canvas) ? 1 : 0));
            canvas.restoreToCount(save2);
        }
        if (n2 != 0) {
            ana.H((View)this);
        }
    }
    
    public void e(final cku cku) {
        if (this.S == null) {
            this.S = new ArrayList();
        }
        this.S.add(cku);
    }
    
    public final void f() {
        final int j = this.b.j();
        this.j = j;
        final int size = this.k.size();
        final int y = this.y;
        final boolean b = size < y + y + 1 && this.k.size() < j;
        int n = this.c;
        int i = 0;
        int n2 = 0;
        boolean b2 = b;
        while (i < this.k.size()) {
            final ckr ckr = this.k.get(i);
            final int k = this.b.k(ckr.a);
            int n3;
            int n4;
            int n5;
            if (k == -1) {
                n3 = n;
                n4 = i;
                n5 = n2;
            }
            else if (k == -2) {
                this.k.remove(i);
                n4 = i - 1;
                if (n2 == 0) {
                    this.b.f((ViewGroup)this);
                }
                this.b.d((ViewGroup)this, ckr.b, ckr.a);
                final int c = this.c;
                if (c == ckr.b) {
                    n = Math.max(0, Math.min(c, -1 + j));
                }
                b2 = true;
                n5 = 1;
                n3 = n;
            }
            else {
                final int b3 = ckr.b;
                n3 = n;
                n4 = i;
                n5 = n2;
                if (b3 != k) {
                    if (b3 == this.c) {
                        n = k;
                    }
                    ckr.b = k;
                    b2 = true;
                    n5 = n2;
                    n4 = i;
                    n3 = n;
                }
            }
            i = n4 + 1;
            n = n3;
            n2 = n5;
        }
        if (n2 != 0) {
            this.b.h();
        }
        Collections.sort((List<Object>)this.k, ViewPager.h);
        if (b2) {
            for (int childCount = this.getChildCount(), l = 0; l < childCount; ++l) {
                final cks cks = (cks)this.getChildAt(l).getLayoutParams();
                if (!cks.a) {
                    cks.c = 0.0f;
                }
            }
            this.n(n, false, true);
            this.requestLayout();
        }
    }
    
    protected final void g(final int n, final float n2, final int n3) {
        final int r = this.R;
        final int n4 = 0;
        if (r > 0) {
            final int scrollX = this.getScrollX();
            int paddingLeft = this.getPaddingLeft();
            int paddingRight = this.getPaddingRight();
            final int width = this.getWidth();
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                final cks cks = (cks)child.getLayoutParams();
                if (cks.a) {
                    final int n5 = cks.b & 0x7;
                    int max;
                    if (n5 != 1) {
                        if (n5 != 3) {
                            if (n5 != 5) {
                                final int n6 = paddingLeft;
                                max = paddingLeft;
                                paddingLeft = n6;
                            }
                            else {
                                max = width - paddingRight - child.getMeasuredWidth();
                                paddingRight += child.getMeasuredWidth();
                            }
                        }
                        else {
                            final int n7 = child.getWidth() + paddingLeft;
                            max = paddingLeft;
                            paddingLeft = n7;
                        }
                    }
                    else {
                        max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    final int n8 = max + scrollX - child.getLeft();
                    if (n8 != 0) {
                        child.offsetLeftAndRight(n8);
                    }
                }
            }
        }
        final cku f = this.f;
        if (f != null) {
            f.b(n, n2, n3);
        }
        final List s = this.S;
        if (s != null) {
            for (int size = s.size(), j = n4; j < size; ++j) {
                final cku cku = this.S.get(j);
                if (cku != null) {
                    cku.b(n, n2, n3);
                }
            }
        }
        this.Q = true;
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new cks();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new cks(this.getContext(), set);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    protected final int getChildDrawingOrder(final int n, final int n2) {
        throw null;
    }
    
    public final void h() {
        this.i(this.c);
    }
    
    final void i(int i) {
        final int c = this.c;
        ckr d;
        if (c != i) {
            d = this.d(c);
            this.c = i;
        }
        else {
            d = null;
        }
        if (this.b == null) {
            return;
        }
        if (this.x) {
            return;
        }
        if (this.getWindowToken() == null) {
            return;
        }
        this.b.f((ViewGroup)this);
        i = this.y;
        final int max = Math.max(0, this.c - i);
        final int j = this.b.j();
        final int min = Math.min(j - 1, this.c + i);
        if (j == this.j) {
            i = 0;
            while (true) {
                while (i < this.k.size()) {
                    final ckr ckr = this.k.get(i);
                    final int b = ckr.b;
                    final int c2 = this.c;
                    if (b >= c2) {
                        if (b != c2) {
                            break;
                        }
                        ckr b2;
                        if ((b2 = ckr) == null) {
                            b2 = ckr;
                            if (j > 0) {
                                b2 = this.b(this.c, i);
                            }
                        }
                        if (b2 != null) {
                            int n = i - 1;
                            ckr ckr2;
                            if (n >= 0) {
                                ckr2 = this.k.get(n);
                            }
                            else {
                                ckr2 = null;
                            }
                            final int x = this.x();
                            float n2;
                            if (x <= 0) {
                                n2 = 0.0f;
                            }
                            else {
                                n2 = 2.0f - b2.d + this.getPaddingLeft() / (float)x;
                            }
                            int k = this.c - 1;
                            float n3 = 0.0f;
                            while (k >= 0) {
                                int n4 = 0;
                                int n5 = 0;
                                ckr ckr3 = null;
                                float n6 = 0.0f;
                                Label_0551: {
                                    ckr ckr4 = null;
                                    Label_0541: {
                                        int n7;
                                        int n8;
                                        if (n3 >= n2 && k < max) {
                                            if (ckr2 == null) {
                                                break;
                                            }
                                            n4 = i;
                                            n5 = n;
                                            ckr3 = ckr2;
                                            n6 = n3;
                                            if (k != ckr2.b) {
                                                break Label_0551;
                                            }
                                            n4 = i;
                                            n5 = n;
                                            ckr3 = ckr2;
                                            n6 = n3;
                                            if (ckr2.c) {
                                                break Label_0551;
                                            }
                                            this.k.remove(n);
                                            this.b.d((ViewGroup)this, k, ckr2.a);
                                            --n;
                                            n7 = --i;
                                            n8 = n;
                                            n6 = n3;
                                            if (n >= 0) {
                                                ckr4 = this.k.get(n);
                                                n6 = n3;
                                                break Label_0541;
                                            }
                                        }
                                        else if (ckr2 != null && k == ckr2.b) {
                                            final float n9 = n3 + ckr2.d;
                                            --n;
                                            n7 = i;
                                            n8 = n;
                                            n6 = n9;
                                            if (n >= 0) {
                                                ckr4 = this.k.get(n);
                                                n6 = n9;
                                                break Label_0541;
                                            }
                                        }
                                        else {
                                            final float n10 = n3 + this.b(k, n + 1).d;
                                            n7 = ++i;
                                            n8 = n;
                                            n6 = n10;
                                            if (n >= 0) {
                                                ckr4 = this.k.get(n);
                                                n6 = n10;
                                                break Label_0541;
                                            }
                                        }
                                        ckr4 = null;
                                        n = n8;
                                        i = n7;
                                    }
                                    ckr3 = ckr4;
                                    n5 = n;
                                    n4 = i;
                                }
                                --k;
                                i = n4;
                                n = n5;
                                ckr2 = ckr3;
                                n3 = n6;
                            }
                            float d2 = b2.d;
                            int n11 = i + 1;
                            if (d2 < 2.0f) {
                                ckr ckr5;
                                if (n11 < this.k.size()) {
                                    ckr5 = this.k.get(n11);
                                }
                                else {
                                    ckr5 = null;
                                }
                                float n12;
                                if (x <= 0) {
                                    n12 = 0.0f;
                                }
                                else {
                                    n12 = this.getPaddingRight() / (float)x + 2.0f;
                                }
                                int l = this.c + 1;
                                int n13 = n11;
                                ckr ckr6 = ckr5;
                                while (l < j) {
                                    float n14 = 0.0f;
                                    ckr ckr7 = null;
                                    int n15 = 0;
                                    Label_0922: {
                                        if (d2 >= n12 && l > min) {
                                            if (ckr6 == null) {
                                                break;
                                            }
                                            n14 = d2;
                                            ckr7 = ckr6;
                                            n15 = n13;
                                            if (l != ckr6.b) {
                                                break Label_0922;
                                            }
                                            n14 = d2;
                                            ckr7 = ckr6;
                                            n15 = n13;
                                            if (ckr6.c) {
                                                break Label_0922;
                                            }
                                            this.k.remove(n13);
                                            this.b.d((ViewGroup)this, l, ckr6.a);
                                            n14 = d2;
                                            if ((n15 = n13) < this.k.size()) {
                                                ckr7 = this.k.get(n13);
                                                n14 = d2;
                                                n15 = n13;
                                                break Label_0922;
                                            }
                                        }
                                        else if (ckr6 != null && l == ckr6.b) {
                                            final float n16 = d2 + ckr6.d;
                                            ++n13;
                                            n14 = n16;
                                            if ((n15 = n13) < this.k.size()) {
                                                ckr7 = this.k.get(n13);
                                                n14 = n16;
                                                n15 = n13;
                                                break Label_0922;
                                            }
                                        }
                                        else {
                                            n15 = n13 + 1;
                                            n14 = d2 + this.b(l, n13).d;
                                            if (n15 < this.k.size()) {
                                                ckr7 = (ckr)this.k.get(n15);
                                                break Label_0922;
                                            }
                                        }
                                        ckr7 = null;
                                    }
                                    ++l;
                                    d2 = n14;
                                    ckr6 = ckr7;
                                    n13 = n15;
                                }
                            }
                            int m = this.b.j();
                            final int x2 = this.x();
                            float n17;
                            if (x2 > 0) {
                                n17 = 0.0f / x2;
                            }
                            else {
                                n17 = 0.0f;
                            }
                            if (d != null) {
                                int b3 = d.b;
                                final int b4 = b2.b;
                                if (b3 < b4) {
                                    float n18 = d.e + d.d + n17;
                                    ++b3;
                                    int n20;
                                    for (int n19 = 0; b3 <= b2.b && n19 < this.k.size(); b3 = n20 + 1) {
                                        ckr ckr8 = this.k.get(n19);
                                        float e;
                                        while (true) {
                                            n20 = b3;
                                            e = n18;
                                            if (b3 <= ckr8.b) {
                                                break;
                                            }
                                            n20 = b3;
                                            e = n18;
                                            if (n19 >= this.k.size() - 1) {
                                                break;
                                            }
                                            ++n19;
                                            ckr8 = this.k.get(n19);
                                        }
                                        while (n20 < ckr8.b) {
                                            e += n17 + 1.0f;
                                            ++n20;
                                        }
                                        ckr8.e = e;
                                        n18 = e + (ckr8.d + n17);
                                    }
                                }
                                else if (b3 > b4) {
                                    int n21 = this.k.size() - 1;
                                    float e2 = d.e;
                                    while (true) {
                                        final int n22 = b3 - 1;
                                        if (n22 < b2.b || n21 < 0) {
                                            break;
                                        }
                                        ckr ckr9 = this.k.get(n21);
                                        float n23;
                                        while (true) {
                                            n23 = e2;
                                            b3 = n22;
                                            if (n22 >= ckr9.b) {
                                                break;
                                            }
                                            n23 = e2;
                                            b3 = n22;
                                            if (n21 <= 0) {
                                                break;
                                            }
                                            --n21;
                                            ckr9 = this.k.get(n21);
                                        }
                                        while (b3 > ckr9.b) {
                                            n23 -= n17 + 1.0f;
                                            --b3;
                                        }
                                        e2 = n23 - (ckr9.d + n17);
                                        ckr9.e = e2;
                                    }
                                }
                            }
                            final int size = this.k.size();
                            float e3 = b2.e;
                            final int b5 = b2.b;
                            final int n24 = b5 - 1;
                            float t;
                            if (b5 == 0) {
                                t = e3;
                            }
                            else {
                                t = -3.4028235E38f;
                            }
                            this.t = t;
                            --m;
                            float u;
                            if (b5 == m) {
                                u = b2.d + e3 - 1.0f;
                            }
                            else {
                                u = Float.MAX_VALUE;
                            }
                            this.u = u;
                            final int n25 = i - 1;
                            i = n24;
                            for (int n26 = n25; n26 >= 0; --n26, --i) {
                                final ckr ckr10 = this.k.get(n26);
                                int b6;
                                while (true) {
                                    b6 = ckr10.b;
                                    if (i <= b6) {
                                        break;
                                    }
                                    --i;
                                    e3 -= n17 + 1.0f;
                                }
                                e3 -= ckr10.d + n17;
                                ckr10.e = e3;
                                if (b6 == 0) {
                                    this.t = e3;
                                }
                            }
                            float e4 = b2.e + b2.d + n17;
                            i = b2.b;
                            while (true) {
                                ++i;
                                if (n11 >= size) {
                                    break;
                                }
                                final ckr ckr11 = this.k.get(n11);
                                int b7;
                                while (true) {
                                    b7 = ckr11.b;
                                    if (i >= b7) {
                                        break;
                                    }
                                    ++i;
                                    e4 += n17 + 1.0f;
                                }
                                if (b7 == m) {
                                    this.u = ckr11.d + e4 - 1.0f;
                                }
                                ckr11.e = e4;
                                e4 += ckr11.d + n17;
                                ++n11;
                            }
                            this.b.i((ViewGroup)this, b2.a);
                        }
                        this.b.h();
                        int childCount;
                        View child;
                        cks cks;
                        ckr c3;
                        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                            child = this.getChildAt(i);
                            cks = (cks)child.getLayoutParams();
                            cks.f = i;
                            if (!cks.a && cks.c == 0.0f) {
                                c3 = this.c(child);
                                if (c3 != null) {
                                    cks.c = c3.d;
                                    cks.e = c3.b;
                                }
                            }
                        }
                        if (this.hasFocus()) {
                            View focus = this.findFocus();
                            ckr c4 = null;
                            Label_1785: {
                                if (focus != null) {
                                    while (true) {
                                        final ViewParent parent = focus.getParent();
                                        if (parent == this) {
                                            c4 = this.c(focus);
                                            break Label_1785;
                                        }
                                        if (!(parent instanceof View)) {
                                            break;
                                        }
                                        focus = (View)parent;
                                    }
                                }
                                c4 = null;
                            }
                            if (c4 == null || c4.b != this.c) {
                                View child2;
                                ckr c5;
                                for (i = 0; i < this.getChildCount(); ++i) {
                                    child2 = this.getChildAt(i);
                                    c5 = this.c(child2);
                                    if (c5 != null && c5.b == this.c && child2.requestFocus(2)) {
                                        break;
                                    }
                                }
                            }
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final ckr ckr = null;
                continue;
            }
        }
        String s;
        try {
            s = this.getResources().getResourceName(this.getId());
        }
        catch (final Resources$NotFoundException ex) {
            s = Integer.toHexString(this.getId());
        }
        final StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
        sb.append(this.j);
        sb.append(", found: ");
        sb.append(j);
        sb.append(" Pager id: ");
        sb.append(s);
        sb.append(" Pager class: ");
        sb.append(this.getClass());
        sb.append(" Problematic adapter: ");
        sb.append(this.b.getClass());
        throw new IllegalStateException(sb.toString());
    }
    
    public void j(final cku cku) {
        final List s = this.S;
        if (s != null) {
            s.remove(cku);
        }
    }
    
    public final void k(final cko b) {
        final cko b2 = this.b;
        final int n = 0;
        if (b2 != null) {
            b2.n((DataSetObserver)null);
            this.b.f((ViewGroup)this);
            for (int i = 0; i < this.k.size(); ++i) {
                final ckr ckr = this.k.get(i);
                this.b.d((ViewGroup)this, ckr.b, ckr.a);
            }
            this.b.h();
            this.k.clear();
            int n2;
            for (int j = 0; j < this.getChildCount(); j = n2 + 1) {
                n2 = j;
                if (!((cks)this.getChildAt(j).getLayoutParams()).a) {
                    this.removeViewAt(j);
                    n2 = j - 1;
                }
            }
            this.scrollTo(this.c = 0, 0);
        }
        this.b = b;
        this.j = 0;
        if (b != null) {
            if (this.s == null) {
                this.s = new ckv(this);
            }
            this.b.n((DataSetObserver)this.s);
            this.x = false;
            final boolean p = this.P;
            this.P = true;
            this.j = this.b.j();
            if (this.n >= 0) {
                this.b.e(this.o, this.p);
                this.n(this.n, false, true);
                this.n = -1;
                this.o = null;
                this.p = null;
            }
            else if (!p) {
                this.h();
            }
            else {
                this.requestLayout();
            }
        }
        final List g = this.g;
        if (g != null && !g.isEmpty()) {
            for (int size = this.g.size(), k = n; k < size; ++k) {
                final adxo adxo = this.g.get(k);
                final TabLayout tabLayout = (TabLayout)adxo.b;
                if (tabLayout.A == this) {
                    tabLayout.k(b, adxo.a);
                }
            }
        }
    }
    
    public void l(final int n) {
        this.x = false;
        this.n(n, this.P ^ true, false);
    }
    
    public void m(final int n, final boolean b) {
        this.n(n, b, this.x = false);
    }
    
    final void n(final int n, final boolean b, final boolean b2) {
        this.o(n, b, b2, 0);
    }
    
    final void o(int i, final boolean b, final boolean b2, final int n) {
        final cko b3 = this.b;
        final boolean b4 = false;
        if (b3 == null || b3.j() <= 0) {
            this.E(false);
            return;
        }
        if (!b2 && this.c == i && this.k.size() != 0) {
            this.E(false);
            return;
        }
        int c;
        if (i < 0) {
            c = 0;
        }
        else if ((c = i) >= this.b.j()) {
            c = this.b.j() - 1;
        }
        i = this.y;
        final int c2 = this.c;
        if (c > c2 + i || c < c2 - i) {
            for (i = 0; i < this.k.size(); ++i) {
                this.k.get(i).c = true;
            }
        }
        boolean b5 = b4;
        if (this.c != c) {
            b5 = true;
        }
        if (this.P) {
            this.c = c;
            if (b5) {
                this.B(c);
            }
            this.requestLayout();
            return;
        }
        this.i(c);
        this.D(c, b, n, b5);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }
    
    protected final void onDetachedFromWindow() {
        this.removeCallbacks(this.T);
        final Scroller q = this.q;
        if (q != null && !q.isFinished()) {
            this.q.abortAnimation();
        }
        super.onDetachedFromWindow();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int n = motionEvent.getAction() & 0xFF;
        if (n != 3 && n != 1) {
            if (n != 0) {
                if (this.z) {
                    return true;
                }
                if (this.A) {
                    return false;
                }
                if (n != 2) {
                    if (n == 6) {
                        this.C(motionEvent);
                    }
                }
                else {
                    final int j = this.J;
                    if (j != -1) {
                        final int pointerIndex = motionEvent.findPointerIndex(j);
                        final float x = motionEvent.getX(pointerIndex);
                        final float n2 = x - this.F;
                        final float abs = Math.abs(n2);
                        final float y = motionEvent.getY(pointerIndex);
                        final float abs2 = Math.abs(y - this.I);
                        Label_0225: {
                            if (n2 != 0.0f) {
                                final float f = this.F;
                                if (!this.E) {
                                    if (f < this.C && n2 > 0.0f) {
                                        break Label_0225;
                                    }
                                    if (f > this.getWidth() - this.C && n2 < 0.0f) {
                                        break Label_0225;
                                    }
                                }
                                if (this.t((View)this, false, (int)n2, (int)x, (int)y)) {
                                    this.F = x;
                                    this.G = y;
                                    this.A = true;
                                    return false;
                                }
                            }
                        }
                        final float n3 = (float)this.D;
                        if (abs > n3 && abs * 0.5f > abs2) {
                            this.z = true;
                            this.I();
                            this.r(1);
                            float f2;
                            if (n2 > 0.0f) {
                                f2 = this.H + this.D;
                            }
                            else {
                                f2 = this.H - this.D;
                            }
                            this.F = f2;
                            this.G = y;
                            this.E(true);
                        }
                        else if (abs2 > n3) {
                            this.A = true;
                        }
                        if (this.z && this.G(x, y)) {
                            ana.H((View)this);
                        }
                    }
                }
            }
            else {
                final float x2 = motionEvent.getX();
                this.H = x2;
                this.F = x2;
                final float y2 = motionEvent.getY();
                this.I = y2;
                this.G = y2;
                this.J = motionEvent.getPointerId(0);
                this.A = false;
                this.r = true;
                this.q.computeScrollOffset();
                if (this.U == 2 && Math.abs(this.q.getFinalX() - this.q.getCurrX()) > this.O) {
                    this.q.abortAnimation();
                    this.x = false;
                    this.h();
                    this.z = true;
                    this.I();
                    this.r(1);
                }
                else if (aph.b(this.d) == 0.0f && aph.b(this.e) == 0.0f) {
                    this.A(false);
                    this.z = false;
                }
                else {
                    this.z = true;
                    this.r(1);
                    if (aph.b(this.d) != 0.0f) {
                        aph.c(this.d, 0.0f, 1.0f - this.G / this.getHeight());
                    }
                    if (aph.b(this.e) != 0.0f) {
                        aph.c(this.e, 0.0f, this.G / this.getHeight());
                    }
                }
            }
            if (this.K == null) {
                this.K = VelocityTracker.obtain();
            }
            this.K.addMovement(motionEvent);
            return this.z;
        }
        this.H();
        return false;
    }
    
    protected final void onLayout(final boolean b, int paddingTop, int paddingLeft, int paddingBottom, int paddingRight) {
        final int childCount = this.getChildCount();
        final int n = paddingBottom - paddingTop;
        final int n2 = paddingRight - paddingLeft;
        paddingLeft = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int i = 0;
        int r = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n3 = paddingLeft;
            int n4 = paddingTop;
            int n5 = paddingRight;
            int n6 = paddingBottom;
            int n7 = r;
            if (child.getVisibility() != 8) {
                final cks cks = (cks)child.getLayoutParams();
                n3 = paddingLeft;
                n4 = paddingTop;
                n5 = paddingRight;
                n6 = paddingBottom;
                n7 = r;
                if (cks.a) {
                    final int b2 = cks.b;
                    final int n8 = b2 & 0x70;
                    final int n9 = b2 & 0x7;
                    int n11 = 0;
                    Label_0246: {
                        int max;
                        if (n9 != 1) {
                            if (n9 == 3) {
                                final int n10 = child.getMeasuredWidth() + paddingLeft;
                                n11 = paddingLeft;
                                paddingLeft = n10;
                                break Label_0246;
                            }
                            if (n9 != 5) {
                                final int n12 = paddingLeft;
                                n11 = paddingLeft;
                                paddingLeft = n12;
                                break Label_0246;
                            }
                            max = n - paddingRight - child.getMeasuredWidth();
                            paddingRight += child.getMeasuredWidth();
                        }
                        else {
                            max = Math.max((n - child.getMeasuredWidth()) / 2, paddingLeft);
                        }
                        n11 = max;
                    }
                    int max2;
                    if (n8 != 16) {
                        if (n8 != 48) {
                            if (n8 != 80) {
                                final int n13 = paddingTop;
                                max2 = paddingTop;
                                paddingTop = n13;
                            }
                            else {
                                max2 = n2 - paddingBottom - child.getMeasuredHeight();
                                paddingBottom += child.getMeasuredHeight();
                            }
                        }
                        else {
                            final int n14 = child.getMeasuredHeight() + paddingTop;
                            max2 = paddingTop;
                            paddingTop = n14;
                        }
                    }
                    else {
                        max2 = Math.max((n2 - child.getMeasuredHeight()) / 2, paddingTop);
                    }
                    final int n15 = n11 + scrollX;
                    child.layout(n15, max2, child.getMeasuredWidth() + n15, max2 + child.getMeasuredHeight());
                    n7 = r + 1;
                    n6 = paddingBottom;
                    n5 = paddingRight;
                    n4 = paddingTop;
                    n3 = paddingLeft;
                }
            }
            ++i;
            paddingLeft = n3;
            paddingTop = n4;
            paddingRight = n5;
            paddingBottom = n6;
            r = n7;
        }
        for (int j = 0; j < childCount; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final cks cks2 = (cks)child2.getLayoutParams();
                if (!cks2.a) {
                    final ckr c = this.c(child2);
                    if (c != null) {
                        final float n16 = (float)(n - paddingLeft - paddingRight);
                        final int n17 = (int)(c.e * n16) + paddingLeft;
                        if (cks2.d) {
                            cks2.d = false;
                            child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n16 * cks2.c), 1073741824), View$MeasureSpec.makeMeasureSpec(n2 - paddingTop - paddingBottom, 1073741824));
                        }
                        child2.layout(n17, paddingTop, child2.getMeasuredWidth() + n17, child2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.R = r;
        if (this.P) {
            this.D(this.c, false, 0, false);
        }
        this.P = false;
    }
    
    protected final void onMeasure(int measuredWidth, int i) {
        this.setMeasuredDimension(getDefaultSize(0, measuredWidth), getDefaultSize(0, i));
        measuredWidth = this.getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        measuredWidth = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
        i = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        final int childCount = this.getChildCount();
        int n = 0;
        while (true) {
            final int n2 = 1;
            int n3 = 1073741824;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            int n4 = measuredWidth;
            int n5 = i;
            if (child.getVisibility() != 8) {
                final cks cks = (cks)child.getLayoutParams();
                n4 = measuredWidth;
                n5 = i;
                if (cks != null) {
                    n4 = measuredWidth;
                    n5 = i;
                    if (cks.a) {
                        final int b = cks.b;
                        final int n6 = b & 0x7;
                        final int n7 = b & 0x70;
                        final boolean b2 = n7 == 48 || n7 == 80;
                        int n8 = n2;
                        if (n6 != 3) {
                            if (n6 == 5) {
                                n8 = n2;
                            }
                            else {
                                n8 = 0;
                            }
                        }
                        final int n9 = Integer.MIN_VALUE;
                        int n10 = 0;
                        int n11 = 0;
                        Label_0256: {
                            if (b2) {
                                n10 = 1073741824;
                            }
                            else {
                                n10 = n9;
                                if (n8 != 0) {
                                    n11 = 1073741824;
                                    n10 = n9;
                                    break Label_0256;
                                }
                            }
                            n11 = Integer.MIN_VALUE;
                        }
                        int n12;
                        int n13;
                        if (cks.width != -2) {
                            int width;
                            if (cks.width != -1) {
                                width = cks.width;
                            }
                            else {
                                width = measuredWidth;
                            }
                            n12 = 1073741824;
                            n13 = width;
                        }
                        else {
                            n13 = measuredWidth;
                            n12 = n10;
                        }
                        int height;
                        if (cks.height != -2) {
                            if (cks.height != -1) {
                                height = cks.height;
                            }
                            else {
                                height = i;
                            }
                        }
                        else {
                            final int n14 = i;
                            n3 = n11;
                            height = n14;
                        }
                        child.measure(View$MeasureSpec.makeMeasureSpec(n13, n12), View$MeasureSpec.makeMeasureSpec(height, n3));
                        if (b2) {
                            n5 = i - child.getMeasuredHeight();
                            n4 = measuredWidth;
                        }
                        else {
                            n4 = measuredWidth;
                            n5 = i;
                            if (n8 != 0) {
                                n4 = measuredWidth - child.getMeasuredWidth();
                                n5 = i;
                            }
                        }
                    }
                }
            }
            ++n;
            measuredWidth = n4;
            i = n5;
        }
        View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.v = true;
        this.h();
        i = 0;
        this.v = false;
        while (i < this.getChildCount()) {
            final View child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                final cks cks2 = (cks)child2.getLayoutParams();
                if (cks2 == null || !cks2.a) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(measuredWidth * cks2.c), 1073741824), measureSpec);
                }
            }
            ++i;
        }
    }
    
    protected final boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int childCount = this.getChildCount();
        int i;
        int n2;
        if ((n & 0x2) != 0x0) {
            i = 0;
            n2 = 1;
        }
        else {
            i = childCount - 1;
            childCount = -1;
            n2 = -1;
        }
        while (i != childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final ckr c = this.c(child);
                if (c != null && c.b == this.c) {
                    if (child.requestFocus(n, rect)) {
                        return true;
                    }
                }
            }
            i += n2;
        }
        return false;
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)viewPager$SavedState).d);
        final cko b = this.b;
        if (b != null) {
            b.e(viewPager$SavedState.b, viewPager$SavedState.e);
            this.n(viewPager$SavedState.a, false, true);
            return;
        }
        this.n = viewPager$SavedState.a;
        this.o = viewPager$SavedState.b;
        this.p = viewPager$SavedState.e;
    }
    
    public final Parcelable onSaveInstanceState() {
        final ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.a = this.c;
        final cko b = this.b;
        if (b != null) {
            viewPager$SavedState.b = b.a();
        }
        return (Parcelable)viewPager$SavedState;
    }
    
    protected final void onSizeChanged(int n, int paddingLeft, final int n2, int paddingRight) {
        super.onSizeChanged(n, paddingLeft, n2, paddingRight);
        if (n != n2) {
            if (n2 > 0 && !this.k.isEmpty()) {
                if (!this.q.isFinished()) {
                    this.q.setFinalX(this.a() * this.x());
                    return;
                }
                paddingLeft = this.getPaddingLeft();
                paddingRight = this.getPaddingRight();
                this.scrollTo((int)(this.getScrollX() / (float)(n2 - this.getPaddingLeft() - this.getPaddingRight()) * (n - paddingLeft - paddingRight)), this.getScrollY());
            }
            else {
                final ckr d = this.d(this.c);
                float min;
                if (d != null) {
                    min = Math.min(d.e, this.u);
                }
                else {
                    min = 0.0f;
                }
                n = (int)(min * (n - this.getPaddingLeft() - this.getPaddingRight()));
                if (n != this.getScrollX()) {
                    this.A(false);
                    this.scrollTo(n, this.getScrollY());
                }
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        final cko b = this.b;
        if (b != null && b.j() != 0) {
            if (this.K == null) {
                this.K = VelocityTracker.obtain();
            }
            this.K.addMovement(motionEvent);
            final int n = motionEvent.getAction() & 0xFF;
            if (n != 0) {
                boolean b2 = false;
                Label_0726: {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n == 5) {
                                    final int actionIndex = motionEvent.getActionIndex();
                                    this.F = motionEvent.getX(actionIndex);
                                    this.J = motionEvent.getPointerId(actionIndex);
                                    return true;
                                }
                                if (n != 6) {
                                    return true;
                                }
                                this.C(motionEvent);
                                this.F = motionEvent.getX(motionEvent.findPointerIndex(this.J));
                                return true;
                            }
                            else {
                                if (!this.z) {
                                    return true;
                                }
                                this.D(this.c, true, 0, false);
                                b2 = this.H();
                            }
                        }
                        else {
                            if (!this.z) {
                                final int pointerIndex = motionEvent.findPointerIndex(this.J);
                                if (pointerIndex == -1) {
                                    b2 = this.H();
                                    break Label_0726;
                                }
                                final float x = motionEvent.getX(pointerIndex);
                                final float abs = Math.abs(x - this.F);
                                final float y = motionEvent.getY(pointerIndex);
                                final float abs2 = Math.abs(y - this.G);
                                if (abs > this.D && abs > abs2) {
                                    this.z = true;
                                    this.I();
                                    final float h = this.H;
                                    float f;
                                    if (x - h > 0.0f) {
                                        f = h + this.D;
                                    }
                                    else {
                                        f = h - this.D;
                                    }
                                    this.F = f;
                                    this.G = y;
                                    this.r(1);
                                    this.E(true);
                                    final ViewParent parent = this.getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                            if (!this.z) {
                                return true;
                            }
                            final int pointerIndex2 = motionEvent.findPointerIndex(this.J);
                            b2 = this.G(motionEvent.getX(pointerIndex2), motionEvent.getY(pointerIndex2));
                        }
                    }
                    else {
                        if (!this.z) {
                            return true;
                        }
                        final VelocityTracker k = this.K;
                        k.computeCurrentVelocity(1000, (float)this.M);
                        final int n2 = (int)k.getXVelocity(this.J);
                        this.x = true;
                        final int x2 = this.x();
                        final int scrollX = this.getScrollX();
                        final ckr z = this.z();
                        final float n3 = (float)x2;
                        final int b3 = z.b;
                        final float n4 = (scrollX / n3 - z.e) / (z.d + 0.0f / n3);
                        int n5;
                        if (Math.abs((int)(motionEvent.getX(motionEvent.findPointerIndex(this.J)) - this.H)) > this.N && Math.abs(n2) > this.L && aph.b(this.d) == 0.0f && aph.b(this.e) == 0.0f) {
                            if (n2 > 0) {
                                n5 = b3;
                            }
                            else {
                                n5 = b3 + 1;
                            }
                        }
                        else {
                            float n6;
                            if (b3 >= this.c) {
                                n6 = 0.4f;
                            }
                            else {
                                n6 = 0.6f;
                            }
                            n5 = (int)(n4 + n6) + b3;
                        }
                        int max = n5;
                        if (this.k.size() > 0) {
                            final ckr ckr = this.k.get(0);
                            final ArrayList i = this.k;
                            max = Math.max(ckr.b, Math.min(n5, ((ckr)i.get(i.size() - 1)).b));
                        }
                        this.o(max, true, true, n2);
                        b2 = this.H();
                        if (max == b3 && b2) {
                            if (aph.b(this.e) != 0.0f) {
                                this.e.onAbsorb(-n2);
                            }
                            else if (aph.b(this.d) != 0.0f) {
                                this.d.onAbsorb(n2);
                            }
                        }
                    }
                }
                if (b2) {
                    ana.H((View)this);
                }
            }
            else {
                this.q.abortAnimation();
                this.x = false;
                this.h();
                final float x3 = motionEvent.getX();
                this.H = x3;
                this.F = x3;
                final float y2 = motionEvent.getY();
                this.I = y2;
                this.G = y2;
                this.J = motionEvent.getPointerId(0);
            }
            return true;
        }
        return false;
    }
    
    public final void p(final int y) {
        if (y != this.y) {
            this.y = y;
            this.h();
        }
    }
    
    @Deprecated
    public void q(final cku f) {
        this.f = f;
    }
    
    public final void r(final int u) {
        if (this.U == u) {
            return;
        }
        this.U = u;
        final cku f = this.f;
        if (f != null) {
            f.a(u);
        }
        final List s = this.S;
        if (s != null) {
            for (int size = s.size(), i = 0; i < size; ++i) {
                final cku cku = this.S.get(i);
                if (cku != null) {
                    cku.a(u);
                }
            }
        }
    }
    
    public final void removeView(final View view) {
        if (this.v) {
            this.removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }
    
    public final boolean s(final int n) {
        final View focus = this.findFocus();
        View view = null;
        Label_0140: {
            if (focus != this) {
                if ((view = focus) == null) {
                    break Label_0140;
                }
                for (ViewParent viewParent = focus.getParent(); viewParent instanceof ViewGroup; viewParent = viewParent.getParent()) {
                    if (viewParent == this) {
                        view = focus;
                        break Label_0140;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(focus.getClass().getSimpleName());
                for (ViewParent viewParent2 = focus.getParent(); viewParent2 instanceof ViewGroup; viewParent2 = viewParent2.getParent()) {
                    sb.append(" => ");
                    sb.append(viewParent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            }
            view = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
        boolean b = false;
        if (nextFocus != null && nextFocus != view) {
            if (n == 17) {
                final int left = this.y(this.m, nextFocus).left;
                final int left2 = this.y(this.m, view).left;
                if (view != null && left >= left2) {
                    b = this.u();
                }
                else {
                    b = nextFocus.requestFocus();
                }
            }
            else if (n == 66) {
                final int left3 = this.y(this.m, nextFocus).left;
                final int left4 = this.y(this.m, view).left;
                if (view != null && left3 <= left4) {
                    b = this.v();
                }
                else {
                    b = nextFocus.requestFocus();
                }
            }
        }
        else if (n != 17 && n != 1) {
            if (n == 66 || n == 2) {
                b = this.v();
            }
        }
        else {
            b = this.u();
        }
        if (b) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
        }
        return b;
    }
    
    protected boolean t(final View view, final boolean b, final int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                final int n4 = childCount - 1;
                if (n4 < 0) {
                    break;
                }
                final View child = viewGroup.getChildAt(n4);
                final int n5 = n2 + scrollX;
                childCount = n4;
                if (n5 < child.getLeft()) {
                    continue;
                }
                childCount = n4;
                if (n5 >= child.getRight()) {
                    continue;
                }
                final int n6 = n3 + scrollY;
                childCount = n4;
                if (n6 < child.getTop()) {
                    continue;
                }
                childCount = n4;
                if (n6 >= child.getBottom()) {
                    continue;
                }
                if (this.t(child, true, n, n5 - child.getLeft(), n6 - child.getTop())) {
                    return true;
                }
                childCount = n4;
            }
        }
        return b && view.canScrollHorizontally(-n);
    }
    
    final boolean u() {
        final int c = this.c;
        if (c > 0) {
            this.m(c - 1, true);
            return true;
        }
        return false;
    }
    
    final boolean v() {
        final cko b = this.b;
        if (b != null && this.c < b.j() - 1) {
            this.m(this.c + 1, true);
            return true;
        }
        return false;
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
    
    final void w(final Context context) {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        this.q = new Scroller(context, ViewPager.i);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        this.D = value.getScaledPagingTouchSlop();
        this.L = (int)(400.0f * density);
        this.M = value.getScaledMaximumFlingVelocity();
        this.d = new EdgeEffect(context);
        this.e = new EdgeEffect(context);
        this.N = (int)(25.0f * density);
        this.O = (int)(density + density);
        this.B = (int)(density * 16.0f);
        ana.N((View)this, (akv)new ckt(this));
        if (ana.d((View)this) == 0) {
            ana.X((View)this, 1);
        }
        ana.Z((View)this, (alv)new ckp(this));
    }
}
