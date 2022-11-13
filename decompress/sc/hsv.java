import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import android.provider.MediaStore$Video$Media;
import android.content.ContentValues;
import java.io.FileOutputStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.File;
import android.os.Environment;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsv extends zol
{
    public boolean a;
    public boolean b;
    private final zme j;
    private final znu k;
    private final ContentResolver l;
    private final dbf m;
    
    public hsv(final String s, final zme j, final znu k, final ContentResolver l, final dbf m) {
        super(1, s, (dbe)null);
        j.getClass();
        this.j = j;
        this.k = k;
        l.getClass();
        this.l = l;
        this.m = m;
    }
    
    public final aln c(final dbb dbb) {
        final String s = dbb.c.get("content-type");
        if (s != null && s.equals("video/mp4")) {
            if (!this.a) {
                final byte[] b = dbb.b;
                final File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
                file.mkdirs();
                if (file.isDirectory() && file.canWrite()) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    final String format = new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss", Locale.US).format(new Date(currentTimeMillis));
                    final File file2 = new File(file, String.valueOf(format).concat(".mp4"));
                    try {
                        file2.createNewFile();
                        final FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(b, 0, b.length);
                        fileOutputStream.close();
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("media_type", Integer.valueOf(3));
                        contentValues.put("_data", file2.getAbsolutePath());
                        contentValues.put("_size", Long.valueOf(file2.length()));
                        contentValues.put("_display_name", file2.getName());
                        contentValues.put("title", format);
                        final Long value = currentTimeMillis;
                        contentValues.put("date_added", value);
                        contentValues.put("date_modified", Long.valueOf(currentTimeMillis / 1000L));
                        contentValues.put("mime_type", "video/mp4");
                        contentValues.put("datetaken", value);
                        this.l.insert(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, contentValues);
                    }
                    catch (final IOException | SecurityException ex) {
                        ttr.b("Failed saving downloaded video to camera roll.");
                        this.b = true;
                    }
                }
                else {
                    ttr.b("Camera roll directory not accessible.");
                    this.b = true;
                }
            }
        }
        else {
            this.b = true;
        }
        return aln.n((Object)null, (daw)null);
    }
    
    public final dbj d(final dbj dbj) {
        this.b = true;
        return dbj;
    }
    
    public final zme e() {
        return this.j;
    }
    
    public final Map f() {
        final HashMap hashMap = new HashMap();
        this.k.b((Map)hashMap, (zoe)this);
        return hashMap;
    }
    
    public final /* bridge */ void rL(final Object o) {
        this.m.mX((Object)o);
    }
}
