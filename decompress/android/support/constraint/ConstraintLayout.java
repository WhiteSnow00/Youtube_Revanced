// 
// Decompiled by Procyon v0.6.0
// 

package android.support.constraint;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Collection;
import java.util.HashSet;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    SparseArray a;
    al b;
    public ac c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    
    public ConstraintLayout(final Context context) {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new al();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        this.e(null);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new al();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        this.e(set);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new al();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        this.e(set);
    }
    
    protected static final aa b() {
        return new aa(-2, -2);
    }
    
    private final ak c(final int n) {
        if (n == 0) {
            return (ak)this.b;
        }
        final View view = (View)this.a.get(n);
        if (view == this) {
            return (ak)this.b;
        }
        if (view == null) {
            return null;
        }
        return ((aa)view.getLayoutParams()).Y;
    }
    
    private final ak d(final View view) {
        if (view == this) {
            return (ak)this.b;
        }
        if (view == null) {
            return null;
        }
        return ((aa)view.getLayoutParams()).Y;
    }
    
    private final void e(final AttributeSet set) {
        ((ak)this.b).J = this;
        this.a.put(this.getId(), (Object)this);
        this.c = null;
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, ad.a);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                }
                else if (index == 17) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                }
                else if (index == 14) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                }
                else if (index == 15) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                }
                else if (index == 113) {
                    this.j = obtainStyledAttributes.getInt(113, this.j);
                }
                else if (index == 34) {
                    (this.c = new ac()).c(this.getContext(), obtainStyledAttributes.getResourceId(34, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.j;
    }
    
    protected final void a() {
        ((an)this.b).D();
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof aa;
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)b();
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new aa(this.getContext(), set);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new aa(viewGroup$LayoutParams);
    }
    
    protected final void onLayout(final boolean b, int i, int childCount, int c, int b2) {
        childCount = this.getChildCount();
        final boolean inEditMode = this.isInEditMode();
        View child;
        aa aa;
        ak y;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            aa = (aa)child.getLayoutParams();
            if (child.getVisibility() != 8 || aa.Q || inEditMode) {
                y = aa.Y;
                b2 = y.b();
                c = y.c();
                child.layout(b2, c, y.h() + b2, y.d() + c);
            }
        }
    }
    
    protected final void onMeasure(int n, int min) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final al b = this.b;
        ((ak)b).w = paddingLeft;
        ((ak)b).x = paddingTop;
        final int mode = View$MeasureSpec.getMode(n);
        int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(min);
        int size2 = View$MeasureSpec.getSize(min);
        final int paddingTop2 = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int paddingLeft2 = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        this.getLayoutParams();
        int n2 = 0;
        Label_0145: {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        size = Math.min(this.g, size) - (paddingLeft2 + paddingRight);
                        n2 = 1;
                        break Label_0145;
                    }
                    n2 = 1;
                }
                else {
                    n2 = 2;
                }
                size = 0;
            }
            else {
                n2 = 2;
            }
        }
        int n3 = 0;
        Label_0205: {
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 == 1073741824) {
                        size2 = Math.min(this.h, size2) - (paddingTop2 + paddingBottom);
                        n3 = 1;
                        break Label_0205;
                    }
                    n3 = 1;
                }
                else {
                    n3 = 2;
                }
                size2 = 0;
            }
            else {
                n3 = 2;
            }
        }
        ((ak)this.b).m(0);
        ((ak)this.b).l(0);
        ((ak)this.b).v(n2);
        ((ak)this.b).p(size);
        ((ak)this.b).w(n3);
        ((ak)this.b).j(size2);
        ((ak)this.b).m(this.e - this.getPaddingLeft() - this.getPaddingRight());
        ((ak)this.b).l(this.f - this.getPaddingTop() - this.getPaddingBottom());
        if (this.i) {
            this.i = false;
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                if (this.getChildAt(i).isLayoutRequested()) {
                    this.d.clear();
                    final ac c = this.c;
                    if (c != null) {
                        final int childCount2 = this.getChildCount();
                        final HashSet set = new HashSet(c.a.keySet());
                        for (int j = 0; j < childCount2; ++j) {
                            final View child = this.getChildAt(j);
                            final int id = child.getId();
                            final HashMap a = c.a;
                            final Integer value = id;
                            if (a.containsKey(value)) {
                                set.remove(value);
                                final ab ab = c.a.get(value);
                                final aa layoutParams = (aa)child.getLayoutParams();
                                ab.a(layoutParams);
                                child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                                child.setVisibility(ab.G);
                                child.setAlpha(ab.R);
                                child.setRotationX(ab.U);
                                child.setRotationY(ab.V);
                                child.setScaleX(ab.W);
                                child.setScaleY(ab.X);
                                child.setPivotX(ab.Y);
                                child.setPivotY(ab.Z);
                                child.setTranslationX(ab.aa);
                                child.setTranslationY(ab.ab);
                                child.setTranslationZ(ab.ac);
                                if (ab.S) {
                                    child.setElevation(ab.T);
                                }
                            }
                        }
                        for (final Integer n4 : set) {
                            final ab ab2 = c.a.get(n4);
                            if (ab2.a) {
                                final Guideline guideline = new Guideline(this.getContext());
                                guideline.setId((int)n4);
                                final aa b2 = b();
                                ab2.a(b2);
                                this.addView((View)guideline, (ViewGroup$LayoutParams)b2);
                            }
                        }
                    }
                    final int childCount3 = this.getChildCount();
                    ((an)this.b).al.clear();
                    for (int k = 0; k < childCount3; ++k) {
                        final View child2 = this.getChildAt(k);
                        final ak d = this.d(child2);
                        if (d != null) {
                            final aa aa = (aa)child2.getLayoutParams();
                            d.i();
                            d.K = child2.getVisibility();
                            d.J = child2;
                            final al b3 = this.b;
                            ((an)b3).al.add(d);
                            final ak r = d.r;
                            if (r != null) {
                                ((an)r).F(d);
                            }
                            d.r = (ak)b3;
                            if (!aa.O || !aa.N) {
                                this.d.add(d);
                            }
                            if (aa.Q) {
                                final am am = (am)d;
                                final int a2 = aa.a;
                                if (a2 != -1 && a2 >= 0) {
                                    am.af = -1.0f;
                                    am.ag = a2;
                                    am.ah = -1;
                                }
                                final int b4 = aa.b;
                                if (b4 != -1 && b4 >= 0) {
                                    am.af = -1.0f;
                                    am.ag = -1;
                                    am.ah = b4;
                                }
                                final float c2 = aa.c;
                                if (c2 != -1.0f && c2 > -1.0f) {
                                    am.af = c2;
                                    am.ag = -1;
                                    am.ah = -1;
                                }
                            }
                            else if (aa.R != -1 || aa.S != -1 || aa.T != -1 || aa.U != -1 || aa.h != -1 || aa.i != -1 || aa.j != -1 || aa.k != -1 || aa.l != -1 || aa.K != -1 || aa.L != -1 || aa.width == -1 || aa.height == -1) {
                                final int r2 = aa.R;
                                final int s = aa.S;
                                final int t = aa.T;
                                final int u = aa.U;
                                final int v = aa.V;
                                final int w = aa.W;
                                final float x = aa.X;
                                if (r2 != -1) {
                                    final ak c3 = this.c(r2);
                                    if (c3 != null) {
                                        d.u(2, c3, 2, aa.leftMargin, v);
                                    }
                                }
                                else if (s != -1) {
                                    final ak c4 = this.c(s);
                                    if (c4 != null) {
                                        d.u(2, c4, 4, aa.leftMargin, v);
                                    }
                                }
                                if (t != -1) {
                                    final ak c5 = this.c(t);
                                    if (c5 != null) {
                                        d.u(4, c5, 2, aa.rightMargin, w);
                                    }
                                }
                                else if (u != -1) {
                                    final ak c6 = this.c(u);
                                    if (c6 != null) {
                                        d.u(4, c6, 4, aa.rightMargin, w);
                                    }
                                }
                                final int h = aa.h;
                                if (h != -1) {
                                    final ak c7 = this.c(h);
                                    if (c7 != null) {
                                        d.u(3, c7, 3, aa.topMargin, aa.r);
                                    }
                                }
                                else {
                                    final int l = aa.i;
                                    if (l != -1) {
                                        final ak c8 = this.c(l);
                                        if (c8 != null) {
                                            d.u(3, c8, 5, aa.topMargin, aa.r);
                                        }
                                    }
                                }
                                final int m = aa.j;
                                if (m != -1) {
                                    final ak c9 = this.c(m);
                                    if (c9 != null) {
                                        d.u(5, c9, 3, aa.bottomMargin, aa.t);
                                    }
                                }
                                else {
                                    final int k2 = aa.k;
                                    if (k2 != -1) {
                                        final ak c10 = this.c(k2);
                                        if (c10 != null) {
                                            d.u(5, c10, 5, aa.bottomMargin, aa.t);
                                        }
                                    }
                                }
                                final int l2 = aa.l;
                                if (l2 != -1) {
                                    final View view = (View)this.a.get(l2);
                                    final ak c11 = this.c(aa.l);
                                    if (c11 != null && view != null && view.getLayoutParams() instanceof aa) {
                                        final aa aa2 = (aa)view.getLayoutParams();
                                        aa.P = true;
                                        aa2.P = true;
                                        d.t(6).d(c11.t(6), 0, -1, 2, 0, true);
                                        d.t(3).b();
                                        d.t(5).b();
                                    }
                                }
                                if (x >= 0.0f && x != 0.5f) {
                                    d.H = x;
                                }
                                final float x2 = aa.x;
                                if (x2 >= 0.0f && x2 != 0.5f) {
                                    d.I = x2;
                                }
                                Label_1719: {
                                    if (this.isInEditMode()) {
                                        int k3;
                                        if ((k3 = aa.K) == -1) {
                                            if (aa.L == -1) {
                                                break Label_1719;
                                            }
                                            k3 = -1;
                                        }
                                        final int l3 = aa.L;
                                        d.w = k3;
                                        d.x = l3;
                                    }
                                }
                                if (!aa.N) {
                                    if (aa.width == -1) {
                                        d.v(4);
                                        d.t(2).c = aa.leftMargin;
                                        d.t(4).c = aa.rightMargin;
                                    }
                                    else {
                                        d.v(3);
                                        d.p(0);
                                    }
                                }
                                else {
                                    d.v(1);
                                    d.p(aa.width);
                                }
                                if (!aa.O) {
                                    if (aa.height == -1) {
                                        d.w(4);
                                        d.t(3).c = aa.topMargin;
                                        d.t(5).c = aa.bottomMargin;
                                    }
                                    else {
                                        d.w(3);
                                        d.j(0);
                                    }
                                }
                                else {
                                    d.w(1);
                                    d.j(aa.height);
                                }
                                final String y = aa.y;
                                if (y != null) {
                                    if (y.length() == 0) {
                                        d.u = 0.0f;
                                    }
                                    else {
                                        final int length = y.length();
                                        int index = y.indexOf(44);
                                        int v2;
                                        if (index > 0 && index < length - 1) {
                                            final String substring = y.substring(0, index);
                                            if (substring.equalsIgnoreCase("W")) {
                                                v2 = 0;
                                            }
                                            else if (substring.equalsIgnoreCase("H")) {
                                                v2 = 1;
                                            }
                                            else {
                                                v2 = -1;
                                            }
                                            ++index;
                                        }
                                        else {
                                            index = 0;
                                            v2 = -1;
                                        }
                                        final int index2 = y.indexOf(58);
                                        float u2 = 0.0f;
                                        Label_2155: {
                                            Label_2153: {
                                                if (index2 >= 0 && index2 < length - 1) {
                                                    final String substring2 = y.substring(index, index2);
                                                    final String substring3 = y.substring(index2 + 1);
                                                    if (substring2.length() <= 0 || substring3.length() <= 0) {
                                                        break Label_2153;
                                                    }
                                                    try {
                                                        final float float1 = Float.parseFloat(substring2);
                                                        final float float2 = Float.parseFloat(substring3);
                                                        if (float1 <= 0.0f || float2 <= 0.0f) {
                                                            break Label_2153;
                                                        }
                                                        if (v2 == 1) {
                                                            u2 = Math.abs(float2 / float1);
                                                            break Label_2155;
                                                        }
                                                        u2 = Math.abs(float1 / float2);
                                                        break Label_2155;
                                                    }
                                                    catch (final NumberFormatException ex) {
                                                        break Label_2153;
                                                    }
                                                }
                                                final String substring4 = y.substring(index);
                                                if (substring4.length() > 0) {
                                                    u2 = Float.parseFloat(substring4);
                                                    break Label_2155;
                                                }
                                            }
                                            u2 = 0.0f;
                                        }
                                        if (u2 > 0.0f) {
                                            d.u = u2;
                                            d.v = v2;
                                        }
                                    }
                                }
                                d.Z = aa.A;
                                d.aa = aa.B;
                                d.V = aa.C;
                                d.W = aa.D;
                                final int e = aa.E;
                                final int g = aa.G;
                                final int i2 = aa.I;
                                d.c = e;
                                d.e = g;
                                d.f = i2;
                                final int f = aa.F;
                                final int h2 = aa.H;
                                final int j2 = aa.J;
                                d.d = f;
                                d.g = h2;
                                d.h = j2;
                            }
                        }
                    }
                    break;
                }
            }
        }
        final int n5 = this.getPaddingTop() + this.getPaddingBottom();
        final int n6 = this.getPaddingLeft() + this.getPaddingRight();
        for (int childCount4 = this.getChildCount(), n7 = 0; n7 < childCount4; ++n7) {
            final View child3 = this.getChildAt(n7);
            if (child3.getVisibility() != 8) {
                final aa aa3 = (aa)child3.getLayoutParams();
                final ak y2 = aa3.Y;
                if (!aa3.Q) {
                    int f2 = aa3.width;
                    final int height = aa3.height;
                    int g2 = 0;
                    boolean b5 = false;
                    int n8 = 0;
                    Label_2604: {
                        Label_2487: {
                            if (!aa3.N && !aa3.O && aa3.E != 1 && aa3.width != -1) {
                                if (!aa3.O) {
                                    if (aa3.F == 1) {
                                        break Label_2487;
                                    }
                                    if (aa3.height == -1) {
                                        break Label_2487;
                                    }
                                }
                                g2 = height;
                                b5 = false;
                                n8 = 0;
                                break Label_2604;
                            }
                        }
                        int n9;
                        int n10;
                        if (f2 != 0 && f2 != -1) {
                            n9 = getChildMeasureSpec(n, n6, f2);
                            n10 = 0;
                        }
                        else {
                            n9 = getChildMeasureSpec(n, n6, -2);
                            n10 = 1;
                        }
                        int n11;
                        if (height != 0 && height != -1) {
                            n11 = getChildMeasureSpec(min, n5, height);
                            b5 = false;
                        }
                        else {
                            n11 = getChildMeasureSpec(min, n5, -2);
                            b5 = true;
                        }
                        child3.measure(n9, n11);
                        f2 = child3.getMeasuredWidth();
                        final int measuredHeight = child3.getMeasuredHeight();
                        n8 = n10;
                        g2 = measuredHeight;
                    }
                    y2.p(f2);
                    y2.j(g2);
                    if (n8 != 0) {
                        y2.F = f2;
                    }
                    if (b5) {
                        y2.G = g2;
                    }
                    if (aa3.P) {
                        final int baseline = child3.getBaseline();
                        if (baseline != -1) {
                            y2.C = baseline;
                        }
                    }
                }
            }
        }
        if (this.getChildCount() > 0) {
            this.a();
        }
        final int size3 = this.d.size();
        final int n12 = paddingTop + this.getPaddingBottom();
        final int n13 = paddingLeft + this.getPaddingRight();
        int combineMeasuredStates;
        if (size3 > 0) {
            final al b6 = this.b;
            final int ad = ((ak)b6).ad;
            final int ae = ((ak)b6).ae;
            combineMeasuredStates = 0;
            int n14 = 0;
            int n15 = 0;
            while (n14 < size3) {
                final ak ak = this.d.get(n14);
                if (!(ak instanceof am)) {
                    final Object j3 = ak.J;
                    if (j3 != null) {
                        final View view2 = (View)j3;
                        if (view2.getVisibility() != 8) {
                            final aa aa4 = (aa)view2.getLayoutParams();
                            int n16;
                            if (aa4.width == -2) {
                                n16 = getChildMeasureSpec(n, n13, aa4.width);
                            }
                            else {
                                n16 = View$MeasureSpec.makeMeasureSpec(ak.h(), 1073741824);
                            }
                            int n17;
                            if (aa4.height == -2) {
                                n17 = getChildMeasureSpec(min, n12, aa4.height);
                            }
                            else {
                                n17 = View$MeasureSpec.makeMeasureSpec(ak.d(), 1073741824);
                            }
                            view2.measure(n16, n17);
                            final int measuredWidth = view2.getMeasuredWidth();
                            final int measuredHeight2 = view2.getMeasuredHeight();
                            if (measuredWidth != ak.h()) {
                                ak.p(measuredWidth);
                                if (ad == 2 && ak.g() > ((ak)this.b).h()) {
                                    ((ak)this.b).p(Math.max(this.e, ak.g() + ak.t(4).a()));
                                }
                                n15 = 1;
                            }
                            int n18;
                            if (measuredHeight2 != ak.d()) {
                                ak.j(measuredHeight2);
                                if (ae == 2 && ak.a() > ((ak)this.b).d()) {
                                    ((ak)this.b).j(Math.max(this.f, ak.a() + ak.t(5).a()));
                                }
                                n18 = 1;
                            }
                            else {
                                n18 = n15;
                            }
                            if (aa4.P) {
                                final int baseline2 = view2.getBaseline();
                                n15 = n18;
                                if (baseline2 != -1) {
                                    n15 = n18;
                                    if (baseline2 != ak.C) {
                                        ak.C = baseline2;
                                        n15 = 1;
                                    }
                                }
                            }
                            else {
                                n15 = n18;
                            }
                            combineMeasuredStates = combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
                        }
                    }
                }
                ++n14;
            }
            if (n15 != 0) {
                this.a();
            }
        }
        else {
            combineMeasuredStates = 0;
        }
        final int h3 = ((ak)this.b).h();
        final int d2 = ((ak)this.b).d();
        n = resolveSizeAndState(h3 + n13, n, combineMeasuredStates);
        final int resolveSizeAndState = resolveSizeAndState(d2 + n12, min, combineMeasuredStates << 16);
        min = Math.min(this.g, n);
        n = Math.min(this.h, resolveSizeAndState);
        min &= 0xFFFFFF;
        final int n19 = n & 0xFFFFFF;
        final al b7 = this.b;
        n = min;
        if (b7.aj) {
            n = (min | 0x1000000);
        }
        min = n19;
        if (b7.ak) {
            min = (n19 | 0x1000000);
        }
        this.setMeasuredDimension(n, min);
    }
    
    public final void onViewAdded(final View view) {
        super.onViewAdded(view);
        final ak d = this.d(view);
        if (view instanceof Guideline && !(d instanceof am)) {
            final aa aa = (aa)view.getLayoutParams();
            aa.Y = new am();
            aa.Q = true;
            ((am)aa.Y).A(aa.M);
            final ak y = aa.Y;
        }
        this.a.put(view.getId(), (Object)view);
        this.i = true;
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        ((an)this.b).F(this.d(view));
        this.i = true;
    }
    
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }
    
    public final void setId(final int id) {
        this.a.remove(this.getId());
        super.setId(id);
        this.a.put(this.getId(), (Object)this);
    }
}
