import android.os.Bundle;
import android.media.session.MediaSession;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class ee extends ed
{
    public ee(final Context context, final String s) {
        super(context, s);
    }
    
    public final MediaSession t(final Context context, final String s) {
        return new MediaSession(context, s, (Bundle)null);
    }
}
