import com.google.android.apps.youtube.embeddedplayer.service.EmbedsBackgroundTaskWorker;
import androidx.work.WorkerParameters;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loi extends cnd
{
    public final cmq a(final Context context, final String s, final WorkerParameters workerParameters) {
        if (aeda.y(s, EmbedsBackgroundTaskWorker.a)) {
            return (cmq)new EmbedsBackgroundTaskWorker(context, workerParameters);
        }
        return null;
    }
}
