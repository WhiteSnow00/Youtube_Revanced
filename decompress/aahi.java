import com.google.android.libraries.youtube.creation.publish.ClientSideRenderingService;
import android.app.Service;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aahi extends Binder
{
    public final Service a;
    
    public aahi(final aahj a) {
        this.a = a;
    }
    
    public aahi(final ClientSideRenderingService a) {
        this.a = (Service)a;
    }
}
