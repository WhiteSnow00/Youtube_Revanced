// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.media;

import android.os.Parcel;
import app.revanced.integrations.patches.VideoBufferPatch;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PlayerConfigModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final float[] a;
    public static final PlayerConfigModel b;
    private static final ancd j;
    public final ancd c;
    public Set d;
    public Set e;
    public Set f;
    public boolean g;
    public boolean h;
    public boolean i;
    private Set k;
    private Set l;
    private alls m;
    
    static {
        a = new float[] { 0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f };
        b = new PlayerConfigModel(j = ancd.a);
        CREATOR = (Parcelable$Creator)new uik(13);
    }
    
    public PlayerConfigModel(final ancd c) {
        this.g = false;
        this.i = true;
        c.getClass();
        this.c = c;
    }
    
    public static List O(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((amhg)iterator.next()).n);
        }
        return Collections.unmodifiableList((List<?>)list2);
    }
    
    public final long A() {
        final ancd c = this.c;
        if ((c.b & 0x80) == 0x0) {
            return 0L;
        }
        anbn anbn;
        if ((anbn = c.g) == null) {
            anbn = anbn.a;
        }
        if ((anbn.b & 0x4) != 0x0) {
            anbn anbn2;
            if ((anbn2 = this.c.g) == null) {
                anbn2 = anbn.a;
            }
            apln apln;
            if ((apln = anbn2.d) == null) {
                apln = apln.a;
            }
            return apln.c;
        }
        anbn anbn3;
        if ((anbn3 = this.c.g) == null) {
            anbn3 = anbn.a;
        }
        return (long)(anbn3.c * 1000.0f);
    }
    
    public final long B() {
        anbn anbn;
        if ((anbn = this.c.g) == null) {
            anbn = anbn.a;
        }
        return anbn.i;
    }
    
    public final long C() {
        anbn anbn;
        if ((anbn = this.c.g) == null) {
            anbn = anbn.a;
        }
        return anbn.h;
    }
    
    public final long D() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int ag = ajov.aG;
        if (ag != 0) {
            return ag;
        }
        return 2000L;
    }
    
    public final long E() {
        aizz aizz;
        if ((aizz = this.c.y) == null) {
            aizz = aizz.b;
        }
        final long d = aizz.d;
        if (d != 0L) {
            return d;
        }
        return Long.MAX_VALUE;
    }
    
    public final PlayerConfigModel F() {
        final agza builder = ((agzi)this.c).toBuilder();
        builder.copyOnWrite();
        final ancd ancd = (ancd)builder.instance;
        ancd.e = null;
        ancd.b &= 0xFFFFFFFD;
        return new PlayerConfigModel((ancd)builder.build());
    }
    
    public final ahll G() {
        ahll ahll;
        if ((ahll = this.c.D) == null) {
            ahll = ahll.a;
        }
        return ahll;
    }
    
    public final aiuv H() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        return aiuv;
    }
    
    public final alls I() {
        synchronized (this) {
            if (this.m == null) {
                alls m;
                if ((m = this.c.n) == null) {
                    m = alls.a;
                }
                this.m = m;
            }
            return this.m;
        }
    }
    
    public final ampb J() {
        aiux aiux;
        if ((aiux = this.H().h) == null) {
            aiux = aiux.a;
        }
        ampb ampb;
        if ((ampb = aiux.c) == null) {
            ampb = ampb.a;
        }
        return ampb;
    }
    
    public final Long K() {
        alzi alzi;
        if ((alzi = this.c.I) == null) {
            alzi = alzi.a;
        }
        if ((alzi.b & 0x2) != 0x0) {
            alzi alzi2;
            if ((alzi2 = this.c.I) == null) {
                alzi2 = alzi.a;
            }
            return alzi2.d;
        }
        return null;
    }
    
    public final Long L() {
        alzi alzi;
        if ((alzi = this.c.I) == null) {
            alzi = alzi.a;
        }
        if ((alzi.b & 0x1) != 0x0) {
            alzi alzi2;
            if ((alzi2 = this.c.I) == null) {
                alzi2 = alzi.a;
            }
            return alzi2.c;
        }
        return null;
    }
    
    public final String M() {
        final ancd c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apnp apnp;
            if ((apnp = c.u) == null) {
                apnp = apnp.a;
            }
            return apnp.k;
        }
        return "";
    }
    
    public final List N() {
        final ancd c = this.c;
        List<Object> list;
        if ((c.c & 0x40) != 0x0) {
            aizz aizz;
            if ((aizz = c.y) == null) {
                aizz = aizz.b;
            }
            list = O(new agzs((List)aizz.e, aizz.a));
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    public final Set P() {
        synchronized (this) {
            if (this.k == null) {
                ajov ajov;
                if ((ajov = this.c.e) == null) {
                    ajov = ajov.b;
                }
                this.k = (Set)afdu.p((Collection)ajov.R);
            }
            return this.k;
        }
    }
    
    public final Set Q() {
        synchronized (this) {
            if (this.l == null) {
                ajov ajov;
                if ((ajov = this.c.e) == null) {
                    ajov = ajov.b;
                }
                Object l;
                if (ajov.ae.size() == 0) {
                    l = afgq.a;
                }
                else {
                    ajov ajov2;
                    if ((ajov2 = this.c.e) == null) {
                        ajov2 = ajov.b;
                    }
                    l = afdu.p((Collection)ajov2.ae);
                }
                this.l = (Set)l;
            }
            return this.l;
        }
    }
    
    public final boolean R() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.N;
    }
    
    public final boolean S() {
        final ancd c = this.c;
        if ((c.c & 0x40000) != 0x0) {
            aizp aizp;
            if ((aizp = c.H) == null) {
                aizp = aizp.a;
            }
            if (aizp.d) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean T() {
        final ancd c = this.c;
        if ((c.b & 0x2000) != 0x0) {
            ahqt ahqt;
            if ((ahqt = c.j) == null) {
                ahqt = ahqt.a;
            }
            if (ahqt.k) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean U() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.aC;
    }
    
    public final boolean V() {
        aizz aizz;
        if ((aizz = this.c.y) == null) {
            aizz = aizz.b;
        }
        return aizz.g;
    }
    
    public final boolean W() {
        ahuj ahuj;
        if ((ahuj = this.c.f) == null) {
            ahuj = ahuj.a;
        }
        return ahuj.f;
    }
    
    public final boolean X() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.U;
    }
    
    public final boolean Y() {
        aizp aizp;
        if ((aizp = this.c.H) == null) {
            aizp = aizp.a;
        }
        return aizp.c;
    }
    
    public final boolean Z() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.ax;
    }
    
    public final double a() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.aW;
    }
    
    public final boolean aA() {
        ahuj ahuj;
        if ((ahuj = this.c.f) == null) {
            ahuj = ahuj.a;
        }
        return ahuj.e;
    }
    
    public final boolean aB() {
        ahqt ahqt;
        if ((ahqt = this.c.j) == null) {
            ahqt = ahqt.a;
        }
        return ahqt.d;
    }
    
    public final boolean aC() {
        aizz aizz;
        if ((aizz = this.c.y) == null) {
            aizz = aizz.b;
        }
        return aizz.f;
    }
    
    public final boolean aD() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.F;
    }
    
    public final boolean aE() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.aB;
    }
    
    public final boolean aF() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.X;
    }
    
    public final boolean aG() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.ag;
    }
    
    public final boolean aH() {
        ahrk ahrk;
        if ((ahrk = this.c.z) == null) {
            ahrk = ahrk.a;
        }
        return ahrk.b;
    }
    
    public final float aI() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final float aj = ajov.aj;
        if (aj != 0.0f) {
            return aj;
        }
        return 0.5f;
    }
    
    public final int aJ() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int ak = ajov.ak;
        if (ak != 0) {
            return ak;
        }
        return 12;
    }
    
    public final int aK() {
        final ancd c = this.c;
        if ((c.b & 0x2) != 0x0) {
            ajov ajov;
            if ((ajov = c.e) == null) {
                ajov = ajov.b;
            }
            int cx;
            if ((cx = aqql.cx(ajov.ai)) == 0) {
                cx = 1;
            }
            return cx;
        }
        return 2;
    }
    
    public final boolean aa() {
        final ancd c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apnp apnp;
            if ((apnp = c.u) == null) {
                apnp = apnp.a;
            }
            if (apnp.b) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ab() {
        final ancd c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apnp apnp;
            if ((apnp = c.u) == null) {
                apnp = apnp.a;
            }
            if (apnp.j) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ac() {
        final ancd c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apnp apnp;
            if ((apnp = c.u) == null) {
                apnp = apnp.a;
            }
            if (apnp.h) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ad() {
        anbn anbn;
        if ((anbn = this.c.g) == null) {
            anbn = anbn.a;
        }
        return anbn.g;
    }
    
    public final boolean ae() {
        aiux aiux;
        if ((aiux = this.H().h) == null) {
            aiux = aiux.a;
        }
        return aiux.b;
    }
    
    public final boolean af() {
        final ancd c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apnp apnp;
            if ((apnp = c.u) == null) {
                apnp = apnp.a;
            }
            if (apnp.d) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ag(final vhj vhj) {
        if ((this.c.b & 0x2) != 0x0) {
            final vhh a = vhh.a;
            ajov ajov;
            if ((ajov = this.c.e) == null) {
                ajov = ajov.b;
            }
            int bo;
            if ((bo = aqql.bO(ajov.an)) == 0) {
                bo = 1;
            }
            if (--bo != 2) {
                if (bo != 3) {
                    return bo == 4 && vhj.a();
                }
                if (vhj != vhj.a && vhj != vhj.d) {
                    if (vhj != vhj.e) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final boolean ah() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        return (aiuv.b & 0x400) != 0x0;
    }
    
    public final boolean ai() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.g;
    }
    
    public final boolean aj() {
        ahpi ahpi;
        if ((ahpi = this.c.v) == null) {
            ahpi = ahpi.a;
        }
        return ahpi.e;
    }
    
    public final boolean ak() {
        final ancd c = this.c;
        if ((c.c & 0x40000) != 0x0) {
            aizp aizp;
            if ((aizp = c.H) == null) {
                aizp = aizp.a;
            }
            if (aizp.b) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean al() {
        ancx ancx;
        if ((ancx = this.c.J) == null) {
            ancx = ancx.a;
        }
        return ancx.b;
    }
    
    public final boolean am() {
        ancx ancx;
        if ((ancx = this.c.J) == null) {
            ancx = ancx.a;
        }
        return ancx.c;
    }
    
    public final boolean an(final ajot ajot) {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        if (ajov.aH.size() == 0) {
            return false;
        }
        ajov ajov2;
        if ((ajov2 = this.c.e) == null) {
            ajov2 = ajov.b;
        }
        return new agzs((List)ajov2.aH, ajov.a).contains(ajot);
    }
    
    public final boolean ao() {
        alsf alsf;
        if ((alsf = this.c.F) == null) {
            alsf = alsf.a;
        }
        return alsf.g;
    }
    
    public final boolean ap() {
        final ancd c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apnp apnp;
            if ((apnp = c.u) == null) {
                apnp = apnp.a;
            }
            if (apnp.f) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean aq() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        if (ajov.A) {
            ajov ajov2;
            if ((ajov2 = this.c.e) == null) {
                ajov2 = ajov.b;
            }
            if (ajov2.G) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ar() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.I;
    }
    
    public final boolean as() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.Z;
    }
    
    public final boolean at() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.ah;
    }
    
    public final boolean au() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.E;
    }
    
    public final boolean av() {
        ahlr ahlr;
        if ((ahlr = this.c.o) == null) {
            ahlr = ahlr.a;
        }
        return ahlr.b;
    }
    
    public final boolean aw() {
        antq antq;
        if ((antq = this.c.C) == null) {
            antq = antq.a;
        }
        return antq.m;
    }
    
    public final boolean ax() {
        ahuj ahuj;
        if ((ahuj = this.c.f) == null) {
            ahuj = ahuj.a;
        }
        return ahuj.c;
    }
    
    public final boolean ay() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        ajis ajis;
        if ((ajis = aiuv.c) == null) {
            ajis = ajis.a;
        }
        return ajis.h;
    }
    
    public final boolean az() {
        ahuj ahuj;
        if ((ahuj = this.c.f) == null) {
            ahuj = ahuj.a;
        }
        return ahuj.d;
    }
    
    public final float b() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final float l = ajov.l;
        if (l != 0.0f) {
            return l;
        }
        return 0.7f;
    }
    
    public final float c() {
        final ancd c = this.c;
        if ((c.b & 0x40) != 0x0) {
            ahuj ahuj;
            if ((ahuj = c.f) == null) {
                ahuj = ahuj.a;
            }
            return Math.min(1.0f, (float)Math.pow(10.0, -ahuj.b / 20.0f));
        }
        return 1.0f;
    }
    
    public final float d() {
        final ancd c = this.c;
        if ((c.b & 0x2000) != 0x0) {
            ahqt ahqt;
            if ((ahqt = c.j) == null) {
                ahqt = ahqt.a;
            }
            if ((ahqt.b & 0x800) != 0x0) {
                ahqt ahqt2;
                if ((ahqt2 = this.c.j) == null) {
                    ahqt2 = ahqt.a;
                }
                return ahqt2.i;
            }
        }
        return this.e();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final float e() {
        final ancd c = this.c;
        if ((c.b & 0x2000) != 0x0) {
            ahqt ahqt;
            if ((ahqt = c.j) == null) {
                ahqt = ahqt.a;
            }
            return ahqt.h;
        }
        return 0.85f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof PlayerConfigModel && ((agzi)this.c).equals((Object)((PlayerConfigModel)o).c);
    }
    
    public final float f() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        ajis ajis;
        if ((ajis = aiuv.c) == null) {
            ajis = ajis.a;
        }
        return ajis.e;
    }
    
    public final int g() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int v = ajov.v;
        if (v != 0) {
            return v;
        }
        return 38;
    }
    
    public final int h() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int m = ajov.m;
        if (m != 0) {
            return m;
        }
        return 50;
    }
    
    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
    
    public final int i() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.M;
    }
    
    public final int j() {
        antq antq;
        if ((antq = this.c.C) == null) {
            antq = antq.a;
        }
        return antq.k;
    }
    
    public final int k() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int n = ajov.n;
        if (n != 0) {
            return n;
        }
        return 6500;
    }
    
    public final int l() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int o = ajov.o;
        if (o != 0) {
            return o;
        }
        return 8000;
    }
    
    public final int m() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        ajis ajis;
        if ((ajis = aiuv.c) == null) {
            ajis = ajis.a;
        }
        final int b = ajis.b;
        if (b != 0) {
            return b;
        }
        return 120000;
    }
    
    public final int n() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        ajis ajis;
        if ((ajis = aiuv.c) == null) {
            ajis = ajis.a;
        }
        return ajis.g;
    }
    
    public final int o() {
        ajak ajak;
        if ((ajak = this.c.t) == null) {
            ajak = ajak.a;
        }
        return ajak.b;
    }
    
    public final int p() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        if (ajov.r > 0) {
            return VideoBufferPatch.getPlaybackBuffer();
        }
        return 1600;
    }
    
    public final int q() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        return ajov.V;
    }
    
    public final int r() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        ajis ajis;
        if ((ajis = aiuv.c) == null) {
            ajis = ajis.a;
        }
        if (ajis.c != 0) {
            return VideoBufferPatch.getMaxBuffer();
        }
        return 120000;
    }
    
    public final int s() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        ajis ajis;
        if ((ajis = aiuv.c) == null) {
            ajis = ajis.a;
        }
        return ajis.f;
    }
    
    public final int t() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        if (ajov.s > 0) {
            return VideoBufferPatch.getReBuffer();
        }
        return 5000;
    }
    
    @Override
    public final String toString() {
        final int hashCode = ((agzi)this.c).hashCode();
        final StringBuilder sb = new StringBuilder("PlayerConfigModel@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final int u() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int x = ajov.x;
        if (x != 0) {
            return x;
        }
        return 3;
    }
    
    public final int v() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int p = ajov.p;
        if (p != 0) {
            return p;
        }
        return 1;
    }
    
    public final int w() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int q = ajov.q;
        if (q != 0) {
            return q;
        }
        return 2;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(((agxl)this.c).toByteArray());
    }
    
    public final int x() {
        aiuv aiuv;
        if ((aiuv = this.c.d) == null) {
            aiuv = aiuv.a;
        }
        ajis ajis;
        if ((ajis = aiuv.c) == null) {
            ajis = ajis.a;
        }
        return ajis.d;
    }
    
    public final int y() {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        final int u = ajov.u;
        if (u != 0) {
            return u;
        }
        return 389;
    }
    
    public final long z(final int n) {
        ajov ajov;
        if ((ajov = this.c.e) == null) {
            ajov = ajov.b;
        }
        int k;
        if ((k = ajov.k) == 0) {
            k = 25000;
        }
        final long n2 = k;
        final ancd c = this.c;
        Object aw;
        if ((c.b & 0x2) != 0x0) {
            ajov ajov2;
            if ((ajov2 = c.e) == null) {
                ajov2 = ajov.b;
            }
            aw = ajov2.aw;
        }
        else {
            aw = null;
        }
        long n3 = n2;
        if (aw != null) {
            n3 = n2;
            if (!((List)aw).isEmpty()) {
                n3 = n2;
                if (n < ((List)aw).size()) {
                    n3 = (int)((List)aw).get(n);
                }
            }
        }
        return n3 * 1000L;
    }
}
