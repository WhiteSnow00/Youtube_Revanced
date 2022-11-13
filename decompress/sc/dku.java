import android.media.MediaMetadataRetriever;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaDataSource;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dku implements dkv
{
    private final int a;
    
    public dku(final int a) {
        this.a = a;
    }
    
    private static final MediaDataSource c(final ByteBuffer byteBuffer) {
        return (MediaDataSource)new dkt(byteBuffer);
    }
    
    public final void a(final MediaExtractor mediaExtractor, final Object o) {
        final int a = this.a;
        if (a == 0) {
            mediaExtractor.setDataSource(c((ByteBuffer)o));
            return;
        }
        if (a != 1) {
            mediaExtractor.setDataSource(((ParcelFileDescriptor)o).getFileDescriptor());
            return;
        }
        final AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor)o;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
    
    public final void b(final MediaMetadataRetriever mediaMetadataRetriever, final Object o) {
        final int a = this.a;
        if (a == 0) {
            mediaMetadataRetriever.setDataSource(c((ByteBuffer)o));
            return;
        }
        if (a != 1) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor)o).getFileDescriptor());
            return;
        }
        final AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor)o;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
