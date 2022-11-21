import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class aahw extends Thread
{
    final aahx a;
    
    public aahw(final aahx a, final Runnable runnable) {
        this.a = a;
        super(runnable, "offlineTransfer");
    }
    
    private final void a() {
        try {
            this.a.a.release();
        }
        catch (final RuntimeException ex) {
            tut.l("[Offline] Wakelock already released.");
        }
    }
    
    @Override
    public final void run() {
        tut.g("[Offline] Acquiring transfer wakelock");
        final long millis = TimeUnit.MINUTES.toMillis(this.a.b.b());
        final long currentTimeMillis = System.currentTimeMillis();
        if (millis > 0L) {
            this.a.a.acquire(millis);
        }
        else {
            this.a.a.acquire();
        }
        try {
            super.run();
        }
        finally {
            this.a();
            long min = System.currentTimeMillis() - currentTimeMillis;
            if (millis > 0L) {
                min = Math.min(min, millis);
            }
            final StringBuilder sb = new StringBuilder("[Offline] Transfer wakelock held for ");
            sb.append(min);
            sb.append(" ms");
            tut.l(sb.toString());
        }
    }
}
