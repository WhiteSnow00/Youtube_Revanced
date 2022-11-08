import java.util.List;
import java.util.Collection;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cok implements cnu, cpb, cng
{
    Boolean a;
    private final Context b;
    private final coe c;
    private final cpc d;
    private final Set e;
    private final coj f;
    private boolean g;
    private final Object h;
    private final dmk i;
    
    static {
        cmr.b("GreedyScheduler");
    }
    
    public cok(final Context b, final cmc cmc, final der der, final coe c, final byte[] array) {
        this.e = new HashSet();
        this.i = new dmk((char[])null);
        this.b = b;
        this.c = c;
        this.d = (cpc)new cpd(der, (cpb)this, null);
        this.f = new coj(this, cmc.d);
        this.h = new Object();
    }
    
    private final void g() {
        this.a = csm.a(this.b, this.c.c);
    }
    
    private final void h() {
        if (!this.g) {
            this.c.f.b((cng)this);
            this.g = true;
        }
    }
    
    public final void a(final cqv cqv, final boolean b) {
        this.i.U(cqv);
        final Object h = this.h;
        monitorenter(h);
        try {
            for (final crg crg : this.e) {
                if (cht.j(crg).equals((Object)cqv)) {
                    cmr.a();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Stopping tracking for ");
                    sb.append(cqv);
                    this.e.remove(crg);
                    this.d.a((Iterable)this.e);
                    break;
                }
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    public final void b(final String s) {
        if (this.a == null) {
            this.g();
        }
        if (!this.a) {
            cmr.a();
            return;
        }
        this.h();
        cmr.a();
        final coj f = this.f;
        if (f != null) {
            final Runnable runnable = f.c.remove(s);
            if (runnable != null) {
                f.b.a(runnable);
            }
        }
        final Iterator iterator = this.i.o(s).iterator();
        while (iterator.hasNext()) {
            this.c.p((avt)iterator.next());
        }
    }
    
    public final void c(crg... h) {
        if (this.a == null) {
            this.g();
        }
        if (!this.a) {
            cmr.a();
            return;
        }
        this.h();
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        for (final crg crg : h) {
            if (!this.i.p(cht.j(crg))) {
                final long a = crg.a();
                final long currentTimeMillis = System.currentTimeMillis();
                if (crg.t == 1) {
                    if (currentTimeMillis < a) {
                        final coj f = this.f;
                        if (f != null) {
                            final Runnable runnable = f.c.remove(crg.c);
                            if (runnable != null) {
                                f.b.a(runnable);
                            }
                            final cog cog = new cog(f, crg, 2);
                            f.c.put(crg.c, cog);
                            f.b.b(crg.a() - System.currentTimeMillis(), (Runnable)cog);
                        }
                    }
                    else if (crg.c()) {
                        final cme k = crg.k;
                        if (k.c) {
                            cmr.a();
                            new StringBuilder("Ignoring ").append(crg);
                        }
                        else if (k.a()) {
                            cmr.a();
                            new StringBuilder("Ignoring ").append(crg);
                        }
                        else {
                            set.add(crg);
                            set2.add(crg.c);
                        }
                    }
                    else if (!this.i.p(cht.j(crg))) {
                        cmr.a();
                        final String c = crg.c;
                        final coe c2 = this.c;
                        final dmk j = this.i;
                        crg.getClass();
                        c2.n(j.V(cht.j(crg)));
                    }
                }
            }
        }
        h = (crg[])this.h;
        monitorenter(h);
        try {
            if (!set.isEmpty()) {
                TextUtils.join((CharSequence)",", (Iterable)set2);
                cmr.a();
                this.e.addAll(set);
                this.d.a((Iterable)this.e);
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    public final boolean d() {
        return false;
    }
    
    public final void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final cqv j = cht.j((crg)iterator.next());
            if (!this.i.p(j)) {
                cmr.a();
                new StringBuilder("Constraints met: Scheduling work ID ").append(j);
                j.toString();
                this.c.n(this.i.V(j));
            }
        }
    }
    
    public final void f(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final cqv j = cht.j((crg)iterator.next());
            cmr.a();
            new StringBuilder("Constraints not met: Cancelling work ID ").append(j);
            j.toString();
            final avt u = this.i.U(j);
            if (u != null) {
                this.c.p(u);
            }
        }
    }
}
