import com.google.android.libraries.youtube.upload.service.UploadService;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.SegmentProcessingService;
import android.app.Service;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adob extends Binder
{
    public final Service a;
    
    public adob(final SegmentProcessingService a) {
        this.a = (Service)a;
    }
    
    public adob(final UploadService a) {
        this.a = (Service)a;
    }
}
