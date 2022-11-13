import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecb extends aecw
{
    final aecg a;
    final aecj b;
    final aece c;
    final nns d;
    
    public aecb(final aece c, final nns nns, final aecg a, final aecj b, final nns d, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        super(nns, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aece c = this.c;
            final aecl aecl = (aecl)c.a.k;
            final String b = c.b;
            final aecg a = this.a;
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
            final aecm aecm = new aecm(this.c, this.b);
            final Parcel qw = ((enz)aecl).qW();
            qw.writeString(b);
            eob.h(qw, (Parcelable)bundle);
            eob.j(qw, (IInterface)aecm);
            ((enz)aecl).qZ(1, qw);
        }
        catch (final RemoteException ex) {
            aece.c.k((Throwable)ex, "show overlay display from: %s", this.c.b);
            this.d.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
