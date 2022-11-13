// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.button;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.TreeMap;
import android.graphics.Canvas;
import android.text.TextUtils$TruncateAt;
import android.util.Log;
import java.util.Iterator;
import java.util.Collection;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.TypedArray;
import android.view.View;
import java.util.HashSet;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Set;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import android.widget.LinearLayout;

public class MaterialButtonToggleGroup extends LinearLayout
{
    public boolean a;
    private final List b;
    private final LinkedHashSet c;
    private final Comparator d;
    private Integer[] e;
    private boolean f;
    private boolean g;
    private final int h;
    private Set i;
    private final afhd j;
    
    public MaterialButtonToggleGroup(final Context context) {
        this(context, null);
    }
    
    public MaterialButtonToggleGroup(final Context context, final AttributeSet set) {
        this(context, set, 2130969836);
    }
    
    public MaterialButtonToggleGroup(final Context context, final AttributeSet set, final int n) {
        super(aeba.a(context, set, n, 2132085200), set, n);
        this.b = new ArrayList();
        this.j = new afhd(this);
        this.c = new LinkedHashSet();
        this.d = (Comparator)new xlv(this, 2);
        this.a = false;
        this.i = new HashSet();
        final TypedArray a = adwh.a(this.getContext(), set, adua.b, n, 2132085200, new int[0]);
        final boolean boolean1 = a.getBoolean(3, false);
        if (this.f != boolean1) {
            this.f = boolean1;
            this.g(new HashSet());
        }
        this.h = a.getResourceId(1, -1);
        this.g = a.getBoolean(2, false);
        this.setChildrenDrawingOrderEnabled(true);
        this.setEnabled(a.getBoolean(0, true));
        a.recycle();
        anb.X((View)this, 1);
    }
    
