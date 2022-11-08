import android.app.PendingIntent;
import android.app.AlarmManager;
import java.util.concurrent.Callable;
import androidx.work.impl.WorkDatabase;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class com
{
    static {
        cmr.b("Alarms");
    }
    
    public static void a(Context d, final WorkDatabase workDatabase, cqv cqv) {
        final cqq t = workDatabase.t();
        final cqp b = col.b(t, cqv);
        if (b != null) {
            c(d, cqv, b.c);
            cmr.a();
            new StringBuilder("Removing SystemIdInfo for workSpecId (").append(cqv);
            final String a = cqv.a;
            final int b2 = cqv.b;
            cqv = (cqv)t;
            ((cqu)cqv).a.j();
            d = (Context)((cqu)cqv).b.d();
            ((cha)d).g(1, a);
            ((cha)d).e(2, b2);
            ((cqu)cqv).a.k();
            try {
                ((chb)d).b();
                ((cqu)t).a.n();
            }
            finally {
                ((cqu)cqv).a.l();
                ((cqu)cqv).b.f((chb)d);
            }
        }
    }
    
    public static void b(final Context context, final WorkDatabase workDatabase, final cqv cqv, final long n) {
        final cqq t = workDatabase.t();
        final cqp b = col.b(t, cqv);
        if (b != null) {
            c(context, cqv, b.c);
            d(context, cqv, b.c, n);
            return;
        }
        final avt avt = new avt(workDatabase, (byte[])null);
        final Object d = ((cfs)avt.a).d((Callable)new csh(avt, 0, (byte[])null, (byte[])null));
        d.getClass();
        final int intValue = ((Number)d).intValue();
        t.a(cox.c(cqv, intValue));
        d(context, cqv, intValue, n);
    }
    
    private static void c(final Context context, final cqv cqv, final int n) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final PendingIntent service = PendingIntent.getService(context, n, con.c(context, cqv), 603979776);
        if (service != null && alarmManager != null) {
            cmr.a();
            new StringBuilder("Cancelling existing alarm with (workSpecId, systemId) (").append(cqv);
            alarmManager.cancel(service);
        }
    }
    
    private static void d(final Context context, final cqv cqv, final int n, final long n2) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final PendingIntent service = PendingIntent.getService(context, n, con.c(context, cqv), 201326592);
        if (alarmManager != null) {
            col.a(alarmManager, 0, n2, service);
        }
    }
}
