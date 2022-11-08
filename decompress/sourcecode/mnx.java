import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.data.DataHolder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class mnx extends enz implements IInterface
{
    public mnx() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }
    
    public void a(final Status status) {
        throw new UnsupportedOperationException();
    }
    
    public void b(final Status status) {
        throw new UnsupportedOperationException();
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 8: {
                final Status status = (Status)eoa.a(parcel, Status.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a(status);
                break;
            }
            case 7: {
                final DataHolder dataHolder = (DataHolder)eoa.a(parcel, DataHolder.CREATOR);
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 6: {
                final Status status2 = (Status)eoa.a(parcel, Status.CREATOR);
                final LogEventParcelable[] array = (LogEventParcelable[])parcel.createTypedArray(LogEventParcelable.CREATOR);
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 5: {
                final Status status3 = (Status)eoa.a(parcel, Status.CREATOR);
                parcel.readLong();
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 4: {
                final Status status4 = (Status)eoa.a(parcel, Status.CREATOR);
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 3: {
                final Status status5 = (Status)eoa.a(parcel, Status.CREATOR);
                parcel.readLong();
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 2: {
                final Status status6 = (Status)eoa.a(parcel, Status.CREATOR);
                this.enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            }
            case 1: {
                final Status status7 = (Status)eoa.a(parcel, Status.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.b(status7);
                break;
            }
        }
        return true;
    }
}
