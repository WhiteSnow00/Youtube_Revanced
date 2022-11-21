import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class aegs implements ServiceConnection
{
    final aegt a;
    
    public aegs(final aegt a) {
        this.a = a;
    }
    
    public final void onBindingDied(final ComponentName componentName) {
        this.a.b(new arjd(7));
    }
    
    public final void onNullBinding(final ComponentName componentName) {
        this.a.b(new arjd(6));
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        int n;
        if (binder == null) {
            aegt.c.f("Binder is null when onServiceConnected was called!");
            n = 5;
        }
        else {
            n = 4;
        }
        final aegt a = this.a;
        aegh aegh;
        if (binder == null) {
            aegh = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            if (queryLocalInterface instanceof aegh) {
                aegh = (aegh)queryLocalInterface;
            }
            else {
                aegh = new aegh(binder);
            }
        }
        a.b(new arjd(n, aegh));
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.a.b(new arjd(5));
    }
}
