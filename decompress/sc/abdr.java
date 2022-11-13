import java.util.Set;
import android.view.MotionEvent;
import android.view.View$AccessibilityDelegate;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Point;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abdr extends View implements abdu
{
    public abdv B;
    public long C;
    protected final abdo D;
    public boolean E;
    private final int a;
    private int b;
    private int[] c;
    private Point d;
    
    public abdr(final abdv abdv, final Context context, final AttributeSet set) {
        this(abdv, context, set, new abdo());
    }
    
    public abdr(final abdv b, final Context context, final AttributeSet set, final abdo d) {
        super(context, set);
        this.D = d;
        this.B = b;
        d.c = new afhd(this);
        this.setAccessibilityDelegate((View$AccessibilityDelegate)new abdq(this));
        this.a = (int)(context.getResources().getDisplayMetrics().density * -50.0f);
    }
    
    public static String I(final long n) {
        int n2;
        if (n >= 3600000L) {
            n2 = 5;
        }
        else if (n >= 60000L) {
            n2 = 4;
        }
        else {
            n2 = 3;
        }
        return tvb.k(n / 1000L, n2);
    }
    
    public static void K(final abdv abdv, final long n) {
        final abds abds = (abds)abdv;
        final boolean s = abds.s;
        boolean t = false;
        if (s) {
            t = t;
            if (n == abds.a) {
                t = true;
            }
        }
        abds.t = t;
    }
    
    private final long e(final long n) {
        long n2 = n;
        if (this.B.u()) {
            n2 = -(this.B.h() - n);
        }
        return n2;
    }
    
    protected abstract void B();
    
    protected abstract boolean C(final float p0, final float p1);
    
    protected final long E() {
        return this.B.f() - this.B.j();
    }
    
    protected final long F() {
        return this.C - this.B.j();
    }
    
    protected final Point G(final MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.c == null) {
            this.c = new int[2];
        }
        if (this.d == null) {
            this.d = new Point();
        }
        this.getLocationOnScreen(this.c);
        this.d.set((int)motionEvent.getRawX() - this.c[0], (int)motionEvent.getRawY() - this.c[1]);
        return this.d;
    }
    
    public final String H() {
        return this.getContext().getResources().getString(2132017334, new Object[] { tpe.ad(this.getResources(), (CharSequence)I(this.E())), tpe.ad(this.getResources(), (CharSequence)I(this.mf())) });
    }
    
    protected final void J(final long n) {
        this.D.a(3, n);
    }
    
    protected final void L() {
        this.D.a(5, this.C);
    }
    
    protected final void M() {
        this.D.a(4, this.C);
        this.ma();
    }
    
    protected final void N(final int n) {
        this.m((float)n);
        final long d = this.d();
        this.C = d;
        this.D.a(2, d);
        this.ma();
    }
    
    protected final void O(final int n) {
        this.m((float)n);
        final long d = this.d();
        this.C = d;
        this.D.a(1, d);
        this.ma();
    }
    
    public final void P(final boolean b) {
        this.setFocusable(b);
        this.setClickable(b);
        int importantForAccessibility = 1;
        if (!b) {
            importantForAccessibility = 2;
        }
        this.setImportantForAccessibility(importantForAccessibility);
    }
    
    public final long c() {
        return this.B.e() - this.B.j();
    }
    
    public abstract long d();
    
    public final long lY() {
        return this.e(this.B.f());
    }
    
    protected void lZ() {
        if (this.E) {
            this.ma();
            this.J(this.d());
            return;
        }
        this.J(this.d());
        this.ma();
    }
    
    protected abstract void m(final float p0);
    
    public abstract void ma();
    
    public final boolean mb() {
        return this.D.a;
    }
    
    public final void mc() {
        final abdo d = this.D;
        final long d2 = this.d();
        if (!d.a) {
            return;
        }
        d.b(false, 4, d2);
    }
    
    public final long me() {
        return this.e(this.C);
    }
    
    public final long mf() {
        return this.B.h() - this.B.j();
    }
    
    public final void mg(final abdv b) {
        b.getClass();
        this.B = b;
        this.ma();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.isEnabled()) {
            return false;
        }
        final Point g = this.G(motionEvent);
        int x = g.x;
        final int y = g.y;
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.D.a) {
                            this.M();
                            return true;
                        }
                    }
                }
                else if (this.D.a) {
                    if (y < this.a) {
                        final int b = this.b;
                        x = (x - b) / 3 + b;
                    }
                    else {
                        this.b = x;
                    }
                    this.N(x);
                    return true;
                }
            }
            else if (this.D.a) {
                this.lZ();
                return true;
            }
        }
        else if (this.C((float)x, (float)y)) {
            this.L();
            this.O(x);
            return true;
        }
        return false;
    }
    
    public final void q(final abdw abdw) {
        ((Set<abdw>)this.D.b).add(abdw);
    }
    
    public final void setEnabled(final boolean enabled) {
        if (this.isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        this.B();
    }
    
    public final void y(final abdw abdw) {
        ((Set)this.D.b).remove(abdw);
    }
}
