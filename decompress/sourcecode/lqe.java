import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqe extends eny implements IInterface
{
    public lqe(final IBinder binder) {
        super(binder, "com.google.android.auth.IAuthManagerService");
    }
    
    public final int a(final HasCapabilitiesRequest hasCapabilitiesRequest) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)hasCapabilitiesRequest);
        final Parcel qr = this.qR(9, qq);
        final int int1 = qr.readInt();
        qr.recycle();
        return int1;
    }
}
