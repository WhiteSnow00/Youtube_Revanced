import android.graphics.Bitmap;
import android.view.View;
import com.google.protos.youtube.api.innertube.WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand;
import java.util.Map;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gos implements vau
{
    public boolean a;
    private final wwu b;
    private final vax c;
    
    public gos(final wwu b, final vax c, final uyi uyi, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        mrm.C((Callable)new exk(this, uyi, 13));
    }
    
    public final void mE(aioe aioe, final Map map) {
        if (!((agzd)aioe).rs((agyr)WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.watchNextWatchEndpointMutationCommand)) {
            return;
        }
        if ((aioe = ((WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand)((agzd)aioe).rr((agyr)WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.watchNextWatchEndpointMutationCommand)).b) == null) {
            aioe = aioe.a;
        }
        if (map != null) {
            final View view = map.get("com.google.android.libraries.youtube.rendering.elements.sender_view");
            final boolean a = this.a;
            if (view != null) {
                final View j = fbp.j(view);
                if (j != null) {
                    map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", j);
                    final aorm k = fbp.k(j.getTag(2131428821));
                    if (k != null) {
                        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", k);
                    }
                    if (a) {
                        final Bitmap i = fbp.i(j);
                        if (i != null) {
                            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_BITMAP_KEY", i);
                        }
                    }
                }
            }
        }
        aioe = this.b.n().f(aioe);
        this.c.c(aioe, map);
    }
}
