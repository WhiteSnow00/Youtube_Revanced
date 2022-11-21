import java.util.Iterator;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import android.os.Looper;
import org.webrtc.Logging;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;
import com.google.research.xeno.effect.RemoteAssetManager;
import com.google.research.xeno.effect.RemoteAssetManager$FetchCallback;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel;
import android.os.Handler;
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

public final class aegq implements Runnable
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public aegq(final aegb c, final List a, final List b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final aegr a, final String b, final Bundle c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aegq(final aesw c, final aetc a, final ListenableFuture b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final afac c, final ParcelableFuture a, final Object b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final afac c, final ParcelableFuture a, final Runnable b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final afac c, final ParcelableFuture a, final Throwable b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final agny b, final Intent c, final noj a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aegq(final agps c, final Status b, final arze a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aegq(final agpv c, final String a, final Throwable b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final agpz c, final Status b, final arze a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aegq(final aqwp c, final Effect a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final arht c, final Exception[] b, final CountDownLatch a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aegq(final arie a, final Runnable b, final Handler c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aegq(final FuturesMixinViewModel c, final com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture a, final Object b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final FuturesMixinViewModel c, final com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture a, final Throwable b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final ListenableFuture c, final String a, final Object[] b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final RemoteAssetManager$FetchCallback c, final String a, final String b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aegq(final RemoteAssetManager a, final String b, final RemoteAssetManager$FetchCallback c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aegq(final InternalMediaCodecVideoEncoder c, final Exception[] b, final CountDownLatch a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aegq(final xsj c, final ParcelableFuture a, final Object b, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                ((Runnable)this.b).run();
                ((Handler)this.c).removeCallbacks((Runnable)this);
                ((Handler)this.c).postDelayed((Runnable)this, ((arie)this.a).a);
                return;
            }
            case 19: {
                final Object c = this.c;
                final Object b = this.b;
                final Object a = this.a;
                try {
                    ((InternalMediaCodecVideoEncoder)c).N.ab();
                }
                catch (final Exception ex) {
                    Logging.c("IMCVideoEncoder", "Media encoder stop failed", (Throwable)ex);
                }
                try {
                    ((InternalMediaCodecVideoEncoder)c).N.X();
                }
                catch (final Exception ex2) {
                    Logging.c("IMCVideoEncoder", "Media encoder release failed", (Throwable)ex2);
                    ((Exception[])b)[0] = ex2;
                }
                ((CountDownLatch)a).countDown();
                return;
            }
            case 18: {
                final Object c2 = this.c;
                final Object b2 = this.b;
                final Object a2 = this.a;
                try {
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread");
                    ((arht)c2).E.ab();
                    ((arht)c2).E.X();
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread done");
                }
                catch (final Exception ex3) {
                    Logging.c("IMCVideoDecoder", "MediaCodec release failed", (Throwable)ex3);
                    ((Exception[])b2)[0] = ex3;
                }
                ((CountDownLatch)a2).countDown();
                return;
            }
            case 17: {
                final Object c3 = this.c;
                final Object a3 = this.a;
                final Object b3 = this.b;
                if (a3 != null) {
                    final uox uox = (uox)c3;
                    if (!uox.b.b) {
                        uox.b.b((String)a3);
                    }
                }
                else if (b3 != null) {
                    final String a4 = ((uox)c3).a;
                    final StringBuilder sb = new StringBuilder("Thumbnail fetch failed for remote url: ");
                    sb.append(a4);
                    sb.append(". Error: ");
                    sb.append((String)b3);
                    tut.b(sb.toString());
                }
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final Object b4 = this.b;
                final Object c4 = this.c;
                final long b5 = ((RemoteAssetManager)a5).b;
                if (b5 != 0L) {
                    RemoteAssetManager.nativeFetchAsset(b5, (String)b4, (RemoteAssetManager$FetchCallback)c4);
                    return;
                }
                new Handler(Looper.getMainLooper()).post((Runnable)new aegq(((aqyb)c4).a, null, "RemoteAssetManager failed to natively load", 17));
                return;
            }
            case 15: {
                ((aqwp)this.c).a((Effect)this.a, (String)this.b);
                return;
            }
            case 14: {
                ((agpz)this.c).a.a((Status)this.b, (arze)this.a);
                return;
            }
            case 13: {
                final Object c5 = this.c;
                final Object b6 = this.b;
                final Object a6 = this.a;
                final agps agps = (agps)c5;
                if (!agps.a) {
                    try {
                        ((agps)c5).c.a((Status)b6, (arze)a6);
                    }
                    finally {
                        agps.a = true;
                        agps.b.f.a();
                    }
                }
                return;
            }
            case 12: {
                final Object c6 = this.c;
                final Object a7 = this.a;
                final Object b7 = this.b;
                final agpv agpv = (agpv)c6;
                final Iterator iterator = agpv.b.iterator();
                while (iterator.hasNext()) {
                    ((ListenableFuture)iterator.next()).cancel(true);
                }
                final arwu h = agpv.h;
                if (h != null) {
                    h.b((String)a7, (Throwable)b7);
                }
                return;
            }
            case 11: {
                final Object b8 = this.b;
                final Object c7 = this.c;
                final Object a8 = this.a;
                try {
                    ((agny)b8).g((Intent)c7);
                }
                finally {
                    ((noj)a8).b((Object)null);
                }
            }
            case 10: {
                final Object c8 = this.c;
                final Object a9 = this.a;
                final Object b9 = this.b;
                final afac afac = (afac)c8;
                final abq a10 = afac.a;
                final ParcelableFuture parcelableFuture = (ParcelableFuture)a9;
                afac.a(new aegq((xsj)a10.d(parcelableFuture.a), parcelableFuture, b9, 7, null, null, null, null));
                return;
            }
            case 9: {
                final Object c9 = this.c;
                final Object a11 = this.a;
                final Object b10 = this.b;
                final afac afac2 = (afac)c9;
                final cl c10 = afac2.c;
                if (c10 != null) {
                    if (!c10.Z()) {
                        if (!c10.w && afac2.b.remove(a11)) {
                            ((Runnable)b10).run();
                        }
                    }
                    else {
                        afac2.e = true;
                    }
                }
                return;
            }
            case 8: {
                final Object c11 = this.c;
                final Object a12 = this.a;
                final Object b11 = this.b;
                final afac afac3 = (afac)c11;
                final abq a13 = afac3.a;
                final ParcelableFuture parcelableFuture2 = (ParcelableFuture)a12;
                final xsj xsj = (xsj)a13.d(parcelableFuture2.a);
                afac3.a(new afaa(parcelableFuture2, (Throwable)b11, 0));
                return;
            }
            case 7: {
                final Object c12 = this.c;
                final Object a14 = this.a;
                final Object b12 = this.b;
                final Void void1 = (Void)((ParcelableFuture)a14).b;
                final String s = (String)b12;
                s.getClass();
                final kcx kcx = (kcx)((xsj)c12).a;
                final kcs y = kcx.y;
                final kcw h2 = kcx.h;
                if (y != h2) {
                    kcx.b((kcs)h2);
                    return;
                }
                kcx.e(s);
                return;
            }
            case 6: {
                ((aesw)this.c).j((aetc)this.a, (ListenableFuture)this.b);
                return;
            }
            case 5: {
                final Object c13 = this.c;
                final Object a15 = this.a;
                final Object b13 = this.b;
                final FuturesMixinViewModel futuresMixinViewModel = (FuturesMixinViewModel)c13;
                if (futuresMixinViewModel.e && futuresMixinViewModel.c.remove(a15)) {
                    final aeob aeob = (aeob)futuresMixinViewModel.b.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)a15).a);
                    final aeux p = aewp.p("onFailure FuturesMixin", aeva.a);
                    try {
                        aeob.a(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)a15).d, (Throwable)b13);
                        p.close();
                    }
                    finally {
                        try {
                            p.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            aexq.d(t, t2);
                        }
                    }
                }
                return;
            }
            case 4: {
                final Object c14 = this.c;
                final Object a16 = this.a;
                final Object b14 = this.b;
                final FuturesMixinViewModel futuresMixinViewModel2 = (FuturesMixinViewModel)c14;
                if (futuresMixinViewModel2.e && futuresMixinViewModel2.c.remove(a16)) {
                    final aeob aeob2 = (aeob)futuresMixinViewModel2.b.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)a16).a);
                    final aeux p2 = aewp.p("onSuccess FuturesMixin", aeva.a);
                    try {
                        aeob2.b(((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture)a16).d, b14);
                        p2.close();
                    }
                    finally {
                        try {
                            p2.close();
                        }
                        finally {
                            final Throwable t3;
                            final Throwable t4;
                            aexq.d(t3, t4);
                        }
                    }
                }
                return;
            }
            case 3: {
                aenj.a((ListenableFuture)this.c, (String)this.a, (Object[])this.b);
                return;
            }
            case 2: {
                ((aegr)this.a).c((String)this.b, (Bundle)this.c);
                return;
            }
            case 1: {
                final Object c15 = this.c;
                final Object a17 = this.a;
                final Object b15 = this.b;
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                for (final File file : a17) {
                    final String o = aegu.o(file);
                    final Uri fromFile = Uri.fromFile(file);
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, ((aegb)c15).b.getContentResolver().getType(fromFile));
                    intent.addFlags(1);
                    intent.putExtra("module_name", aegb.d(o));
                    intent.putExtra("split_id", o);
                    list.add(intent);
                    list2.add(aegb.d(aegu.o(file)));
                }
                final aegb aegb = (aegb)c15;
                final aefr c16 = aegb.c();
                if (c16 == null) {
                    return;
                }
                aegb.c.execute((Runnable)new pow(aegb, c16.d, (List)list2, (List)b15, 6));
                return;
            }
            case 0: {
                ((aegr)this.a).e((String)this.b, (Bundle)this.c);
            }
        }
    }
}
