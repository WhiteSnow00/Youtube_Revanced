import android.os.Parcel;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aebi extends aecw
{
    final String a;
    final aebl b;
    final nns c;
    
    public aebi(final aebl b, final nns nns, final nns c, final String a, final byte[] array) {
        this.b = b;
        this.c = c;
        this.a = a;
        super(nns, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aebl b = this.b;
            final aebm aebm = (aebm)b.a.k;
            final String b2 = b.b;
            final Bundle b3 = aebl.b();
            final aebj aebj = new aebj(this.b, this.c, null);
            final Parcel qw = ((enz)aebm).qW();
            qw.writeString(b2);
            eob.h(qw, (Parcelable)b3);
            eob.j(qw, (IInterface)aebj);
            ((enz)aebm).qZ(3, qw);
        }
        catch (final RemoteException ex) {
            aebl.d.k((Throwable)ex, "completeUpdate(%s)", this.a);
            this.c.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
