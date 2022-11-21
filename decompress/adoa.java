import java.util.Arrays;
import android.net.Uri;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adoa
{
    public final String a;
    public final Bitmap b;
    public final byte[] c;
    private final Uri d;
    
    public adoa() {
    }
    
    public adoa(final String a, final Bitmap b, final byte[] c, final Uri d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static arxs a(final String a) {
        final arxs arxs = new arxs();
        if (a != null) {
            arxs.a = a;
            arxs.d = null;
            arxs.b = null;
            arxs.c = null;
            return arxs;
        }
        throw new NullPointerException("Null frontendId");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adoa) {
            final adoa adoa = (adoa)o;
            if (this.a.equals(adoa.a)) {
                final Bitmap b = this.b;
                if (b == null) {
                    if (adoa.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(adoa.b)) {
                    return false;
                }
                final byte[] c = this.c;
                byte[] array;
                if (adoa instanceof adoa) {
                    array = adoa.c;
                }
                else {
                    array = adoa.c;
                }
                if (Arrays.equals(c, array)) {
                    final Uri d = this.d;
                    final Uri d2 = adoa.d;
                    if (d == null) {
                        if (d2 != null) {
                            return false;
                        }
                    }
                    else if (!d.equals((Object)d2)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Bitmap b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int hashCode4 = Arrays.hashCode(this.c);
        final Uri d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final String string = Arrays.toString(this.c);
        final String value2 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder("UploadNotificationModel{frontendId=");
        sb.append(a);
        sb.append(", thumbnail=");
        sb.append(value);
        sb.append(", notificationEndpointData=");
        sb.append(string);
        sb.append(", sourceVideoUri=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
