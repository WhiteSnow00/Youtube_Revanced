import java.util.List;
import java.util.Iterator;
import android.net.Uri;
import java.net.MalformedURLException;
import android.content.Context;
import java.util.concurrent.Executor;
import android.app.Activity;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eut implements aeah
{
    aexq a;
    final IBinder b;
    public final Activity c;
    public final eus d;
    public final vax e;
    boolean f;
    public boolean g;
    public aexq h;
    public aexq i;
    public final arud j;
    final aeby k;
    public final qcv l;
    private final wwv m;
    private final rnv n;
    private final rnu o;
    private final sgl p;
    private final Executor q;
    
    public eut(final Activity c, final qcv l, final eus d, final wwv m, final rnv n, final rnu o, final sgl p14, final vax e, final Executor q, final arud j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = c.getWindow().getDecorView().getWindowToken();
        this.k = new aeby(new aeac(adwd.N((Context)c.getApplication())));
        this.l = l;
        this.n = n;
        this.o = o;
        this.p = p14;
        this.d = d;
        this.m = m;
        this.e = e;
        this.q = q;
        this.j = j;
        final aewp a = aewp.a;
        this.a = a;
        this.h = a;
        this.i = a;
    }
    
    private final void c(final ahky rnm) {
        try {
            final Uri cg = tmy.cG(((ahky)rnm).c);
            try {
                final Uri l = this.o.l(cg, new znn[0]);
                try {
                    this.n.b(this.p, (ahky)rnm, l);
                }
                catch (final rwa rwa) {
                    qcv.B("[LastMileDeliveryPresenter] Failed to log the ping: ".concat(String.valueOf(rwa.getMessage())));
                }
            }
            catch (final rnm rnm) {
                qcv.B("[LastMileDeliveryPresenter] Failed to apply macro: ".concat(String.valueOf(rnm.getMessage())));
            }
        }
        catch (final MalformedURLException ex) {
            qcv.B("[LastMileDeliveryPresenter] Badly formed uri in ABR path: ".concat(String.valueOf(((ahky)rnm).c)));
        }
    }
    
    private final boolean d() {
        if (this.m == null) {
            qcv.B("[LastMileDeliveryPresenter] Interaction logger is null");
            return false;
        }
        if (this.i == null) {
            qcv.B("[LastMileDeliveryPresenter] Visual Element Container is null");
            return false;
        }
        return true;
    }
    
    public final void a() {
        adzx adzx;
        if (qcv.P(this.j)) {
            if (!this.h.h()) {
                qcv.A((sfh)null, "[LastMileDeliveryPresenter] Tried to dismiss overlay without a command containing an app id.");
                this.f = true;
                return;
            }
            adzx = adwd.Q((String)null, ((ahtg)this.h.c()).c);
        }
        else {
            if (!this.a.h()) {
                qcv.A((sfh)null, "[LastMileDeliveryPresenter] Tried to dismiss overlay without a session token, will retry when the session is active.");
                this.f = true;
                return;
            }
            adzx = adwd.Q((String)this.a.c(), (String)null);
        }
        final aeac aeac = (aeac)this.k.a;
        if (aeac.a == null) {
            aeac.c.k("error: %s", "Play Store not found.");
        }
        else {
            final nmo nmo = new nmo();
            aeac.a.f((aeau)new aeaa(aeac, nmo, adzx, (aeah)this, nmo, (byte[])null), nmo);
        }
        this.g = false;
    }
    
    @Override
    public final void b(final aeag aeag) {
        if (qcv.P(this.j)) {
            if (this.h.h() && (((ahtg)this.h.c()).b & 0x1) != 0x0 && this.f) {
                this.f = false;
                this.a();
            }
        }
        else {
            final String b = aeag.b;
            if (b != null) {
                this.a = aexq.j((Object)b);
                if (this.f) {
                    this.f = false;
                    this.a();
                }
            }
        }
        final int a = aeag.a;
        if (a != 8152) {
            if (a != 8153) {
                if (a != 8155) {
                    if (a != 8157) {
                        if (a != 8163) {
                            if (a != 8160 && a != 8161) {
                                return;
                            }
                        }
                        else {
                            if (qcv.O(this.j)) {
                                return;
                            }
                            if (qcv.N(this.j)) {
                                return;
                            }
                            if (this.h.h() && (((ahtg)this.h.c()).b & 0x800) != 0x0) {
                                this.q.execute(aesm.h((Runnable)new esi(this, 8)));
                                return;
                            }
                            qcv.A((sfh)null, "[LastMileDeliveryPresenter] LMD asked YT to show AlleyOop, but YT lacks a server-sent command");
                            return;
                        }
                    }
                    final StringBuilder sb = new StringBuilder("[LastMileDeliveryPresenter] Received LastMile Delivery Error with code: ");
                    sb.append(a);
                    qcv.A((sfh)null, sb.toString());
                    return;
                }
                final eus d = this.d;
                if (d.d(false)) {
                    d.b();
                    d.c();
                }
                if (this.h.h() && ((ahtg)this.h.c()).e.size() > 0) {
                    final Iterator<Object> iterator = ((List<Object>)((ahtg)this.h.c()).e).iterator();
                    while (iterator.hasNext()) {
                        this.c(iterator.next());
                    }
                }
                if (this.d()) {
                    this.m.o((wxz)this.i.c(), (alff)null);
                }
            }
            else {
                if (this.h.h() && ((ahtg)this.h.c()).g.size() > 0) {
                    final Iterator<Object> iterator2 = ((List<Object>)((ahtg)this.h.c()).g).iterator();
                    while (iterator2.hasNext()) {
                        this.c(iterator2.next());
                    }
                }
                if (qcv.N(this.j)) {
                    if (this.h.h() && (((ahtg)this.h.c()).b & 0x800) != 0x0) {
                        this.q.execute(aesm.h((Runnable)new esi(this, 9)));
                        this.a();
                        return;
                    }
                    qcv.A((sfh)null, "[LastMileDeliveryPresenter] LMD asked YT to show AlleyOop, but YT lacks a server-sent command");
                }
                else if (qcv.O(this.j)) {
                    if (this.h.h() && (((ahtg)this.h.c()).b & 0x800) != 0x0) {
                        this.q.execute(aesm.h((Runnable)new esi(this, 10)));
                        return;
                    }
                    qcv.A((sfh)null, "[LastMileDeliveryPresenter] LMD asked YT to show AlleyOop, but YT lacks a server-sent command");
                }
            }
        }
        else {
            final eus d2 = this.d;
            if (d2.d(false)) {
                d2.f = true;
            }
            if (this.h.h() && ((ahtg)this.h.c()).f.size() > 0) {
                final Iterator<Object> iterator3 = ((List<Object>)((ahtg)this.h.c()).f).iterator();
                while (iterator3.hasNext()) {
                    this.c(iterator3.next());
                }
            }
            if (this.d()) {
                this.m.t((wxz)this.i.c(), (alff)null);
            }
        }
    }
}
