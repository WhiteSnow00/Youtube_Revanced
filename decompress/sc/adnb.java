import android.graphics.Bitmap;
import android.graphics.Point;
import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adnb implements adnh
{
    protected final Uri c;
    protected final ContentResolver d;
    public final adet e;
    
    public adnb(final Uri c, final ContentResolver d, final adet e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static adnb a(int n, final Uri uri, final Context context, final adet adet) {
        if (--n == 1) {
            return (adnb)new adna(uri, context, adet, false, (byte[])null, (byte[])null, (byte[])null);
        }
        if (n != 2) {
            return (adnb)new adne(uri, context.getContentResolver(), adet, (byte[])null, (byte[])null, (byte[])null);
        }
        return (adnb)new adna(uri, context, adet, true, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Bitmap c(final Point point) {
        return adnc.b(this.d, this.c, point);
    }
    
    public final apig h(final String s, final String s2) {
        return adnc.d(s);
    }
    
    public final boolean l() {
        return true;
    }
}
