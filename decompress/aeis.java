import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeis extends eoc implements IInterface
{
    public aeis(final IBinder binder) {
        super(binder, "com.google.android.youtube.player.internal.IConnectionCallbacks");
    }
    
    public final void a(final String s, final IBinder binder) {
        final Parcel qv = this.qV();
        qv.writeString(s);
        qv.writeStrongBinder(binder);
        this.qX(1, qv);
    }
}
