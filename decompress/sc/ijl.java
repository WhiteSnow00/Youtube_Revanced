import java.util.List;
import java.util.Iterator;
import j$.time.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.TimeUnit;
import android.graphics.Rect;
import android.content.Context;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijl implements asjr
{
    public final Object a;
    private final int b;
    
    public ijl(final aaba a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final aezf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final arkg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final ashi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final bx a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final AutonavToggleController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final ijb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final ikx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final ing a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final iqf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final ird a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final jad a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final jki a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final vee a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final vfp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final zyg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ijl(final zyo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(Object o) {
        final int b = this.b;
        String s = "";
        boolean b2 = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final jae jae = (jae)o;
                final bx bx = (bx)a;
                final boolean w = bx.W(jae);
                final abbb a2 = abbc.a();
                a2.d(w);
                final boolean w2 = bx.W(jae);
                long n = -1L;
                if (!w2 || bx.Z(jae) != -1L) {
                    b2 = true;
                }
                a2.b(b2);
                if (w) {
                    final long z = bx.Z(jae);
                    if (z != -1L) {
                        if (z == -2L) {
                            n = tsy.a((Context)((bx)bx.a).a).getRecommendedTimeoutMillis(2000, 6);
                        }
                        else {
                            n = z;
                        }
                    }
                }
                else {
                    n = 2000L;
                }
                a2.c(n);
                return a2.a();
            }
            case 19: {
                final Object a3 = this.a;
                final abbc abbc = (abbc)o;
                ashi ashi;
                if (abbc.b) {
                    ashi = ashi.K(abbc);
                }
                else {
                    ashi = ((jad)a3).a;
                }
                return ashi;
            }
            case 18: {
                final Object a4 = this.a;
                if (o) {
                    o = ((arkg)a4).a();
                }
                else {
                    o = ashi.K(new Rect());
                }
                return o;
            }
            case 17: {
                final Object a5 = this.a;
                final Boolean b3 = (Boolean)o;
                final Duration a6 = iua.a;
                if (b3) {
                    return a5;
                }
                return ashi.z();
            }
            case 16: {
                final ashi ashi2 = (ashi)this.a;
                final ashi n2 = ashi.N((auke)ashi2.az(), (auke)ashi.ad(iua.a.toMillis(), TimeUnit.MILLISECONDS));
                askk.b((Object)n2, "other is null");
                final aste aste = new aste(ashi2, (auke)n2);
                final asjr j = atqx.j;
                return aste;
            }
            case 15: {
                final Object a7 = this.a;
                Object o2;
                if (o) {
                    o2 = ((AutonavToggleController)a7).h.e;
                }
                else {
                    o2 = ashi.z();
                }
                return o2;
            }
            case 14: {
                final Object a8 = this.a;
                final afeq afeq = (afeq)o;
                final ird ird = (ird)a8;
                final vdq a9 = ird.a.a(ird.d.c());
                Object a10 = aeyo.a;
                final int size = ((List)afeq).size();
                int n3 = 0;
                do {
                    o = a10;
                    if (n3 >= size) {
                        break;
                    }
                    final vfn vfn = (vfn)((List)afeq).get(n3);
                    Label_0640: {
                        if (ird.e.ax()) {
                            if (vfn instanceof amar) {
                                o = ird.b((amar)vfn);
                            }
                            else {
                                o = a10;
                                if (vfn instanceof alzj) {
                                    final alzj alzj = (alzj)vfn;
                                    final fzw f = ird.f;
                                    final vdq a11 = ((vdr)f.a).a(((zmf)f.b).c());
                                    final asht z2 = asht.U(alzj.f()).Z((asjr)flz.e);
                                    a11.getClass();
                                    final afeq afeq2 = (afeq)z2.Q((asjr)new fdg(a11, 13)).l(amar.class).aF().J((asjr)flz.f).ac();
                                    final int size2 = ((List)afeq2).size();
                                    int i = 0;
                                    while (i < size2) {
                                        o = ird.b((amar)((List)afeq2).get(i));
                                        final boolean h = ((aezp)o).h();
                                        ++i;
                                        if (h) {
                                            break Label_0640;
                                        }
                                    }
                                    o = aeyo.a;
                                }
                            }
                        }
                        else if (vfn instanceof apys) {
                            o = ioy.a(aezp.k((Object)vfn));
                        }
                        else {
                            o = a10;
                            if (vfn instanceof apyn) {
                                final apyx c = ((apyn)((aezv)aezp.k((Object)vfn)).a).c();
                                if (c != null) {
                                    o = new afel();
                                    final Iterator<Object> iterator = ((List<Object>)c.c.l).iterator();
                                    while (iterator.hasNext()) {
                                        final vfn b4 = c.b.b((String)iterator.next());
                                        if (b4 != null) {
                                            if (!(b4 instanceof apzf)) {
                                                final String string = b4.toString();
                                                o = new StringBuilder("Entity ");
                                                ((StringBuilder)o).append(string);
                                                ((StringBuilder)o).append(" is not a YtMainPlaylistVideoEntityModel");
                                                throw new IllegalArgumentException(((StringBuilder)o).toString());
                                            }
                                            ((afel)o).h(b4);
                                        }
                                    }
                                    final afeq g = ((afel)o).g();
                                    final int c2 = ((afih)g).c;
                                    int k = 0;
                                    while (k < c2) {
                                        final apzm c3 = ((List<apzf>)g).get(k).c();
                                        if (c3 == null) {
                                            o = aeyo.a;
                                        }
                                        else {
                                            o = ioy.a(aezp.j((Object)((vfp)a9).f(glb.x(c3.getVideoId())).j(apys.class).af()));
                                        }
                                        ++k;
                                        if (((aezp)o).h()) {
                                            break Label_0640;
                                        }
                                    }
                                }
                                o = aeyo.a;
                            }
                        }
                    }
                    ++n3;
                    a10 = o;
                } while (!((aezp)o).h());
                return o;
            }
            case 13: {
                final Object a12 = this.a;
                asie asie;
                if (((flm)o).a != 0) {
                    asie = asie.I(true);
                }
                else {
                    asie = ((iqf)a12).b.e(fll.a().c()).J((asjr)ijp.s);
                }
                return asie;
            }
            case 12: {
                return ((afft)o).contains(this.a);
            }
            case 11: {
                final Object a13 = this.a;
                final ajht ajht = (ajht)o;
                boolean b5;
                if (((tjm)((jki)a13).a).p()) {
                    b5 = ajht.c;
                }
                else {
                    b5 = ajht.d;
                }
                return b5;
            }
            case 10: {
                return ((afft)o).contains(this.a);
            }
            case 9: {
                return ((vee)this.a).f((String)o).j(alzx.class);
            }
            case 8: {
                final Object a14 = this.a;
                final amac amac = (amac)o;
                final afel d = afeq.d();
                for (final amad amad : amac.getItems()) {
                    if (amad.b == 1) {
                        final String l = vgl.i((String)amad.c);
                        final ing ing = (ing)a14;
                        final vdq b6 = ing.a.b();
                        String s2;
                        if (ing.d.ax()) {
                            s2 = glb.J(l);
                        }
                        else {
                            s2 = glb.x(l);
                        }
                        if (b6.f(s2).af() != null) {
                            continue;
                        }
                        String s3;
                        if (amad.b == 1) {
                            s3 = (String)amad.c;
                        }
                        else {
                            s3 = "";
                        }
                        d.h(s3);
                    }
                }
                return d.g();
            }
            case 7: {
                return ((afft)o).contains((Object)((zyo)this.a).a.a());
            }
            case 6: {
                return ((afft)o).contains((Object)((aaba)this.a).f());
            }
            case 5: {
                return ((afft)o).contains((Object)((zyg)this.a).a.a());
            }
            case 4: {
                final Object a15 = this.a;
                final Integer n4 = (Integer)o;
                return new ikf(2130970926, new String[] { ((ikx)a15).a.getResources().getQuantityString(2131886174, (int)n4, new Object[] { n4 }) });
            }
            case 3: {
                return ((vfp)this.a).f((String)o).j(apzf.class);
            }
            case 2: {
                return ((vfp)this.a).f((String)o).j(apzf.class);
            }
            case 1: {
                return ((ijb)this.a).i().f((String)o).j(amar.class);
            }
            case 0: {
                final Object a16 = this.a;
                final String s4 = (String)o;
                apzc apzc;
                try {
                    apzc = (apzc)ahbh.parseFrom((ahbh)apzc.a, vgl.c(s4), ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahca ahca) {
                    final StringBuilder sb = new StringBuilder("Found entityKey=`");
                    sb.append(s4);
                    sb.append("` that does not contain a PlaylistVideoEntityId message as it's identifier.");
                    ttr.b(sb.toString());
                    apzc = null;
                }
                if (apzc != null) {
                    s = (String)((aezf)a16).apply((Object)apzc.c);
                }
                return s;
            }
        }
    }
}
