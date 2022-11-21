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

public final class arie
{
    public long a;
    public final Object b;
    public final Object c;
    
    public arie(final Handler b, final Runnable runnable) {
        b.getClass();
        runnable.getClass();
        this.b = b;
        this.c = new aegq(this, runnable, b, 20);
    }
    
    public arie(final jbq c, final abqz abqz, final mtf mtf, final fjy fjy, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = abqz.n();
        this.c = c;
        this.a = -1L;
        mtf.w((Callable)new ina(this, c, 6, (byte[])null, (byte[])null));
        mtf.w((Callable)new ina(this, abqz, 7, (byte[])null, (byte[])null));
        mtf.w((Callable)new ina(this, fjy, 8, (byte[])null, (byte[])null));
    }
    
    public arie(final oco c) {
        this.c = c;
        this.b = new WeakHashMap();
        this.a = -1L;
    }
    
    public static Animator c(final View view, final long n) {
        final View viewById = view.findViewById(2131427725);
        final View viewById2 = view.findViewById(2131428271);
        final View viewById3 = view.findViewById(2131429861);
        final View viewById4 = view.findViewById(2131427444);
        if (viewById != null && viewById2 != null && viewById3 != null && viewById4 != null) {
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { g(viewById, 0, n), g(viewById2, 0, n), g(viewById3, 1, n), g(viewById4, 2, n) });
            return (Animator)set;
        }
        return null;
    }
    
    private static Animator f(final View view, final int n, final float n2, final float n3) {
        return (Animator)ObjectAnimator.ofFloat((Object)view, View.ALPHA, new float[] { n2, n3 }).setDuration((long)n);
    }
    
    private static Animator g(final View view, int n, final long n2) {
        final AnimatorSet set = new AnimatorSet();
        final ArrayList list = new ArrayList();
        n *= 75;
        final long n3 = n;
        if (n2 < n3) {
            set.setStartDelay(n3 - n2);
        }
        n += 300;
        final long n4 = n;
        if (n2 < n4) {
            final float n5 = (float)Math.min(n4 - n2, 300L);
            final float alpha = n5 / 300.0f * 0.5f + 0.5f;
            view.setAlpha(alpha);
            list.add(f(view, (int)n5, alpha, 0.5f));
        }
        final long n6 = n + 750;
        if (n2 < n6) {
            final float n7 = (float)Math.min(n6 - n2, 750L);
            final float alpha2 = 1.0f - n7 / 750.0f * 0.5f;
            if (list.isEmpty()) {
                view.setAlpha(alpha2);
            }
            list.add(f(view, (int)n7, alpha2, 1.0f));
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
        ((Handler)this.b).post((Runnable)new yrk(this, n, 11));
    }
    
    public final void b() {
        ((Handler)this.b).removeCallbacks((Runnable)this.c);
        ((Handler)this.b).post((Runnable)new arfq(this, 10));
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
