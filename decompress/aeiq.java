import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeiq extends eoc implements IInterface
{
    public aeiq(final IBinder binder) {
        super(binder, "com.google.android.youtube.player.internal.IAsyncResultCallback");
    }
    
    public final void a(final long n) {
        final Parcel qv = this.qV();
        qv.writeLong(n);
        this.qX(2, qv);
    }
}
