import java.util.Iterator;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaym extends abvy
{
    final CreatorEndscreenOverlayPresenter a;
    
    public aaym(final CreatorEndscreenOverlayPresenter a, final long n) {
        this.a = a;
        super(n, Long.MAX_VALUE, 1, 1, (String)null);
    }
    
    public final void b(final boolean b, final boolean b2, final boolean b3) {
        for (final aayr aayr : this.a.g) {
            final CreatorEndscreenOverlayPresenter a = this.a;
            final acgs b4 = a.b;
            final int width = a.f.getWidth();
            this.a.f.getHeight();
            final float n = (float)width;
            final ajpc b5 = aayr.b;
            final float i = b5.i;
            final float k = b5.k;
            final int n2 = (int)(n * i);
            final float n3 = n2 / k;
            aotp aotp;
            if ((aotp = b5.d) == null) {
                aotp = aotp.a;
            }
            b4.m(aotp, n2, (int)n3);
        }
    }
}
