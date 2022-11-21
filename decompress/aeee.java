import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeee extends eod implements IInterface
{
    final aedw a;
    private final aeeb b;
    
    public aeee() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }
    
    public aeee(final aedw a, final aeeb b) {
        this.a = a;
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.b = b;
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        if (int1 == 1) {
            final Bundle bundle = (Bundle)eoe.a(parcel, Bundle.CREATOR);
            this.enforceNoDataAvail(parcel);
            int1 = bundle.getInt("statusCode", 8150);
            final String string = bundle.getString("sessionToken");
            final aedz a = aeea.a();
            a.b(int1);
            if (string != null) {
                a.c = string;
            }
            this.b.b(a.a());
            if (int1 == 8157) {
                final aeex a2 = this.a.a;
                if (a2 != null) {
                    a2.d();
                }
            }
            return true;
        }
        return false;
    }
}
