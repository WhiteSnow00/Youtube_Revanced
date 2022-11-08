import android.os.Message;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kar extends Handler
{
    final WeakReference a;
    
    public kar(final InlinePlaybackController inlinePlaybackController) {
        this.a = new WeakReference((T)inlinePlaybackController);
    }
    
    public final void handleMessage(final Message message) {
        final InlinePlaybackController inlinePlaybackController = (InlinePlaybackController)this.a.get();
        if (inlinePlaybackController != null) {
            if (message.what == 1) {
                ((fjp)inlinePlaybackController.d.a()).j();
                final fkk a = fkk.a;
            }
        }
    }
}
