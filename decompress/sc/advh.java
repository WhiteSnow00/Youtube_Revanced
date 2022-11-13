import java.util.ArrayList;
import android.graphics.Rect;
import android.view.View;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.animation.StateListAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advh extends advf
{
    private StateListAnimator E;
    
    public advh(final FloatingActionButton floatingActionButton, final afhd afhd, final byte[] array, final byte[] array2) {
        super(floatingActionButton, afhd, (byte[])null, (byte[])null);
    }
    
    private final Animator o(final float n, final float n2) {
        final AnimatorSet set = new AnimatorSet();
        set.play((Animator)ObjectAnimator.ofFloat((Object)this.B, "elevation", new float[] { n }).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat((Object)this.B, View.TRANSLATION_Z, new float[] { n2 }).setDuration(100L));
        set.setInterpolator(advh.a);
        return (Animator)set;
    }
    
    public final float a() {
        return this.B.getElevation();
    }
    
    public final void e(final Rect rect) {
        if (this.D.e()) {
            super.e(rect);
            return;
        }
        if (!this.n()) {
            final int n = (this.u - this.B.b()) / 2;
            rect.set(n, n, n, n);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
    
    public final void f(final float n, final float n2, final float n3) {
        if (this.B.getStateListAnimator() == this.E) {
            final StateListAnimator e = new StateListAnimator();
            e.addState(advh.f, this.o(n, n3));
            e.addState(advh.g, this.o(n, n2));
            e.addState(advh.h, this.o(n, n2));
            e.addState(advh.i, this.o(n, n2));
            final AnimatorSet set = new AnimatorSet();
            final ArrayList list = new ArrayList();
            list.add(ObjectAnimator.ofFloat((Object)this.B, "elevation", new float[] { n }).setDuration(0L));
            list.add(ObjectAnimator.ofFloat((Object)this.B, View.TRANSLATION_Z, new float[] { 0.0f }).setDuration(100L));
            set.playSequentially((Animator[])list.toArray(new Animator[0]));
            set.setInterpolator(advh.a);
            e.addState(advh.j, (Animator)set);
            e.addState(advh.k, this.o(0.0f, 0.0f));
            this.E = e;
            this.B.setStateListAnimator(this.E);
        }
        if (this.l()) {
            this.j();
        }
    }
    
    public final boolean l() {
        return this.D.e() || !this.n();
    }
}
