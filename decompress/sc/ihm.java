import java.util.Iterator;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihm implements tgg
{
    public final atke a;
    public final atke b;
    public final Set c;
    private final atke d;
    private final atke e;
    private final atke f;
    private final atke g;
    
    public ihm(final atke d, final atke e, final atke f, final atke g, final atke b, final atke a) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.b = b;
        this.c = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
    }
    
    public final void a() {
        final HashSet set = new HashSet();
        final Iterator iterator = ((Set)this.g.a()).iterator();
        while (iterator.hasNext()) {
            set.add(((iit)iterator.next()).b);
        }
        final Iterator iterator2 = ((Set)this.f.a()).iterator();
        while (iterator2.hasNext()) {
            set.add(((iix)iterator2.next()).f());
        }
        final vdq b = ((vdr)this.d.a()).b();
        final lan lan = (lan)this.e.a();
        for (final Class clazz : set) {
            final Set c = this.c;
            final asht af = b.a((Class)clazz).af((asid)this.a.a());
            lan.getClass();
            c.add(af.aI(new ihl(lan, 0, null, null), (asjm)hot.n));
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zmu zmu = (zmu)o;
                ((asid)this.a.a()).f((Runnable)new hvt(this, 19));
            }
            else {
                final zms zms = (zms)o;
                ((asid)this.a.a()).f((Runnable)new hvt(this, 18));
            }
        }
        else {
            array = new Class[] { zms.class, zmu.class };
        }
        return array;
    }
}
