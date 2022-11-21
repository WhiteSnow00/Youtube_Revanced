import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeir extends eoc implements IInterface
{
    public aeir(final IBinder binder) {
        super(binder, "com.google.android.youtube.player.internal.IAuthenticationEventListener");
    }
    
    public final void a(final int n) {
        final Parcel qv = this.qV();
        qv.writeInt(n);
        this.qX(1, qv);
    }
}
