import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyn implements vjz
{
    private final atke a;
    private final Context b;
    private final vaf c;
    
    public hyn(final Context b, final atke a, final vaf c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final /* bridge */ void a(final Object o) {
        final aotp aotp = (aotp)o;
        final ahbx c = aotp.c;
        if (!((List)c).isEmpty() && (((List)c).size() <= 1 || this.b.getResources().getConfiguration().orientation == 1)) {
            final acgs acgs = (acgs)this.a.a();
            int round;
            if (((List)c).size() == 1) {
                round = 1;
            }
            else {
                final float n = (float)tpe.bd(this.b);
                aoqn aoqn;
                if ((aoqn = this.c.b().s) == null) {
                    aoqn = aoqn.a;
                }
                round = Math.round(n * aoqn.l);
            }
            acgs.m(aotp, round, 1);
        }
    }
}
