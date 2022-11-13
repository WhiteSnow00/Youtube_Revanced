import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtb implements zmx
{
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public ArrayList e;
    public abtc f;
    public abtd g;
    private final HashMap h;
    
    public abtb() {
        final HashMap a = new HashMap();
        this.a = a;
        final HashMap b = new HashMap();
        this.b = b;
        final HashMap c = new HashMap();
        this.c = c;
        this.d = new HashMap();
        this.h = new HashMap();
        this.e = new ArrayList();
        new abtd().b = 0;
        new abtg().b = 0;
        new abtf().b = 0;
        final Integer value = 0;
        a.put(value, new abtd());
        b.put(value, new abtg());
        c.put(value, new abtf());
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final abta b() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            list.add(((abtk)iterator.next()).b());
        }
        return new abta(list);
    }
    
    public final abtd c(final int n) {
        return (abtd)tpe.L((Map)this.a, (Object)n, (Object)abtd.a);
    }
    
    public final abte d(final int n) {
        return this.d.get(n);
    }
    
    public final abtf e(final int n) {
        return (abtf)tpe.L((Map)this.c, (Object)n, (Object)abtf.a);
    }
    
    public final abtg f(final int n) {
        return (abtg)tpe.L((Map)this.b, (Object)n, (Object)abtg.a);
    }
    
    public final void g(final abtc abtc) {
        final int b = abtc.f.b;
        final HashMap h = this.h;
        final Integer value = b;
        abtk abtk;
        if ((abtk = h.get(value)) == null) {
            abtk = new abtk(b);
            this.h.put(value, abtk);
        }
        if (abtc.d) {
            final String k = abtc.k;
            final int n = (int)abtc.a;
            abtk.c(k, n, (int)abtc.b + n);
        }
        else {
            final String i = abtc.k;
            final int n2 = (int)abtc.a;
            abtk.d(i, n2, (int)abtc.b + n2);
        }
        final int n3 = (int)abtc.a;
        final abtf f = abtc.f;
        final int c = f.c;
        final int e = f.e;
        final int d = f.d;
        final int c2 = abtc.g.c;
        int j = 0;
        abtk.e(n3, new SubtitleWindowSettings(c, e, d, true, c2 == 2));
        if (!abtc.j.isEmpty()) {
            final ArrayList l = abtc.j;
            final int size = l.size();
            arjf arjf = null;
            while (j < size) {
                final arjf arjf2 = (arjf)l.get(j);
                if (arjf != null) {
                    final Object b2 = arjf.b;
                    final long a = abtc.a;
                    abtk.c((String)b2, (int)(arjf.a + a), (int)(a + abtc.b));
                }
                ++j;
                arjf = arjf2;
            }
            if (arjf != null) {
                final Object b3 = arjf.b;
                final long a2 = abtc.a;
                abtk.c((String)b3, (int)(arjf.a + a2), (int)(a2 + abtc.b));
            }
        }
    }
}
