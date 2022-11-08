import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nau extends eny implements IInterface
{
    public nau(final IBinder binder) {
        super(binder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }
    
    public final void a(final LocationRequestUpdateData locationRequestUpdateData) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)locationRequestUpdateData);
        this.qS(59, qq);
    }
}
