import com.google.vr.vrcore.common.api.HeadTrackingState;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface arga extends IInterface
{
    void applyColorfulFade(final int p0, final long p1, final int p2);
    
    void applyFade(final int p0, final long p1);
    
    void deprecated_setLensOffsets(final float p0, final float p1, final float p2, final float p3);
    
    void dumpDebugData();
    
    void invokeCloseAction();
    
    void recenterHeadTracking();
    
    HeadTrackingState requestStopTracking();
    
    void resumeHeadTracking(final HeadTrackingState p0);
    
    void setLensOffset(final float p0, final float p1, final float p2);
}
