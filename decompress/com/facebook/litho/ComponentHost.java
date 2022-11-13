// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.litho;

import android.view.ViewParent;
import android.view.View$AccessibilityDelegate;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.TouchDelegate;
import java.util.Collections;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.util.SparseArray;

public class ComponentHost extends efx implements egn, duu
{
    private static boolean j;
    public abp a;
    public SparseArray b;
    public dsw c;
    public dte d;
    public dsy e;
    public dtf f;
    public dwy g;
    public int h;
    public boolean i;
    private abp k;
    private abp l;
    private abp m;
    private abp n;
    private abp o;
    private ArrayList p;
    private CharSequence q;
    private final dsz r;
    private int[] s;
    private boolean t;
    private boolean u;
    private dsv v;
    private boolean w;
    private elx x;
    
    public ComponentHost(final dsx dsx) {
        super(dsx.b);
        this.r = new dsz(this);
        this.s = new int[0];
        this.w = false;
        this.h = 0;
        this.setWillNotDraw(this.i = false);
        this.setChildrenDrawingOrderEnabled(true);
        this.j(dsi.b(dsx.b));
        this.a = new abp();
        this.l = new abp();
        this.n = new abp();
        this.p = new ArrayList();
    }
    
    private final void A(final dvd dvd) {
        if (dvd.d() && ((dtd)dvd.c).ak()) {
            this.i = true;
        }
        this.f();
        if (this.a() == 0) {
            this.i = false;
        }
    }
    
    private static String r(final int n) {
        if (n == 0) {
            return "none";
        }
        if (n == 1) {
            return "sw";
        }
        if (n != 2) {
            return "unknown";
        }
        return "hw";
    }
    
    private final void s() {
        if (this.p == null) {
            this.p = new ArrayList();
        }
    }
    
    private final void t() {
        if (this.n == null) {
            this.n = new abp();
        }
    }
    
    private final void u() {
        if (this.a == null) {
            this.a = new abp();
        }
    }
    
    private final void v() {
        if (this.l == null) {
            this.l = new abp();
        }
    }
    
    private final void w(final int n, final ega ega) {
        if (this.g != null) {
            if (this.equals(ega.a)) {
                return;
            }
            final dwy g = this.g;
            final abp b = g.b;
            if (b != null && b.d(n) != null) {
                g.b.i(n);
                return;
            }
            g.a.i(n);
        }
    }
    
    private final void x() {
        final abp k = this.k;
        if (k != null && k.c() == 0) {
            this.k = null;
        }
        final abp m = this.m;
        if (m != null && m.c() == 0) {
            this.m = null;
        }
    }
    
    private final void y(final Drawable drawable) {
        bkw.e();
        drawable.setCallback((Drawable$Callback)null);
        this.invalidate(drawable.getBounds());
        this.x();
    }
    
