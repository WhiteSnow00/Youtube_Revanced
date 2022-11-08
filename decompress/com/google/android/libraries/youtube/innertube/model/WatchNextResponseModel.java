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

public class WatchNextResponseModel implements Parcelable, abxy
{
    public static final Parcelable$Creator CREATOR;
    public final alcj a;
    public final String b;
    public final aioe c;
    public final List d;
    public veu e;
    public alca f;
    public angx g;
    public ves h;
    public aneh i;
    private final Map j;
    private List k;
    private aplc l;
    private aplg m;
    private aoap n;
    private Object o;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(9);
    }
    
    public WatchNextResponseModel(final alcj a) {
        a.getClass();
        this.d = new ArrayList();
        this.j = new HashMap();
        final int b = a.b;
        final ves ves = null;
        aioe c;
        if ((b & 0x1000) != 0x0) {
            if ((c = a.o) == null) {
                c = aioe.a;
            }
        }
        else {
            c = null;
        }
        String b2 = null;
        Label_0146: {
            if ((this.c = c) != null) {
                if (((agzd)c).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                    b2 = ((apqg)((agzd)c).rr((agyr)WatchEndpointOuterClass.watchEndpoint)).d;
                    break Label_0146;
                }
                if (((agzd)c).rs((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
                    b2 = ((amuk)((agzd)c).rr((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)).c;
                    break Label_0146;
                }
            }
            b2 = null;
        }
        this.b = b2;
        alck alck;
        if ((alck = a.e) == null) {
            alck = alck.a;
        }
        if (alck.b == 51779735) {
            alck alck2;
            if ((alck2 = a.e) == null) {
                alck2 = alck.a;
            }
            alca a2;
            if (alck2.b == 51779735) {
                a2 = (alca)alck2.c;
            }
            else {
                a2 = alca.a;
            }
            this.f = a2;
        }
        this.a = a;
        final alca f = this.f;
        if (f != null && (f.b & 0x1) != 0x0) {
            this.k = new ArrayList();
            albz albz;
            if ((albz = f.c) == null) {
                albz = albz.a;
            }
            if (albz.b == 49399797) {
                albz albz2;
                if ((albz2 = f.c) == null) {
                    albz2 = albz.a;
                }
                anws a3;
                if (albz2.b == 49399797) {
                    a3 = (anws)albz2.c;
                }
                else {
                    a3 = anws.a;
                }
                this.e = new veu(a3);
                this.f(a3);
            }
            else {
                final albz c2 = f.c;
                albz a4;
                if (c2 == null) {
                    a4 = albz.a;
                }
                else {
                    a4 = c2;
                }
                if (a4.b == 91700600) {
                    albz a5;
                    if ((a5 = c2) == null) {
                        a5 = albz.a;
                    }
                    alcn a6;
                    if (a5.b == 91700600) {
                        a6 = (alcn)a5.c;
                    }
                    else {
                        a6 = alcn.a;
                    }
                    for (final alcm alcm : a6.b) {
                        if (alcm.b == 58174010) {
                            final zvt zvt = new zvt((aopg)alcm.c);
                            this.k.add(zvt);
                            if (zvt.e() == null) {
                                continue;
                            }
                            this.f(zvt.e().a);
                        }
                    }
                }
            }
        }
        final alca f2 = this.f;
        if (f2 != null && (f2.b & 0x2) != 0x0) {
            alby alby;
            if ((alby = f2.d) == null) {
                alby = alby.a;
            }
            if (alby.b == 50631000) {
                alby alby2;
                if ((alby2 = f2.d) == null) {
                    alby2 = alby.a;
                }
                angx a7;
                if (alby2.b == 50631000) {
                    a7 = (angx)alby2.c;
                }
                else {
                    a7 = angx.a;
                }
                this.g = a7;
            }
            final String b3 = this.b;
            if (b3 != null) {
                b3.hashCode();
            }
            final angx g = this.g;
            if (g != null) {
                g.m.hashCode();
            }
        }
        final alca f3 = this.f;
        final aexi a8 = aexi.a;
        ves h = ves;
        if (f3 != null) {
            albw albw;
            if ((albw = f3.e) == null) {
                albw = albw.a;
            }
            h = ves;
            if (albw.b == 46659098) {
                albw albw2;
                if ((albw2 = f3.e) == null) {
                    albw2 = albw.a;
                }
                ahvo a9;
                if (albw2.b == 46659098) {
                    a9 = (ahvo)albw2.c;
                }
                else {
                    a9 = ahvo.a;
                }
                h = new ves(a9, (aexg)a8);
            }
        }
        this.h = h;
        this.d.addAll(a.v);
        albu albu;
        if ((albu = a.g) == null) {
            albu = albu.a;
        }
        if (albu.b == 78882851) {
            albu albu2;
            if ((albu2 = a.g) == null) {
                albu2 = albu.a;
            }
            aneh a10;
            if (albu2.b == 78882851) {
                a10 = (aneh)albu2.c;
            }
            else {
                a10 = aneh.a;
            }
            this.i = a10;
        }
    }
    
    private final void f(final anws anws) {
        final Iterator<Object> iterator = anws.d.iterator();
    Label_0232:
        while (iterator.hasNext()) {
            alib alib;
            if ((alib = iterator.next().j) == null) {
                alib = alib.a;
            }
            for (final alie alie : alib.e) {
                if (this.l == null && (alie.c & 0x200) != 0x0) {
                    aplc l;
                    if ((l = alie.I) == null) {
                        l = aplc.a;
                    }
                    this.l = l;
                }
                else if (this.m == null && (alie.c & 0x400) != 0x0) {
                    aplg m;
                    if ((m = alie.J) == null) {
                        m = aplg.a;
                    }
                    this.m = m;
                }
                else {
                    if (this.n != null || (alie.e & 0x4) == 0x0) {
                        continue;
                    }
                    aoap n;
                    if ((n = alie.R) == null) {
                        n = aoap.a;
                    }
                    this.n = n;
                }
                if (this.l != null && this.m != null && this.n != null) {
                    break Label_0232;
                }
            }
        }
        final Iterator<Object> iterator3 = anws.d.iterator();
        while (iterator3.hasNext()) {
            aobk aobk;
            if ((aobk = iterator3.next().v) == null) {
                aobk = aobk.a;
            }
            aobm aobm;
            if ((aobm = aobk.r) == null) {
                aobm = aobm.a;
            }
            akah akah;
            if ((akah = aobm.e) == null) {
                akah = akah.a;
            }
            for (final akai akai : akah.c) {
                if ((akai.b & 0x80000) != 0x0) {
                    ajxs ajxs;
                    if ((ajxs = akai.x) == null) {
                        ajxs = ajxs.a;
                    }
                    aioe aioe;
                    if ((aioe = ajxs.m) == null) {
                        aioe = aioe.a;
                    }
                    final apqg apqg = (apqg)((agzd)aioe).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                    if ((apqg.b & 0x40000) == 0x0) {
                        continue;
                    }
                    final Map j = this.j;
                    final String d = apqg.d;
                    amvn amvn;
                    if ((amvn = apqg.q) == null) {
                        amvn = amvn.a;
                    }
                    j.put(d, amvn);
                }
            }
        }
    }
    
    public final ansr a() {
        ansr ansr;
        if ((ansr = this.a.f) == null) {
            ansr = ansr.a;
        }
        return ansr;
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
        int cl;
        if ((cl = aqql.cl(this.a.B)) == 0) {
            cl = 1;
        }
        return cl;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        uji.ag((MessageLite)this.a, parcel);
    }
}
