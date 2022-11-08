import java.util.Iterator;
import android.util.Log;
import androidx.work.WorkerParameters;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmi extends cnd
{
    private static final String b;
    public final List a;
    
    static {
        b = cmr.b("DelegatingWkrFctry");
    }
    
    public cmi() {
        this.a = new CopyOnWriteArrayList();
    }
    
    public final cmq a(final Context context, String string, WorkerParameters workerParameters) {
        for (final cnd cnd : this.a) {
            try {
                final cmq a = cnd.a(context, string, workerParameters);
                if (a != null) {
                    return a;
                }
                continue;
            }
            finally {
                workerParameters = (WorkerParameters)new StringBuilder("Unable to instantiate a ListenableWorker (");
                ((StringBuilder)workerParameters).append(string);
                ((StringBuilder)workerParameters).append(")");
                string = ((StringBuilder)workerParameters).toString();
                cmr.a();
                Log.e(cmi.b, string, (Throwable)context);
            }
            break;
        }
        return null;
    }
}
