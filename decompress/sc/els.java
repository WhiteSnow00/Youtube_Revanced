import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class els extends elr
{
    protected els(final Context context, final String s, final boolean b) {
        super(context, s, b);
    }
    
    public static els p(final String s, final Context context, final boolean b) {
        u(context, b);
        return new els(context, s, b);
    }
    
    protected final List q(final emk emk, final Context context, final ahaz ahaz, final eho eho) {
        if (emk.b != null && this.u) {
            final int a = emk.a();
            final ArrayList list = new ArrayList();
            list.addAll(super.q(emk, context, ahaz, eho));
            list.add(new enb(emk, ahaz, a));
            return list;
        }
        return super.q(emk, context, ahaz, eho);
    }
}
