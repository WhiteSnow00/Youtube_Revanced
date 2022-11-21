import android.content.Intent;
import android.content.Context;
import android.os.Environment;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaib extends BroadcastReceiver
{
    aaia a;
    private volatile boolean b;
    
    public aaib() {
        this.b = Environment.getExternalStorageState().equals("mounted");
        this.a = null;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.b = "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction());
        final aaia a = this.a;
        if (a != null) {
            a.m();
        }
    }
}
