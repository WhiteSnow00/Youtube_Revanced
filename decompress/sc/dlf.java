import java.util.List;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlf implements ddr
{
    public static final ddo a;
    private final Context b;
    
    static {
        a = ddo.b("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    }
    
    public dlf(final Context context) {
        this.b = context.getApplicationContext();
    }
    
    @Override
    public final /* bridge */ dfy a(final Object o, final int n, final int n2, final ddp ddp) {
        return this.c((Uri)o, ddp);
    }
    
    @Override
    public final /* bridge */ boolean b(final Object o, final ddp ddp) {
        return ((Uri)o).getScheme().equals("android.resource");
    }
    
    public final dfy c(Uri uri, final ddp ddp) {
        final String authority = uri.getAuthority();
        final boolean equals = authority.equals(this.b.getPackageName());
        boolean b = false;
        Context context = null;
        Label_0075: {
            if (!equals) {
                try {
                    context = this.b.createPackageContext(authority, 0);
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    if (!authority.contains(this.b.getPackageName())) {
                        throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), (Throwable)ex);
                    }
                    context = this.b;
                }
                break Label_0075;
            }
            context = this.b;
        }
        final List pathSegments = uri.getPathSegments();
        Label_0226: {
            if (pathSegments.size() == 2) {
                final List pathSegments2 = uri.getPathSegments();
                final String authority2 = uri.getAuthority();
                final String s = pathSegments2.get(0);
                final String s2 = pathSegments2.get(1);
                int n;
                if ((n = context.getResources().getIdentifier(s2, s, authority2)) == 0) {
                    n = Resources.getSystem().getIdentifier(s2, s, "android");
                }
                if (n != 0) {
                    break Label_0226;
                }
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
            else if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            final List pathSegments3 = uri.getPathSegments();
            try {
                final int n = Integer.parseInt((String)pathSegments3.get(0));
                uri = (Uri)ddp.b(dlf.a);
                if (context.getPackageName().equals(authority) || uri == null) {
                    b = true;
                }
                clm.i(b, "Can't get a theme from another package");
                if (uri == null) {
                    uri = (Uri)dlb.a(this.b, context, n, (Resources$Theme)null);
                }
                else {
                    final Context b2 = this.b;
                    uri = (Uri)dlb.a(b2, b2, n, (Resources$Theme)uri);
                }
                return dle.g((Drawable)uri);
            }
            catch (final NumberFormatException ex2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), ex2);
            }
        }
        throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
    }
}