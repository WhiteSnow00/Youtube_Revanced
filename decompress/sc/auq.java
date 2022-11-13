import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public class auq extends Service implements aun
{
    private final cdo a;
    
    public auq() {
        this.a = new cdo((aun)this);
    }
    
    public final aui getLifecycle() {
        return (aui)this.a.a;
    }
    
    public final IBinder onBind(final Intent intent) {
        this.a.a(aug.ON_START);
        return null;
    }
    
    public void onCreate() {
        this.a.a(aug.ON_CREATE);
        super.onCreate();
    }
    
    public void onDestroy() {
        final cdo a = this.a;
        a.a(aug.ON_STOP);
        a.a(aug.ON_DESTROY);
        super.onDestroy();
    }
    
    public final void onStart(final Intent intent, final int n) {
        this.a.a(aug.ON_START);
        super.onStart(intent, n);
    }
}
