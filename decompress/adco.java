import android.text.TextUtils;
import android.content.res.Configuration;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import android.content.pm.ActivityInfo;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import android.content.pm.ResolveInfo;
import java.util.HashMap;
import java.util.List;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.Map;
import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adco extends acph implements adci, adel, ader, adda, adeg
{
    public final PackageManager a;
    public final veh b;
    public final adcp c;
    public final thg d;
    public final xab e;
    public final Map f;
    public final Map g;
    public final Executor h;
    public final afxj i;
    public boolean j;
    public String k;
    private final Context l;
    private final acmr m;
    private final int n;
    private final List o;
    private final acig p;
    private final boolean q;
    private final int r;
    private final adfa s;
    
    public adco(final apcp apcp, final Context l, final veh b, final ahvs ahvs, final List list, final adcp c, final thg d, final acig p14, final adfa s, final xab e, final boolean q, final Executor h, final afxj i, final byte[] array) {
        this.l = l;
        this.b = b;
        this.c = c;
        this.d = d;
        this.p = p14;
        this.s = s;
        this.e = e;
        this.q = q;
        int r;
        if (!c.l()) {
            r = 4;
        }
        else {
            r = 1;
        }
        this.r = r;
        this.h = h;
        i.getClass();
        this.i = i;
        this.f = new HashMap();
        this.g = new HashMap();
        this.m = new acmr();
        this.n = l.getResources().getInteger(2131493085);
        this.a = l.getPackageManager();
        final HashMap hashMap = new HashMap();
        for (final ResolveInfo resolveInfo : list) {
            tqf.Q((Map)hashMap, (Object)adfe.a(resolveInfo.activityInfo.applicationInfo.packageName, ahvs), (Object)resolveInfo);
        }
        this.o = new ArrayList();
        this.j = true;
        for (final aoeu aoeu : apcp.c) {
            if ((aoeu.b & 0x2) != 0x0) {
                aoet aoet;
                if ((aoet = aoeu.d) == null) {
                    aoet = aoet.a;
                }
                final Set set = (Set)hashMap.get(aoet.d);
                if (set != null && !set.isEmpty()) {
                    final Iterator iterator3 = set.iterator();
                    while (iterator3.hasNext()) {
                        final ResolveInfo resolveInfo2 = (ResolveInfo)iterator3.next();
                        final aoet q2 = acws.q(aoet, resolveInfo2);
                        final ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo != null && activityInfo.exported) {
                            this.f.put(q2, resolveInfo2);
                            this.o.add(q2);
                        }
                        iterator3.remove();
                    }
                }
                else {
                    this.o.add(aoet);
                }
            }
        }
        for (final aoem aoem : apcp.e) {
            if (aoem != null) {
                hashMap.remove(aoem.c);
            }
        }
        if ((apcp.b & 0x2) != 0x0) {
            final Iterator iterator5 = hashMap.values().iterator();
            while (iterator5.hasNext()) {
                for (final ResolveInfo resolveInfo3 : (Set)iterator5.next()) {
                    aoev aoev;
                    if ((aoev = apcp.d) == null) {
                        aoev = aoev.a;
                    }
                    aoet aoet2;
                    if ((aoev.b & 0x1) != 0x0) {
                        aoev aoev2;
                        if ((aoev2 = apcp.d) == null) {
                            aoev2 = aoev.a;
                        }
                        if ((aoet2 = aoev2.c) == null) {
                            aoet2 = aoet.a;
                        }
                    }
                    else {
                        aoet2 = null;
                    }
                    final aoet q3 = acws.q(aoet2, resolveInfo3);
                    this.f.put(q3, resolveInfo3);
                    this.o.add(q3);
                }
            }
        }
        this.m();
        s.i((adeg)this);
    }
    
    public static final alji k(final aoet aoet) {
        aisc aisc;
        if ((aisc = aoet.g) == null) {
            aisc = aisc.a;
        }
        akll akll;
        if ((akll = ((SendShareEndpoint$SendShareExternallyEndpoint)((ahcu)aisc).rx((ahci)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).d) == null) {
            akll = akll.a;
        }
        aoem aoem;
        if ((aoem = akll.c) == null) {
            aoem = aoem.a;
        }
        if (!aoem.d.isEmpty() && !aoem.e.isEmpty()) {
            final ahcr builder = ((ahcz)alji.a).createBuilder();
            final ahcr builder2 = ((ahcz)aljo.a).createBuilder();
            final String format = String.format("%s/%s", aoem.d, aoem.e);
            builder2.copyOnWrite();
            final aljo aljo = (aljo)builder2.instance;
            format.getClass();
            aljo.b |= 0x1;
            aljo.c = format;
            builder.copyOnWrite();
            final alji alji = (alji)builder.instance;
            final aljo j = (aljo)builder2.build();
            j.getClass();
            alji.j = j;
            alji.b |= 0x20;
            return (alji)builder.build();
        }
        return null;
    }
    
    private final void m() {
        if (this.q && !this.j) {
            this.m.clear();
            return;
        }
        final Iterator iterator = this.o.iterator();
        while (iterator.hasNext()) {
            this.e.D((xbe)new wzy(((aoet)iterator.next()).h));
        }
        final adcn adcn = new adcn(this.o, this.n);
        this.m.clear();
        boolean b = this.c.l() ^ true;
        for (int i = 0; i < adcn.size(); ++i) {
            final List a = adcn.a(i);
            if (i < this.r) {
                this.m.add((Object)new adec(this.n, a));
            }
            else {
                this.m.add((Object)aamz.J(this.n, a, 0, 0, 0, 0, 0));
                b = false;
            }
        }
        this.c.i(b);
    }
    
    public final acla a() {
        return this.m;
    }
    
    @Override
    public final void d(final List list) {
    }
    
    @Override
    public final void e(final acmh acmh) {
        final adcm adcm = new adcm(0);
        acmh.f(aoet.class, (acmf)new ful(this.l, (ader)this, this.p, 16));
        final ful ful = new ful(this.l, (afci)adcm, acmh, 15);
        acmh.f(aclb.class, (acmf)ful);
        acmh.f(adec.class, (acmf)ful);
    }
    
    public final void f(final String k) {
        this.k = k;
    }
    
    public final void h() {
    }
    
    public final void i() {
        this.c.b(false);
    }
    
    public final void j() {
        this.c.b(false);
        this.c.h();
        this.d.d((Object)new adcr());
    }
    
    public final void l() {
    }
    
    @Override
    public final void lI(final Configuration configuration) {
        this.m();
    }
    
    @Override
    public final void sa() {
        this.s.k((adeg)this);
    }
    
    public final void tj(final adfa adfa) {
        final boolean empty = TextUtils.isEmpty((CharSequence)null);
        boolean j = false;
        if (empty) {
            if (((Set)adfa.b).isEmpty()) {
                j = true;
            }
        }
        this.j = j;
        if (this.q) {
            this.m();
            return;
        }
        this.m.l();
    }
}
