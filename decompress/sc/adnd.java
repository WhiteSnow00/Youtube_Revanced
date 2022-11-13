import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnd implements adnj
{
    private final Context a;
    private final int b;
    private final adet c;
    private final aekp d;
    
    public adnd(final Context a, final aekp d, final adet c, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public final String a() {
        if (this.b != 0) {
            return "content";
        }
        return "file";
    }
    
    public final adnh b(final admv admv, final int n, final Uri uri, final adng adng) {
        if (this.b != 0) {
            return (adnh)adnb.a(n, uri, this.a, this.c);
        }
        return (adnh)adnb.a(n, uri, this.a, this.c);
    }
}
