import java.util.Iterator;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.io.IOException;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import android.net.Uri;
import java.util.concurrent.Executor;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iik implements aftz
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public iik(final ablw b, final List d, final pfq a, final AtomicInteger c, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public iik(final igu a, final Optional b, final Optional d, final Optional c, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public iik(final iin a, final zme b, final String c, final amuj d, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public iik(final String c, final qiq b, final qho a, final qjf d, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public iik(final pat a, final MessageLite d, final aezs b, final String c, final int e) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public iik(final pge b, final plc d, final pew a, final String c, final int e) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public iik(final php d, final List c, final pfd a, final pfn b, final int e) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public iik(final php c, final pfb a, final pfd b, final pfq d, final int e) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public iik(final php c, final pfd b, final pfb a, final pfq d, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public iik(final php d, final pfg a, final pfn b, final aftz c, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public iik(final php c, final pfn d, final pev a, final pfd b, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public iik(final php c, final pfq d, final pfd b, final pfb a, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public iik(final php d, final pjb c, final pfd a, final pfn b, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public iik(final pie a, final Executor c, final eg b, final aezp d, final int e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public iik(final pie b, final pfn a, final aezp d, final aftz c, final int e) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public iik(final pie d, final pfn b, final pfd a, final aftz c, final int e) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public iik(final pjk c, final pfq d, final Uri a, final Uri b, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public iik(final qho a, final ListenableFuture d, final qiq b, final String c, final int e) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final ListenableFuture a(Object o) {
        final int e = this.e;
        final Uri uri = null;
        final Boolean value = true;
        switch (e) {
            default: {
                final Object c = this.c;
                final Object b = this.b;
                final Object a = this.a;
                final Object d = this.d;
                ListenableFuture listenableFuture;
                if (!((String)o).equals(c)) {
                    listenableFuture = afvn.a;
                }
                else if (((afdn)qiv.c).containsKey((Object)aezq.a((Object)((qiq)b).a, c))) {
                    listenableFuture = afvn.a;
                }
                else {
                    listenableFuture = ((qho)a).c().a(((qjf)d).c);
                }
                return listenableFuture;
            }
            case 19: {
                final Object a2 = this.a;
                final Object d2 = this.d;
                final Object b2 = this.b;
                final Object c2 = this.c;
                final Void void1 = (Void)o;
                final qjf qjf = (qjf)afwm.u((Future)d2);
                ListenableFuture listenableFuture2;
                if (qjf.c.isEmpty()) {
                    listenableFuture2 = afvn.a;
                }
                else {
                    final qiq qiq = (qiq)b2;
                    final String a3 = qiq.a;
                    final qho qho = (qho)a2;
                    listenableFuture2 = aftq.f((ListenableFuture)afvk.m(aftq.e((ListenableFuture)afvk.m(qis.b(qho).a()), (aezf)new pjy(a3, 6), (Executor)qho.e())), (aftz)new iik((String)c2, qiq, qho, qjf, 20), (Executor)qho.e());
                }
                return listenableFuture2;
            }
            case 18: {
                Object o2 = this.c;
                final Object d3 = this.d;
                final Object a4 = this.a;
                final Object b3 = this.b;
                final pfs pfs = (pfs)o;
                Uri ap = uri;
                if (pfs != null) {
                    pfm pfm;
                    if ((pfm = pfm.a(pfs.d)) == null) {
                        pfm = pfm.a;
                    }
                    ap = uri;
                    if (pfm == pfm.e) {
                        final pjk pjk = (pjk)o2;
                        ap = qdw.ap(pjk.a, pjk.n, pfs.c, ((pfq)d3).e, pjk.c, pjk.l, false);
                    }
                }
                ListenableFuture listenableFuture3;
                if (ap == null) {
                    final asbe a5 = pev.a();
                    a5.a = peu.F;
                    listenableFuture3 = afwm.l((Throwable)a5.u());
                }
                else {
                    try {
                        if (((pjk)o2).o.al((Uri)a4)) {
                            ((pjk)o2).o.aj((Uri)a4);
                        }
                        ((pjk)o2).e.a();
                        ((pjk)o2).o.aj((Uri)b3);
                        final ahaz builder = ((ahbh)afrn.a).createBuilder();
                        final pjk pjk2 = (pjk)o2;
                        final String c3 = pjk2.h.c;
                        builder.copyOnWrite();
                        o2 = builder.instance;
                        c3.getClass();
                        ((afrn)o2).b |= 0x1;
                        ((afrn)o2).c = c3;
                        final int i = pjk2.i;
                        builder.copyOnWrite();
                        final afrn afrn = (afrn)builder.instance;
                        afrn.b |= 0x2;
                        afrn.d = i;
                        final String d4 = pjk2.h.d;
                        builder.copyOnWrite();
                        o2 = builder.instance;
                        d4.getClass();
                        ((afrn)o2).b |= 0x4;
                        ((afrn)o2).e = d4;
                        final long j = pjk2.j;
                        builder.copyOnWrite();
                        final afrn afrn2 = (afrn)builder.instance;
                        afrn2.b |= 0x40;
                        afrn2.i = j;
                        final String k = pjk2.k;
                        builder.copyOnWrite();
                        o2 = builder.instance;
                        k.getClass();
                        ((afrn)o2).b |= 0x80;
                        ((afrn)o2).j = k;
                        final afrn afrn3 = (afrn)builder.build();
                        final pjq g = pjk2.g;
                        o2 = pjk2.d;
                        final long n = ((pfb)o2).e;
                        final long n2 = pjk2.f.d;
                        o2 = ((pfb)o2).c;
                        while (true) {
                            for (int l = 0; l < pjk2.d.l.size(); ++l) {
                                if (aevy.d((CharSequence)((pfe)pjk2.d.l.get(l)).e, (CharSequence)pjk2.f.e)) {
                                    ++l;
                                    g.k(afrn3, 4, n, n2, (String)o2, l);
                                    listenableFuture3 = afvn.a;
                                    return listenableFuture3;
                                }
                            }
                            int l = 0;
                            continue;
                        }
                    }
                    catch (final IOException b4) {
                        final pjk pjk3 = (pjk)o2;
                        pjs.f((Throwable)b4, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", new Object[] { "DeltaFileDownloaderCallbackImpl", pjk3.f.c, pjk3.d.g });
                        pjk3.c.a((Throwable)b4, "Failed to decode delta file.", new Object[0]);
                        final asbe a6 = pev.a();
                        a6.a = peu.G;
                        a6.b = b4;
                        listenableFuture3 = afwm.l((Throwable)a6.u());
                    }
                }
                return listenableFuture3;
            }
            case 17: {
                final Object b5 = this.b;
                final Object a7 = this.a;
                final Object d5 = this.d;
                final Object c4 = this.c;
                final Void void2 = (Void)o;
                return ((pie)b5).d.e((pfn)a7, (pfg)((aezp)d5).f(), (aftz)c4);
            }
            case 16: {
                final Object d6 = this.d;
                final Object b6 = this.b;
                final Object a8 = this.a;
                final Object c5 = this.c;
                ListenableFuture listenableFuture4;
                if (o) {
                    final pie pie = (pie)d6;
                    final php d7 = pie.d;
                    final pfd pfd = (pfd)a8;
                    listenableFuture4 = afnd.q(d7.p((pfn)b6, pfd, (aftz)c5), (aezf)new lly(pie, pfd, 7), pie.j);
                }
                else {
                    listenableFuture4 = afwm.m((Object)value);
                }
                return listenableFuture4;
            }
            case 15: {
                final Object c6 = this.c;
                final Object b7 = this.b;
                final Object a9 = this.a;
                final Object d8 = this.d;
                final Void void3 = (Void)o;
                final php php = (php)c6;
                final pip pip = (pip)php.e;
                final pfq pfq = (pfq)d8;
                final ListenableFuture d9 = pip.d(pfq);
                final pfb pfb = (pfb)a9;
                final pfd pfd2 = (pfd)b7;
                return php.n(afnd.m(d9, (Class)piq.class, (aftz)new iik(php, pfq, pfd2, pfb, 6), (Executor)php.h), (aftz)new iik(php, pfb, pfd2, pfq, 7));
            }
            case 14: {
                final Object d10 = this.d;
                final Object a10 = this.a;
                final Object b8 = this.b;
                final Object c7 = this.c;
                final pfd pfd3 = (pfd)o;
                if (a10 != null) {
                    o = a10;
                }
                else if ((o = pfd3.l) == null) {
                    o = pfg.a;
                }
                final ArrayList list = new ArrayList();
                for (final pfb pfb2 : pfd3.n) {
                    if (!plv.m(pfb2)) {
                        int f;
                        if ((f = pri.F(pfd3.i)) == 0) {
                            f = 1;
                        }
                        final pfq u = ohg.u(pfb2, f);
                        ListenableFuture listenableFuture5;
                        if (Build$VERSION.SDK_INT >= 30) {
                            final php php2 = (php)d10;
                            listenableFuture5 = php2.n(php2.n(afnd.m(((pip)php2.e).d(u), (Class)piq.class, (aftz)new iik(php2, u, pfd3, pfb2, 8), (Executor)php2.h), (aftz)new iik(php2, pfd3, pfb2, u, 9)), (aftz)new zoz(php2, (pfn)b8, pfb2, u, (pfg)o, pfd3, 1));
                        }
                        else {
                            try {
                                listenableFuture5 = ((pip)((php)d10).e).e((pfn)b8, pfb2, u, (pfg)o, pfd3.o, (List)pfd3.p);
                            }
                            catch (final RuntimeException b9) {
                                final asbe a11 = pev.a();
                                a11.a = peu.c;
                                a11.b = b9;
                                listenableFuture5 = afwm.l((Throwable)a11.u());
                            }
                        }
                        list.add(listenableFuture5);
                    }
                }
                final piz q = plv.q((Iterable)list);
                final pfn pfn = (pfn)b8;
                final php php3 = (php)d10;
                return q.d((afty)new phf(php3, pfn, pfd3, (aftz)c7, (List)list, 2), (Executor)php3.h);
            }
            case 13: {
                final Object c8 = this.c;
                final Object d11 = this.d;
                final Object a12 = this.a;
                final Object b10 = this.b;
                final Void void4 = (Void)o;
                final pfd pfd4 = (pfd)b10;
                return ((php)c8).k((pfn)d11, (pev)a12, pfd4.r, pfd4.s);
            }
            case 12: {
                final Object c9 = this.c;
                final Object d12 = this.d;
                final Object a13 = this.a;
                final Object b11 = this.b;
                final Void void5 = (Void)o;
                final pfd pfd5 = (pfd)b11;
                return ((php)c9).k((pfn)d12, (pev)a13, pfd5.r, pfd5.s);
            }
            case 11: {
                final Object d13 = this.d;
                final Object c10 = this.c;
                final Object a14 = this.a;
                final Object b12 = this.b;
                ListenableFuture listenableFuture6;
                if (o) {
                    listenableFuture6 = afvn.a;
                }
                else {
                    ((pjb)c10).a((pfd)a14);
                    afwm.m((Object)value);
                    final php php4 = (php)d13;
                    final Object d14 = php4.d;
                    final pfn pfn2 = (pfn)b12;
                    listenableFuture6 = php4.n(((phq)d14).i(pfn2), (aftz)new phe(php4, pfn2, 0));
                }
                return listenableFuture6;
            }
            case 10: {
                final Object d15 = this.d;
                final Object c11 = this.c;
                final Object a15 = this.a;
                final Object b13 = this.b;
                if (o == pho.b) {
                    o = ((php)d15).b;
                    final ahaz builder2 = ((ahbh)afrn.a).createBuilder();
                    final pfn pfn3 = (pfn)b13;
                    final String c12 = pfn3.c;
                    builder2.copyOnWrite();
                    final afrn afrn4 = (afrn)builder2.instance;
                    c12.getClass();
                    afrn4.b |= 0x1;
                    afrn4.c = c12;
                    final String d16 = pfn3.d;
                    builder2.copyOnWrite();
                    final afrn afrn5 = (afrn)builder2.instance;
                    d16.getClass();
                    afrn5.b |= 0x4;
                    afrn5.e = d16;
                    final pfd pfd6 = (pfd)a15;
                    final int f2 = pfd6.f;
                    builder2.copyOnWrite();
                    final afrn afrn6 = (afrn)builder2.instance;
                    afrn6.b |= 0x2;
                    afrn6.d = f2;
                    final long r = pfd6.r;
                    builder2.copyOnWrite();
                    final afrn afrn7 = (afrn)builder2.instance;
                    afrn7.b |= 0x40;
                    afrn7.i = r;
                    final String s = pfd6.s;
                    builder2.copyOnWrite();
                    final afrn afrn8 = (afrn)builder2.instance;
                    s.getClass();
                    afrn8.b |= 0x80;
                    afrn8.j = s;
                    ((pjq)o).j(3, (afrn)builder2.build());
                    return afwm.m(a15);
                }
                final pfn pfn4 = (pfn)b13;
                pjs.e("%s downloadFileGroup %s %s can't finish!", new Object[] { "FileGroupManager", pfn4.c, pfn4.d });
                pen.b((Collection)c11, new Object[] { pfn4.c });
                pjs.c("%s: An unknown error has occurred during download", (Object)"FileGroupManager");
                final asbe a16 = pev.a();
                a16.a = peu.c;
                throw a16.u();
            }
            case 9: {
                final Object c13 = this.c;
                final Object b14 = this.b;
                final Object a17 = this.a;
                final Object d17 = this.d;
                final pfs pfs2 = (pfs)o;
                final pfd pfd7 = (pfd)b14;
                final long m = pfd7.k;
                Label_2829: {
                    try {
                        ListenableFuture listenableFuture7;
                        grs grs;
                        php php5;
                        if (pfs2.e) {
                            final String c14 = ((pfb)a17).c;
                            final String d18 = ((pfd)b14).d;
                            final int a18 = pjs.a;
                            listenableFuture7 = ((php)c13).u((pfd)b14, (pfb)a17, pfs2, (pfq)d17, pfs2.g, m, 3);
                            grs = grs.j;
                            php5 = (php)c13;
                        }
                        else {
                            final String o3 = ((pfb)a17).o;
                            if (TextUtils.isEmpty((CharSequence)o3)) {
                                break Label_2829;
                            }
                            if (qdw.aw((Context)((php)c13).a, o3, (pfd)b14, (pfb)a17, (eg)((php)c13).g)) {
                                final String c15 = ((pfb)a17).c;
                                final String d19 = ((pfd)b14).d;
                                final int a19 = pjs.a;
                                listenableFuture7 = ((php)c13).u((pfd)b14, (pfb)a17, pfs2, (pfq)d17, o3, m, 4);
                                grs = grs.k;
                                php5 = (php)c13;
                            }
                            else {
                                final int h = pri.H(((pfb)a17).m);
                                if (h == 0) {
                                    break Label_2829;
                                }
                                if (h != 2) {
                                    break Label_2829;
                                }
                                pfm pfm2;
                                if ((pfm2 = pfm.a(pfs2.d)) == null) {
                                    pfm2 = pfm.a;
                                }
                                if (pfm2 != pfm.e) {
                                    break Label_2829;
                                }
                                final String c16 = ((pfb)a17).c;
                                final String d20 = ((pfd)b14).d;
                                final int a20 = pjs.a;
                                qdw.av((Context)((php)c13).a, o3, ((php)c13).a((pfb)a17, (pfq)d17, pfs2), (pfd)b14, (pfb)a17, (eg)((php)c13).g, false);
                                listenableFuture7 = ((php)c13).u((pfd)b14, (pfb)a17, pfs2, (pfq)d17, o3, m, 6);
                                grs = grs.l;
                                php5 = (php)c13;
                            }
                        }
                        return php5.n(listenableFuture7, (aftz)grs);
                    }
                    catch (final pkg pkg) {
                        php.w((pjq)((php)c13).b, pfd7, (pfb)a17, pkg.a);
                    }
                }
                final String c17 = ((pfb)a17).c;
                final String d21 = pfd7.d;
                final int a21 = pjs.a;
                return afvn.a;
            }
            case 8: {
                final Object c18 = this.c;
                final Object d22 = this.d;
                final Object b15 = this.b;
                final Object a22 = this.a;
                final piq piq = (piq)o;
                pjs.d("%s: Shared file not found, newFileKey = %s", (Object)"FileGroupManager", d22);
                final php php6 = (php)c18;
                ((pgf)php6.c).a((Throwable)piq, "Shared file not found in downloadFileGroup", new Object[0]);
                php.w((pjq)php6.b, (pfd)b15, (pfb)a22, 26);
                return afwm.l((Throwable)piq);
            }
            case 7: {
                final Object c19 = this.c;
                final Object a23 = this.a;
                final Object b16 = this.b;
                final Object d23 = this.d;
                final pfs pfs3 = (pfs)o;
                final pfb pfb3 = (pfb)a23;
                final String o4 = pfb3.o;
                final pfd pfd8 = (pfd)b16;
                final long k2 = pfd8.k;
                pfm pfm3;
                if ((pfm3 = pfm.a(pfs3.d)) == null) {
                    pfm3 = pfm.a;
                }
                ListenableFuture listenableFuture9;
                if (pfm3 != pfm.e) {
                    listenableFuture9 = afvn.a;
                }
                else if (pfs3.e) {
                    if (php.t(pfs3, k2)) {
                        final String c20 = pfb3.c;
                        final String d24 = pfd8.d;
                        final int a24 = pjs.a;
                        final String g2 = pfs3.g;
                        final pfq pfq2 = (pfq)d23;
                        final php php7 = (php)c19;
                        listenableFuture9 = php7.n(php7.u(pfd8, pfb3, pfs3, pfq2, g2, k2, 27), (aftz)new phm(php7, pfd8, pfb3, pfq2, k2, 1));
                    }
                    else {
                        listenableFuture9 = afvn.a;
                    }
                }
                else {
                    try {
                        Label_3550: {
                            if (!TextUtils.isEmpty((CharSequence)o4)) {
                                final Uri a25 = ((php)c19).a((pfb)a23, (pfq)d23, pfs3);
                                ListenableFuture listenableFuture10;
                                phm phm;
                                php php8;
                                if (qdw.aw((Context)((php)c19).a, o4, (pfd)b16, (pfb)a23, (eg)((php)c19).g)) {
                                    final String c21 = ((pfb)a23).c;
                                    final String d25 = ((pfd)b16).d;
                                    final int a26 = pjs.a;
                                    listenableFuture10 = ((php)c19).u((pfd)b16, (pfb)a23, pfs3, (pfq)d23, o4, k2, 5);
                                    phm = new phm((php)c19, (pfd)b16, (pfb)a23, (pfq)d23, k2, 0);
                                    php8 = (php)c19;
                                }
                                else {
                                    final int h2 = pri.H(((pfb)a23).m);
                                    if (h2 == 0) {
                                        break Label_3550;
                                    }
                                    if (h2 != 2) {
                                        break Label_3550;
                                    }
                                    final String c22 = ((pfb)a23).c;
                                    final String d26 = ((pfd)b16).d;
                                    final int a27 = pjs.a;
                                    qdw.av((Context)((php)c19).a, o4, a25, (pfd)b16, (pfb)a23, (eg)((php)c19).g, true);
                                    listenableFuture10 = ((php)c19).u((pfd)b16, (pfb)a23, pfs3, (pfq)d23, o4, k2, 7);
                                    phm = new phm((php)c19, (pfd)b16, (pfb)a23, (pfq)d23, k2, 2);
                                    php8 = (php)c19;
                                }
                                listenableFuture9 = php8.n(listenableFuture10, (aftz)phm);
                                return listenableFuture9;
                            }
                        }
                        final int h3 = pri.H(((pfb)a23).m);
                        if (h3 != 0) {
                            if (h3 == 2) {
                                php.w((pjq)((php)c19).b, (pfd)b16, (pfb)a23, 16);
                            }
                        }
                    }
                    catch (final pkg pkg2) {
                        php.w((pjq)((php)c19).b, pfd8, pfb3, pkg2.a);
                    }
                    final String c23 = pfb3.c;
                    final String d27 = pfd8.d;
                    final int a28 = pjs.a;
                    listenableFuture9 = ((php)c19).o(pfd8, pfb3, (pfq)d23, k2);
                }
                return listenableFuture9;
            }
            case 6: {
                final Object c24 = this.c;
                final Object d28 = this.d;
                final Object b17 = this.b;
                final Object a29 = this.a;
                final piq piq2 = (piq)o;
                pjs.d("%s: Shared file not found, newFileKey = %s", (Object)"FileGroupManager", d28);
                final php php9 = (php)c24;
                ((pgf)php9.c).a((Throwable)piq2, "Shared file not found in downloadFileGroup", new Object[0]);
                php.w((pjq)php9.b, (pfd)b17, (pfb)a29, 26);
                return afwm.l((Throwable)piq2);
            }
            case 5: {
                final Object b18 = this.b;
                final Object d29 = this.d;
                final Object a30 = this.a;
                final Object c25 = this.c;
                final pfs pfs4 = (pfs)o;
                if (pfs4 != null && pfs4.e) {
                    o = ((ablw)b18).a;
                    ((List<Uri>)d29).add(qdw.an((Context)o, pfs4.g));
                }
                final ablw ablw = (ablw)b18;
                final pip pip2 = (pip)ablw.g;
                final pir c26 = pip2.c;
                final pfq pfq3 = (pfq)a30;
                return afnd.q(afnd.r(c26.e(pfq3), (aftz)new phy(pip2, pfq3, 5), pip2.j), (aezf)new iko(ablw, (AtomicInteger)c25, pfq3, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)ablw.k);
            }
            case 4: {
                final Object b19 = this.b;
                final Object d30 = this.d;
                final Object a31 = this.a;
                final Object c27 = this.c;
                final Void void6 = (Void)o;
                o = afwm.u((Future)d30);
                if (((pew)a31).e.h()) {
                    try {
                        ((xra)((pew)a31).e.c()).h((pek)o);
                    }
                    catch (final Exception ex) {
                        pjs.i((Throwable)ex, "%s: Listener onComplete failed for group %s", new Object[] { "MobileDataDownload", ((pek)o).c });
                    }
                    final pge pge = (pge)b19;
                    if (pge.f.h()) {
                        ((pkw)pge.f.c()).h((String)c27);
                    }
                }
                return afwm.m(o);
            }
            case 3: {
                final Object a32 = this.a;
                final Object c28 = this.c;
                return afnd.r(pge.k((pfd)o, (String)null, 4, true, (pie)a32, (Executor)c28, (eg)this.b), aeun.d((aftz)new nyu((aezp)this.d, 6)), (Executor)c28);
            }
            case 2: {
                final Object a33 = this.a;
                final Object d31 = this.d;
                final Object b20 = this.b;
                final Object c29 = this.c;
                final pag pag = (pag)o;
                final mor a34 = ((pat)a33).a(pag);
                ListenableFuture listenableFuture11;
                if (a34 == null) {
                    listenableFuture11 = afwm.m((Object)null);
                }
                else {
                    final moq b21 = a34.b((MessageLite)d31);
                    ((aezs)b20).a((Object)b21);
                    aefb.L(true);
                    b21.k = (String)c29;
                    b21.l = null;
                    final int n3 = pag.b - 1;
                    if (n3 != 0) {
                        if (n3 != 1) {
                            if (n3 != 2) {
                                throw new IllegalArgumentException("Dropped logs must not be logged.");
                            }
                        }
                        else {
                            b21.e((String)null);
                        }
                    }
                    else {
                        b21.e(pag.a);
                    }
                    final mrd b22 = b21.b();
                    final oyn oyn = new oyn((Object)b22);
                    b22.g((mrh)new mmb(oyn, 2));
                    listenableFuture11 = aftq.e((ListenableFuture)oyn, adkp.ad(), (Executor)afum.a);
                }
                return listenableFuture11;
            }
            case 1: {
                final Object a35 = this.a;
                final Object b23 = this.b;
                final Object d32 = this.d;
                final Object c30 = this.c;
                final Optional optional = (Optional)o;
                final amwb amwb = (amwb)((Optional)d32).get();
                ListenableFuture listenableFuture12;
                if (optional.isPresent()) {
                    listenableFuture12 = afwm.m((Object)((ajjx)optional.get()).d);
                }
                else {
                    final igu igu = (igu)a35;
                    final boolean g3 = igu.g(amwb);
                    if (igu.c.az()) {
                        listenableFuture12 = aftq.e((ListenableFuture)afvk.m(igu.c((Optional)c30, (Optional)b23, Optional.of((Object)amwb))), (aezf)new exf(g3, 8), igu.b);
                    }
                    else {
                        listenableFuture12 = aftq.e((ListenableFuture)afvk.m(igu.b((Optional)b23, Optional.of((Object)amwb))), (aezf)new exf(g3, 9), igu.b);
                    }
                }
                return listenableFuture12;
            }
            case 0: {
                final Object a36 = this.a;
                final Object b24 = this.b;
                final Object c31 = this.c;
                final Object d33 = this.d;
                final aabz aabz = (aabz)o;
                final int f3 = aabz.f;
                if (f3 != 0) {
                    ListenableFuture listenableFuture13;
                    if (f3 != 2) {
                        listenableFuture13 = afwm.m((Object)aabz);
                    }
                    else {
                        listenableFuture13 = ((iin)a36).j((zme)b24, (String)c31, (amuj)d33);
                    }
                    return listenableFuture13;
                }
                throw null;
            }
        }
    }
}
