import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import j$.util.concurrent.ThreadLocalRandom;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.quantum.snackbar.Snackbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adaj implements Runnable
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public adaj(final adal a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        boolean b2 = false;
        final boolean b3 = true;
        final boolean b4 = true;
        switch (b) {
            default: {
                final Object a = this.a;
                final Object l = ((adkh)a).l;
                monitorenter(l);
                try {
                    ((adkh)a).w();
                    monitorexit(l);
                    return;
                }
                finally {
                    monitorexit(l);
                    while (true) {}
                }
                break;
            }
            case 18: {
                final adjk adjk = (adjk)this.a;
                if (adjk.h) {
                    return;
                }
                adjk.h = true;
                adjk.g();
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final abg abg = new abg();
                final adjk adjk2 = (adjk)a2;
                final long c = adjk2.b.c();
                while (!adjk2.e.isEmpty() && adjk2.e.peek().d < 2000L + c) {
                    final adjj adjj = adjk2.e.poll();
                    List list;
                    if ((list = abg.get(adjj.a)) == null) {
                        list = new ArrayList();
                    }
                    list.add(adjj);
                    abg.put(adjj.a, list);
                    if (abg.d == 64) {
                        break;
                    }
                }
                adjk2.g();
                for (final zkh zkh : abg.keySet()) {
                    zkh.d();
                    final List list2 = abg.get(zkh);
                    list2.getClass();
                    final ArrayList<apft> list3 = new ArrayList<apft>();
                    final ArrayList<String> list4 = new ArrayList<String>();
                    final agza builder = ((agzi)alat.a).createBuilder();
                    for (final adjj adjj2 : list2) {
                        if (!TextUtils.isEmpty((CharSequence)adjj2.b)) {
                            adjk2.g.put(adjj2.b, zkh);
                        }
                        if (!TextUtils.isEmpty((CharSequence)adjj2.c)) {
                            adjk2.g.put(adjj2.c, zkh);
                        }
                    }
                    for (final adjj adjj3 : list2) {
                        if (!TextUtils.isEmpty((CharSequence)adjj3.e)) {
                            list4.add(adjj3.e);
                        }
                        else if (!TextUtils.isEmpty((CharSequence)adjj3.b)) {
                            final agza builder2 = ((agzi)apft.a).createBuilder();
                            final String b5 = adjj3.b;
                            builder2.copyOnWrite();
                            final apft apft = (apft)builder2.instance;
                            b5.getClass();
                            apft.b |= 0x1;
                            apft.c = b5;
                            list3.add((apft)builder2.build());
                        }
                        else {
                            if (TextUtils.isEmpty((CharSequence)adjj3.c)) {
                                continue;
                            }
                            final agza builder3 = ((agzi)apft.a).createBuilder();
                            final String c2 = adjj3.c;
                            builder3.copyOnWrite();
                            final apft apft2 = (apft)builder3.instance;
                            c2.getClass();
                            apft2.b |= 0x2;
                            apft2.d = c2;
                            list3.add((apft)builder3.build());
                        }
                    }
                    builder.bc((Iterable)list3);
                    builder.copyOnWrite();
                    final alat alat = (alat)builder.instance;
                    final agzy e = alat.e;
                    if (!e.c()) {
                        alat.e = agzi.mutableCopy(e);
                    }
                    agxl.addAll((Iterable)list4, (List)alat.e);
                    ((addt)adjk2.c.a()).a((alat)builder.build(), zkh, ((vja)adjk2.a.a()).a ^ true, (znj)new gmt(adjk2, list2, 12));
                }
                return;
            }
            case 16: {
                final adjk adjk3 = (adjk)this.a;
                adjk3.e.clear();
                adjk3.g.clear();
                adjk3.g();
                return;
            }
            case 15: {
                final adjk adjk4 = (adjk)this.a;
                if (!adjk4.h) {
                    return;
                }
                adjk4.h = false;
                adjk4.g();
                return;
            }
            case 14: {
                final Object a3 = this.a;
                try {
                    ((adit)a3).e();
                }
                catch (final adiu adiu) {
                    trn.b("JobStorageException on closing db for idleness: ".concat(String.valueOf(adiu.getMessage())));
                }
            }
            case 13: {
                final agiy agiy = (agiy)this.a;
                ((tal)agiy.e).b("yt_upload_wifi_req");
                ((tal)agiy.e).b("yt_upload_network_req");
                ((tal)agiy.e).a("yt_upload_long_retry");
                return;
            }
            case 12: {
                final Object a4 = this.a;
                final int a5 = adgb.a;
                final adgt adgt = (adgt)a4;
                final long n = ((oas)adgt.i.d).g() - adgt.h.get().b;
                final long n2 = adgt.b - n;
                final long a6 = adgt.a;
                long n3;
                if (n >= a6) {
                    final String k = adgt.k;
                    if (k == null) {
                        if (n2 <= 0L) {
                            adgt.k = adgg.b(adgt.f.getLooper().getThread());
                            n3 = a6;
                        }
                        else {
                            adgt.k = "";
                            final double nextDouble = ThreadLocalRandom.current().nextDouble();
                            final double n4 = (double)n2;
                            Double.isNaN(n4);
                            n3 = (long)(nextDouble * n4) + 50L;
                        }
                    }
                    else {
                        n3 = a6;
                        if (k.isEmpty()) {
                            adgt.k = adgg.b(adgt.f.getLooper().getThread());
                            n3 = a6;
                        }
                    }
                }
                else {
                    adgt.k = null;
                    n3 = a6 - n + 50L;
                }
                adgt.j.schedule(new adaj(adgt, 12), n3, TimeUnit.MILLISECONDS);
                return;
            }
            case 11: {
                final adgt adgt2 = (adgt)this.a;
                final long g = ((oas)adgt2.i.d).g();
                final AtomicReference h = adgt2.h;
                final adgs adgs = adgt2.g.get();
                boolean a7;
                if (adgs == null) {
                    a7 = b4;
                }
                else {
                    a7 = adgs.a;
                }
                h.set(new adgk(g, a7));
                adgt2.f.postDelayed((Runnable)new adaj(adgt2, 11), adgt2.c);
                return;
            }
            case 10: {
                final Object a8 = this.a;
                final adgq adgq = (adgq)a8;
                final long g2 = ((oas)adgq.e.d).g();
                final int a9 = ((tlu)adgq.e.f).a(tlu.b);
                if (a9 == 2 || a9 == 1) {
                    b2 = true;
                }
                adgq.h = new adgk(g2, b2);
                final adgf c3 = adgq.c;
                c3.d = g2 + adgq.a;
                if (c3.e != null) {
                    synchronized (adgq.f) {
                        ((adgq)a8).f.notify();
                    }
                }
                adgq.d.postDelayed((Runnable)new adaj(adgq, 10), adgq.b);
                return;
            }
            case 9: {
                final adgo adgo = (adgo)this.a;
                final long g3 = ((oas)adgo.h.d).g();
                final AtomicReference g4 = adgo.g;
                final adgn adgn = adgo.f.get();
                boolean booleanValue = b3;
                if (adgn != null) {
                    final Boolean a10 = adgn.a;
                    if (a10 == null) {
                        booleanValue = b3;
                    }
                    else {
                        booleanValue = a10;
                    }
                }
                g4.set(new adgk(g3, booleanValue));
                adgo.e.postDelayed((Runnable)new adaj(adgo, 9), adgo.b);
                return;
            }
            case 8: {
                ((adgl)this.a).a = false;
                return;
            }
            case 7: {
                ((adgh)this.a).a = false;
                return;
            }
            case 6: {
                ((adfq)this.a).e();
                return;
            }
            case 5: {
                ((adfq)this.a).d();
                return;
            }
            case 4: {
                final Semaphore e2 = ((aded)this.a).e;
                if (e2 != null) {
                    e2.release();
                }
                return;
            }
            case 3: {
                ((asic)this.a).dispose();
                return;
            }
            case 2: {
                ((Snackbar)this.a).c();
                return;
            }
            case 1: {
                final adam adam = (adam)this.a;
                adam.al.E.w(new aepj(adam));
                return;
            }
            case 0: {
                final aczb a11 = ((adal)this.a).a;
                a11.p = true;
                a11.b();
            }
        }
    }
}
