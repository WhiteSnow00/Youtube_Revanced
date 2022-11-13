import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import com.google.protobuf.ExtensionRegistryLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iiz implements iix
{
    private final Context a;
    private final zmf b;
    private final vdr c;
    private final iiu d;
    private final hzn e;
    private final bhv f;
    private final hzn g;
    private final bhv h;
    private final fzw i;
    private final fzw j;
    
    public iiz(final Context a, final zmf b, final vdr c, final hzn g, final fzw i, final hzn e, final fzw j, final iiu d, final bhv f, final bhv h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = g;
        this.i = i;
        this.e = e;
        this.j = j;
        this.d = d;
        this.f = f;
        this.h = h;
    }
    
    public static final String i(String s, final aezf aezf) {
        try {
            s = (String)ahbh.parseFrom((ahbh)alzm.a, vgl.c(s), ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahca ahca) {
            final StringBuilder sb = new StringBuilder("Found entityKey=`");
            sb.append(s);
            sb.append("` that does not contain a PlaylistVideoEntityId message as it's identifier.");
            ttr.b(sb.toString());
            s = null;
        }
        if (s != null) {
            return (String)aezf.apply((Object)((alzm)s).c);
        }
        return "";
    }
    
    private final vfp j() {
        return (vfp)this.c.a(this.b.c());
    }
    
    private final Set k(final List list, final aezf... array) {
        final HashSet set = new HashSet();
        for (final String s : list) {
            for (int i = 0; i < 6; ++i) {
                set.add(this.g.J((String)array[i].apply((Object)s)));
            }
        }
        return set;
    }
    
    public final int a() {
        return 306;
    }
    
    public final int b() {
        return 141;
    }
    
    public final aezp c(final String s) {
        final appk ad = glb.ad(s, this.h);
        if (ad == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)glb.H(ad.c));
    }
    
    public final afft d(String c) {
        final appk ad = glb.ad(c, this.h);
        if (ad == null) {
            return (afft)afiq.a;
        }
        c = ad.c;
        final String h = glb.H(c);
        final String r = glb.R(c);
        final List list = (List)this.j().f(glb.H(c)).j((Class)alzj.class).X().t((asjr)ign.k).Z((asjr)new ign(12)).K((asjs)hus.u).aF().ac();
        if (this.f.E()) {
            final affr i = afft.i();
            i.h((Object)this.g.J(h));
            i.h((Object)this.g.J(r));
            i.h((Object)this.i.al());
            i.h((Object)this.e.I());
            i.j((Iterable)this.k(list, (aezf)iil.g, (aezf)iil.j, (aezf)iil.d, (aezf)iil.e, (aezf)iil.h, (aezf)iil.i));
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iiu.p((amwb)this.j().f(glb.M((String)iterator.next())).j((Class)amwb.class).af())) {
                    i.h((Object)this.j.an());
                    break;
                }
            }
            return i.g();
        }
        final affr j = afft.i();
        j.h((Object)this.g.J(h));
        j.h((Object)this.g.J(r));
        j.h((Object)this.i.al());
        j.h((Object)this.e.I());
        j.j((Iterable)this.k(list, (aezf)iil.g, (aezf)iil.j, (aezf)iil.d, (aezf)iil.e, (aezf)iil.h, (aezf)iil.i));
        return j.g();
    }
    
    public final Class e() {
        return alzj.class;
    }
    
    public final Class f() {
        return ajgq.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, final String s, final iiw iiw) {
        final alzj alzj = (alzj)vfn;
        final vfp j = this.j();
        final ajgo d = ajgp.d(s);
        final ijm ijm = (ijm)iiw;
        ijm ijm2 = new ijm(0.0f, false, (afft)afiq.a, 1);
        if (alzj != null) {
            float n;
            if (ijm == null) {
                n = 0.0f;
            }
            else {
                n = ijm.a;
            }
            final List list = (List)asht.U((Iterable)alzj.f()).Z((asjr)new ign(13)).K((asjs)ija.b).aF().ac();
            final Iterator iterator = list.iterator();
            long n2 = 2147483647L;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            boolean b = false;
            float n7 = 0.0f;
            while (iterator.hasNext()) {
                final amar amar = (amar)j.f((String)iterator.next()).j((Class)amar.class).af();
                long n8 = n2;
                int n9 = n3;
                int n10 = n4;
                int n11 = n5;
                int n12 = n6;
                boolean b2 = b;
                float q = n7;
                if (amar != null) {
                    final amam c = amar.c();
                    n8 = n2;
                    n9 = n3;
                    n10 = n4;
                    n11 = n5;
                    n12 = n6;
                    b2 = b;
                    q = n7;
                    if (c != null) {
                        n9 = n3 + 1;
                        final apme a = apme.a;
                        switch (iiu.f(this.d.b(amar)).ordinal()) {
                            default: {
                                n8 = n2;
                                n10 = n4;
                                n11 = n5;
                                n12 = n6;
                                b2 = b;
                                q = n7;
                                break;
                            }
                            case 6: {
                                n11 = 1;
                                n8 = n2;
                                n10 = n4;
                                n12 = n6;
                                b2 = b;
                                q = n7;
                                break;
                            }
                            case 5:
                            case 7:
                            case 8: {
                                n10 = n4 + 1;
                                n8 = n2;
                                n11 = n5;
                                n12 = n6;
                                b2 = b;
                                q = n7;
                                break;
                            }
                            case 4: {
                                final ancy f = c.f();
                                n8 = n2;
                                if (f != null) {
                                    final amwb f2 = f.f();
                                    n8 = n2;
                                    if (f2 != null) {
                                        n8 = n2;
                                        if (iiu.p(f2)) {
                                            final long a2 = this.d.a(f2);
                                            n8 = n2;
                                            if (a2 < n2) {
                                                n8 = a2;
                                            }
                                        }
                                    }
                                }
                                n10 = n4 + 1;
                                b2 = true;
                                n11 = n5;
                                n12 = n6;
                                q = n7;
                                break;
                            }
                            case 3: {
                                q = iiu.q(c.f());
                                n12 = 1;
                                b2 = b;
                                n11 = n5;
                                n10 = n4;
                                n8 = n2;
                                break;
                            }
                        }
                    }
                }
                n2 = n8;
                n3 = n9;
                n4 = n10;
                n5 = n11;
                n6 = n12;
                b = b2;
                n7 = q;
            }
            final int size = list.size();
            final afft p3 = afft.p((Collection)list);
            float n13 = 0.0f;
            apme d2 = null;
            Label_0656: {
                apme apme = null;
                Label_0650: {
                    Label_0646: {
                        if (n3 != n4 && size != 0) {
                            if (n5 != 0) {
                                if (n6 == 0) {
                                    break Label_0646;
                                }
                            }
                            else if (n6 == 0 && n4 <= 0) {
                                apme = apme.c;
                                break Label_0650;
                            }
                            n13 = n;
                            if (ijm != null) {
                                n13 = n;
                                if (!p3.equals((Object)ijm.b)) {
                                    n13 = 0.0f;
                                }
                            }
                            final float n14 = (n4 + n7) / n3;
                            d2 = apme.d;
                            n = Math.max(n13, n14);
                            break Label_0656;
                        }
                    }
                    apme = apme.e;
                }
                n13 = n;
                d2 = apme;
            }
            d.d(d2);
            final int ordinal = d2.ordinal();
            String s2;
            if (ordinal != 3) {
                if (ordinal != 4) {
                    s2 = this.a.getString(2132018884);
                }
                else if (n2 != 2147483647L && n2 != 0L) {
                    s2 = this.d.h(n2, false);
                }
                else {
                    s2 = "";
                }
            }
            else {
                s2 = this.a.getString(2132017937, new Object[] { (int)Math.max(0.0f, Math.min(n * 100.0f, 100.0f)) });
            }
            d.e(s2);
            d.c(Float.valueOf(n));
            d.i(Float.valueOf(n13));
            d.j(Boolean.valueOf(b));
            ijm2 = new ijm(n, d2 == apme.e, p3, 1);
        }
        else {
            d.d(apme.b);
        }
        return fzw.aD((vfn)d.b(j), (iiw)ijm2);
    }
}
