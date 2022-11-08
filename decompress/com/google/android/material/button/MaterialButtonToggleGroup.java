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
    private final aepj j;
    
    public MaterialButtonToggleGroup(final Context context) {
        this(context, null);
    }
    
    public MaterialButtonToggleGroup(final Context context, final AttributeSet set) {
        this(context, set, 2130969836);
    }
    
    public MaterialButtonToggleGroup(final Context context, final AttributeSet set, final int n) {
        super(adyy.a(context, set, n, 2132085199), set, n);
        this.b = new ArrayList();
        this.j = new aepj(this);
        this.c = new LinkedHashSet();
        this.d = (Comparator)new xjv(this, 2);
        this.a = false;
        this.i = new HashSet();
        final TypedArray a = aduf.a(this.getContext(), set, adry.b, n, 2132085199, new int[0]);
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
        ana.X((View)this, 1);
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
                alk.f((ViewGroup$MarginLayoutParams)layoutParams2, 0);
                alk.g((ViewGroup$MarginLayoutParams)layoutParams2, -min);
                layoutParams2.topMargin = 0;
            }
            else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                alk.g((ViewGroup$MarginLayoutParams)layoutParams2, 0);
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
                alk.f((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
                alk.g((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
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
                    ((adrx)iterator.next()).a();
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
    
    public final void addView(final View view, int a, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, a, viewGroup$LayoutParams);
        final MaterialButton materialButton = (MaterialButton)view;
        if (materialButton.getId() == -1) {
            materialButton.setId(ana.c());
        }
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils$TruncateAt.END);
        if (materialButton.f()) {
            materialButton.a.p = true;
        }
        materialButton.c = this.j;
        if (materialButton.f()) {
            final adru a2 = materialButton.a;
            a2.n = true;
            final adwf a3 = a2.a();
            final adwf b = a2.b();
            if (a3 != null) {
                a3.t((float)a2.h, a2.k);
                if (b != null) {
                    final float n = (float)a2.h;
                    if (a2.n) {
                        a = adwd.A((View)a2.a, 2130969109);
                    }
                    else {
                        a = 0;
                    }
                    b.s(n, a);
                }
            }
        }
        this.a(materialButton.getId(), materialButton.b);
        final adwk c = materialButton.c();
        this.b.add(new adrw(c.b, c.e, c.c, c.d));
        materialButton.setEnabled(this.isEnabled());
        ana.N((View)materialButton, (akv)new adrv(this));
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
                final adwj e2 = e.c().e();
                adrw adrw2;
                final adrw adrw = adrw2 = this.b.get(i);
                if (d != n2) {
                    final int orientation = this.getOrientation();
                    if (i == d) {
                        if (orientation == 0) {
                            if (adwd.r((View)this)) {
                                adrw2 = adrw.b(adrw);
                            }
                            else {
                                adrw2 = adrw.a(adrw);
                            }
                        }
                        else {
                            final adwb b = adrw.b;
                            final adwb a = adrw.a;
                            adrw2 = new adrw(b, a, adrw.c, a);
                        }
                    }
                    else if (i == n2) {
                        if (orientation == 0) {
                            if (adwd.r((View)this)) {
                                adrw2 = adrw.a(adrw);
                            }
                            else {
                                adrw2 = adrw.b(adrw);
                            }
                        }
                        else {
                            final adwb a2 = adrw.a;
                            adrw2 = new adrw(a2, adrw.e, a2, adrw.d);
                        }
                    }
                    else {
                        adrw2 = null;
                    }
                }
                if (adrw2 == null) {
                    e2.f(0.0f);
                }
                else {
                    e2.a = adrw2.b;
                    e2.d = adrw2.e;
                    e2.b = adrw2.c;
                    e2.c = adrw2.d;
                }
                e.ti(e2.a());
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
        final aol c = aol.c(accessibilityNodeInfo);
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
