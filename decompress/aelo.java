import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import android.os.Process;
import android.os.IBinder;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public class aelo extends Service
{
    private ListenableFuture a;
    private int b;
    
    public aelo() {
        this.a = afwm.m((Object)null);
        this.b = -1;
    }
    
    protected final void dump(final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final Iterator iterator = ((aeln)aqsy.k(this.getApplicationContext(), aeln.class)).bz().e.entrySet().iterator();
        while (iterator.hasNext()) {
            printWriter.println(((Map.Entry<K, String>)iterator.next()).getValue());
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public final void onDestroy() {
        if (!this.a.isDone()) {
            final aelr bz = ((aeln)aqsy.k(this.getApplicationContext(), aeln.class)).bz();
            final int b = this.b;
            final int a = aelr.a(bz.c.get());
            if (b == a) {
                long value;
                int a2;
                do {
                    value = bz.c.get();
                    a2 = aelr.a(value);
                    if (a2 != a) {
                        break;
                    }
                } while (!bz.c.compareAndSet(value, aelr.a(a2 + 1)));
            }
        }
    }
    
    public final int onStartCommand(final Intent intent, int intExtra, final int n) {
        if ((intExtra & 0x2) == 0x0 && intent != null) {
            final aelr bz = ((aeln)aqsy.k(this.getApplicationContext(), aeln.class)).bz();
            adkp.M(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            adkp.M(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            adkp.M(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            final long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            final long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            Object m = null;
            Label_0245: {
                if (bz.h.getMostSignificantBits() == longExtra) {
                    if (bz.h.getLeastSignificantBits() == longExtra2) {
                        intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                        synchronized (bz.d) {
                            m = bz.f.get(intExtra);
                            ((SettableFuture)m).getClass();
                            if (m != aelr.b) {
                                bz.g.put(intExtra, m);
                            }
                            bz.f.remove(intExtra);
                            break Label_0245;
                        }
                    }
                }
                ((afki)((afki)((afkg)aelr.a).h()).j("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java")).u("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                m = afwm.m((Object)null);
            }
            this.a = (ListenableFuture)m;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.addListener((Runnable)new aasq(this, n, 10), (Executor)afum.a);
        return 2;
    }
}
