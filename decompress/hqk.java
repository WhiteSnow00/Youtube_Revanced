import android.view.MotionEvent;
import java.util.function.Consumer;
import android.graphics.Point;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.os.Handler;
import android.content.Context;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqk
{
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public Optional f;
    public float g;
    public float h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public final Context p;
    public final Handler q;
    public final hqv r;
    public final hpy s;
    public final WindowManager t;
    public hrf u;
    public psb v;
    public final arwh w;
    
    public hqk(final Context p7, final Handler q, final hqv r, final hpy s, final arwh w, final byte[] array, final byte[] array2) {
        this.i = -1L;
        this.o = 0;
        this.p = p7;
        this.q = q;
        this.r = r;
        this.s = s;
        this.w = w;
        this.a = ViewConfiguration.get(p7).getScaledTouchSlop();
        this.b = Math.max(199, ViewConfiguration.getTapTimeout());
        this.c = ViewConfiguration.getDoubleTapTimeout();
        final WindowManager t = (WindowManager)p7.getSystemService("window");
        this.t = t;
        if (t != null) {
            final Point point = new Point();
            t.getDefaultDisplay().getSize(point);
            this.d = point.x;
            this.e = point.y;
        }
    }
    
    public final void a(final boolean b) {
        Label_0064: {
            if (this.j) {
                if (!b || this.m) {
                    break Label_0064;
                }
                this.r.c(this.o);
                this.o = 0;
                this.j = false;
            }
            this.f.ifPresent((Consumer)new hoa(this, 11));
            this.v.c(true);
        }
        this.i = -1L;
        this.s.e();
    }
    
    public final void b(final MotionEvent motionEvent) {
        this.s.f(motionEvent.getRawX(), motionEvent.getRawY());
    }
    
    public final void c(final boolean b, final boolean b2, final pvh pvh) {
        if (b) {
            if (b2) {
                return;
            }
            if (!this.j) {
                this.j = true;
                this.o = this.r.a();
                this.v.c(false);
                this.u.w.d();
                this.u.C();
            }
            else {
                this.j = false;
                this.r.c(this.o);
                this.v.c(true);
                this.o = 0;
                this.u.w.c();
                this.u.x();
            }
            if (pvh != null) {
                pvh.A(114670);
            }
        }
        else {
            if (this.g > this.d * 3 / 10) {
                if (pvh != null) {
                    pvh.A(91958);
                }
                this.f.ifPresent((Consumer)gyr.s);
                return;
            }
            if (pvh != null) {
                pvh.A(91957);
            }
            this.f.ifPresent((Consumer)gyr.t);
        }
    }
}
