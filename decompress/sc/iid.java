import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Arrays;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iid implements aacc
{
    private final vef a;
    
    public iid(final vef a) {
        this.a = a;
    }
    
    public final aacb a(final amul amul) {
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        final int c = amul.c;
        int cu;
        if ((cu = aqsx.cU(c)) == 0) {
            cu = 1;
        }
        if (cu - 1 != 2) {
            int cu2;
            if ((cu2 = aqsx.cU(c)) == 0) {
                cu2 = 1;
            }
            ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 137 });
            final aaby b = aabz.c.b();
            b.b = 23;
            return afwm.m((Object)b.a());
        }
        final String d = amul.d;
        final vee b2 = this.a.b();
        final alzx alzx = (alzx)b2.f(d).j(alzx.class).af();
        aabz aabz;
        if (alzx == null) {
            aabz = aabz.a;
        }
        else {
            final ves n = ((vew)b2).n();
            wkb.Q((vfw)n, (vfn)alzx);
            final amac amac = (amac)b2.f(glb.u()).j(amac.class).af();
            for (final amad amad : amac.getItems()) {
                String s;
                if (amad.b == 1) {
                    s = (String)amad.c;
                }
                else {
                    s = "";
                }
                if (s.equals(d)) {
                    final amaa c2 = amac.c();
                    final LinkedHashSet set = new LinkedHashSet(Arrays.asList(amad));
                    final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)((amae)c2.a.instance).e);
                    final ahaz a = c2.a;
                    a.copyOnWrite();
                    ((amae)a.instance).e = amae.emptyProtobufList();
                    for (final amad amad2 : unmodifiableList) {
                        if (!set.contains(amad2)) {
                            final ahaz a2 = c2.a;
                            a2.copyOnWrite();
                            final amae amae = (amae)a2.instance;
                            amad2.getClass();
                            final ahbx e = amae.e;
                            if (!e.c()) {
                                amae.e = ahbh.mutableCopy(e);
                            }
                            amae.e.add((Object)amad2);
                        }
                    }
                    ((vfw)n).j((vfk)c2);
                    break;
                }
            }
            fex.u((vfw)n, "Error updating when delete a MainRecommendedDownloadVideoEntity.");
            aabz = aabz.a;
        }
        return afwm.m((Object)aabz);
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        return afwm.m((Object)afeq.q());
    }
}
