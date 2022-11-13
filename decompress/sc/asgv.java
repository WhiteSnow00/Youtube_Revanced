import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asgv extends arvu
{
    static final artt b;
    private static final Status e;
    public final arvn c;
    public final Map d;
    private final Random f;
    private aruk g;
    private asgu h;
    
    static {
        b = artt.a("state-info");
        e = Status.OK.withDescription("no subchannels ready");
    }
    
    public asgv(final arvn c) {
        this.d = new HashMap();
        this.h = new asgs(asgv.e);
        this.c = c;
        this.f = new Random();
    }
    
    public static arus e(final arus arus) {
        return new arus(arus.b, artu.a);
    }
    
    public static acqb h(final arvr arvr) {
        final acqb acqb = (acqb)arvr.a().a(asgv.b);
        acqb.getClass();
        return acqb;
    }
    
    private final void i(final aruk g, final asgu h) {
        if (g == this.g && h.b(this.h)) {
            return;
        }
        this.c.d(g, (arvs)h);
        this.g = g;
        this.h = h;
    }
    
    private static final void j(final arvr arvr) {
        arvr.d();
        h(arvr).a = arul.a(aruk.e);
    }
    
    public final void a(final Status status) {
        if (this.g != aruk.b) {
            this.i(aruk.c, new asgs(status));
        }
    }
    
    public final void b(final arvq arvq) {
        final List a = arvq.a;
        final Set keySet = this.d.keySet();
        final int size = a.size();
        final HashMap hashMap = new HashMap(size + size);
        for (final arus arus : a) {
            hashMap.put((Object)e(arus), (Object)arus);
        }
        final Set keySet2 = hashMap.keySet();
        final HashSet set = new HashSet(keySet);
        set.removeAll(keySet2);
        final Iterator iterator2 = hashMap.entrySet().iterator();
        int i;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            i = 0;
            if (!hasNext) {
                break;
            }
            final Map.Entry<arus, V> entry = (Map.Entry<arus, V>)iterator2.next();
            final arus arus2 = entry.getKey();
            final arus arus3 = (arus)entry.getValue();
            final arvr arvr = this.d.get(arus2);
            if (arvr != null) {
                arvr.f((List)Collections.singletonList(arus3));
            }
            else {
                final aumh b = artu.b();
                b.b(asgv.b, (Object)new acqb((Object)arul.a(aruk.d)));
                final arvn c = this.c;
                final Object[][] array = new Object[0][2];
                final List<arus> singletonList = Collections.singletonList(arus3);
                final artu a2 = b.a();
                a2.getClass();
                final arvr b2 = c.b(arva.a((List)singletonList, a2, array));
                b2.e((arvt)new asgr(this, b2, 0));
                this.d.put(arus2, b2);
                b2.c();
            }
        }
        final ArrayList<arvr> list = new ArrayList<arvr>();
        final Iterator iterator3 = set.iterator();
        while (iterator3.hasNext()) {
            list.add((arvr)this.d.remove(iterator3.next()));
        }
        this.g();
        while (i < list.size()) {
            j((arvr)list.get(i));
            ++i;
        }
    }
    
    public final void c() {
        final Iterator iterator = this.f().iterator();
        while (iterator.hasNext()) {
            j((arvr)iterator.next());
        }
        this.d.clear();
    }
    
    final Collection f() {
        return this.d.values();
    }
    
    public final void g() {
        final Collection f = this.f();
        final ArrayList list = new ArrayList(f.size());
        for (final arvr arvr : f) {
            if (((arul)h(arvr).a).a == aruk.b) {
                list.add((Object)arvr);
            }
        }
        if (list.isEmpty()) {
            Status status = asgv.e;
            final Iterator iterator2 = this.f().iterator();
            int n = 0;
            while (iterator2.hasNext()) {
                final arul arul = (arul)h((arvr)iterator2.next()).a;
                final aruk a = arul.a;
                int n2 = 0;
                Label_0168: {
                    if (a != aruk.a) {
                        n2 = n;
                        if (a != aruk.d) {
                            break Label_0168;
                        }
                    }
                    n2 = 1;
                }
                if (status != asgv.e) {
                    n = n2;
                    if (status.f()) {
                        continue;
                    }
                }
                status = arul.b;
                n = n2;
            }
            aruk aruk;
            if (n != 0) {
                aruk = aruk.a;
            }
            else {
                aruk = aruk.c;
            }
            this.i(aruk, new asgs(status));
            return;
        }
        this.i(aruk.b, new asgt(list, this.f.nextInt(list.size())));
    }
}
