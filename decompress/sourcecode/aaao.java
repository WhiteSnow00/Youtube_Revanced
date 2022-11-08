import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaao
{
    public final zkh a;
    public final atjj b;
    public final Executor c;
    public final Map d;
    public final Map e;
    public final Set f;
    final Map g;
    public boolean h;
    public aepj i;
    private final thh j;
    private final aaal k;
    private final Queue l;
    private final acko m;
    
    public aaao(final thh j, final acko m, final aaal k, final atjj b, final Executor c, final zkh a, final byte[] array) {
        this.h = false;
        this.j = j;
        this.m = m;
        this.k = k;
        this.a = a;
        this.b = b;
        this.l = new PriorityQueue(1, (Comparator)new mm(16));
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new HashMap();
        this.c = c;
    }
    
    private final Set o(final aaag aaag, final aaag aaag2, final boolean b) {
        final HashSet set = new HashSet();
        if (aaag.a().h()) {
            final aaag aaag3 = this.d.get(aaag.a().c());
            if (aaag3 != null) {
                aaag3.f.remove(aaag.a);
                if (b) {
                    aaag3.j = true;
                }
                if (!aaag3.e()) {
                    this.d.remove(aaag3.a);
                    if (aaag3.j) {
                        set.addAll(this.e(aaag3, aaag2));
                    }
                    else {
                        set.addAll(this.f(aaag3, aaag2));
                    }
                }
                else {
                    this.q(aaag2);
                }
            }
        }
        return set;
    }
    
    private final void p(final aaag aaag, final aaag aaag2, final aaaj aaaj) {
        final atir atir = this.g.get(aaag.a);
        if (atir != null) {
            final aaak aaak = new aaak(aaag2.c, aaaj);
            atir.tr((Object)aaak);
            if (aaak.c()) {
                this.g.remove(aaag.a);
                atir.tu();
            }
        }
    }
    
    private final void q(final aaag aaag) {
        if (!aaag.a().h()) {
            return;
        }
        final aaag aaag2 = this.d.get(aaag.g);
        if (aaag2 != null) {
            this.p(aaag2, aaag, aaaj.c);
        }
    }
    
    private final boolean r(final aaag aaag) {
        amsf amsf;
        if ((amsf = aaag.c.e) == null) {
            amsf = amsf.b;
        }
        for (final amse amse : new agzs((List)amsf.e, amsf.a)) {
            final amse a = amse.a;
            final int ordinal = amse.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        continue;
                    }
                    if (!this.j.p() || (!this.j.q() && !this.j.r())) {
                        return false;
                    }
                    continue;
                }
                else {
                    if (!this.j.p() || !this.j.r()) {
                        return false;
                    }
                    continue;
                }
            }
            else {
                if (!this.j.p()) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
    
    private final void s(final amsm e, final String s, final int n) {
        final acko m = this.m;
        final wwc wwc = new wwc(n - 1, 4);
        final agza builder = ((agzi)ajrb.a).createBuilder();
        builder.copyOnWrite();
        final ajrb ajrb = (ajrb)builder.instance;
        e.getClass();
        ajrb.e = e;
        ajrb.b |= 0x4;
        wwc.a = (ajrb)builder.build();
        m.e(wwc, ajrw.d, s);
    }
    
    private static agza t(final aaag aaag) {
        final agza builder = amsm.a.createBuilder();
        final agza builder2 = amsn.a.createBuilder();
        final String a = aaag.a;
        builder2.copyOnWrite();
        final amsn amsn = (amsn)builder2.instance;
        a.getClass();
        final int b = amsn.b;
        int n = 1;
        amsn.b = (b | 0x1);
        amsn.c = a;
        builder.copyOnWrite();
        final amsm amsm = (amsm)builder.instance;
        final amsn i = (amsn)builder2.build();
        i.getClass();
        amsm.i = i;
        amsm.b |= 0x40;
        final int b2 = aaag.b;
        builder.copyOnWrite();
        final amsm amsm2 = (amsm)builder.instance;
        amsm2.b |= 0x1;
        amsm2.c = b2;
        final String j = vek.i(aaag.c());
        builder.copyOnWrite();
        final amsm amsm3 = (amsm)builder.instance;
        amsm3.b |= 0x2;
        amsm3.d = j;
        final int ct = aqql.cT(aaag.c.c);
        if (ct != 0) {
            n = ct;
        }
        builder.copyOnWrite();
        final amsm amsm4 = (amsm)builder.instance;
        amsm4.e = n - 1;
        amsm4.b |= 0x4;
        return builder;
    }
    
    final aaag a() {
        monitorenter(this);
        try {
            aaag aaag;
            for (aaag = this.l.poll(); aaag != null && !this.r(aaag); aaag = this.l.poll()) {
                this.f.add(aaag);
            }
            monitorexit(this);
            return aaag;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final afcr b(final aaag aaag, final aaah aaah) {
        monitorenter(this);
        try {
            final afcm d = afcr.d();
            d.h(aaag);
            if (aaah.a() <= 1) {
                final afcr g = d.g();
                monitorexit(this);
                return g;
            }
            int a = aaah.a();
            while (true) {
                final int n = a - 1;
                if (n <= 0) {
                    break;
                }
                final aaag aaag2 = this.l.peek();
                if (aaag2 == null) {
                    break;
                }
                if (!this.r(aaag2)) {
                    break;
                }
                if (aaag.b != aaag2.b) {
                    break;
                }
                int ct;
                if ((ct = aqql.cT(aaag.c.c)) == 0) {
                    ct = 1;
                }
                int ct2;
                if ((ct2 = aqql.cT(aaag2.c.c)) == 0) {
                    ct2 = 1;
                }
                if (ct != ct2 || !aaah.b().a((Object)aaag2.c)) {
                    break;
                }
                this.l.poll();
                d.h(aaag2);
                a = n;
            }
            final afcr g2 = d.g();
            monitorexit(this);
            return g2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Set c(final List list, final aaag aaag) {
        monitorenter(this);
        try {
            if (!this.h) {
                final afgq a = afgq.a;
                monitorexit(this);
                return (Set)a;
            }
            final HashSet set = new HashSet();
            if (list.isEmpty()) {
                monitorexit(this);
                return set;
            }
            set.addAll(list);
            if (aaag != null) {
                for (final aaag aaag2 : list) {
                    if (aaag2.a().h() && ((String)aaag2.a().c()).equals(aaag.a)) {
                        aaag.f.add(aaag2.a);
                        set.add(aaag);
                    }
                }
                this.d.put(aaag.a, aaag);
            }
            final ArrayList list2 = new ArrayList();
            for (final aaag aaag3 : list) {
                if (aaag3.b().h()) {
                    final String s = (String)aaag3.b().c();
                    if (!this.e.containsKey(s)) {
                        this.e.put(s, new HashSet());
                    }
                    ((Set<aaag>)this.e.get(s)).add(aaag3);
                }
                else {
                    list2.add(aaag3);
                }
                this.n(aaag3, 2);
                String.valueOf(aaag3);
            }
            this.l.addAll(list2);
            monitorexit(this);
            return set;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final Set d() {
        monitorenter(this);
        try {
            if (!this.h) {
                final afgq a = afgq.a;
                monitorexit(this);
                return (Set)a;
            }
            final afds i = afdu.i();
            i.k(this.l.iterator());
            i.j(this.f);
            final Iterator iterator = this.e.values().iterator();
            while (iterator.hasNext()) {
                i.j((Iterable)iterator.next());
            }
            final afdu g = i.g();
            monitorexit(this);
            return (Set)g;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final Set e(final aaag aaag, final aaag aaag2) {
        monitorenter(this);
        try {
            final HashSet set = new HashSet();
            this.p(aaag, aaag2, aaaj.e);
            aaag.d();
            set.add(aaag);
            final ArrayList list = new ArrayList();
            for (final amsh amsh : aaag.c.g) {
                try {
                    list.addAll(this.k.a(amsh, null));
                }
                catch (final aaan aaan) {
                    final int b = aaag.b;
                    final String message = aaan.getMessage();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("[Offline] Add failedChainAction failed on original action type: ");
                    sb.append(b);
                    sb.append(" ErrorMessage: ");
                    sb.append(message);
                    trn.b(sb.toString());
                }
            }
            set.addAll(new HashSet(this.c(list, null)));
            final String a = aaag.a;
            final HashSet set2 = new HashSet();
            final Set set3 = this.e.remove(a);
            if (set3 != null) {
                for (final aaag aaag3 : set3) {
                    this.n(aaag3, 5);
                    set2.addAll(this.e(aaag3, aaag3));
                }
            }
            set.addAll(set2);
            set.addAll(this.o(aaag, aaag2, true));
            monitorexit(this);
            return set;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final Set f(final aaag aaag, final aaag aaag2) {
        monitorenter(this);
        try {
            final HashSet set = new HashSet();
            set.add(aaag);
            if (aaag.e()) {
                this.p(aaag, aaag2, aaaj.b);
                this.q(aaag2);
                monitorexit(this);
                return set;
            }
            aaag.d();
            this.p(aaag, aaag2, aaaj.d);
            final Set set2 = this.e.remove(aaag.a);
            if (set2 != null) {
                final Iterator iterator = set2.iterator();
                while (iterator.hasNext()) {
                    ((aaag)iterator.next()).h = null;
                }
                this.m(set2);
                set.addAll(set2);
            }
            set.addAll(this.o(aaag, aaag2, false));
            monitorexit(this);
            return set;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void g() {
        synchronized (this) {
            this.h = false;
            this.i = null;
            this.l.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
        }
    }
    
    final void h(final aaag aaag, final aaaf aaaf, final List list, long millis, final long n, final boolean b) {
        final agza t = t(aaag);
        final boolean d = aaaf.d;
        boolean h = false;
        if (d) {
            h = h;
            if (!b) {
                h = true;
            }
        }
        t.copyOnWrite();
        final amsm amsm = (amsm)t.instance;
        final amsm a = amsm.a;
        amsm.b |= 0x20;
        amsm.h = h;
        final int f = aaaf.f;
        t.copyOnWrite();
        final amsm amsm2 = (amsm)t.instance;
        if (f == 0) {
            throw null;
        }
        amsm2.f = f - 1;
        amsm2.b |= 0x8;
        final int g = aaaf.g;
        t.copyOnWrite();
        final amsm amsm3 = (amsm)t.instance;
        if (g != 0) {
            amsm3.g = g - 1;
            amsm3.b |= 0x10;
            t.copyOnWrite();
            final amsm amsm4 = (amsm)t.instance;
            amsm4.b |= 0x100;
            amsm4.l = millis;
            millis = TimeUnit.NANOSECONDS.toMillis(aaag.d);
            t.copyOnWrite();
            final amsm amsm5 = (amsm)t.instance;
            amsm5.b |= 0x80;
            amsm5.k = n - millis;
            for (final aaag aaag2 : list) {
                final agza builder = amsn.a.createBuilder();
                final String a2 = aaag2.a;
                builder.copyOnWrite();
                final amsn amsn = (amsn)builder.instance;
                a2.getClass();
                amsn.b |= 0x1;
                amsn.c = a2;
                t.copyOnWrite();
                final amsm amsm6 = (amsm)t.instance;
                final amsn amsn2 = (amsn)builder.build();
                amsn2.getClass();
                final agzy j = amsm6.j;
                if (!j.c()) {
                    amsm6.j = agzi.mutableCopy(j);
                }
                amsm6.j.add((Object)amsn2);
            }
            this.s((amsm)t.build(), aaag.g, 4);
            return;
        }
        throw null;
    }
    
    public final void i() {
        monitorenter(this);
        try {
            for (final aaag aaag : new HashSet(this.f)) {
                if (this.r(aaag)) {
                    this.f.remove(aaag);
                    this.l(aaag);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void j() {
        final aepj i = this.i;
        if (i != null) {
            final aaap aaap = (aaap)((aaam)i.a).a.a();
            final ListenableFuture b = aaap.b;
            if (b == null || b.isDone()) {
                tcp.j(aaap.b = aaap.a.rw((Runnable)aaap), (Executor)afsl.a, (tcn)zqg.e);
            }
        }
    }
    
    public final void k(final Collection collection) {
        if (!collection.isEmpty()) {
            if (this.h) {
                final vdv c = ((vcf)this.b.a()).a(this.a).c();
                for (final aaag aaag : collection) {
                    if (aaag.i) {
                        c.g(vek.f(169, aaag.a));
                    }
                    else {
                        final String f = vek.f(169, aaag.a);
                        f.getClass();
                        agot.E(f.isEmpty() ^ true, (Object)"key cannot be empty");
                        final agza builder = amsl.a.createBuilder();
                        builder.copyOnWrite();
                        final amsl amsl = (amsl)builder.instance;
                        amsl.b |= 0x1;
                        amsl.e = f;
                        final amsi amsi = new amsi(builder);
                        final amsh c2 = aaag.c;
                        final agza a = amsi.a;
                        a.copyOnWrite();
                        final amsl amsl2 = (amsl)a.instance;
                        c2.getClass();
                        amsl2.f = c2;
                        amsl2.b |= 0x2;
                        final long d = aaag.d;
                        final agza a2 = amsi.a;
                        final long longValue = d;
                        a2.copyOnWrite();
                        final amsl amsl3 = (amsl)a2.instance;
                        amsl3.c = 11;
                        amsl3.d = longValue;
                        final String g = aaag.g;
                        final agza a3 = amsi.a;
                        a3.copyOnWrite();
                        final amsl amsl4 = (amsl)a3.instance;
                        g.getClass();
                        amsl4.b |= 0x10;
                        amsl4.g = g;
                        final int value = aaag.e.get();
                        final agza a4 = amsi.a;
                        final int intValue = value;
                        a4.copyOnWrite();
                        final amsl amsl5 = (amsl)a4.instance;
                        amsl5.b |= 0x80;
                        amsl5.l = intValue;
                        final boolean j = aaag.j;
                        final agza a5 = amsi.a;
                        final boolean booleanValue = (boolean)j;
                        a5.copyOnWrite();
                        final amsl amsl6 = (amsl)a5.instance;
                        amsl6.b |= 0x100;
                        amsl6.m = booleanValue;
                        if (aaag.a().h()) {
                            final String h = (String)aaag.a().c();
                            final agza a6 = amsi.a;
                            a6.copyOnWrite();
                            final amsl amsl7 = (amsl)a6.instance;
                            amsl7.b |= 0x20;
                            amsl7.h = h;
                        }
                        if (aaag.b().h()) {
                            final String i = (String)aaag.b().c();
                            final agza a7 = amsi.a;
                            a7.copyOnWrite();
                            final amsl amsl8 = (amsl)a7.instance;
                            amsl8.b |= 0x40;
                            amsl8.j = i;
                        }
                        if (aaag.e()) {
                            final afcr o = afcr.o((Collection)aaag.f);
                            if (o != null) {
                                if (!((List)o).isEmpty()) {
                                    for (final String s : o) {
                                        final agza a8 = amsi.a;
                                        a8.copyOnWrite();
                                        final amsl amsl9 = (amsl)a8.instance;
                                        s.getClass();
                                        final agzy k = amsl9.i;
                                        if (!k.c()) {
                                            amsl9.i = agzi.mutableCopy(k);
                                        }
                                        amsl9.i.add((Object)s);
                                    }
                                }
                            }
                        }
                        c.d((vdm)amsi.b((vdo)((vcf)this.b.a()).a(this.a)));
                    }
                }
                try {
                    c.b().X();
                }
                catch (final RuntimeException ex) {
                    trn.d("[Offline] orchestration error writing to store", (Throwable)ex);
                    this.g();
                }
            }
        }
    }
    
    public final void l(final aaag aaag) {
        synchronized (this) {
            this.l.add(aaag);
            this.j();
        }
    }
    
    public final void m(final Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.l((aaag)iterator.next());
        }
        this.j();
    }
    
    final void n(final aaag aaag, final int n) {
        this.s((amsm)t(aaag).build(), aaag.g, n);
    }
}
