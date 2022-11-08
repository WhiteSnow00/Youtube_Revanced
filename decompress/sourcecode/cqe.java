import android.os.Build$VERSION;
import android.app.Notification;
import java.util.List;
import java.util.Iterator;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import android.content.Intent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import android.content.Context;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqe implements cpb, cng
{
    public static final String a;
    public final coe b;
    public final Object c;
    cqv d;
    final Map e;
    public final Map f;
    public final Set g;
    public final cpc h;
    public cqd i;
    public final aja j;
    private final Context k;
    
    static {
        a = cmr.b("SystemFgDispatcher");
    }
    
    public cqe(final Context k) {
        this.k = k;
        this.c = new Object();
        final coe j = coe.j(k);
        this.b = j;
        this.j = j.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = (cpc)new cpd(j.j, (cpb)this, null);
        j.f.b((cng)this);
    }
    
    public static Intent b(final Context context, final cqv cqv, final cmj cmj) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", cmj.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cmj.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)cmj.c);
        intent.putExtra("KEY_WORKSPEC_ID", cqv.a);
        intent.putExtra("KEY_GENERATION", cqv.b);
        return intent;
    }
    
    public static Intent c(final Context context, final cqv cqv, final cmj cmj) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", cqv.a);
        intent.putExtra("KEY_GENERATION", cqv.b);
        intent.putExtra("KEY_NOTIFICATION_ID", cmj.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cmj.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)cmj.c);
        return intent;
    }
    
    public static Intent d(final Context context) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }
    
    public final void a(final cqv cqv, final boolean b) {
        Object c = this.c;
        monitorenter(c);
        try {
            final crg crg = this.f.remove(cqv);
            if (crg != null && this.g.remove(crg)) {
                this.h.a((Iterable)this.g);
            }
            monitorexit(c);
            final cmj cmj = this.e.remove(cqv);
            if (cqv.equals((Object)this.d) && this.e.size() > 0) {
                final Iterator iterator = this.e.entrySet().iterator();
                c = iterator.next();
                while (iterator.hasNext()) {
                    c = iterator.next();
                }
                this.d = ((Map.Entry<cqv, cmj>)c).getKey();
                if (this.i != null) {
                    c = ((Map.Entry<cqv, cmj>)c).getValue();
                    this.i.c(((cmj)c).a, ((cmj)c).b, ((cmj)c).c);
                    this.i.a(((cmj)c).a);
                }
            }
            final cqd i = this.i;
            if (cmj != null && i != null) {
                cmr.a();
                c = new StringBuilder("Removing Notification (id: ");
                ((StringBuilder)c).append(cmj.a);
                ((StringBuilder)c).append(", workSpecId: ");
                ((StringBuilder)c).append(cqv);
                final int b2 = cmj.b;
                i.a(cmj.a);
            }
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final void e(final List list) {
    }
    
    public final void f(final List list) {
        if (!list.isEmpty()) {
            for (final crg crg : list) {
                final String c = crg.c;
                cmr.a();
                final coe b = this.b;
                csk.b(b.k, (Runnable)new csr(b, new avt(cht.j(crg)), true, (byte[])null, (byte[])null));
            }
        }
    }
    
    public final void g(final Intent intent) {
        int n = 0;
        final int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        final int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        final cqv d = new cqv(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        final Notification notification = (Notification)intent.getParcelableExtra("KEY_NOTIFICATION");
        cmr.a();
        if (notification != null && this.i != null) {
            this.e.put(d, new cmj(intExtra, notification, intExtra2));
            if (this.d == null) {
                this.d = d;
                this.i.c(intExtra, intExtra2, notification);
                return;
            }
            this.i.b(intExtra, notification);
            if (intExtra2 != 0 && Build$VERSION.SDK_INT >= 29) {
                final Iterator iterator = this.e.entrySet().iterator();
                while (iterator.hasNext()) {
                    n |= ((Map.Entry<K, cmj>)iterator.next()).getValue().b;
                }
                final cmj cmj = this.e.get(this.d);
                if (cmj != null) {
                    this.i.c(cmj.a, n, cmj.c);
                }
            }
        }
    }
    
    public final void h() {
        this.i = null;
        synchronized (this.c) {
            this.h.b();
            monitorexit(this.c);
            this.b.f.c((cng)this);
        }
    }
}
