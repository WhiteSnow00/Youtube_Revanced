import com.google.android.libraries.youtube.upload.service.UploadService;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.SegmentProcessingService;
import android.app.Service;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admn extends Binder
{
    public final Service a;
    
    public admn(final SegmentProcessingService a) {
        this.a = (Service)a;
    }
    
    public admn(final UploadService a) {
        this.a = a;
    }
}
