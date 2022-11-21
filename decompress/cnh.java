import android.util.Log;
import androidx.work.WorkerParameters;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cnh
{
    private static final String a;
    
    static {
        a = cmv.b("WorkerFactory");
    }
    
    public static cnh c() {
        return (cnh)new cng();
    }
    
    public abstract cmu a(final Context p0, final String p1, final WorkerParameters p2);
    
    public final cmu b(final Context context, final String s, final WorkerParameters workerParameters) {
        cmu a;
        final cmu cmu = a = this.a(context, s, workerParameters);
        if (cmu == null) {
            Class clazz = null;
            try {
                Class.forName(s).asSubclass(cmu.class);
            }
            finally {
                final String value = String.valueOf(s);
                cmv.a();
                final Throwable t;
                Log.e(cnh.a, "Invalid class: ".concat(value), t);
                clazz = null;
            }
            a = cmu;
            if (clazz != null) {
                try {
                    final cmu cmu2 = (cmu)clazz.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                }
                finally {
                    final String value2 = String.valueOf(s);
                    cmv.a();
                    final Throwable t2;
                    Log.e(cnh.a, "Could not instantiate ".concat(value2), t2);
                    a = cmu;
                }
            }
        }
        if (a != null && a.f) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder("WorkerFactory (");
            sb.append(name);
            sb.append(") returned an instance of a ListenableWorker (");
            sb.append(s);
            sb.append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            throw new IllegalStateException(sb.toString());
        }
        return a;
    }
}
