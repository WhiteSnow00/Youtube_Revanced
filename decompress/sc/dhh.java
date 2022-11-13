import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

final class dhh extends Thread
{
    public dhh(final Runnable runnable) {
        super(runnable);
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
