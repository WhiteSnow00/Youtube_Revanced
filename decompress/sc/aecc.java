import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecc extends aecw
{
    final aebz a;
    final aecj b;
    final aece c;
    final nns d;
    
    public aecc(final aece c, final nns nns, final aebz a, final aecj b, final nns d, final byte[] array) {
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
            final aebz a = this.a;
            final String b = c.b;
            final Bundle bundle = new Bundle();
            bundle.putString("sessionToken", a.a);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", a.b);
            final aecm aecm = new aecm(this.c, this.b);
            final Parcel qw = ((enz)aecl).qW();
            eob.h(qw, (Parcelable)bundle);
            eob.j(qw, (IInterface)aecm);
            ((enz)aecl).qZ(2, qw);
        }
        catch (final RemoteException ex) {
            aece.c.k((Throwable)ex, "dismiss overlay display from: %s", this.c.b);
            this.d.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
