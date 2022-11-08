import java.util.Iterator;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import java.util.HashMap;
import java.util.Map;
import android.graphics.Bitmap;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kax
{
    public final Handler a;
    public final aank b;
    public final aioe c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public Runnable g;
    public final kep h;
    
    public kax(final Handler a, final aank b, final kep h, final aioe c, final boolean d, final boolean f, final boolean e, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    public static Runnable a(final aioe aioe, final Bitmap bitmap, final vax vax, final wwv wwv, final Map map, final acif acif) {
        final HashMap hashMap = new HashMap(map);
        acif.pB(hashMap);
        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", wwv);
        if (bitmap != null) {
            hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_BITMAP_KEY", bitmap);
        }
        return (Runnable)new joq(wwv, aioe, vax, (Map)hashMap, 6);
    }
    
    public static String b(final aioe aioe) {
        return abhz.e(d(aioe));
    }
    
    private static aioe d(final aioe aioe) {
        if (((agzd)aioe).rs((agyr)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
            for (final aioe aioe2 : ((CommandExecutorCommandOuterClass$CommandExecutorCommand)((agzd)aioe).rr((agyr)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b) {
                if (((agzd)aioe2).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                    return aioe2;
                }
            }
        }
        return aioe;
    }
    
    final boolean c(final gle gle) {
        if (gle == null) {
            return false;
        }
        final aioe d = d(this.c);
        final aioe d2 = gle.d();
        d2.getClass();
        return abhz.h(d, d2) && this.f && this.d;
    }
}
