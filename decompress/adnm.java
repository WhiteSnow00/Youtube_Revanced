import android.os.Environment;
import android.content.IntentFilter;
import android.content.Context;
import android.app.Application;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnm extends adnf
{
    private static final adnr b;
    private final BroadcastReceiver c;
    private final Application d;
    
    static {
        b = adnr.a(2);
    }
    
    public adnm(final Context context) {
        super(2);
        this.c = new adnl(this);
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
    
    public final adnr g() {
        final String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            return adnr.a;
        }
        adnr adnr;
        if ("mounted_ro".equals(externalStorageState)) {
            adnr = adnr.a;
        }
        else {
            adnr = adnm.b;
        }
        return adnr;
    }
}
