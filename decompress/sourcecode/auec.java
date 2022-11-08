import org.chromium.net.RequestFinishedInfo;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo$Listener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auec extends RequestFinishedInfo$Listener
{
    private final RequestFinishedInfo$Listener a;
    
    public auec(final RequestFinishedInfo$Listener a) {
        super(a.getExecutor());
        this.a = a;
    }
    
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }
    
    public final void onRequestFinished(final RequestFinishedInfo requestFinishedInfo) {
        this.a.onRequestFinished(requestFinishedInfo);
    }
}
