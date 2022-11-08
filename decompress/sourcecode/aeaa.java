import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeaa extends aeau
{
    final /* synthetic */ adzx a;
    final /* synthetic */ aeah b;
    final /* synthetic */ aeac c;
    final /* synthetic */ nmo d;
    
    public aeaa(final aeac c, final nmo nmo, final adzx a, final aeah b, final nmo d, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        super(nmo, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aeac c = this.c;
            final aeaj aeaj = (aeaj)c.a.k;
            final adzx a = this.a;
            final String b = c.b;
            final Bundle bundle = new Bundle();
            bundle.putString("sessionToken", a.a);
            bundle.putString("callerPackage", b);
            bundle.putString("appId", a.b);
            final aeak aeak = new aeak(this.c, this.b);
            final Parcel qq = ((eny)aeaj).qQ();
            eoa.h(qq, (Parcelable)bundle);
            eoa.j(qq, (IInterface)aeak);
            ((eny)aeaj).qT(2, qq);
        }
        catch (final RemoteException ex) {
            aeac.c.l((Throwable)ex, "dismiss overlay display from: %s", new Object[] { this.c.b });
            this.d.d((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
