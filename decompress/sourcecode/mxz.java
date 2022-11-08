import android.os.Parcel;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class mxz extends enz implements IInterface
{
    public mxz() {
        super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
    }
    
    public void a(final Status status, final GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        throw new UnsupportedOperationException();
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final Status status = (Status)eoa.a(parcel, Status.CREATOR);
            final GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse)eoa.a(parcel, GmsDeviceComplianceResponse.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.a(status, gmsDeviceComplianceResponse);
            return true;
        }
        return false;
    }
}
