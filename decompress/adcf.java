import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcf extends acph implements adci, adem
{
    private final Context a;
    private final acig b;
    private final acmr c;
    private final veh d;
    private final acqv e;
    private final SharedPreferences f;
    private final List g;
    private final ajws h;
    
    public adcf(final apch apch, final Context a, final acig b, final veh d, final acqv e, final SharedPreferences f) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        final acmr c = new acmr();
        this.c = c;
        this.g = new ArrayList();
        final long long1 = f.getLong("share_panel_promo_last_dismissed_millis", 0L);
        final long currentTimeMillis = System.currentTimeMillis();
        final long g = apch.g;
        ajws h = null;
        if (currentTimeMillis - long1 <= g) {
            if ((apch.b & 0x8) != 0x0 && (h = apch.f) == null) {
                h = ajws.a;
            }
            this.h = h;
            return;
        }
        c.add((Object)apch);
        this.h = null;
    }
    
    public final acla a() {
        return this.c;
    }
    
    @Override
    public final void d(final List list) {
        for (final Object next : list) {
            if (next != this && next instanceof adem) {
                this.g.add(next);
            }
        }
        if (this.h != null) {
            final Iterator iterator2 = this.g.iterator();
            while (iterator2.hasNext()) {
                ((adem)iterator2.next()).f(this.h);
            }
        }
    }
    
    @Override
    public final void e(final acmh acmh) {
        acmh.f(apch.class, (acmf)new jbx(this.a, this.b, this.d, this.e, (adem)this, 8));
    }
    
    public final void f(final ajws ajws) {
        this.c.clear();
        this.f.edit().putLong("share_panel_promo_last_dismissed_millis", System.currentTimeMillis()).apply();
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            ((adem)iterator.next()).f(ajws);
        }
    }
}
