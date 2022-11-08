import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzz extends aeau
{
    final /* synthetic */ aeae a;
    final /* synthetic */ aeah b;
    final /* synthetic */ aeac c;
    final /* synthetic */ nmo d;
    
    public adzz(final aeac c, final nmo nmo, final aeae a, final aeah b, final nmo d, final byte[] array) {
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
            final String b = c.b;
            final aeae a = this.a;
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
            final aeak aeak = new aeak(this.c, this.b);
            final Parcel qq = ((eny)aeaj).qQ();
            qq.writeString(b);
            eoa.h(qq, (Parcelable)bundle);
            eoa.j(qq, (IInterface)aeak);
            ((eny)aeaj).qT(1, qq);
        }
        catch (final RemoteException ex) {
            aeac.c.l((Throwable)ex, "show overlay display from: %s", new Object[] { this.c.b });
            this.d.d((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
