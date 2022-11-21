import android.os.Parcel;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeej extends aeeo
{
    final aeel a;
    final noj b;
    
    public aeej(final aeel a, final noj noj, final noj b, final byte[] array) {
        this.a = a;
        this.b = b;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        try {
            final aeel a = this.a;
            final aedi aedi = (aedi)a.a.k;
            final String b = a.b;
            final Bundle a2 = aeem.a();
            final aeek aeek = new aeek(this.a, this.b, null);
            final Parcel qv = ((eoc)aedi).qV();
            qv.writeString(b);
            eoe.h(qv, (Parcelable)a2);
            eoe.j(qv, (IInterface)aeek);
            ((eoc)aedi).qY(2, qv);
        }
        catch (final RemoteException ex) {
            aeel.c.i((Throwable)ex, "error requesting in-app review for %s", this.a.b);
            this.b.c((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
