import org.webrtc.audio.WebRtcAudioRecord;
import java.util.concurrent.Executors;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwi implements ThreadFactory
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public lwi(final int b) {
        this.b = b;
        this.a = "Loader:ExtractorSampleSource";
    }
    
    public lwi(final AtomicInteger a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final int b = this.b;
        if (b == 0) {
            return new Thread(runnable, (String)this.a);
        }
        if (b == 1) {
            return new Thread(runnable, (String)this.a);
        }
        if (b == 2) {
            return ((ThreadFactory)this.a).newThread((Runnable)new nlk(runnable, 12));
        }
        if (b == 3) {
            final Thread thread = ((ThreadFactory)this.a).newThread(runnable);
            if (thread.getContextClassLoader() == null) {
                thread.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
            }
            return thread;
        }
        if (b != 4) {
            final Thread thread2 = Executors.defaultThreadFactory().newThread(runnable);
            thread2.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", WebRtcAudioRecord.a.getAndIncrement(), ((AtomicInteger)this.a).getAndIncrement()));
            return thread2;
        }
        return new Thread(runnable, (String)this.a);
    }
}
