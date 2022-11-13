import android.database.Cursor;
import java.util.UUID;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import android.util.Log;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coj implements Runnable
{
    static final String a;
    public static final int j = 0;
    final Context b;
    public final crh c;
    cmr d;
    public volatile boolean e;
    final ctk f;
    public final ctk g;
    cky h;
    final ajb i;
    private final String k;
    private final List l;
    private final cmd m;
    private final cqd n;
    private final WorkDatabase o;
    private final cri p;
    private final cqi q;
    private final List r;
    private String s;
    
    static {
        a = cms.b("WorkerWrapper");
    }
    
    public coj(final coi coi) {
        this.h = cky.a();
        this.f = ctk.f();
        this.g = ctk.f();
        this.b = coi.a;
        this.i = coi.h;
        this.n = coi.b;
        final crh e = coi.e;
        this.c = e;
        this.k = e.c;
        this.l = coi.f;
        this.d = null;
        this.m = coi.c;
        final WorkDatabase d = coi.d;
        this.o = d;
        this.p = d.w();
        this.q = d.r();
        this.r = coi.g;
    }
    
    private final void e() {
        ((cft)this.o).k();
        try {
            this.p.k(1, this.k);
            this.p.f(this.k, System.currentTimeMillis());
            this.p.j(this.k, -1L);
            ((cft)this.o).n();
        }
        finally {
            ((cft)this.o).l();
            this.g(true);
        }
    }
    
    private final void f() {
        ((cft)this.o).k();
        try {
            this.p.f(this.k, System.currentTimeMillis());
            this.p.k(1, this.k);
            cri cri = this.p;
            final String k = this.k;
            ((crw)cri).a.j();
            chc chc = ((crw)cri).e.d();
            chc.g(1, k);
            ((crw)cri).a.k();
            try {
                chc.b();
                ((crw)cri).a.n();
                ((crw)cri).a.l();
                ((crw)cri).e.f(chc);
                cri = this.p;
                final String i = this.k;
                ((crw)cri).a.j();
                chc = ((crw)cri).c.d();
                chc.g(1, i);
                ((crw)cri).a.k();
                try {
                    chc.b();
                    ((crw)cri).a.n();
                    ((crw)cri).a.l();
                    ((crw)cri).c.f(chc);
                    this.p.j(this.k, -1L);
                    ((cft)this.o).n();
                }
                finally {
                    ((crw)cri).a.l();
                    ((crw)cri).c.f(chc);
                }
            }
            finally {
                ((crw)cri).a.l();
                ((crw)cri).e.f(chc);
            }
        }
        finally {
            ((cft)this.o).l();
            this.g(false);
        }
    }
    
    private final void g(final boolean b) {
        ((cft)this.o).k();
        try {
            final cri w = this.o.w();
            Object o = cfv.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            ((crw)w).a.j();
            Object o2 = bsg.d(((crw)w).a, (cgs)o, false);
            try {
                final boolean b2 = ((Cursor)o2).moveToFirst() && ((Cursor)o2).getInt(0) != 0;
                ((Cursor)o2).close();
                ((cfv)o).j();
                if (!b2) {
                    csm.a(this.b, (Class)RescheduleReceiver.class, false);
                }
                if (b) {
                    this.p.k(1, this.k);
                    this.p.j(this.k, -1L);
                }
                if (this.d != null) {
                    o2 = this.n;
                    final String k = this.k;
                    synchronized (((cnt)o2).i) {
                        final boolean containsKey = ((cnt)o2).e.containsKey(k);
                        monitorexit(((cnt)o2).i);
                        if (containsKey) {
                            final cqd n = this.n;
                            o2 = this.k;
                            o = ((cnt)n).i;
                            synchronized (((cnt)o2).i) {
                                ((cnt)n).e.remove(o2);
                                ((cnt)n).d();
                            }
                        }
                    }
                }
                ((cft)this.o).n();
                ((cft)this.o).l();
                this.f.g(b);
            }
            finally {
                ((Cursor)o2).close();
                ((cfv)o).j();
            }
        }
        finally {
            ((cft)this.o).l();
        }
    }
    
    private final void h() {
        final int h = this.p.h(this.k);
        if (h == 2) {
            cms.a();
            this.g(true);
            return;
        }
        cms.a();
        cht.c(h);
        this.g(false);
    }
    
    public final cqw a() {
        return chu.j(this.c);
    }
    
    final void b() {
        if (!this.d()) {
            ((cft)this.o).k();
            try {
                final int h = this.p.h(this.k);
                Object o = this.o.v();
                final String k = this.k;
                ((cre)o).a.j();
                Object o2 = ((cre)o).b.d();
                ((chb)o2).g(1, k);
                ((cre)o).a.k();
                try {
                    ((chc)o2).b();
                    ((cre)o).a.n();
                    ((cre)o).a.l();
                    ((cre)o).b.f((chc)o2);
                    Label_0542: {
                        if (h == 0) {
                            this.g(false);
                        }
                        else if (h == 2) {
                            o2 = this.h;
                            if (o2 instanceof cmq) {
                                cms.a();
                                if (this.c.e()) {
                                    this.f();
                                    break Label_0542;
                                }
                                ((cft)this.o).k();
                                try {
                                    this.p.k(3, this.k);
                                    this.p.g(this.k, ((cmq)this.h).a);
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    for (final String s : this.q.a(this.k)) {
                                        if (this.p.h(s) == 5) {
                                            o = this.q;
                                            final cfv a = cfv.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                            if (s == null) {
                                                a.f(1);
                                            }
                                            else {
                                                a.g(1, s);
                                            }
                                            ((cqk)o).a.j();
                                            o = bsg.d(((cqk)o).a, (cgs)a, false);
                                            try {
                                                final boolean b = ((Cursor)o).moveToFirst() && ((Cursor)o).getInt(0) != 0;
                                                ((Cursor)o).close();
                                                a.j();
                                                if (b) {
                                                    cms.a();
                                                    this.p.k(1, s);
                                                    this.p.f(s, currentTimeMillis);
                                                    continue;
                                                }
                                                continue;
                                            }
                                            finally {
                                                ((Cursor)o).close();
                                                a.j();
                                            }
                                            break;
                                        }
                                    }
                                    ((cft)this.o).n();
                                    break Label_0542;
                                }
                                finally {
                                    ((cft)this.o).l();
                                    this.g(false);
                                }
                            }
                            if (o2 instanceof cmp) {
                                cms.a();
                                this.e();
                            }
                            else {
                                cms.a();
                                if (this.c.e()) {
                                    this.f();
                                }
                                else {
                                    this.c();
                                }
                            }
                        }
                        else if (!cht.d(h)) {
                            this.e();
                        }
                    }
                    ((cft)this.o).n();
                }
                finally {
                    ((cre)o).a.l();
                    ((cre)o).b.f((chc)o2);
                }
            }
            finally {
                ((cft)this.o).l();
            }
        }
        final List l = this.l;
        if (l != null) {
            final Iterator iterator2 = l.iterator();
            while (iterator2.hasNext()) {
                ((cnv)iterator2.next()).b(this.k);
            }
            cnw.b(this.m, this.o, this.l);
        }
    }
    
    final void c() {
        ((cft)this.o).k();
        try {
            final String k = this.k;
            final LinkedList<String> list = new LinkedList<String>();
            list.add(k);
            while (!list.isEmpty()) {
                final String s = list.remove();
                if (this.p.h(s) != 6) {
                    this.p.k(4, s);
                }
                list.addAll(this.q.a(s));
            }
            this.p.g(this.k, ((cmo)this.h).a);
            ((cft)this.o).n();
            ((cft)this.o).l();
            this.g(false);
        }
        finally {
            ((cft)this.o).l();
            this.g(false);
            while (true) {}
        }
    }
    
    public final boolean d() {
        if (this.e) {
            cms.a();
            final int h = this.p.h(this.k);
            if (h == 0) {
                this.g(false);
            }
            else {
                this.g(cht.d(h) ^ true);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final void run() {
        Object o = this.r;
        final StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.k);
        sb.append(", tags={ ");
        final Iterator iterator = ((List)o).iterator();
        int n = 1;
        while (iterator.hasNext()) {
            o = iterator.next();
            if (n == 0) {
                sb.append(", ");
            }
            sb.append((String)o);
            n = 0;
        }
        sb.append(" } ]");
        this.s = sb.toString();
        if (this.d()) {
            return;
        }
        ((cft)this.o).k();
        try {
            final crh c = this.c;
            if (c.t != 1) {
                this.h();
                ((cft)this.o).n();
                cms.a();
                ((cft)this.o).l();
                return;
            }
            if ((c.e() || c.d()) && System.currentTimeMillis() < this.c.a()) {
                cms.a();
                String.format("Delaying execution for %s because it is being executed before schedule.", this.c.d);
                this.g(true);
                ((cft)this.o).n();
                ((cft)this.o).l();
                return;
            }
            ((cft)this.o).n();
            ((cft)this.o).l();
            o = this.c;
        Block_15_Outer:
            while (true) {
                if (((crh)o).e()) {
                    final cmi f = ((crh)o).f;
                    break Label_0267;
                }
                final ckm k = this.m.k;
                final cmm b = cmm.b(((crh)o).e);
                if (b == null) {
                    cms.a();
                    Log.e(coj.a, "Could not create Input Merger ".concat(String.valueOf(this.c.e)));
                    this.c();
                    return;
                }
                Label_0501: {
                    Label_0325: {
                        break Label_0325;
                        break Label_0501;
                    }
                    final ArrayList list = new ArrayList();
                    list.add(this.c.f);
                    final cri p = this.p;
                    final String i = this.k;
                    o = cfv.a("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                    ((cfv)o).g(1, i);
                    final crw crw = (crw)p;
                    crw.a.j();
                    Object o2 = bsg.d(crw.a, (cgs)o, false);
                    try {
                        final ArrayList list2 = new ArrayList(((Cursor)o2).getCount());
                        while (((Cursor)o2).moveToNext()) {
                            byte[] blob;
                            if (((Cursor)o2).isNull(0)) {
                                blob = null;
                            }
                            else {
                                blob = ((Cursor)o2).getBlob(0);
                            }
                            list2.add((Object)cmi.a(blob));
                        }
                        ((Cursor)o2).close();
                        ((cfv)o).j();
                        list.addAll(list2);
                        b.a((List)list);
                        continue;
                        Label_0675: {
                            final cmr d;
                            iftrue(Label_0737:)(!d.f);
                        }
                        Block_16: {
                            while (true) {
                                Block_17: {
                                    break Block_17;
                                    while (true) {
                                        final cmr d = this.d;
                                        iftrue(Label_0675:)(d != null);
                                        break Block_16;
                                        this.d = this.m.c.b(this.b, this.c.d, (WorkerParameters)o);
                                        continue Block_15_Outer;
                                    }
                                }
                                cms.a();
                                o = coj.a;
                                final StringBuilder sb2 = new StringBuilder("Received an already-used Worker ");
                                sb2.append(this.c.d);
                                sb2.append("; Worker Factory should return new instances");
                                Log.e((String)o, sb2.toString());
                                this.c();
                                return;
                                cmr d = null;
                                Label_0737:
                                d.f = true;
                                ((cft)this.o).k();
                                try {
                                    int l = 0;
                                    Label_0906: {
                                        if (this.p.h(this.k) == 1) {
                                            this.p.k(2, this.k);
                                            final cri p2 = this.p;
                                            final String j = this.k;
                                            ((crw)p2).a.j();
                                            final chc d2 = ((crw)p2).d.d();
                                            d2.g(1, j);
                                            ((crw)p2).a.k();
                                            try {
                                                d2.b();
                                                ((crw)p2).a.n();
                                                ((crw)p2).a.l();
                                                ((crw)p2).d.f(d2);
                                                l = 1;
                                                break Label_0906;
                                            }
                                            finally {
                                                ((crw)p2).a.l();
                                                ((crw)p2).d.f(d2);
                                            }
                                        }
                                        l = 0;
                                    }
                                    ((cft)this.o).n();
                                    ((cft)this.o).l();
                                    if (l != 0) {
                                        if (!this.d()) {
                                            final csv csv = new csv(this.b, this.c, this.d, ((WorkerParameters)o).g, this.i, (byte[])null, (byte[])null, (byte[])null);
                                            ((Executor)this.i.a).execute((Runnable)csv);
                                            final ctk e = csv.e;
                                            this.g.addListener((Runnable)new bhd(this, (ListenableFuture)e, 20), (Executor)new doy(1));
                                            ((ListenableFuture)e).addListener(new coh(this, (ListenableFuture)e, 1), (Executor)this.i.a);
                                            this.g.addListener(new coh(this, this.s, 0), (Executor)this.i.c);
                                        }
                                        return;
                                    }
                                    this.h();
                                    return;
                                }
                                finally {
                                    ((cft)this.o).l();
                                }
                                final UUID fromString = UUID.fromString(this.k);
                                o = this.r;
                                int l = this.c.l;
                                final cmd m = this.m;
                                o2 = m.a;
                                final ajb i2 = this.i;
                                final cne c2 = m.c;
                                final int a = csx.a;
                                final cmi f;
                                o = new WorkerParameters(fromString, f, (Collection)o, l, (Executor)o2, i2, c2, (cml)new csw(this.o, this.n, this.i, (byte[])null, (byte[])null, (byte[])null), null, null, null);
                                iftrue(Label_0634:)(this.d != null);
                                continue;
                            }
                        }
                        cms.a();
                        Log.e(coj.a, "Could not create Worker ".concat(String.valueOf(this.c.d)));
                        this.c();
                    }
                    finally {
                        ((Cursor)o2).close();
                        ((cfv)o).j();
                    }
                }
                break;
            }
        }
        finally {
            ((cft)this.o).l();
            while (true) {}
        }
    }
}
