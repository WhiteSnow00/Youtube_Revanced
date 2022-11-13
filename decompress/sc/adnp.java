import android.content.ContentResolver;
import com.google.protobuf.ExtensionRegistryLite;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import java.io.File;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnp implements adni
{
    static Bitmap b(final Uri uri, final Point point) {
        final String queryParameter = uri.getQueryParameter("camera_roll");
        File file;
        if (queryParameter != null && !queryParameter.isEmpty()) {
            file = new File(queryParameter);
        }
        else {
            file = null;
        }
        if (file == null) {
            return null;
        }
        final int x = point.x;
        int n = 1;
        if (x <= 96) {
            if (point.y > 96) {
                n = n;
            }
            else {
                n = 3;
            }
        }
        final String absolutePath = file.getAbsolutePath();
        if (TextUtils.isEmpty((CharSequence)absolutePath)) {
            return null;
        }
        return ThumbnailUtils.createVideoThumbnail(absolutePath, n);
    }
    
    static apig d(final String c, final String s) {
        final ahaz builder = ((ahbh)apig.a).createBuilder();
        final ahaz builder2 = anwm.a.createBuilder();
        builder2.copyOnWrite();
        final anwm anwm = (anwm)builder2.instance;
        c.getClass();
        anwm.b |= 0x1;
        anwm.c = c;
        final anwm anwm2 = (anwm)builder2.build();
        ajlf a = ajlf.a;
        final File file = new File(s, "video_edit_proto");
        if (file.exists()) {
            a = (ajlf)ahbh.parseFrom((ahbh)ajlf.a, afpj.d(file), ExtensionRegistryLite.getGeneratedRegistry());
        }
        if (a.b.size() == 1) {
            final ahaz builder3 = ((ahbh)ajld.a).createBuilder();
            builder3.copyOnWrite();
            final ajld ajld = (ajld)builder3.instance;
            anwm2.getClass();
            ajld.c = anwm2;
            ajld.b = 2;
            final ajld c2 = (ajld)builder3.build();
            final ahaz builder4 = ((ahbh)a.b.get(0)).toBuilder();
            builder4.copyOnWrite();
            final ajlc ajlc = (ajlc)builder4.instance;
            c2.getClass();
            ajlc.c = c2;
            ajlc.b |= 0x1;
            final ajlc ajlc2 = (ajlc)builder4.build();
            final ahaz builder5 = ((ahbh)a).toBuilder();
            builder5.copyOnWrite();
            final ajlf ajlf = (ajlf)builder5.instance;
            ajlc2.getClass();
            ajlf.a();
            ajlf.b.set(0, (Object)ajlc2);
            builder.copyOnWrite();
            final apig apig = (apig)builder.instance;
            final ajlf d = (ajlf)builder5.build();
            d.getClass();
            apig.d = d;
            apig.b |= 0x2;
        }
        else {
            builder.copyOnWrite();
            final apig apig2 = (apig)builder.instance;
            anwm2.getClass();
            apig2.c = anwm2;
            apig2.b |= 0x1;
        }
        return (apig)builder.build();
    }
    
    public final Bitmap a(final ContentResolver contentResolver, final Uri uri, final Point point) {
        return b(uri, point);
    }
    
    public final apig c(final String s, final String s2) {
        return d(s, s2);
    }
}
