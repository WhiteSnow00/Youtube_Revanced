import android.os.Parcel;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class adzg extends aeau
{
    final /* synthetic */ String a;
    final /* synthetic */ adzj b;
    final /* synthetic */ nmo c;
    
    public adzg(final adzj b, final nmo nmo, final nmo c, final String a, final byte[] array) {
        this.b = b;
        this.c = c;
        this.a = a;
        super(nmo, (byte[])null);
    }
    
    protected final void a() {
        try {
            final adzj b = this.b;
            final adzk adzk = (adzk)b.a.k;
            final String b2 = b.b;
            final Bundle b3 = adzj.b();
            final adzh adzh = new adzh(this.b, this.c, null);
            final Parcel qq = ((eny)adzk).qQ();
            qq.writeString(b2);
            eoa.h(qq, (Parcelable)b3);
            eoa.j(qq, (IInterface)adzh);
            ((eny)adzk).qT(3, qq);
        }
        catch (final RemoteException ex) {
            adzj.e.l((Throwable)ex, "completeUpdate(%s)", new Object[] { this.a });
            this.c.d((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
