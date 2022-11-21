import android.os.Parcel;
import android.os.Bundle;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class aefw extends eod implements IInterface
{
    final aefq a;
    public final noj b;
    
    public aefw(final aefq a, final noj b, final byte[] array) {
        this.a = a;
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        this.b = b;
    }
    
    public void a(final int n, final Bundle bundle) {
        this.a.b.g(this.b);
    }
    
    protected final boolean dispatchTransaction(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 13: {
                final Bundle bundle = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 12: {
                final Bundle bundle2 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 11: {
                final Bundle bundle3 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 10: {
                final Bundle bundle4 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 9: {
                final Bundle bundle5 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 8: {
                final Bundle bundle6 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 7: {
                parcel.createTypedArrayList(Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 6: {
                final Bundle bundle7 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                n = bundle7.getInt("error_code");
                aefq.c.h("onError(%d)", n);
                this.b.c((Exception)new aefh(n));
                break;
            }
            case 5: {
                parcel.readInt();
                final Bundle bundle8 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 4: {
                parcel.readInt();
                final Bundle bundle9 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 3: {
                parcel.readInt();
                final Bundle bundle10 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a.b.g(this.b);
                break;
            }
            case 2: {
                n = parcel.readInt();
                final Bundle bundle11 = (Bundle)eoe.a(parcel, Bundle.CREATOR);
                this.enforceNoDataAvail(parcel);
                this.a(n, bundle11);
                break;
            }
        }
        return true;
    }
}
