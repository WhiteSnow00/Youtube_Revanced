import java.util.Iterator;
import androidx.mediarouter.app.MediaRouteButton;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cax extends BroadcastReceiver
{
    public final Context a;
    public boolean b;
    public final List c;
    
    public cax(final Context a) {
        this.b = true;
        this.a = a;
        this.c = new ArrayList();
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            final boolean b = intent.getBooleanExtra("noConnectivity", false) ^ true;
            if (this.b != b) {
                this.b = b;
                final Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    ((MediaRouteButton)iterator.next()).b();
                }
            }
        }
    }
}
