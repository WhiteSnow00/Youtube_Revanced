import android.media.MediaRouter$Callback;
import android.util.Log;
import android.media.MediaRouter$VolumeCallback;
import android.media.MediaRouter$RouteCategory;
import android.os.Bundle;
import java.util.Collection;
import java.util.List;
import android.media.MediaRouter$UserRouteInfo;
import java.util.Locale;
import java.util.Iterator;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

class cdp extends cdt implements ccu, ccw
{
    private static final ArrayList r;
    private static final ArrayList s;
    protected final Object a;
    protected final Object b;
    protected final Object c;
    protected final Object d;
    protected int m;
    protected boolean n;
    protected boolean o;
    protected final ArrayList p;
    protected final ArrayList q;
    private final cds t;
    private ble u;
    private bkv v;
    
    static {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        (r = new ArrayList()).add(intentFilter);
        final IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        (s = new ArrayList()).add(intentFilter2);
    }
    
    public cdp(final Context context, final cds t) {
        super(context);
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.t = t;
        final Object systemService = context.getSystemService("media_router");
        this.a = systemService;
        this.b = this.q();
        this.c = new ccx((ccw)this);
        this.d = ((MediaRouter)systemService).createRouteCategory((CharSequence)context.getResources().getString(2132018694), false);
        this.C();
    }
    
    protected static final cdo B(Object tag) {
        tag = ((MediaRouter$RouteInfo)tag).getTag();
        if (tag instanceof cdo) {
            return (cdo)tag;
        }
        return null;
    }
    
    private final void C() {
        this.y();
        final MediaRouter mediaRouter = (MediaRouter)this.a;
        final int routeCount = mediaRouter.getRouteCount();
        final ArrayList list = new ArrayList(routeCount);
        final boolean b = false;
        for (int i = 0; i < routeCount; ++i) {
            list.add((Object)mediaRouter.getRouteAt(i));
        }
        final Iterator iterator = list.iterator();
        boolean b2 = b;
        while (iterator.hasNext()) {
            b2 |= this.D(iterator.next());
        }
        if (b2) {
            this.w();
        }
    }
    
    private final boolean D(Object o) {
        if (B(o) == null && this.n(o) < 0) {
            String format;
            if (this.r() == o) {
                format = "DEFAULT_ROUTE";
            }
            else {
                format = String.format(Locale.US, "ROUTE_%08x", this.s(o).hashCode());
            }
            String format2 = format;
            if (this.o(format) >= 0) {
                int n = 2;
                while (true) {
                    format2 = String.format(Locale.US, "%s_%d", format, n);
                    if (this.o(format2) < 0) {
                        break;
                    }
                    ++n;
                }
            }
            o = new cdn(o, format2);
            this.z((cdn)o);
            this.p.add(o);
            return true;
        }
        return false;
    }
    
    protected void A(final cdo cdo) {
        ((MediaRouter$UserRouteInfo)cdo.b).setName((CharSequence)cdo.a.d);
        ((MediaRouter$UserRouteInfo)cdo.b).setPlaybackType(cdo.a.k);
        ((MediaRouter$UserRouteInfo)cdo.b).setPlaybackStream(cdo.a.l);
        ((MediaRouter$UserRouteInfo)cdo.b).setVolume(cdo.a.n);
        ((MediaRouter$UserRouteInfo)cdo.b).setVolumeMax(cdo.a.o);
        ((MediaRouter$UserRouteInfo)cdo.b).setVolumeHandling(cdo.a.a());
    }
    
    public final void a(final Object o) {
        if (this.D(o)) {
            this.w();
        }
    }
    
    public final ccg b(final String s) {
        final int o = this.o(s);
        if (o >= 0) {
            return (ccg)new cdm(((cdn)this.p.get(o)).a);
        }
        return null;
    }
    
    public final void c(final Object o) {
        if (B(o) == null) {
            final int n = this.n(o);
            if (n >= 0) {
                this.z((cdn)this.p.get(n));
                this.w();
            }
        }
    }
    
    public final void d(final ccc ccc) {
        int m = 0;
        int i = 0;
        boolean b2;
        if (ccc != null) {
            final List b = ccc.a().b();
            final int size = b.size();
            m = 0;
            while (i < size) {
                final String s = b.get(i);
                if (s.equals("android.media.intent.category.LIVE_AUDIO")) {
                    m |= 0x1;
                }
                else if (s.equals("android.media.intent.category.LIVE_VIDEO")) {
                    m |= 0x2;
                }
                else {
                    m |= 0x800000;
                }
                ++i;
            }
            b2 = ccc.b();
        }
        else {
            b2 = false;
        }
        if (this.m == m && this.n == b2) {
            return;
        }
        this.m = m;
        this.n = b2;
        this.C();
    }
    
    public final void e(final Object o) {
        if (B(o) == null) {
            final int n = this.n(o);
            if (n >= 0) {
                this.p.remove(n);
                this.w();
            }
        }
    }
    
    public final void f(final Object o) {
        if (B(o) == null) {
            final int n = this.n(o);
            if (n >= 0) {
                final cdn cdn = this.p.get(n);
                final int e = ble.e(o);
                if (e != ((ccb)cdn.c).f()) {
                    final cca cca = new cca((ccb)cdn.c);
                    cca.k(e);
                    cdn.c = cca.a();
                    this.w();
                }
            }
        }
    }
    
    public final void g() {
    }
    
