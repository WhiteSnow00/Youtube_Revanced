import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedt extends aeeo
{
    final aedy a;
    final aeeb b;
    final aedw c;
    final noj d;
    
    public aedt(final aedw c, final noj noj, final aedy a, final aeeb b, final noj d, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        try {
            final aedw c = this.c;
            final aeed aeed = (aeed)c.a.k;
            final String b = c.b;
            final aedy a = this.a;
            final Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", a.a);
            bundle.putString("adFieldEnifd", (String)null);
            bundle.putInt("layoutGravity", a.d);
            bundle.putFloat("layoutVerticalMargin", a.e);
            bundle.putInt("displayMode", a.f);
            bundle.putInt("windowWidthPx", a.g);
            bundle.putBoolean("stableSessionToken", a.b);
            bundle.putString("callerPackage", b);
            final String c2 = a.c;
            if (c2 != null) {
                bundle.putString("appId", c2);
            }
            final aeee aeee = new aeee(this.c, this.b);
            final Parcel qv = aeed.qV();
            qv.writeString(b);
            eoe.h(qv, (Parcelable)bundle);
            eoe.j(qv, (IInterface)aeee);
            aeed.qY(1, qv);
        }
        catch (final RemoteException ex) {
            aedw.c.i((Throwable)ex, "show overlay display from: %s", this.c.b);
            this.d.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
