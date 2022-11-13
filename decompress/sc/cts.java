import android.support.v7.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cts implements cuk
{
    final Object a;
    private final int b;
    
    public cts(final LottieAnimationView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public cts(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(Object a) {
        final int b = this.b;
        if (b == 0) {
            final Throwable t = (Throwable)a;
            a = this.a;
            final int c = ((LottieAnimationView)a).c;
            if (c != 0) {
                ((AppCompatImageView)a).setImageResource(c);
            }
            cuk cuk;
            if ((cuk = ((LottieAnimationView)this.a).b) == null) {
                cuk = LottieAnimationView.a;
            }
            cuk.a((Object)t);
            return;
        }
        if (b == 1) {
            ((LottieAnimationView)this.a).j((ctv)a);
            return;
        }
        if (b != 2) {
            final Throwable t2 = (Throwable)a;
            cua.a.remove(this.a);
            return;
        }
        final ctv ctv = (ctv)a;
        cua.a.remove(this.a);
    }
}
