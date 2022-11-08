import com.google.android.libraries.youtube.creation.publish.ClientSideRenderingService;
import android.app.Service;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aadp extends Binder
{
    public final /* synthetic */ Service a;
    
    public aadp(final aadq a) {
        this.a = (Service)a;
    }
    
    public aadp(final ClientSideRenderingService a) {
        this.a = (Service)a;
    }
}
