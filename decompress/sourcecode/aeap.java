import android.os.Parcel;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeap extends aeau
{
    final /* synthetic */ aear a;
    final /* synthetic */ nmo b;
    
    public aeap(final aear a, final nmo nmo, final nmo b, final byte[] array) {
        this.a = a;
        this.b = b;
        super(nmo, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aear a = this.a;
            final adzo adzo = (adzo)a.a.k;
            final String b = a.b;
            final Bundle a2 = aeas.a();
            final aeaq aeaq = new aeaq(this.a, this.b, null);
            final Parcel qq = ((eny)adzo).qQ();
            qq.writeString(b);
            eoa.h(qq, (Parcelable)a2);
            eoa.j(qq, (IInterface)aeaq);
            ((eny)adzo).qT(2, qq);
        }
        catch (final RemoteException ex) {
            aear.c.l((Throwable)ex, "error requesting in-app review for %s", new Object[] { this.a.b });
            this.b.d((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
