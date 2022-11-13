import androidx.work.impl.background.systemalarm.SystemAlarmService;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coo implements cnh
{
    public static final String a;
    public final Context b;
    public final Map c;
    public final Object d;
    public final dml e;
    
    static {
        a = cms.b("CommandHandler");
    }
    
    public coo(final Context b, final dml e, final byte[] array) {
        this.b = b;
        this.e = e;
        this.c = new HashMap();
        this.d = new Object();
    }
    
    static Intent b(final Context context) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }
    
    static Intent c(final Context context, final cqw cqw) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        h(intent, cqw);
        return intent;
    }
    
    static Intent d(final Context context, final cqw cqw, final boolean b) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", b);
        h(intent, cqw);
        return intent;
    }
    
    public static Intent e(final Context context, final cqw cqw) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        h(intent, cqw);
        return intent;
    }
    
    public static Intent f(final Context context, final cqw cqw) {
        final Intent intent = new Intent(context, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        h(intent, cqw);
        return intent;
    }
    
    static cqw g(final Intent intent) {
        return new cqw(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }
    
    private static void h(final Intent intent, final cqw cqw) {
        intent.putExtra("KEY_WORKSPEC_ID", cqw.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", cqw.b);
    }
    
    public final void a(final cqw cqw, final boolean b) {
        synchronized (this.d) {
            final cor cor = this.c.remove(cqw);
            this.e.U(cqw);
            if (cor != null) {
                cms.a();
                new StringBuilder("onExecuted ").append(cor.c);
                cor.a();
                if (b) {
                    cor.h.execute(new cot(cor.d, e(cor.a, cor.c), cor.b));
                }
                if (cor.j) {
                    cor.h.execute(new cot(cor.d, b(cor.a), cor.b));
                }
            }
        }
    }
}
