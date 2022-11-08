import android.net.Uri;
import android.graphics.Bitmap;
import java.io.IOException;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import android.graphics.Bitmap$CompressFormat;
import java.util.Map;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczn implements vau
{
    private static final String a;
    private final Activity b;
    
    static {
        a = trn.a("ShareImageCommandResolver");
    }
    
    public aczn(final Activity b) {
        this.b = b;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final aoac aoac = (aoac)((agzd)aioe).rr((agyr)aoac.b);
        if ((aoac.c & 0x1) != 0x0) {
            final Bitmap c = adbp.c(aoac.d);
            int w;
            if ((w = afld.w(aoac.f)) == 0) {
                w = 1;
            }
            final int n = -1;
            String s;
            if (--w != 1) {
                s = ".png";
            }
            else {
                s = ".jpg";
            }
            String type;
            if (w != 1) {
                type = "image/png";
            }
            else {
                type = "image/jpeg";
            }
            Bitmap$CompressFormat bitmap$CompressFormat;
            if (w != 1) {
                bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
            }
            else {
                bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
            }
            try {
                final File file = new File(((Context)this.b).getCacheDir(), "image_share");
                if (!file.exists()) {
                    file.mkdirs();
                }
                final File file2 = new File(file, "image".concat(s));
                final FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                c.compress(bitmap$CompressFormat, 100, (OutputStream)fileOutputStream);
                fileOutputStream.close();
                final Activity b = this.b;
                final String packageName = ((Context)b).getPackageName();
                int n2;
                if (packageName.hashCode() != 1713433253) {
                    n2 = n;
                }
                else {
                    n2 = n;
                    if (packageName.equals("com.google.android.apps.youtube.music")) {
                        n2 = 0;
                    }
                }
                String s2;
                if (n2 != 0) {
                    s2 = "app.revanced.android.youtube.fileprovider";
                }
                else {
                    s2 = "com.google.android.apps.youtube.music.fileprovider";
                }
                final Uri a = ahc.a((Context)b, s2, file2);
                String e;
                if ((aoac.c & 0x2) != 0x0) {
                    e = aoac.e;
                }
                else {
                    e = null;
                }
                final Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", (Parcelable)a);
                intent.setType(type);
                if (e != null) {
                    intent.putExtra("android.intent.extra.TEXT", e);
                }
                aesm.k((Context)this.b, Intent.createChooser(intent, (CharSequence)null));
                return;
            }
            catch (final IOException ex) {
                trn.c(aczn.a, "Failed to cache image share file.");
                return;
            }
        }
        trn.c(aczn.a, "Image bytes must be supplied.");
    }
}
