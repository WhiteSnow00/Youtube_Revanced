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

class cdq extends cdu implements ccv, ccx
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
    private final cdt t;
    private blf u;
    private bkw v;
    
    static {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        (r = new ArrayList()).add(intentFilter);
        final IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        (s = new ArrayList()).add(intentFilter2);
    }
    
    public cdq(final Context context, final cdt t) {
        super(context);
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.t = t;
        final Object systemService = context.getSystemService("media_router");
        this.a = systemService;
        this.b = this.q();
        this.c = new ccy((ccx)this);
        this.d = ((MediaRouter)systemService).createRouteCategory((CharSequence)context.getResources().getString(2132018695), false);
        this.C();
    }
    
    protected static final cdp B(Object tag) {
        tag = ((MediaRouter$RouteInfo)tag).getTag();
        if (tag instanceof cdp) {
            return (cdp)tag;
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
            o = new cdo(o, format2);
            this.z((cdo)o);
            this.p.add(o);
            return true;
        }
        return false;
    }
    
    protected void A(final cdp cdp) {
        ((MediaRouter$UserRouteInfo)cdp.b).setName((CharSequence)cdp.a.d);
        ((MediaRouter$UserRouteInfo)cdp.b).setPlaybackType(cdp.a.k);
        ((MediaRouter$UserRouteInfo)cdp.b).setPlaybackStream(cdp.a.l);
        ((MediaRouter$UserRouteInfo)cdp.b).setVolume(cdp.a.n);
        ((MediaRouter$UserRouteInfo)cdp.b).setVolumeMax(cdp.a.o);
        ((MediaRouter$UserRouteInfo)cdp.b).setVolumeHandling(cdp.a.a());
    }
    
    public final void a(final Object o) {
        if (this.D(o)) {
            this.w();
        }
    }
    
    public final cch b(final String s) {
        final int o = this.o(s);
        if (o >= 0) {
            return (cch)new cdn(((cdo)this.p.get(o)).a);
        }
        return null;
    }
    
    public final void c(final Object o) {
        if (B(o) == null) {
            final int n = this.n(o);
            if (n >= 0) {
                this.z((cdo)this.p.get(n));
                this.w();
            }
        }
    }
    
    public final void d(final ccd ccd) {
        int m = 0;
        int i = 0;
        boolean b2;
        if (ccd != null) {
            final List b = ccd.a().b();
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
            b2 = ccd.b();
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
                final cdo cdo = this.p.get(n);
                final int e = blf.e(o);
                if (e != ((ccc)cdo.c).f()) {
                    final ccb ccb = new ccb((ccc)cdo.c);
                    ccb.k(e);
                    cdo.c = ccb.a();
                    this.w();
                }
            }
        }
    }
    
    public final void g() {
    }
    
    public final void h(Object b) {
        if (b != bly.h(this.a)) {
            return;
        }
        final cdp b2 = B(b);
        if (b2 != null) {
            b2.a.g();
            return;
        }
        final int n = this.n(b);
        if (n >= 0) {
            final cdo cdo = this.p.get(n);
            final cdt t = this.t;
            b = cdo.b;
            final ccp ccp = (ccp)t;
            ccp.j.removeMessages(262);
            final ccs b3 = ccp.b((cci)ccp.c);
            if (b3 != null) {
                final cct b4 = b3.b((String)b);
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
        final cdp b = B(o);
        if (b != null) {
            b.a.e(n);
        }
    }
    
    public final void l(final Object o, final int n) {
        final cdp b = B(o);
        if (b != null) {
            b.a.f(n);
        }
    }
    
    protected void m(final cdo cdo, final ccb ccb) {
        final int supportedTypes = ((MediaRouter$RouteInfo)cdo.a).getSupportedTypes();
        if ((supportedTypes & 0x1) != 0x0) {
            ccb.c((Collection)cdq.r);
        }
        if ((supportedTypes & 0x2) != 0x0) {
            ccb.c((Collection)cdq.s);
        }
        ccb.i(((MediaRouter$RouteInfo)cdo.a).getPlaybackType());
        ((Bundle)ccb.a).putInt("playbackStream", ((MediaRouter$RouteInfo)cdo.a).getPlaybackStream());
        ccb.k(blf.e(cdo.a));
        ccb.m(((MediaRouter$RouteInfo)cdo.a).getVolumeMax());
        ccb.l(((MediaRouter$RouteInfo)cdo.a).getVolumeHandling());
    }
    
    protected final int n(final Object o) {
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            if (((cdo)this.p.get(i)).a == o) {
                return i;
            }
        }
        return -1;
    }
    
    protected final int o(final String s) {
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            if (((String)((cdo)this.p.get(i)).b).equals(s)) {
                return i;
            }
        }
        return -1;
    }
    
    protected final int p(final cct cct) {
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            if (((cdp)this.q.get(i)).a == cct) {
                return i;
            }
        }
        return -1;
    }
    
    protected Object q() {
        return new ccw((ccv)this);
    }
    
    protected Object r() {
        if (this.v == null) {
            this.v = new bkw(null);
        }
        throw null;
    }
    
    protected final String s(final Object o) {
        final CharSequence name = ((MediaRouter$RouteInfo)o).getName(((cci)this).e);
        String string;
        if (name != null) {
            string = name.toString();
        }
        else {
            string = "";
        }
        return string;
    }
    
    public final void t(final cct cct) {
        if (cct.c() != this) {
            final MediaRouter$UserRouteInfo userRoute = ((MediaRouter)this.a).createUserRoute((MediaRouter$RouteCategory)this.d);
            final cdp tag = new cdp(cct, (Object)userRoute);
            ((MediaRouter$RouteInfo)userRoute).setTag((Object)tag);
            userRoute.setVolumeCallback((MediaRouter$VolumeCallback)this.c);
            this.A(tag);
            this.q.add(tag);
            ((MediaRouter)this.a).addUserRoute(userRoute);
            return;
        }
        final int n = this.n(bly.h(this.a));
        if (n >= 0 && ((String)((cdo)this.p.get(n)).b).equals(cct.b)) {
            cct.g();
        }
    }
    
    public final void u(final cct cct) {
        if (cct.c() != this) {
            final int p = this.p(cct);
            if (p >= 0) {
                final cdp cdp = this.q.remove(p);
                ((MediaRouter$RouteInfo)cdp.b).setTag((Object)null);
                ((MediaRouter$UserRouteInfo)cdp.b).setVolumeCallback((MediaRouter$VolumeCallback)null);
                final Object a = this.a;
                final Object b = cdp.b;
                try {
                    ((MediaRouter)a).removeUserRoute((MediaRouter$UserRouteInfo)b);
                }
                catch (final IllegalArgumentException ex) {
                    Log.w("MediaRouterJellybean", "Failed to remove user route", (Throwable)ex);
                }
            }
        }
    }
    
    public final void v(final cct cct) {
        if (!cct.m()) {
            return;
        }
        if (cct.c() != this) {
            final int p = this.p(cct);
            if (p >= 0) {
                this.x(((cdp)this.q.get(p)).b);
            }
        }
        else {
            final int o = this.o(cct.b);
            if (o >= 0) {
                this.x(((cdo)this.p.get(o)).a);
            }
        }
    }
    
    protected final void w() {
        final tqv tqv = new tqv((byte[])null, (byte[])null);
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            tqv.c((ccc)((cdo)this.p.get(i)).c);
        }
        ((cci)this).le(tqv.b());
    }
    
    protected void x(final Object o) {
        if (this.u == null) {
            this.u = new blf();
        }
        throw null;
    }
    
    protected void y() {
        if (this.o) {
            this.o = false;
            bly.g(this.a, this.b);
        }
        final int m = this.m;
        if (m != 0) {
            this.o = true;
            ((MediaRouter)this.a).addCallback(m, (MediaRouter$Callback)this.b);
        }
    }
    
    protected final void z(final cdo cdo) {
        final ccb ccb = new ccb((String)cdo.b, this.s(cdo.a));
        this.m(cdo, ccb);
        cdo.c = ccb.a();
    }
}
