import java.util.Iterator;
import android.os.SystemClock;
import java.util.Map;
import java.util.HashMap;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.MotionEvent;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcn implements Runnable
{
    public final long a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public hcn(final aexf b, final aqdg c, final long a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final Intent b, final pof c, final long a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final dml b, final Object c, final long a, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final hcq b, final long a, final aezp c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hcn(final hnk c, final MotionEvent b, final long a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hcn(final mof b, final mwa c, final long a, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final mvx b, final long a, final mvx c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hcn(final neh b, final String c, final long a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final nhk c, final Bundle b, final long a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hcn(final nhr c, final nhp b, final long a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hcn(final ung b, final long a, final unh c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hcn(final ung c, final obq b, final long a, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hcn(final xam b, final almj c, final long a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final xam b, final String c, final long a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final xra b, final byte[] c, final long a, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final ynp b, final long a, final anza c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hcn(final ynp b, final yqd c, final long a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hcn(final ypo b, final long a, final ypt c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hcn(final ypq b, final long a, final ypt c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hcn(final yrn b, final byte[] c, final long a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                final Object b = this.b;
                final Object c = this.c;
                final long a = this.a;
                final xra xra = (xra)b;
                if (((zbd)((ysg)xra.a).d).aD()) {
                    for (final lyx lyx : ((ysg)xra.a).c) {
                        final byte[] array = (byte[])c;
                        if (lyx.l(array)) {
                            lyx.g(array, a);
                        }
                    }
                    return;
                }
                zdf.a((Object)((ysg)xra.a).b);
                ((ysg)xra.a).b.g((byte[])c, a);
                return;
            }
            case 19: {
                final Object b2 = this.b;
                final Object c2 = this.c;
                final long a2 = this.a;
                final yrn yrn = (yrn)b2;
                zdf.a((Object)yrn.e);
                yrn.a();
                yrn.e.j(false, (byte[])c2, a2);
                return;
            }
            case 18: {
                ((ypq)this.b).a.x(this.a, (ypt)this.c);
                return;
            }
            case 17: {
                ((ypo)this.b).x(this.a, (ypt)this.c);
                return;
            }
            case 16: {
                ((ynp)this.b).w(this.a, (anza)this.c);
                return;
            }
            case 15: {
                ((ynp)this.b).v((yqd)this.c, this.a);
                return;
            }
            case 14: {
                ((xam)this.b).n((String)this.c, this.a);
                return;
            }
            case 13: {
                ((xam)this.b).k((almj)this.c, this.a);
                return;
            }
            case 12: {
                final Object b3 = this.b;
                final long a3 = this.a;
                final Object c3 = this.c;
                if (((ung)b3).c.e != b3) {
                    return;
                }
                ((unh)c3).a(ahfb.c(a3));
                return;
            }
            case 11: {
                final Object c4 = this.c;
                final Object b4 = this.b;
                final long a4 = this.a;
                if (!((ung)c4).b) {
                    final ahaz builder = aqdj.a.createBuilder();
                    final ahdy c5 = ahfb.c(a4);
                    builder.copyOnWrite();
                    final aqdj aqdj = (aqdj)builder.instance;
                    c5.getClass();
                    aqdj.c = c5;
                    aqdj.b |= 0x1;
                    ((obq)b4).t((aqdj)builder.build());
                }
                return;
            }
            case 10: {
                ((aexf)this.b).K((aqdg)this.c, this.a);
                return;
            }
            case 9: {
                final Object b5 = this.b;
                final Object c6 = this.c;
                final long a5 = this.a;
                final int b6 = poe.b;
                final Intent intent = (Intent)b5;
                pri.d("ChimeBroadcastReceiver", "Executing action in Service [%s].", new Object[] { intent.getAction() });
                poe.b((pof)c6, intent, pms.b(), a5);
                return;
            }
            case 8: {
                ((nhr)this.c).t((nhp)this.b, false, this.a);
                final Object c7 = this.c;
                ((nhr)c7).d = null;
                ((nei)c7).l().x((nhp)null);
                return;
            }
            case 7: {
                final Object c8 = this.c;
                final Object b7 = this.b;
                final long a6 = this.a;
                if (TextUtils.isEmpty((CharSequence)((nei)c8).h().q())) {
                    ((nhk)c8).E((Bundle)b7, 0, a6);
                    return;
                }
                ((ngy)c8).aA().h.a("Using developer consent only; google app id found");
                return;
            }
            case 6: {
                final Object b8 = this.b;
                final Object c9 = this.c;
                final long a7 = this.a;
                final ngy ngy = (ngy)b8;
                ngy.n();
                final String s = (String)c9;
                khl.aZ(s);
                final neh neh = (neh)b8;
                final Integer n = neh.b.get(c9);
                if (n == null) {
                    ngy.aA().c.b("Call to endAdUnitExposure for unknown ad unit id", c9);
                    return;
                }
                final nhp o = ((nei)b8).k().o();
                final int n2 = n - 1;
                if (n2 == 0) {
                    neh.b.remove(c9);
                    final Long n3 = neh.a.get(c9);
                    if (n3 == null) {
                        ngy.aA().c.a("First ad unit exposure time was never set");
                    }
                    else {
                        final long longValue = n3;
                        neh.a.remove(c9);
                        neh.d(s, a7 - longValue, o);
                    }
                    if (neh.b.isEmpty()) {
                        final long c10 = neh.c;
                        if (c10 == 0L) {
                            ngy.aA().c.a("First ad exposure time was never set");
                            return;
                        }
                        neh.c(a7 - c10, o);
                        neh.c = 0L;
                    }
                    return;
                }
                neh.b.put(c9, n2);
                return;
            }
            case 5: {
                final Object b9 = this.b;
                final Object c11 = this.c;
                final long a8 = this.a;
                final ngy ngy2 = (ngy)b9;
                ngy2.n();
                khl.aZ((String)c11);
                final neh neh2 = (neh)b9;
                final Map b10 = neh2.b;
                if (b10.isEmpty()) {
                    neh2.c = a8;
                }
                final Integer n4 = b10.get(c11);
                if (n4 != null) {
                    neh2.b.put(c11, n4 + 1);
                    return;
                }
                final Map b11 = neh2.b;
                if (((abo)b11).d >= 100) {
                    ngy2.aA().f.a("Too many ads visible");
                    return;
                }
                b11.put(c11, 1);
                neh2.a.put(c11, a8);
                return;
            }
            case 4: {
                final Object b12 = this.b;
                final long a9 = this.a;
                final Object c12 = this.c;
                final mvx mvx = (mvx)b12;
                final Object g = mvx.g;
                final StringBuilder sb = new StringBuilder("getResults snapshot timeout: ");
                sb.append(a9);
                sb.append(" ms");
                final mvz mvz = new mvz((mwb)g, sb.toString(), (mwn)mvx.f);
                final String a10 = ((mvt)mvz).a((Map)new HashMap());
                ((mvt)mvz).close();
                ((mvx)c12).a(a10);
                return;
            }
            case 3: {
                final Object b13 = this.b;
                final Object c13 = this.c;
                final long a11 = this.a;
                final Object a12 = ((mof)b13).a;
                final StringBuilder sb2 = new StringBuilder("getResults init timeout: ");
                sb2.append(a11);
                sb2.append(" ms");
                final String string = sb2.toString();
                final mwa mwa = (mwa)c13;
                mwa.b((mvt)new mvz((mwb)a12, string, mwa.f));
                return;
            }
            case 2: {
                final Object c14 = this.c;
                final Object b14 = this.b;
                final long a13 = this.a;
                final hnk hnk = (hnk)c14;
                if (!hnk.c && hnk.h == 1) {
                    final long b15 = hnk.b;
                    final MotionEvent motionEvent = (MotionEvent)b14;
                    if (b15 == motionEvent.getDownTime()) {
                        hnk.c(motionEvent, hnk.b + SystemClock.uptimeMillis() - a13);
                    }
                }
                return;
            }
            case 1: {
                final Object b16 = this.b;
                final Object c15 = this.c;
                final long a14 = this.a;
                final Object a15 = ((dml)b16).a;
                final int a16 = bax.a;
                ((bso)a15).m(c15, a14);
                return;
            }
            case 0: {
                final Object b17 = this.b;
                final long a17 = this.a;
                final Object c16 = this.c;
                final hcq hcq = (hcq)b17;
                if (hcq.i) {
                    final ubk k = hcq.k;
                    if (k != null) {
                        final ativ b18 = hcq.b;
                        k.h = aezp.k((Object)a17);
                        k.i = (aezp)c16;
                        b18.tu((Object)aezp.k((Object)k.a()));
                    }
                }
                else if (hcq.a() != null) {
                    final ativ b19 = hcq.b;
                    final ubk e = hcq.a().e();
                    e.h = aezp.k((Object)a17);
                    e.i = (aezp)c16;
                    b19.tu((Object)aezp.k((Object)e.a()));
                }
            }
        }
    }
}
