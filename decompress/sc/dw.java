import android.os.ResultReceiver;
import android.os.Bundle;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
import android.media.session.MediaSession$Token;
import java.util.ArrayList;
import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.HashMap;
import java.util.List;
import android.media.session.MediaController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dw
{
    public final MediaController a;
    public final Object b;
    public final List c;
    public final HashMap d;
    public final MediaSessionCompat$Token e;
    
    public dw(final Context context, final MediaSessionCompat$Token e) {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = e;
        final MediaController a = new MediaController(context, (MediaSession$Token)e.b);
        this.a = a;
        if (e.a() == null) {
            a.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle)null, (ResultReceiver)new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(this));
        }
    }
}