    private final void z(final View view) {
        this.t = true;
        if (this.u) {
            super.removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }
    
    public final int a() {
        final abp a = this.a;
        if (a == null) {
            return 0;
        }
        return a.c();
    }
    
    @Deprecated
    public final void addView(final View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    public final void addView(final View view, final int n) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    protected final boolean addViewInLayout(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    protected final void attachViewToParent(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }
    
    public final ega b(final int n) {
        return (ega)this.a.e(n);
    }
    
    public final List c() {
        final ArrayList list = new ArrayList();
        final abp n = this.n;
        int i = 0;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        while (i < c) {
            final dtz m = dvd.b((ega)this.n.e(i)).m;
            if (m != null) {
                final CharSequence a = m.a;
                if (a != null) {
                    list.add(a);
                }
            }
            ++i;
        }
        final CharSequence q = this.q;
        if (q != null) {
            list.add(q);
        }
        return list;
    }
    
    protected Map d(int i, int width) {
        final HashMap hashMap = new HashMap();
        hashMap.put("uptimeMs", SystemClock.uptimeMillis());
        hashMap.put("identity", Integer.toHexString(System.identityHashCode(this)));
        hashMap.put("width", i);
        hashMap.put("height", width);
        hashMap.put("layerType", r(this.getLayerType()));
        final Map[] array = new Map[this.a()];
        ega b;
        Object a;
        dvd b2;
        Rect rect;
        HashMap hashMap2;
        for (i = 0; i < this.a(); ++i) {
            b = this.b(i);
            a = b.a;
            b2 = dvd.b(b);
            rect = new Rect();
            b2.f(rect);
            hashMap2 = new HashMap();
            hashMap2.put("class", ((View)a).getClass().getName());
            hashMap2.put("identity", Integer.toHexString(System.identityHashCode(a)));
            if (a instanceof View) {
                hashMap2.put("layerType", r(((View)a).getLayerType()));
            }
            hashMap2.put("left", rect.left);
            hashMap2.put("right", rect.right);
            hashMap2.put("top", rect.top);
            hashMap2.put("bottom", rect.bottom);
            array[i] = hashMap2;
        }
        hashMap.put("mountItems", array);
        final StringBuilder sb = new StringBuilder();
        for (Object parent = this; parent != null; parent = ((ViewParent)parent).getParent()) {
            sb.append(((dvu)parent).getClass().getName());
            sb.append(',');
            if (parent instanceof dvu && !hashMap.containsKey("lithoViewDimens")) {
                final dvu dvu = (dvu)parent;
                width = dvu.getWidth();
                i = dvu.getHeight();
                final StringBuilder sb2 = new StringBuilder("(");
                sb2.append(width);
                sb2.append(", ");
                sb2.append(i);
                sb2.append(")");
                hashMap.put("lithoViewDimens", sb2.toString());
            }
        }
        hashMap.put("ancestors", sb.toString());
        return hashMap;
    }
    
    public final void dispatchDraw(final Canvas a) {
        final dsz r = this.r;
        r.a = a;
        int n = 0;
        int i = 0;
        r.b = 0;
        final abp a2 = r.d.a;
        int c;
        if (a2 == null) {
            c = 0;
        }
        else {
            c = a2.c();
        }
        r.c = c;
        try {
            super.dispatchDraw(a);
            if (this.r.b()) {
                this.r.a();
            }
            this.r.a = null;
            final ArrayList p = this.p;
            int size;
            if (p == null) {
                size = 0;
            }
            else {
                size = p.size();
            }
            while (i < size) {
                final Object a3 = this.p.get(i).a;
                if (a3 instanceof Drawable) {
                    ((Drawable)a3).draw(a);
                }
                ++i;
            }
            if (dyp.b) {
                if (dtu.a == null) {
                    (dtu.a = new Paint()).setColor(1724029951);
                }
                if (dtu.b == null) {
                    (dtu.b = new Paint()).setColor(1154744270);
                }
                if (dtu.c((View)this)) {
                    a.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), dtu.a);
                }
                for (int j = this.a() - 1; j >= 0; --j) {
                    final ega b = this.b(j);
                    final dst c2 = dvd.b(b).c;
                    if (dst.z(c2)) {
                        if (!dst.v(c2)) {
                            final View view = (View)b.a;
                            if (dtu.c(view)) {
                                a.drawRect((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom(), dtu.b);
                            }
                        }
                    }
                }
                final dwy g = this.g;
                if (g != null) {
                    final Paint b2 = dtu.b;
                    int c3 = g.a.c();
                    while (--c3 >= 0) {
                        final cgj cgj = (cgj)g.a.e(c3);
                        if (cgj != null) {
                            final Rect e = cgj.e();
                            if (e == null) {
                                continue;
                            }
                            a.drawRect(e, b2);
                        }
                    }
                }
            }
            if (dyp.d) {
                final Resources resources = this.getResources();
                if (dtu.c == null) {
                    dtu.c = new Rect();
                }
                if (dtu.d == null) {
                    (dtu.d = new Paint()).setStyle(Paint$Style.STROKE);
                    dtu.d.setStrokeWidth((float)dtu.a(resources, 1));
                }
                if (dtu.e == null) {
                    (dtu.e = new Paint()).setStyle(Paint$Style.FILL);
                    dtu.e.setStrokeWidth((float)dtu.a(resources, 2));
                }
                for (int k = this.a() - 1; k >= 0; --k) {
                    final ega b3 = this.b(k);
                    final dst c4 = dvd.b(b3).c;
                    final Object a4 = b3.a;
                    if (!(c4 instanceof duf)) {
                        if (a4 instanceof View) {
                            final View view2 = (View)a4;
                            dtu.c.left = view2.getLeft();
                            dtu.c.top = view2.getTop();
                            dtu.c.right = view2.getRight();
                            dtu.c.bottom = view2.getBottom();
                        }
                        else if (a4 instanceof Drawable) {
                            dtu.c.set(((Drawable)a4).getBounds());
                        }
                        final Paint d = dtu.d;
                        int color;
                        if (!dst.v(c4)) {
                            color = -1711341568;
                        }
                        else {
                            color = -1711341313;
                        }
                        d.setColor(color);
                        final Paint d2 = dtu.d;
                        final Rect c5 = dtu.c;
                        n = (int)d2.getStrokeWidth();
                        final int left = c5.left;
                        final int n2 = n / 2;
                        final int top = c5.top;
                        final int right = c5.right;
                        n = c5.bottom;
                        a.drawRect((float)(left + n2), (float)(top + n2), (float)(right - n2), (float)(n - n2), d2);
                        final Paint e2 = dtu.e;
                        int color2;
                        if (!dst.v(c4)) {
                            color2 = -16776961;
                        }
                        else {
                            color2 = -16711681;
                        }
                        e2.setColor(color2);
                        final Paint e3 = dtu.e;
                        final Rect c6 = dtu.c;
                        final int n3 = (int)e3.getStrokeWidth();
                        n = Math.min(Math.min(dtu.c.width(), dtu.c.height()) / 3, dtu.a(resources, 12));
                        dtu.b(a, e3, c6.left, c6.top, n3, n3, n);
                        final int left2 = c6.left;
                        final int bottom = c6.bottom;
                        final int n4 = -n3;
                        dtu.b(a, e3, left2, bottom, n3, n4, n);
                        dtu.b(a, e3, c6.right, c6.top, n4, n3, n);
                        dtu.b(a, e3, c6.right, c6.bottom, n4, n4, n);
                    }
                }
            }
        }
        catch (final dvm dvm) {
            final int a5 = this.a();
            final StringBuilder sb = new StringBuilder("[");
            for (int l = n; l < a5; ++l) {
                final ega ega = (ega)this.a.d(l);
                String q;
                if (ega != null) {
                    q = dvd.b(ega).c.q();
                }
                else {
                    q = "null";
                }
                sb.append(q);
                if (l < a5 - 1) {
                    sb.append(", ");
                }
                else {
                    sb.append("]");
                }
            }
            dvm.b.put("component_names_from_mount_items", sb.toString());
            throw dvm;
        }
    }
    
    public final boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        final dsv v = this.v;
        return (v != null && this.i && ((aqg)v).s(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final elx x = this.x;
        if (x != null) {
            x.k((View)this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final abp n = this.n;
        int i = 0;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        while (i < c) {
            final ega ega = (ega)this.n.e(i);
            final dvd b = dvd.b(ega);
            com.h((View)this, (Drawable)ega.a, b.e, b.m);
            ++i;
        }
    }
    
    public final void e(final ega ega) {
        this.s();
        if (this.p.remove(ega)) {
            final Object a = ega.a;
            if (a instanceof Drawable) {
                this.y((Drawable)a);
            }
            else if (a instanceof View) {
                this.z((View)a);
                this.t = true;
            }
            this.A(dvd.b(ega));
            return;
        }
        throw new RuntimeException("Tried to remove non-existent disappearing item, transitionId: ".concat(String.valueOf(String.valueOf(dvd.b(ega).h))));
    }
    
    public final void f() {
        if (this.w && this.i) {
            final dsv v = this.v;
            if (v != null) {
                ((aqg)v).n();
            }
        }
    }
    
    public final void g(final int n, final ega ega) {
        this.h(n, ega, ega.d.d);
    }
    
    protected final int getChildDrawingOrder(int childCount, final int n) {
        if (this.t) {
            childCount = this.getChildCount();
            if (this.s.length < childCount) {
                this.s = new int[childCount + 5];
            }
            final abp l = this.l;
            int c;
            if (l == null) {
                c = 0;
            }
            else {
                c = l.c();
            }
            int i;
            for (i = 0, childCount = 0; i < c; ++i, ++childCount) {
                this.s[childCount] = this.indexOfChild((View)((ega)this.l.e(i)).a);
            }
            final ArrayList p2 = this.p;
            int size;
            if (p2 == null) {
                size = 0;
            }
            else {
                size = p2.size();
            }
            int j = 0;
            int n2 = childCount;
            while (j < size) {
                final Object a = this.p.get(j).a;
                childCount = n2;
                if (a instanceof View) {
                    this.s[n2] = this.indexOfChild((View)a);
                    childCount = n2 + 1;
                }
                ++j;
                n2 = childCount;
            }
            this.t = false;
        }
        if (this.r.b()) {
            this.r.a();
        }
        return this.s[n];
    }
    
    public final CharSequence getContentDescription() {
        return this.q;
    }
    
    public final Object getTag(final int n) {
        final SparseArray b = this.b;
        if (b != null) {
            final Object value = b.get(n);
            if (value != null) {
                return value;
            }
        }
        return super.getTag(n);
    }
    
    public TextContent getTextContent() {
        this.u();
        final abp a = this.a;
        final int c = a.c();
        int i = 0;
        List<Object> singletonList;
        if (c == 1) {
            singletonList = Collections.singletonList(((ega)a.e(0)).a);
        }
        else {
            singletonList = new ArrayList<Object>(c);
            while (i < c) {
                singletonList.add(((ega)a.e(i)).a);
                ++i;
            }
        }
        return com.c((List)singletonList);
    }
    
    public final void h(final int n, final ega ega, final Rect rect) {
        final Object a = ega.a;
        final dvd b = dvd.b(ega);
        final boolean b2 = a instanceof Drawable;
        boolean b3 = true;
        if (b2) {
            bkw.e();
            this.t();
            this.n.h(n, (Object)ega);
            final Drawable drawable = (Drawable)ega.a;
            final dvd b4 = dvd.b(ega);
            if (this.getVisibility() != 0) {
                b3 = false;
            }
            drawable.setVisible(b3, false);
            drawable.setCallback((Drawable$Callback)this);
            if (ega.e instanceof dvo) {
                com.h((View)this, drawable, b4.e, b4.m);
            }
            this.invalidate(rect);
        }
        else if (a instanceof View) {
            this.v();
            this.l.h(n, (Object)ega);
            final View view = (View)a;
            view.setDuplicateParentStateEnabled(dvd.e(b.e));
            if (view instanceof ComponentHost) {
                ((ComponentHost)view).setAddStatesFromChildren(false);
            }
            this.t = true;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(this.generateDefaultLayoutParams());
            }
            if (this.u) {
                super.addViewInLayout(view, -1, view.getLayoutParams(), true);
            }
            else {
                super.addView(view, -1, view.getLayoutParams());
            }
            final glo n2 = dvd.b(ega).n;
            if (n2 != null && n2.f() != null) {
                final Object a2 = ega.a;
                if (!this.equals(a2)) {
                    if (this.g == null) {
                        this.setTouchDelegate((TouchDelegate)(this.g = new dwy(this)));
                    }
                    this.g.a.h(n, (Object)new cgj((View)a2, ega));
                }
            }
        }
        this.u();
        this.a.h(n, (Object)ega);
        this.A(b);
    }
    
    public final boolean hasOverlappingRendering() {
        if (!dyp.p) {
            return false;
        }
        if (this.getWidth() > 0) {
            if (this.getHeight() > 0) {
                if (this.getWidth() <= dyp.r) {
                    if (this.getHeight() <= dyp.r) {
                        return super.hasOverlappingRendering();
                    }
                }
            }
        }
        return false;
    }
    
    public final void i(final ega ega, final int n, final int n2) {
        final glo n3 = dvd.b(ega).n;
        if (n3 != null) {
            if (n3.f() != null) {
                final dwy g = this.g;
                if (g != null) {
                    if (g.a.d(n2) != null) {
                        if (g.b == null) {
                            g.b = new abp(4);
                        }
                        com.f(n2, g.a, g.b);
                    }
                    com.d(n, n2, g.a, g.b);
                    final abp b = g.b;
                    if (b != null && b.c() == 0) {
                        g.b = null;
                    }
                }
            }
        }
        final Object a = ega.a;
        this.v();
        if (a instanceof Drawable) {
            bkw.e();
            this.t();
            if (this.n.d(n2) != null) {
                if (this.o == null) {
                    this.o = new abp(4);
                }
                com.f(n2, this.n, this.o);
            }
            com.d(n, n2, this.n, this.o);
            this.invalidate();
            this.x();
        }
        else if (a instanceof View) {
            this.t = true;
            if (this.l.d(n2) != null) {
                if (this.m == null) {
                    this.m = new abp(4);
                }
                com.f(n2, this.l, this.m);
            }
            com.d(n, n2, this.l, this.m);
        }
        this.u();
        if (this.a.d(n2) != null) {
            if (this.k == null) {
                this.k = new abp(4);
            }
            com.f(n2, this.a, this.k);
        }
        com.d(n, n2, this.a, this.k);
        this.x();
    }
    
    public final void j(final boolean w) {
        if (w == this.w) {
            return;
        }
        Object v = null;
        if (w && this.v == null) {
            this.v = new dsv((View)this, (dtz)null, this.isFocusable(), anb.d((View)this));
        }
        if (w) {
            v = this.v;
        }
        anb.N((View)this, (akw)v);
        if (!(this.w = w)) {
            return;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof ComponentHost) {
                ((ComponentHost)child).j(true);
            }
            else {
                final dtz dtz = (dtz)child.getTag(2131428379);
                if (dtz != null) {
                    anb.N(child, (akw)new dsv(child, dtz, child.isFocusable(), anb.d(child)));
                }
            }
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final abp n = this.n;
        int i = 0;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        while (i < c) {
            ((Drawable)((ega)this.n.e(i)).a).jumpToCurrentState();
            ++i;
        }
    }
    
    public final void k(final ega ega) {
        final abp a = this.a;
        final int b = a.b(a.a((Object)ega));
        final Object a2 = ega.a;
        if (a2 instanceof Drawable) {
            this.t();
            com.e(b, this.n, this.o);
        }
        else if (a2 instanceof View) {
            this.v();
            com.e(b, this.l, this.m);
            this.t = true;
            this.w(b, ega);
        }
        this.u();
        com.e(b, this.a, this.k);
        this.x();
        this.s();
        this.p.add(ega);
    }
    
    public final void l(final ega ega) {
        this.u();
        final abp a = this.a;
        this.m(a.b(a.a((Object)ega)), ega);
    }
    
    public final void m(final int n, final ega ega) {
        final Object a = ega.a;
        if (a instanceof Drawable) {
            this.t();
            this.y((Drawable)a);
            com.e(n, this.n, this.o);
        }
        else if (a instanceof View) {
            this.z((View)a);
            this.v();
            com.e(n, this.l, this.m);
            this.t = true;
            this.w(n, ega);
        }
        this.u();
        com.e(n, this.a, this.k);
        this.x();
        this.A(dvd.b(ega));
    }
    
    protected boolean n() {
        return !this.u;
    }
    
    public void o(final int n, final int n2, final int n3, final int n4) {
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.u = true;
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        String s = null;
        if (n6 > 0 && n5 > 0) {
            if (n6 >= dyp.q || n5 >= dyp.q) {
                s = "TextureTooBig";
            }
        }
        else {
            final boolean a = dyp.a;
        }
        if (s != null) {
            final StringBuilder sb = new StringBuilder("abnormally sized litho layout (");
            sb.append(n5);
            sb.append(", ");
            sb.append(n6);
            sb.append(")");
            final String string = sb.toString();
            this.d(n5, n6);
            efv.a().e(coz.c(2), string);
        }
        this.o(n, n2, n3, n4);
        this.u = false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        bkw.e();
        if (this.isEnabled()) {
            final abp n = this.n;
            int c;
            if (n == null) {
                c = 0;
            }
            else {
                c = n.c();
            }
            while (true) {
                final int n2 = c - 1;
                if (n2 < 0) {
                    break;
                }
                final ega ega = (ega)this.n.e(n2);
                c = n2;
                if (!(ega.a instanceof dwz)) {
                    continue;
                }
                if ((dvd.b(ega).e & 0x2) == 0x2) {
                    c = n2;
                }
                else {
                    final dwz dwz = (dwz)ega.a;
                    c = n2;
                    if (!dwz.e(motionEvent)) {
                        continue;
                    }
                    c = n2;
                    if (dwz.d(motionEvent, (View)this)) {
                        return true;
                    }
                    continue;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final elx p() {
        return this.x;
    }
    
    public final boolean performAccessibilityAction(final int n, final Bundle bundle) {
        int n2 = n;
        if (n != 512) {
            if ((n2 = n) != 256) {
                return super.performAccessibilityAction(n2, bundle);
            }
            n2 = 256;
        }
        CharSequence q;
        if (!TextUtils.isEmpty(this.q)) {
            q = this.q;
        }
        else if (!this.c().isEmpty()) {
            q = TextUtils.join((CharSequence)", ", (Iterable)this.c());
        }
        else if (!this.getTextContent().getTextItems().isEmpty()) {
            q = TextUtils.join((CharSequence)", ", (Iterable)this.getTextContent().getTextItems());
        }
        else {
            q = null;
        }
        if (q == null) {
            return false;
        }
        super.setContentDescription(this.q = q);
        return super.performAccessibilityAction(n2, bundle);
    }
    
    public final void q(final elx x) {
        this.x = x;
    }
    
    @Deprecated
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    protected final void removeDetachedView(final View view, final boolean b) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    public final void removeView(final View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    public final void removeViewAt(final int n) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    public final void removeViewInLayout(final View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    public final void removeViews(final int n, final int n2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }
    
    @Deprecated
    public final void removeViewsInLayout(final int n, final int n2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }
    
    public final void requestLayout() {
        for (Object parent = this; parent instanceof ComponentHost; parent = ((ViewParent)parent).getParent()) {
            if (!((ComponentHost)parent).n()) {
                return;
            }
        }
        super.requestLayout();
    }
    
    public final void setAccessibilityDelegate(final View$AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.w = false;
    }
    
    public final void setAlpha(final float alpha) {
        if (alpha != 0.0f && alpha != 1.0f && (this.getWidth() >= dyp.s || this.getHeight() >= dyp.s)) {
            if (ComponentHost.j) {
                return;
            }
            ComponentHost.j = true;
            final int width = this.getWidth();
            final int height = this.getHeight();
            final StringBuilder sb = new StringBuilder("Partial alpha (");
            sb.append(alpha);
            sb.append(") with large view (");
            sb.append(width);
            sb.append(", ");
            sb.append(height);
            sb.append(")");
            coz.d(2, "PartialAlphaTextureTooBig", sb.toString());
        }
        super.setAlpha(alpha);
    }
    
    public final void setContentDescription(final CharSequence q) {
        this.q = q;
        if (!TextUtils.isEmpty(q) && anb.d((View)this) == 0) {
            anb.X((View)this, 1);
        }
        this.f();
    }
    
    public final void setTag(final int n, final Object o) {
        super.setTag(n, o);
        if (n == 2131428379 && o != null) {
            this.j(dsi.b(this.getContext()));
            final dsv v = this.v;
            if (v != null) {
                v.f = (dtz)o;
            }
        }
    }
    
    public final void setVisibility(final int visibility) {
        bkw.e();
        super.setVisibility(visibility);
        final abp n = this.n;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        for (int i = 0; i < c; ++i) {
            ((Drawable)((ega)this.n.e(i)).a).setVisible(visibility == 0, false);
        }
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return true;
    }
}
