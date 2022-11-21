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
    private static final ango j;
    public final ango c;
    public Set d;
    public Set e;
    public Set f;
    public boolean g;
    public boolean h;
    public boolean i;
    private Set k;
    private Set l;
    private alpv m;
    
    static {
        a = new float[] { 0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f };
        b = new PlayerConfigModel(j = ango.a);
        CREATOR = (Parcelable$Creator)new ulj(13);
    }
    
    public PlayerConfigModel(final ango c) {
        this.g = false;
        this.i = true;
        c.getClass();
        this.c = c;
    }
    
    public static List O(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((amlp)iterator.next()).n);
        }
        return Collections.unmodifiableList((List<?>)list2);
    }
    
    public final long A() {
        final ango c = this.c;
        if ((c.b & 0x80) == 0x0) {
            return 0L;
        }
        anfy anfy;
        if ((anfy = c.g) == null) {
            anfy = anfy.a;
        }
        if ((anfy.b & 0x4) != 0x0) {
            anfy anfy2;
            if ((anfy2 = this.c.g) == null) {
                anfy2 = anfy.a;
            }
            apqd apqd;
            if ((apqd = anfy2.d) == null) {
                apqd = apqd.a;
            }
            return apqd.c;
        }
        anfy anfy3;
        if ((anfy3 = this.c.g) == null) {
            anfy3 = anfy.a;
        }
        return (long)(anfy3.c * 1000.0f);
    }
    
    public final long B() {
        anfy anfy;
        if ((anfy = this.c.g) == null) {
            anfy = anfy.a;
        }
        return anfy.i;
    }
    
    public final long C() {
        anfy anfy;
        if ((anfy = this.c.g) == null) {
            anfy = anfy.a;
        }
        return anfy.h;
    }
    
    public final long D() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int ag = ajsz.aG;
        if (ag != 0) {
            return ag;
        }
        return 2000L;
    }
    
    public final long E() {
        ajeb ajeb;
        if ((ajeb = this.c.y) == null) {
            ajeb = ajeb.b;
        }
        final long d = ajeb.d;
        if (d != 0L) {
            return d;
        }
        return Long.MAX_VALUE;
    }
    
    public final PlayerConfigModel F() {
        final ahcr builder = ((ahcz)this.c).toBuilder();
        builder.copyOnWrite();
        final ango ango = (ango)builder.instance;
        ango.e = null;
        ango.b &= 0xFFFFFFFD;
        return new PlayerConfigModel((ango)builder.build());
    }
    
    public final ahpa G() {
        ahpa ahpa;
        if ((ahpa = this.c.D) == null) {
            ahpa = ahpa.a;
        }
        return ahpa;
    }
    
    public final aiyy H() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        return aiyy;
    }
    
    public final alpv I() {
        synchronized (this) {
            if (this.m == null) {
                alpv m;
                if ((m = this.c.n) == null) {
                    m = alpv.a;
                }
                this.m = m;
            }
            return this.m;
        }
    }
    
    public final amtk J() {
        aiza aiza;
        if ((aiza = this.H().h) == null) {
            aiza = aiza.a;
        }
        amtk amtk;
        if ((amtk = aiza.c) == null) {
            amtk = amtk.a;
        }
        return amtk;
    }
    
    public final Long K() {
        amdm amdm;
        if ((amdm = this.c.I) == null) {
            amdm = amdm.a;
        }
        if ((amdm.b & 0x2) != 0x0) {
            amdm amdm2;
            if ((amdm2 = this.c.I) == null) {
                amdm2 = amdm.a;
            }
            return amdm2.d;
        }
        return null;
    }
    
    public final Long L() {
        amdm amdm;
        if ((amdm = this.c.I) == null) {
            amdm = amdm.a;
        }
        if ((amdm.b & 0x1) != 0x0) {
            amdm amdm2;
            if ((amdm2 = this.c.I) == null) {
                amdm2 = amdm.a;
            }
            return amdm2.c;
        }
        return null;
    }
    
    public final String M() {
        final ango c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apsf apsf;
            if ((apsf = c.u) == null) {
                apsf = apsf.a;
            }
            return apsf.j;
        }
        return "";
    }
    
    public final List N() {
        final ango c = this.c;
        List<Object> list;
        if ((c.c & 0x40) != 0x0) {
            ajeb ajeb;
            if ((ajeb = c.y) == null) {
                ajeb = ajeb.b;
            }
            list = O((List)new ahdj((List)ajeb.e, ajeb.a));
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    public final Set P() {
        synchronized (this) {
            if (this.k == null) {
                ajsz ajsz;
                if ((ajsz = this.c.e) == null) {
                    ajsz = ajsz.b;
                }
                this.k = afhk.p((Collection)ajsz.R);
            }
            return this.k;
        }
    }
    
    public final Set Q() {
        synchronized (this) {
            if (this.l == null) {
                ajsz ajsz;
                if ((ajsz = this.c.e) == null) {
                    ajsz = ajsz.b;
                }
                Object l;
                if (ajsz.ae.size() == 0) {
                    l = afkg.a;
                }
                else {
                    ajsz ajsz2;
                    if ((ajsz2 = this.c.e) == null) {
                        ajsz2 = ajsz.b;
                    }
                    l = afhk.p((Collection)ajsz2.ae);
                }
                this.l = (Set)l;
            }
            return this.l;
        }
    }
    
    public final boolean R() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.N;
    }
    
    public final boolean S() {
        final ango c = this.c;
        if ((c.c & 0x40000) != 0x0) {
            ajdr ajdr;
            if ((ajdr = c.H) == null) {
                ajdr = ajdr.a;
            }
            if (ajdr.d) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean T() {
        final ango c = this.c;
        if ((c.b & 0x2000) != 0x0) {
            ahuk ahuk;
            if ((ahuk = c.j) == null) {
                ahuk = ahuk.a;
            }
            if (ahuk.k) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean U() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.aC;
    }
    
    public final boolean V() {
        ajeb ajeb;
        if ((ajeb = this.c.y) == null) {
            ajeb = ajeb.b;
        }
        return ajeb.g;
    }
    
    public final boolean W() {
        ahya ahya;
        if ((ahya = this.c.f) == null) {
            ahya = ahya.a;
        }
        return ahya.f;
    }
    
    public final boolean X() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.U;
    }
    
    public final boolean Y() {
        ajdr ajdr;
        if ((ajdr = this.c.H) == null) {
            ajdr = ajdr.a;
        }
        return ajdr.c;
    }
    
    public final boolean Z() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.ax;
    }
    
    public final double a() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.aW;
    }
    
    public final boolean aA() {
        ahya ahya;
        if ((ahya = this.c.f) == null) {
            ahya = ahya.a;
        }
        return ahya.e;
    }
    
    public final boolean aB() {
        ahuk ahuk;
        if ((ahuk = this.c.j) == null) {
            ahuk = ahuk.a;
        }
        return ahuk.d;
    }
    
    public final boolean aC() {
        ajeb ajeb;
        if ((ajeb = this.c.y) == null) {
            ajeb = ajeb.b;
        }
        return ajeb.f;
    }
    
    public final boolean aD() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.F;
    }
    
    public final boolean aE() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.aB;
    }
    
    public final boolean aF() {
        ahuk ahuk;
        if ((ahuk = this.c.j) == null) {
            ahuk = ahuk.a;
        }
        return ahuk.m;
    }
    
    public final boolean aG() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.X;
    }
    
    public final boolean aH() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.ag;
    }
    
    public final boolean aI() {
        ahvb ahvb;
        if ((ahvb = this.c.z) == null) {
            ahvb = ahvb.a;
        }
        return ahvb.b;
    }
    
    public final float aJ() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final float aj = ajsz.aj;
        if (aj != 0.0f) {
            return aj;
        }
        return 0.5f;
    }
    
    public final float aK() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final float ba = ajsz.ba;
        if (ba != 0.0f) {
            return ba;
        }
        return 1.0f;
    }
    
    public final int aL() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int ak = ajsz.ak;
        if (ak != 0) {
            return ak;
        }
        return 12;
    }
    
    public final int aM() {
        final ango c = this.c;
        if ((c.b & 0x2) != 0x0) {
            ajsz ajsz;
            if ((ajsz = c.e) == null) {
                ajsz = ajsz.b;
            }
            int cq;
            if ((cq = aqvq.cq(ajsz.ai)) == 0) {
                cq = 1;
            }
            return cq;
        }
        return 2;
    }
    
    public final boolean aa() {
        final ango c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apsf apsf;
            if ((apsf = c.u) == null) {
                apsf = apsf.a;
            }
            if (apsf.b) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ab() {
        final ango c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apsf apsf;
            if ((apsf = c.u) == null) {
                apsf = apsf.a;
            }
            if (apsf.i) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ac() {
        final ango c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apsf apsf;
            if ((apsf = c.u) == null) {
                apsf = apsf.a;
            }
            if (apsf.g) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ad() {
        anfy anfy;
        if ((anfy = this.c.g) == null) {
            anfy = anfy.a;
        }
        return anfy.g;
    }
    
    public final boolean ae() {
        aiza aiza;
        if ((aiza = this.H().h) == null) {
            aiza = aiza.a;
        }
        return aiza.b;
    }
    
    public final boolean af() {
        final ango c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apsf apsf;
            if ((apsf = c.u) == null) {
                apsf = apsf.a;
            }
            if (apsf.d) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ag(final vkr vkr) {
        if ((this.c.b & 0x2) != 0x0) {
            final vkp a = vkp.a;
            ajsz ajsz;
            if ((ajsz = this.c.e) == null) {
                ajsz = ajsz.b;
            }
            int bh;
            if ((bh = aqvq.bH(ajsz.an)) == 0) {
                bh = 1;
            }
            if (--bh != 2) {
                if (bh != 3) {
                    return bh == 4 && vkr.a();
                }
                if (vkr != vkr.a && vkr != vkr.d) {
                    if (vkr != vkr.e) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final boolean ah() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        return (aiyy.b & 0x400) != 0x0;
    }
    
    public final boolean ai() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.g;
    }
    
    public final boolean aj() {
        ahsz ahsz;
        if ((ahsz = this.c.v) == null) {
            ahsz = ahsz.a;
        }
        return ahsz.e;
    }
    
    public final boolean ak() {
        final ango c = this.c;
        if ((c.c & 0x40000) != 0x0) {
            ajdr ajdr;
            if ((ajdr = c.H) == null) {
                ajdr = ajdr.a;
            }
            if (ajdr.b) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean al() {
        anhi anhi;
        if ((anhi = this.c.J) == null) {
            anhi = anhi.a;
        }
        return anhi.b;
    }
    
    public final boolean am() {
        anhi anhi;
        if ((anhi = this.c.J) == null) {
            anhi = anhi.a;
        }
        return anhi.c;
    }
    
    public final boolean an(final ajsx ajsx) {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        if (ajsz.aH.size() == 0) {
            return false;
        }
        ajsz ajsz2;
        if ((ajsz2 = this.c.e) == null) {
            ajsz2 = ajsz.b;
        }
        return ((List)new ahdj((List)ajsz2.aH, ajsz.a)).contains(ajsx);
    }
    
    public final boolean ao() {
        alwi alwi;
        if ((alwi = this.c.F) == null) {
            alwi = alwi.a;
        }
        return alwi.g;
    }
    
    public final boolean ap() {
        final ango c = this.c;
        if ((c.c & 0x1) != 0x0) {
            apsf apsf;
            if ((apsf = c.u) == null) {
                apsf = apsf.a;
            }
            if (apsf.e) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean aq() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        if (ajsz.A) {
            ajsz ajsz2;
            if ((ajsz2 = this.c.e) == null) {
                ajsz2 = ajsz.b;
            }
            if (ajsz2.G) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean ar() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.I;
    }
    
    public final boolean as() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.Z;
    }
    
    public final boolean at() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.ah;
    }
    
    public final boolean au() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.E;
    }
    
    public final boolean av() {
        ahpg ahpg;
        if ((ahpg = this.c.o) == null) {
            ahpg = ahpg.a;
        }
        return ahpg.b;
    }
    
    public final boolean aw() {
        anxz anxz;
        if ((anxz = this.c.C) == null) {
            anxz = anxz.a;
        }
        return anxz.m;
    }
    
    public final boolean ax() {
        ahya ahya;
        if ((ahya = this.c.f) == null) {
            ahya = ahya.a;
        }
        return ahya.c;
    }
    
    public final boolean ay() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        ajmv ajmv;
        if ((ajmv = aiyy.c) == null) {
            ajmv = ajmv.a;
        }
        return ajmv.h;
    }
    
    public final boolean az() {
        ahya ahya;
        if ((ahya = this.c.f) == null) {
            ahya = ahya.a;
        }
        return ahya.d;
    }
    
    public final float b() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final float l = ajsz.l;
        if (l != 0.0f) {
            return l;
        }
        return 0.7f;
    }
    
    public final float c() {
        final ango c = this.c;
        if ((c.b & 0x40) != 0x0) {
            ahya ahya;
            if ((ahya = c.f) == null) {
                ahya = ahya.a;
            }
            return Math.min(1.0f, (float)Math.pow(10.0, -ahya.b / 20.0f));
        }
        return 1.0f;
    }
    
    public final float d() {
        final ango c = this.c;
        if ((c.b & 0x2000) != 0x0) {
            ahuk ahuk;
            if ((ahuk = c.j) == null) {
                ahuk = ahuk.a;
            }
            if ((ahuk.b & 0x800) != 0x0) {
                ahuk ahuk2;
                if ((ahuk2 = this.c.j) == null) {
                    ahuk2 = ahuk.a;
                }
                return ahuk2.i;
            }
        }
        return this.e();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final float e() {
        final ango c = this.c;
        if ((c.b & 0x2000) != 0x0) {
            ahuk ahuk;
            if ((ahuk = c.j) == null) {
                ahuk = ahuk.a;
            }
            return ahuk.h;
        }
        return 0.85f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof PlayerConfigModel && ((ahcz)this.c).equals(((PlayerConfigModel)o).c);
    }
    
    public final float f() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        ajmv ajmv;
        if ((ajmv = aiyy.c) == null) {
            ajmv = ajmv.a;
        }
        return ajmv.e;
    }
    
    public final int g() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int v = ajsz.v;
        if (v != 0) {
            return v;
        }
        return 38;
    }
    
    public final int h() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int m = ajsz.m;
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
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.M;
    }
    
    public final int j() {
        anxz anxz;
        if ((anxz = this.c.C) == null) {
            anxz = anxz.a;
        }
        return anxz.k;
    }
    
    public final int k() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int n = ajsz.n;
        if (n != 0) {
            return n;
        }
        return 6500;
    }
    
    public final int l() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int o = ajsz.o;
        if (o != 0) {
            return o;
        }
        return 8000;
    }
    
    public final int m() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        ajmv ajmv;
        if ((ajmv = aiyy.c) == null) {
            ajmv = ajmv.a;
        }
        final int b = ajmv.b;
        if (b != 0) {
            return b;
        }
        return 120000;
    }
    
    public final int n() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        ajmv ajmv;
        if ((ajmv = aiyy.c) == null) {
            ajmv = ajmv.a;
        }
        return ajmv.g;
    }
    
    public final int o() {
        ajem ajem;
        if ((ajem = this.c.t) == null) {
            ajem = ajem.a;
        }
        return ajem.b;
    }
    
    public final int p() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        if (ajsz.r > 0) {
            return VideoBufferPatch.getPlaybackBuffer();
        }
        return 1600;
    }
    
    public final int q() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        return ajsz.V;
    }
    
    public final int r() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        ajmv ajmv;
        if ((ajmv = aiyy.c) == null) {
            ajmv = ajmv.a;
        }
        if (ajmv.c != 0) {
            return VideoBufferPatch.getMaxBuffer();
        }
        return 120000;
    }
    
    public final int s() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        ajmv ajmv;
        if ((ajmv = aiyy.c) == null) {
            ajmv = ajmv.a;
        }
        return ajmv.f;
    }
    
    public final int t() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        if (ajsz.s > 0) {
            return VideoBufferPatch.getReBuffer();
        }
        return 5000;
    }
    
    @Override
    public final String toString() {
        final int hashCode = ((ahcz)this.c).hashCode();
        final StringBuilder sb = new StringBuilder("PlayerConfigModel@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final int u() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int x = ajsz.x;
        if (x != 0) {
            return x;
        }
        return 3;
    }
    
    public final int v() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int p = ajsz.p;
        if (p != 0) {
            return p;
        }
        return 1;
    }
    
    public final int w() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int q = ajsz.q;
        if (q != 0) {
            return q;
        }
        return 2;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(((ahbc)this.c).toByteArray());
    }
    
    public final int x() {
        aiyy aiyy;
        if ((aiyy = this.c.d) == null) {
            aiyy = aiyy.a;
        }
        ajmv ajmv;
        if ((ajmv = aiyy.c) == null) {
            ajmv = ajmv.a;
        }
        return ajmv.d;
    }
    
    public final int y() {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        final int u = ajsz.u;
        if (u != 0) {
            return u;
        }
        return 389;
    }
    
    public final long z(final int n) {
        ajsz ajsz;
        if ((ajsz = this.c.e) == null) {
            ajsz = ajsz.b;
        }
        int k;
        if ((k = ajsz.k) == 0) {
            k = 25000;
        }
        final ango c = this.c;
        Object aw;
        if ((c.b & 0x2) != 0x0) {
            ajsz ajsz2;
            if ((ajsz2 = c.e) == null) {
                ajsz2 = ajsz.b;
            }
            aw = ajsz2.aw;
        }
        else {
            aw = null;
        }
        long n3;
        final long n2 = n3 = k;
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
