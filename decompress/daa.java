import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;
import android.view.View;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import java.util.ArrayList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class daa implements Callable
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public daa(final ajhp b, final ListenableFuture c, final ListenableFuture a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public daa(final blu c, final ListenableFuture a, final ListenableFuture b, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final cnt c, final ArrayList b, final String a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public daa(final czz c, final String a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final guw c, final vaf a, final asid b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final hsh c, final String b, final aiqj a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public daa(final idl c, final ListenableFuture a, final ListenableFuture b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final iee c, final vfw a, final aaat b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final iee c, final vfw a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final ieg c, final String b, final vfw a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public daa(final ieg c, final vfw a, final aaat b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final ihy c, final zme a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final iin c, final zme a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final ivn c, final ashi a, final ashi b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final jcs c, final ListenableFuture a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final jqx c, final ListenableFuture a, final ListenableFuture b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public daa(final jye a, final ElevatedAppBarLayout c, final asid b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public daa(final jzk a, final hze c, final asid b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public daa(final kvv c, final arkg b, final vcy a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public daa(final kvv a, final fjv c, final arkg b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final Object call() {
        final int d = this.d;
        boolean b = true;
        final boolean b2 = true;
        switch (d) {
            default: {
                return ((twn)((arkg)this.b).a()).e().L((asjr)kqn.e).p().an((asjm)new ink((kvv)this.c, (vcy)this.a, 10), (asjm)kvs.c);
            }
            case 19: {
                return ((fjv)this.c).k().A().aI((asjm)new ink((kvv)this.a, (arkg)this.b, 9), (asjm)kvs.c);
            }
            case 18: {
                return ((hze)this.c).a().af((asid)this.b).R((asjr)jxh.i).aH((asjm)new jzj((jzk)this.a, 0));
            }
            case 17: {
                return asht.w((ashv)new hzg((View)this.c, 4)).ap((asid)this.b).aH((asjm)new jpv((jye)this.a, 15));
            }
            case 16: {
                final Object c = this.c;
                final Object a = this.a;
                final Object b3 = this.b;
                long n;
                if ((n = tpe.V((long)afwm.u((Future)a))) <= 0L) {
                    n = ((jqx)c).l;
                }
                final long longValue = (long)afwm.u((Future)b3);
                final jqx jqx = (jqx)c;
                long n2;
                if (jqx.i) {
                    n2 = jqx.e.a();
                }
                else {
                    n2 = tpe.aW();
                }
                final boolean i = jqx.i;
                final long longValue2 = (long)afwm.u((Future)b3);
                final ztp c2 = ((aabo)jqx.a.a()).a().c();
                c2.getClass();
                final long v = tpe.V(Math.max(c2.b(jqx.i) - longValue2, 0L));
                final amwz u = ((aaec)jqx.c.a()).u();
                float j = jqx.j;
                if (j <= 0.0f) {
                    j = 102.4f;
                }
                final long k = jqx.k;
                final long v2 = tpe.V(n2 + longValue);
                long n3;
                if (k <= 0L) {
                    n3 = v2;
                }
                else {
                    n3 = k;
                }
                return new jqw(i, n, v, v2, u, j, n3);
            }
            case 15: {
                final Object c3 = this.c;
                final Object a2 = this.a;
                final Object b4 = this.b;
                final ashc cq = tpe.cq((ListenableFuture)a2);
                final jcs jcs = (jcs)c3;
                final asie r = cq.R((asih)jcs.b());
                final String s = (String)b4;
                return r.ab((asjm)new ink(jcs, s, 3), (asjm)new jce(s, 8));
            }
            case 14: {
                return ashi.e((auke)this.a, (auke)this.b, (asji)ivm.a).am((asjm)new iut((ivn)this.c, 14));
            }
            case 13: {
                final Object b5 = this.b;
                final Object c4 = this.c;
                final Object a3 = this.a;
                final boolean booleanValue = (boolean)afwm.u((Future)c4);
                final boolean booleanValue2 = (boolean)afwm.u((Future)a3);
                if (booleanValue || b5 != ajhp.c) {
                    ajhp b6 = (ajhp)b5;
                    if (booleanValue2 || (b6 = (ajhp)b5) != ajhp.d) {
                        return b6;
                    }
                }
                return ajhp.b;
            }
            case 12: {
                final Object c5 = this.c;
                final Object a4 = this.a;
                final Object b7 = this.b;
                final iin iin = (iin)c5;
                final aaeh aaeh = (aaeh)fex.k(iin.h, (zme)a4).orElse((Object)null);
                aabz aabz;
                if (aaeh == null) {
                    final aaby b8 = aabz.c.b();
                    b8.b = 15;
                    aabz = b8.a();
                }
                else {
                    final zvo b9 = aaeh.B();
                    if (b9 == null) {
                        final aaby b10 = aabz.c.b();
                        b10.b = 15;
                        aabz = b10.a();
                    }
                    else {
                        final String s2 = (String)b7;
                        if (b9.J(s2, 2)) {
                            b9.A(s2);
                            iin.f.f((Object)new zyh(s2));
                            aabz = aabz.a;
                        }
                        else {
                            final aaby b11 = aabz.b.b();
                            b11.b = 39;
                            aabz = b11.a();
                        }
                    }
                }
                return aabz;
            }
            case 11: {
                final Object c6 = this.c;
                final Object a5 = this.a;
                final Object b12 = this.b;
                tbi.e();
                final aaeh aaeh2 = (aaeh)fex.k(((iin)c6).h, (zme)a5).orElse((Object)null);
                aabz aabz2;
                if (aaeh2 == null) {
                    final aaby b13 = aabz.c.b();
                    b13.b = 35;
                    aabz2 = b13.a();
                }
                else {
                    final zvo b14 = aaeh2.B();
                    if (b14 == null) {
                        final aaby b15 = aabz.c.b();
                        b15.b = 15;
                        aabz2 = b15.a();
                    }
                    else {
                        final aaba e = b14.e((String)b12);
                        if (e != null && b14.O(e)) {
                            aaeh2.o().tu((Object)new zyf((List)afeq.r(b12)));
                        }
                        aabz2 = aabz.a;
                    }
                }
                return aabz2;
            }
            case 10: {
                final Object c7 = this.c;
                final Object a6 = this.a;
                final Object b16 = this.b;
                final ihy ihy = (ihy)c7;
                final aaeh aaeh3 = (aaeh)fex.k((aabo)ihy.a.a(), (zme)a6).orElse((Object)null);
                aabz aabz3;
                if (aaeh3 == null) {
                    final aaby b17 = aabz.c.b();
                    b17.b = 15;
                    aabz3 = b17.a();
                }
                else {
                    final zvo b18 = aaeh3.B();
                    if (b18 == null) {
                        final aaby b19 = aabz.c.b();
                        b19.b = 15;
                        aabz3 = b19.a();
                    }
                    else {
                        final String s3 = (String)b16;
                        ihy.h(s3);
                        final aaar d2 = b18.d(s3);
                        if (d2 == null) {
                            aabz3 = aabz.a;
                        }
                        else {
                            final List v3 = b18.v(s3, false);
                            if (v3 == null) {
                                final aaby b20 = aabz.c.b();
                                b20.b = 6;
                                aabz3 = b20.a();
                            }
                            else {
                                ihy.g(s3);
                                final aaby a7 = aabz.a();
                                a7.a = 2;
                                final afel d3 = afeq.d();
                                d3.j((Iterable)ihy.l(s3, (Collection)v3, 2));
                                final aotp e2 = d2.d.e();
                                afeq afeq;
                                if (e2 == null) {
                                    afeq = afeq.q();
                                }
                                else {
                                    final afel d4 = afeq.d();
                                    final Iterator<Object> iterator = ((List<Object>)e2.c).iterator();
                                    while (iterator.hasNext()) {
                                        final String h = vgl.h(197, iterator.next().c);
                                        final ahaz builder = ((ahbh)amul.a).createBuilder();
                                        builder.copyOnWrite();
                                        final amul amul = (amul)builder.instance;
                                        amul.c = 2;
                                        amul.b |= 0x1;
                                        builder.copyOnWrite();
                                        final amul amul2 = (amul)builder.instance;
                                        h.getClass();
                                        amul2.b |= 0x2;
                                        amul2.d = h;
                                        final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
                                        ahbb.o((Iterable)zvg.a);
                                        final amuj e3 = (amuj)((ahaz)ahbb).build();
                                        builder.copyOnWrite();
                                        final amul amul3 = (amul)builder.instance;
                                        e3.getClass();
                                        amul3.e = e3;
                                        amul3.b |= 0x4;
                                        d4.h((Object)builder.build());
                                    }
                                    afeq = d4.g();
                                }
                                d3.j((Iterable)afeq);
                                a7.b(d3.g());
                                aabz3 = a7.a();
                            }
                        }
                    }
                }
                return aabz3;
            }
            case 9: {
                final Object c8 = this.c;
                final Object a8 = this.a;
                final aaat aaat = (aaat)this.b;
                fex.y((vfw)a8, ieg.k(aaat));
                ((ieg)c8).a.put(aaat.a.a, new HashSet(aaat.b));
                return null;
            }
            case 8: {
                final Object c9 = this.c;
                final Object b21 = this.b;
                final Object a9 = this.a;
                final Set set = ((ieg)c9).a.remove(b21);
                if (set != null) {
                    ieg.m((vfw)a9, (String)b21, (Set)set);
                }
                return null;
            }
            case 7: {
                final Object c10 = this.c;
                final Object a10 = this.a;
                final aaat aaat2 = (aaat)this.b;
                ((vfw)a10).j((vfk)iee.k(aaat2));
                ((iee)c10).l(aaat2.a);
                return null;
            }
            case 6: {
                final Object c11 = this.c;
                final Object a11 = this.a;
                final String s4 = (String)this.b;
                ((vfw)a11).g(glb.H(s4));
                ((bhv)((iee)c11).a.a()).C(fmy.e(s4));
                return null;
            }
            case 5: {
                final Object c12 = this.c;
                final Object a12 = this.a;
                final Object b22 = this.b;
                return ((idl)c12).b.t() && (boolean)afwm.u((Future)a12) && (boolean)afwm.u((Future)b22) && b2;
            }
            case 4: {
                final Object c13 = this.c;
                final Object b23 = this.b;
                final Object a13 = this.a;
                final lkx c14 = ((hsh)c13).c;
                final abjp d5 = PlaybackStartDescriptor.d();
                d5.a = (aiqj)a13;
                d5.g = true;
                final PlaybackStartDescriptor a14 = d5.a();
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)a13).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                final Object f = c14.f;
                final String s5 = (String)b23;
                return vdh.aZ(((abkz)f).l(a14, s5, true, c14.k(reelWatchEndpointOuterClass$ReelWatchEndpoint, s5, (zdj)null)));
            }
            case 3: {
                final Object c15 = this.c;
                final Object a15 = this.a;
                final Object b24 = this.b;
                final guw guw = (guw)c15;
                return ((asht)guw.c).aq((asjr)new fdo((vaf)a15, (asid)b24, 15)).aH((asjm)new gsa(guw, 12));
            }
            case 2: {
                if (((acid)((blu)this.c).a).t() + (long)afwm.u((Future)this.a) - (long)afwm.u((Future)this.b) > 0L) {
                    b = false;
                }
                return b;
            }
            case 1: {
                final Object c16 = this.c;
                final Object b25 = this.b;
                final Object a16 = this.a;
                final cnt cnt = (cnt)c16;
                final crx x = cnt.d.x();
                final String s6 = (String)a16;
                ((ArrayList)b25).addAll(x.a(s6));
                return cnt.d.w().a(s6);
            }
            case 0: {
                final Object c17 = this.c;
                final Object a17 = this.a;
                final Object b26 = this.b;
                final czz czz = (czz)c17;
                final dau p = czz.p;
                final String packageName = czz.c.getPackageName();
                final Parcel qw = p.qW();
                qw.writeInt(3);
                qw.writeString(packageName);
                qw.writeString((String)a17);
                qw.writeString((String)b26);
                qw.writeString((String)null);
                final Parcel qx = p.qX(3, qw);
                final Bundle bundle = (Bundle)eob.a(qx, Bundle.CREATOR);
                qx.recycle();
                return bundle;
            }
        }
    }
}
