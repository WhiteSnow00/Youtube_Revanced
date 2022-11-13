import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huh extends acfy
{
    final UploadActivity a;
    
    public huh(final UploadActivity a) {
        this.a = a;
    }
    
    public final void a(final ImageView imageView) {
        ttr.l("Upload active account header thumbnail could not be loaded.");
        this.a.an.setBackgroundResource(2131232282);
    }
    
    public final void b(final ImageView imageView) {
        this.a.an.setBackground((Drawable)null);
    }
}
