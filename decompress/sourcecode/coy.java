import android.app.Service;
import android.app.Application;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Context;
import android.net.Network;
import android.app.job.JobParameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coy
{
    public static Network a(final JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
    
    public static Context b(Context baseContext) {
        while (baseContext instanceof ContextWrapper && !(baseContext instanceof Activity) && !(baseContext instanceof Application) && !(baseContext instanceof Service)) {
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return baseContext;
    }
    
    public static int c(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n != 1) {
            return 3;
        }
        return 2;
    }
    
    public static void d(final int n, final String s, final String s2) {
        efu.a().a(c(n), s, s2);
    }
}
