// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import java.util.Iterator;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.View;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseIntArray;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.view.ViewGroup;

public class FlexboxLayout extends ViewGroup implements lyy
{
    private int a;
    public int b;
    public List c;
    private int d;
    private int e;
    private int f;
    private int g;
    private Drawable h;
    private Drawable i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int[] n;
    private SparseIntArray o;
    private lzb p;
    private agls q;
    
    public FlexboxLayout(final Context context) {
        this(context, null);
    }
    
    public FlexboxLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FlexboxLayout(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.g = -1;
        this.p = new lzb((lyy)this);
        this.c = new ArrayList();
        this.q = new agls();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lze.a, n, 0);
        this.a = obtainStyledAttributes.getInt(5, 0);
        this.b = obtainStyledAttributes.getInt(6, 0);
        this.d = obtainStyledAttributes.getInt(7, 0);
        this.e = obtainStyledAttributes.getInt(1, 4);
        this.f = obtainStyledAttributes.getInt(0, 5);
        this.g = obtainStyledAttributes.getInt(8, -1);
        final Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            this.e(drawable);
            this.f(drawable);
        }
        final Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            this.e(drawable2);
        }
        final Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            this.f(drawable3);
        }
        n = obtainStyledAttributes.getInt(9, 0);
        if (n != 0) {
            this.k = n;
            this.j = n;
        }
        n = obtainStyledAttributes.getInt(11, 0);
        if (n != 0) {
            this.k = n;
        }
        n = obtainStyledAttributes.getInt(10, 0);
        if (n != 0) {
            this.j = n;
        }
        obtainStyledAttributes.recycle();
    }
    
    private final boolean B(final int n, final int n2) {
        int i = 1;
        while (i <= n2) {
            final View d = this.d(n - i);
            if (d != null && d.getVisibility() != 8) {
                if (this.K()) {
                    return (this.k & 0x2) != 0x0;
                }
                return (this.j & 0x2) != 0x0;
            }
            else {
                ++i;
            }
        }
        if (this.K()) {
            return (this.k & 0x1) != 0x0;
        }
        return (this.j & 0x1) != 0x0;
    }
    
    private final boolean C(final int n) {
        if (n >= 0) {
            if (n < this.c.size()) {
                int i = 0;
                while (i < n) {
                    if (((lyz)this.c.get(i)).a() > 0) {
                        if (this.K()) {
                            return (this.j & 0x2) != 0x0;
                        }
                        return (this.k & 0x2) != 0x0;
                    }
                    else {
                        ++i;
                    }
                }
                if (this.K()) {
                    return (this.j & 0x1) != 0x0;
                }
                if ((this.k & 0x1) != 0x0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final boolean D(int i) {
        if (i >= 0) {
            if (i < this.c.size()) {
                ++i;
                while (i < this.c.size()) {
                    if (this.c.get(i).a() > 0) {
                        return false;
                    }
                    ++i;
                }
                if (this.K()) {
                    return (this.j & 0x4) != 0x0;
                }
                if ((this.k & 0x4) != 0x0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final void h(final Canvas canvas, final boolean b, final boolean b2) {
        final int paddingLeft = this.getPaddingLeft();
        final int max = Math.max(0, this.getWidth() - this.getPaddingRight() - paddingLeft);
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final lyz lyz = this.c.get(i);
            for (int j = 0; j < lyz.h; ++j) {
                final int n = lyz.o + j;
                final View d = this.d(n);
                if (d != null) {
                    if (d.getVisibility() != 8) {
                        final FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d.getLayoutParams();
                        if (this.B(n, j)) {
                            int n2;
                            if (b) {
                                n2 = d.getRight() + flexboxLayout$LayoutParams.rightMargin;
                            }
                            else {
                                n2 = d.getLeft() - flexboxLayout$LayoutParams.leftMargin - this.m;
                            }
                            this.t(canvas, n2, lyz.b, lyz.g);
                        }
                        if (j == lyz.h - 1 && (this.k & 0x4) > 0) {
                            int n3;
                            if (b) {
                                n3 = d.getLeft() - flexboxLayout$LayoutParams.leftMargin - this.m;
                            }
                            else {
                                n3 = d.getRight() + flexboxLayout$LayoutParams.rightMargin;
                            }
                            this.t(canvas, n3, lyz.b, lyz.g);
                        }
                    }
                }
            }
            if (this.C(i)) {
                int d2;
                if (b2) {
                    d2 = lyz.d;
                }
                else {
                    d2 = lyz.b - this.l;
                }
                this.p(canvas, paddingLeft, d2, max);
            }
            if (this.D(i) && (this.j & 0x4) > 0) {
                int d3;
                if (b2) {
                    d3 = lyz.b - this.l;
                }
                else {
                    d3 = lyz.d;
                }
                this.p(canvas, paddingLeft, d3, max);
            }
        }
    }
    
    private final void o(final Canvas canvas, final boolean b, final boolean b2) {
        final int paddingTop = this.getPaddingTop();
        final int max = Math.max(0, this.getHeight() - this.getPaddingBottom() - paddingTop);
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final lyz lyz = this.c.get(i);
            for (int j = 0; j < lyz.h; ++j) {
                final int n = lyz.o + j;
                final View d = this.d(n);
                if (d != null) {
                    if (d.getVisibility() != 8) {
                        final FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d.getLayoutParams();
                        if (this.B(n, j)) {
                            int n2;
                            if (b2) {
                                n2 = d.getBottom() + flexboxLayout$LayoutParams.bottomMargin;
                            }
                            else {
                                n2 = d.getTop() - flexboxLayout$LayoutParams.topMargin - this.l;
                            }
                            this.p(canvas, lyz.a, n2, lyz.g);
                        }
                        if (j == lyz.h - 1 && (this.j & 0x4) > 0) {
                            int n3;
                            if (b2) {
                                n3 = d.getTop() - flexboxLayout$LayoutParams.topMargin - this.l;
                            }
                            else {
                                n3 = d.getBottom() + flexboxLayout$LayoutParams.bottomMargin;
                            }
                            this.p(canvas, lyz.a, n3, lyz.g);
                        }
                    }
                }
            }
            if (this.C(i)) {
                int c;
                if (b) {
                    c = lyz.c;
                }
                else {
                    c = lyz.a - this.m;
                }
                this.t(canvas, c, paddingTop, max);
            }
            if (this.D(i) && (this.k & 0x4) > 0) {
                int c2;
                if (b) {
                    c2 = lyz.a - this.m;
                }
                else {
                    c2 = lyz.c;
                }
                this.t(canvas, c2, paddingTop, max);
            }
        }
    }
    
    private final void p(final Canvas canvas, final int n, final int n2, final int n3) {
        final Drawable h = this.h;
        if (h == null) {
            return;
        }
        h.setBounds(n, n2, n3 + n, this.l + n2);
        this.h.draw(canvas);
    }
    
    private final void t(final Canvas canvas, final int n, final int n2, final int n3) {
        final Drawable i = this.i;
        if (i == null) {
            return;
        }
        i.setBounds(n, n2, this.m + n, n3 + n2);
        this.i.draw(canvas);
    }
    
    private final void v(final boolean b, int n, int i, int n2, int j) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int n3 = n2 - n;
        n2 = j - i - this.getPaddingBottom();
        i = this.getPaddingTop();
        final int size = this.c.size();
        j = 0;
        n = paddingLeft;
        while (j < size) {
            final lyz lyz = this.c.get(j);
            int n4 = n2;
            int n5 = i;
            if (this.C(j)) {
                final int l = this.l;
                n4 = n2 - l;
                n5 = i + l;
            }
            i = this.d;
            float n8 = 0.0f;
            float n10 = 0.0f;
            float n11 = 0.0f;
            Label_0425: {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                final float n6 = (float)n;
                                i = lyz.a();
                                float n7;
                                if (i != 1) {
                                    n7 = (float)(i - 1);
                                }
                                else {
                                    n7 = 1.0f;
                                }
                                n8 = (n3 - lyz.e) / n7;
                                final float n9 = (float)(n3 - paddingRight);
                                n10 = n6;
                                n11 = n9;
                                break Label_0425;
                            }
                            if (i == 4) {
                                i = lyz.a();
                                if (i != 0) {
                                    n8 = (n3 - lyz.e) / (float)i;
                                }
                                else {
                                    n8 = 0.0f;
                                }
                                final float n12 = n8 / 2.0f;
                                final float n13 = (float)n;
                                n11 = n3 - paddingRight - n12;
                                n10 = n13 + n12;
                                break Label_0425;
                            }
                            if (i == 5) {
                                i = lyz.a();
                                if (i != 0) {
                                    n8 = (n3 - lyz.e) / (float)(i + 1);
                                }
                                else {
                                    n8 = 0.0f;
                                }
                                n10 = n + n8;
                                n11 = n3 - paddingRight - n8;
                                break Label_0425;
                            }
                            final StringBuilder sb = new StringBuilder("Invalid justifyContent is set: ");
                            sb.append(this.d);
                            throw new IllegalStateException(sb.toString());
                        }
                        else {
                            final float n14 = (n3 - lyz.e) / 2.0f;
                            n10 = n + n14;
                            n11 = n3 - paddingRight - n14;
                        }
                    }
                    else {
                        i = lyz.e;
                        n10 = (float)(n3 - i + paddingRight);
                        n11 = (float)(i - n);
                    }
                }
                else {
                    n10 = (float)n;
                    n11 = (float)(n3 - paddingRight);
                }
                n8 = 0.0f;
            }
            final float max = Math.max(n8, 0.0f);
            View d;
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams;
            float n15;
            float n16;
            float n17;
            float n18;
            int m;
            float n19;
            float n20;
            float n21;
            float n22;
            for (i = 0; i < lyz.h; ++i) {
                n2 = lyz.o + i;
                d = this.d(n2);
                if (d != null) {
                    if (d.getVisibility() != 8) {
                        flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d.getLayoutParams();
                        n15 = n10 + flexboxLayout$LayoutParams.leftMargin;
                        n16 = n11 - flexboxLayout$LayoutParams.rightMargin;
                        if (this.B(n2, i)) {
                            n2 = this.m;
                            n17 = (float)n2;
                            n18 = n15 + n17;
                            n16 -= n17;
                        }
                        else {
                            n2 = 0;
                            n18 = n15;
                        }
                        if (i == lyz.h - 1 && (this.k & 0x4) > 0) {
                            m = this.m;
                        }
                        else {
                            m = 0;
                        }
                        if (this.b == 2) {
                            if (b) {
                                this.p.i(d, lyz, Math.round(n16) - d.getMeasuredWidth(), n4 - d.getMeasuredHeight(), Math.round(n16), n4);
                            }
                            else {
                                this.p.i(d, lyz, Math.round(n18), n4 - d.getMeasuredHeight(), Math.round(n18) + d.getMeasuredWidth(), n4);
                            }
                        }
                        else if (b) {
                            this.p.i(d, lyz, Math.round(n16) - d.getMeasuredWidth(), n5, Math.round(n16), n5 + d.getMeasuredHeight());
                        }
                        else {
                            this.p.i(d, lyz, Math.round(n18), n5, Math.round(n18) + d.getMeasuredWidth(), n5 + d.getMeasuredHeight());
                        }
                        n19 = n18 + (d.getMeasuredWidth() + max + flexboxLayout$LayoutParams.rightMargin);
                        n20 = (float)d.getMeasuredWidth();
                        n21 = (float)flexboxLayout$LayoutParams.leftMargin;
                        if (b) {
                            lyz.b(d, m, 0, n2, 0);
                        }
                        else {
                            lyz.b(d, n2, 0, m, 0);
                        }
                        n22 = n16 - (n20 + max + n21);
                        n10 = n19;
                        n11 = n22;
                    }
                }
            }
            n2 = lyz.g;
            i = n5 + n2;
            n2 = n4 - n2;
            ++j;
        }
    }
    
    private final void x(final boolean b, final boolean b2, int i, int l, int j, int m) {
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int paddingRight = this.getPaddingRight();
        final int paddingLeft = this.getPaddingLeft();
        final int n = m - l;
        i = j - i - paddingRight;
        final int size = this.c.size();
        j = 0;
        l = paddingLeft;
        while (j < size) {
            final lyz lyz = this.c.get(j);
            int n2 = l;
            m = i;
            if (this.C(j)) {
                m = this.m;
                n2 = l + m;
                m = i - m;
            }
            i = this.d;
            float n5 = 0.0f;
            float n7 = 0.0f;
            float n8 = 0.0f;
            Label_0437: {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                final float n3 = (float)paddingTop;
                                i = lyz.a();
                                float n4;
                                if (i != 1) {
                                    n4 = (float)(i - 1);
                                }
                                else {
                                    n4 = 1.0f;
                                }
                                n5 = (n - lyz.e) / n4;
                                final float n6 = (float)(n - paddingBottom);
                                n7 = n3;
                                n8 = n6;
                                break Label_0437;
                            }
                            if (i == 4) {
                                i = lyz.a();
                                if (i != 0) {
                                    n5 = (n - lyz.e) / (float)i;
                                }
                                else {
                                    n5 = 0.0f;
                                }
                                final float n9 = n5 / 2.0f;
                                final float n10 = (float)paddingTop;
                                n8 = n - paddingBottom - n9;
                                n7 = n10 + n9;
                                break Label_0437;
                            }
                            if (i == 5) {
                                i = lyz.a();
                                if (i != 0) {
                                    n5 = (n - lyz.e) / (float)(i + 1);
                                }
                                else {
                                    n5 = 0.0f;
                                }
                                n7 = paddingTop + n5;
                                n8 = n - paddingBottom - n5;
                                break Label_0437;
                            }
                            final StringBuilder sb = new StringBuilder("Invalid justifyContent is set: ");
                            sb.append(this.d);
                            throw new IllegalStateException(sb.toString());
                        }
                        else {
                            final float n11 = (n - lyz.e) / 2.0f;
                            n7 = paddingTop + n11;
                            n8 = n - paddingBottom - n11;
                        }
                    }
                    else {
                        i = lyz.e;
                        n7 = (float)(n - i + paddingBottom);
                        n8 = (float)(i - paddingTop);
                    }
                }
                else {
                    n7 = (float)paddingTop;
                    n8 = (float)(n - paddingBottom);
                }
                n5 = 0.0f;
            }
            final float max = Math.max(n5, 0.0f);
            View d;
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams;
            float n12;
            float n13;
            float n14;
            float n15;
            int k;
            float n16;
            float n17;
            float n18;
            float n19;
            float n20;
            float n21;
            for (i = 0; i < lyz.h; ++i) {
                l = lyz.o + i;
                d = this.d(l);
                if (d != null) {
                    if (d.getVisibility() != 8) {
                        flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d.getLayoutParams();
                        n12 = n7 + flexboxLayout$LayoutParams.topMargin;
                        n13 = n8 - flexboxLayout$LayoutParams.bottomMargin;
                        if (this.B(l, i)) {
                            l = this.l;
                            n14 = (float)l;
                            n15 = n12 + n14;
                            n13 -= n14;
                        }
                        else {
                            n15 = n12;
                            l = 0;
                        }
                        if (i == lyz.h - 1 && (this.j & 0x4) > 0) {
                            k = this.l;
                        }
                        else {
                            k = 0;
                        }
                        if (b) {
                            if (b2) {
                                this.p.j(d, lyz, true, m - d.getMeasuredWidth(), Math.round(n13) - d.getMeasuredHeight(), m, Math.round(n13));
                            }
                            else {
                                this.p.j(d, lyz, true, m - d.getMeasuredWidth(), Math.round(n15), m, Math.round(n15) + d.getMeasuredHeight());
                            }
                        }
                        else if (b2) {
                            this.p.j(d, lyz, false, n2, Math.round(n13) - d.getMeasuredHeight(), n2 + d.getMeasuredWidth(), Math.round(n13));
                        }
                        else {
                            this.p.j(d, lyz, false, n2, Math.round(n15), n2 + d.getMeasuredWidth(), Math.round(n15) + d.getMeasuredHeight());
                        }
                        n16 = (float)d.getMeasuredHeight();
                        n17 = (float)flexboxLayout$LayoutParams.bottomMargin;
                        n18 = (float)d.getMeasuredHeight();
                        n19 = (float)flexboxLayout$LayoutParams.topMargin;
                        if (b2) {
                            lyz.b(d, 0, k, 0, l);
                        }
                        else {
                            lyz.b(d, 0, l, 0, k);
                        }
                        n20 = n15 + (n16 + max + n17);
                        n21 = n13 - (n18 + max + n19);
                        n7 = n20;
                        n8 = n21;
                    }
                }
            }
            i = lyz.g;
            l = n2 + i;
            i = m - i;
            ++j;
        }
    }
    
    private final void y(int n, int n2, final int n3, int n4) {
        final int mode = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n2);
        final int mode2 = View$MeasureSpec.getMode(n3);
        final int size2 = View$MeasureSpec.getSize(n3);
        int n5;
        if (n != 0 && n != 1) {
            if (n != 2 && n != 3) {
                final StringBuilder sb = new StringBuilder("Invalid flex direction: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            n = this.n();
            n5 = this.r() + this.getPaddingLeft() + this.getPaddingRight();
        }
        else {
            n = this.r() + this.getPaddingTop() + this.getPaddingBottom();
            n5 = this.n();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    final StringBuilder sb2 = new StringBuilder("Unknown width mode is set: ");
                    sb2.append(mode);
                    throw new IllegalStateException(sb2.toString());
                }
                int combineMeasuredStates = n4;
                if (size < n5) {
                    combineMeasuredStates = View.combineMeasuredStates(n4, 16777216);
                }
                n2 = View.resolveSizeAndState(size, n2, combineMeasuredStates);
                n4 = combineMeasuredStates;
            }
            else {
                n2 = View.resolveSizeAndState(n5, n2, n4);
            }
        }
        else {
            if (size < n5) {
                n4 = View.combineMeasuredStates(n4, 16777216);
                n5 = size;
            }
            n2 = View.resolveSizeAndState(n5, n2, n4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    final StringBuilder sb3 = new StringBuilder("Unknown height mode is set: ");
                    sb3.append(mode2);
                    throw new IllegalStateException(sb3.toString());
                }
                int combineMeasuredStates2 = n4;
                if (size2 < n) {
                    combineMeasuredStates2 = View.combineMeasuredStates(n4, 256);
                }
                n = View.resolveSizeAndState(size2, n3, combineMeasuredStates2);
            }
            else {
                n = View.resolveSizeAndState(n, n3, n4);
            }
        }
        else {
            if (size2 < n) {
                n4 = View.combineMeasuredStates(n4, 256);
                n = size2;
            }
            n = View.resolveSizeAndState(n, n3, n4);
        }
        this.setMeasuredDimension(n2, n);
    }
    
    private final void z() {
        if (this.h == null && this.i == null) {
            this.setWillNotDraw(true);
            return;
        }
        this.setWillNotDraw(false);
    }
    
    public final void A(final View view, int n, int n2, final lyz lyz) {
        if (this.B(n, n2)) {
            if (this.K()) {
                n = lyz.e;
                n2 = this.m;
            }
            else {
                n = lyz.e;
                n2 = this.l;
            }
            lyz.e = n + n2;
            lyz.f += n2;
        }
    }
    
    public final void H(final lyz lyz) {
        int n;
        int n2;
        if (this.K()) {
            if ((this.k & 0x4) <= 0) {
                return;
            }
            n = lyz.e;
            n2 = this.m;
        }
        else {
            if ((this.j & 0x4) <= 0) {
                return;
            }
            n = lyz.e;
            n2 = this.l;
        }
        lyz.e = n + n2;
        lyz.f += n2;
    }
    
    public final void I(final List c) {
        this.c = c;
    }
    
    public final void J(final int n, final View view) {
    }
    
    public final boolean K() {
        final int a = this.a;
        return a == 0 || a == 1;
    }
    
    public final int a() {
        return this.f;
    }
    
    public final void addView(final View view, final int a, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.o == null) {
            this.o = new SparseIntArray(this.getChildCount());
        }
        final lzb p3 = this.p;
        final SparseIntArray o = this.o;
        final int l = p3.a.l();
        final List a2 = p3.a(l);
        final lza lza = new lza();
        if (view != null && viewGroup$LayoutParams instanceof FlexItem) {
            lza.b = ((FlexItem)viewGroup$LayoutParams).n();
        }
        else {
            lza.b = 1;
        }
        if (a != -1 && a != l) {
            if (a < p3.a.l()) {
                lza.a = a;
                for (int i = a; i < l; ++i) {
                    final lza lza2 = a2.get(i);
                    ++lza2.a;
                }
            }
            else {
                lza.a = l;
            }
        }
        else {
            lza.a = l;
        }
        a2.add(lza);
        this.n = lzb.o(l + 1, a2, o);
        super.addView(view, a, viewGroup$LayoutParams);
    }
    
    public final int b() {
        return this.e;
    }
    
    public final int c(final int n, final int n2, final int n3) {
        return getChildMeasureSpec(n, n2, n3);
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof FlexboxLayout$LayoutParams;
    }
    
    public final View d(final int n) {
        if (n >= 0) {
            final int[] n2 = this.n;
            if (n < n2.length) {
                return this.getChildAt(n2[n]);
            }
        }
        return null;
    }
    
    public final void e(final Drawable h) {
        if (h == this.h) {
            return;
        }
        this.h = h;
        this.l = h.getIntrinsicHeight();
        this.z();
        this.requestLayout();
    }
    
    public final void f(final Drawable i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.m = i.getIntrinsicWidth();
        this.z();
        this.requestLayout();
    }
    
    public final int g(final int n, final int n2, final int n3) {
        return getChildMeasureSpec(n, n2, n3);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof FlexboxLayout$LayoutParams) {
            return (ViewGroup$LayoutParams)new FlexboxLayout$LayoutParams((FlexboxLayout$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (ViewGroup$LayoutParams)new FlexboxLayout$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)new FlexboxLayout$LayoutParams(viewGroup$LayoutParams);
    }
    
    public final int i(final View view) {
        return 0;
    }
    
    public final int j(final View view, int n, final int n2) {
        final boolean k = this.K();
        final int n3 = 0;
        int n4 = 0;
        if (k) {
            if (this.B(n, n2)) {
                n4 = this.m;
            }
            if ((this.k & 0x4) <= 0) {
                return n4;
            }
            n = this.m;
        }
        else {
            n4 = n3;
            if (this.B(n, n2)) {
                n4 = this.l;
            }
            if ((this.j & 0x4) <= 0) {
                return n4;
            }
            n = this.l;
        }
        return n4 + n;
    }
    
    public final int k() {
        return this.a;
    }
    
    public final int l() {
        return this.getChildCount();
    }
    
    public final int m() {
        return this.b;
    }
    
    public final int n() {
        final Iterator iterator = this.c.iterator();
        int max = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            max = Math.max(max, ((lyz)iterator.next()).e);
        }
        return max;
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.i == null && this.h == null) {
            return;
        }
        if (this.j == 0 && this.k == 0) {
            return;
        }
        final int f = ana.f((View)this);
        final int a = this.a;
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = true;
        if (a == 0) {
            final boolean b5 = f == 1;
            boolean b6 = b2;
            if (this.b == 2) {
                b6 = true;
            }
            this.h(canvas, b5, b6);
            return;
        }
        if (a == 1) {
            final boolean b7 = f != 1;
            boolean b8 = b;
            if (this.b == 2) {
                b8 = true;
            }
            this.h(canvas, b7, b8);
            return;
        }
        if (a == 2) {
            boolean b9 = f != 1;
            if (f != 1) {
                b4 = false;
            }
            if (this.b != 2) {
                b9 = b4;
            }
            this.o(canvas, b9, false);
            return;
        }
        if (a != 3) {
            return;
        }
        boolean b10 = f != 1;
        boolean b11 = b3;
        if (f == 1) {
            b11 = true;
        }
        if (this.b != 2) {
            b10 = b11;
        }
        this.o(canvas, b10, true);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int f = ana.f((View)this);
        final int a = this.a;
        final boolean b2 = false;
        boolean b3 = false;
        if (a == 0) {
            this.v(f == 1, n, n2, n3, n4);
            return;
        }
        if (a == 1) {
            this.v(f != 1, n, n2, n3, n4);
            return;
        }
        if (a == 2) {
            boolean b4 = f != 1;
            boolean b5 = b2;
            if (f == 1) {
                b5 = true;
            }
            if (this.b != 2) {
                b4 = b5;
            }
            this.x(b4, false, n, n2, n3, n4);
            return;
        }
        if (a == 3) {
            boolean b6 = f != 1;
            if (f == 1) {
                b3 = true;
            }
            if (this.b != 2) {
                b6 = b3;
            }
            this.x(b6, true, n, n2, n3, n4);
            return;
        }
        final StringBuilder sb = new StringBuilder("Invalid flex direction is set: ");
        sb.append(this.a);
        throw new IllegalStateException(sb.toString());
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.o == null) {
            this.o = new SparseIntArray(this.getChildCount());
        }
        final lzb p2 = this.p;
        final SparseIntArray o = this.o;
        final int l = p2.a.l();
        Label_0160: {
            Label_0111: {
                if (o.size() == l) {
                    for (int i = 0; i < l; ++i) {
                        final View s = p2.a.s(i);
                        if (s != null) {
                            if (((FlexItem)s.getLayoutParams()).n() != o.get(i)) {
                                break Label_0111;
                            }
                        }
                    }
                    break Label_0160;
                }
            }
            final lzb p3 = this.p;
            final SparseIntArray o2 = this.o;
            final int j = p3.a.l();
            this.n = lzb.o(j, p3.a(j), o2);
        }
        final int a = this.a;
        if (a == 0 || a == 1) {
            this.c.clear();
            this.q.n();
            this.p.p(this.q, n, n2, Integer.MAX_VALUE, 0, -1, (List)null);
            this.c = (List)this.q.b;
            this.p.d(n, n2);
            if (this.e == 3) {
                for (final lyz lyz : this.c) {
                    int g = Integer.MIN_VALUE;
                    int n3;
                    for (int k = 0; k < lyz.h; ++k, g = n3) {
                        final View d = this.d(lyz.o + k);
                        n3 = g;
                        if (d != null) {
                            if (d.getVisibility() == 8) {
                                n3 = g;
                            }
                            else {
                                final FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d.getLayoutParams();
                                if (this.b != 2) {
                                    n3 = Math.max(g, d.getMeasuredHeight() + Math.max(lyz.l - d.getBaseline(), flexboxLayout$LayoutParams.topMargin) + flexboxLayout$LayoutParams.bottomMargin);
                                }
                                else {
                                    n3 = Math.max(g, d.getMeasuredHeight() + flexboxLayout$LayoutParams.topMargin + Math.max(lyz.l - d.getMeasuredHeight() + d.getBaseline(), flexboxLayout$LayoutParams.bottomMargin));
                                }
                            }
                        }
                    }
                    lyz.g = g;
                }
            }
            this.p.c(n, n2, this.getPaddingTop() + this.getPaddingBottom());
            this.p.k();
            this.y(this.a, n, n2, this.q.a);
            return;
        }
        if (a != 2 && a != 3) {
            final StringBuilder sb = new StringBuilder("Invalid value for the flex direction is set: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
        this.c.clear();
        this.q.n();
        this.p.p(this.q, n2, n, Integer.MAX_VALUE, 0, -1, (List)null);
        this.c = (List)this.q.b;
        this.p.d(n, n2);
        this.p.c(n, n2, this.getPaddingLeft() + this.getPaddingRight());
        this.p.k();
        this.y(this.a, n, n2, this.q.a);
    }
    
    public final int q() {
        return this.g;
    }
    
    public final int r() {
        final int size = this.c.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final lyz lyz = this.c.get(i);
            int n2 = n;
            if (this.C(i)) {
                int n3;
                if (this.K()) {
                    n3 = this.l;
                }
                else {
                    n3 = this.m;
                }
                n2 = n + n3;
            }
            int n4 = n2;
            if (this.D(i)) {
                int n5;
                if (this.K()) {
                    n5 = this.l;
                }
                else {
                    n5 = this.m;
                }
                n4 = n2 + n5;
            }
            n = n4 + lyz.g;
            ++i;
        }
        return n;
    }
    
    public final View s(final int n) {
        return this.getChildAt(n);
    }
    
    public final View u(final int n) {
        return this.d(n);
    }
    
    public final List w() {
        return this.c;
    }
}
