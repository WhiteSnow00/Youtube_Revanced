import java.util.Iterator;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achn implements doc
{
    public final dfu a;
    public final boolean b;
    public final aotp c;
    
    public achn(final dfu a, final boolean b, final aotp c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void g(final int n, final int n2) {
        final dfu a = this.a;
        final boolean b = this.b;
        final aotp c = this.c;
        Uri uri;
        if (n != Integer.MIN_VALUE && n2 != Integer.MIN_VALUE) {
            uri = aald.K(c, n, n2);
        }
        else {
            final Uri m = aald.M(c);
            if ((uri = m) != null) {
                uri = m.buildUpon().appendQueryParameter("TargetSizeOriginal", "True").build();
            }
        }
        Uri build;
        if (uri != null) {
            build = uri.buildUpon().appendQueryParameter("isFirstResource", String.valueOf(b)).build();
        }
        else {
            build = null;
        }
        final acgt acgt = new acgt(a, build, "Glide");
        if (a != null) {
            a.a();
            for (final Throwable t : a.a()) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(acgt, t);
                }
                catch (final Exception ex) {}
            }
        }
        aald.Y(acgt);
    }
}
