import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagy implements aahn
{
    private static final Pattern a;
    private final vfn b;
    private final zoa c;
    private final aaec d;
    
    static {
        a = Pattern.compile("^(.*):(.*):(.*)$");
    }
    
    public aagy(final vfn b, final aaec d, final zoa c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    private static aaha i(final znz znz, final aozo aozo, final vgw vgw) {
        final aacg aacg = new aacg(vgw);
        final String e = aozo.e();
        final int e2 = aahc.e((aach)aacg);
        final aozk transferState = aozo.getTransferState();
        final aozl failureReason = aozo.getFailureReason();
        aozo.getCotn();
        return new aaha(znz, e, (aach)aacg, e2, transferState, failureReason);
    }
    
    @Override
    public final afbh a(final String s) {
        final znz c = this.c.c();
        final vfm a = this.b.a(c);
        final aozo aozo = (aozo)a.g(s).j(aozo.class).af();
        if (aozo == null) {
            return afag.a;
        }
        return afbh.k(i(c, aozo, (vgw)a.l(s).ac()));
    }
    
    @Override
    public final List b(final znz znz) {
        final vfm a = this.b.a(znz);
        final aaec d = this.d;
        final ArrayList list = new ArrayList();
        vfw.an(zzb.d, 2, Long.valueOf((long)aozk.f.i), d, (List)list);
        final vft d2 = zzb.d;
        final long n = aozk.g.i;
        d.x(d2);
        list.add(new vfp(d2, Long.valueOf(n)));
        final afgh afgh = (afgh)a.m(vfw.ar(d, (List)list)).ac();
        final ArrayList list2 = new ArrayList(afgh.size());
        for (int size = afgh.size(), i = 0; i < size; ++i) {
            final String s = afgh.get(i);
            list2.add((Object)i(znz, (aozo)a.g(s).j(aozo.class).af(), (vgw)a.l(s).ac()));
        }
        return list2;
    }
    
    @Override
    public final void c(final aaha aaha) {
        this.h(aaha);
    }
    
    @Override
    public final void d(final aaha aaha) {
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final void f(final aaha aaha) {
    }
    
    @Override
    public final void g(final String s) {
    }
    
    @Override
    public final void h(final aaha aaha) {
        znz znz = aaha.l;
        String s;
        if (znz == zny.a) {
            znz = this.c.c();
            if (!znz.d().equals(aaha.g)) {
                return;
            }
            final Matcher matcher = aagy.a.matcher(aaha.a);
            if (!matcher.matches()) {
                return;
            }
            final String group = matcher.group(2);
            if (group == null) {
                return;
            }
            s = vht.h(120, group);
        }
        else {
            s = aaha.a;
        }
        final vfm a = this.b.a(znz);
        final aozo aozo = (aozo)a.g(s).j(aozo.class).af();
        if (aozo == null) {
            return;
        }
        final aozm f = aozo.f();
        f.g(aaha.j);
        final ahct a2 = f.a;
        ((ahcr)a2).copyOnWrite();
        final aozp aozp = (aozp)a2.instance;
        final aozp a3 = aozp.a;
        aozp.c &= 0xFFFFFFFB;
        aozp.g = 0;
        final aozl k = aaha.k;
        if (k != null) {
            f.e(k);
        }
        aahc.P(aaha.f, aaha.i);
        final vhe d = a.d();
        d.d((vgv)f.b((vgx)a));
        final String e = aozo.e();
        final aach f2 = aaha.f;
        vgw vgw;
        if (f2 instanceof aacg) {
            vgw = ((aacg)f2).f();
        }
        else {
            final aade aade = (aade)aaha.e;
            final aade aade2 = (aade)f2;
            final aacg aacg = new aacg(vgw.a);
            final aflu i = aade.f().k();
            while (((Iterator)i).hasNext()) {
                aamn.w((aach)aade, (aach)aacg, (String)((Iterator)i).next());
            }
            final aflu j = aade2.f().k();
            while (((Iterator)j).hasNext()) {
                aamn.w((aach)aade2, (aach)aacg, (String)((Iterator)j).next());
            }
            vgw = aacg.f();
        }
        d.f(e, vgw);
        d.b().X();
    }
}
