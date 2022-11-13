import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.logging.api.VREventParcelable;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ared extends enz implements aree
{
    public ared(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
    }
    
    public final void a(final VREventParcelable vrEventParcelable) {
        final Parcel qw = this.qW();
        eob.h(qw, (Parcelable)vrEventParcelable);
        this.qZ(2, qw);
    }
}
