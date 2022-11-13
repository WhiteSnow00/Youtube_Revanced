import android.graphics.drawable.Drawable;
import android.content.Context;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dke implements ddt
{
    private final ddt b;
    private final boolean c;
    
    public dke(final ddt b, final boolean c) {
        this.b = b;
        this.c = c;
    }
    
    public final void a(final MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
    
    public final dfy b(final Context context, final dfy dfy, final int n, final int n2) {
        final dgg a = dbp.b(context).a;
        final Drawable drawable = (Drawable)dfy.c();
        final dfy a2 = dkd.a(a, drawable, n, n2);
        if (a2 == null) {
            if (!this.c) {
                return dfy;
            }
            final String value = String.valueOf(drawable);
            final StringBuilder sb = new StringBuilder("Unable to convert ");
            sb.append(value);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        else {
            final dfy b = this.b.b(context, a2, n, n2);
            if (b.equals(a2)) {
                b.e();
                return dfy;
            }
            return dkk.f(context.getResources(), b);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof dke && this.b.equals(((dke)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}
