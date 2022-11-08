// 
// Decompiled by Procyon v0.6.0
// 

package androidx.coordinatorlayout.widget;

import android.util.SparseArray;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import java.util.Collection;
import java.util.HashSet;
import android.view.ViewParent;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.Gravity;
import java.util.Collections;
import android.os.SystemClock;
import android.graphics.Rect;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;
import android.view.ViewGroup$OnHierarchyChangeListener;
import java.util.Comparator;
import android.view.ViewGroup;

public class CoordinatorLayout extends ViewGroup implements alr, als
{
    static final String a;
    static final Class[] b;
    static final ThreadLocal c;
    static final Comparator d;
    private static final akq i;
    public final aek e;
    public aoa f;
    public boolean g;
    public ViewGroup$OnHierarchyChangeListener h;
    private final List j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private boolean s;
    private Drawable t;
    private alv u;
    private final alu v;
    private edi w;
    
    static {
        final Package package1 = CoordinatorLayout.class.getPackage();
        String name;
        if (package1 != null) {
            name = package1.getName();
        }
        else {
            name = null;
        }
        a = name;
        d = new mm(3);
        b = new Class[] { Context.class, AttributeSet.class };
        c = new ThreadLocal();
        i = (akq)new aks(12);
    }
    
    public CoordinatorLayout(final Context context) {
        this(context, null);
    }
    
