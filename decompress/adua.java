import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adua
{
    public int a;
    public int b;
    private final long c;
    private final long d;
    private final TimeInterpolator e;
    
    public adua(final long c, final long d, final TimeInterpolator e) {
        this.a = 0;
        this.b = 1;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final TimeInterpolator a() {
        final TimeInterpolator e = this.e;
        if (e != null) {
            return e;
        }
        return adtw.b;
    }
    
    public final void b(final Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(this.a());
        if (animator instanceof ValueAnimator) {
            final int a = this.a;
            final ValueAnimator valueAnimator = (ValueAnimator)animator;
            valueAnimator.setRepeatCount(a);
            valueAnimator.setRepeatMode(this.b);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof adua)) {
            return false;
        }
        final adua adua = (adua)o;
        return this.c == adua.c && this.d == adua.d && this.a == adua.a && this.b == adua.b && this.a().getClass().equals(adua.a().getClass());
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final long d = this.d;
        return ((((int)(c ^ c >>> 32) * 31 + (int)(d ^ d >>> 32)) * 31 + this.a().getClass().hashCode()) * 31 + this.a) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append(this.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.c);
        sb.append(" duration: ");
        sb.append(this.d);
        sb.append(" interpolator: ");
        sb.append(this.a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.a);
        sb.append(" repeatMode: ");
        sb.append(this.b);
        sb.append("}\n");
        return sb.toString();
    }
}
