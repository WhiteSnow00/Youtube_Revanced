import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cpu extends cpw
{
    private final BroadcastReceiver e;
    
    public cpu(final Context context, final ajb ajb, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, ajb, null, null, null);
        this.e = new cpt(this);
    }
    
    public abstract IntentFilter a();
    
    public abstract void c(final Intent p0);
    
    @Override
    public final void d() {
        cms.a();
        final int a = cpv.a;
        this.getClass().getSimpleName();
        super.a.registerReceiver(this.e, this.a());
    }
    
    @Override
    public final void e() {
        cms.a();
        final int a = cpv.a;
        this.getClass().getSimpleName();
        super.a.unregisterReceiver(this.e);
    }
}
