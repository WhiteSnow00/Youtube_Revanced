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

public class FlexboxLayout extends ViewGroup implements mar
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
    private mau p;
    private agpl q;
    
    public FlexboxLayout(final Context context) {
        this(context, null);
    }
    
    public FlexboxLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FlexboxLayout(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.g = -1;
        this.p = new mau((mar)this);
        this.c = new ArrayList();
        this.q = new agpl();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, max.a, n, 0);
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
                    if (((mas)this.c.get(i)).a() > 0) {
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
            final mas mas = this.c.get(i);
            for (int j = 0; j < mas.h; ++j) {
                final int n = mas.o + j;
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
                            this.t(canvas, n2, mas.b, mas.g);
                        }
                        if (j == mas.h - 1 && (this.k & 0x4) > 0) {
                            int n3;
                            if (b) {
                                n3 = d.getLeft() - flexboxLayout$LayoutParams.leftMargin - this.m;
                            }
                            else {
                                n3 = d.getRight() + flexboxLayout$LayoutParams.rightMargin;
                            }
                            this.t(canvas, n3, mas.b, mas.g);
                        }
                    }
                }
            }
            if (this.C(i)) {
                int d2;
                if (b2) {
                    d2 = mas.d;
                }
                else {
                    d2 = mas.b - this.l;
                }
                this.p(canvas, paddingLeft, d2, max);
            }
            if (this.D(i) && (this.j & 0x4) > 0) {
                int d3;
                if (b2) {
                    d3 = mas.b - this.l;
                }
                else {
                    d3 = mas.d;
                }
                this.p(canvas, paddingLeft, d3, max);
            }
        }
    }
    
    private final void o(final Canvas canvas, final boolean b, final boolean b2) {
        final int paddingTop = this.getPaddingTop();
        final int max = Math.max(0, this.getHeight() - this.getPaddingBottom() - paddingTop);
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final mas mas = this.c.get(i);
            for (int j = 0; j < mas.h; ++j) {
                final int n = mas.o + j;
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
                            this.p(canvas, mas.a, n2, mas.g);
                        }
                        if (j == mas.h - 1 && (this.j & 0x4) > 0) {
                            int n3;
                            if (b2) {
                                n3 = d.getTop() - flexboxLayout$LayoutParams.topMargin - this.l;
                            }
                            else {
                                n3 = d.getBottom() + flexboxLayout$LayoutParams.bottomMargin;
                            }
                            this.p(canvas, mas.a, n3, mas.g);
                        }
                    }
                }
            }
            if (this.C(i)) {
                int c;
                if (b) {
                    c = mas.c;
                }
                else {
                    c = mas.a - this.m;
                }
                this.t(canvas, c, paddingTop, max);
            }
            if (this.D(i) && (this.k & 0x4) > 0) {
                int c2;
                if (b) {
                    c2 = mas.a - this.m;
                }
                else {
                    c2 = mas.c;
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
    
    private final void v(final boolean b, final int n, int n2, final int n3, int i) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        int n4 = i - n2 - this.getPaddingBottom();
        i = this.getPaddingTop();
        final int size = this.c.size();
        int j = 0;
        n2 = paddingLeft;
        while (j < size) {
            final mas mas = this.c.get(j);
            int n5 = n4;
            int n6 = i;
            if (this.C(j)) {
                final int l = this.l;
                n5 = n4 - l;
                n6 = i + l;
            }
            i = n3 - n;
            final int d = this.d;
            float n7 = 0.0f;
            float n8 = 0.0f;
            float n9 = 0.0f;
            Label_0464: {
                if (d != 0) {
                    if (d == 1) {
                        final int e = mas.e;
                        n7 = (float)(e - n2);
                        n8 = (float)(i - e + paddingRight);
                        n9 = 0.0f;
                        break Label_0464;
                    }
                    if (d != 2) {
                        if (d == 3) {
                            final float n10 = (float)n2;
                            final int a = mas.a();
                            float n11;
                            if (a != 1) {
                                n11 = (float)(a - 1);
                            }
                            else {
                                n11 = 1.0f;
                            }
                            final int e2 = mas.e;
                            final float n12 = (float)(i - paddingRight);
                            final float n13 = (i - e2) / n11;
                            n8 = n10;
                            n7 = n12;
                            n9 = n13;
                            break Label_0464;
                        }
                        if (d == 4) {
                            final int a2 = mas.a();
                            if (a2 != 0) {
                                n9 = (i - mas.e) / (float)a2;
                            }
                            else {
                                n9 = 0.0f;
                            }
                            final float n14 = (float)n2;
                            final float n15 = n9 / 2.0f;
                            n7 = i - paddingRight - n15;
                            n8 = n14 + n15;
                            break Label_0464;
                        }
                        if (d == 5) {
                            final int a3 = mas.a();
                            if (a3 != 0) {
                                n9 = (i - mas.e) / (float)(a3 + 1);
                            }
                            else {
                                n9 = 0.0f;
                            }
                            final float n16 = (float)n2;
                            n7 = i - paddingRight - n9;
                            n8 = n16 + n9;
                            break Label_0464;
                        }
                        final StringBuilder sb = new StringBuilder("Invalid justifyContent is set: ");
                        sb.append(d);
                        throw new IllegalStateException(sb.toString());
                    }
                    else {
                        final float n17 = (float)n2;
                        final float n18 = (i - mas.e) / 2.0f;
                        n7 = i - paddingRight - n18;
                        n8 = n17 + n18;
                    }
                }
                else {
                    n8 = (float)n2;
                    n7 = (float)(i - paddingRight);
                }
                n9 = 0.0f;
            }
            final float max = Math.max(n9, 0.0f);
            int n19;
            View d2;
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams;
            float n20;
            float n21;
            int m;
            float n22;
            float n23;
            int k;
            float n24;
            float n25;
            float n26;
            float n27;
            for (i = 0; i < mas.h; ++i) {
                n19 = mas.o + i;
                d2 = this.d(n19);
                if (d2 != null && d2.getVisibility() != 8) {
                    flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d2.getLayoutParams();
                    n20 = n8 + flexboxLayout$LayoutParams.leftMargin;
                    n21 = n7 - flexboxLayout$LayoutParams.rightMargin;
                    if (this.B(n19, i)) {
                        m = this.m;
                        n22 = (float)m;
                        n23 = n20 + n22;
                        n21 -= n22;
                    }
                    else {
                        m = 0;
                        n23 = n20;
                    }
                    if (i == mas.h - 1 && (this.k & 0x4) > 0) {
                        k = this.m;
                    }
                    else {
                        k = 0;
                    }
                    if (this.b == 2) {
                        if (b) {
                            this.p.i(d2, mas, Math.round(n21) - d2.getMeasuredWidth(), n5 - d2.getMeasuredHeight(), Math.round(n21), n5);
                        }
                        else {
                            this.p.i(d2, mas, Math.round(n23), n5 - d2.getMeasuredHeight(), Math.round(n23) + d2.getMeasuredWidth(), n5);
                        }
                    }
                    else if (b) {
                        this.p.i(d2, mas, Math.round(n21) - d2.getMeasuredWidth(), n6, Math.round(n21), n6 + d2.getMeasuredHeight());
                    }
                    else {
                        this.p.i(d2, mas, Math.round(n23), n6, Math.round(n23) + d2.getMeasuredWidth(), n6 + d2.getMeasuredHeight());
                    }
                    n24 = n23 + (d2.getMeasuredWidth() + max + flexboxLayout$LayoutParams.rightMargin);
                    n25 = (float)d2.getMeasuredWidth();
                    n26 = (float)flexboxLayout$LayoutParams.leftMargin;
                    if (b) {
                        mas.b(d2, k, 0, m, 0);
                    }
                    else {
                        mas.b(d2, m, 0, k, 0);
                    }
                    n27 = n21 - (n25 + max + n26);
                    n8 = n24;
                    n7 = n27;
                }
            }
            final int g = mas.g;
            i = n6 + g;
            n4 = n5 - g;
            ++j;
        }
    }
    
    private final void x(final boolean b, final boolean b2, int i, final int n, int n2, final int n3) {
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        i = n2 - i - this.getPaddingRight();
        n2 = this.getPaddingLeft();
        for (int size = this.c.size(), j = 0; j < size; ++j) {
            final mas mas = this.c.get(j);
            int n4 = i;
            int n5 = n2;
            if (this.C(j)) {
                final int m = this.m;
                n5 = n2 + m;
                n4 = i - m;
            }
            i = n3 - n;
            n2 = this.d;
            float n6 = 0.0f;
            float n7 = 0.0f;
            float n8 = 0.0f;
            Label_0446: {
                if (n2 != 0) {
                    if (n2 == 1) {
                        n2 = mas.e;
                        n6 = (float)(n2 - paddingTop);
                        n7 = (float)(i - n2 + paddingBottom);
                        n8 = 0.0f;
                        break Label_0446;
                    }
                    if (n2 != 2) {
                        if (n2 == 3) {
                            n7 = (float)paddingTop;
                            n2 = mas.a();
                            float n9;
                            if (n2 != 1) {
                                n9 = (float)(n2 - 1);
                            }
                            else {
                                n9 = 1.0f;
                            }
                            n2 = mas.e;
                            final float n10 = (float)(i - paddingBottom);
                            n8 = (i - n2) / n9;
                            n6 = n10;
                            break Label_0446;
                        }
                        if (n2 == 4) {
                            n2 = mas.a();
                            if (n2 != 0) {
                                n8 = (i - mas.e) / (float)n2;
                            }
                            else {
                                n8 = 0.0f;
                            }
                            final float n11 = (float)paddingTop;
                            final float n12 = n8 / 2.0f;
                            n6 = i - paddingBottom - n12;
                            n7 = n11 + n12;
                            break Label_0446;
                        }
                        if (n2 == 5) {
                            n2 = mas.a();
                            if (n2 != 0) {
                                n8 = (i - mas.e) / (float)(n2 + 1);
                            }
                            else {
                                n8 = 0.0f;
                            }
                            final float n13 = (float)paddingTop;
                            n6 = i - paddingBottom - n8;
                            n7 = n13 + n8;
                            break Label_0446;
                        }
                        final StringBuilder sb = new StringBuilder("Invalid justifyContent is set: ");
                        sb.append(n2);
                        throw new IllegalStateException(sb.toString());
                    }
                    else {
                        final float n14 = (float)paddingTop;
                        final float n15 = (i - mas.e) / 2.0f;
                        n6 = i - paddingBottom - n15;
                        n7 = n14 + n15;
                    }
                }
                else {
                    n7 = (float)paddingTop;
                    n6 = (float)(i - paddingBottom);
                }
                n8 = 0.0f;
            }
            final float max = Math.max(n8, 0.0f);
            View d;
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams;
            float n16;
            float n17;
            float n18;
            float n19;
            int l;
            float n20;
            float n21;
            float n22;
            float n23;
            float n24;
            float n25;
            for (i = 0; i < mas.h; ++i) {
                n2 = mas.o + i;
                d = this.d(n2);
                if (d != null && d.getVisibility() != 8) {
                    flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d.getLayoutParams();
                    n16 = n7 + flexboxLayout$LayoutParams.topMargin;
                    n17 = n6 - flexboxLayout$LayoutParams.bottomMargin;
                    if (this.B(n2, i)) {
                        n2 = this.l;
                        n18 = (float)n2;
                        n17 -= n18;
                        n19 = n16 + n18;
                    }
                    else {
                        n19 = n16;
                        n2 = 0;
                    }
                    if (i == mas.h - 1 && (this.j & 0x4) > 0) {
                        l = this.l;
                    }
                    else {
                        l = 0;
                    }
                    if (b) {
                        if (b2) {
                            this.p.j(d, mas, true, n4 - d.getMeasuredWidth(), Math.round(n17) - d.getMeasuredHeight(), n4, Math.round(n17));
                        }
                        else {
                            this.p.j(d, mas, true, n4 - d.getMeasuredWidth(), Math.round(n19), n4, Math.round(n19) + d.getMeasuredHeight());
                        }
                    }
                    else if (b2) {
                        this.p.j(d, mas, false, n5, Math.round(n17) - d.getMeasuredHeight(), n5 + d.getMeasuredWidth(), Math.round(n17));
                    }
                    else {
                        this.p.j(d, mas, false, n5, Math.round(n19), n5 + d.getMeasuredWidth(), Math.round(n19) + d.getMeasuredHeight());
                    }
                    n20 = (float)d.getMeasuredHeight();
                    n21 = (float)flexboxLayout$LayoutParams.bottomMargin;
                    n22 = (float)d.getMeasuredHeight();
                    n23 = (float)flexboxLayout$LayoutParams.topMargin;
                    if (b2) {
                        mas.b(d, 0, l, 0, n2);
                    }
                    else {
                        mas.b(d, 0, n2, 0, l);
                    }
                    n24 = n17 - (n22 + max + n23);
                    n25 = n19 + (n20 + max + n21);
                    n6 = n24;
                    n7 = n25;
                }
            }
            i = mas.g;
            n2 = n5 + i;
            i = n4 - i;
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
    
    public final void A(final View view, int n, int n2, final mas mas) {
        if (this.B(n, n2)) {
            if (this.K()) {
                n2 = mas.e;
                n = this.m;
            }
            else {
                n2 = mas.e;
                n = this.l;
            }
            mas.e = n2 + n;
            mas.f += n;
        }
    }
    
    public final void H(final mas mas) {
        int n;
        int n2;
        if (this.K()) {
            if ((this.k & 0x4) <= 0) {
                return;
            }
            n = mas.e;
            n2 = this.m;
        }
        else {
            if ((this.j & 0x4) <= 0) {
                return;
            }
            n = mas.e;
            n2 = this.l;
        }
        mas.e = n + n2;
        mas.f += n2;
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
        final mau p3 = this.p;
        final SparseIntArray o = this.o;
        final int l = p3.a.l();
        final List a2 = p3.a(l);
        final mat mat = new mat();
        if (view != null && viewGroup$LayoutParams instanceof FlexItem) {
            mat.b = ((FlexItem)viewGroup$LayoutParams).n();
        }
        else {
            mat.b = 1;
        }
        if (a != -1 && a != l) {
            if (a < p3.a.l()) {
                mat.a = a;
                for (int i = a; i < l; ++i) {
                    final mat mat2 = a2.get(i);
                    ++mat2.a;
                }
            }
            else {
                mat.a = l;
            }
        }
        else {
            mat.a = l;
        }
        a2.add(mat);
        this.n = mau.o(l + 1, a2, o);
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
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new FlexboxLayout$LayoutParams(this.getContext(), set);
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
        int n3 = 0;
        final int n4 = 0;
        if (k) {
            n3 = n4;
            if (this.B(n, n2)) {
                n3 = this.m;
            }
            n = n3;
            if ((this.k & 0x4) <= 0) {
                return n;
            }
            n = this.m;
        }
        else {
            if (this.B(n, n2)) {
                n3 = this.l;
            }
            n = n3;
            if ((this.j & 0x4) <= 0) {
                return n;
            }
            n = this.l;
        }
        return n3 + n;
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
            max = Math.max(max, ((mas)iterator.next()).e);
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
        final int f = anc.f((View)this);
        final int a = this.a;
        boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = true;
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
            if (this.b == 2) {
                b = true;
            }
            this.h(canvas, b7, b);
            return;
        }
        if (a == 2) {
            boolean b8 = f != 1;
            final boolean b9 = f == 1 && b4;
            if (this.b != 2) {
                b8 = b9;
            }
            this.o(canvas, b8, false);
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
        final int f = anc.f((View)this);
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
        sb.append(a);
        throw new IllegalStateException(sb.toString());
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.o == null) {
            this.o = new SparseIntArray(this.getChildCount());
        }
        final mau p2 = this.p;
        final SparseIntArray o = this.o;
        final int l = p2.a.l();
        Label_0158: {
            Label_0110: {
                if (o.size() == l) {
                    for (int i = 0; i < l; ++i) {
                        final View s = p2.a.s(i);
                        if (s != null) {
                            if (((FlexItem)s.getLayoutParams()).n() != o.get(i)) {
                                break Label_0110;
                            }
                        }
                    }
                    break Label_0158;
                }
            }
            final mau p3 = this.p;
            final SparseIntArray o2 = this.o;
            final int j = p3.a.l();
            this.n = mau.o(j, p3.a(j), o2);
        }
        final int a = this.a;
        if (a == 0 || a == 1) {
            this.c.clear();
            this.q.n();
            this.p.p(this.q, n, n2, Integer.MAX_VALUE, 0, -1, (List)null);
            this.c = (List)this.q.b;
            this.p.d(n, n2);
            if (this.e == 3) {
                for (final mas mas : this.c) {
                    int g = Integer.MIN_VALUE;
                    int n3;
                    for (int k = 0; k < mas.h; ++k, g = n3) {
                        final View d = this.d(mas.o + k);
                        n3 = g;
                        if (d != null) {
                            n3 = g;
                            if (d.getVisibility() != 8) {
                                final FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)d.getLayoutParams();
                                if (this.b != 2) {
                                    n3 = Math.max(g, d.getMeasuredHeight() + Math.max(mas.l - d.getBaseline(), flexboxLayout$LayoutParams.topMargin) + flexboxLayout$LayoutParams.bottomMargin);
                                }
                                else {
                                    n3 = Math.max(g, d.getMeasuredHeight() + flexboxLayout$LayoutParams.topMargin + Math.max(mas.l - d.getMeasuredHeight() + d.getBaseline(), flexboxLayout$LayoutParams.bottomMargin));
                                }
                            }
                        }
                    }
                    mas.g = g;
                }
            }
            this.p.c(n, n2, this.getPaddingTop() + this.getPaddingBottom());
            this.p.k();
            this.y(this.a, n, n2, this.q.a);
            return;
        }
        if (a != 2 && a != 3) {
            final StringBuilder sb = new StringBuilder("Invalid value for the flex direction is set: ");
            sb.append(a);
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
            final mas mas = this.c.get(i);
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
            n = n4 + mas.g;
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
