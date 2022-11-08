import android.os.Process;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwh extends HandlerThread
{
    private final int a;
    
    public lwh() {
        super("ExoPlayerImplInternal:Handler");
        this.a = -16;
    }
    
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
