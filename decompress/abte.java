import android.text.TextUtils;
import android.net.Uri;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abte
{
    public final Executor a;
    public final bbn b;
    public bbr c;
    public final int d;
    public volatile boolean e;
    public Thread f;
    public final agpw g;
    
    public abte(final Executor a, final zcj zcj, final agpw g, Uri a2, final int d, final String s, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = false;
        this.a = a;
        this.b = (bbn)new bcj(zcj.a(), g, -10, (byte[])null, (byte[])null, (byte[])null);
        this.g = g;
        if (a2 != null && ("https".equals(a2.getScheme()) || "http".equals(a2.getScheme()))) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                final twk b = twk.b(a2);
                b.h("cpn", s);
                a2 = b.a();
            }
            this.c = new bbr(a2);
        }
        this.d = d;
    }
}
