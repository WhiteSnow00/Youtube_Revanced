import java.util.Iterator;
import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import android.text.TextUtils;
import j$.util.Optional;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import java.util.concurrent.Executor;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Looper;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.function.ToIntFunction;
import j$.util.Comparator$_CC;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import android.graphics.Bitmap;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaw implements ace
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public aaw(final aax a, final ye b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaw(final aeea a, final tww b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaw(final asie a, final asid b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaw(final PlayBilling a, final daj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaw(final Runnable a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaw(final nyp b, final aghu a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaw(final uaj b, final ahaz a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aaw(final uon a, final Bitmap b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaw(final ye a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final acc acc) {
        final int c = this.c;
        final int n = 0;
        switch (c) {
            default: {
                ((asie)this.a).Q((asid)this.b).ae(new adea(acc));
                return "Cpu Device Signals";
            }
            case 7: {
                final Object a = this.a;
                final Bitmap bitmap = (Bitmap)this.b;
                final uon uon = (uon)a;
                uon.w((Runnable)new ukb(uon, bitmap, acc, 5));
                return "GetNextOutputAsBitmap";
            }
            case 6: {
                final Object a2 = this.a;
                final Object b = this.b;
                ((AtomicReference)((aeea)a2).a).set(acc);
                ((tww)b).b();
                return "getFirstAudioCapturedFuture";
            }
            case 5: {
                final Object b2 = this.b;
                final Object a3 = this.a;
                final uag h = new uag(acc);
                final uaj uaj = (uaj)b2;
                uaj.h = (txy)h;
                uaj.b.O(uaj.h);
                final ahaz builder = arbj.a.createBuilder();
                final int c2 = (int)uaj.b.J();
                builder.copyOnWrite();
                final arbj arbj = (arbj)builder.instance;
                arbj.b |= 0x1;
                arbj.c = c2;
                final arbj d = (arbj)builder.build();
                final ahaz ahaz = (ahaz)a3;
                ahaz.copyOnWrite();
                final arbo arbo = (arbo)ahaz.instance;
                final arbo a4 = arbo.a;
                d.getClass();
                arbo.d = d;
                arbo.b |= 0x2;
                uaj.b.ad(0);
                uaj.b.P((azf)b2);
                final long j = uaj.b.J();
                final ArrayList list = new ArrayList<Object>((Collection<?>)uaj.c.a());
                Collections.sort((List<E>)list, Comparator$_CC.comparingInt((ToIntFunction)gwo.d));
                final afeq o = afeq.o((Collection)list);
                final int size = ((List)o).size();
                int n2 = 0;
                while (true) {
                    long n3;
                    arbj d2;
                    do {
                        final int c3 = n;
                        if (n2 >= size) {
                            if (c3 > 0) {
                                uaj.g = uaj.b.K((bfp)new uah(uaj));
                                final bfq g = uaj.g;
                                if (g != null) {
                                    final Looper mainLooper = Looper.getMainLooper();
                                    dk.h(g.i ^ true);
                                    g.e = mainLooper;
                                    dk.h(g.i ^ true);
                                    g.g = c3;
                                    g.f((Object)c3);
                                    dk.h(g.i ^ true);
                                    g.h = true;
                                    g.e();
                                }
                            }
                            uaj.b.X();
                            uaj.b.T();
                            return "submitPlayerFirstFrameRenderedFuture";
                        }
                        d2 = ((arbo)((List)o).get(n2)).d;
                        arbj a5;
                        if (d2 == null) {
                            a5 = arbj.a;
                        }
                        else {
                            a5 = d2;
                        }
                        n3 = a5.c;
                        ++n2;
                    } while (n3 <= j);
                    arbj a6;
                    if ((a6 = d2) == null) {
                        a6 = arbj.a;
                    }
                    final int c3 = a6.c;
                    continue;
                }
            }
            case 4: {
                final Object a7 = this.a;
                final Object b3 = this.b;
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final ohl ohl = new ohl(atomicBoolean, (Runnable)a7, acc);
                final IntentFilter intentFilter = new IntentFilter("android.intent.action.USER_UNLOCKED");
                final Context context = (Context)b3;
                context.registerReceiver((BroadcastReceiver)ohl, intentFilter);
                if (ohm.e(context) && atomicBoolean.compareAndSet(false, true)) {
                    context.unregisterReceiver((BroadcastReceiver)ohl);
                    ((Runnable)a7).run();
                    acc.c((Object)null);
                }
                else {
                    acc.a((Runnable)new nht(atomicBoolean, context, (BroadcastReceiver)ohl, 6), (Executor)afum.a);
                }
                return "DirectBootUtils.runWhenUnlocked";
            }
            case 3: {
                final Object b4 = this.b;
                final Object a8 = this.a;
                final RuntimeJni a9 = ((nyp)b4).a;
                a9.nativeMakeExperience(a9.a, ((agzk)a8).toByteArray(), NativeCallback.b(pja.G(acc, (nyj)nyn.a), (nzo)nzp.a));
                return "FaceViewerRuntime.makeExperience";
            }
            case 2: {
                final Object a10 = this.a;
                final Object b5 = this.b;
                final PlayBilling playBilling = (PlayBilling)a10;
                if (playBilling.f.isPresent()) {
                    ((acc)playBilling.f.get()).b();
                }
                playBilling.f = Optional.of((Object)acc);
                final czz czz = (czz)playBilling.c.get();
                final gqn gqn = new gqn(playBilling);
                if (!czz.i()) {
                    ((dak)gqn).c(dag.i, (List)null);
                }
                else {
                    final daj daj = (daj)b5;
                    final String a11 = daj.a;
                    final List c4 = daj.c;
                    final String b6 = daj.b;
                    if (TextUtils.isEmpty((CharSequence)a11)) {
                        dam.f("BillingClient", "Please fix the input params. SKU type can't be empty.");
                        ((dak)gqn).c(dag.e, (List)null);
                    }
                    else if (!czz.i && b6 != null) {
                        dam.f("BillingClient", "The user's client is too old to handle skuPackageName from SkuDetails.");
                        ((dak)gqn).c(dag.l, (List)null);
                    }
                    else if (c4 == null) {
                        dam.f("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
                        ((dak)gqn).c(dag.d, (List)null);
                    }
                    else {
                        final ArrayList list2 = new ArrayList();
                        for (final String s : c4) {
                            if (TextUtils.isEmpty((CharSequence)s)) {
                                throw new IllegalArgumentException("SKU must be set.");
                            }
                            list2.add(new cyb(s));
                        }
                        if (czz.f((Callable)new iii(czz, a11, list2, b6, (dak)gqn, 1), 30000L, (Runnable)new cdj((dak)gqn, 16), czz.b()) == null) {
                            ((dak)gqn).c(czz.c(), (List)null);
                        }
                    }
                }
                return "querySkuDetailsAsync";
            }
            case 1: {
                final Object a12 = this.a;
                final Object b7 = this.b;
                final ye ye = (ye)a12;
                ye.a(ye.c, SystemClock.elapsedRealtime(), (Context)b7, acc);
                return "CameraX initInternal";
            }
            case 0: {
                final Object a13 = this.a;
                final Object b8 = this.b;
                final Object b9 = ((aax)a13).b;
                monitorenter(b9);
                try {
                    sg.i(sg.g((ListenableFuture)aae.a(((aax)a13).d), (aab)new aat((ye)b8, 0), zu.a()), (aad)new zb(acc, (ye)b8, 2), zu.a());
                    monitorexit(b9);
                    return "ProcessCameraProvider-initializeCameraX";
                }
                finally {
                    monitorexit(b9);
                    while (true) {}
                }
                break;
            }
        }
    }
}
