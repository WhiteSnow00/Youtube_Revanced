import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.Arrays;
import com.google.common.util.concurrent.ListenableFuture;
import android.graphics.Bitmap;
import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkd implements afty
{
    public final String a;
    public final zme b;
    public final boolean c;
    public final String[] d;
    public final Uri e;
    public final File f;
    public final Bitmap g;
    public final String h;
    public final byte[] i;
    public final String[] j;
    public final apmq k;
    public final boolean l;
    public final adpp m;
    
    public adkd(final adpp m, final String a, final zme b, final boolean c, final String[] d, final Uri e, final File f, final Bitmap g, final String h, final byte[] i, final String[] j, final apmq k, final boolean l, final byte[] array) {
        this.m = m;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final ListenableFuture a() {
        final adpp m = this.m;
        final String a = this.a;
        final zme b = this.b;
        final boolean c = this.c;
        final String[] d = this.d;
        Uri uri = this.e;
        final File f = this.f;
        final Bitmap g = this.g;
        final String h = this.h;
        final byte[] i = this.i;
        final String[] j = this.j;
        final apmq k = this.k;
        final boolean l = this.l;
        tvb.o(a, (Object)"Invalid or empty upload Frontend ID passed.");
        adkp.I(b.z() ^ true, "Cannot use a signed-out identity.");
        final ahaz builder = ((ahbh)admv.a).createBuilder();
        builder.copyOnWrite();
        final admv admv = (admv)builder.instance;
        admv.b |= 0x40;
        admv.k = a;
        final String d2 = b.d();
        builder.copyOnWrite();
        final admv admv2 = (admv)builder.instance;
        admv2.b |= 0x1;
        admv2.e = d2;
        final long c2 = ((oby)m.f).c();
        builder.copyOnWrite();
        final admv admv3 = (admv)builder.instance;
        admv3.b |= 0x8;
        admv3.h = c2;
        final admt d3 = admt.d;
        builder.copyOnWrite();
        final admv admv4 = (admv)builder.instance;
        admv4.l = d3.h;
        admv4.b |= 0x80;
        builder.copyOnWrite();
        final admv admv5 = (admv)builder.instance;
        admv5.d |= 0x200;
        admv5.au = c;
        final List<String> list = Arrays.asList(d);
        builder.copyOnWrite();
        final admv admv6 = (admv)builder.instance;
        final ahbx t = admv6.T;
        if (!t.c()) {
            admv6.T = ahbh.mutableCopy(t);
        }
        agzk.addAll((Iterable)list, (List)admv6.T);
        builder.copyOnWrite();
        admv.a((admv)builder.instance);
        builder.copyOnWrite();
        admv.b((admv)builder.instance);
        builder.copyOnWrite();
        final admv admv7 = (admv)builder.instance;
        admv7.b |= 0x1000000;
        admv7.w = false;
        ((adet)m.m).e(a, builder);
        Uri build;
        boolean b2;
        if (f == null && g == null) {
            build = uri;
            b2 = c;
        }
        else {
            final File file = new File(((admv)builder.instance).ap);
            if (!file.exists()) {
                adet.u((admv)builder.buildPartial());
            }
            if (f != null) {
                final File file2 = new File(file, "video_effects_state");
                file2.createNewFile();
                adkp.H(f.exists());
                adkp.H(file2.exists());
                final FileInputStream fileInputStream = new FileInputStream(f);
                final FileOutputStream fileOutputStream = new FileOutputStream(file2);
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = fileInputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(array, 0, read);
                    Arrays.fill(array, (byte)0);
                }
                fileInputStream.close();
                fileOutputStream.close();
                f.delete();
                uri = uri.buildUpon().appendQueryParameter("videoEffectsStateFilePath", file2.getAbsolutePath()).build();
            }
            build = uri;
            b2 = c;
            if (g != null) {
                final File file3 = new File(file, "video_thumbnail.jpg");
                final FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                g.compress(Bitmap$CompressFormat.JPEG, 60, (OutputStream)fileOutputStream2);
                fileOutputStream2.close();
                build = uri.buildUpon().appendQueryParameter("videoThumbnailFilePath", file3.getAbsolutePath()).build();
                b2 = c;
            }
        }
        final String string = build.toString();
        builder.copyOnWrite();
        final admv admv8 = (admv)builder.instance;
        string.getClass();
        admv8.b |= 0x2;
        admv8.f = string;
        if (h != null) {
            builder.copyOnWrite();
            final admv admv9 = (admv)builder.instance;
            admv9.c |= 0x10000;
            admv9.W = h;
        }
        if (i != null) {
            final ahab x = ahab.x(i);
            builder.copyOnWrite();
            final admv admv10 = (admv)builder.instance;
            admv10.b |= 0x800;
            admv10.n = x;
        }
        if (j != null) {
            builder.ag((Iterable)Arrays.asList(j));
        }
        if (k != null) {
            builder.copyOnWrite();
            final admv admv11 = (admv)builder.instance;
            admv11.aa = k;
            admv11.c |= 0x80000;
        }
        adpp.n(builder);
        final List k2 = adpp.k(m.a);
        if (b2) {
            k2.add(aphq.c);
        }
        builder.copyOnWrite();
        final admv admv12 = (admv)builder.instance;
        admv12.v = 1;
        admv12.b |= 0x100000;
        k2.add(aphq.h);
        final admv admv13 = (admv)builder.build();
        ((adku)m.d).h(a, admv13);
        final Object g2 = m.g;
        final String d4 = b.d();
        aphs aphs;
        if (l) {
            aphs = aphs.b;
        }
        else {
            aphs = aphs.c;
        }
        ((adlp)g2).k(a, d4, aphs, 3, false, k2.toArray(new aphq[0]));
        ((adln)m.h).c(a);
        ((adld)m.e).i(a, admv13);
        final aruy a2 = admm.a(a);
        a2.b = i;
        a2.d = g;
        ((admj)((arkg)m.i).a()).z(a2.l());
        return afwm.m((Object)admv13);
    }
}
