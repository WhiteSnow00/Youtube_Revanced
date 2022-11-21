import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asjr extends aryo
{
    static final arwn b;
    private static final Status e;
    public final aryh c;
    public final Map d;
    private final Random f;
    private arxe g;
    private asjq h;
    
    static {
        b = arwn.a("state-info");
        e = Status.OK.withDescription("no subchannels ready");
    }
    
    public asjr(final aryh c) {
        this.d = new HashMap();
        this.h = (asjq)new asjo(asjr.e);
        this.c = c;
        this.f = new Random();
    }
    
    public static arxm d(final arxm arxm) {
        return new arxm(arxm.b, arwo.a);
    }
    
    public static auoz g(final aryl aryl) {
        final auoz auoz = (auoz)aryl.a().a(asjr.b);
        auoz.getClass();
        return auoz;
    }
    
    private final void h(final arxe g, final asjq h) {
        if (g == this.g && h.b(this.h)) {
            return;
        }
        this.c.d(g, h);
        this.g = g;
        this.h = h;
    }
    
    private static final void i(final aryl aryl) {
        aryl.d();
        g(aryl).a = arxf.a(arxe.e);
    }
    
    @Override
    public final void a(final Status status) {
        if (this.g != arxe.b) {
            this.h(arxe.c, (asjq)new asjo(status));
        }
    }
    
    @Override
    public final void b() {
        final Iterator iterator = this.e().iterator();
        while (iterator.hasNext()) {
            i((aryl)iterator.next());
        }
        this.d.clear();
    }
    
    @Override
    public final boolean c(final aryk aryk) {
        final boolean empty = aryk.a.isEmpty();
        int i = 0;
        if (!empty) {
            final List a = aryk.a;
            final Set keySet = this.d.keySet();
            final int size = a.size();
            final HashMap hashMap = new HashMap(size + size);
            for (final arxm arxm : a) {
                hashMap.put((Object)d(arxm), (Object)arxm);
            }
            final Set keySet2 = hashMap.keySet();
            final HashSet set = new HashSet(keySet);
            set.removeAll(keySet2);
            for (final Map.Entry<arxm, V> entry : hashMap.entrySet()) {
                final arxm arxm2 = entry.getKey();
                final arxm arxm3 = (arxm)entry.getValue();
                final aryl aryl = this.d.get(arxm2);
                if (aryl != null) {
                    aryl.f(Collections.singletonList(arxm3));
                }
                else {
                    final aupd b = arwo.b();
                    b.b(asjr.b, (Object)new auoz((Object)arxf.a(arxe.d)));
                    final aryh c = this.c;
                    final Object[][] array = new Object[0][2];
                    final List<arxm> singletonList = Collections.singletonList(arxm3);
                    final arwo a2 = b.a();
                    a2.getClass();
                    final aryl b2 = c.b(arxu.f(singletonList, a2, array));
                    b2.e(new asjn(this, b2, 0));
                    this.d.put(arxm2, b2);
                    b2.c();
                }
            }
            final ArrayList<aryl> list = new ArrayList<aryl>();
            final Iterator iterator3 = set.iterator();
            while (iterator3.hasNext()) {
                list.add((aryl)this.d.remove(iterator3.next()));
            }
            this.f();
            while (i < list.size()) {
                i((aryl)list.get(i));
                ++i;
            }
            return true;
        }
        final Status l = Status.l;
        final String value = String.valueOf(aryk.a);
        final String string = aryk.b.toString();
        final StringBuilder sb = new StringBuilder("NameResolver returned no usable address. addrs=");
        sb.append(value);
        sb.append(", attrs=");
        sb.append(string);
        this.a(l.withDescription(sb.toString()));
        return false;
    }
    
    final Collection e() {
        return this.d.values();
    }
    
    public final void f() {
        final Collection e = this.e();
        final ArrayList list = new ArrayList(e.size());
        for (final aryl aryl : e) {
            if (((arxf)g(aryl).a).a == arxe.b) {
                list.add((Object)aryl);
            }
        }
        if (list.isEmpty()) {
            Status status = asjr.e;
            final Iterator iterator2 = this.e().iterator();
            int n = 0;
            while (iterator2.hasNext()) {
                final arxf arxf = (arxf)g((aryl)iterator2.next()).a;
                final arxe a = arxf.a;
                int n2 = 0;
                Label_0168: {
                    if (a != arxe.a) {
                        n2 = n;
                        if (a != arxe.d) {
                            break Label_0168;
                        }
                    }
                    n2 = 1;
                }
                if (status != asjr.e) {
                    n = n2;
                    if (status.f()) {
                        continue;
                    }
                }
                status = arxf.b;
                n = n2;
            }
            arxe arxe;
            if (n != 0) {
                arxe = arxe.a;
            }
            else {
                arxe = arxe.c;
            }
            this.h(arxe, (asjq)new asjo(status));
            return;
        }
        this.h(arxe.b, (asjq)new asjp((List)list, this.f.nextInt(list.size())));
    }
}
