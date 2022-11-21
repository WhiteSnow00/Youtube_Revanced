import java.util.Iterator;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acja implements dof
{
    public final dfy a;
    public final boolean b;
    public final aowb c;
    
    public acja(final dfy a, final boolean b, final aowb c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void g(final int n, final int n2) {
        final dfy a = this.a;
        final boolean b = this.b;
        final aowb c = this.c;
        Uri uri;
        if (n != Integer.MIN_VALUE && n2 != Integer.MIN_VALUE) {
            uri = aamz.O(c, n, n2);
        }
        else {
            final Uri q = aamz.Q(c);
            if ((uri = q) != null) {
                uri = q.buildUpon().appendQueryParameter("TargetSizeOriginal", "True").build();
            }
        }
        Uri build;
        if (uri != null) {
            build = uri.buildUpon().appendQueryParameter("isFirstResource", String.valueOf(b)).build();
        }
        else {
            build = null;
        }
        final acih acih = new acih((Throwable)a, build, "Glide");
        if (a != null) {
            a.a();
            for (final Throwable t : a.a()) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(acih, t);
                }
                catch (final Exception ex) {}
            }
        }
        aamz.ac(acih);
    }
}
