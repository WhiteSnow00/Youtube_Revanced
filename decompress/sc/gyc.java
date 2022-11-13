import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.android.libraries.youtube.edit.camera.ProgressBarData;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyc
{
    public static boolean a(final View view) {
        return view != null && view.getVisibility() == 0;
    }
    
    public static ukn b() {
        final ukn e = ProgressBarData.e();
        e.c(2131102091);
        e.b(2131493099);
        e.e(2131102090);
        return e;
    }
    
    public static ukn c(final arbl arbl) {
        final ukn e = ProgressBarData.e();
        final arbl a = arbl.a;
        final int ordinal = arbl.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                e.c(2131102095);
                e.e(2131102094);
                return e;
            }
            if (ordinal != 3 && ordinal != 4) {
                return e;
            }
        }
        e.c(2131102093);
        e.e(2131102097);
        return e;
    }
    
    public static aotp d(final aiqj aiqj, final acgs acgs) {
        final aotp aotp = null;
        final aotp aotp2 = null;
        aotp aotp3 = aotp;
        if (aiqj != null) {
            aotp3 = aotp;
            if (((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                aotp aotp4;
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x80) != 0x0) {
                    if ((aotp4 = reelWatchEndpointOuterClass$ReelWatchEndpoint.i) == null) {
                        aotp4 = aotp.a;
                    }
                }
                else {
                    aotp4 = null;
                }
                if (aotp4 == null) {
                    aotp4 = aotp2;
                    if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x80) != 0x0) {
                        if ((aotp4 = reelWatchEndpointOuterClass$ReelWatchEndpoint.i) == null) {
                            aotp4 = aotp.a;
                        }
                    }
                }
                if ((aotp3 = aotp4) != null) {
                    final int size = aotp4.c.size();
                    int d = 1;
                    int e;
                    if (size > 0) {
                        e = ((aoto)aotp4.c.get(0)).e;
                    }
                    else {
                        e = 1;
                    }
                    if (aotp4.c.size() > 0) {
                        d = ((aoto)aotp4.c.get(0)).d;
                    }
                    acgs.m(aotp4, d, e);
                    aotp3 = aotp4;
                }
            }
        }
        return aotp3;
    }
    
    public static void e(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
}