    private final int d() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (this.c(i)) {
                return i;
            }
        }
        return -1;
    }
    
    private final MaterialButton e(final int n) {
        return (MaterialButton)this.getChildAt(n);
    }
    
    private final void f() {
        final int d = this.d();
        if (d == -1) {
            return;
        }
        for (int i = d + 1; i < this.getChildCount(); ++i) {
            final MaterialButton e = this.e(i);
            final int min = Math.min(e.b(), this.e(i - 1).b());
            final ViewGroup$LayoutParams layoutParams = ((View)e).getLayoutParams();
            LinearLayout$LayoutParams layoutParams2;
            if (layoutParams instanceof LinearLayout$LayoutParams) {
                layoutParams2 = (LinearLayout$LayoutParams)layoutParams;
            }
            else {
                layoutParams2 = new LinearLayout$LayoutParams(layoutParams.width, layoutParams.height);
            }
            if (this.getOrientation() == 0) {
                all.f((ViewGroup$MarginLayoutParams)layoutParams2, 0);
                all.g((ViewGroup$MarginLayoutParams)layoutParams2, -min);
                layoutParams2.topMargin = 0;
            }
            else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                all.g((ViewGroup$MarginLayoutParams)layoutParams2, 0);
            }
            e.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        }
        if (this.getChildCount() != 0) {
            if (d != -1) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.e(d).getLayoutParams();
                if (this.getOrientation() == 1) {
                    linearLayout$LayoutParams.topMargin = 0;
                    linearLayout$LayoutParams.bottomMargin = 0;
                    return;
                }
                all.f((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
                all.g((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
                linearLayout$LayoutParams.leftMargin = 0;
                linearLayout$LayoutParams.rightMargin = 0;
            }
        }
    }
    
    private final void g(final Set set) {
        final Set i = this.i;
        this.i = new HashSet(set);
        for (int j = 0; j < this.getChildCount(); ++j) {
            final int id = this.e(j).getId();
            final Integer value = id;
            final boolean contains = set.contains(value);
            final View viewById = this.findViewById(id);
            if (viewById instanceof MaterialButton) {
                this.a = true;
                ((MaterialButton)viewById).setChecked(contains);
                this.a = false;
            }
            if (i.contains(value) != set.contains(value)) {
                set.contains(value);
                final Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    ((adtz)iterator.next()).a();
                }
            }
        }
        this.invalidate();
    }
    
    public final void a(final int n, final boolean b) {
        if (n == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: -1");
            return;
        }
        final HashSet set = new HashSet(this.i);
        if (b) {
            final Integer value = n;
            if (set.contains(value)) {
                return;
            }
            if (this.f && !set.isEmpty()) {
                set.clear();
            }
            set.add(value);
        }
        else {
            final Integer value2 = n;
            if (!set.contains(value2)) {
                return;
            }
            if (!this.g || set.size() > 1) {
                set.remove(value2);
            }
        }
        this.g(set);
    }
    
    public final void addView(final View view, int u, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, u, viewGroup$LayoutParams);
        final MaterialButton materialButton = (MaterialButton)view;
        if (materialButton.getId() == -1) {
            materialButton.setId(anb.c());
        }
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils$TruncateAt.END);
        if (materialButton.f()) {
            materialButton.a.p = true;
        }
        materialButton.c = this.j;
        if (materialButton.f()) {
            final adtw a = materialButton.a;
            a.n = true;
            final adyh a2 = a.a();
            final adyh b = a.b();
            if (a2 != null) {
                a2.t((float)a.h, a.k);
                if (b != null) {
                    final float n = (float)a.h;
                    if (a.n) {
                        u = adds.U((View)a.a, 2130969109);
                    }
                    else {
                        u = 0;
                    }
                    b.s(n, u);
                }
            }
        }
        this.a(materialButton.getId(), materialButton.b);
        final adym c = materialButton.c();
        this.b.add(new adty(c.b, c.e, c.c, c.d));
        materialButton.setEnabled(this.isEnabled());
        anb.N((View)materialButton, (akw)new adtx(this));
    }
    
    final void b() {
        final int childCount = this.getChildCount();
        final int d = this.d();
        int childCount2 = this.getChildCount();
        final int n = -1;
        --childCount2;
        int n2;
        while (true) {
            n2 = n;
            if (childCount2 < 0) {
                break;
            }
            if (this.c(childCount2)) {
                n2 = childCount2;
                break;
            }
            --childCount2;
        }
        for (int i = 0; i < childCount; ++i) {
            final MaterialButton e = this.e(i);
            if (e.getVisibility() != 8) {
                final adyl e2 = e.c().e();
                adty adty2;
                final adty adty = adty2 = this.b.get(i);
                if (d != n2) {
                    final int orientation = this.getOrientation();
                    if (i == d) {
                        if (orientation == 0) {
                            if (adds.L((View)this)) {
                                adty2 = adty.b(adty);
                            }
                            else {
                                adty2 = adty.a(adty);
                            }
                        }
                        else {
                            final adyd b = adty.b;
                            final adyd a = adty.a;
                            adty2 = new adty(b, a, adty.c, a);
                        }
                    }
                    else if (i == n2) {
                        if (orientation == 0) {
                            if (adds.L((View)this)) {
                                adty2 = adty.a(adty);
                            }
                            else {
                                adty2 = adty.b(adty);
                            }
                        }
                        else {
                            final adyd a2 = adty.a;
                            adty2 = new adty(a2, adty.e, a2, adty.d);
                        }
                    }
                    else {
                        adty2 = null;
                    }
                }
                if (adty2 == null) {
                    e2.f(0.0f);
                }
                else {
                    e2.a = adty2.b;
                    e2.d = adty2.e;
                    e2.b = adty2.c;
                    e2.c = adty2.d;
                }
                e.tn(e2.a());
            }
        }
    }
    
    public final boolean c(final int n) {
        return this.getChildAt(n).getVisibility() != 8;
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        final TreeMap treeMap = new TreeMap(this.d);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            treeMap.put(this.e(i), i);
        }
        this.e = (Integer[])treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }
    
    protected final int getChildDrawingOrder(final int n, final int n2) {
        final Integer[] e = this.e;
        if (e != null && n2 < e.length) {
            return e[n2];
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return n2;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        final int h = this.h;
        if (h != -1) {
            this.g(Collections.singleton(h));
        }
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final aom c = aom.c(accessibilityNodeInfo);
        int i = 0;
        int n = 0;
        while (i < this.getChildCount()) {
            int n2 = n;
            if (this.getChildAt(i) instanceof MaterialButton) {
                n2 = n;
                if (this.c(i)) {
                    n2 = n + 1;
                }
            }
            ++i;
            n = n2;
        }
        int n3;
        if (!this.f) {
            n3 = 2;
        }
        else {
            n3 = 1;
        }
        c.s((Object)bx.K(1, n, n3));
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.b();
        this.f();
        super.onMeasure(n, n2);
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton)view).c = null;
        }
        final int indexOfChild = this.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.b.remove(indexOfChild);
        }
        this.b();
        this.f();
    }
    
    public final void setEnabled(final boolean b) {
        super.setEnabled(b);
        for (int i = 0; i < this.getChildCount(); ++i) {
            this.e(i).setEnabled(b);
        }
    }
}
