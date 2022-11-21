import android.os.Parcel;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcelable;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aecz extends aeeo
{
    final String a;
    final aedd b;
    final noj c;
    
    public aecz(final aedd b, final noj noj, final String a, final noj c, final byte[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
        super(noj, null);
    }
    
    @Override
    protected final void a() {
        try {
            final aedd b = this.b;
            final aede aede = (aede)b.a.k;
            final String b2 = b.b;
            final String a = this.a;
            final Bundle bundle = new Bundle();
            bundle.putAll(aedd.b());
            bundle.putString("package.name", a);
            Integer value;
            try {
                value = b.c.getPackageManager().getPackageInfo(b.c.getPackageName(), 0).versionCode;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                aedd.d.h("The current version of the app could not be retrieved", new Object[0]);
                value = null;
            }
            if (value != null) {
                bundle.putInt("app.version.code", (int)value);
            }
            final aedc aedc = new aedc(this.b, this.c, null);
            final Parcel qv = ((eoc)aede).qV();
            qv.writeString(b2);
            eoe.h(qv, (Parcelable)bundle);
            eoe.j(qv, (IInterface)aedc);
            ((eoc)aede).qY(2, qv);
        }
        catch (final RemoteException ex2) {
            aedd.d.i((Throwable)ex2, "requestUpdateInfo(%s)", this.a);
            this.c.c((Exception)new RuntimeException((Throwable)ex2));
        }
    }
}
