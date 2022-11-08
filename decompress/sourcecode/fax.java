import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fax
{
    public static final String a;
    private static final String c = "fax";
    public final Map b;
    private final vax d;
    private final wwu e;
    
    static {
        a = String.valueOf(fax.class.getName()).concat(".csn");
    }
    
    public fax(final fxo fxo, final vax d, final wwu e) {
        this.b = new HashMap();
        d.getClass();
        this.d = d;
        this.e = e;
        fxo.g((fxn)new hkf(this, 1));
    }
    
    public final void a(final aijk aijk, final List list, final Map map) {
        aijk.getClass();
        if (list != null) {
            if (!list.isEmpty()) {
                List list2;
                if ((list2 = this.b.get(aijk)) == null) {
                    list2 = new ArrayList();
                    this.b.put(aijk, list2);
                }
                final HashMap hashMap = new HashMap(map);
                final wwv wwv = (wwv)tmy.M(map, (Object)"com.google.android.libraries.youtube.logging.interaction_logger");
                final String a = fax.a;
                String s;
                if (wwv != null) {
                    s = wwv.i();
                }
                else {
                    s = this.e.n().i();
                }
                hashMap.put(a, s);
                list2.add(new agkb(list, (Map)hashMap));
            }
        }
    }
    
    public final void b(final aijk aijk) {
        final List list = this.b.get(aijk);
        if (list != null) {
            if (!list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    final agkb agkb = (agkb)iterator.next();
                    vem.f(this.d, (List)agkb.c, (Map)agkb.b);
                    final boolean a = agkb.a;
                    iterator.remove();
                }
            }
        }
    }
}
