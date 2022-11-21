import android.os.ParcelFileDescriptor;
import android.os.CancellationSignal;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aip
{
    public static ParcelFileDescriptor a(final ContentResolver contentResolver, final Uri uri, final String s, final CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, s, cancellationSignal);
    }
}
