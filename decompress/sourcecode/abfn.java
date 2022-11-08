import java.util.Collection;
import android.animation.Animator;
import java.util.List;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import j$.time.Duration;
import android.animation.AnimatorSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfn
{
    public AnimatorSet a;
    private final Duration b;
    private final afcr c;
    private final afcr d;
    private final Animator$AnimatorListener e;
    
    public abfn() {
    }
    
    public abfn(final Duration b, final afcr c, final afcr d, final Animator$AnimatorListener e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static adkk c() {
        final adkk adkk = new adkk();
        adkk.f(Duration.ofMillis(200L));
        return adkk;
    }
    
    public final void a() {
        final AnimatorSet a = this.a;
        if (a == null) {
            return;
        }
        a.end();
    }
    
    public final void b() {
        final AnimatorSet a = this.a;
        if (a == null) {
            this.a = new AnimatorSet();
            final ArrayList list = new ArrayList(this.c.size());
            Duration duration = Duration.ZERO;
            final afcr c = this.c;
            for (int size = ((List)c).size(), i = 0; i < size; ++i) {
                final View view = (View)((List)c).get(i);
                final ArrayList list2 = new ArrayList(this.d.size());
                final afcr d = this.d;
                for (int size2 = ((List)d).size(), j = 0; j < size2; ++j) {
                    final abfm abfm = (abfm)((List)d).get(j);
                    final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, "alpha", new float[] { abfm.a, abfm.b });
                    ofFloat.setDuration(abfm.c.toMillis());
                    list2.add(ofFloat);
                }
                final AnimatorSet set = new AnimatorSet();
                set.playSequentially((List)list2);
                ((Animator)set).setStartDelay(duration.toMillis());
                list.add(set);
                duration = duration.plus(this.b);
            }
            if (this.e != null) {
                ((Animator)list.get(0)).addListener(this.e);
            }
            this.a.playTogether((Collection)list);
        }
        else if (a.isStarted()) {
            return;
        }
        final afcr c2 = this.c;
        for (int size3 = ((List)c2).size(), k = 0; k < size3; ++k) {
            final View view2 = (View)((List)c2).get(k);
            view2.setVisibility(0);
            float a2;
            if (this.d.isEmpty()) {
                a2 = 0.0f;
            }
            else {
                a2 = ((abfm)this.d.get(0)).a;
            }
            view2.setAlpha(a2);
        }
        this.a.start();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abfn) {
            final abfn abfn = (abfn)o;
            if (this.b.equals((Object)abfn.b) && adwd.ar((List)this.c, abfn.c) && adwd.ar((List)this.d, abfn.d)) {
                final Animator$AnimatorListener e = this.e;
                final Animator$AnimatorListener e2 = abfn.e;
                if (e == null) {
                    if (e2 != null) {
                        return false;
                    }
                }
                else if (!e.equals(e2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final Animator$AnimatorListener e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("SequentialAlphaAnimationHelper{delayBetweenAnimationsInSequence=");
        sb.append(value);
        sb.append(", views=");
        sb.append(value2);
        sb.append(", animationSteps=");
        sb.append(value3);
        sb.append(", animatorListener=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
