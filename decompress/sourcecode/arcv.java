import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.View;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcv
{
    public long a;
    public final Object b;
    public final Object c;
    
    public arcv(final Handler b, final Runnable runnable) {
        b.getClass();
        runnable.getClass();
        this.b = b;
        this.c = new aecw(this, runnable, b, 20);
    }
    
    public arcv(final jai c, final abns abns, final mrm mrm, final fjp fjp, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = abns.o();
        this.c = c;
        this.a = -1L;
        mrm.A((Callable)new imb(this, c, 5, (byte[])null, (byte[])null));
        mrm.A((Callable)new imb(this, abns, 6, (byte[])null, (byte[])null));
        mrm.A((Callable)new imb(this, fjp, 7, (byte[])null, (byte[])null));
    }
    
    public arcv(final oas c) {
        this.c = c;
        this.b = new WeakHashMap();
        this.a = -1L;
    }
    
    public static Animator c(View viewById, final long n) {
        final View viewById2 = viewById.findViewById(2131427725);
        final View viewById3 = viewById.findViewById(2131428271);
        final View viewById4 = viewById.findViewById(2131429861);
        viewById = viewById.findViewById(2131427444);
        if (viewById2 != null && viewById3 != null && viewById4 != null && viewById != null) {
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { g(viewById2, 0, n), g(viewById3, 0, n), g(viewById4, 1, n), g(viewById, 2, n) });
            return (Animator)set;
        }
        return null;
    }
    
    private static Animator f(final View view, final int n, final float n2, final float n3) {
        return (Animator)ObjectAnimator.ofFloat((Object)view, View.ALPHA, new float[] { n2, n3 }).setDuration((long)n);
    }
    
    private static Animator g(final View view, int n, final long n2) {
        n *= 75;
        final int n3 = n + 300;
        final AnimatorSet set = new AnimatorSet();
        final ArrayList list = new ArrayList();
        final long n4 = n;
        if (n2 < n4) {
            set.setStartDelay(n4 - n2);
        }
        final long n5 = n3;
        if (n2 < n5) {
            final float n6 = (float)Math.min(n5 - n2, 300L);
            final float alpha = n6 / 300.0f * 0.5f + 0.5f;
            view.setAlpha(alpha);
            list.add(f(view, (int)n6, alpha, 0.5f));
        }
        final long n7 = n3 + 750;
        if (n2 < n7) {
            final float n8 = (float)Math.min(n7 - n2, 750L);
            final float alpha2 = 1.0f - n8 / 750.0f * 0.5f;
            if (list.isEmpty()) {
                view.setAlpha(alpha2);
            }
            list.add(f(view, (int)n8, alpha2, 1.0f));
        }
        if (list.isEmpty()) {
            view.setAlpha(1.0f);
        }
        list.add(f(view, (int)Math.min(2200L - n2, 1000L), 1.0f, 1.0f));
        set.playSequentially((List)list);
        return (Animator)set;
    }
    
    private static void h(final Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }
    
    public final void a(final long n) {
        ((Handler)this.b).post((Runnable)new ynq(this, n, 11));
    }
    
    public final void b() {
        ((Handler)this.b).removeCallbacks((Runnable)this.c);
        ((Handler)this.b).post((Runnable)new arax(this, 9));
    }
    
    public final void d() {
        final Iterator iterator = ((WeakHashMap)this.b).values().iterator();
        while (iterator.hasNext()) {
            h((Animator)iterator.next());
        }
        ((WeakHashMap)this.b).clear();
    }
    
    public final void e(final View view) {
        final Animator animator = ((WeakHashMap)this.b).remove(view);
        if (animator != null) {
            h(animator);
        }
    }
}
