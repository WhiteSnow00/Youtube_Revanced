import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjn extends bjo
{
    public final Uri a;
    public final String b;
    public final bjl c;
    private final bjw i;
    
    public bjn(final ayf ayf, final List list, final bjt bjt, final List list2, final String b, final long n) {
        super(ayf, list, (bju)bjt, list2);
        this.a = Uri.parse(list.get(0).a);
        final long b2 = bjt.b;
        final bjw bjw = null;
        bjl c;
        if (b2 <= 0L) {
            c = null;
        }
        else {
            c = new bjl((String)null, bjt.a, b2);
        }
        this.c = c;
        this.b = b;
        bjw i;
        if (c != null) {
            i = bjw;
        }
        else {
            i = new bjw(new bjl((String)null, 0L, n));
        }
        this.i = i;
    }
    
    public final biv k() {
        return this.i;
    }
    
    public final bjl l() {
        return this.c;
    }
    
    public final String m() {
        return this.b;
    }
}
