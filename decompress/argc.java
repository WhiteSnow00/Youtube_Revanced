import android.os.Bundle;
import android.app.PendingIntent;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import android.content.ComponentName;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface argc extends IInterface
{
    int a(final ComponentName p0, final HeadTrackingState p1);
    
    int b(final ComponentName p0, final int p1, final PendingIntent p2, final HeadTrackingState p3);
    
    int g(final Bundle p0, final HeadTrackingState p1);
    
    void h();
    
    void i(final PendingIntent p0);
    
    void j();
    
    boolean k(final PendingIntent p0);
    
    boolean l(final Bundle p0);
    
    boolean m();
    
    boolean n(final arge p0);
    
    void o(final PendingIntent p0, final ComponentName p1);
    
    void p(final ComponentName p0, final arga p1);
    
    void q(final ComponentName p0);
}
