import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aecd extends aecw
{
    final aeck a;
    final int b;
    final aecj c;
    final aece d;
    final nns e;
    
    public aecd(final aece d, final nns nns, final aeck a, final int b, final aecj c, final nns e, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        super(nns, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aece d = this.d;
            final aecl aecl = (aecl)d.a.k;
            final aeck a = this.a;
            final String b = d.b;
            final int b2 = this.b;
            final Bundle bundle = new Bundle();
            bundle.putString("sessionToken", a.a);
            bundle.putInt("displayMode", b2);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", a.b);
            final aecm aecm = new aecm(this.d, this.c);
            final Parcel qw = ((enz)aecl).qW();
            eob.h(qw, (Parcelable)bundle);
            eob.j(qw, (IInterface)aecm);
            ((enz)aecl).qZ(3, qw);
        }
        catch (final RemoteException ex) {
            aece.c.k((Throwable)ex, "switchDisplayMode overlay display to %d from: %s", this.b, this.d.b);
            this.e.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
