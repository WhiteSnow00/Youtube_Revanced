import android.os.IBinder;
import android.content.ComponentName;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mom implements ServiceConnection
{
    public boolean a;
    public final BlockingQueue b;
    private final /* synthetic */ int c;
    
    public mom(final int c) {
        this.c = c;
        this.a = false;
        this.b = new LinkedBlockingQueue();
    }
    
    public mom(final int c, final byte[] array) {
        this.c = c;
        this.a = false;
        this.b = new LinkedBlockingQueue();
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        Label_0018: {
            if (this.c == 0) {
                break Label_0018;
            }
            try {
                this.b.put(binder);
                return;
                this.b.add(binder);
            }
            catch (final InterruptedException ex) {}
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}
