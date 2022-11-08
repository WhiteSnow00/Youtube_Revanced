import android.media.MediaMetadataRetriever;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaDataSource;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkt implements dku
{
    private final /* synthetic */ int a;
    
    public dkt(final int a) {
        this.a = a;
    }
    
    private static final MediaDataSource c(final ByteBuffer byteBuffer) {
        return (MediaDataSource)new dks(byteBuffer);
    }
}
