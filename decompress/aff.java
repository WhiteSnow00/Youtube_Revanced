import android.os.AsyncTask;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

// 
// Decompiled by Procyon v0.6.0
// 

final class aff extends JobServiceEngine
{
    final afg a;
    final Object b;
    JobParameters c;
    
    public aff(final afg a) {
        super((Service)a);
        this.b = new Object();
        this.a = a;
    }
    
    public final boolean onStartJob(final JobParameters c) {
        this.c = c;
        final afg a = this.a;
        if (a.c == null) {
            (a.c = new afd(a)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
        return true;
    }
    
    public final boolean onStopJob(final JobParameters jobParameters) {
        final afd c = this.a.c;
        if (c != null) {
            c.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
            return true;
        }
    }
}
