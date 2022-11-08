import android.content.Intent;
import com.google.android.apps.youtube.app.common.command.androidshareintent.ShareLoggingBroadcastReceiver;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public class fbx extends BroadcastReceiver
{
    private volatile boolean a;
    private final Object b;
    
    public fbx() {
        this.a = false;
        this.b = new Object();
    }
    
    public final void a(final Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((fby)aqqn.o(context)).wL((ShareLoggingBroadcastReceiver)this);
                    this.a = true;
                }
            }
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        this.a(context);
    }
}
