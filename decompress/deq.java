import android.provider.MediaStore$Video$Thumbnails;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deq implements der
{
    private static final String[] a;
    private final ContentResolver b;
    
    static {
        a = new String[] { "_data" };
    }
    
    public deq(final ContentResolver b) {
        this.b = b;
    }
    
    public final Cursor a(final Uri uri) {
        return this.b.query(MediaStore$Video$Thumbnails.EXTERNAL_CONTENT_URI, deq.a, "kind = 1 AND video_id = ?", new String[] { uri.getLastPathSegment() }, (String)null);
    }
}
