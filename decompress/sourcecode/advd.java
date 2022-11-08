import android.graphics.ColorFilter;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import java.util.List;
import android.content.Context;
import android.animation.ValueAnimator;
import android.util.Property;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class advd extends Drawable implements Animatable
{
    private static final Property a;
    private ValueAnimator b;
    private ValueAnimator c;
    final Context d;
    final aduq e;
    public List f;
    public boolean g;
    final Paint h;
    public int i;
    private float j;
    
    static {
        a = new advc(Float.class);
    }
    
    public advd(final Context d, final aduq e) {
        this.h = new Paint();
        this.d = d;
        this.e = e;
        this.setAlpha(255);
    }
    
    private final void a(final ValueAnimator... array) {
        final boolean g = this.g;
        this.g = true;
        array[0].end();
        this.g = g;
    }
    
    public boolean b(final boolean b, final boolean b2, final boolean b3) {
        if (this.b == null) {
            (this.b = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, advd.a, new float[] { 0.0f, 1.0f })).setDuration(500L);
            this.b.setInterpolator(adqd.b);
            final ValueAnimator b4 = this.b;
            if (b4 != null && b4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            (this.b = b4).addListener((Animator$AnimatorListener)new adva(this));
        }
        if (this.c == null) {
            (this.c = (ValueAnimator)ObjectAnimator.ofFloat((Object)this, advd.a, new float[] { 1.0f, 0.0f })).setDuration(500L);
            this.c.setInterpolator(adqd.b);
            final ValueAnimator c = this.c;
            if (c != null && c.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            (this.c = c).addListener((Animator$AnimatorListener)new advb(this));
        }
        if (!this.isVisible() && !b) {
            return false;
        }
        ValueAnimator valueAnimator;
        if (b) {
            valueAnimator = this.b;
        }
        else {
            valueAnimator = this.c;
        }
        ValueAnimator valueAnimator2;
        if (b) {
            valueAnimator2 = this.c;
        }
        else {
            valueAnimator2 = this.b;
        }
        if (!b3) {
            if (valueAnimator2.isRunning()) {
                final ValueAnimator[] array = { null };
                final boolean g = this.g;
                this.g = true;
                valueAnimator2.cancel();
                this.g = g;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
            else {
                this.a(valueAnimator);
            }
            return super.setVisible(b, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        final boolean b5 = !b || super.setVisible(true, false);
        boolean b6;
        if (b) {
            b6 = this.e.c();
        }
        else {
            b6 = this.e.b();
        }
        if (!b6) {
            this.a(valueAnimator);
            return b5;
        }
        if (!b2 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        }
        else {
            valueAnimator.start();
        }
        return b5;
    }
    
    final float c() {
        if (!this.e.c() && !this.e.b()) {
            return 1.0f;
        }
        return this.j;
    }
    
    public final void d(final cju cju) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (!this.f.contains(cju)) {
            this.f.add(cju);
        }
    }
    
    final void e(final float j) {
        if (this.j != j) {
            this.j = j;
            this.invalidateSelf();
        }
    }
    
    public final boolean f() {
        final ValueAnimator c = this.c;
        return c != null && c.isRunning();
    }
    
    public final boolean g() {
        final ValueAnimator b = this.b;
        return b != null && b.isRunning();
    }
    
    public final int getAlpha() {
        return this.i;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public final boolean h(final boolean b, final boolean b2, final boolean b3) {
        final float n = adwd.n(this.d.getContentResolver());
        boolean b4 = false;
        if (b3) {
            b4 = b4;
            if (n > 0.0f) {
                b4 = true;
            }
        }
        return this.b(b, b2, b4);
    }
    
    public final boolean isRunning() {
        return this.g() || this.f();
    }
    
    public final void j() {
        this.h(false, false, false);
    }
    
    public final void k(final cju cju) {
        final List f = this.f;
        if (f != null && f.contains(cju)) {
            this.f.remove(cju);
            if (this.f.isEmpty()) {
                this.f = null;
            }
        }
    }
    
    public final void setAlpha(final int i) {
        this.i = i;
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        return this.h(b, b2, true);
    }
    
    public final void start() {
        this.b(true, true, false);
    }
    
    public final void stop() {
        this.b(false, true, false);
    }
}
