import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import android.content.Context;
import android.os.FileObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewf extends FileObserver
{
    final /* synthetic */ Context a;
    
    public ewf(final String s, final Context a) {
        this.a = a;
        super(s);
    }
    
    public final void onEvent(final int n, final String s) {
        if (n == 2) {
            YouTubeBackupAgent.e(this.a);
        }
    }
}
