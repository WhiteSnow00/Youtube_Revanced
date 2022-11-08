import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aadf implements aadu
{
    private static final Pattern a;
    private final vcf b;
    private final zki c;
    private final aaal d;
    
    static {
        a = Pattern.compile("^(.*):(.*):(.*)$");
    }
    
    public aadf(final vcf b, final aaal d, final zki c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    private static aadh i(final zkh zkh, final aouz aouz, final vdn vdn) {
        final zyp zyp = new zyp(vdn);
        final String e = aouz.e();
        final int e2 = aadj.e((zyq)zyp);
        final aouv transferState = aouz.getTransferState();
        final aouw failureReason = aouz.getFailureReason();
        aouz.getCotn();
        return new aadh(zkh, e, (zyq)zyp, e2, transferState, failureReason);
    }
    
    public final aexq a(final String s) {
        final zkh c = this.c.c();
        final vce a = this.b.a(c);
        final aouz aouz = (aouz)a.f(s).j((Class)aouz.class).af();
        if (aouz == null) {
            return (aexq)aewp.a;
        }
        return aexq.k(i(c, aouz, (vdn)a.j(s).ab()));
    }
    
    public final List b(final zkh zkh) {
        final vce a = this.b.a(zkh);
        final aaal d = this.d;
        final ArrayList list = new ArrayList();
        vem.ai(zvj.d, 2, Long.valueOf((long)aouv.f.i), d, (List)list);
        final vcl d2 = zvj.d;
        final long n = aouv.g.i;
        d.x(d2);
        list.add(new vch(d2, Long.valueOf(n)));
        final afcr afcr = (afcr)a.l(vem.an(d, (List)list)).ab();
        final ArrayList list2 = new ArrayList(afcr.size());
        for (int size = ((List)afcr).size(), i = 0; i < size; ++i) {
            final String s = (String)((List)afcr).get(i);
            list2.add((Object)i(zkh, (aouz)a.f(s).j((Class)aouz.class).af(), (vdn)a.j(s).ab()));
        }
        return list2;
    }
    
    public final void c(final aadh aadh) {
        this.h(aadh);
    }
    
    public final void d(final aadh aadh) {
    }
    
    public final void e() {
    }
    
    public final void f(final aadh aadh) {
    }
    
    public final void g(final String s) {
    }
    
    public final void h(final aadh aadh) {
        zkh zkh = aadh.l;
        String s;
        if (zkh == zkg.a) {
            zkh = this.c.c();
            if (!zkh.d().equals(aadh.g)) {
                return;
            }
            final Matcher matcher = aadf.a.matcher(aadh.a);
            if (!matcher.matches()) {
                return;
            }
            final String group = matcher.group(2);
            if (group == null) {
                return;
            }
            s = vek.h(120, group);
        }
        else {
            s = aadh.a;
        }
        final vce a = this.b.a(zkh);
        final aouz aouz = (aouz)a.f(s).j((Class)aouz.class).af();
        if (aouz == null) {
            return;
        }
        final aoux f = aouz.f();
        f.g(aadh.j);
        final agzc a2 = f.a;
        a2.copyOnWrite();
        final aova aova = (aova)a2.instance;
        final aova a3 = aova.a;
        aova.c &= 0xFFFFFFFB;
        aova.g = 0;
        final aouw k = aadh.k;
        if (k != null) {
            f.e(k);
        }
        aadj.P(aadh.f, aadh.i);
        final vdv c = a.c();
        c.d((vdm)f.b((vdo)a));
        final String e = aouz.e();
        final zyq f2 = aadh.f;
        vdn vdn;
        if (f2 instanceof zyp) {
            vdn = ((zyp)f2).f();
        }
        else {
            final zzn zzn = (zzn)aadh.e;
            final zzn zzn2 = (zzn)f2;
            final zyp zyp = new zyp(vdn.a);
            final afie i = zzn.f().k();
            while (((Iterator)i).hasNext()) {
                aaiw.w((zyq)zzn, (zyq)zyp, (String)((Iterator)i).next());
            }
            final afie j = zzn2.f().k();
            while (((Iterator)j).hasNext()) {
                aaiw.w((zyq)zzn2, (zyq)zyp, (String)((Iterator)j).next());
            }
            vdn = zyp.f();
        }
        c.f(e, vdn);
        c.b().X();
    }
}
