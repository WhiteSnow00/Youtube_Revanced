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

public class ComponentHost extends ega implements egq, dux
{
    private static boolean j;
    public abq a;
    public SparseArray b;
    public dsz c;
    public dth d;
    public dtb e;
    public dti f;
    public dxb g;
    public int h;
    public boolean i;
    private abq k;
    private abq l;
    private abq m;
    private abq n;
    private abq o;
    private ArrayList p;
    private CharSequence q;
    private final dtc r;
    private int[] s;
    private boolean t;
    private boolean u;
    private dsy v;
    private boolean w;
    private ema x;
    
    public ComponentHost(final dta dta) {
        super(dta.b);
        this.r = new dtc(this);
        this.s = new int[0];
        this.w = false;
        this.h = 0;
        this.setWillNotDraw(this.i = false);
        this.setChildrenDrawingOrderEnabled(true);
        this.j(dsl.b(dta.b));
        this.a = new abq();
        this.l = new abq();
        this.n = new abq();
        this.p = new ArrayList();
    }
    
    private final void A(final dvg dvg) {
        if (dvg.d() && ((dtg)dvg.c).ak()) {
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
            this.n = new abq();
        }
    }
    
    private final void u() {
        if (this.a == null) {
            this.a = new abq();
        }
    }
    
    private final void v() {
        if (this.l == null) {
            this.l = new abq();
        }
    }
    
    private final void w(final int n, final egd egd) {
        if (this.g != null) {
            if (this.equals(egd.a)) {
                return;
            }
            final dxb g = this.g;
            final abq b = g.b;
            if (b != null && b.d(n) != null) {
                g.b.i(n);
                return;
            }
            g.a.i(n);
        }
    }
    
    private final void x() {
        final abq k = this.k;
        if (k != null && k.c() == 0) {
            this.k = null;
        }
        final abq m = this.m;
        if (m != null && m.c() == 0) {
            this.m = null;
        }
    }
    
