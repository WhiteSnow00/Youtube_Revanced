import java.util.concurrent.CountDownLatch;
import android.content.Intent;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collection;
import android.view.View;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.r;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import com.google.android.apps.youtube.app.mdx.MdxSmartRemoteMealbarController;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbr implements tcc
{
    public final Object a;
    private final int b;
    
    public hbr(final ImageView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final ateo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final MdxSmartRemoteMealbarController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final hxm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final ibg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final ifx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final igf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final ijz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final ioq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final ios a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final itg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final Map a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final jxp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final koa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final kqc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final ufh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final wqv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final xge a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hbr(final xou a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(Object a, Object a2) {
        final int b = this.b;
        boolean b2 = true;
        final boolean b3 = true;
        int i = 0;
        switch (b) {
            default: {
                final Void void1 = (Void)a;
                final List list = (List)a2;
                final CopyOnWriteArrayList e = ((xou)this.a).e;
                Label_1887: {
                    if (e.size() == list.size()) {
                        while (i < e.size()) {
                            if (!((xjf)e.get(i)).equals(list.get(i))) {
                                break Label_1887;
                            }
                            ++i;
                        }
                        return;
                    }
                }
                synchronized (this.a) {
                    for (final xjf xjf : ((xou)this.a).e) {
                        if (!list.contains(xjf)) {
                            ((xou)this.a).t(xjf);
                        }
                    }
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        ((xou)this.a).r((xjf)iterator2.next());
                    }
                }
                return;
            }
            case 19: {
                final xjr xjr = (xjr)a;
                ((xge)this.a).a.A((xjg)a2, (tcc)new ugx(2));
                return;
            }
            case 18: {
                final Uri uri = (Uri)a;
                final Bitmap ap = (Bitmap)a2;
                ((wqv)this.a).b.post((Runnable)new wmc(this, ap, 9, (byte[])null));
                ((wqv)this.a).ap = ap;
                return;
            }
            case 17: {
                ((ufh)this.a).u.c((Runnable)new rib(this, (Uri)a, (Drawable)a2, 16, (byte[])null));
                return;
            }
            case 16: {
                final Uri uri2 = (Uri)a;
                final Bitmap bitmap = (Bitmap)a2;
                if (bitmap != null) {
                    ((kqc)this.a).h.post((Runnable)new kqb(this, bitmap, 0, (byte[])null));
                    a2 = this.a;
                    final int min = Math.min(4, bitmap.getHeight());
                    final cdy cdy = new cdy(bitmap);
                    cdy.c(0, bitmap.getWidth(), min);
                    final ceb b4 = cdy.b();
                    final kqc kqc = (kqc)a2;
                    final int a3 = b4.a(kqc.i);
                    final cdy cdy2 = new cdy(bitmap);
                    cdy2.c(bitmap.getHeight() - min, bitmap.getWidth(), bitmap.getHeight());
                    kqc.g.post((Runnable)new r(kqc, a3, cdy2.b().a(kqc.i), 1));
                }
                return;
            }
            case 15: {
                final Uri uri3 = (Uri)a;
                final aix a4 = zz.a(((koa)this.a).b.getResources(), (Bitmap)a2);
                a4.c();
                ((koa)this.a).b.runOnUiThread((Runnable)new jlv(this, a4, 19, null));
                return;
            }
            case 14: {
                final Uri uri4 = (Uri)a;
                final Bitmap d = (Bitmap)a2;
                final jxp jxp = (jxp)this.a;
                jxp.d = d;
                jxp.a();
                return;
            }
            case 13: {
                final Uri uri5 = (Uri)a;
                final byte[] array = (byte[])a2;
                if (!((ateo)this.a).tA()) {
                    ((ateo)this.a).b(array);
                }
                return;
            }
            case 12: {
                final Void void2 = (Void)a;
                ((itg)this.a).q((List)a2);
                return;
            }
            case 11: {
                final String s = (String)a;
                final List list2 = (List)a2;
                if (!((ios)this.a).o.isCancelled()) {
                    if (s.equals(((ios)this.a).m)) {
                        final Iterator iterator3 = list2.iterator();
                        long n = 2147483647L;
                        while (iterator3.hasNext()) {
                            final aabe j = ((aabf)iterator3.next()).j;
                            final long t = jgk.t(j, ((ios)this.a).f);
                            if (j != null && t < n && jgk.D(j)) {
                                n = t;
                            }
                        }
                        if (n != 2147483647L && n != 0L) {
                            final ios ios = (ios)this.a;
                            a = new ikf(2130970922, new String[] { jgk.A((Context)ios.p.a, n, false) });
                            tpe.v((View)ios.h, false);
                            tpe.t(ios.g, (CharSequence)((String[])((ikf)a).c)[0]);
                            ios.g.setTextColor(tpe.cx(ios.a, ((ikf)a).a).orElse(0));
                            ios.g.setTypeface(ios.h.getTypeface(), 0);
                        }
                    }
                }
                return;
            }
            case 10: {
                final Void void3 = (Void)a;
                final Collection collection = (Collection)a2;
                final Future k = ((ioq)this.a).j;
                if (k != null && !k.isCancelled() && "PPSV".equals(((ioq)this.a).h)) {
                    final ioq ioq = (ioq)this.a;
                    ioq.b(ioq.b.a());
                    return;
                }
                ioq.g((ioq)this.a);
                return;
            }
            case 9: {
                final String s2 = (String)a;
                final aaat aaat = (aaat)a2;
                final Future l = ((ioq)this.a).j;
                if (l != null && !l.isCancelled() && s2.equals(((ioq)this.a).h)) {
                    if (aaat != null) {
                        final ioq ioq2 = (ioq)this.a;
                        ioq2.b(ioq2.b.c(((aabo)ioq2.c.a()).a().i().d(s2)));
                    }
                    return;
                }
                ioq.g((ioq)this.a);
                return;
            }
            case 8: {
                final String s3 = (String)a;
                final Boolean b5 = (Boolean)a2;
                if (((Map)this.a).containsKey(s3)) {
                    ((Map<K, tcc>)this.a).get(s3).b((Object)s3, (Object)b5);
                }
                return;
            }
            case 7: {
                final String s4 = (String)a;
                final aaat aaat2 = (aaat)a2;
                if (aaat2 != null && !((ijz)this.a).ai.isCancelled()) {
                    a = this.a;
                    final String b6 = aaat2.a.b;
                    final ijz ijz = (ijz)a;
                    ijz.ah = b6;
                    ijz.au = null;
                    ((fzf)ijz.ae.a()).l();
                    final ijz ijz2 = (ijz)this.a;
                    final igf aj = ijz2.aj;
                    aj.getClass();
                    final CharSequence ah = ijz2.ah;
                    final acko o = aj.o;
                    if (o != null) {
                        o.mN(new ackm(), new fzw(ah));
                    }
                }
                return;
            }
            case 6: {
                final String s5 = (String)a;
                final Boolean b7 = (Boolean)a2;
                if (fal.v((Context)((igf)this.a).a)) {
                    final igk q = ((igf)this.a).q;
                    if (q != null) {
                        q.a(b7 != null && b7 && b3);
                        final aaas d2 = ((aabo)q.b.a()).a().i().d(q.e);
                        if (d2 != null) {
                            if (!q.o) {
                                q.b(d2.a);
                            }
                            q.f();
                        }
                    }
                }
                else {
                    final igh p2 = ((igf)this.a).p;
                    if (p2 != null) {
                        if (b7 == null || !b7) {
                            b2 = false;
                        }
                        p2.b(b2);
                        final aaas d3 = ((aabo)p2.b.a()).a().i().d(p2.e);
                        if (d3 != null) {
                            if (!p2.o) {
                                p2.c(d3.a);
                            }
                            p2.h();
                        }
                    }
                }
                return;
            }
            case 5: {
                final Void void4 = (Void)a;
                final Collection collection2 = (Collection)a2;
                final Future c = ((ifx)this.a).c;
                if (c != null && !c.isCancelled()) {
                    final ifx ifx = (ifx)this.a;
                    ifx.a.execute(new ifw(ifx, collection2));
                    return;
                }
                ((ifx)this.a).c = null;
                return;
            }
            case 4: {
                final Void void5 = (Void)a;
                final PlayerResponseModel playerResponseModel = (PlayerResponseModel)a2;
                final ibg ibg = (ibg)this.a;
                ibg.d = Optional.of((Object)new jfw(ibg, playerResponseModel, 1));
                final ibg ibg2 = (ibg)this.a;
                if (ibg2.d.isPresent()) {
                    ibg2.c.k(playerResponseModel.y(), (tcc)ibg2.d.get(), playerResponseModel.K());
                }
                return;
            }
            case 3: {
                final xjg xjg = (xjg)a;
                final Boolean b8 = (Boolean)a2;
                final Intent b9 = xmm.b((Context)((MdxSmartRemoteMealbarController)this.a).a);
                b9.putExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", 3);
                b9.putExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", ((MdxSmartRemoteMealbarController)this.a).h.a);
                ((MdxSmartRemoteMealbarController)this.a).a.startActivity(b9);
                return;
            }
            case 2: {
                final Void void6 = (Void)a;
                final int n2 = ((abnm)a2).c - 1;
                if (n2 != 0) {
                    if (n2 != 1) {
                        final hxm hxm = (hxm)this.a;
                        hxm.aQ(hxm.av, (tcc)hxm.aj);
                        return;
                    }
                    ttr.l("The following video is unplayable: ".concat(String.valueOf(((hxm)this.a).av)));
                    tpe.x((Context)((hxm)this.a).od(), 2132019154, 0);
                    ((hxm)this.a).an.m((Object)this);
                    return;
                }
                else {
                    final hxm hxm2 = (hxm)this.a;
                    final CountDownLatch ay = hxm2.ay;
                    if (ay != null) {
                        ay.countDown();
                        if (((hxm)this.a).ay.getCount() <= 0L) {
                            ((hxm)this.a).aN();
                        }
                        return;
                    }
                    hxm2.aN();
                    return;
                }
                break;
            }
            case 1: {
                final Uri uri6 = (Uri)a;
                ((ImageView)this.a).setImageBitmap((Bitmap)a2);
                return;
            }
            case 0: {
                final Uri uri7 = (Uri)a;
                ((ImageView)this.a).setImageBitmap((Bitmap)a2);
            }
        }
    }
    
    public final void sd(final Object o, final Exception ex) {
        switch (this.b) {
            default: {
                final Void void1 = (Void)o;
                ttr.f(xou.a, "Error loading available screens", (Throwable)ex);
                return;
            }
            case 19: {
                final xjr xjr = (xjr)o;
                ttr.b("Error attempting pairing: ".concat(String.valueOf(String.valueOf(ex))));
                return;
            }
            case 18: {
                ttr.l("Error loading thumbnail from Uri: ".concat(String.valueOf(String.valueOf(o))));
                return;
            }
            case 17: {
                final Uri uri = (Uri)o;
                ((ufh)this.a).u.c((Runnable)new ufr(this, 1, (byte[])null));
                return;
            }
            case 16: {
                final Uri uri2 = (Uri)o;
                ((kqc)this.a).h.post((Runnable)new kmd(this, 11, (byte[])null));
                return;
            }
            case 15: {
                final Uri uri3 = (Uri)o;
                return;
            }
            case 14: {
                final Uri uri4 = (Uri)o;
                return;
            }
            case 13: {
                final Uri uri5 = (Uri)o;
                if (ex != null && !((ateo)this.a).tA()) {
                    ((ateo)this.a).a(ex);
                }
                return;
            }
            case 12: {
                final Void void2 = (Void)o;
                ((itg)this.a).a.o();
                return;
            }
            case 11: {
                final String s = (String)o;
                return;
            }
            case 10: {
                final Void void3 = (Void)o;
                return;
            }
            case 9: {
                final String s2 = (String)o;
                return;
            }
            case 8: {
                final String s3 = (String)o;
                if (((Map)this.a).containsKey(s3)) {
                    ((tcc)((Map<Object, Object>)this.a).get(s3)).sd((Object)s3, ex);
                }
                return;
            }
            case 7: {
                final String s4 = (String)o;
                return;
            }
            case 6: {
                ttr.d("Failed to sync playlist for playlistId = ".concat(String.valueOf(o)), (Throwable)ex);
                return;
            }
            case 5: {
                final Void void4 = (Void)o;
                return;
            }
            case 4: {
                final Void void5 = (Void)o;
                final tqd a = ((ibg)this.a).a;
                a.d(a.b((Throwable)ex));
                return;
            }
            case 3: {
                final xjg xjg = (xjg)o;
                return;
            }
            case 2: {
                final Void void6 = (Void)o;
                final tqd aa = ((hxm)this.a).aA;
                aa.d(aa.b((Throwable)ex));
                zlm.b(zll.b, zlk.j, "Could not get playability result: ".concat(String.valueOf(String.valueOf(ex))));
                ((hxm)this.a).an.m((Object)this);
                return;
            }
            case 1: {
                final Uri uri6 = (Uri)o;
                return;
            }
            case 0: {
                final Uri uri7 = (Uri)o;
            }
        }
    }
}
