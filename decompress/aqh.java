import android.view.MotionEvent;
import android.view.ViewParent;
import java.util.List;
import java.util.ArrayList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aqh extends akx
{
    private static final Rect f;
    public final AccessibilityManager a;
    public final View b;
    int d;
    int e;
    private final Rect g;
    private final Rect h;
    private final Rect i;
    private final int[] j;
    private aqg k;
    private int l;
    
    static {
        f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public aqh(final View b) {
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new int[2];
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        if (b != null) {
            this.b = b;
            this.a = (AccessibilityManager)b.getContext().getSystemService("accessibility");
            b.setFocusable(true);
            if (anc.d(b) == 0) {
                anc.X(b, 1);
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }
    
    private final AccessibilityEvent w(final int n, final int n2) {
        if (n == -1) {
            final AccessibilityEvent obtain = AccessibilityEvent.obtain(n2);
            this.b.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        final AccessibilityEvent obtain2 = AccessibilityEvent.obtain(n2);
        final aon k = this.k(n);
        obtain2.getText().add(k.f());
        obtain2.setContentDescription(k.e());
        obtain2.setScrollable(k.M());
        obtain2.setPassword(k.L());
        obtain2.setEnabled(k.J());
        obtain2.setChecked(k.I());
        this.u(obtain2);
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(k.d());
        aot.a((AccessibilityRecord)obtain2, this.b, n);
        obtain2.setPackageName((CharSequence)this.b.getContext().getPackageName());
        return obtain2;
    }
    
    private final void x(final int l) {
        final int i = this.l;
        if (i == l) {
            return;
        }
        this.v(this.l = l, 128);
        this.v(i, 256);
    }
    
    public aor a(final View view) {
        if (this.k == null) {
            this.k = new aqg(this);
        }
        return (aor)this.k;
    }
    
    protected abstract int j(final float p0, final float p1);
    
    final aon k(int i) {
        final int n = 0;
        if (i == -1) {
            final aon c = aon.c(AccessibilityNodeInfo.obtain(this.b));
            anc.G(this.b, c);
            final ArrayList list = new ArrayList();
            this.m(list);
            if (c.a.getChildCount() > 0 && list.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size;
            for (size = list.size(), i = n; i < size; ++i) {
                c.a.addChild(this.b, (int)list.get(i));
            }
            return c;
        }
        else {
            final aon b = aon.b();
            b.x(true);
            b.y(true);
            b.r((CharSequence)"android.view.View");
            final Rect f = aqh.f;
            b.n(f);
            b.o(f);
            b.D(this.b);
            this.p(i, b);
            if (b.f() == null && b.e() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            }
            b.j(this.h);
            b.k(this.g);
            if (this.h.equals((Object)f) && this.g.equals((Object)f)) {
                throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            }
            final int actions = b.a.getActions();
            if ((actions & 0x40) != 0x0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            if ((actions & 0x80) == 0x0) {
                b.a.setPackageName((CharSequence)this.b.getContext().getPackageName());
                final View b2 = this.b;
                b.c = i;
                b.a.setSource(b2, i);
                if (this.d == i) {
                    b.l(true);
                    b.h(128);
                }
                else {
                    b.l(false);
                    b.h(64);
                }
                final boolean b3 = this.e == i;
                if (b3) {
                    b.h(2);
                }
                else if (b.K()) {
                    b.h(1);
                }
                b.z(b3);
                this.b.getLocationOnScreen(this.j);
                if (this.g.equals((Object)f)) {
                    final Rect h = this.h;
                    b.n(h);
                    final Rect rect = new Rect();
                    rect.set(h);
                    if (b.b != -1) {
                        final aon b4 = aon.b();
                        final Rect rect2 = new Rect();
                        View b5;
                        for (i = b.b; i != -1; i = b4.b) {
                            b5 = this.b;
                            b4.b = -1;
                            b4.a.setParent(b5, -1);
                            b4.n(aqh.f);
                            this.p(0, b4);
                            b4.j(rect2);
                            rect.offset(rect2.left, rect2.top);
                        }
                    }
                    this.b.getLocationOnScreen(this.j);
                    rect.offset(this.j[0] - this.b.getScrollX(), this.j[1] - this.b.getScrollY());
                    b.o(rect);
                    b.k(this.g);
                }
                if (this.b.getLocalVisibleRect(this.i)) {
                    this.i.offset(this.j[0] - this.b.getScrollX(), this.j[1] - this.b.getScrollY());
                    if (this.g.intersect(this.i)) {
                        b.o(this.g);
                        final Rect g = this.g;
                        if (g != null) {
                            if (!g.isEmpty()) {
                                if (this.b.getWindowVisibility() == 0) {
                                    ViewParent viewParent;
                                    View view;
                                    for (viewParent = this.b.getParent(); viewParent instanceof View; viewParent = view.getParent()) {
                                        view = (View)viewParent;
                                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                            return b;
                                        }
                                    }
                                    if (viewParent != null) {
                                        b.H(true);
                                    }
                                }
                            }
                        }
                    }
                }
                return b;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
    }
    
    protected abstract void m(final List p0);
    
    public final void n() {
        this.o(-1, 1);
    }
    
    public final void o(final int n, final int n2) {
        if (this.a.isEnabled()) {
            final ViewParent parent = this.b.getParent();
            if (parent != null) {
                final AccessibilityEvent w = this.w(n, 2048);
                aoh.b(w, n2);
                parent.requestSendAccessibilityEvent(this.b, w);
            }
        }
    }
    
    protected abstract void p(final int p0, final aon p1);
    
    public final boolean q(final int n) {
        if (this.d == n) {
            this.d = Integer.MIN_VALUE;
            this.b.invalidate();
            this.v(n, 65536);
            return true;
        }
        return false;
    }
    
    public final boolean r(final int n) {
        if (this.e != n) {
            return false;
        }
        this.e = Integer.MIN_VALUE;
        this.v(n, 8);
        return true;
    }
    
    public final boolean s(final MotionEvent motionEvent) {
        if (this.a.isEnabled()) {
            if (this.a.isTouchExplorationEnabled()) {
                final int action = motionEvent.getAction();
                if (action != 7 && action != 9) {
                    if (action != 10) {
                        return false;
                    }
                    if (this.l != Integer.MIN_VALUE) {
                        this.x(Integer.MIN_VALUE);
                        return true;
                    }
                    return false;
                }
                else {
                    final int j = this.j(motionEvent.getX(), motionEvent.getY());
                    this.x(j);
                    if (j != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    protected abstract boolean t(final int p0, final int p1);
    
    protected void u(final AccessibilityEvent accessibilityEvent) {
    }
    
    public final void v(final int n, final int n2) {
        if (n != Integer.MIN_VALUE) {
            if (this.a.isEnabled()) {
                final ViewParent parent = this.b.getParent();
                if (parent == null) {
                    return;
                }
                parent.requestSendAccessibilityEvent(this.b, this.w(n, n2));
            }
        }
    }
}
