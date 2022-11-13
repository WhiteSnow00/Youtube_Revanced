import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;
import android.os.Bundle;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class dt extends Handler
{
    boolean a;
    final du b;
    
    public dt(final du b, final Looper looper) {
        this.b = b;
        super(looper);
        this.a = false;
    }
    
    public final void handleMessage(final Message message) {
        if (!this.a) {
            return;
        }
        switch (message.what) {
            default: {
                return;
            }
            case 12: {
                ((Integer)message.obj).intValue();
                return;
            }
            case 11: {
                ((Boolean)message.obj).booleanValue();
                return;
            }
            case 9: {
                ((Integer)message.obj).intValue();
                return;
            }
            case 8: {
                this.b.c();
                return;
            }
            case 7: {
                eg.c((Bundle)message.obj);
                return;
            }
            case 6: {
                final CharSequence charSequence = (CharSequence)message.obj;
                return;
            }
            case 5: {
                final List list = (List)message.obj;
                return;
            }
            case 4: {
                final ef ef = (ef)message.obj;
                return;
            }
            case 3: {
                this.b.a((MediaMetadataCompat)message.obj);
                return;
            }
            case 2: {
                this.b.b((PlaybackStateCompat)message.obj);
                return;
            }
            case 1: {
                eg.c(message.getData());
                final String s = (String)message.obj;
            }
        }
    }
}
