import android.animation.Animator;
import android.widget.TextView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adym extends AnimatorListenerAdapter
{
    final /* synthetic */ int a;
    final /* synthetic */ TextView b;
    final /* synthetic */ int c;
    final /* synthetic */ TextView d;
    final /* synthetic */ adyo e;
    
    public adym(final adyo e, final int a, final TextView b, final int c, final TextView d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final adyo e = this.e;
        e.d = this.a;
        e.c = null;
        final TextView b = this.b;
        if (b != null) {
            b.setVisibility(4);
            if (this.c == 1) {
                final TextView h = this.e.h;
                if (h != null) {
                    h.setText((CharSequence)null);
                }
            }
        }
        final TextView d = this.d;
        if (d != null) {
            d.setTranslationY(0.0f);
            this.d.setAlpha(1.0f);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        final TextView d = this.d;
        if (d != null) {
            d.setVisibility(0);
        }
    }
}
