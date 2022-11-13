import java.io.FileNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddu extends dek
{
    public ddu(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    public final Class a() {
        return AssetFileDescriptor.class;
    }
    
    protected final /* bridge */ Object b(final Uri uri, final ContentResolver contentResolver) {
        final AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }
    
    protected final void c(final Object o) {
        ((AssetFileDescriptor)o).close();
    }
}
