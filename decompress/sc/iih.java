import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.protobuf.MessageLite;
import android.text.TextUtils;
import java.io.IOException;
import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iih implements aftz
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public iih(final igu a, final Optional b, final Optional c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public iih(final iin a, final amuj c, final aaej b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public iih(final iin a, final String c, final amuj b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public iih(final iin a, final zme b, final String c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public iih(final iqp b, final ahbb c, final imt a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public iih(final iqp b, final imt a, final ahbb c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public iih(final List c, final eg a, final ahaz b, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public iih(final odk b, final oci a, final Optional c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public iih(final pge b, final pfn a, final aezp c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public iih(final pge b, final pix c, final pey a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public iih(final php b, final ahaz c, final pev a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public iih(final php a, final List c, final afev b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public iih(final php b, final AtomicReference c, final pfn a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public iih(final php c, final pfb a, final pfd b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public iih(final php b, final pfd a, final pix c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public iih(final php b, final pfn a, final aftz c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public iih(final php c, final pfn b, final pfd a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public iih(final tmx a, final Boolean c, final tmx b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final ListenableFuture a(Object d) {
        final int d2 = this.d;
        final String s = null;
        final Boolean value = false;
        switch (d2) {
            default: {
                final Object c = this.c;
                final Object b = this.b;
                final Object a = this.a;
                final aezp aezp = (aezp)d;
                d = (IOException)((php)c).d;
                return ((phq)d).l((pfn)b, (pfd)a);
            }
            case 19: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                final Object c2 = this.c;
                final pfd pfd = (pfd)d;
                ListenableFuture listenableFuture;
                if (pfd == null) {
                    listenableFuture = afwm.m((Object)null);
                }
                else {
                    listenableFuture = ((php)b2).p((pfn)a2, pfd, (aftz)c2);
                }
                return listenableFuture;
            }
            case 18: {
                final Object c3 = this.c;
                final Object a3 = this.a;
                final Object b3 = this.b;
                if (!(boolean)d) {
                    final pfb pfb = (pfb)a3;
                    final String c4 = pfb.c;
                    final pfd pfd2 = (pfd)b3;
                    pjs.e("%s: Failed to set new state for file %s, filegroup %s", new Object[] { "FileGroupManager", c4, pfd2.d });
                    php.w((pjq)((php)c3).b, pfd2, pfb, 14);
                }
                return afvn.a;
            }
            case 17: {
                final Object b4 = this.b;
                final Object c5 = this.c;
                final Object a4 = this.a;
                final pfd pfd3 = (pfd)d;
                if (pfd3 != null) {
                    final int f = pfd3.f;
                    final ahaz ahaz = (ahaz)c5;
                    ahaz.copyOnWrite();
                    final afrn afrn = (afrn)ahaz.instance;
                    final afrn a5 = afrn.a;
                    afrn.b |= 0x2;
                    afrn.d = f;
                }
                ((pjq)((php)b4).b).j(afse.g(((pev)a4).a.ap), (afrn)((ahaz)c5).build());
                return afvn.a;
            }
            case 16: {
                final Object b5 = this.b;
                final Object c6 = this.c;
                final Object a6 = this.a;
                final Exception ex = d;
                pfd a7;
                if ((a7 = ((AtomicReference<pfd>)c6).get()) == null) {
                    a7 = pfd.a;
                }
                ListenableFuture listenableFuture2 = afvn.a;
                ListenableFuture n;
                if (ex instanceof pev) {
                    final int a8 = pjs.a;
                    final pev pev = (pev)ex;
                    final pfn pfn = (pfn)a6;
                    final php php = (php)b5;
                    n = php.n(listenableFuture2, (aftz)new iik(php, pfn, pev, a7, 12));
                }
                else {
                    n = listenableFuture2;
                    if (ex instanceof pen) {
                        final int a9 = pjs.a;
                        final afeq a10 = ((pen)ex).a;
                        final int c7 = ((afih)a10).c;
                        int n2 = 0;
                        while (true) {
                            n = listenableFuture2;
                            if (n2 >= c7) {
                                break;
                            }
                            final Throwable t = ((List<Throwable>)a10).get(n2);
                            if (!(t instanceof pev)) {
                                pjs.c("%s: Expecting DownloadException's in AggregateException", (Object)"FileGroupManager");
                            }
                            else {
                                final pev pev2 = (pev)t;
                                final pfn pfn2 = (pfn)a6;
                                final php php2 = (php)b5;
                                listenableFuture2 = php2.n(listenableFuture2, (aftz)new iik(php2, pfn2, pev2, a7, 13));
                            }
                            ++n2;
                        }
                    }
                }
                d = (IOException)new phk(ex, 0);
                return ((php)b5).n(n, (aftz)d);
            }
            case 15: {
                final Object a11 = this.a;
                final Object c8 = this.c;
                final Object b6 = this.b;
                d = d;
                for (final pfb pfb2 : c8) {
                    try {
                        final Uri uri = (Uri)((afev)b6).get(pfb2);
                        uri.getClass();
                        final Uri uri2 = (Uri)((afev)d).get(pfb2);
                        uri2.getClass();
                        final Uri parse = Uri.parse(uri.toString().substring(0, uri.toString().lastIndexOf("/")));
                        if (!((eg)((php)a11).g).al(parse)) {
                            ((eg)((php)a11).g).ah(parse);
                        }
                        pkm.b((Context)((php)a11).a, uri, uri2);
                        continue;
                    }
                    catch (final IOException d) {}
                    catch (final NullPointerException ex2) {}
                    final asbe a12 = pev.a();
                    a12.a = peu.N;
                    a12.c = "Unable to create symlink";
                    a12.b = d;
                    return afwm.l((Throwable)a12.u());
                }
                return afvn.a;
            }
            case 14: {
                final Object b7 = this.b;
                final Object a13 = this.a;
                final Object c9 = this.c;
                final piq piq = (piq)d;
                pjs.c("%s: Missing file. Logging and deleting file group.", (Object)"FileGroupManager");
                final php php3 = (php)b7;
                php.v(1062, (pjq)php3.b, (pfd)a13);
                ((pex)php3.k).k();
                return php3.n(((phq)php3.d).i(((pix)c9).a), (aftz)grs.m);
            }
            case 13: {
                final Object c10 = this.c;
                final Object b8 = this.b;
                final Object a14 = this.a;
                ListenableFuture listenableFuture4;
                if (d) {
                    final String c11 = ((pfn)b8).c;
                    final int a15 = pjs.a;
                    listenableFuture4 = afwm.m((Object)value);
                }
                else {
                    final pfd pfd4 = (pfd)a14;
                    d = (IOException)a14;
                    if (plv.l(pfd4)) {
                        final afoj a16 = afol.a().a();
                        a16.f((CharSequence)pfd4.s);
                        a16.f((CharSequence)"|");
                        a16.f((CharSequence)((pfn)b8).e);
                        a16.f((CharSequence)"|");
                        final long r = pfd4.r;
                        final afoc afoc = (afoc)a16;
                        afoc.a.putLong(r);
                        afoc.c(8);
                        final String format = String.format("%s_%s", pfd4.d, a16.g().toString());
                        final ahaz builder = ((ahbh)a14).toBuilder();
                        builder.copyOnWrite();
                        final pfd pfd5 = (pfd)builder.instance;
                        format.getClass();
                        pfd5.b |= 0x20000;
                        pfd5.v = format;
                        d = (IOException)builder.build();
                    }
                    final ahaz builder2 = ((ahbh)b8).toBuilder();
                    builder2.copyOnWrite();
                    final pfn pfn3 = (pfn)builder2.instance;
                    pfn3.b |= 0x8;
                    pfn3.f = false;
                    final pfn pfn4 = (pfn)builder2.build();
                    final php php4 = (php)c10;
                    listenableFuture4 = php4.n(php4.n(((phq)php4.d).g(pfn4), (aftz)new phe(php4, (pfd)d, 10)), (aftz)new phe(php4, (pfn)b8, 4));
                }
                return listenableFuture4;
            }
            case 12: {
                final Object c12 = this.c;
                final Object b9 = this.b;
                final Object a17 = this.a;
                final Boolean b10 = (Boolean)d;
                final ahaz builder3 = ((ahbh)b9).toBuilder();
                builder3.copyOnWrite();
                final pfn pfn5 = (pfn)builder3.instance;
                pfn5.b |= 0x8;
                pfn5.f = false;
                final pfn pfn6 = (pfn)builder3.build();
                final php php5 = (php)c12;
                return php5.n(((phq)php5.d).g(pfn6), (aftz)new phi(php5, (pfd)a17, (pfn)b9, 3));
            }
            case 11: {
                final Object c13 = this.c;
                final Object b11 = this.b;
                final Object a18 = this.a;
                pfo a19;
                if ((a19 = (pfo)d) == null) {
                    a19 = pfo.a;
                }
                if (a19.b) {
                    return afwm.m((Object)null);
                }
                final pfn pfn7 = (pfn)b11;
                final String c14 = pfn7.c;
                final String d3 = pfn7.d;
                final int a20 = pjs.a;
                php.v(1055, (pjq)((php)c13).b, (pfd)a18);
                throw new pgw();
            }
            case 10: {
                final Object c15 = this.c;
                final Object a21 = this.a;
                final Object b12 = this.b;
                final afev afev = (afev)d;
                for (final pfb pfb3 : c15) {
                    if (!afev.containsKey(pfb3)) {
                        final asbe a22 = pev.a();
                        a22.a = peu.z;
                        a22.c = "getDataFileUris() resolved to null";
                        return afwm.l((Throwable)a22.u());
                    }
                    final Uri uri3 = (Uri)afev.get(pfb3);
                    try {
                        if (((eg)a21).am(uri3)) {
                            final String path = uri3.getPath();
                            if (path == null) {
                                continue;
                            }
                            final List j = pge.j((eg)a21, uri3, path);
                            ((ahaz)b12).copyOnWrite();
                            final pek pek = (pek)((ahaz)b12).instance;
                            final pek a23 = pek.a;
                            pek.a();
                            agzk.addAll((Iterable)j, (List)pek.h);
                        }
                        else {
                            final String c16 = pfb3.c;
                            final int e = pfb3.e;
                            final int i = pfb3.j;
                            final String string = uri3.toString();
                            agzo agzo;
                            if ((pfb3.b & 0x2000) != 0x0) {
                                if ((agzo = pfb3.q) == null) {
                                    agzo = agzo.a;
                                }
                            }
                            else {
                                agzo = null;
                            }
                            ((ahaz)b12).T(pge.h(c16, e, i, string, agzo));
                        }
                    }
                    catch (final IOException ex3) {
                        pjs.j((Throwable)ex3, "Failed to list files under directory:".concat(String.valueOf(String.valueOf(uri3))));
                    }
                }
                return afvn.a;
            }
            case 9: {
                final Object b13 = this.b;
                final Object a24 = this.a;
                final Object c17 = this.c;
                final Void void1 = (Void)d;
                final pge pge = (pge)b13;
                final pie d4 = pge.d;
                final aftz g = pge.g;
                final pfn pfn8 = (pfn)a24;
                final String c18 = pfn8.c;
                final String d5 = pfn8.d;
                final int a25 = pjs.a;
                return afnd.r(d4.e(), (aftz)new iik(d4, pfn8, (aezp)c17, g, 17), d4.j);
            }
            case 8: {
                final Object b14 = this.b;
                final Object c19 = this.c;
                final Object a26 = this.a;
                final afel afel = (afel)d;
                final pix pix = (pix)c19;
                final pfn a27 = pix.a;
                final pfd b15 = pix.b;
                final pey pey = (pey)a26;
                if (!pey.a) {
                    final aezp b16 = pey.b;
                    if (b16.h() && !TextUtils.equals((CharSequence)b16.c(), (CharSequence)a27.c)) {
                        return afwm.m((Object)afel);
                    }
                }
                final boolean f2 = a27.f;
                final boolean c20 = pey.c;
                String e2 = s;
                if ((0x4 & a27.b) != 0x0) {
                    e2 = a27.e;
                }
                int n3;
                if (!f2) {
                    n3 = 3;
                }
                else {
                    n3 = 2;
                }
                final pge pge2 = (pge)b14;
                return afnd.q(afnd.q(pge.k(b15, e2, n3, c20, pge2.d, pge2.e, pge2.k), (aezf)new nyf(pge2, 10), pge2.e), (aezf)new nyf(afel, 8), pge2.e);
            }
            case 7: {
                final Object b17 = this.b;
                final Object a28 = this.a;
                final Object c21 = this.c;
                final Exception ex4 = d;
                if (!(ex4 instanceof adqq)) {
                    final afki afki = (afki)((afki)((afki)((afkg)odk.a).h()).i((Throwable)ex4)).j("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl", "logConnectMeetingAsStreamException", 908, "MeetIpcManagerImpl.java");
                    ocf ocf;
                    if ((ocf = ocf.a(((oci)a28).b)) == null) {
                        ocf = ocf.f;
                    }
                    afki.t("connectMeetingAsStream request failed with a generic exception while connecting to %s.", (Object)ocf.name());
                }
                else {
                    final adqq adqq = (adqq)ex4;
                    if (adqq.a.equals((Object)adqp.b)) {
                        final afki afki2 = (afki)((afki)((afki)((afkg)odk.a).f()).i((Throwable)adqq)).j("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl", "logConnectMeetingAsStreamException", 915, "MeetIpcManagerImpl.java");
                        ocf ocf2;
                        if ((ocf2 = ocf.a(((oci)a28).b)) == null) {
                            ocf2 = ocf.f;
                        }
                        afki2.t("connectMeetingAsStream failed due to old %s.", (Object)ocf2.name());
                    }
                    else {
                        final afki afki3 = (afki)((afki)((afki)((afkg)odk.a).f()).i((Throwable)adqq)).j("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl", "logConnectMeetingAsStreamException", 919, "MeetIpcManagerImpl.java");
                        final adqp a29 = adqq.a;
                        ocf ocf3;
                        if ((ocf3 = ocf.a(((oci)a28).b)) == null) {
                            ocf3 = ocf.f;
                        }
                        afki3.x("connectMeetingAsStream failed with code %s while connecting to %s", (Object)a29, (Object)ocf3.name());
                    }
                }
                synchronized (((odk)b17).f) {
                    final afki afki4 = (afki)((afki)((afkg)odk.a).f()).j("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl", "lambda$connectMeeting$0", 202, "MeetIpcManagerImpl.java");
                    final odi g2 = ((odk)b17).g;
                    final odi a30 = odi.a;
                    afki4.t("connectMeetingAsStream is not implemented and switch to unary connectMeeting. Current state is: %s.", (Object)g2.b);
                    ((odk)b17).g = odi.a((ocb)((Optional)c21).get());
                    final ocb ocb = (ocb)((Optional)c21).get();
                    final odl odl = new odl(((odk)b17).e, "ConnectMeetingResponseObserver");
                    final ocj k = odk.j(odk.g(), ((odk)b17).l, ((oci)a28).c);
                    final arty a31 = ((asgg)ocb).a;
                    final arwo a32;
                    if ((a32 = occ.a) == null) {
                        synchronized (occ.class) {
                            if (occ.a == null) {
                                final arwl a33 = arwo.a();
                                a33.c = arwn.a;
                                a33.d = arwo.c("com.google.android.libraries.communications.sdk.sync.api.proto.MeetActivityService", "ConnectMeeting");
                                a33.b();
                                a33.a = asgc.b((MessageLite)ocj.a);
                                a33.b = asgc.b((MessageLite)ock.a);
                                occ.a = a33.a();
                            }
                        }
                    }
                    asgn.c(a31.a(a32, ((asgg)ocb).b), k, (asgq)odl);
                    final afvs l = ((odk)b17).j;
                    d = (IOException)new kxr((odk)b17, odl, ocb, 4);
                    final ListenableFuture rz = l.rz((Callable)d);
                    d = (IOException)new grf(5);
                    afwm.w(rz, (afva)d, (Executor)((odk)b17).j);
                    return rz;
                }
            }
            case 6: {
                final Object a34 = this.a;
                final Object c22 = this.c;
                final Object b18 = this.b;
                final Void void2 = (Void)d;
                return ((tmx)a34).b((aezf)new etz((Boolean)c22, (tmx)b18, 18));
            }
            case 5: {
                final Object b19 = this.b;
                final Object c23 = this.c;
                final Object a35 = this.a;
                ListenableFuture listenableFuture7;
                if (!(boolean)d) {
                    final aezp b20 = ((iqp)b19).b(iqh.e, (Class)alkh.class, (aezp)aeyo.a, (imt)a35);
                    afeq afeq;
                    if (!b20.h()) {
                        afeq = afeq.q();
                    }
                    else {
                        final ahaz builder4 = ((ahbh)anyy.a).createBuilder();
                        ((ahbb)c23).l((alkh)b20.c());
                        builder4.copyOnWrite();
                        final anyy anyy = (anyy)builder4.instance;
                        final alke m = (alke)((ahaz)c23).build();
                        m.getClass();
                        anyy.j = m;
                        anyy.b |= 0x10;
                        afeq = afeq.r((Object)new iqv((MessageLite)builder4.build()));
                    }
                    listenableFuture7 = afwm.m((Object)afeq);
                }
                else {
                    final iqp iqp = (iqp)b19;
                    listenableFuture7 = afnd.r(vdh.aY(iqp.f.v()), (aftz)new iih(iqp, (imt)a35, (ahbb)c23, 4), iqp.e);
                }
                return listenableFuture7;
            }
            case 4: {
                final Object b21 = this.b;
                final Object a36 = this.a;
                final Object c24 = this.c;
                Label_3359: {
                    if (!(boolean)d) {
                        final imt imt = (imt)a36;
                        final aezp b22 = imt.b;
                        if (b22.h()) {
                            final ajhn ajhn = (ajhn)b22.c();
                            ajhm a37;
                            if (ajhn.b == 4) {
                                a37 = (ajhm)ajhn.c;
                            }
                            else {
                                a37 = ajhm.a;
                            }
                            final int ad = aevy.aD(a37.c);
                            if (ad != 0) {
                                if (ad == 2) {
                                    break Label_3359;
                                }
                            }
                        }
                        final iqp iqp2 = (iqp)b21;
                        final fln b23 = iqp2.b;
                        final pa a38 = fll.a();
                        a38.e(-1);
                        a38.d(ajhp.b);
                        a38.f(flk.b);
                        final ListenableFuture ay = vdh.aY(b23.e(a38.c()));
                        final ListenableFuture g3 = iqp2.d.g();
                        ListenableFuture listenableFuture8;
                        if (iqp2.h.an()) {
                            listenableFuture8 = iqp2.j.k();
                        }
                        else {
                            listenableFuture8 = afwm.m((Object)value);
                        }
                        return afnd.z(new ListenableFuture[] { ay, g3, listenableFuture8 }).P(new iig(iqp2, (ahbb)c24, imt, ay, g3, listenableFuture8, 2), iqp2.e);
                    }
                }
                final aezp b24 = ((iqp)b21).b(iqh.o, (Class)alkh.class, (aezp)aeyo.a, (imt)a36);
                if (b24.h()) {
                    ((ahbb)c24).l((alkh)b24.c());
                }
                final ahaz builder5 = ((ahbh)anyy.a).createBuilder();
                builder5.copyOnWrite();
                final anyy anyy2 = (anyy)builder5.instance;
                final alke j2 = (alke)((ahaz)c24).build();
                j2.getClass();
                anyy2.j = j2;
                anyy2.b |= 0x10;
                return afwm.m((Object)afeq.r((Object)new iqv((MessageLite)builder5.build())));
            }
            case 3: {
                final Object a39 = this.a;
                final Object c25 = this.c;
                final Object b25 = this.b;
                final Optional optional = (Optional)d;
                Object o;
                if (!optional.isPresent()) {
                    if (((iin)a39).i.am()) {
                        final aaby b26 = aabz.b.b();
                        b26.b = 26;
                        o = afwm.m((Object)b26.a());
                    }
                    else {
                        final aaby b27 = aabz.c.b();
                        b27.b = 26;
                        o = afwm.m((Object)b27.a());
                    }
                }
                else {
                    final amar amar = (amar)optional.get();
                    int ad2;
                    if ((ad2 = aqsx.aD(((amao)((ahbc)c25).rx((ahaq)amao.b)).e)) == 0) {
                        ad2 = 1;
                    }
                    final iin iin = (iin)a39;
                    final vfw c26 = iin.a.a(iin.b.c()).c();
                    final String e3 = amar.e();
                    final String string2 = Integer.toString(ad2 - 1);
                    final aeea d6 = vfo.d();
                    d6.cf("transfer_network_constraint_key", string2);
                    c26.f(e3, d6.ce());
                    fex.t(c26, "MainVideoEntityController failed to update the EntityMetadata for videoId: ".concat(String.valueOf(amar.getVideoId())));
                    if (iin.i.am()) {
                        final aaba d7 = iin.d(amar.b, iin.n(amar));
                        final amuj amuj = (amuj)c25;
                        final aevf f3 = aevf.f(((aaej)b25).k(d7, iin.m(amuj), aaaz.e));
                        final iko iko = new iko(iin, amar, amuj, 1);
                        Object o2;
                        if (iin.i.av()) {
                            o2 = iin.e;
                        }
                        else {
                            o2 = afum.a;
                        }
                        o = f3.g((aezf)iko, (Executor)o2);
                    }
                    else {
                        final aaba d8 = iin.d(amar.b, iin.n(amar));
                        final amuj amuj2 = (amuj)c25;
                        ((aaej)b25).j(d8, iin.m(amuj2), aaaz.e);
                        o = afwm.m((Object)iin.f(amar, amuj2));
                    }
                }
                return (ListenableFuture)o;
            }
            case 2: {
                final Object a40 = this.a;
                final Object c27 = this.c;
                final Object b28 = this.b;
                final aabz aabz = (aabz)d;
                ListenableFuture listenableFuture10;
                if (aabz == aabz.a) {
                    final iin iin2 = (iin)a40;
                    listenableFuture10 = iin2.l(iin2.c, (String)c27, (amuj)b28);
                }
                else {
                    listenableFuture10 = afwm.m((Object)aabz);
                }
                return listenableFuture10;
            }
            case 1: {
                final Object a41 = this.a;
                final Object b29 = this.b;
                final Object c28 = this.c;
                final Optional optional2 = (Optional)d;
                final ancy ancy = (ancy)((Optional)b29).get();
                final amwb amwb = (amwb)((Optional)c28).get();
                ListenableFuture listenableFuture11;
                if (optional2.isPresent()) {
                    listenableFuture11 = afwm.m((Object)((ajjx)optional2.get()).d);
                }
                else {
                    final igu igu = (igu)a41;
                    listenableFuture11 = aftq.e((ListenableFuture)afvk.m(igu.b(Optional.of((Object)ancy), Optional.of((Object)amwb))), (aezf)new exf(igu.g(amwb), 10), igu.b);
                }
                return listenableFuture11;
            }
            case 0: {
                final Object a42 = this.a;
                final Object b30 = this.b;
                final Object c29 = this.c;
                final aabz aabz2 = (aabz)d;
                final int f4 = aabz2.f;
                if (f4 != 0) {
                    Object o3;
                    if (f4 != 2) {
                        o3 = afwm.m((Object)aabz2);
                    }
                    else {
                        final String s2 = (String)c29;
                        final iin iin3 = (iin)a42;
                        o3 = afnd.t((Callable)new daa(iin3, (zme)b30, s2, 12), (Executor)iin3.e);
                    }
                    return (ListenableFuture)o3;
                }
                throw null;
            }
        }
    }
}
