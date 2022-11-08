// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemjob;

import android.os.Build$VERSION;
import java.util.Arrays;
import android.util.Log;
import android.app.Application;
import android.os.PersistableBundle;
import android.app.job.JobParameters;
import java.util.HashMap;
import java.util.Map;
import android.app.job.JobService;

public class SystemJobService extends JobService implements cng
{
    private static final String a;
    private coe b;
    private final Map c;
    private final dmk d;
    
    static {
        a = cmr.b("SystemJobService");
    }
    
    public SystemJobService() {
        this.c = new HashMap();
        this.d = new dmk((char[])null);
    }
    
    private static cqv b(final JobParameters jobParameters) {
        try {
            final PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new cqv(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        }
        catch (final NullPointerException ex) {
            return null;
        }
    }
    
    public final void a(final cqv cqv, final boolean b) {
        cmr.a();
        synchronized (this.c) {
            final JobParameters jobParameters = this.c.remove(cqv);
            monitorexit(this.c);
            this.d.U(cqv);
            if (jobParameters != null) {
                this.jobFinished(jobParameters, b);
            }
        }
    }
    
    public final void onCreate() {
        super.onCreate();
        try {
            final coe j = coe.j(this.getApplicationContext());
            this.b = j;
            j.f.b((cng)this);
        }
        catch (final IllegalStateException ex) {
            if (Application.class.equals(this.getApplication().getClass())) {
                cmr.a();
                Log.w(SystemJobService.a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final coe b = this.b;
        if (b != null) {
            b.f.c((cng)this);
        }
    }
    
    public final boolean onStartJob(final JobParameters jobParameters) {
        if (this.b == null) {
            cmr.a();
            this.jobFinished(jobParameters, true);
            return false;
        }
        final cqv b = b(jobParameters);
        if (b == null) {
            cmr.a();
            Log.e(SystemJobService.a, "WorkSpec id not found!");
            return false;
        }
        Object c = this.c;
        synchronized (c) {
            if (this.c.containsKey(b)) {
                cmr.a();
                new StringBuilder("Job is already being executed by SystemJobService: ").append(b);
                return false;
            }
            cmr.a();
            new StringBuilder("onStartJob for ").append(b);
            this.c.put(b, jobParameters);
            monitorexit(c);
            c = new chs((byte[])null);
            if (cox.a(jobParameters) != null) {
                Arrays.asList(cox.a(jobParameters));
            }
            if (cox.b(jobParameters) != null) {
                Arrays.asList(cox.b(jobParameters));
            }
            if (Build$VERSION.SDK_INT >= 28) {
                coy.a(jobParameters);
            }
            this.b.o(this.d.V(b), (chs)c);
            return true;
        }
    }
    
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.b == null) {
            cmr.a();
            return true;
        }
        final cqv b = b(jobParameters);
        if (b == null) {
            cmr.a();
            Log.e(SystemJobService.a, "WorkSpec id not found!");
            return false;
        }
        cmr.a();
        new StringBuilder("onStopJob for ").append(b);
        b.toString();
        jobParameters = (JobParameters)this.c;
        synchronized (jobParameters) {
            this.c.remove(b);
            monitorexit(jobParameters);
            jobParameters = (JobParameters)this.d.U(b);
            if (jobParameters != null) {
                this.b.p((avt)jobParameters);
            }
            jobParameters = (JobParameters)this.b.f;
            final String a = b.a;
            synchronized (((cns)jobParameters).i) {
                final boolean contains = ((cns)jobParameters).h.contains(a);
                monitorexit(((cns)jobParameters).i);
                return !contains;
            }
        }
    }
}
