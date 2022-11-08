import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cof extends cfy
{
    private final Context c;
    
    public cof(final Context c) {
        super(9, 10);
        this.c = c;
    }
    
    public final void a(final cgl cgl) {
        cgl.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        final SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        Label_0151: {
            if (!sharedPreferences.contains("reschedule_needed") && !sharedPreferences.contains("last_cancel_all_time_ms")) {
                break Label_0151;
            }
            long n = 0L;
            final long long1 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                n = 1L;
            }
            cgl.d();
            try {
                cgl.l(new Object[] { "last_cancel_all_time_ms", long1 });
                cgl.l(new Object[] { "reschedule_needed", n });
                sharedPreferences.edit().clear().apply();
                cgl.h();
                cgl.f();
                final SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
                if (!sharedPreferences2.contains("next_job_scheduler_id") && !sharedPreferences2.contains("next_job_scheduler_id")) {
                    return;
                }
                final int int1 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                final int int2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                cgl.d();
                try {
                    cgl.l(new Object[] { "next_job_scheduler_id", int1 });
                    cgl.l(new Object[] { "next_alarm_manager_id", int2 });
                    sharedPreferences2.edit().clear().apply();
                    cgl.h();
                }
                finally {
                    cgl.f();
                }
            }
            finally {
                cgl.f();
            }
        }
    }
}
