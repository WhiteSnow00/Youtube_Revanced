import android.os.CancellationSignal;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

final class ajv
{
    static Cursor a(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final Object o) {
        return contentResolver.query(uri, array, s, array2, s2, (CancellationSignal)o);
    }
}
