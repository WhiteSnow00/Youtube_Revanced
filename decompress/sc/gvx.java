import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvx implements Runnable
{
    public final gvy a;
    public final CreationButtonView b;
    public final float c;
    
    public gvx(final gvy a, final CreationButtonView b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final gvy a = this.a;
        final CreationButtonView b = this.b;
        final float c = this.c;
        final CreationButtonView l = a.l;
        if (l != null) {
            l.clearAnimation();
            final ImageView c2 = a.l.c;
            if (c2 != null) {
                c2.clearAnimation();
            }
        }
        b.getClass();
        a.l = b;
        final int[] array = new int[2];
        a.l.getLocationOnScreen(array);
        a.l.setTranslationY(c - array[1]);
        a.l.setAlpha(1.0f);
        a.l.animate().translationY(0.0f).setInterpolator(gvy.a()).setDuration(200L).start();
        final CreationButtonView i = a.l;
        int n;
        if (i == a.e) {
            n = 2131231534;
        }
        else {
            n = 2131231536;
        }
        if (i != null) {
            final AnimatedVectorDrawable imageDrawable = (AnimatedVectorDrawable)i.getResources().getDrawable(n);
            a.l.c.setImageDrawable((Drawable)imageDrawable);
            imageDrawable.start();
        }
    }
}
