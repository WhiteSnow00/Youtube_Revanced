import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exf extends BroadcastReceiver
{
    public final Context a;
    public boolean b;
    private final blt c;
    
    public exf(final Context a, final blt c, final byte[] array, final byte[] array2) {
        this.b = false;
        this.c = c;
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.c.g();
    }
}
