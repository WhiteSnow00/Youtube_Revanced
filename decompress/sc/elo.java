import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elo extends elr
{
    public mbk r;
    
    protected elo(final Context context) {
        super(context);
    }
    
    public static elo p(final Context context) {
        u(context, true);
        return new elo(context);
    }
    
    protected final ahaz j(final Context context, final View view, final Activity activity) {
        return null;
    }
    
    protected final ahaz n(final Context context, final View view, final Activity activity) {
        return null;
    }
    
    protected final List q(final emk emk, final Context context, final ahaz ahaz, final eho eho) {
        final ArrayList list = new ArrayList();
        if (emk.b == null) {
            return list;
        }
        list.add(new enb(emk, ahaz, emk.a()));
        return list;
    }
    
    protected final void r(final emk emk, final Context context, final ahaz ahaz, final eho eho) {
        if (emk.l) {
            final mbk r = this.r;
            if (r != null) {
                final String a = r.a;
                if (!TextUtils.isEmpty((CharSequence)a)) {
                    final String d = emn.d(a);
                    ahaz.copyOnWrite();
                    final eht eht = (eht)ahaz.instance;
                    final eht a2 = eht.a;
                    d.getClass();
                    eht.d |= 0x100000;
                    eht.ag = d;
                    ahaz.copyOnWrite();
                    final eht eht2 = (eht)ahaz.instance;
                    eht2.ah = 5;
                    eht2.d |= 0x200000;
                    final boolean b = this.r.b;
                    ahaz.copyOnWrite();
                    final eht eht3 = (eht)ahaz.instance;
                    eht3.d |= 0x400000;
                    eht3.ai = b;
                }
                this.r = null;
            }
            return;
        }
        v(this.q(emk, context, ahaz, eho));
    }
}
