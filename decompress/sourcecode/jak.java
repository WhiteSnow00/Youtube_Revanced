import android.view.MotionEvent;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jak
{
    private final jai a;
    private final jad b;
    private final int c;
    private Point d;
    private VelocityTracker e;
    private boolean f;
    private boolean g;
    private final int h;
    
    public jak(final Context context, final jai a, final jad b, final int h) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.c = context.getResources().getDimensionPixelSize(2131170242);
    }
    
    private final boolean e() {
        final VelocityTracker e = this.e;
        if (e == null) {
            return false;
        }
        e.computeCurrentVelocity(1000);
        final float abs = Math.abs(this.e.getYVelocity());
        final float abs2 = Math.abs(this.e.getXVelocity());
        return abs >= abs2 + abs2;
    }
    
    private final boolean f() {
        final jah a = jah.a;
        return this.h - 1 != 0 || this.f || this.a.i();
    }
    
    public final void a(final MotionEvent motionEvent, final boolean f) {
        if (!this.a.f) {
            return;
        }
        this.d = new Point((int)motionEvent.getRawX(), (int)motionEvent.getRawY());
        this.f = f;
        this.g = false;
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        this.e.addMovement(motionEvent);
        if (this.h == 1) {
            if (this.f || this.a.i()) {
                this.b.a(true);
            }
        }
    }
    
    public final boolean b(final MotionEvent motionEvent, final long n) {
        if (!this.a.f) {
            return false;
        }
        if (this.g) {
            return true;
        }
        float n2;
        if (this.d != null) {
            n2 = motionEvent.getRawY() - this.d.y;
        }
        else {
            n2 = 0.0f;
        }
        final VelocityTracker e = this.e;
        if (e != null) {
            e.addMovement(motionEvent);
        }
        final jah a = jah.a;
        final int ordinal = this.a.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return true;
                        }
                        if (ordinal != 5) {
                            return false;
                        }
                    }
                    if (this.a.l(n2)) {
                        this.g = true;
                    }
                }
                return true;
            }
            if (n2 > this.c && this.e()) {
                if (this.a.l(n2)) {
                    this.g = true;
                }
                return true;
            }
            if (this.h == 1) {
                this.a.f(n);
            }
            return false;
        }
        else {
            if (-n2 > this.c && this.e() && this.f()) {
                if (this.a.l(n2)) {
                    this.g = true;
                }
                return true;
            }
            return false;
        }
    }
    
    public final boolean c(final MotionEvent motionEvent) {
        if (!this.a.f) {
            return false;
        }
        if (this.h == 1) {
            this.b.a(false);
        }
        if (this.g) {
            this.g = false;
            return true;
        }
        float n;
        if (this.d != null) {
            n = motionEvent.getRawY() - this.d.y;
        }
        else {
            n = 0.0f;
        }
        final VelocityTracker e = this.e;
        if (e != null) {
            e.clear();
        }
        if (this.a.a() == jah.d && this.f() && this.a.m(n) && -n > this.c) {
            return true;
        }
        if (this.a.a() == jah.f) {
            if (this.a.m(n) && n > this.c) {
                return true;
            }
            if (this.h == 2 && n > this.c) {
                return true;
            }
        }
        return false;
    }
    
    public final void d() {
        if (!this.a.f) {
            return;
        }
        if (this.h == 1) {
            this.b.a(false);
        }
        final VelocityTracker e = this.e;
        if (e != null) {
            e.clear();
        }
        if (this.g) {
            this.g = false;
            return;
        }
        final jah a = jah.a;
        final int ordinal = this.a.a().ordinal();
        if (ordinal != 3 && ordinal != 5) {
            return;
        }
        this.a.g(true, true);
    }
}