    public final void h(Object b) {
        if (b != blx.h(this.a)) {
            return;
        }
        final cdo b2 = B(b);
        if (b2 != null) {
            b2.a.g();
            return;
        }
        final int n = this.n(b);
        if (n >= 0) {
            final cdn cdn = this.p.get(n);
            final cds t = this.t;
            b = cdn.b;
            final cco cco = (cco)t;
            cco.j.removeMessages(262);
            final ccr b3 = cco.b((cch)cco.c);
            if (b3 != null) {
                final ccs b4 = b3.b((String)b);
                if (b4 != null) {
                    b4.g();
                }
            }
        }
    }
    
    public final void i() {
    }
    
    public final void j() {
    }
    
    public final void k(final Object o, final int n) {
        final cdo b = B(o);
        if (b != null) {
            b.a.e(n);
        }
    }
    
    public final void l(final Object o, final int n) {
        final cdo b = B(o);
        if (b != null) {
            b.a.f(n);
        }
    }
    
    protected void m(final cdn cdn, final cca cca) {
        final int supportedTypes = ((MediaRouter$RouteInfo)cdn.a).getSupportedTypes();
        if ((supportedTypes & 0x1) != 0x0) {
            cca.c((Collection)cdp.r);
        }
        if ((supportedTypes & 0x2) != 0x0) {
            cca.c((Collection)cdp.s);
        }
        cca.i(((MediaRouter$RouteInfo)cdn.a).getPlaybackType());
        ((Bundle)cca.a).putInt("playbackStream", ((MediaRouter$RouteInfo)cdn.a).getPlaybackStream());
        cca.k(ble.e(cdn.a));
        cca.m(((MediaRouter$RouteInfo)cdn.a).getVolumeMax());
        cca.l(((MediaRouter$RouteInfo)cdn.a).getVolumeHandling());
    }
    
    protected final int n(final Object o) {
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            if (((cdn)this.p.get(i)).a == o) {
                return i;
            }
        }
        return -1;
    }
    
    protected final int o(final String s) {
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            if (((String)((cdn)this.p.get(i)).b).equals(s)) {
                return i;
            }
        }
        return -1;
    }
    
    protected final int p(final ccs ccs) {
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            if (((cdo)this.q.get(i)).a == ccs) {
                return i;
            }
        }
        return -1;
    }
    
    protected Object q() {
        return new ccv((ccu)this);
    }
    
    protected Object r() {
        if (this.v == null) {
            this.v = new bkv((byte[])null);
        }
        throw null;
    }
    
    protected final String s(final Object o) {
        final CharSequence name = ((MediaRouter$RouteInfo)o).getName(((cch)this).e);
        String string;
        if (name != null) {
            string = name.toString();
        }
        else {
            string = "";
        }
        return string;
    }
    
    public final void t(final ccs ccs) {
        if (ccs.c() != this) {
            final MediaRouter$UserRouteInfo userRoute = ((MediaRouter)this.a).createUserRoute((MediaRouter$RouteCategory)this.d);
            final cdo tag = new cdo(ccs, (Object)userRoute);
            ((MediaRouter$RouteInfo)userRoute).setTag((Object)tag);
            userRoute.setVolumeCallback((MediaRouter$VolumeCallback)this.c);
            this.A(tag);
            this.q.add(tag);
            ((MediaRouter)this.a).addUserRoute(userRoute);
            return;
        }
        final int n = this.n(blx.h(this.a));
        if (n >= 0 && ((String)((cdn)this.p.get(n)).b).equals(ccs.b)) {
            ccs.g();
        }
    }
    
    public final void u(final ccs ccs) {
        if (ccs.c() != this) {
            final int p = this.p(ccs);
            if (p >= 0) {
                final cdo cdo = this.q.remove(p);
                ((MediaRouter$RouteInfo)cdo.b).setTag((Object)null);
                ((MediaRouter$UserRouteInfo)cdo.b).setVolumeCallback((MediaRouter$VolumeCallback)null);
                final Object a = this.a;
                final Object b = cdo.b;
                try {
                    ((MediaRouter)a).removeUserRoute((MediaRouter$UserRouteInfo)b);
                }
                catch (final IllegalArgumentException ex) {
                    Log.w("MediaRouterJellybean", "Failed to remove user route", (Throwable)ex);
                }
            }
        }
    }
    
    public final void v(final ccs ccs) {
        if (!ccs.m()) {
            return;
        }
        if (ccs.c() != this) {
            final int p = this.p(ccs);
            if (p >= 0) {
                this.x(((cdo)this.q.get(p)).b);
            }
        }
        else {
            final int o = this.o(ccs.b);
            if (o >= 0) {
                this.x(((cdn)this.p.get(o)).a);
            }
        }
    }
    
    protected final void w() {
        final toq toq = new toq((byte[])null, (byte[])null);
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            toq.c((ccb)((cdn)this.p.get(i)).c);
        }
        ((cch)this).le(toq.b());
    }
    
    protected void x(final Object o) {
        if (this.u == null) {
            this.u = new ble();
        }
        throw null;
    }
    
    protected void y() {
        if (this.o) {
            this.o = false;
            blx.g(this.a, this.b);
        }
        final int m = this.m;
        if (m != 0) {
            this.o = true;
            ((MediaRouter)this.a).addCallback(m, (MediaRouter$Callback)this.b);
        }
    }
    
    protected final void z(final cdn cdn) {
        final cca cca = new cca((String)cdn.b, this.s(cdn.a));
        this.m(cdn, cca);
        cdn.c = cca.a();
    }
}
