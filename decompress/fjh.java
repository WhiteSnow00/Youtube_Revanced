import com.google.android.gms.googlehelp.GoogleHelp;
import android.os.Bundle;
import android.app.Activity;
import android.net.Uri;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjh implements adhp
{
    public final Bitmap a;
    public final String b;
    public final Uri c;
    public final Activity d;
    public final hyx e;
    
    public fjh(final hyx e, final Bitmap a, final String b, final Uri c, final Activity d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final Bundle bundle) {
        final hyx e = this.e;
        final Bitmap a = this.a;
        final String b = this.b;
        final Uri c = this.c;
        final Activity d = this.d;
        final mxw mxw = (mxw)((atke)e.d).a();
        mxw.e((nbr)new fji(bundle));
        if (a != null) {
            mxw.d(a);
        }
        if (!((zmf)e.b).t()) {
            mxw.c();
        }
        final GoogleHelp b2 = GoogleHelp.b(b);
        b2.u = true;
        b2.q = c;
        b2.c(mxw.a(), d.getCacheDir());
        if (((zmf)e.b).t()) {
            b2.c = ((man)e.a).G(((zmf)e.b).c());
        }
        new mof(d).h(b2.a());
    }
}
