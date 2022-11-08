import android.text.Layout$Alignment;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxp
{
    public static final Comparator a;
    public final azx b;
    public final int c;
    
    static {
        a = (Comparator)aaq.n;
    }
    
    public bxp(final CharSequence a, final Layout$Alignment c, final float n, final int e, final float f, final int g, final boolean b, final int n2, final int c2) {
        final azw azw = new azw();
        azw.a = a;
        azw.c = c;
        azw.b(n, 0);
        azw.e = e;
        azw.f = f;
        azw.g = g;
        azw.h = -3.4028235E38f;
        if (b) {
            azw.d(n2);
        }
        this.b = azw.a();
        this.c = c2;
    }
}
