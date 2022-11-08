import java.util.ArrayList;
import java.util.List;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hku implements hlf, euj
{
    public final Map a;
    final Map b;
    final Map c;
    private final Set d;
    private final Set e;
    private final Set f;
    private final AtomicBoolean g;
    
    public hku() {
        this.g = new AtomicBoolean(false);
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }
    
    public final void a(final eui eui) {
        if (this.g.get()) {
            this.e.add(eui);
            return;
        }
        this.d.add(eui);
    }
    
    public final void b(final eui eui) {
        if (this.g.get()) {
            this.f.add(eui);
            return;
        }
        this.d.remove(eui);
    }
    
    public final aexq c(final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint) {
        anss anss;
        if ((anss = reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.b) == null) {
            anss = anss.a;
        }
        if (!((agzd)anss).rs((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer)) {
            return (aexq)aewp.a;
        }
        anss anss2;
        if ((anss2 = reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.b) == null) {
            anss2 = anss.a;
        }
        final anqm anqm = (anqm)((agzd)anss2).rr((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer);
        if (anqm.e.isEmpty()) {
            return (aexq)aewp.a;
        }
        if (this.b.containsKey(anqm.e)) {
            return aexq.k(this.b.get(anqm.e));
        }
        return (aexq)aewp.a;
    }
    
    public final void d(final trb trb) {
        monitorenter(this);
        try {
            this.g.set(true);
            for (final eui eui : this.d) {
                if (eui != null) {
                    trb.a((Object)eui);
                }
            }
            this.g.set(false);
            this.d.addAll(this.e);
            this.d.removeAll(this.f);
            this.e.clear();
            this.f.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d((trb)hen.l);
    }
    
    public final void f(final aioe aioe, final ViewGroup viewGroup) {
        if (!iba.y(aioe)) {
            return;
        }
        if (!((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            if (((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
                final aexq c = this.c((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint));
                if (!c.h()) {
                    return;
                }
                final sez sez = (sez)c.c();
                final ViewGroup c2 = sez.c;
                if (c2 != null) {
                    if (aeda.v((Object)viewGroup, (Object)c2)) {
                        return;
                    }
                    this.h(aioe);
                }
                sez.c = viewGroup;
                this.d((trb)new hks(sez, 3));
            }
            return;
        }
        final sey sey = this.a.get(((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        if (sey == null) {
            return;
        }
        final ViewGroup c3 = sey.c;
        if (c3 != null) {
            if (aeda.v((Object)viewGroup, (Object)c3)) {
                return;
            }
            this.h(aioe);
        }
        sey.c = viewGroup;
        this.d((trb)new hks(sey, 2));
    }
    
    public final void g(final aioe aioe, final akve akve) {
        if (!((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if (this.a.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            ((sey)this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint)).a(akve);
        }
    }
    
    public final void h(final aioe aioe) {
        if (!((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            if (((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
                final aexq c = this.c((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint));
                if (!c.h()) {
                    return;
                }
                final sez sez = (sez)c.c();
                if (sez.c != null) {
                    if (sez.d) {
                        qcv.w((sfh)null, "Trying to detach view for reel imageAds page before it is exited");
                    }
                    this.d((trb)new hks(sez, 5));
                    sez.c = null;
                }
            }
            return;
        }
        final sey sey = this.a.get(((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        if (sey == null) {
            return;
        }
        if (sey.c != null) {
            if (sey.d) {
                qcv.w((sfh)null, "Trying to detach view for reel page before it is exited");
            }
            this.d((trb)new hks(sey, 4));
            sey.c = null;
        }
    }
    
    public final void i(final List list) {
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        for (final aioe aioe : list) {
            if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                if (!iba.z(reelWatchEndpointOuterClass$ReelWatchEndpoint) || this.a.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                    continue;
                }
                final sey sey = new sey(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                list2.add(sey);
                this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint, sey);
            }
            else {
                if (!((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
                    continue;
                }
                final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint = (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint);
                anss anss;
                if ((anss = reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.b) == null) {
                    anss = anss.a;
                }
                if (!((agzd)anss).rs((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer)) {
                    continue;
                }
                anss anss2;
                if ((anss2 = reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.b) == null) {
                    anss2 = anss.a;
                }
                final anqm anqm = (anqm)((agzd)anss2).rr((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer);
                if (anqm.e.isEmpty()) {
                    continue;
                }
                anql anql;
                if ((anql = anqm.d) == null) {
                    anql = anql.a;
                }
                if (!((agzd)anql).rs((agyr)anqj.b)) {
                    continue;
                }
                anql anql2;
                if ((anql2 = anqm.d) == null) {
                    anql2 = anql.a;
                }
                final sez sez = new sez(anqm, (anqj)((agzd)anql2).rr((agyr)anqj.b));
                this.b.put(anqm.e, sez);
                list3.add(sez);
            }
        }
        if (!list3.isEmpty()) {
            this.d((trb)new hks((List)list3, 1));
        }
        final boolean empty = list2.isEmpty();
        int i = 0;
        if (!empty) {
            this.d((trb)new hks((List)list2, 0));
        }
        while (i < list2.size()) {
            final sey sey2 = (sey)list2.get(i);
            final String e = sey2.a.e;
            if (this.c.containsKey(e)) {
                sey2.a((akve)this.c.remove(e));
            }
            ++i;
        }
    }
    
    public final void j(final aioe aioe) {
        if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (this.a.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                final sey sey = this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                if (sey.c == null) {
                    qcv.v("Reel page was entered with no attached view");
                }
                sey.d = true;
                this.d((trb)new gzr(sey, 19));
            }
        }
        else if (((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
            final aexq c = this.c((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint));
            if (c.h()) {
                final sez sez = (sez)c.c();
                if (sez.c == null) {
                    qcv.v("No view attached for reels NVC when page entered");
                }
                sez.d = true;
                this.d((trb)new gzr(sez, 20));
            }
        }
    }
    
    public final void k(final aioe aioe, final int n) {
        if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (this.a.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                final sey sey = this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                sey.d = false;
                this.d((trb)new hkt(n, sey, 0));
            }
        }
        else if (((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
            final aexq c = this.c((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint));
            if (c.h()) {
                final sez sez = (sez)c.c();
                sez.d = false;
                this.d((trb)new hkt(n, sez, 2));
            }
        }
    }
    
    public final void l(final akve akve) {
        akvk akvk;
        if ((akvk = akve.g) == null) {
            akvk = akvk.a;
        }
        if (akvk.c.isEmpty()) {
            qcv.v("PlayerResponse with no videoId");
            return;
        }
        for (final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint : this.a.keySet()) {
            final String e = reelWatchEndpointOuterClass$ReelWatchEndpoint.e;
            akvk akvk2;
            if ((akvk2 = akve.g) == null) {
                akvk2 = akvk.a;
            }
            if (e.equals(akvk2.c)) {
                ((sey)this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint)).a(akve);
                return;
            }
        }
        final Map c = this.c;
        akvk akvk3;
        if ((akvk3 = akve.g) == null) {
            akvk3 = akvk.a;
        }
        c.put(akvk3.c, akve);
    }
}
