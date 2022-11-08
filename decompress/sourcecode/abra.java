import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abra implements zla
{
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public ArrayList e;
    public abrb f;
    public abrc g;
    private final HashMap h;
    
    public abra() {
        final HashMap a = new HashMap();
        this.a = a;
        final HashMap b = new HashMap();
        this.b = b;
        final HashMap c = new HashMap();
        this.c = c;
        this.d = new HashMap();
        this.h = new HashMap();
        this.e = new ArrayList();
        new abrc().b = 0;
        new abrf().b = 0;
        new abre().b = 0;
        final Integer value = 0;
        a.put(value, new abrc());
        b.put(value, new abrf());
        c.put(value, new abre());
    }
    
    public final abqz b() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            list.add(((abrj)iterator.next()).b());
        }
        return new abqz(list);
    }
    
    public final abrc c(final int n) {
        return (abrc)tmy.L((Map)this.a, (Object)n, (Object)abrc.a);
    }
    
    public final abrd d(final int n) {
        return this.d.get(n);
    }
    
    public final abre e(final int n) {
        return (abre)tmy.L((Map)this.c, (Object)n, (Object)abre.a);
    }
    
    public final abrf f(final int n) {
        return (abrf)tmy.L((Map)this.b, (Object)n, (Object)abrf.a);
    }
    
    public final void g(final abrb abrb) {
        final int b = abrb.f.b;
        final HashMap h = this.h;
        final Integer value = b;
        abrj abrj;
        if ((abrj = h.get(value)) == null) {
            abrj = new abrj(b);
            this.h.put(value, abrj);
        }
        if (abrb.d) {
            final String k = abrb.k;
            final int n = (int)abrb.a;
            abrj.c(k, n, (int)abrb.b + n);
        }
        else {
            final String i = abrb.k;
            final int n2 = (int)abrb.a;
            abrj.d(i, n2, (int)abrb.b + n2);
        }
        final int n3 = (int)abrb.a;
        final abre f = abrb.f;
        final int c = f.c;
        final int e = f.e;
        final int d = f.d;
        final int c2 = abrb.g.c;
        int j = 0;
        abrj.e(n3, new SubtitleWindowSettings(c, e, d, true, c2 == 2));
        if (!abrb.j.isEmpty()) {
            final ArrayList l = abrb.j;
            final int size = l.size();
            argq argq = null;
            while (j < size) {
                final argq argq2 = (argq)l.get(j);
                if (argq != null) {
                    final Object b2 = argq.b;
                    final long a = abrb.a;
                    abrj.c((String)b2, (int)(argq.a + a), (int)(a + abrb.b));
                }
                ++j;
                argq = argq2;
            }
            if (argq != null) {
                final Object b3 = argq.b;
                final long a2 = abrb.a;
                abrj.c((String)b3, (int)(argq.a + a2), (int)(a2 + abrb.b));
            }
        }
    }
}