    private final void y(final Drawable drawable) {
        bkx.q();
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
        final abq a = this.a;
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
    
    public final egd b(final int n) {
        return (egd)this.a.e(n);
    }
    
    public final List c() {
        final ArrayList list = new ArrayList();
        final abq n = this.n;
        int i = 0;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        while (i < c) {
            final duc m = dvg.b((egd)this.n.e(i)).m;
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
    
    protected Map d(int i, int height) {
        final HashMap hashMap = new HashMap();
        hashMap.put("uptimeMs", SystemClock.uptimeMillis());
        hashMap.put("identity", Integer.toHexString(System.identityHashCode(this)));
        hashMap.put("width", i);
        hashMap.put("height", height);
        hashMap.put("layerType", r(this.getLayerType()));
        final Map[] array = new Map[this.a()];
        egd b;
        Object a;
        dvg b2;
        Rect rect;
        HashMap hashMap2;
        for (i = 0; i < this.a(); ++i) {
            b = this.b(i);
            a = b.a;
            b2 = dvg.b(b);
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
            sb.append(((dvx)parent).getClass().getName());
            sb.append(',');
            if (parent instanceof dvx && !hashMap.containsKey("lithoViewDimens")) {
                final dvx dvx = (dvx)parent;
                i = dvx.getWidth();
                height = dvx.getHeight();
                final StringBuilder sb2 = new StringBuilder("(");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(height);
                sb2.append(")");
                hashMap.put("lithoViewDimens", sb2.toString());
            }
        }
        hashMap.put("ancestors", sb.toString());
        return hashMap;
    }
    
    public final void dispatchDraw(final Canvas a) {
        final dtc r = this.r;
        r.a = a;
        int right = 0;
        int i = 0;
        r.b = 0;
        final abq a2 = r.d.a;
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
            if (dys.b) {
                if (cqk.a == null) {
                    (cqk.a = new Paint()).setColor(1724029951);
                }
                if (cqk.b == null) {
                    (cqk.b = new Paint()).setColor(1154744270);
                }
                if (cqk.d((View)this)) {
                    a.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), cqk.a);
                }
                for (int j = this.a() - 1; j >= 0; --j) {
                    final egd b = this.b(j);
                    final dsw c2 = dvg.b(b).c;
                    if (dsw.z(c2)) {
                        if (!dsw.v(c2)) {
                            final View view = (View)b.a;
                            if (cqk.d(view)) {
                                a.drawRect((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom(), cqk.b);
                            }
                        }
                    }
                }
                final dxb g = this.g;
                if (g != null) {
                    final Paint b2 = cqk.b;
                    int c3 = g.a.c();
                    while (--c3 >= 0) {
                        final cgm cgm = (cgm)g.a.e(c3);
                        if (cgm != null) {
                            final Rect e = cgm.e();
                            if (e == null) {
                                continue;
                            }
                            a.drawRect(e, b2);
                        }
                    }
                }
            }
            if (dys.d) {
                final Resources resources = this.getResources();
                if (cqk.c == null) {
                    cqk.c = new Rect();
                }
                if (cqk.d == null) {
                    (cqk.d = new Paint()).setStyle(Paint$Style.STROKE);
                    cqk.d.setStrokeWidth((float)cqk.b(resources, 1));
                }
                if (cqk.e == null) {
                    (cqk.e = new Paint()).setStyle(Paint$Style.FILL);
                    cqk.e.setStrokeWidth((float)cqk.b(resources, 2));
                }
                for (int k = this.a() - 1; k >= 0; --k) {
                    final egd b3 = this.b(k);
                    final dsw c4 = dvg.b(b3).c;
                    final Object a4 = b3.a;
                    if (!(c4 instanceof dui)) {
                        if (a4 instanceof View) {
                            final View view2 = (View)a4;
                            cqk.c.left = view2.getLeft();
                            cqk.c.top = view2.getTop();
                            cqk.c.right = view2.getRight();
                            cqk.c.bottom = view2.getBottom();
                        }
                        else if (a4 instanceof Drawable) {
                            cqk.c.set(((Drawable)a4).getBounds());
                        }
                        final Paint d = cqk.d;
                        int color;
                        if (!dsw.v(c4)) {
                            color = -1711341568;
                        }
                        else {
                            color = -1711341313;
                        }
                        d.setColor(color);
                        final Paint d2 = cqk.d;
                        final Rect c5 = cqk.c;
                        right = (int)d2.getStrokeWidth();
                        final int left = c5.left;
                        final int n = right / 2;
                        final int top = c5.top;
                        right = c5.right;
                        a.drawRect((float)(left + n), (float)(top + n), (float)(right - n), (float)(c5.bottom - n), d2);
                        final Paint e2 = cqk.e;
                        int color2;
                        if (!dsw.v(c4)) {
                            color2 = -16776961;
                        }
                        else {
                            color2 = -16711681;
                        }
                        e2.setColor(color2);
                        final Paint e3 = cqk.e;
                        final Rect c6 = cqk.c;
                        final int n2 = (int)e3.getStrokeWidth();
                        final int min = Math.min(Math.min(cqk.c.width(), cqk.c.height()) / 3, cqk.b(resources, 12));
                        cqk.c(a, e3, c6.left, c6.top, n2, n2, min);
                        final int left2 = c6.left;
                        final int bottom = c6.bottom;
                        right = -n2;
                        cqk.c(a, e3, left2, bottom, n2, right, min);
                        cqk.c(a, e3, c6.right, c6.top, right, n2, min);
                        cqk.c(a, e3, c6.right, c6.bottom, right, right, min);
                    }
                }
            }
        }
        catch (final dvp dvp) {
            final int a5 = this.a();
            final StringBuilder sb = new StringBuilder("[");
            for (int l = right; l < a5; ++l) {
                final egd egd = (egd)this.a.d(l);
                String q;
                if (egd != null) {
                    q = dvg.b(egd).c.q();
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
            dvp.b.put("component_names_from_mount_items", sb.toString());
            throw dvp;
        }
    }
    
    public final boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        final dsy v = this.v;
        return (v != null && this.i && ((aqh)v).s(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final ema x = this.x;
        if (x != null) {
            x.k((View)this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final abq n = this.n;
        int i = 0;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        while (i < c) {
            final egd egd = (egd)this.n.e(i);
            final dvg b = dvg.b(egd);
            cpc.h((View)this, (Drawable)egd.a, b.e, b.m);
            ++i;
        }
    }
    
    public final void e(final egd egd) {
        this.s();
        if (this.p.remove(egd)) {
            final Object a = egd.a;
            if (a instanceof Drawable) {
                this.y((Drawable)a);
            }
            else if (a instanceof View) {
                this.z((View)a);
                this.t = true;
            }
            this.A(dvg.b(egd));
            return;
        }
        throw new RuntimeException("Tried to remove non-existent disappearing item, transitionId: ".concat(String.valueOf(String.valueOf(dvg.b(egd).h))));
    }
    
    public final void f() {
        if (this.w && this.i) {
            final dsy v = this.v;
            if (v != null) {
                ((aqh)v).n();
            }
        }
    }
    
    public final void g(final int n, final egd egd) {
        this.h(n, egd, egd.d.d);
    }
    
    protected final int getChildDrawingOrder(int childCount, final int n) {
        if (this.t) {
            childCount = this.getChildCount();
            if (this.s.length < childCount) {
                this.s = new int[childCount + 5];
            }
            final abq l = this.l;
            int c;
            if (l == null) {
                c = 0;
            }
            else {
                c = l.c();
            }
            int i;
            for (i = 0, childCount = 0; i < c; ++i, ++childCount) {
                this.s[childCount] = this.indexOfChild((View)((egd)this.l.e(i)).a);
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
        final abq a = this.a;
        final int c = a.c();
        int i = 0;
        List<Object> singletonList;
        if (c == 1) {
            singletonList = Collections.singletonList(((egd)a.e(0)).a);
        }
        else {
            singletonList = new ArrayList<Object>(c);
            while (i < c) {
                singletonList.add(((egd)a.e(i)).a);
                ++i;
            }
        }
        return cpc.c((List)singletonList);
    }
    
    public final void h(final int n, final egd egd, final Rect rect) {
        final Object a = egd.a;
        final dvg b = dvg.b(egd);
        final boolean b2 = a instanceof Drawable;
        boolean b3 = true;
        if (b2) {
            bkx.q();
            this.t();
            this.n.h(n, (Object)egd);
            final Drawable drawable = (Drawable)egd.a;
            final dvg b4 = dvg.b(egd);
            if (this.getVisibility() != 0) {
                b3 = false;
            }
            drawable.setVisible(b3, false);
            drawable.setCallback((Drawable$Callback)this);
            if (egd.e instanceof dvr) {
                cpc.h((View)this, drawable, b4.e, b4.m);
            }
            this.invalidate(rect);
        }
        else if (a instanceof View) {
            this.v();
            this.l.h(n, (Object)egd);
            final View view = (View)a;
            view.setDuplicateParentStateEnabled(dvg.e(b.e));
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
            final glt n2 = dvg.b(egd).n;
            if (n2 != null && n2.f() != null) {
                final Object a2 = egd.a;
                if (!this.equals(a2)) {
                    if (this.g == null) {
                        this.setTouchDelegate((TouchDelegate)(this.g = new dxb(this)));
                    }
                    this.g.a.h(n, (Object)new cgm((View)a2, egd));
                }
            }
        }
        this.u();
        this.a.h(n, (Object)egd);
        this.A(b);
    }
    
    public final boolean hasOverlappingRendering() {
        if (!dys.p) {
            return false;
        }
        if (this.getWidth() > 0) {
            if (this.getHeight() > 0) {
                if (this.getWidth() <= dys.r) {
                    if (this.getHeight() <= dys.r) {
                        return super.hasOverlappingRendering();
                    }
                }
            }
        }
        return false;
    }
    
    public final void i(final egd egd, final int n, final int n2) {
        final glt n3 = dvg.b(egd).n;
        if (n3 != null) {
            if (n3.f() != null) {
                final dxb g = this.g;
                if (g != null) {
                    if (g.a.d(n2) != null) {
                        if (g.b == null) {
                            g.b = new abq(4);
                        }
                        cpc.f(n2, g.a, g.b);
                    }
                    cpc.d(n, n2, g.a, g.b);
                    final abq b = g.b;
                    if (b != null && b.c() == 0) {
                        g.b = null;
                    }
                }
            }
        }
        final Object a = egd.a;
        this.v();
        if (a instanceof Drawable) {
            bkx.q();
            this.t();
            if (this.n.d(n2) != null) {
                if (this.o == null) {
                    this.o = new abq(4);
                }
                cpc.f(n2, this.n, this.o);
            }
            cpc.d(n, n2, this.n, this.o);
            this.invalidate();
            this.x();
        }
        else if (a instanceof View) {
            this.t = true;
            if (this.l.d(n2) != null) {
                if (this.m == null) {
                    this.m = new abq(4);
                }
                cpc.f(n2, this.l, this.m);
            }
            cpc.d(n, n2, this.l, this.m);
        }
        this.u();
        if (this.a.d(n2) != null) {
            if (this.k == null) {
                this.k = new abq(4);
            }
            cpc.f(n2, this.a, this.k);
        }
        cpc.d(n, n2, this.a, this.k);
        this.x();
    }
    
    public final void j(final boolean w) {
        if (w == this.w) {
            return;
        }
        Object v = null;
        if (w && this.v == null) {
            this.v = new dsy((View)this, (duc)null, this.isFocusable(), anc.d((View)this));
        }
        if (w) {
            v = this.v;
        }
        anc.N((View)this, (akx)v);
        if (!(this.w = w)) {
            return;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof ComponentHost) {
                ((ComponentHost)child).j(true);
            }
            else {
                final duc duc = (duc)child.getTag(2131428379);
                if (duc != null) {
                    anc.N(child, (akx)new dsy(child, duc, child.isFocusable(), anc.d(child)));
                }
            }
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final abq n = this.n;
        int i = 0;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        while (i < c) {
            ((Drawable)((egd)this.n.e(i)).a).jumpToCurrentState();
            ++i;
        }
    }
    
    public final void k(final egd egd) {
        final abq a = this.a;
        final int b = a.b(a.a((Object)egd));
        final Object a2 = egd.a;
        if (a2 instanceof Drawable) {
            this.t();
            cpc.e(b, this.n, this.o);
        }
        else if (a2 instanceof View) {
            this.v();
            cpc.e(b, this.l, this.m);
            this.t = true;
            this.w(b, egd);
        }
        this.u();
        cpc.e(b, this.a, this.k);
        this.x();
        this.s();
        this.p.add(egd);
    }
    
    public final void l(final egd egd) {
        this.u();
        final abq a = this.a;
        this.m(a.b(a.a((Object)egd)), egd);
    }
    
    public final void m(final int n, final egd egd) {
        final Object a = egd.a;
        if (a instanceof Drawable) {
            this.t();
            this.y((Drawable)a);
            cpc.e(n, this.n, this.o);
        }
        else if (a instanceof View) {
            this.z((View)a);
            this.v();
            cpc.e(n, this.l, this.m);
            this.t = true;
            this.w(n, egd);
        }
        this.u();
        cpc.e(n, this.a, this.k);
        this.x();
        this.A(dvg.b(egd));
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
            if (n6 >= dys.q || n5 >= dys.q) {
                s = "TextureTooBig";
            }
        }
        else {
            final boolean a = dys.a;
        }
        if (s != null) {
            final StringBuilder sb = new StringBuilder("abnormally sized litho layout (");
            sb.append(n5);
            sb.append(", ");
            sb.append(n6);
            sb.append(")");
            final String string = sb.toString();
            this.d(n5, n6);
            efy.a().e(cqj.b(2), string);
        }
        this.o(n, n2, n3, n4);
        this.u = false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        bkx.q();
        if (this.isEnabled()) {
            final abq n = this.n;
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
                final egd egd = (egd)this.n.e(n2);
                c = n2;
                if (!(egd.a instanceof dxc)) {
                    continue;
                }
                if ((dvg.b(egd).e & 0x2) == 0x2) {
                    c = n2;
                }
                else {
                    final dxc dxc = (dxc)egd.a;
                    c = n2;
                    if (!dxc.e(motionEvent)) {
                        continue;
                    }
                    c = n2;
                    if (dxc.d(motionEvent, (View)this)) {
                        return true;
                    }
                    continue;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final ema p() {
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
    
    public final void q(final ema x) {
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
        if (alpha != 0.0f && alpha != 1.0f && (this.getWidth() >= dys.s || this.getHeight() >= dys.s)) {
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
            cqj.c(2, "PartialAlphaTextureTooBig", sb.toString());
        }
        super.setAlpha(alpha);
    }
    
    public final void setContentDescription(final CharSequence q) {
        this.q = q;
        if (!TextUtils.isEmpty(q) && anc.d((View)this) == 0) {
            anc.X((View)this, 1);
        }
        this.f();
    }
    
    public final void setTag(final int n, final Object o) {
        super.setTag(n, o);
        if (n == 2131428379 && o != null) {
            this.j(dsl.b(this.getContext()));
            final dsy v = this.v;
            if (v != null) {
                v.f = (duc)o;
            }
        }
    }
    
    public final void setVisibility(final int visibility) {
        bkx.q();
        super.setVisibility(visibility);
        final abq n = this.n;
        int c;
        if (n == null) {
            c = 0;
        }
        else {
            c = n.c();
        }
        for (int i = 0; i < c; ++i) {
            ((Drawable)((egd)this.n.e(i)).a).setVisible(visibility == 0, false);
        }
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return true;
    }
}
