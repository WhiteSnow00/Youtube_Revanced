import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.List;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public interface aabo
{
    WatchNextResponseModel a(final WatchNextResponseModel p0, final Context p1, final zyx p2, final List p3, final int p4, final byte[] p5, final ahvo p6);
    
    WatchNextResponseModel b(final Context p0, final zzg p1, final byte[] p2);
    
    WatchNextResponseModel c(final Context p0, final zyx p1, final List p2, final int p3, final byte[] p4, final ahvo p5);
    
    WatchNextResponseModel g(final WatchNextResponseModel p0, final Context p1, final zyx p2, final List p3, final int p4, final PlaybackStartDescriptor p5, final ahvo p6);
    
    WatchNextResponseModel h(final Context p0, final zzg p1, final PlaybackStartDescriptor p2);
    
    WatchNextResponseModel i(final Context p0, final zyx p1, final List p2, final int p3, final PlaybackStartDescriptor p4, final ahvo p5);
    
    aioe j(final String p0, final String p1, final int p2, final PlaybackStartDescriptor p3);
    
    void o();
}
