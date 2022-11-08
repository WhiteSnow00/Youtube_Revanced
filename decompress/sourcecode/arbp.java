import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.logging.api.VREventParcelable;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbp extends eny implements arbq
{
    public arbp(final IBinder binder) {
        super(binder, "com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
    }
    
    public final void a(final VREventParcelable vrEventParcelable) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)vrEventParcelable);
        this.qT(2, qq);
    }
}
