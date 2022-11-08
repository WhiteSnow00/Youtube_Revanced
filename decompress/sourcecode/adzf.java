import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class adzf extends aeau
{
    final /* synthetic */ String a;
    final /* synthetic */ adzj b;
    final /* synthetic */ nmo c;
    
    public adzf(final adzj b, final nmo nmo, final String a, final nmo c, final byte[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
        super(nmo, (byte[])null);
    }
    
    protected final void a() {
        try {
            final adzj b = this.b;
            final adzk adzk = (adzk)b.a.k;
            final String b2 = b.b;
            final String a = this.a;
            final Bundle bundle = new Bundle();
            bundle.putAll(adzj.b());
            bundle.putString("package.name", a);
            Integer value;
            try {
                value = b.c.getPackageManager().getPackageInfo(b.c.getPackageName(), 0).versionCode;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                adzj.e.k("The current version of the app could not be retrieved", new Object[0]);
                value = null;
            }
            if (value != null) {
                bundle.putInt("app.version.code", (int)value);
            }
            final adzi adzi = new adzi(this.b, this.c, null);
            final Parcel qq = ((eny)adzk).qQ();
            qq.writeString(b2);
            eoa.h(qq, (Parcelable)bundle);
            eoa.j(qq, (IInterface)adzi);
            ((eny)adzk).qT(2, qq);
        }
        catch (final RemoteException ex2) {
            adzj.e.l((Throwable)ex2, "requestUpdateInfo(%s)", new Object[] { this.a });
            this.c.d((Exception)new RuntimeException((Throwable)ex2));
        }
    }
}
