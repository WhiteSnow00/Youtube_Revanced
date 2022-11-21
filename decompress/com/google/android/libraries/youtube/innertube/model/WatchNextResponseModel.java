// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class WatchNextResponseModel implements Parcelable, acbl
{
    public static final Parcelable$Creator CREATOR;
    public final algm a;
    public final String b;
    public final aisc c;
    public final List d;
    public vic e;
    public algd f;
    public anli g;
    public via h;
    public anis i;
    private final Map j;
    private List k;
    private apps l;
    private appw m;
    private aoey n;
    private Object o;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(9);
    }
    
    public WatchNextResponseModel(final algm a) {
        a.getClass();
        this.d = new ArrayList();
        this.j = new HashMap();
        final int b = a.b;
        final via via = null;
        aisc c;
        if ((b & 0x1000) != 0x0) {
            if ((c = a.o) == null) {
                c = aisc.a;
            }
        }
        else {
            c = null;
        }
        String b2 = null;
        Label_0135: {
            if ((this.c = c) != null) {
                if (((ahcu)c).ry((ahci)WatchEndpointOuterClass.watchEndpoint)) {
                    b2 = ((apuw)((ahcu)c).rx((ahci)WatchEndpointOuterClass.watchEndpoint)).d;
                    break Label_0135;
                }
                if (((ahcu)c).ry((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
                    b2 = ((amyt)((ahcu)c).rx((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)).c;
                    break Label_0135;
                }
            }
            b2 = null;
        }
        this.b = b2;
        algn algn;
        if ((algn = a.e) == null) {
            algn = algn.a;
        }
        if (algn.b == 51779735) {
            algn algn2;
            if ((algn2 = a.e) == null) {
                algn2 = algn.a;
            }
            algd a2;
            if (algn2.b == 51779735) {
                a2 = (algd)algn2.c;
            }
            else {
                a2 = algd.a;
            }
            this.f = a2;
        }
        this.a = a;
        final algd f = this.f;
        if (f != null && (f.b & 0x1) != 0x0) {
            this.k = new ArrayList();
            algc algc;
            if ((algc = f.c) == null) {
                algc = algc.a;
            }
            if (algc.b == 49399797) {
                algc algc2;
                if ((algc2 = f.c) == null) {
                    algc2 = algc.a;
                }
                aobc a3;
                if (algc2.b == 49399797) {
                    a3 = (aobc)algc2.c;
                }
                else {
                    a3 = aobc.a;
                }
                this.e = new vic(a3);
                this.f(a3);
            }
            else {
                final algc c2 = f.c;
                algc a4;
                if (c2 == null) {
                    a4 = algc.a;
                }
                else {
                    a4 = c2;
                }
                if (a4.b == 91700600) {
                    algc a5;
                    if ((a5 = c2) == null) {
                        a5 = algc.a;
                    }
                    algq a6;
                    if (a5.b == 91700600) {
                        a6 = (algq)a5.c;
                    }
                    else {
                        a6 = algq.a;
                    }
                    for (final algp algp : a6.b) {
                        if (algp.b == 58174010) {
                            final zzm zzm = new zzm((aotv)algp.c);
                            this.k.add(zzm);
                            if (zzm.e() == null) {
                                continue;
                            }
                            this.f(zzm.e().a);
                        }
                    }
                }
            }
        }
        final algd f2 = this.f;
        if (f2 != null && (f2.b & 0x2) != 0x0) {
            algb algb;
            if ((algb = f2.d) == null) {
                algb = algb.a;
            }
            if (algb.b == 50631000) {
                algb algb2;
                if ((algb2 = f2.d) == null) {
                    algb2 = algb.a;
                }
                anli a7;
                if (algb2.b == 50631000) {
                    a7 = (anli)algb2.c;
                }
                else {
                    a7 = anli.a;
                }
                this.g = a7;
            }
            final String b3 = this.b;
            if (b3 != null) {
                b3.hashCode();
            }
            final anli g = this.g;
            if (g != null) {
                g.m.hashCode();
            }
        }
        final algd f3 = this.f;
        final afaz a8 = afaz.a;
        via h = via;
        if (f3 != null) {
            alfz alfz;
            if ((alfz = f3.e) == null) {
                alfz = alfz.a;
            }
            h = via;
            if (alfz.b == 46659098) {
                alfz alfz2;
                if ((alfz2 = f3.e) == null) {
                    alfz2 = alfz.a;
                }
                ahzf a9;
                if (alfz2.b == 46659098) {
                    a9 = (ahzf)alfz2.c;
                }
                else {
                    a9 = ahzf.a;
                }
                h = new via(a9, (afax)a8);
            }
        }
        this.h = h;
        this.d.addAll((Collection)a.v);
        alfx alfx;
        if ((alfx = a.g) == null) {
            alfx = alfx.a;
        }
        if (alfx.b == 78882851) {
            alfx alfx2;
            if ((alfx2 = a.g) == null) {
                alfx2 = alfx.a;
            }
            anis a10;
            if (alfx2.b == 78882851) {
                a10 = (anis)alfx2.c;
            }
            else {
                a10 = anis.a;
            }
            this.i = a10;
        }
    }
    
    private final void f(final aobc aobc) {
        final Iterator<Object> iterator = ((List<Object>)aobc.d).iterator();
    Label_0216:
        while (iterator.hasNext()) {
            alme alme;
            if ((alme = iterator.next().j) == null) {
                alme = alme.a;
            }
            for (final almh almh : alme.e) {
                if (this.l == null && (almh.c & 0x200) != 0x0) {
                    apps l;
                    if ((l = almh.I) == null) {
                        l = apps.a;
                    }
                    this.l = l;
                }
                else if (this.m == null && (almh.c & 0x400) != 0x0) {
                    appw m;
                    if ((m = almh.J) == null) {
                        m = appw.a;
                    }
                    this.m = m;
                }
                else {
                    if (this.n != null || (almh.e & 0x4) == 0x0) {
                        continue;
                    }
                    aoey n;
                    if ((n = almh.R) == null) {
                        n = aoey.a;
                    }
                    this.n = n;
                }
                if (this.l != null && this.m != null && this.n != null) {
                    break Label_0216;
                }
            }
        }
        final Iterator<Object> iterator3 = ((List<Object>)aobc.d).iterator();
        while (iterator3.hasNext()) {
            aoft aoft;
            if ((aoft = iterator3.next().v) == null) {
                aoft = aoft.a;
            }
            aofv aofv;
            if ((aofv = aoft.r) == null) {
                aofv = aofv.a;
            }
            akel akel;
            if ((akel = aofv.e) == null) {
                akel = akel.a;
            }
            for (final akem akem : akel.c) {
                if ((akem.b & 0x80000) != 0x0) {
                    akbw akbw;
                    if ((akbw = akem.x) == null) {
                        akbw = akbw.a;
                    }
                    aisc aisc;
                    if ((aisc = akbw.m) == null) {
                        aisc = aisc.a;
                    }
                    final apuw apuw = (apuw)((ahcu)aisc).rx((ahci)WatchEndpointOuterClass.watchEndpoint);
                    if ((apuw.b & 0x80000) == 0x0) {
                        continue;
                    }
                    final Map j = this.j;
                    final String d = apuw.d;
                    amzw amzw;
                    if ((amzw = apuw.q) == null) {
                        amzw = amzw.a;
                    }
                    j.put(d, amzw);
                }
            }
        }
    }
    
    public final anxa a() {
        anxa anxa;
        if ((anxa = this.a.f) == null) {
            anxa = anxa.a;
        }
        return anxa;
    }
    
    public final Object b() {
        return this.o;
    }
    
    public final void c(final Object o) {
        this.o = o;
    }
    
    public final byte[] d() {
        return this.a.u.I();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final int e() {
        int ce;
        if ((ce = aqvq.ce(this.a.B)) == 0) {
            ce = 1;
        }
        return ce;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.a, parcel);
    }
}
