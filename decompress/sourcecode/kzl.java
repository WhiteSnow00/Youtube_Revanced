import java.util.Collection;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.util.Iterator;
import java.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Set;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzl
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public kzl(final atjj b, final atjj d, final atjj h, final atjj i, final atjj g, final atjj c, final atjj j, final atjj a, final atjj e, final atjj f) {
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        g.getClass();
        this.g = g;
        this.c = c;
        this.j = j;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
    }
    
    public kzl(final atjj j, final atjj c, final atjj h, final atjj g, final atjj e, final atjj a, final atjj b, final atjj d, final atjj i, final atjj f, final byte[] array) {
        j.getClass();
        this.j = j;
        c.getClass();
        this.c = c;
        this.h = h;
        g.getClass();
        this.g = g;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        i.getClass();
        this.i = i;
        f.getClass();
        this.f = f;
    }
    
    public kzl(final atjj j, final atjj c, final atjj h, final atjj g, final atjj e, final atjj a, final atjj f, final atjj b, final atjj d, final atjj i, final byte[] array, final byte[] array2) {
        j.getClass();
        this.j = j;
        c.getClass();
        this.c = c;
        this.h = h;
        g.getClass();
        this.g = g;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        i.getClass();
        this.i = i;
    }
    
    public kzl(final atjj g, final atjj b, final atjj j, final atjj d, final atjj h, final atjj c, final atjj e, final atjj a, final atjj i, final atjj f, final byte[] array, final char[] array2) {
        g.getClass();
        this.g = g;
        this.b = b;
        j.getClass();
        this.j = j;
        d.getClass();
        this.d = d;
        this.h = h;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        i.getClass();
        this.i = i;
        f.getClass();
        this.f = f;
    }
    
    public kzl(final atjj b, final atjj g, final atjj e, final atjj d, final atjj a, final atjj j, final atjj i, final atjj c, final atjj h, final atjj f, final char[] array) {
        b.getClass();
        this.b = b;
        this.g = g;
        e.getClass();
        this.e = e;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        j.getClass();
        this.j = j;
        i.getClass();
        this.i = i;
        c.getClass();
        this.c = c;
        h.getClass();
        this.h = h;
        f.getClass();
        this.f = f;
    }
    
    public kzl(final atjj d, final atjj a, final atjj g, final atjj e, final atjj j, final atjj b, final atjj c, final atjj h, final atjj i, final atjj f, final char[] array, final byte[] array2) {
        d.getClass();
        this.d = d;
        this.a = a;
        g.getClass();
        this.g = g;
        e.getClass();
        this.e = e;
        j.getClass();
        this.j = j;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        f.getClass();
        this.f = f;
    }
    
    public kzl(final lbn a, final UpForFullController d, final lbb c, final FullscreenExitController b, final ghj e, final lfh i, final jaz f, final kza g, final a j, final kzk h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
    }
    
    public kzl(final vbq f, final vcf a, final bhu d, final Set set, final Set set2, final atjj atjj, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = new HashMap();
        this.f = f;
        this.a = a;
        this.d = d;
        this.c = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        final HashMap hashMap = new HashMap();
        for (final ihx ihx : set2) {
            final int a2 = ihx.a;
            final Integer value = a2;
            if (hashMap.containsKey(value)) {
                final StringBuilder sb = new StringBuilder("Trying to add duplicate identity entity transformer for fieldNumber=");
                sb.append(a2);
                trn.b(sb.toString());
            }
            else {
                hashMap.put(value, ihx);
            }
        }
        this.e = afcw.k((Map)hashMap);
        final HashMap hashMap2 = new HashMap();
        for (final iib iib : set) {
            final int b = iib.b();
            final Integer value2 = b;
            if (!hashMap2.containsKey(value2)) {
                hashMap2.put(value2, new HashMap());
            }
            final int a3 = iib.a();
            final Map map = (Map)hashMap2.get(value2);
            if (map == null) {
                final StringBuilder sb2 = new StringBuilder("Cannot add transformer for unknown field number: ");
                sb2.append(b);
                throw new IllegalArgumentException(sb2.toString());
            }
            map.put(a3, iib);
        }
        final HashMap hashMap3 = new HashMap();
        for (final Integer value3 : hashMap2.keySet()) {
            hashMap3.put(value3, afcw.k((Map)hashMap2.get(value3)));
        }
        this.j = afcw.k((Map)hashMap3);
        final atig ad = atig.aD();
        this.i = ad;
        final asgt w = ((asgt)((atie)ad).aK()).Q().P((asho)atjj.a()).B((asjd)htw.t).I((asjc)ige.c).D((asjc)new hva(this, 18, (byte[])null, (byte[])null, (byte[])null), Integer.MAX_VALUE).w((asix)hnn.m);
        final fdk fdk = new fdk(f, a, 19);
        asjv.c(Integer.MAX_VALUE, "maxConcurrency");
        final aspe aspe = new aspe(w, (asjc)fdk);
        final asjc j = aulo.j;
        ((asgt)aspe).v((asix)hnn.n).al((asix)hnn.l);
    }
    
    public final int a(int b) {
        if (((kzk)this.h).n()) {
            if (b != 0) {
                if (((lbn)this.a).e() && b == 4) {
                    return this.b(2);
                }
                final boolean f = ((lbn)this.a).f();
                final int n = 3;
                if (f) {
                    if (b == 2) {
                        if (!((ghj)this.e).d()) {
                            b = n;
                        }
                        else {
                            b = 1;
                        }
                        b = this.b(b);
                    }
                    else {
                        if (b != 4) {
                            return 0;
                        }
                        b = 16;
                    }
                    return b;
                }
                if (((a)this.j).n()) {
                    return 0;
                }
                if (((UpForFullController)this.d).j() && ((lbn)this.a).e() && ((kzk)this.h).o() && b == 2) {
                    return 256;
                }
                if (((lfh)this.i).j()) {
                    return this.b(3);
                }
                if (((lbb)this.c).b() && ((lbn)this.a).u() && b == 4) {
                    return ((FullscreenExitController)this.b).j();
                }
            }
        }
        return 0;
    }
    
    public final int b(final int n) {
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            if (n == 3) {
                return 1;
            }
            if (n != 4) {
                return 16;
            }
            return 8;
        }
        else {
            if (((kzk)this.h).p()) {
                return 64;
            }
            return 4;
        }
    }
    
    public final ksl c(final angj angj, final BrowseResponseModel browseResponseModel) {
        final uyi uyi = (uyi)((atjj)this.b).a();
        uyi.getClass();
        final ggi ggi = (ggi)((atjj)this.d).a();
        ggi.getClass();
        final tdz tdz = (tdz)((atjj)this.h).a();
        tdz.getClass();
        final gtx gtx = (gtx)((atjj)this.i).a();
        gtx.getClass();
        final vax vax = (vax)((atjj)this.g).a();
        vax.getClass();
        final wwv wwv = (wwv)((atjj)this.c).a();
        wwv.getClass();
        final abfa abfa = (abfa)((atjj)this.j).a();
        abfa.getClass();
        final veo veo = (veo)((atjj)this.a).a();
        veo.getClass();
        final arcq arcq = (arcq)((atjj)this.e).a();
        arcq.getClass();
        final Context context = (Context)((atjj)this.f).a();
        context.getClass();
        angj.getClass();
        browseResponseModel.getClass();
        return new ksl(uyi, ggi, tdz, gtx, vax, wwv, abfa, veo, arcq, context, angj, browseResponseModel, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final jtn d(final vke vke, final wwv wwv, final acpi acpi) {
        final acno acno = (acno)((atjj)this.j).a();
        acno.getClass();
        final tdz tdz = (tdz)((atjj)this.c).a();
        tdz.getClass();
        final tny tny = (tny)((atjj)this.h).a();
        tny.getClass();
        final acae acae = (acae)((atjj)this.g).a();
        acae.getClass();
        final oas oas = (oas)((atjj)this.e).a();
        oas.getClass();
        final hyw hyw = (hyw)((atjj)this.a).a();
        hyw.getClass();
        final aexq aexq = (aexq)((atjj)this.f).a();
        aexq.getClass();
        final aeby aeby = (aeby)((atjj)this.b).a();
        aeby.getClass();
        final avt avt = (avt)((atjj)this.d).a();
        avt.getClass();
        final asho asho = (asho)((atjj)this.i).a();
        asho.getClass();
        return new jtn(acno, tdz, tny, acae, oas, hyw, aexq, aeby, avt, asho, vke, wwv, acpi, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final asic e(final iin iin, final String s, final asix asix, final iib iib) {
        return iin.b().W((asjc)new flh(s, iib, asix, 7)).aB((asix)new ign((atig)this.i, 0));
    }
    
    public final asix f(final String s) {
        return new fdo(this, s, 17, null, null, null);
    }
    
    public final void g(final iib iib, final vdm vdm, String string, final iia iia) {
        final fzo h = iib.h(vdm, string, iia);
        final Object a = h.a;
        if (a != null) {
            ((Map<String, Object>)this.h).put(string, a);
        }
        final vcb e = ((vbw)((vbq)this.f).b()).e();
        ((vdv)e).d((vdm)h.b);
        string = iib.f().toString();
        final String string2 = iib.e().toString();
        final StringBuilder sb = new StringBuilder("Failed to update view model ");
        sb.append(string);
        sb.append(" from data model ");
        sb.append(string2);
        fbp.w((vdv)e, sb.toString());
    }
    
    public final void h(final String s, final iib iib) {
        monitorenter(this);
        try {
            final Map map = ((Map<K, Map>)this.g).get(s);
            if (map == null) {
                throw new IllegalArgumentException("No subscriptions for outputEntityKey: ".concat(String.valueOf(s)));
            }
            final Set set = ((Map<K, Set>)this.b).get(s);
            if (set != null) {
                final afdu d = iib.d(s);
                final afdu p2 = afdu.p((Collection)aesy.j((Set)d, (Set)set));
                final afdu p3 = afdu.p((Collection)aesy.j((Set)set, (Set)d));
                final asix f = this.f(s);
                for (final iin iin : p3) {
                    set.remove(iin);
                    final asic asic = (asic)map.remove(iin);
                    if (asic != null) {
                        asic.dispose();
                    }
                }
                set.addAll((Collection)p2);
                for (final iin iin2 : p2) {
                    map.put(iin2, this.e(iin2, s, f, iib));
                }
                monitorexit(this);
                return;
            }
            throw new IllegalArgumentException("No currentTriggers for outputEntityKey: ".concat(String.valueOf(s)));
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
