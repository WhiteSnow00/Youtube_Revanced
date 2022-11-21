import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.Collection;
import java.util.ArrayList;
import org.chromium.base.ApplicationStatus;
import org.chromium.net.impl.CronetLibraryLoader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewl implements Runnable
{
    public static final aewl a;
    public static final aewl b;
    public static final aewl c;
    private final int d;
    
    static {
        c = new aewl(6);
        b = new aewl(1);
        a = new aewl(0);
    }
    
    public aewl(final int d) {
        this.d = d;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                CronetLibraryLoader.b();
                return;
            }
            case 6: {
                auei.a();
                return;
            }
            case 5: {
                if (ApplicationStatus.b != null) {
                    return;
                }
                ApplicationStatus.a(ApplicationStatus.b = new audn());
                return;
            }
            case 4: {
                final ArrayList list = new ArrayList(atke.d.keySet());
                for (int size = list.size(), i = 0; i < size; ++i) {
                    final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)list.get(i);
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        atke.d.remove(scheduledThreadPoolExecutor);
                    }
                    else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
            }
            case 2:
            case 3: {
                return;
            }
            case 1: {
                final aevk remove = aewp.b.remove();
                if (remove == aewp.d) {
                    aewp.c.pop();
                    return;
                }
                aewp.c.push(remove);
                return;
            }
            case 0: {
                aewp.h = null;
            }
        }
    }
}
