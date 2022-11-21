import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abul implements zos
{
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public ArrayList e;
    public abum f;
    public abun g;
    private final HashMap h;
    
    public abul() {
        final HashMap a = new HashMap();
        this.a = a;
        final HashMap b = new HashMap();
        this.b = b;
        final HashMap c = new HashMap();
        this.c = c;
        this.d = new HashMap();
        this.h = new HashMap();
        this.e = new ArrayList();
        new abun().b = 0;
        new abuq().b = 0;
        new abup().b = 0;
        final Integer value = 0;
        a.put(value, new abun());
        b.put(value, new abuq());
        c.put(value, new abup());
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final abuk b() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            list.add(((abuu)iterator.next()).b());
        }
        return new abuk(list);
    }
    
    public final abun c(final int n) {
        return (abun)tqf.L((Map)this.a, (Object)n, (Object)abun.a);
    }
    
    public final abuo d(final int n) {
        return this.d.get(n);
    }
    
    public final abup e(final int n) {
        return (abup)tqf.L((Map)this.c, (Object)n, (Object)abup.a);
    }
    
    public final abuq f(final int n) {
        return (abuq)tqf.L((Map)this.b, (Object)n, (Object)abuq.a);
    }
    
    public final void g(final abum abum) {
        final int b = abum.f.b;
        final HashMap h = this.h;
        final Integer value = b;
        abuu abuu;
        if ((abuu = h.get(value)) == null) {
            abuu = new abuu(b);
            this.h.put(value, abuu);
        }
        if (abum.d) {
            final String k = abum.k;
            final int n = (int)abum.a;
            abuu.c(k, n, (int)abum.b + n);
        }
        else {
            final String i = abum.k;
            final int n2 = (int)abum.a;
            abuu.d(i, n2, (int)abum.b + n2);
        }
        final int n3 = (int)abum.a;
        final abup f = abum.f;
        final int c = f.c;
        final int e = f.e;
        final int d = f.d;
        final int c2 = abum.g.c;
        int j = 0;
        abuu.e(n3, new SubtitleWindowSettings(c, e, d, true, c2 == 2));
        if (!abum.j.isEmpty()) {
            final ArrayList l = abum.j;
            final int size = l.size();
            arlz arlz = null;
            while (j < size) {
                final arlz arlz2 = (arlz)l.get(j);
                if (arlz != null) {
                    final Object b2 = arlz.b;
                    final long a = abum.a;
                    abuu.c((String)b2, (int)(arlz.a + a), (int)(a + abum.b));
                }
                ++j;
                arlz = arlz2;
            }
            if (arlz != null) {
                final Object b3 = arlz.b;
                final long a2 = abum.a;
                abuu.c((String)b3, (int)(arlz.a + a2), (int)(a2 + abum.b));
            }
        }
    }
}