    public CoordinatorLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130969162);
    }
    
    public CoordinatorLayout(final Context context, final AttributeSet set, int i) {
        super(context, set, i);
        this.j = new ArrayList();
        this.e = new aek();
        this.k = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.v = new alu();
        final int n = 0;
        TypedArray typedArray;
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(set, aef.a, 0, 2132085275);
        }
        else {
            typedArray = context.obtainStyledAttributes(set, aef.a, i, 0);
        }
        if (i == 0) {
            ana.M((View)this, context, aef.a, set, typedArray, 0, 2132085275);
        }
        else {
            ana.M((View)this, context, aef.a, set, typedArray, i, 0);
        }
        i = typedArray.getResourceId(0, 0);
        if (i != 0) {
            final Resources resources = context.getResources();
            this.p = resources.getIntArray(i);
            final float density = resources.getDisplayMetrics().density;
            int length;
            int[] p3;
            for (length = this.p.length, i = n; i < length; ++i) {
                p3 = this.p;
                p3[i] *= (int)density;
            }
        }
        this.t = typedArray.getDrawable(1);
        typedArray.recycle();
        this.w();
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new tmw(this, 1));
        if (ana.d((View)this) == 0) {
            ana.X((View)this, 1);
        }
    }
    
    private static final MotionEvent A(MotionEvent obtain) {
        obtain = MotionEvent.obtain(obtain);
        obtain.setAction(3);
        return obtain;
    }
    
    private static final void B(final View view, final int i) {
        final aej aej = (aej)view.getLayoutParams();
        final int j = aej.i;
        if (j != i) {
            ana.E(view, i - j);
            aej.i = i;
        }
    }
    
    private static final void C(final View view, final int j) {
        final aej aej = (aej)view.getLayoutParams();
        final int i = aej.j;
        if (i != j) {
            ana.F(view, j - i);
            aej.j = j;
        }
    }
    
    public static aeh a(final Context context, final AttributeSet set, final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        String s2;
        if (s.startsWith(".")) {
            s2 = String.valueOf(context.getPackageName()).concat(String.valueOf(s));
        }
        else {
            s2 = s;
            if (s.indexOf(46) < 0) {
                final String a = CoordinatorLayout.a;
                s2 = s;
                if (!TextUtils.isEmpty((CharSequence)a)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a);
                    sb.append('.');
                    sb.append(s);
                    s2 = sb.toString();
                }
            }
        }
        try {
            final ThreadLocal c = CoordinatorLayout.c;
            Map map;
            if ((map = c.get()) == null) {
                map = new HashMap();
                c.set(map);
            }
            Constructor<?> constructor;
            if ((constructor = (Constructor)map.get(s2)) == null) {
                constructor = Class.forName(s2, false, context.getClassLoader()).getConstructor((Class<?>[])CoordinatorLayout.b);
                constructor.setAccessible(true);
                map.put(s2, constructor);
            }
            return (aeh)constructor.newInstance(context, set);
        }
        catch (final Exception ex) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(s2)), ex);
        }
    }
    
    static final aej m(View o) {
        final aej aej = (aej)((View)o).getLayoutParams();
        if (!aej.b) {
            if (o instanceof aeg) {
                final aeh a = ((aeg)o).a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                aej.b(a);
                aej.b = true;
            }
            else {
                Class<?> clazz = o.getClass();
                o = null;
                while (clazz != null) {
                    final aei aei = clazz.getAnnotation(aei.class);
                    if ((o = aei) != null) {
                        break;
                    }
                    clazz = clazz.getSuperclass();
                    o = aei;
                }
                if (o != null) {
                    try {
                        aej.b((aeh)((aei)o).a().getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                    }
                    catch (final Exception ex) {
                        final StringBuilder sb = new StringBuilder("Default behavior class ");
                        sb.append(((aei)o).a().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), (Throwable)ex);
                    }
                }
                aej.b = true;
            }
        }
        return aej;
    }
    
    private final int o(final int n) {
        final int[] p = this.p;
        if (p == null) {
            final StringBuilder sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(n);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        }
        if (n >= 0 && n < p.length) {
            return p[n];
        }
        final StringBuilder sb2 = new StringBuilder("Keyline index ");
        sb2.append(n);
        sb2.append(" out of range for ");
        sb2.append(this);
        Log.e("CoordinatorLayout", sb2.toString());
        return 0;
    }
    
    private static int p(int n) {
        int n2 = n;
        if ((n & 0x7) == 0x0) {
            n2 = (n | 0x800003);
        }
        n = n2;
        if ((n2 & 0x70) == 0x0) {
            n = (n2 | 0x30);
        }
        return n;
    }
    
    private static int q(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 8388661;
        }
        return n2;
    }
    
    private static Rect r() {
        Rect rect;
        if ((rect = (Rect)CoordinatorLayout.i.a()) == null) {
            rect = new Rect();
        }
        return rect;
    }
    
    private final void s(final aej aej, final Rect rect, final int n, final int n2) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int max = Math.max(this.getPaddingLeft() + aej.leftMargin, Math.min(rect.left, width - this.getPaddingRight() - n - aej.rightMargin));
        final int max2 = Math.max(this.getPaddingTop() + aej.topMargin, Math.min(rect.top, height - this.getPaddingBottom() - n2 - aej.bottomMargin));
        rect.set(max, max2, n + max, n2 + max2);
    }
    
    private static void u(final Rect rect) {
        rect.setEmpty();
        CoordinatorLayout.i.b((Object)rect);
    }
    
    private final void v() {
        final View q = this.q;
        if (q != null) {
            final aeh a = ((aej)q.getLayoutParams()).a;
            if (a != null) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                a.m(this, this.q, obtain);
                obtain.recycle();
            }
            this.q = null;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            ((aej)this.getChildAt(i).getLayoutParams()).m = false;
        }
        this.n = false;
    }
    
    private final void w() {
        if (ana.ai((View)this)) {
            if (this.u == null) {
                this.u = (alv)new tno(this, 1);
            }
            ana.Z((View)this, this.u);
            this.setSystemUiVisibility(1280);
            return;
        }
        ana.Z((View)this, (alv)null);
    }
    
    private final boolean x(final aeh aeh, final View view, final MotionEvent motionEvent, final int n) {
        if (n != 0) {
            return aeh.m(this, view, motionEvent);
        }
        return aeh.qF(this, view, motionEvent);
    }
    
    private final boolean y(final MotionEvent motionEvent, final int n) {
        final int actionMasked = motionEvent.getActionMasked();
        final List k = this.k;
        k.clear();
        final boolean childrenDrawingOrderEnabled = this.isChildrenDrawingOrderEnabled();
        final int childCount = this.getChildCount();
        for (int i = childCount - 1; i >= 0; --i) {
            int childDrawingOrder;
            if (childrenDrawingOrderEnabled) {
                childDrawingOrder = this.getChildDrawingOrder(childCount, i);
            }
            else {
                childDrawingOrder = i;
            }
            k.add(this.getChildAt(childDrawingOrder));
        }
        final Comparator d = CoordinatorLayout.d;
        if (d != null) {
            Collections.sort((List<Object>)k, d);
        }
        final int size = k.size();
        MotionEvent motionEvent2 = null;
        int j = 0;
        int n2 = 0;
        while (j < size) {
            final View q = k.get(j);
            final aej aej = (aej)q.getLayoutParams();
            final aeh a = aej.a;
            MotionEvent a2 = null;
            int n3 = 0;
            Label_0410: {
                if (n2 != 0) {
                    if (actionMasked != 0) {
                        a2 = motionEvent2;
                        n3 = n2;
                        if (a != null) {
                            if ((a2 = motionEvent2) == null) {
                                a2 = A(motionEvent);
                            }
                            this.x(a, q, a2, n);
                            n3 = n2;
                        }
                        break Label_0410;
                    }
                }
                a2 = motionEvent2;
                n3 = n2;
                if (n2 == 0) {
                    a2 = motionEvent2;
                    n3 = n2;
                    if (a != null) {
                        final boolean x = this.x(a, q, motionEvent, n);
                        a2 = motionEvent2;
                        if ((n3 = (x ? 1 : 0)) != 0) {
                            this.q = q;
                            a2 = motionEvent2;
                            n3 = (x ? 1 : 0);
                            if (actionMasked != 3) {
                                a2 = motionEvent2;
                                n3 = (x ? 1 : 0);
                                if (actionMasked != 1) {
                                    int n4 = 0;
                                    while (true) {
                                        a2 = motionEvent2;
                                        n3 = (x ? 1 : 0);
                                        if (n4 >= j) {
                                            break;
                                        }
                                        final View view = k.get(n4);
                                        final aeh a3 = ((aej)view.getLayoutParams()).a;
                                        MotionEvent a4 = motionEvent2;
                                        if (a3 != null) {
                                            if ((a4 = motionEvent2) == null) {
                                                a4 = A(motionEvent);
                                            }
                                            this.x(a3, view, a4, n);
                                        }
                                        ++n4;
                                        motionEvent2 = a4;
                                    }
                                }
                            }
                        }
                    }
                }
                if (aej.a == null) {
                    aej.m = false;
                }
                final boolean m = aej.m;
            }
            ++j;
            motionEvent2 = a2;
            n2 = n3;
        }
        k.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return n2 != 0;
    }
    
    private static final void z(int n, final Rect rect, final Rect rect2, final aej aej, final int n2, final int n3) {
        int c;
        if ((c = aej.c) == 0) {
            c = 17;
        }
        final int absoluteGravity = Gravity.getAbsoluteGravity(c, n);
        n = Gravity.getAbsoluteGravity(p(aej.d), n);
        final int n4 = absoluteGravity & 0x7;
        final int n5 = absoluteGravity & 0x70;
        final int n6 = n & 0x70;
        n &= 0x7;
        if (n != 1) {
            if (n != 5) {
                n = rect.left;
            }
            else {
                n = rect.right;
            }
        }
        else {
            n = rect.left + rect.width() / 2;
        }
        int n7;
        if (n6 != 16) {
            if (n6 != 80) {
                n7 = rect.top;
            }
            else {
                n7 = rect.bottom;
            }
        }
        else {
            n7 = rect.height() / 2 + rect.top;
        }
        int n8;
        if (n4 != 1) {
            n8 = n;
            if (n4 != 5) {
                n8 = n - n2;
            }
        }
        else {
            n8 = n - n2 / 2;
        }
        if (n5 != 16) {
            n = n7;
            if (n5 != 80) {
                n = n7 - n3;
            }
        }
        else {
            n = n7 - n3 / 2;
        }
        rect2.set(n8, n, n2 + n8, n3 + n);
    }
    
    public final List b(final View view) {
        final aek e = this.e;
        final int d = ((abn)e.b).d;
        ArrayList<Object> list = null;
        ArrayList<Object> list3;
        for (int i = 0; i < d; ++i, list = list3) {
            final ArrayList list2 = (ArrayList)((abn)e.b).f(i);
            list3 = list;
            if (list2 != null) {
                list3 = list;
                if (list2.contains(view)) {
                    if ((list3 = list) == null) {
                        list3 = new ArrayList<Object>();
                    }
                    list3.add(((abn)e.b).c(i));
                }
            }
        }
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }
    
    public final void c(final View view) {
        final ArrayList a = this.e.a(view);
        if (a != null && !a.isEmpty()) {
            for (int i = 0; i < a.size(); ++i) {
                final View view2 = (View)a.get(i);
                final aeh a2 = ((aej)view2.getLayoutParams()).a;
                if (a2 != null) {
                    a2.qE(this, view2, view);
                }
            }
        }
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof aej && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void d(final View view, final int n, final int n2, final int[] array, final int n3) {
        final int childCount = this.getChildCount();
        boolean b = false;
        int i = 0;
        int n4 = 0;
        int n5 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n6;
            int n7;
            if (child.getVisibility() == 8) {
                n6 = n4;
                n7 = n5;
            }
            else {
                final aej aej = (aej)child.getLayoutParams();
                if (!aej.d(n3)) {
                    n6 = n4;
                    n7 = n5;
                }
                else {
                    final aeh a = aej.a;
                    n6 = n4;
                    n7 = n5;
                    if (a != null) {
                        final int[] l = this.l;
                        l[1] = (l[0] = 0);
                        a.sm(this, child, view, n, n2, l, n3);
                        int n8;
                        if (n > 0) {
                            n8 = Math.max(n4, this.l[0]);
                        }
                        else {
                            n8 = Math.min(n4, this.l[0]);
                        }
                        n6 = n8;
                        if (n2 > 0) {
                            n7 = Math.max(n5, this.l[1]);
                        }
                        else {
                            n7 = Math.min(n5, this.l[1]);
                        }
                        b = true;
                    }
                }
            }
            ++i;
            n4 = n6;
            n5 = n7;
        }
        array[0] = n4;
        array[1] = n5;
        if (b) {
            this.j(1);
        }
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final aeh a = ((aej)view.getLayoutParams()).a;
        return super.drawChild(canvas, view, n);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable t = this.t;
        if (t != null && t.isStateful() && t.setState(drawableState)) {
            this.invalidate();
        }
    }
    
    public final void e(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.f(view, n, n2, n3, n4, 0, this.m);
    }
    
    public final void f(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        final int childCount = this.getChildCount();
        boolean b = false;
        int i = 0;
        int n6 = 0;
        int n7 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n8;
            int n9;
            if (child.getVisibility() == 8) {
                n8 = n6;
                n9 = n7;
            }
            else {
                final aej aej = (aej)child.getLayoutParams();
                if (!aej.d(n5)) {
                    n8 = n6;
                    n9 = n7;
                }
                else {
                    final aeh a = aej.a;
                    n8 = n6;
                    n9 = n7;
                    if (a != null) {
                        final int[] l = this.l;
                        l[1] = (l[0] = 0);
                        a.sn(this, child, view, n, n2, n3, n4, n5, l);
                        int n10;
                        if (n3 > 0) {
                            n10 = Math.max(n6, this.l[0]);
                        }
                        else {
                            n10 = Math.min(n6, this.l[0]);
                        }
                        n8 = n10;
                        if (n4 > 0) {
                            n9 = Math.max(n7, this.l[1]);
                        }
                        else {
                            n9 = Math.min(n7, this.l[1]);
                        }
                        b = true;
                    }
                }
            }
            ++i;
            n6 = n8;
            n7 = n9;
        }
        array[0] += n6;
        array[1] += n7;
        if (b) {
            this.j(1);
        }
    }
    
    public final void g(final View view, final View r, int i, final int n) {
        this.v.b(i, n);
        this.r = r;
        int childCount;
        aej aej;
        aeh a;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            aej = (aej)this.getChildAt(i).getLayoutParams();
            if (aej.d(n)) {
                a = aej.a;
            }
        }
    }
    
    public final int getNestedScrollAxes() {
        return this.v.a();
    }
    
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }
    
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }
    
    public final void h(final View view, final int n) {
        this.v.c(n);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final aej aej = (aej)child.getLayoutParams();
            if (aej.d(n)) {
                final aeh a = aej.a;
                if (a != null) {
                    a.qC(this, child, view, n);
                }
                aej.c(n, false);
                aej.a();
            }
        }
        this.r = null;
    }
    
    final void i(final View view, final boolean b, final Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (b) {
            ael.a(this, view, rect);
            return;
        }
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
    
    public final void j(final int n) {
        final int f = ana.f((View)this);
        int size = this.j.size();
        final Rect r = r();
        final Rect r2 = r();
        Rect r3 = r();
        int n2;
        for (int i = 0; i < size; i = n2 + 1) {
            final View view = this.j.get(i);
            final aej aej = (aej)view.getLayoutParams();
            if (n == 0 && view.getVisibility() == 8) {
                n2 = i;
            }
            else {
                for (int j = 0; j < i; ++j) {
                    if (aej.l == this.j.get(j)) {
                        final aej aej2 = (aej)view.getLayoutParams();
                        if (aej2.k != null) {
                            final Rect r4 = r();
                            final Rect r5 = r();
                            final Rect r6 = r();
                            ael.a(this, aej2.k, r4);
                            this.i(view, false, r5);
                            final int measuredWidth = view.getMeasuredWidth();
                            final int measuredHeight = view.getMeasuredHeight();
                            z(f, r4, r6, aej2, measuredWidth, measuredHeight);
                            final boolean b = r6.left != r5.left || r6.top != r5.top;
                            this.s(aej2, r6, measuredWidth, measuredHeight);
                            final int n3 = r6.left - r5.left;
                            final int n4 = r6.top - r5.top;
                            if (n3 != 0) {
                                ana.E(view, n3);
                            }
                            if (n4 != 0) {
                                ana.F(view, n4);
                            }
                            if (b) {
                                final aeh a = aej2.a;
                                if (a != null) {
                                    a.qE(this, view, aej2.k);
                                }
                            }
                            u(r4);
                            u(r5);
                            u(r6);
                        }
                    }
                }
                this.i(view, true, r2);
                if (aej.g != 0 && !r2.isEmpty()) {
                    final int absoluteGravity = Gravity.getAbsoluteGravity(aej.g, f);
                    final int n5 = absoluteGravity & 0x70;
                    if (n5 != 48) {
                        if (n5 == 80) {
                            r.bottom = Math.max(r.bottom, this.getHeight() - r2.top);
                        }
                    }
                    else {
                        r.top = Math.max(r.top, r2.bottom);
                    }
                    final int n6 = absoluteGravity & 0x7;
                    if (n6 != 3) {
                        if (n6 == 5) {
                            r.right = Math.max(r.right, this.getWidth() - r2.left);
                        }
                    }
                    else {
                        r.left = Math.max(r.left, r2.right);
                    }
                }
                if (aej.h != 0 && view.getVisibility() == 0) {
                    if (ana.ao(view)) {
                        if (view.getWidth() > 0 && view.getHeight() > 0) {
                            final aej aej3 = (aej)view.getLayoutParams();
                            final aeh a2 = aej3.a;
                            final Rect r7 = r();
                            final Rect r8 = r();
                            r8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                            if (a2 != null && a2.s(view, r7)) {
                                if (!r8.contains(r7)) {
                                    final StringBuilder sb = new StringBuilder("Rect should be within the child's bounds. Rect:");
                                    sb.append(r7.toShortString());
                                    sb.append(" | Bounds:");
                                    sb.append(r8.toShortString());
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                            else {
                                r7.set(r8);
                            }
                            u(r8);
                            if (r7.isEmpty()) {
                                u(r7);
                            }
                            else {
                                final int absoluteGravity2 = Gravity.getAbsoluteGravity(aej3.h, f);
                                boolean b2 = false;
                                Label_0809: {
                                    if ((absoluteGravity2 & 0x30) == 0x30) {
                                        final int n7 = r7.top - aej3.topMargin - aej3.j;
                                        if (n7 < r.top) {
                                            C(view, r.top - n7);
                                            b2 = true;
                                            break Label_0809;
                                        }
                                    }
                                    b2 = false;
                                }
                                Label_0880: {
                                    if ((absoluteGravity2 & 0x50) == 0x50) {
                                        final int n8 = this.getHeight() - r7.bottom - aej3.bottomMargin + aej3.j;
                                        if (n8 < r.bottom) {
                                            C(view, n8 - r.bottom);
                                            break Label_0880;
                                        }
                                    }
                                    if (!b2) {
                                        C(view, 0);
                                    }
                                }
                                boolean b3 = false;
                                Label_0939: {
                                    if ((absoluteGravity2 & 0x3) == 0x3) {
                                        final int n9 = r7.left - aej3.leftMargin - aej3.i;
                                        if (n9 < r.left) {
                                            B(view, r.left - n9);
                                            b3 = true;
                                            break Label_0939;
                                        }
                                    }
                                    b3 = false;
                                }
                                Label_1008: {
                                    if ((absoluteGravity2 & 0x5) == 0x5) {
                                        final int n10 = this.getWidth() - r7.right - aej3.rightMargin + aej3.i;
                                        if (n10 < r.right) {
                                            B(view, n10 - r.right);
                                            break Label_1008;
                                        }
                                    }
                                    if (!b3) {
                                        B(view, 0);
                                    }
                                }
                                u(r7);
                            }
                        }
                    }
                }
                if (n != 2) {
                    final Rect p = ((aej)view.getLayoutParams()).p;
                    final Rect rect = r3;
                    rect.set(p);
                    if (rect.equals((Object)r2)) {
                        r3 = rect;
                        n2 = i;
                        continue;
                    }
                    ((aej)view.getLayoutParams()).p.set(r2);
                }
                final Rect rect2 = r3;
                int n11 = i + 1;
                final int n12 = size;
                while (true) {
                    size = n12;
                    r3 = rect2;
                    n2 = i;
                    if (n11 >= n12) {
                        break;
                    }
                    final View view2 = this.j.get(n11);
                    final aej aej4 = (aej)view2.getLayoutParams();
                    final aeh a3 = aej4.a;
                    if (a3 != null && a3.n(view)) {
                        if (n == 0 && aej4.o) {
                            aej4.a();
                        }
                        else {
                            boolean qe;
                            if (n != 2) {
                                qe = a3.qE(this, view2, view);
                            }
                            else {
                                a3.o(this, view);
                                qe = true;
                            }
                            if (n == 1) {
                                aej4.o = qe;
                            }
                        }
                    }
                    ++n11;
                }
            }
        }
        u(r);
        u(r2);
        u(r3);
    }
    
    public final void k(final View view, int max) {
        final aej aej = (aej)view.getLayoutParams();
        final View k = aej.k;
        if (k == null && aej.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (k != null) {
            final Rect r = r();
            final Rect r2 = r();
            try {
                ael.a(this, k, r);
                final aej aej2 = (aej)view.getLayoutParams();
                final int measuredWidth = view.getMeasuredWidth();
                final int measuredHeight = view.getMeasuredHeight();
                z(max, r, r2, aej2, measuredWidth, measuredHeight);
                this.s(aej2, r2, measuredWidth, measuredHeight);
                view.layout(r2.left, r2.top, r2.right, r2.bottom);
                return;
            }
            finally {
                u(r);
                u(r2);
            }
        }
        final int e = aej.e;
        if (e >= 0) {
            final aej aej3 = (aej)view.getLayoutParams();
            final int absoluteGravity = Gravity.getAbsoluteGravity(q(aej3.c), max);
            final int n = absoluteGravity & 0x7;
            final int n2 = absoluteGravity & 0x70;
            final int width = this.getWidth();
            final int height = this.getHeight();
            final int measuredWidth2 = view.getMeasuredWidth();
            final int measuredHeight2 = view.getMeasuredHeight();
            int n3 = e;
            if (max == 1) {
                n3 = width - e;
            }
            max = this.o(n3) - measuredWidth2;
            if (n != 1) {
                if (n == 5) {
                    max += measuredWidth2;
                }
            }
            else {
                max += measuredWidth2 / 2;
            }
            int n4;
            if (n2 != 16) {
                if (n2 != 80) {
                    n4 = 0;
                }
                else {
                    n4 = measuredHeight2;
                }
            }
            else {
                n4 = measuredHeight2 / 2;
            }
            max = Math.max(this.getPaddingLeft() + aej3.leftMargin, Math.min(max, width - this.getPaddingRight() - measuredWidth2 - aej3.rightMargin));
            final int max2 = Math.max(this.getPaddingTop() + aej3.topMargin, Math.min(n4, height - this.getPaddingBottom() - measuredHeight2 - aej3.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        final aej aej4 = (aej)view.getLayoutParams();
        final Rect r3 = r();
        r3.set(this.getPaddingLeft() + aej4.leftMargin, this.getPaddingTop() + aej4.topMargin, this.getWidth() - this.getPaddingRight() - aej4.rightMargin, this.getHeight() - this.getPaddingBottom() - aej4.bottomMargin);
        if (this.f != null && ana.ai((View)this) && !ana.ai(view)) {
            r3.left += this.f.b();
            r3.top += this.f.d();
            r3.right -= this.f.c();
            r3.bottom -= this.f.a();
        }
        final Rect r4 = r();
        alg.a(p(aej4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), r3, r4, max);
        view.layout(r4.left, r4.top, r4.right, r4.bottom);
        u(r3);
        u(r4);
    }
    
    public final boolean l(final View view, final int n, final int n2) {
        final Rect r = r();
        ael.a(this, view, r);
        try {
            return r.contains(n, n2);
        }
        finally {
            u(r);
        }
    }
    
    public final void n(final View view, final int n, final int n2, final int n3) {
        this.measureChildWithMargins(view, n, n2, n3, 0);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v();
        if (this.s) {
            if (this.w == null) {
                this.w = new edi(this, 1);
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.w);
        }
        if (this.f == null && ana.ai((View)this)) {
            ana.L((View)this);
        }
        this.o = true;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v();
        if (this.s && this.w != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.w);
        }
        final View r = this.r;
        if (r != null) {
            this.onStopNestedScroll(r);
        }
        this.o = false;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.g && this.t != null) {
            final aoa f = this.f;
            int d;
            if (f != null) {
                d = f.d();
            }
            else {
                d = 0;
            }
            if (d > 0) {
                this.t.setBounds(0, 0, this.getWidth(), d);
                this.t.draw(canvas);
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 0) {
            this.v();
            actionMasked = 0;
        }
        final boolean y = this.y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            this.v();
        }
        return y;
    }
    
    protected void onLayout(final boolean b, int i, int f, int size, final int n) {
        f = ana.f((View)this);
        View view;
        aeh a;
        for (size = this.j.size(), i = 0; i < size; ++i) {
            view = this.j.get(i);
            if (view.getVisibility() != 8) {
                a = ((aej)view.getLayoutParams()).a;
                if (a == null || !a.h(this, view, f)) {
                    this.k(view, f);
                }
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.j.clear();
        final aek e = this.e;
        for (int d = ((abn)e.b).d, i = 0; i < d; ++i) {
            final ArrayList list = (ArrayList)((abn)e.b).f(i);
            if (list != null) {
                list.clear();
                ((akq)e.a).b((Object)list);
            }
        }
        ((abn)e.b).clear();
        for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
            final View child = this.getChildAt(j);
            final aej m = m(child);
            if (m.f == -1) {
                m.l = null;
                m.k = null;
            }
            else {
                final View k = m.k;
                Label_0430: {
                    Label_0257: {
                        if (k != null) {
                            if (k.getId() == m.f) {
                                View l = m.k;
                                for (ViewParent viewParent = l.getParent(); viewParent != this; viewParent = viewParent.getParent()) {
                                    if (viewParent == null || viewParent == child) {
                                        m.l = null;
                                        m.k = null;
                                        break Label_0257;
                                    }
                                    if (viewParent instanceof View) {
                                        l = (View)viewParent;
                                    }
                                }
                                m.l = l;
                                break Label_0430;
                            }
                        }
                    }
                    m.k = this.findViewById(m.f);
                    View k2 = m.k;
                    if (k2 != null) {
                        if (k2 == this) {
                            if (!this.isInEditMode()) {
                                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                            }
                            m.l = null;
                            m.k = null;
                        }
                        else {
                            ViewParent viewParent2 = k2.getParent();
                            while (viewParent2 != this && viewParent2 != null) {
                                if (viewParent2 == child) {
                                    if (this.isInEditMode()) {
                                        m.l = null;
                                        m.k = null;
                                        break Label_0430;
                                    }
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                else {
                                    if (viewParent2 instanceof View) {
                                        k2 = (View)viewParent2;
                                    }
                                    viewParent2 = viewParent2.getParent();
                                }
                            }
                            m.l = k2;
                        }
                    }
                    else {
                        if (!this.isInEditMode()) {
                            final StringBuilder sb = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                            sb.append(this.getResources().getResourceName(m.f));
                            sb.append(" to anchor view ");
                            sb.append(child);
                            throw new IllegalStateException(sb.toString());
                        }
                        m.l = null;
                        m.k = null;
                    }
                }
                final View k3 = m.k;
            }
            this.e.b(child);
            for (int n3 = 0; n3 < childCount; ++n3) {
                if (n3 != j) {
                    final View child2 = this.getChildAt(n3);
                    if (child2 != m.l) {
                        final int f = ana.f((View)this);
                        final int absoluteGravity = Gravity.getAbsoluteGravity(((aej)child2.getLayoutParams()).g, f);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(m.h, f) & absoluteGravity) != absoluteGravity) {
                            final aeh a = m.a;
                            if (a == null || !a.n(child2)) {
                                continue;
                            }
                        }
                    }
                    if (!((abn)this.e.b).containsKey((Object)child2)) {
                        this.e.b(child2);
                    }
                    final aek e2 = this.e;
                    if (!((abn)e2.b).containsKey((Object)child2) || !((abn)e2.b).containsKey((Object)child)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList list2;
                    if ((list2 = (ArrayList)((abn)e2.b).get((Object)child2)) == null) {
                        if ((list2 = (ArrayList)((akq)e2.a).a()) == null) {
                            list2 = new ArrayList();
                        }
                        ((abn)e2.b).put((Object)child2, (Object)list2);
                    }
                    list2.add(child);
                }
            }
        }
        final List j2 = this.j;
        final aek e3 = this.e;
        ((ArrayList)e3.c).clear();
        ((HashSet)e3.d).clear();
        for (int d2 = ((abn)e3.b).d, n4 = 0; n4 < d2; ++n4) {
            e3.c(((abn)e3.b).c(n4), (ArrayList)e3.c, (HashSet)e3.d);
        }
        j2.addAll(e3.c);
        Collections.reverse(this.j);
        final int childCount2 = this.getChildCount();
        int n5 = 0;
    Label_1014:
        while (true) {
            while (n5 < childCount2) {
                final View child3 = this.getChildAt(n5);
                final aek e4 = this.e;
                for (int d3 = ((abn)e4.b).d, n6 = 0; n6 < d3; ++n6) {
                    final ArrayList list3 = (ArrayList)((abn)e4.b).f(n6);
                    if (list3 != null && list3.contains(child3)) {
                        final boolean b = true;
                        break Label_1014;
                    }
                }
                ++n5;
                continue;
                boolean b = false;
                if (b != this.s) {
                    if (b) {
                        if (this.o) {
                            if (this.w == null) {
                                this.w = new edi(this, 1);
                            }
                            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.w);
                        }
                        this.s = true;
                    }
                    else {
                        if (this.o && this.w != null) {
                            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.w);
                        }
                        this.s = false;
                    }
                }
                final int paddingLeft = this.getPaddingLeft();
                final int paddingTop = this.getPaddingTop();
                final int paddingRight = this.getPaddingRight();
                final int paddingBottom = this.getPaddingBottom();
                final int f2 = ana.f((View)this);
                final boolean b2 = f2 == 1;
                final int mode = View$MeasureSpec.getMode(n);
                final int size = View$MeasureSpec.getSize(n);
                final int mode2 = View$MeasureSpec.getMode(n2);
                final int size2 = View$MeasureSpec.getSize(n2);
                int n7 = this.getSuggestedMinimumWidth();
                int n8 = this.getSuggestedMinimumHeight();
                final boolean b3 = this.f != null && ana.ai((View)this);
                final int size3 = this.j.size();
                int combineMeasuredStates = 0;
                int n9 = 0;
                int n10 = paddingRight;
                int n11 = paddingLeft;
                while (true) {
                    final int n12 = n10;
                    final int n13 = n11;
                    if (n9 >= size3) {
                        break;
                    }
                    final View view = this.j.get(n9);
                    if (view.getVisibility() != 8) {
                        final aej aej = (aej)view.getLayoutParams();
                        final int e5 = aej.e;
                        int n18 = 0;
                        Label_1432: {
                            Label_1429: {
                                if (e5 >= 0 && mode != 0) {
                                    final int o = this.o(e5);
                                    int n14 = Gravity.getAbsoluteGravity(q(aej.c), f2) & 0x7;
                                    Label_1384: {
                                        Label_1370: {
                                            int n15;
                                            if (n14 == 3) {
                                                if (!b2) {
                                                    break Label_1370;
                                                }
                                                n14 = 3;
                                                n15 = 1;
                                            }
                                            else {
                                                n15 = (b2 ? 1 : 0);
                                            }
                                            int n16 = n14;
                                            int n17 = n15;
                                            if (n14 == 5) {
                                                if (n15 != 0) {
                                                    break Label_1370;
                                                }
                                                n16 = 5;
                                                n17 = 0;
                                            }
                                            if ((n16 == 5 && n17 == 0) || (n16 == 3 && n17)) {
                                                n18 = Math.max(0, o - n13);
                                                break Label_1384;
                                            }
                                            break Label_1429;
                                        }
                                        n18 = Math.max(0, size - n12 - o);
                                    }
                                    break Label_1432;
                                }
                            }
                            n18 = 0;
                        }
                        final int n19 = combineMeasuredStates;
                        int measureSpec;
                        int measureSpec2;
                        if (b3 && !ana.ai(view)) {
                            final int b4 = this.f.b();
                            final int c = this.f.c();
                            final int d4 = this.f.d();
                            final int a2 = this.f.a();
                            measureSpec = View$MeasureSpec.makeMeasureSpec(size - (b4 + c), mode);
                            measureSpec2 = View$MeasureSpec.makeMeasureSpec(size2 - (d4 + a2), mode2);
                        }
                        else {
                            measureSpec = n;
                            measureSpec2 = n2;
                        }
                        final aeh a3 = aej.a;
                        if (a3 == null || !a3.p(this, view, measureSpec, n18, measureSpec2)) {
                            this.n(view, measureSpec, n18, measureSpec2);
                        }
                        n7 = Math.max(n7, paddingLeft + paddingRight + view.getMeasuredWidth() + aej.leftMargin + aej.rightMargin);
                        n8 = Math.max(n8, paddingTop + paddingBottom + view.getMeasuredHeight() + aej.topMargin + aej.bottomMargin);
                        combineMeasuredStates = View.combineMeasuredStates(n19, view.getMeasuredState());
                    }
                    ++n9;
                    n11 = n13;
                    n10 = n12;
                }
                this.setMeasuredDimension(View.resolveSizeAndState(n7, n, 0xFF000000 & combineMeasuredStates), View.resolveSizeAndState(n8, n2, combineMeasuredStates << 16));
                return;
            }
            final boolean b = false;
            continue Label_1014;
        }
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b2;
            if (child.getVisibility() == 8) {
                b2 = (n3 != 0);
            }
            else {
                final aej aej = (aej)child.getLayoutParams();
                b2 = (n3 != 0);
                if (aej.n) {
                    final aeh a = aej.a;
                    b2 = (n3 != 0);
                    if (a != null) {
                        b2 = ((n3 | (a.i(this, child, view, n, n2, b) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b2 ? 1 : 0);
        }
        if (n3 != 0) {
            this.j(1);
        }
        return n3 != 0;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b;
            if (child.getVisibility() == 8) {
                b = (n3 != 0);
            }
            else {
                final aej aej = (aej)child.getLayoutParams();
                b = (n3 != 0);
                if (aej.n) {
                    final aeh a = aej.a;
                    b = (n3 != 0);
                    if (a != null) {
                        b = ((n3 | (a.j(this, child, view, n, n2) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b ? 1 : 0);
        }
        return n3 != 0;
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.d(view, n, n2, array, 0);
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.e(view, n, n2, n3, n4, 0);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.g(view, view2, n, 0);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof CoordinatorLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final CoordinatorLayout$SavedState coordinatorLayout$SavedState = (CoordinatorLayout$SavedState)parcelable;
        super.onRestoreInstanceState(coordinatorLayout$SavedState.d);
        final SparseArray a = coordinatorLayout$SavedState.a;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final aeh a2 = m(child).a;
            if (id != -1 && a2 != null) {
                final Parcelable parcelable2 = (Parcelable)a.get(id);
                if (parcelable2 != null) {
                    a2.q(child, parcelable2);
                }
            }
        }
    }
    
    protected final Parcelable onSaveInstanceState() {
        final CoordinatorLayout$SavedState coordinatorLayout$SavedState = new CoordinatorLayout$SavedState(super.onSaveInstanceState());
        final SparseArray a = new SparseArray();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final aeh a2 = ((aej)child.getLayoutParams()).a;
            if (id != -1 && a2 != null) {
                final Parcelable r = a2.r(child);
                if (r != null) {
                    a.append(id, (Object)r);
                }
            }
        }
        coordinatorLayout$SavedState.a = a;
        return (Parcelable)coordinatorLayout$SavedState;
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.t(view, view2, n, 0);
    }
    
    public final void onStopNestedScroll(final View view) {
        this.h(view, 0);
    }
    
    public boolean onTouchEvent(MotionEvent a) {
        final int actionMasked = a.getActionMasked();
        final View q = this.q;
        final boolean b = false;
        int n;
        int n2;
        if (q != null) {
            final aeh a2 = ((aej)q.getLayoutParams()).a;
            if (a2 != null) {
                n = (a2.m(this, this.q, a) ? 1 : 0);
                n2 = (b ? 1 : 0);
            }
            else {
                n = 0;
                n2 = (b ? 1 : 0);
            }
        }
        else {
            final boolean b2 = (n = (this.y(a, 1) ? 1 : 0)) != 0;
            n2 = (b ? 1 : 0);
            if (actionMasked != 0) {
                n = (b2 ? 1 : 0);
                n2 = (b ? 1 : 0);
                if (b2) {
                    n2 = 1;
                    n = (b2 ? 1 : 0);
                }
            }
        }
        boolean b3;
        if (this.q != null && actionMasked != 3) {
            b3 = (n != 0);
            if (n2 != 0) {
                a = A(a);
                super.onTouchEvent(a);
                a.recycle();
                b3 = (n != 0);
            }
        }
        else {
            b3 = ((n | (super.onTouchEvent(a) ? 1 : 0)) != 0x0);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            this.v();
        }
        return b3;
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        final aeh a = ((aej)view.getLayoutParams()).a;
        return (a != null && a.k(this, view, rect, b)) || super.requestChildRectangleOnScreen(view, rect, b);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b && !this.n) {
            if (this.q == null) {
                final int childCount = this.getChildCount();
                MotionEvent motionEvent = null;
                MotionEvent obtain;
                for (int i = 0; i < childCount; ++i, motionEvent = obtain) {
                    final View child = this.getChildAt(i);
                    final aeh a = ((aej)child.getLayoutParams()).a;
                    obtain = motionEvent;
                    if (a != null) {
                        if ((obtain = motionEvent) == null) {
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        a.qF(this, child, obtain);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            this.v();
            this.n = true;
        }
    }
    
    public final void setFitsSystemWindows(final boolean fitsSystemWindows) {
        super.setFitsSystemWindows(fitsSystemWindows);
        this.w();
    }
    
    public final void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener h) {
        this.h = h;
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable t = this.t;
        if (t != null && t.isVisible() != b) {
            this.t.setVisible(b, false);
        }
    }
    
    public final boolean t(final View view, final View view2, final int n, final int n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b2 = b;
            if (child.getVisibility() != 8) {
                final aej aej = (aej)child.getLayoutParams();
                final aeh a = aej.a;
                if (a != null) {
                    final boolean l = a.l(this, child, view, view2, n, n2);
                    b2 = (b | l);
                    aej.c(n2, l);
                }
                else {
                    aej.c(n2, false);
                    b2 = b;
                }
            }
            ++i;
            b = b2;
        }
        return b;
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }
}
