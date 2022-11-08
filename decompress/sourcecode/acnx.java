import android.content.Intent;
import android.util.SparseArray;
import com.google.android.apps.youtube.app.watch.state.blocks.DefaultPlayerLayoutTransitionDelegate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import android.os.IBinder;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.os.Bundle;
import j$.util.Optional;
import java.util.Map;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Arrays;
import android.content.Context;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acnx
{
    private static WeakReference b;
    public Object a;
    
    public acnx() {
    }
    
    public acnx(final aeml a) {
        this.a = a;
    }
    
    public acnx(final Context context) {
        this.a = new mpr(context, mgf.a, (mpl)mpl.f, (msa)new aggc(0), (byte[])null, (byte[])null, (byte[])null);
    }
    
    public acnx(final atjj atjj) {
        final long h = ((uyi)atjj.a()).h(45382255L);
        if (h > 0L) {
            final byte[] a = new byte[(int)h * 1024];
            this.a = a;
            Arrays.fill(a, (byte)(-1));
        }
    }
    
    public acnx(final SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.i = SwipeDismissBehavior.A(0.1f);
        swipeDismissBehavior.j = SwipeDismissBehavior.A(0.6f);
        swipeDismissBehavior.g = 0;
    }
    
    public acnx(final Object a) {
        this.a = a;
    }
    
    public acnx(final Map a) {
        this.a = a;
    }
    
    public acnx(final byte[] array) {
        this.a = Optional.empty();
    }
    
    public acnx(final byte[] array, final byte[] array2) {
        this.a = null;
    }
    
    public acnx(final byte[] array, final byte[] array2, final byte[] array3) {
    }
    
    public acnx(final char[] array) {
        this.a = Optional.empty();
    }
    
    public acnx(final char[] array, final byte[] array2) {
        this.a = afgq.a;
    }
    
    public acnx(final short[] array) {
    }
    
    public static acnx d(final Context context) {
        synchronized (acnx.class) {
            kgk.aL(context);
            final WeakReference b = acnx.b;
            acnx acnx;
            if (b == null) {
                acnx = null;
            }
            else {
                acnx = (acnx)b.get();
            }
            if (acnx == null) {
                final acnx acnx2 = new acnx(context.getApplicationContext());
                acnx.b = new WeakReference(acnx2);
                return acnx2;
            }
            return acnx;
        }
    }
    
    public static Bundle g(final wwv wwv) {
        if (wwv == null) {
            return null;
        }
        final InteractionLoggingScreen a = wwv.a();
        if (a == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("tracking_interaction_parent_csn", a.a);
        a.c();
        bundle.putInt("tracking_interaction_parent_ve", a.c().a);
        return bundle;
    }
    
    public static Bundle h(final aioe aioe) {
        Bundle bundle2;
        final Bundle bundle = bundle2 = null;
        if (aioe != null) {
            if (!((agzd)aioe).rs((agyr)amoa.b)) {
                bundle2 = bundle;
            }
            else {
                final amob amob = (amob)((agzd)aioe).rr((agyr)amoa.b);
                bundle2 = bundle;
                if ((amob.b & 0x1) != 0x0) {
                    final Bundle bundle3 = new Bundle();
                    bundle3.putString("tracking_interaction_parent_csn", amob.c);
                    final int d = amob.d;
                    if (d > 0) {
                        bundle3.putInt("tracking_interaction_parent_ve", d);
                    }
                    bundle2 = bundle3;
                    if ((aioe.b & 0x1) != 0x0) {
                        bundle3.putByteArray("tracking_interaction_click_tracking_params", aioe.c.I());
                        bundle2 = bundle3;
                    }
                }
            }
        }
        return bundle2;
    }
    
    public static aioe i(final Bundle bundle) {
        if (bundle != null && bundle.containsKey("tracking_interaction_parent_csn")) {
            final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
            final agza builder = ((agzi)amob.a).createBuilder();
            final String string = bundle.getString("tracking_interaction_parent_csn");
            if (string != null) {
                builder.copyOnWrite();
                final amob amob = (amob)builder.instance;
                amob.b |= 0x1;
                amob.c = string;
            }
            if (bundle.containsKey("tracking_interaction_parent_ve")) {
                final int int1 = bundle.getInt("tracking_interaction_parent_ve");
                builder.copyOnWrite();
                final amob amob2 = (amob)builder.instance;
                amob2.b |= 0x2;
                amob2.d = int1;
            }
            if (bundle.containsKey("tracking_interaction_click_tracking_params")) {
                final byte[] byteArray = bundle.getByteArray("tracking_interaction_click_tracking_params");
                if (byteArray != null) {
                    final agyc x = agyc.x(byteArray);
                    ((agza)agzc).copyOnWrite();
                    final aioe aioe = (aioe)agzc.instance;
                    aioe.b |= 0x1;
                    aioe.c = x;
                }
                else {
                    ((agza)agzc).copyOnWrite();
                    final aioe aioe2 = (aioe)agzc.instance;
                    aioe2.b &= 0xFFFFFFFE;
                    aioe2.c = aioe.a.c;
                }
            }
            agzc.e((agyr)amoa.b, (Object)builder.build());
            return (aioe)((agza)agzc).build();
        }
        return null;
    }
    
    public final IBinder a() {
        synchronized (this) {
            return (IBinder)this.a;
        }
    }
    
    public final void b(final IBinder a) {
        synchronized (this) {
            this.a = a;
        }
    }
    
    public final void c() {
        qcj.s();
        final Object a = this.a;
        a.getClass();
        final aeml aeml = (aeml)a;
        agot.E(aeml.b.h(), (Object)"LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        aemp aemp;
        try {
            aemp = aemp.e(afva.u((Future)((aeml)a).b.c()));
        }
        catch (final ExecutionException ex) {
            aemp = aemp.d(ex.getCause());
        }
        this.a = new aeml(aeml.a, (aexq)aewp.a, aexq.k((Object)aemp), aeml.d);
    }
    
    public final xkv e() {
        final Object a = this.a;
        if (a != null) {
            return new xkv((xhs)a);
        }
        throw new IllegalStateException("Missing required properties: deviceId");
    }
    
    public final void f(final xhs a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null deviceId");
    }
    
    public final void j(final String s, final Throwable t) {
        final Object a = this.a;
        if (a != null) {
            ((vie)a).e(s, t);
        }
    }
    
    public final void k(final DefaultPlayerLayoutTransitionDelegate defaultPlayerLayoutTransitionDelegate) {
        this.a = Optional.ofNullable((Object)defaultPlayerLayoutTransitionDelegate);
    }
    
    public final boolean l(final int n) {
        final Object a = this.a;
        return a != null && ((SparseArray)a).get(n) != null;
    }
    
    public final boolean m(final int n, final int n2, final Intent intent) {
        final Object a = this.a;
        if (a != null && ((SparseArray)a).get(n) != null) {
            ((szw)((SparseArray)this.a).get(n)).b(n, n2, intent);
            final Object a2 = this.a;
            if (a2 != null) {
                ((SparseArray)a2).remove(n);
            }
            return true;
        }
        return false;
    }
    
    public final sif n() {
        final Object a = this.a;
        if (a != null) {
            return new sif((shz)a);
        }
        throw new IllegalStateException("Missing required properties: adOverlayMetadata");
    }
    
    public final void o() {
        final Object a = this.a;
        if (a != null) {
            ((abxe)a).a();
            this.a = null;
        }
    }
    
    public final void p(final abtt abtt, final rod rod) {
        if (abtt == null) {
            throw new rnm("VideoPlayback wasn't available when trying to request interrupt", 65);
        }
        final abxg i = abtt.i();
        if (i == null) {
            throw new rnm("VideoInterrupt.Controller wasn't available when trying to request interrupt", 66);
        }
        if (this.a == null) {
            i.c((abxa)new aawk(this, rod, 1, null, null, null, null));
            return;
        }
        throw new rnm("Tried to enter PlayerBytesSlot when interrupt already acquired", 67);
    }
    
    public final boolean q() {
        return this.a != null;
    }
    
    public final void r() {
        qcj.s();
        this.a.getClass();
        final qiv[] values = qiv.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final qiw qiw = ((Map<K, qiw>)this.a).get(values[i]);
            if (qiw != null) {
                qiw.a();
            }
        }
        this.a = null;
    }
}
