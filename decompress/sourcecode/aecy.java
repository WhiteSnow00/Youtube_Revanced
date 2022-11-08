import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class aecy implements ServiceConnection
{
    final /* synthetic */ aecz a;
    
    public aecy(final aecz a) {
        this.a = a;
    }
    
    public final void onBindingDied(final ComponentName componentName) {
        this.a.b(new ardu(7));
    }
    
    public final void onNullBinding(final ComponentName componentName) {
        this.a.b(new ardu(6));
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        int n;
        if (binder == null) {
            aecz.c.e("Binder is null when onServiceConnected was called!");
            n = 5;
        }
        else {
            n = 4;
        }
        final aecz a = this.a;
        aecn aecn;
        if (binder == null) {
            aecn = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            if (queryLocalInterface instanceof aecn) {
                aecn = (aecn)queryLocalInterface;
            }
            else {
                aecn = new aecn(binder);
            }
        }
        a.b(new ardu(n, aecn));
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.a.b(new ardu(5));
    }
}
