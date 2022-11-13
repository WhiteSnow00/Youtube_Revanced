import android.support.v7.widget.AppCompatImageView;
import android.app.Dialog;
import android.util.Log;
import java.io.IOException;
import android.support.rastermill.FrameSequenceDrawable;
import android.graphics.drawable.Drawable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class fsa extends AnimatorListenerAdapter
{
    final fsd a;
    
    public fsa(final fsd a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(Animator a) {
        super.onAnimationEnd((Animator)a);
        a = (IOException)this.a;
        ((fsd)a).c = 1.0f;
        final zjp q = ((fsd)a).q;
        Label_0101: {
            if (q != null) {
                final byte[] s = ((fsd)a).s;
                if (s != null) {
                    if (((fsd)a).r != null) {
                        try {
                            final Drawable imageDrawable = (Drawable)q.d((Object)s);
                            if (imageDrawable instanceof FrameSequenceDrawable) {
                                ((AppCompatImageView)a).setImageDrawable(imageDrawable);
                                ((fsd)a).r.b((FrameSequenceDrawable)imageDrawable);
                                ((fsd)a).r.c();
                            }
                            break Label_0101;
                        }
                        catch (final IOException a) {}
                        catch (final twc twc) {}
                        Log.e("ImageZoomView", "Failed converting bytes to drawable", (Throwable)a);
                    }
                }
            }
        }
        final Dialog f = this.a.f;
        if (f != null) {
            f.dismiss();
        }
    }
}
