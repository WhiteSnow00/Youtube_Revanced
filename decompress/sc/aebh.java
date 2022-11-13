import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aebh extends aecw
{
    final String a;
    final aebl b;
    final nns c;
    
    public aebh(final aebl b, final nns nns, final String a, final nns c, final byte[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
        super(nns, (byte[])null);
    }
    
    protected final void a() {
        try {
            final aebl b = this.b;
            final aebm aebm = (aebm)b.a.k;
            final String b2 = b.b;
            final String a = this.a;
            final Bundle bundle = new Bundle();
            bundle.putAll(aebl.b());
            bundle.putString("package.name", a);
            Integer value;
            try {
                value = b.c.getPackageManager().getPackageInfo(b.c.getPackageName(), 0).versionCode;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                aebl.d.j("The current version of the app could not be retrieved", new Object[0]);
                value = null;
            }
            if (value != null) {
                bundle.putInt("app.version.code", (int)value);
            }
            final aebk aebk = new aebk(this.b, this.c, null);
            final Parcel qw = ((enz)aebm).qW();
            qw.writeString(b2);
            eob.h(qw, (Parcelable)bundle);
            eob.j(qw, (IInterface)aebk);
            ((enz)aebm).qZ(2, qw);
        }
        catch (final RemoteException ex2) {
            aebl.d.k((Throwable)ex2, "requestUpdateInfo(%s)", this.a);
            this.c.c((Exception)new RuntimeException((Throwable)ex2));
        }
    }
}
