import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeab extends aeau
{
    final /* synthetic */ aeai a;
    final /* synthetic */ int b;
    final /* synthetic */ aeah c;
    final /* synthetic */ aeac d;
    final /* synthetic */ nmo e;
    
    public aeab(final aeac d, final nmo nmo, final aeai a, final int b, final aeah c, final nmo e, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        super(nmo, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aeac d = this.d;
            final aeaj aeaj = (aeaj)d.a.k;
            final aeai a = this.a;
            final String b = d.b;
            final int b2 = this.b;
            final Bundle bundle = new Bundle();
            bundle.putString("sessionToken", a.a);
            bundle.putInt("displayMode", b2);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", a.b);
            final aeak aeak = new aeak(this.d, this.c);
            final Parcel qq = ((eny)aeaj).qQ();
            eoa.h(qq, (Parcelable)bundle);
            eoa.j(qq, (IInterface)aeak);
            ((eny)aeaj).qT(3, qq);
        }
        catch (final RemoteException ex) {
            aeac.c.l((Throwable)ex, "switchDisplayMode overlay display to %d from: %s", new Object[] { this.b, this.d.b });
            this.e.d((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
