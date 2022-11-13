import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hro implements Animation$AnimationListener
{
    public final ViewGroup a;
    public final hrn b;
    public abcb c;
    public Animation d;
    public Animation e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private final ScheduledExecutorService j;
    private boolean k;
    private ScheduledFuture l;
    private final hol m;
    
    public hro(final afvt j, final ViewGroup a, final hrn b) {
        this.i = 2;
        this.f = false;
        this.g = false;
        this.k = false;
        this.h = false;
        this.l = null;
        this.j = (ScheduledExecutorService)j;
        this.a = a;
        this.b = b;
        this.m = new hol(this, 9);
    }
    
    public final void a() {
        if (this.g) {
            this.k = true;
            this.e.cancel();
            this.e.reset();
        }
        else if (this.h()) {
            return;
        }
        this.f = true;
        this.a.setVisibility(0);
        this.a.startAnimation(this.d);
        final wan e = ((hpu)this.b).e;
        if (e != null) {
            e.w(0.3f);
        }
        this.c();
    }
    
    public final void b() {
        if (this.h()) {
            if (!this.f) {
                this.g = true;
                this.a.startAnimation(this.e);
                final wan e = ((hpu)this.b).e;
                if (e != null) {
                    e.w(1.0f);
                }
            }
        }
    }
    
    public final void c() {
        final ScheduledFuture l = this.l;
        if (l != null) {
            l.cancel(false);
        }
    }
    
    public final void d() {
        this.i = 4;
        this.c.a(ControlsState.d());
        this.c();
    }
    
    public final void e() {
        this.i = 2;
        this.c.a(ControlsState.f());
        this.f();
    }
    
    public final void f() {
        this.c();
        if (!this.h) {
            this.l = this.j.schedule((Runnable)this.m, 3000L, TimeUnit.MILLISECONDS);
        }
    }
    
    public final void g() {
        this.c.a(ControlsState.f());
        this.a.setVisibility(8);
        this.d.reset();
        this.e.reset();
        this.i = 2;
        this.f = false;
        this.g = false;
        this.k = false;
        this.c();
        this.h = false;
    }
    
    public final boolean h() {
        return this.a.getVisibility() == 0;
    }
    
    public final boolean i() {
        final int i = this.i;
        return i == 3 || i == 4;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        if (animation == this.d) {
            this.f = false;
            if (!this.i()) {
                this.f();
            }
        }
        else if (animation == this.e) {
            if (this.k) {
                this.k = false;
            }
            else {
                this.a.setVisibility(8);
            }
            this.g = false;
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
}
