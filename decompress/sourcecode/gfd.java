import android.content.res.Resources$Theme;
import java.util.Map;
import j$.util.Map$_EL;
import android.util.TypedValue;
import android.content.Context;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfd implements acng
{
    private final EnumMap a;
    private final EnumMap b;
    private final Context c;
    private final acng d;
    
    public gfd(final Context c, final acng d) {
        this.a = new EnumMap((Class<K>)akbe.class);
        this.b = new EnumMap((Class<K>)akbe.class);
        this.c = c;
        this.d = d;
        this.b(akbe.kU, 2130969268, 2131231498);
        this.b(akbe.je, 2130970819, 2131233469);
        this.b(akbe.iV, 2130969192, 2131232079);
        this.b(akbe.iW, 2130969193, 2131232081);
        this.b(akbe.iU, 2130969194, 2131232083);
        this.b(akbe.iT, 2130969195, 2131232085);
        this.b(akbe.mq, 2130969360, 2131231062);
        this.b(akbe.mR, 2130970166, 2131232089);
        this.b(akbe.ep, 2130970166, 2131232089);
        this.b(akbe.iu, 2130969788, 2131231630);
        this.b(akbe.it, 2130969789, 2131231632);
        this.b(akbe.kQ, 2130970792, 2131232064);
        this.b(akbe.nT, 2130970821, 2131233473);
        this.b(akbe.qZ, 2130969121, 2131233480);
    }
    
    private final void b(final akbe akbe, final int n, final int n2) {
        this.a.put((Enum)akbe, n);
        this.b.put((Enum)akbe, n2);
    }
    
    public final int a(final akbe akbe) {
        final TypedValue typedValue = new TypedValue();
        final Resources$Theme theme = this.c.getTheme();
        final Integer value = 0;
        int n;
        if (theme != null && theme.resolveAttribute((int)Map$_EL.getOrDefault((Map)this.a, (Object)akbe, (Object)value), typedValue, true)) {
            n = typedValue.resourceId;
        }
        else {
            n = (int)Map$_EL.getOrDefault((Map)this.b, (Object)akbe, (Object)value);
        }
        if (n == 0) {
            return this.d.a(akbe);
        }
        return n;
    }
}
