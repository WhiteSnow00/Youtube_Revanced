import android.database.Cursor;
import android.provider.MediaStore$Video$Thumbnails;
import java.io.FileNotFoundException;
import android.graphics.BitmapFactory$Options;
import android.provider.DocumentsContract;
import android.os.CancellationSignal;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnc implements adni
{
    public static final String[] a;
    
    static {
        a = new String[] { "_id" };
    }
    
    static Bitmap b(final ContentResolver contentResolver, final Uri uri, final Point point) {
        try {
            Bitmap bitmap;
            if ((bitmap = DocumentsContract.getDocumentThumbnail(contentResolver, uri, point, new CancellationSignal())) == null) {
                if (point.x <= 96 && point.y <= 96) {
                    bitmap = e(contentResolver, uri, 3, new BitmapFactory$Options());
                }
                else {
                    bitmap = e(contentResolver, uri, 1, new BitmapFactory$Options());
                }
            }
            return bitmap;
        }
        catch (final FileNotFoundException ex) {
            return null;
        }
    }
    
    static apig d(final String c) {
        final ahaz builder = ((ahbh)apig.a).createBuilder();
        final ahaz builder2 = anwm.a.createBuilder();
        builder2.copyOnWrite();
        final anwm anwm = (anwm)builder2.instance;
        c.getClass();
        anwm.b |= 0x1;
        anwm.c = c;
        builder.copyOnWrite();
        final apig apig = (apig)builder.instance;
        final anwm c2 = (anwm)builder2.build();
        c2.getClass();
        apig.c = c2;
        apig.b |= 0x1;
        return (apig)builder.build();
    }
    
    private static Bitmap e(final ContentResolver contentResolver, final Uri uri, final int n, final BitmapFactory$Options bitmapFactory$Options) {
        final Cursor query = contentResolver.query(uri, adnc.a, (String)null, (String[])null, (String)null);
        if (query != null) {
            if (query.moveToFirst()) {
                try {
                    final long long1 = query.getLong(query.getColumnIndexOrThrow("_id"));
                    if (!query.moveToNext()) {
                        return MediaStore$Video$Thumbnails.getThumbnail(contentResolver, long1, n, bitmapFactory$Options);
                    }
                    final String value = String.valueOf(uri);
                    final StringBuilder sb = new StringBuilder("Multiple content resolver entries returned for ");
                    sb.append(value);
                    throw new AssertionError((Object)sb.toString());
                }
                finally {
                    query.close();
                }
            }
            throw new FileNotFoundException("No content resolver entry for ".concat(String.valueOf(String.valueOf(uri))));
        }
        throw new FileNotFoundException("Content resolver did not recognize ".concat(String.valueOf(String.valueOf(uri))));
    }
    
    public final Bitmap a(final ContentResolver contentResolver, final Uri uri, final Point point) {
        return b(contentResolver, uri, point);
    }
    
    public final apig c(final String s, final String s2) {
        return d(s);
    }
}
