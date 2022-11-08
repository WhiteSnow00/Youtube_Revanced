import android.os.Parcel;
import android.os.Bundle;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class adzp extends enz implements IInterface
{
    final /* synthetic */ aear a;
    public final nmo b;
    
    public adzp(final aear a, final nmo b, final byte[] array) {
        this.a = a;
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.b = b;
    }
    
    public void a(final Bundle bundle) {
        final aebd a = this.a.a;
        if (a != null) {
            a.g(this.b);
        }
    }
    
    protected final boolean dispatchTransaction(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 2) {
            final Bundle bundle = (Bundle)eoa.a(parcel, Bundle.CREATOR);
            this.enforceNoDataAvail(parcel);
            this.a(bundle);
            return true;
        }
        return false;
    }
}
