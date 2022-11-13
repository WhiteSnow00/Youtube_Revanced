import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.os.Bundle;
import j$.util.Optional;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Arrays;
import android.content.Context;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqb
{
    private static WeakReference b;
    public Object a;
    
    public acqb() {
    }
    
    public acqb(final aeol a) {
        this.a = a;
    }
    
    public acqb(final Context context) {
        this.a = new mqw(context, mhk.a, (mqq)mqq.f, (mtf)new agid(0), (byte[])null, (byte[])null, (byte[])null);
    }
    
    public acqb(final atke atke) {
        final long h = ((vai)atke.a()).h(45382255L);
        if (h > 0L) {
            final byte[] a = new byte[(int)h * 1024];
            this.a = a;
            Arrays.fill(a, (byte)(-1));
        }
    }
    
    public acqb(final SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.i = SwipeDismissBehavior.A(0.1f);
        swipeDismissBehavior.j = SwipeDismissBehavior.A(0.6f);
        swipeDismissBehavior.g = 0;
    }
    
    public acqb(final Object a) {
        this.a = a;
    }
    
    public acqb(final byte[] array) {
        this.a = Optional.empty();
    }
    
    public acqb(final byte[] array, final byte[] array2) {
        this.a = null;
    }
    
    public static Bundle c(final wyw wyw) {
        if (wyw == null) {
            return null;
        }
        final InteractionLoggingScreen a = wyw.a();
        if (a == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("tracking_interaction_parent_csn", a.a);
        a.c();
        bundle.putInt("tracking_interaction_parent_ve", a.c().a);
        return bundle;
    }
    
    public static Bundle d(final aiqj aiqj) {
        Bundle bundle2;
        final Bundle bundle = bundle2 = null;
        if (aiqj != null) {
            if (!((ahbc)aiqj).ry((ahaq)amqf.b)) {
                bundle2 = bundle;
            }
            else {
                final amqg amqg = (amqg)((ahbc)aiqj).rx((ahaq)amqf.b);
                bundle2 = bundle;
                if ((amqg.b & 0x1) != 0x0) {
                    final Bundle bundle3 = new Bundle();
                    bundle3.putString("tracking_interaction_parent_csn", amqg.c);
                    final int d = amqg.d;
                    if (d > 0) {
                        bundle3.putInt("tracking_interaction_parent_ve", d);
                    }
                    bundle2 = bundle3;
                    if ((aiqj.b & 0x1) != 0x0) {
                        bundle3.putByteArray("tracking_interaction_click_tracking_params", aiqj.c.I());
                        bundle2 = bundle3;
                    }
                }
            }
        }
        return bundle2;
    }
    
    public static aiqj e(final Bundle bundle) {
        if (bundle != null && bundle.containsKey("tracking_interaction_parent_csn")) {
            final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
            final ahaz builder = ((ahbh)amqg.a).createBuilder();
            final String string = bundle.getString("tracking_interaction_parent_csn");
            if (string != null) {
                builder.copyOnWrite();
                final amqg amqg = (amqg)builder.instance;
                amqg.b |= 0x1;
                amqg.c = string;
            }
            if (bundle.containsKey("tracking_interaction_parent_ve")) {
                final int int1 = bundle.getInt("tracking_interaction_parent_ve");
                builder.copyOnWrite();
                final amqg amqg2 = (amqg)builder.instance;
                amqg2.b |= 0x2;
                amqg2.d = int1;
            }
            if (bundle.containsKey("tracking_interaction_click_tracking_params")) {
                final byte[] byteArray = bundle.getByteArray("tracking_interaction_click_tracking_params");
                if (byteArray != null) {
                    final ahab x = ahab.x(byteArray);
                    ((ahaz)ahbb).copyOnWrite();
                    final aiqj aiqj = (aiqj)ahbb.instance;
                    aiqj.b |= 0x1;
                    aiqj.c = x;
                }
                else {
                    ((ahaz)ahbb).copyOnWrite();
                    final aiqj aiqj2 = (aiqj)ahbb.instance;
                    aiqj2.b &= 0xFFFFFFFE;
                    aiqj2.c = aiqj.a.c;
                }
            }
            ahbb.e((ahaq)amqf.b, (Object)builder.build());
            return (aiqj)((ahaz)ahbb).build();
        }
        return null;
    }
    
    public static acqb h(final Context context) {
        synchronized (acqb.class) {
            khl.aP((Object)context);
            final WeakReference b = acqb.b;
            acqb acqb;
            if (b == null) {
                acqb = null;
            }
            else {
                acqb = (acqb)b.get();
            }
            if (acqb == null) {
                final acqb acqb2 = new acqb(context.getApplicationContext());
                acqb.b = new WeakReference(acqb2);
                return acqb2;
            }
            return acqb;
        }
    }
    
    public final xmv a() {
        final Object a = this.a;
        if (a != null) {
            return new xmv((xjr)a);
        }
        throw new IllegalStateException("Missing required properties: deviceId");
    }
    
    public final void b(final xjr a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null deviceId");
    }
    
    public final void f(final String s, final Throwable t) {
        final Object a = this.a;
        if (a != null) {
            ((vkf)a).d(s, t);
        }
    }
    
    public final void g() {
        qdt.h();
        final Object a = this.a;
        a.getClass();
        final aeol aeol = (aeol)a;
        adkp.R(aeol.b.h(), "LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        aeop aeop;
        try {
            aeop = aeop.e(afwm.u((Future)((aeol)a).b.c()));
        }
        catch (final ExecutionException ex) {
            aeop = aeop.d(ex.getCause());
        }
        this.a = new aeol(aeol.a, (aezp)aeyo.a, aezp.k((Object)aeop), aeol.d);
    }
}
