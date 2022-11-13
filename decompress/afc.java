import android.app.job.JobWorkItem;
import android.app.job.JobParameters;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class afc extends AsyncTask
{
    final aff a;
    
    public afc(final aff a) {
        this.a = a;
    }
    
    protected final /* bridge */ Object doInBackground(Object[] b) {
        final Void[] array = (Void[])b;
        while (true) {
            final afe d = this.a.d;
            d.getClass();
            b = (Object[])d.b;
            monitorenter(b);
            try {
                final JobParameters c = d.c;
                Label_0076: {
                    if (c == null) {
                        monitorexit(b);
                    }
                    else {
                        final JobWorkItem dequeueWork = c.dequeueWork();
                        monitorexit(b);
                        if (dequeueWork != null) {
                            dequeueWork.getIntent().setExtrasClassLoader(d.a.getClassLoader());
                            b = (Object[])(Object)new afd(d, dequeueWork);
                            break Label_0076;
                        }
                    }
                    b = null;
                }
                if (b != null) {
                    final aff a = this.a;
                    ((afd)b).a.getIntent();
                    a.b();
                    synchronized (((afd)b).b.b) {
                        final JobParameters c2 = ((afd)b).b.c;
                        if (c2 == null) {
                            continue;
                        }
                        c2.completeWork(((afd)b).a);
                        continue;
                    }
                }
                return null;
            }
            finally {
                monitorexit(b);
                while (true) {}
            }
        }
    }
    
    protected final /* bridge */ void onCancelled(final Object o) {
        final Void void1 = (Void)o;
    }
    
    protected final /* bridge */ void onPostExecute(final Object o) {
        final Void void1 = (Void)o;
    }
}
