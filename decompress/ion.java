import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ion implements fml
{
    public final Executor a;
    public final Executor b;
    public final ktn c;
    
    public ion(final ktn c, final Executor a, final Executor b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static void a(final Throwable t) {
        ttr.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from YtMainDownloadedVideoEntity.", t);
    }
    
    public static void b(final Throwable t) {
        ttr.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from MainVideoEntity.", t);
    }
}
