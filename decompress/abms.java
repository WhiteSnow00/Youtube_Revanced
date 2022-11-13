import java.util.Iterator;
import android.app.ForegroundServiceStartNotAllowedException;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.util.List;
import android.app.Notification;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abms
{
    private final atke a;
    private final atke b;
    private Service c;
    private Notification d;
    private boolean e;
    private final List f;
    private final vaf g;
    private final aulc h;
    
    public abms(final atke b, final vaf g, final aulc h, final atke a, final byte[] array) {
        b.getClass();
        this.b = b;
        g.getClass();
        this.g = g;
        a.getClass();
        this.a = a;
        this.h = h;
        this.f = new ArrayList();
    }
    
    private final void i(final boolean b) {
        monitorenter(this);
        if (b) {
            try {
                if (this.c == null && this.f.isEmpty()) {
                    final abux abux = (abux)this.a.a();
                    final eg d = abux.d;
                    if (d != null) {
                        if (d.k()) {
                            abux.e(true);
                        }
                        d.i(new ej().a());
                        abux.b(d);
                        d.d();
                        abux.d = null;
                        abjf.a(abje.a, "MediaSession released", new Object[0]);
                        return;
                    }
                }
            }
            finally {
                monitorexit(this);
            }
        }
        monitorexit(this);
    }
    
    private static boolean j(final Service service, final Notification notification) {
        if (notification == null) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= 31) {
            try {
                service.startForeground(2, notification);
                return true;
            }
            catch (final ForegroundServiceStartNotAllowedException ex) {
                ttr.l("Failed to foreground Service due to Android S+ restrictions");
                return false;
            }
        }
        service.startForeground(2, notification);
        return true;
    }
    
    private final boolean k() {
        if (this.e) {
            final int a = this.h.a;
            if (a != 2) {
                if (a != 3) {
                    return false;
                }
            }
            if (this.d != null) {
                return true;
            }
        }
        return false;
    }
    
    public final void a() {
        monitorenter(this);
        try {
            final Service c = this.c;
            if (c != null) {
                c.stopForeground(true);
            }
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ((Service)iterator.next()).stopForeground(true);
            }
            this.e = false;
            this.h.g();
            ((agm)this.b.a()).c(2);
            this.d = null;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final boolean b) {
        synchronized (this) {
            this.c(b);
        }
    }
    
    public final void c(final boolean b) {
        synchronized (this) {
            this.i(b);
        }
    }
    
    public final void d(final Service service) {
        synchronized (this) {
            if (!this.f.contains(service) && this.k()) {
                j(service, this.d);
            }
            this.f.add(service);
        }
    }
    
    public final void e(final Service service) {
        synchronized (this) {
            this.f.remove(service);
        }
    }
    
    public final void f(final Service c) {
        synchronized (this) {
            if (this.c != c && this.k() && c != null) {
                j(c, this.d);
            }
            this.c = c;
        }
    }
    
    public final void g(final Notification d, final boolean b) {
        monitorenter(this);
        try {
            this.d = d;
            if (!b) {
                amie amie;
                if ((amie = this.g.b().i) == null) {
                    amie = amie.a;
                }
                ahty ahty;
                if ((ahty = amie.y) == null) {
                    ahty = ahty.a;
                }
                if (!ahty.b) {
                    ((agm)this.b.a()).e(2, d);
                    this.h();
                    monitorexit(this);
                    return;
                }
            }
            final Service c = this.c;
            boolean j = c != null && j(c, d);
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                j = j((Service)iterator.next(), d);
            }
            if (!j) {
                ((agm)this.b.a()).e(2, d);
            }
            this.e = true;
            this.h.h();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void h() {
        monitorenter(this);
        try {
            final Service c = this.c;
            if (c != null) {
                c.stopForeground(false);
            }
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ((Service)iterator.next()).stopForeground(false);
            }
            this.e = false;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
