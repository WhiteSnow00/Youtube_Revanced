import android.os.Environment;
import android.content.IntentFilter;
import android.content.Context;
import android.app.Application;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjx extends adjq
{
    private static final adkc b;
    private final BroadcastReceiver c;
    private final Application d;
    
    static {
        b = adkc.a(2);
    }
    
    public adjx(final Context context) {
        super(2);
        this.c = (BroadcastReceiver)new adjw(this);
        context.getClass();
        this.d = (Application)context.getApplicationContext();
    }
    
    protected final void e() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.d.registerReceiver(this.c, intentFilter);
    }
    
    protected final void f() {
        this.d.unregisterReceiver(this.c);
    }
    
    public final adkc g() {
        final String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            return adkc.a;
        }
        adkc adkc;
        if ("mounted_ro".equals(externalStorageState)) {
            adkc = adkc.a;
        }
        else {
            adkc = adjx.b;
        }
        return adkc;
    }
}
