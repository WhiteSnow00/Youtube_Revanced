import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aq implements IInterface
{
    public final IBinder a;
    
    public aq(final IBinder a) {
        this.a = a;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
