import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igm implements asjm
{
    public final lgj a;
    
    public igm(final lgj a, final byte[] array) {
        this.a = a;
    }
    
    @Override
    public final void a(Object n) {
        final lgj a = this.a;
        n = n;
        ((aanx)a.d).b(true);
        if (!((vai)a.a).ak()) {
            final afkf d = ((afeq)((amac)n).getItemsModels()).D();
            while (((Iterator)d).hasNext()) {
                final alzx a2 = ((alzz)((Iterator)d).next()).a();
                if (a2 != null) {
                    final apzm c = a2.c();
                    if (c == null) {
                        continue;
                    }
                    if (((vai)a.f).aB()) {
                        final ArrayList list = new ArrayList();
                        for (final String s : c.b.r) {
                            final ahaz builder = ((ahbh)aluz.a).createBuilder();
                            final String i = vgl.i(s);
                            builder.copyOnWrite();
                            final aluz aluz = (aluz)builder.instance;
                            aluz.c |= 0x4;
                            aluz.f = i;
                            list.add(lgj.b(s, (aluz)builder.build()));
                        }
                        try {
                            ((aacg)a.b).b((List)list);
                        }
                        catch (final aach aach) {
                            ttr.b("Unable to enqueue local image add action for download recs video: ".concat(String.valueOf(aach.getMessage())));
                        }
                    }
                    else {
                        final String f = vgl.f(197, c.getVideoId());
                        final ahaz builder2 = ((ahbh)aluz.a).createBuilder();
                        final String e = c.e();
                        builder2.copyOnWrite();
                        final aluz aluz2 = (aluz)builder2.instance;
                        e.getClass();
                        aluz2.d = 1;
                        aluz2.e = e;
                        final amul b = lgj.b(f, (aluz)builder2.build());
                        try {
                            ((aacg)a.b).a(b);
                        }
                        catch (final aach aach2) {
                            ttr.b("Unable to enqueue local image add action for download recs video: ".concat(String.valueOf(aach2.getMessage())));
                        }
                    }
                }
            }
        }
        final Set set = (Set)((vef)a.g).b().e(137).J((asjr)ign.b).ac();
        final HashSet ad = agqs.ad();
        for (final amad amad : ((amac)n).getItems()) {
            String s2;
            if (amad.b == 1) {
                s2 = (String)amad.c;
            }
            else {
                s2 = "";
            }
            ad.add(s2);
        }
        final afjf ab = agqs.ab(set, ad);
        n = ((vew)((vef)a.g).b()).n();
        final afke a3 = ((afiz)ab).a();
        while (a3.hasNext()) {
            final String s3 = a3.next();
            final alzx alzx = (alzx)((vef)a.g).b().f(s3).j(alzx.class).af();
            if (alzx != null) {
                wkb.Q((vfw)n, (vfn)alzx);
                if (((vai)a.f).aB()) {
                    continue;
                }
                try {
                    final Object b2 = a.b;
                    final ahaz builder3 = ((ahbh)amul.a).createBuilder();
                    builder3.copyOnWrite();
                    final amul amul = (amul)builder3.instance;
                    amul.c = 2;
                    amul.b |= 0x1;
                    final String f2 = vgl.f(197, vgl.i(s3));
                    builder3.copyOnWrite();
                    final amul amul2 = (amul)builder3.instance;
                    f2.getClass();
                    amul2.b |= 0x2;
                    amul2.d = f2;
                    ((aacg)b2).a((amul)builder3.build());
                }
                catch (final aach aach3) {
                    ttr.b("Couldn't delete: ".concat(String.valueOf(aach3.getMessage())));
                }
            }
        }
        fex.u((vfw)n, "Error deleting unreferenced entities");
    }
}
