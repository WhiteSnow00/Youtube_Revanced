import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cpt extends cpv
{
    private final BroadcastReceiver e;
    
    public cpt(final Context context, final aja aja, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, aja, (byte[])null, (byte[])null, (byte[])null);
        this.e = (BroadcastReceiver)new cps(this);
    }
    
    public abstract IntentFilter a();
    
    public abstract void c(final Intent p0);
    
    public final void d() {
        cmr.a();
        final int a = cpu.a;
        this.getClass().getSimpleName();
        super.a.registerReceiver(this.e, this.a());
    }
    
    public final void e() {
        cmr.a();
        final int a = cpu.a;
        this.getClass().getSimpleName();
        super.a.unregisterReceiver(this.e);
    }
}
