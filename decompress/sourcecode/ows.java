import android.support.rastermill.FrameSequenceDrawable;
import android.graphics.Bitmap;
import java.util.LinkedList;
import android.support.rastermill.FrameSequence;
import android.graphics.Bitmap$Config;
import android.support.rastermill.FrameSequenceDrawable$BitmapProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ows implements FrameSequenceDrawable$BitmapProvider, dfx
{
    private static final Bitmap$Config a;
    private final FrameSequence b;
    private final dgf c;
    private final LinkedList d;
    
    static {
        a = Bitmap$Config.ARGB_8888;
    }
    
    public ows(final FrameSequence b, final dgf c) {
        this.d = new LinkedList();
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        final double n = this.b.getWidth() * this.b.getHeight();
        final double n2 = this.b.getFrameCount();
        Double.isNaN(n2);
        Double.isNaN(n);
        return (int)(n * (n2 * 0.06 + 16.0));
    }
    
    public final Bitmap acquireBitmap(final int n, final int n2) {
        return this.c.a(n, n2, ows.a);
    }
    
    public final Class b() {
        return FrameSequenceDrawable.class;
    }
    
    public final void e() {
        while (!this.d.isEmpty()) {
            final FrameSequenceDrawable frameSequenceDrawable = this.d.poll();
            if (!frameSequenceDrawable.isDestroyed()) {
                frameSequenceDrawable.destroy();
            }
        }
    }
    
    public final void releaseBitmap(final Bitmap bitmap) {
        this.c.d(bitmap);
    }
}
