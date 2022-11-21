import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.KeyEvent;
import android.util.Log;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.Gravity;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.window.OnBackInvokedDispatcher;
import android.window.OnBackInvokedCallback;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public class aqs extends ViewGroup
{
    static final int[] a;
    public static final int h = 0;
    private static final int[] i;
    private static final boolean j;
    private float A;
    private Drawable B;
    private final ArrayList C;
    private Rect D;
    private Matrix E;
    private final apc F;
    public final aqj b;
    public final aqj c;
    public int d;
    public boolean e;
    public aoc f;
    public boolean g;
    private float k;
    private final int l;
    private int m;
    private float n;
    private final Paint o;
    private final aqr p;
    private final aqr q;
    private boolean r;
    private boolean s;
    private OnBackInvokedCallback t;
    private OnBackInvokedDispatcher u;
    private int v;
    private int w;
    private int x;
    private int y;
    private float z;
    
    static {
        boolean k = true;
        i = new int[] { 16843828 };
        a = new int[] { 16842931 };
        if (Build$VERSION.SDK_INT < 29) {
            k = false;
        }
        j = k;
    }
    
    public aqs(final Context context) {
        this(context, null);
    }
    
    public aqs(final Context context, final AttributeSet set) {
        this(context, set, 2130969283);
    }
    
    public aqs(final Context context, AttributeSet obtainStyledAttributes, final int n) {
        super(context, obtainStyledAttributes, n);
        new aqp();
        this.m = -1728053248;
        this.o = new Paint();
        this.s = true;
        this.v = 3;
        this.w = 3;
        this.x = 3;
        this.y = 3;
        this.F = (apc)new aql(this);
        this.setDescendantFocusability(262144);
        final float density = this.getResources().getDisplayMetrics().density;
        this.l = (int)(64.0f * density + 0.5f);
        final float n2 = density * 400.0f;
        final aqr p3 = new aqr(this, 3);
        this.p = p3;
        final aqr q = new aqr(this, 5);
        this.q = q;
        final aqj c = aqj.c(this, 1.0f, (aqi)p3);
        this.b = c;
        c.j = 1;
        c.g = n2;
        p3.b = c;
        final aqj c2 = aqj.c(this, 1.0f, (aqi)q);
        this.c = c2;
        c2.j = 2;
        c2.g = n2;
        q.b = c2;
        this.setFocusableInTouchMode(true);
        anc.X((View)this, 1);
        anc.N((View)this, (akx)new aqn(this));
        this.setMotionEventSplittingEnabled(false);
        if (anc.ai((View)this)) {
            anc.Z((View)this, (alx)aqm.a);
            this.setSystemUiVisibility(1280);
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(aqs.i);
            try {
                this.B = obtainStyledAttributes2.getDrawable(0);
            }
            finally {
                obtainStyledAttributes2.recycle();
            }
        }
        obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, aqk.a, n, 0);
        try {
            if (((TypedArray)obtainStyledAttributes).hasValue(0)) {
                this.k = ((TypedArray)obtainStyledAttributes).getDimension(0, 0.0f);
            }
            else {
                this.k = this.getResources().getDimension(2131166241);
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.C = new ArrayList();
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public static String f(final int n) {
        if ((n & 0x3) == 0x3) {
            return "LEFT";
        }
        if ((n & 0x5) == 0x5) {
            return "RIGHT";
        }
        return Integer.toHexString(n);
    }
    
    static final boolean q(final View view) {
        return ((aqq)view.getLayoutParams()).a == 0;
    }
    
    static final boolean r(final View view) {
        final int absoluteGravity = Gravity.getAbsoluteGravity(((aqq)view.getLayoutParams()).a, anc.f(view));
        return (absoluteGravity & 0x3) != 0x0 || (absoluteGravity & 0x5) != 0x0;
    }
    
    static final void t(final View view, final float b) {
        final aqq aqq = (aqq)view.getLayoutParams();
        if (b == aqq.b) {
            return;
        }
        aqq.b = b;
    }
    
    public static final boolean u(final View view) {
        if (r(view)) {
            return (((aqq)view.getLayoutParams()).d & 0x1) == 0x1;
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final int a(final View view) {
        if (r(view)) {
            final int a = ((aqq)view.getLayoutParams()).a;
            final int f = anc.f((View)this);
            final int n = 0;
            int n3;
            if (a != 3) {
                if (a != 5) {
                    if (a != 8388611) {
                        if (a != 8388613) {
                            return n;
                        }
                        n3 = this.y;
                        if (n3 == 3) {
                            if (f == 0) {
                                n3 = this.w;
                            }
                            else {
                                n3 = this.v;
                            }
                            final int n2 = n;
                            if (n3 == 3) {
                                return n2;
                            }
                        }
                    }
                    else {
                        n3 = this.x;
                        if (n3 == 3) {
                            if (f == 0) {
                                n3 = this.v;
                            }
                            else {
                                n3 = this.w;
                            }
                            final int n2 = n;
                            if (n3 == 3) {
                                return n2;
                            }
                        }
                    }
                }
                else {
                    n3 = this.w;
                    if (n3 == 3) {
                        if (f == 0) {
                            n3 = this.y;
                        }
                        else {
                            n3 = this.x;
                        }
                        final int n2 = n;
                        if (n3 == 3) {
                            return n2;
                        }
                    }
                }
            }
            else {
                n3 = this.v;
                if (n3 == 3) {
                    int n4;
                    if (f == 0) {
                        n4 = this.x;
                    }
                    else {
                        n4 = this.y;
                    }
                    n3 = n4;
                    if (n4 == 3) {
                        return n;
                    }
                }
            }
            return n3;
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void addFocusables(final ArrayList list, final int n, final int n2) {
        if (this.getDescendantFocusability() == 393216) {
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = 0;
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (r(child)) {
                if (u(child)) {
                    child.addFocusables(list, n, n2);
                    b = true;
                }
            }
            else {
                this.C.add(child);
            }
            ++i;
        }
        if (!b) {
            for (int size = this.C.size(), j = n3; j < size; ++j) {
                final View view = this.C.get(j);
                if (view.getVisibility() == 0) {
                    view.addFocusables(list, n, n2);
                }
            }
        }
        this.C.clear();
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
        if (this.d() == null && !r(view)) {
            anc.X(view, 1);
            return;
        }
        anc.X(view, 4);
    }
    
    final int b(final View view) {
        return Gravity.getAbsoluteGravity(((aqq)view.getLayoutParams()).a, anc.f((View)this));
    }
    
    public final View c(int i) {
        final int absoluteGravity = Gravity.getAbsoluteGravity(i, anc.f((View)this));
        int childCount;
        View child;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if ((this.b(child) & 0x7) == (absoluteGravity & 0x7)) {
                return child;
            }
        }
        return null;
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof aqq && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void computeScroll() {
        final int childCount = this.getChildCount();
        int i = 0;
        float max = 0.0f;
        while (i < childCount) {
            max = Math.max(max, ((aqq)this.getChildAt(i).getLayoutParams()).b);
            ++i;
        }
        this.n = max;
        final boolean n = this.b.n();
        final boolean n2 = this.c.n();
        if (!n && !n2) {
            return;
        }
        anc.H((View)this);
    }
    
    final View d() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((((aqq)child.getLayoutParams()).d & 0x1) == 0x1) {
                return child;
            }
        }
        return null;
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 0x2) != 0x0 && motionEvent.getAction() != 10 && this.n > 0.0f) {
            int childCount = this.getChildCount();
            if (childCount != 0) {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                while (true) {
                    final int n = childCount - 1;
                    if (n < 0) {
                        break;
                    }
                    final View child = this.getChildAt(n);
                    if (this.D == null) {
                        this.D = new Rect();
                    }
                    child.getHitRect(this.D);
                    childCount = n;
                    if (!this.D.contains((int)x, (int)y)) {
                        continue;
                    }
                    if (q(child)) {
                        childCount = n;
                    }
                    else {
                        boolean b;
                        if (!child.getMatrix().isIdentity()) {
                            final int scrollX = this.getScrollX();
                            final int left = child.getLeft();
                            final int scrollY = this.getScrollY();
                            final int top = child.getTop();
                            final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation((float)(scrollX - left), (float)(scrollY - top));
                            final Matrix matrix = child.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.E == null) {
                                    this.E = new Matrix();
                                }
                                matrix.invert(this.E);
                                obtain.transform(this.E);
                            }
                            b = child.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        }
                        else {
                            final int scrollX2 = this.getScrollX();
                            final int left2 = child.getLeft();
                            final int scrollY2 = this.getScrollY();
                            final int top2 = child.getTop();
                            final float n2 = (float)(scrollX2 - left2);
                            final float n3 = (float)(scrollY2 - top2);
                            motionEvent.offsetLocation(n2, n3);
                            b = child.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-n2, -n3);
                        }
                        childCount = n;
                        if (b) {
                            return true;
                        }
                        continue;
                    }
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final int height = this.getHeight();
        final boolean q = q(view);
        int width = this.getWidth();
        final int save = canvas.save();
        int n2 = 0;
        int n3 = width;
        if (q) {
            final int childCount = this.getChildCount();
            int i = 0;
            n2 = 0;
            while (i < childCount) {
                final View child = this.getChildAt(i);
                int n4 = width;
                int n5 = n2;
                if (child != view) {
                    n4 = width;
                    n5 = n2;
                    if (child.getVisibility() == 0) {
                        final Drawable background = child.getBackground();
                        n4 = width;
                        n5 = n2;
                        if (background != null) {
                            n4 = width;
                            n5 = n2;
                            if (background.getOpacity() == -1) {
                                n4 = width;
                                n5 = n2;
                                if (r(child)) {
                                    n4 = width;
                                    n5 = n2;
                                    if (child.getHeight() >= height) {
                                        if (this.n(child, 3)) {
                                            final int right = child.getRight();
                                            n4 = width;
                                            if (right > (n5 = n2)) {
                                                n5 = right;
                                                n4 = width;
                                            }
                                        }
                                        else {
                                            final int left = child.getLeft();
                                            n4 = width;
                                            n5 = n2;
                                            if (left < width) {
                                                n4 = left;
                                                n5 = n2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ++i;
                width = n4;
                n2 = n5;
            }
            canvas.clipRect(n2, 0, width, this.getHeight());
            n3 = width;
        }
        final boolean drawChild = super.drawChild(canvas, view, n);
        canvas.restoreToCount(save);
        final float n6 = this.n;
        if (n6 > 0.0f && q) {
            final int m = this.m;
            this.o.setColor((int)((m >>> 24) * n6) << 24 | (m & 0xFFFFFF));
            canvas.drawRect((float)n2, 0.0f, (float)n3, (float)this.getHeight(), this.o);
        }
        return drawChild;
    }
    
    final View e() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (r(child)) {
                if (!r(child)) {
                    final StringBuilder sb = new StringBuilder("View ");
                    sb.append(child);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (((aqq)child.getLayoutParams()).b > 0.0f) {
                    return child;
                }
            }
        }
        return null;
    }
    
    public final void g() {
        this.h(false);
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new aqq();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new aqq(this.getContext(), set);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        aqq aqq;
        if (viewGroup$LayoutParams instanceof aqq) {
            aqq = new aqq((aqq)viewGroup$LayoutParams);
        }
        else if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            aqq = new aqq((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        else {
            aqq = new aqq(viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)aqq;
    }
    
    final void h(final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            final aqq aqq = (aqq)child.getLayoutParams();
            int n2 = n;
            Label_0130: {
                if (r(child)) {
                    if (b) {
                        n2 = n;
                        if (!aqq.c) {
                            break Label_0130;
                        }
                    }
                    final int width = child.getWidth();
                    boolean b2;
                    if (this.n(child, 3)) {
                        b2 = this.b.l(child, -width, child.getTop());
                    }
                    else {
                        b2 = this.c.l(child, this.getWidth(), child.getTop());
                    }
                    n2 = (n | (b2 ? 1 : 0));
                    aqq.c = false;
                }
            }
            ++i;
            n = n2;
        }
        this.p.n();
        this.q.n();
        if (n != 0) {
            this.invalidate();
        }
    }
    
    public final void i(final int n) {
        this.j(n, 3);
        this.j(n, 5);
    }
    
    public final void j(final int n, final int n2) {
        final int absoluteGravity = Gravity.getAbsoluteGravity(n2, anc.f((View)this));
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 8388611) {
                    if (n2 == 8388613) {
                        this.y = n;
                    }
                }
                else {
                    this.x = n;
                }
            }
            else {
                this.w = n;
            }
        }
        else {
            this.v = n;
        }
        if (n != 0) {
            aqj aqj;
            if (absoluteGravity == 3) {
                aqj = this.b;
            }
            else {
                aqj = this.c;
            }
            aqj.d();
        }
        if (n != 1) {
            if (n == 2) {
                final View c = this.c(absoluteGravity);
                if (c != null) {
                    this.s(c);
                }
            }
        }
        else {
            final View c2 = this.c(absoluteGravity);
            if (c2 != null) {
                this.p(c2);
            }
        }
    }
    
    final void k() {
        if (Build$VERSION.SDK_INT >= 33) {
            final View e = this.e();
            final OnBackInvokedDispatcher b = aqo.b(this);
            if (e != null && b != null && this.a(e) == 0 && anc.am((View)this)) {
                if (this.u == null) {
                    if (this.t == null) {
                        this.t = aqo.a((Runnable)new uw(this, 19));
                    }
                    aqo.c((Object)b, (Object)this.t);
                    this.u = b;
                }
            }
            else {
                final OnBackInvokedDispatcher u = this.u;
                if (u != null) {
                    aqo.d((Object)u, (Object)this.t);
                    this.u = null;
                }
            }
        }
    }
    
    public final void l(final View view) {
        anc.K(view, aom.h.a());
        if (u(view) && this.a(view) != 2) {
            anc.av(view, aom.h, this.F);
        }
    }
    
    public final void m(final View view, final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            Label_0051: {
                if (!b) {
                    if (r(child)) {
                        break Label_0051;
                    }
                }
                else if (child != view) {
                    break Label_0051;
                }
                anc.X(child, 1);
                continue;
            }
            anc.X(child, 4);
        }
    }
    
    final boolean n(final View view, final int n) {
        return (this.b(view) & n) == n;
    }
    
    public final boolean o() {
        final View c = this.c(8388611);
        return c != null && u(c);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
        this.k();
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
        this.k();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.g && this.B != null) {
            final aoc f = this.f;
            int d;
            if (f != null) {
                d = f.d();
            }
            else {
                d = 0;
            }
            if (d > 0) {
                this.B.setBounds(0, 0, this.getWidth(), d);
                this.B.draw(canvas);
            }
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean k = this.b.k(motionEvent);
        final boolean i = this.c.k(motionEvent);
        boolean b3 = false;
        if (actionMasked != 0) {
            Label_0236: {
                Label_0226: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                break Label_0226;
                            }
                        }
                        else {
                            final aqj b = this.b;
                            final float[] c = b.c;
                            if (c != null) {
                                for (int j = 0; j < c.length; ++j) {
                                    if (b.h(j)) {
                                        final float[] c2 = b.c;
                                        if (c2 != null) {
                                            final float[] d = b.d;
                                            if (d != null) {
                                                final float[] e = b.e;
                                                if (e != null) {
                                                    final float[] f = b.f;
                                                    if (f != null) {
                                                        final float n = e[j] - c2[j];
                                                        final float n2 = f[j] - d[j];
                                                        final int b2 = b.b;
                                                        if (n * n + n2 * n2 > b2 * b2) {
                                                            this.p.n();
                                                            this.q.n();
                                                            break;
                                                        }
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                        Log.w("ViewDragHelper", "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
                                    }
                                }
                            }
                        }
                        break Label_0236;
                    }
                }
                this.h(true);
                this.e = false;
            }
            b3 = false;
        }
        else {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            this.z = x;
            this.A = y;
            Label_0303: {
                if (this.n > 0.0f) {
                    final View a = this.b.a((int)x, (int)y);
                    if (a != null && q(a)) {
                        b3 = true;
                        break Label_0303;
                    }
                }
                b3 = false;
            }
            this.e = false;
        }
        if (!(k | i) && !b3) {
            for (int childCount = this.getChildCount(), l = 0; l < childCount; ++l) {
                if (((aqq)this.getChildAt(l).getLayoutParams()).c) {
                    return true;
                }
            }
            if (!this.e) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        int n2 = n;
        if (n == 4) {
            if (this.e() != null) {
                keyEvent.startTracking();
                return true;
            }
            n2 = 4;
        }
        return super.onKeyDown(n2, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            final View e = this.e();
            if (e != null && this.a(e) == 0) {
                this.g();
            }
            return e != null;
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.r = true;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final aqq aqq = (aqq)child.getLayoutParams();
                if (q(child)) {
                    child.layout(aqq.leftMargin, aqq.topMargin, aqq.leftMargin + child.getMeasuredWidth(), aqq.topMargin + child.getMeasuredHeight());
                }
                else {
                    final int measuredWidth = child.getMeasuredWidth();
                    final int measuredHeight = child.getMeasuredHeight();
                    int n7;
                    float n8;
                    if (this.n(child, 3)) {
                        final int n5 = -measuredWidth;
                        final float n6 = (float)measuredWidth;
                        n7 = n5 + (int)(aqq.b * n6);
                        n8 = (measuredWidth + n7) / n6;
                    }
                    else {
                        final int n9 = n3 - n;
                        final float n10 = (float)measuredWidth;
                        n7 = n9 - (int)(aqq.b * n10);
                        n8 = (n9 - n7) / n10;
                    }
                    final float b2 = aqq.b;
                    final int n11 = aqq.a & 0x70;
                    if (n11 != 16) {
                        if (n11 != 80) {
                            child.layout(n7, aqq.topMargin, measuredWidth + n7, aqq.topMargin + measuredHeight);
                        }
                        else {
                            final int n12 = n4 - n2;
                            child.layout(n7, n12 - aqq.bottomMargin - child.getMeasuredHeight(), measuredWidth + n7, n12 - aqq.bottomMargin);
                        }
                    }
                    else {
                        final int n13 = n4 - n2;
                        final int n14 = (n13 - measuredHeight) / 2;
                        int topMargin;
                        if (n14 < aqq.topMargin) {
                            topMargin = aqq.topMargin;
                        }
                        else {
                            topMargin = n14;
                            if (n14 + measuredHeight > n13 - aqq.bottomMargin) {
                                topMargin = n13 - aqq.bottomMargin - measuredHeight;
                            }
                        }
                        child.layout(n7, topMargin, measuredWidth + n7, measuredHeight + topMargin);
                    }
                    if (n8 != b2) {
                        t(child, n8);
                    }
                    int visibility;
                    if (aqq.b > 0.0f) {
                        visibility = 0;
                    }
                    else {
                        visibility = 4;
                    }
                    if (child.getVisibility() != visibility) {
                        child.setVisibility(visibility);
                    }
                }
            }
        }
        if (aqs.j) {
            final aoc w = anc.w((View)this);
            if (w != null) {
                final aic u = w.b.u();
                final aqj b3 = this.b;
                b3.h = Math.max(b3.i, u.b);
                final aqj c = this.c;
                c.h = Math.max(c.i, u.d);
            }
        }
        this.r = false;
        this.s = false;
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        int n3 = mode;
        int n4 = 0;
        int n5 = 0;
        Label_0096: {
            if (mode == 1073741824) {
                n4 = size;
                n5 = size2;
                if (mode2 == 1073741824) {
                    break Label_0096;
                }
                n3 = 1073741824;
            }
            if (!this.isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (n3 == 0) {
                size = 300;
            }
            n4 = size;
            n5 = size2;
            if (mode2 == 0) {
                n5 = 300;
                n4 = size;
            }
        }
        this.setMeasuredDimension(n4, n5);
        final boolean b = this.f != null && anc.ai((View)this);
        final int f = anc.f((View)this);
        final int childCount = this.getChildCount();
        int i = 0;
        int n6 = 0;
        int n7 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            Label_0734: {
                if (child.getVisibility() != 8) {
                    final aqq aqq = (aqq)child.getLayoutParams();
                    if (b) {
                        final int absoluteGravity = Gravity.getAbsoluteGravity(aqq.a, f);
                        if (anc.ai(child)) {
                            final aoc f2 = this.f;
                            aoc aoc;
                            if (absoluteGravity == 3) {
                                aoc = f2.n(f2.b(), f2.d(), 0, f2.a());
                            }
                            else {
                                aoc = f2;
                                if (absoluteGravity == 5) {
                                    aoc = f2.n(0, f2.d(), f2.c(), f2.a());
                                }
                            }
                            anc.v(child, aoc);
                        }
                        else {
                            final aoc f3 = this.f;
                            aoc aoc2;
                            if (absoluteGravity == 3) {
                                aoc2 = f3.n(f3.b(), f3.d(), 0, f3.a());
                            }
                            else {
                                aoc2 = f3;
                                if (absoluteGravity == 5) {
                                    aoc2 = f3.n(0, f3.d(), f3.c(), f3.a());
                                }
                            }
                            aqq.leftMargin = aoc2.b();
                            aqq.topMargin = aoc2.d();
                            aqq.rightMargin = aoc2.c();
                            aqq.bottomMargin = aoc2.a();
                        }
                    }
                    if (q(child)) {
                        child.measure(View$MeasureSpec.makeMeasureSpec(n4 - aqq.leftMargin - aqq.rightMargin, 1073741824), View$MeasureSpec.makeMeasureSpec(n5 - aqq.topMargin - aqq.bottomMargin, 1073741824));
                    }
                    else {
                        if (r(child)) {
                            final float a = anc.a(child);
                            final float k = this.k;
                            if (a != k) {
                                anc.U(child, k);
                            }
                            final int n8 = this.b(child) & 0x7;
                            final boolean b2 = n8 == 3;
                            int n9 = n6;
                            Label_0553: {
                                if (b2) {
                                    if (n6 != 0) {
                                        break Label_0553;
                                    }
                                    n9 = 0;
                                }
                                int n10 = n7;
                                if (!b2) {
                                    if (n7 != 0) {
                                        break Label_0553;
                                    }
                                    n10 = 0;
                                }
                                final int n11 = n9 | (b2 ? 1 : 0);
                                child.measure(getChildMeasureSpec(n, this.l + aqq.leftMargin + aqq.rightMargin, aqq.width), getChildMeasureSpec(n2, aqq.topMargin + aqq.bottomMargin, aqq.height));
                                final int n12 = n10 | ((b2 ? 1 : 0) ^ 0x1);
                                n6 = n11;
                                n7 = n12;
                                break Label_0734;
                            }
                            final StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                            sb.append(f(n8));
                            sb.append(" but this DrawerLayout already has a drawer view along that edge");
                            throw new IllegalStateException(sb.toString());
                        }
                        final StringBuilder sb2 = new StringBuilder("Child ");
                        sb2.append(child);
                        sb2.append(" at index ");
                        sb2.append(i);
                        sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            ++i;
        }
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof DrawerLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final DrawerLayout$SavedState drawerLayout$SavedState = (DrawerLayout$SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)drawerLayout$SavedState).d);
        final int a = drawerLayout$SavedState.a;
        if (a != 0) {
            final View c = this.c(a);
            if (c != null) {
                this.s(c);
            }
        }
        final int b = drawerLayout$SavedState.b;
        if (b != 3) {
            this.j(b, 3);
        }
        final int e = drawerLayout$SavedState.e;
        if (e != 3) {
            this.j(e, 5);
        }
        final int f = drawerLayout$SavedState.f;
        if (f != 3) {
            this.j(f, 8388611);
        }
        final int g = drawerLayout$SavedState.g;
        if (g != 3) {
            this.j(g, 8388613);
        }
    }
    
    public final void onRtlPropertiesChanged(final int n) {
    }
    
    protected final Parcelable onSaveInstanceState() {
        final DrawerLayout$SavedState drawerLayout$SavedState = new DrawerLayout$SavedState(super.onSaveInstanceState());
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final aqq aqq = (aqq)this.getChildAt(i).getLayoutParams();
            final int d = aqq.d;
            if (d == 1 || d == 2) {
                drawerLayout$SavedState.a = aqq.a;
                break;
            }
        }
        drawerLayout$SavedState.b = this.v;
        drawerLayout$SavedState.e = this.w;
        drawerLayout$SavedState.f = this.x;
        drawerLayout$SavedState.g = this.y;
        return (Parcelable)drawerLayout$SavedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.b.f(motionEvent);
        this.c.f(motionEvent);
        final int n = motionEvent.getAction() & 0xFF;
        boolean b = false;
        if (n != 0) {
            if (n != 1) {
                if (n == 3) {
                    this.h(true);
                    this.e = false;
                }
            }
            else {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final View a = this.b.a((int)x, (int)y);
                Label_0156: {
                    if (a != null && q(a)) {
                        final float n2 = x - this.z;
                        final float n3 = y - this.A;
                        final int b2 = this.b.b;
                        if (n2 * n2 + n3 * n3 < b2 * b2) {
                            final View d = this.d();
                            if (d != null && this.a(d) != 2) {
                                break Label_0156;
                            }
                        }
                    }
                    b = true;
                }
                this.h(b);
            }
        }
        else {
            final float x2 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            this.z = x2;
            this.A = y2;
            this.e = false;
        }
        return true;
    }
    
    public final void p(final View view) {
        if (r(view)) {
            final aqq aqq = (aqq)view.getLayoutParams();
            if (this.s) {
                aqq.b = 0.0f;
                aqq.d = 0;
            }
            else {
                aqq.d |= 0x4;
                if (this.n(view, 3)) {
                    this.b.l(view, -view.getWidth(), view.getTop());
                }
                else {
                    this.c.l(view, this.getWidth(), view.getTop());
                }
            }
            this.invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b) {
            this.h(true);
        }
    }
    
    public final void requestLayout() {
        if (!this.r) {
            super.requestLayout();
        }
    }
    
    public final void s(final View view) {
        if (r(view)) {
            final aqq aqq = (aqq)view.getLayoutParams();
            if (this.s) {
                aqq.b = 1.0f;
                aqq.d = 1;
                this.m(view, true);
                this.l(view);
                this.k();
            }
            else {
                aqq.d |= 0x2;
                if (this.n(view, 3)) {
                    this.b.l(view, 0, view.getTop());
                }
                else {
                    this.c.l(view, this.getWidth() - view.getWidth(), view.getTop());
                }
            }
            this.invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
}
