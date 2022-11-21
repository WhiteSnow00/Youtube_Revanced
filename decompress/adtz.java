import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import android.animation.AnimatorSet;
import android.animation.AnimatorInflater;
import android.content.res.TypedArray;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtz
{
    private final abp a;
    private final abp b;
    
    public adtz() {
        this.a = new abp();
        this.b = new abp();
    }
    
    public static adtz a(final Context context, final TypedArray typedArray, int resourceId) {
        final boolean hasValue = typedArray.hasValue(resourceId);
        adtz adtz2;
        final adtz adtz = adtz2 = null;
        if (hasValue) {
            resourceId = typedArray.getResourceId(resourceId, 0);
            adtz2 = adtz;
            if (resourceId != 0) {
                try {
                    final Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
                    if (loadAnimator instanceof AnimatorSet) {
                        adtz2 = c(((AnimatorSet)loadAnimator).getChildAnimations());
                    }
                    else {
                        adtz2 = adtz;
                        if (loadAnimator != null) {
                            final ArrayList list = new ArrayList();
                            list.add(loadAnimator);
                            adtz2 = c(list);
                        }
                    }
                }
                catch (final Exception ex) {
                    Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(resourceId))), (Throwable)ex);
                    adtz2 = adtz;
                }
            }
        }
        return adtz2;
    }
    
    private static adtz c(final List list) {
        final adtz adtz = new adtz();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            final ObjectAnimator objectAnimator = (ObjectAnimator)animator;
            adtz.b.put((Object)objectAnimator.getPropertyName(), (Object)objectAnimator.getValues());
            final String propertyName = objectAnimator.getPropertyName();
            final long startDelay = ((ValueAnimator)objectAnimator).getStartDelay();
            final long duration = ((ValueAnimator)objectAnimator).getDuration();
            final TimeInterpolator interpolator = ((ValueAnimator)objectAnimator).getInterpolator();
            TimeInterpolator timeInterpolator;
            if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                if (interpolator instanceof AccelerateInterpolator) {
                    timeInterpolator = adtw.c;
                }
                else {
                    timeInterpolator = interpolator;
                    if (interpolator instanceof DecelerateInterpolator) {
                        timeInterpolator = adtw.d;
                    }
                }
            }
            else {
                timeInterpolator = adtw.b;
            }
            final adua adua = new adua(startDelay, duration, timeInterpolator);
            adua.a = ((ValueAnimator)objectAnimator).getRepeatCount();
            adua.b = ((ValueAnimator)objectAnimator).getRepeatMode();
            adtz.a.put((Object)propertyName, (Object)adua);
        }
        return adtz;
    }
    
    public final adua b(final String s) {
        if (this.a.get((Object)s) != null) {
            return (adua)this.a.get((Object)s);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof adtz && this.a.equals((Object)((adtz)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append(this.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.a);
        sb.append("}\n");
        return sb.toString();
    }
}
