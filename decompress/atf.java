import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atf
{
    static void a(final MediaMetadataRetriever mediaMetadataRetriever, final MediaDataSource dataSource) {
        mediaMetadataRetriever.setDataSource(dataSource);
    }
    
    public static final avz b(final avw avw) {
        Object o;
        if (avw instanceof aug) {
            o = ((aug)avw).getDefaultViewModelCreationExtras();
            ((avz)o).getClass();
        }
        else {
            o = avx.a;
        }
        return (avz)o;
    }
}
