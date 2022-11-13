import java.util.Iterator;
import android.text.TextUtils;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import org.webrtc.Logging;
import com.google.research.xeno.effect.RemoteAssetManager;
import com.google.research.xeno.effect.RemoteAssetManager$FetchCallback;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel;
import java.util.concurrent.CountDownLatch;
import com.google.research.xeno.effect.Effect;
import io.grpc.Status;
import android.content.Intent;
import com.google.common.android.concurrent.ParcelableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlo implements Runnable
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public adlo(final adlp a, final String b, final aknt c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public adlo(final aeej a, final List c, final List b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final aeey c, final String b, final Bundle a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adlo(final aerc a, final aerj c, final ListenableFuture b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final aeyk a, final ParcelableFuture c, final Object b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final aeyk a, final ParcelableFuture c, final Runnable b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final aeyk a, final ParcelableFuture c, final Throwable b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final afhd a, final ParcelableFuture c, final Object b, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final agmg b, final Intent a, final nns c, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public adlo(final agoa a, final Status b, final arwk c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public adlo(final agod a, final String c, final Throwable b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final agog a, final Status b, final arwk c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public adlo(final aqtw a, final Effect c, final String b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final arey a, final Exception[] b, final CountDownLatch c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public adlo(final FuturesMixinViewModel a, final com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture c, final Object b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final FuturesMixinViewModel a, final com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture c, final Throwable b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final ListenableFuture a, final String c, final Object[] b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final RemoteAssetManager$FetchCallback a, final String c, final String b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public adlo(final RemoteAssetManager c, final String b, final RemoteAssetManager$FetchCallback a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adlo(final gna c, final List b, final dbj a, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                final Object a = this.a;
                final Object b = this.b;
                final Object c = this.c;
                try {
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread");
                    ((arey)a).E.r();
                    ((arey)a).E.n();
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread done");
                }
                catch (final Exception ex) {
                    Logging.c("IMCVideoDecoder", "MediaCodec release failed", (Throwable)ex);
                    ((Exception[])b)[0] = ex;
                }
                ((CountDownLatch)c).countDown();
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final Object c2 = this.c;
                final Object b2 = this.b;
                if (c2 != null) {
                    final unv unv = (unv)a2;
                    if (!unv.b.b) {
                        unv.b.b((String)c2);
                    }
                }
                else if (b2 != null) {
                    final String a3 = ((unv)a2).a;
                    final StringBuilder sb = new StringBuilder("Thumbnail fetch failed for remote url: ");
                    sb.append(a3);
                    sb.append(". Error: ");
                    sb.append((String)b2);
                    ttr.b(sb.toString());
                }
                return;
            }
            case 18: {
                final Object c3 = this.c;
                final Object b3 = this.b;
                final Object a4 = this.a;
                final long b4 = ((RemoteAssetManager)c3).b;
                if (b4 != 0L) {
                    RemoteAssetManager.nativeFetchAsset(b4, (String)b3, (RemoteAssetManager$FetchCallback)a4);
                    return;
                }
                new Handler(Looper.getMainLooper()).post((Runnable)new adlo(((aqvg)a4).a, null, "RemoteAssetManager failed to natively load", 19));
                return;
            }
            case 17: {
                ((aqtw)this.a).a((Effect)this.c, (String)this.b);
                return;
            }
            case 16: {
                ((agog)this.a).a.a((Status)this.b, (arwk)this.c);
                return;
            }
            case 15: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                final Object c4 = this.c;
                final agoa agoa = (agoa)a5;
                if (!agoa.a) {
                    try {
                        ((agoa)a5).c.a((Status)b5, (arwk)c4);
                    }
                    finally {
                        agoa.a = true;
                        agoa.b.f.a();
                    }
                }
                return;
            }
            case 14: {
                final Object a6 = this.a;
                final Object c5 = this.c;
                final Object b6 = this.b;
                final agod agod = (agod)a6;
                final Iterator iterator = agod.b.iterator();
                while (iterator.hasNext()) {
                    ((ListenableFuture)iterator.next()).cancel(true);
                }
                final arua h = agod.h;
                if (h != null) {
                    h.b((String)c5, (Throwable)b6);
                }
                return;
            }
            case 13: {
                final Object b7 = this.b;
                final Object a7 = this.a;
                final Object c6 = this.c;
                try {
                    ((agmg)b7).g((Intent)a7);
                }
                finally {
                    ((nns)c6).b((Object)null);
                }
            }
            case 12: {
                final Object a8 = this.a;
                final Object c7 = this.c;
                final Object b8 = this.b;
                final aeyk aeyk = (aeyk)a8;
                final abp a9 = aeyk.a;
                final ParcelableFuture parcelableFuture = (ParcelableFuture)c7;
                aeyk.a((Runnable)new adlo((afhd)a9.d(parcelableFuture.a), parcelableFuture, b8, 9, null));
                return;
            }
            case 11: {
                final Object a10 = this.a;
                final Object c8 = this.c;
                final Object b9 = this.b;
                final aeyk aeyk2 = (aeyk)a10;
                final cl c9 = aeyk2.c;
                if (c9 != null) {
                    if (!c9.Z()) {
                        if (!c9.w && aeyk2.b.remove(c8)) {
                            ((Runnable)b9).run();
                        }
                    }
                    else {
                        aeyk2.e = true;
                    }
                }
                return;
            }
            case 10: {
                final Object a11 = this.a;
                final Object c10 = this.c;
                final Object b10 = this.b;
                final aeyk aeyk3 = (aeyk)a11;
                final abp a12 = aeyk3.a;
                final ParcelableFuture parcelableFuture2 = (ParcelableFuture)c10;
                final afhd afhd = (afhd)a12.d(parcelableFuture2.a);
                aeyk3.a((Runnable)new adqz(parcelableFuture2, (Throwable)b10, 20));
                return;
            }
            case 9: {
                final Object a13 = this.a;
                final Object c11 = this.c;
                final Object b11 = this.b;
                final Void void1 = (Void)((ParcelableFuture)c11).b;
                final String s = (String)b11;
                s.getClass();
                final kcn kcn = (kcn)((afhd)a13).a;
                final kcj y = kcn.y;
                final kcm h2 = kcn.h;
                if (y != h2) {
                    kcn.b((kcj)h2);
                    return;
                }
                kcn.e(s);
                return;
            }
            case 8: {
                ((aerc)this.a).j((aerj)this.c, (ListenableFuture)this.b);
                return;
            }
            case 7: {
                final Object a14 = this.a;
                final Object c12 = this.c;
                final Object b12 = this.b;
                final FuturesMixinViewModel futuresMixinViewModel = (FuturesMixinViewModel)a14;
                if (futuresMixinViewModel.e && futuresMixinViewModel.c.remove(c12)) {
                    final aemi aemi = (aemi)futuresMixinViewModel.b.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)c12).a);
                    final aetf p = aeux.p("onFailure FuturesMixin", aeti.a);
                    try {
                        aemi.a(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)c12).d, (Throwable)b12);
                        p.close();
                    }
                    finally {
                        try {
                            p.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            adkp.af(t, t2);
                        }
                    }
                }
                return;
            }
            case 6: {
                final Object a15 = this.a;
                final Object c13 = this.c;
                final Object b13 = this.b;
                final FuturesMixinViewModel futuresMixinViewModel2 = (FuturesMixinViewModel)a15;
                if (futuresMixinViewModel2.e && futuresMixinViewModel2.c.remove(c13)) {
                    final aemi aemi2 = (aemi)futuresMixinViewModel2.b.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)c13).a);
                    final aetf p2 = aeux.p("onSuccess FuturesMixin", aeti.a);
                    try {
                        aemi2.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)c13).d, b13);
                        p2.close();
                    }
                    finally {
                        try {
                            p2.close();
                        }
                        finally {
                            final Throwable t3;
                            final Throwable t4;
                            adkp.af(t3, t4);
                        }
                    }
                }
                return;
            }
            case 5: {
                aelq.a((ListenableFuture)this.a, (String)this.c, (Object[])this.b);
                return;
            }
            case 4: {
                ((aeey)this.c).c((String)this.b, (Bundle)this.a);
                return;
            }
            case 3: {
                ((aeey)this.c).e((String)this.b, (Bundle)this.a);
                return;
            }
            case 2: {
                final Object a16 = this.a;
                final Object c14 = this.c;
                final Object b14 = this.b;
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                for (final File file : c14) {
                    final String h3 = aefb.h(file);
                    final Uri fromFile = Uri.fromFile(file);
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, ((aeej)a16).b.getContentResolver().getType(fromFile));
                    intent.addFlags(1);
                    intent.putExtra("module_name", aeej.d(h3));
                    intent.putExtra("split_id", h3);
                    list.add(intent);
                    list2.add(aeej.d(aefb.h(file)));
                }
                final aeej aeej = (aeej)a16;
                final aedz c15 = aeej.c();
                if (c15 == null) {
                    return;
                }
                aeej.c.execute((Runnable)new pod(aeej, c15.d, (List)list2, (List)b14, 6));
                return;
            }
            case 1: {
                final Object c16 = this.c;
                final Object b15 = this.b;
                final Object a17 = this.a;
                final Object a18 = ((gna)c16).a;
                b15.getClass();
                for (final adlk adlk : b15) {
                    final adll adll = (adll)a18;
                    final adlk adlk2 = new adlk(adlk.a, adlk.b, adlk.c, adll.b.c() + 5000L, adlk.e, adlk.f + 1);
                    if (adlk2.f > 3) {
                        final Iterator iterator4 = adll.f.iterator();
                        while (iterator4.hasNext()) {
                            ((adlj)iterator4.next()).f(adlk2.c, (Exception)a17);
                            adll.e(adlk2.b, adlk2.c);
                        }
                    }
                    else {
                        adll.e.add(adlk2);
                    }
                }
                ((adll)a18).g();
                return;
            }
            case 0: {
                final Object a19 = this.a;
                final Object b16 = this.b;
                final Object c17 = this.c;
                zme zme;
                if (TextUtils.isEmpty((CharSequence)b16)) {
                    zme = ((zmf)((adlp)a19).e).c();
                }
                else {
                    zme = ((zmf)((adlp)a19).e).d((String)b16);
                }
                zme a20 = zme;
                if (zme == null) {
                    a20 = zmd.a;
                    final String value = String.valueOf(c17);
                    final StringBuilder sb2 = new StringBuilder("Identity not found. IdentityId: ");
                    sb2.append((String)b16);
                    sb2.append(" ClientEvent: ");
                    sb2.append(value);
                    ttr.m("UploadEventLogger", sb2.toString());
                    ((adet)((adlp)a19).g).g("Identity not found. ClientEvent reported as signed-out.");
                }
                ((wxx)((adlp)a19).c).n((aknt)c17, a20);
            }
        }
    }
}
