import android.graphics.Bitmap;
import java.io.IOException;
import android.support.rastermill.FrameSequenceDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class accj implements szx
{
    public final ImageView a;
    public final AtomicBoolean b;
    private final oun c;
    private final zhs d;
    private final acea e;
    private final oas f;
    private final otd g;
    private final szx h;
    
    public accj(final ImageView a, final oun c, final zhs d, final acea e, final oas f, final szx h, final otd g) {
        this.b = new AtomicBoolean(false);
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public static Uri c(final Uri uri) {
        return uri.buildUpon().appendQueryParameter("bitmap", "true").build();
    }
    
    public final void d(final Bitmap bitmap) {
        if (this.b.get()) {
            return;
        }
        this.a.post((Runnable)new abwg(this, bitmap, 6));
    }
}
