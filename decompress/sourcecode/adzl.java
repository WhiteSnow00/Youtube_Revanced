import android.os.Parcel;
import android.os.Bundle;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class adzl extends enz implements IInterface
{
    final /* synthetic */ adzj b;
    public final nmo c;
    
    public adzl(final adzj b, final nmo c, final byte[] array) {
        this.b = b;
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.c = c;
    }
    
    public void a(final Bundle bundle) {
        this.b.a.g(this.c);
    }
    
    public void b(final Bundle bundle) {
        this.b.a.g(this.c);
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 2) {
            if (n != 3) {
                return false;
            }
            final Bundle bundle = (Bundle)eoa.a(parcel, Bundle.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.a(bundle);
        }
        else {
            final Bundle bundle2 = (Bundle)eoa.a(parcel, Bundle.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.b(bundle2);
        }
        return true;
    }
}
