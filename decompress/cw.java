import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cw implements IInterface
{
    public final IBinder a;
    
    public cw(final IBinder a) {
        this.a = a;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
