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

public final class cqf implements cpc, cnh
{
    public static final String a;
    public final cof b;
    public final Object c;
    cqw d;
    final Map e;
    public final Map f;
    public final Set g;
    public final cpd h;
    public cqe i;
    public final ajb j;
    private final Context k;
    
    static {
        a = cms.b("SystemFgDispatcher");
    }
    
    public cqf(final Context k) {
        this.k = k;
        this.c = new Object();
        final cof j = cof.j(k);
        this.b = j;
        this.j = j.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = new cpe(j.j, this, null);
        j.f.b((cnh)this);
    }
    
    public static Intent b(final Context context, final cqw cqw, final cmk cmk) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", cmk.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cmk.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)cmk.c);
        intent.putExtra("KEY_WORKSPEC_ID", cqw.a);
        intent.putExtra("KEY_GENERATION", cqw.b);
        return intent;
    }
    
    public static Intent c(final Context context, final cqw cqw, final cmk cmk) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", cqw.a);
        intent.putExtra("KEY_GENERATION", cqw.b);
        intent.putExtra("KEY_NOTIFICATION_ID", cmk.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cmk.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)cmk.c);
        return intent;
    }
    
    public static Intent d(final Context context) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }
    
    public final void a(final cqw cqw, final boolean b) {
        Object o = this.c;
        monitorenter(o);
        try {
            final crh crh = this.f.remove(cqw);
            if (crh != null && this.g.remove(crh)) {
                this.h.a(this.g);
            }
            monitorexit(o);
            final cmk cmk = this.e.remove(cqw);
            if (cqw.equals((Object)this.d) && this.e.size() > 0) {
                final Iterator iterator = this.e.entrySet().iterator();
                o = iterator.next();
                while (iterator.hasNext()) {
                    o = iterator.next();
                }
                this.d = ((Map.Entry<cqw, cmk>)o).getKey();
                if (this.i != null) {
                    o = ((Map.Entry<cqw, cmk>)o).getValue();
                    this.i.c(((cmk)o).a, ((cmk)o).b, ((cmk)o).c);
                    this.i.a(((cmk)o).a);
                }
            }
            o = this.i;
            if (cmk != null && o != null) {
                cms.a();
                final StringBuilder sb = new StringBuilder("Removing Notification (id: ");
                sb.append(cmk.a);
                sb.append(", workSpecId: ");
                sb.append(cqw);
                final int b2 = cmk.b;
                ((cqe)o).a(cmk.a);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void e(final List list) {
    }
    
    @Override
    public final void f(final List list) {
        if (!list.isEmpty()) {
            for (final crh crh : list) {
                final String c = crh.c;
                cms.a();
                final cof b = this.b;
                csl.b(b.k, (Runnable)new css(b, new avu(chu.j(crh)), true, (byte[])null, (byte[])null));
            }
        }
    }
    
    public final void g(final Intent intent) {
        int n = 0;
        final int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        final int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        final cqw d = new cqw(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        final Notification notification = (Notification)intent.getParcelableExtra("KEY_NOTIFICATION");
        cms.a();
        if (notification != null && this.i != null) {
            this.e.put(d, new cmk(intExtra, notification, intExtra2));
            if (this.d == null) {
                this.d = d;
                this.i.c(intExtra, intExtra2, notification);
                return;
            }
            this.i.b(intExtra, notification);
            if (intExtra2 != 0 && Build$VERSION.SDK_INT >= 29) {
                final Iterator iterator = this.e.entrySet().iterator();
                while (iterator.hasNext()) {
                    n |= ((Map.Entry<K, cmk>)iterator.next()).getValue().b;
                }
                final cmk cmk = this.e.get(this.d);
                if (cmk != null) {
                    this.i.c(cmk.a, n, cmk.c);
                }
            }
        }
    }
    
    public final void h() {
        this.i = null;
        synchronized (this.c) {
            this.h.b();
            monitorexit(this.c);
            this.b.f.c((cnh)this);
        }
    }
}
