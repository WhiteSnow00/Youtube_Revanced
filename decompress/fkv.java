import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

class fkv extends BroadcastReceiver
{
    private volatile boolean a;
    private final Object b;
    
    public fkv() {
        this.a = false;
        this.b = new Object();
    }
    
    protected final void a(final Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((fkz)aqsz.o(context)).wI((fky)this);
                    this.a = true;
                }
            }
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        this.a(context);
    }
}
