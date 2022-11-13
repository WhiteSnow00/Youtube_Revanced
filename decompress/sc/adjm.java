import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjm implements adkx
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public adjm(final admv b, final asjr a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adjm(final aezp b, final aezp a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adjm(final asji b, final Object a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adjm(final asjr a, final Bitmap b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final admv a(admv admv) {
        final int c = this.c;
        final boolean b = false;
        boolean b2 = false;
        if (c == 0) {
            final Object a = this.a;
            final Object b3 = this.b;
            admv.getClass();
            final ahaz builder = ((ahbh)admv).toBuilder();
            boolean b4 = b;
            if ((((admv)builder.instance).d & 0x8) != 0x0) {
                b4 = true;
            }
            adkp.H(b4);
            File file;
            if (!(file = new File(((admv)builder.instance).aq)).exists()) {
                final admv admv2 = (admv)builder.buildPartial();
                if ((admv2.d & 0x8) == 0x0) {
                    throw new IOException("Missing storage directory ".concat(String.valueOf(admv2.k)));
                }
                file = new File(admv2.aq);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("Could not create storage directory ".concat(String.valueOf(admv2.k)));
                }
            }
            final File file2 = new File(file, auih.a("'thumbnail'_yyyyMMdd_HHmmssSSS'.jpg'").a((augg)auga.c()));
            file2.createNewFile();
            final FileOutputStream fileOutputStream = new FileOutputStream(file2);
            ((Bitmap)b3).compress(Bitmap$CompressFormat.JPEG, 100, (OutputStream)fileOutputStream);
            fileOutputStream.close();
            final String absolutePath = file2.getAbsolutePath();
            builder.copyOnWrite();
            admv = (admv)builder.instance;
            absolutePath.getClass();
            admv.b |= 0x2000;
            admv.p = absolutePath;
            return (admv)((asjr)a).a((Object)builder.build());
        }
        if (c == 1) {
            final Object b5 = this.b;
            final Object a2 = this.a;
            final int t = adjv.t;
            admv.getClass();
            return (admv)((ahaz)((asji)b5).a(((ahbh)admv).toBuilder(), a2)).build();
        }
        if (c != 2) {
            final Object b6 = this.b;
            final Object a3 = this.a;
            if (admv == null) {
                admv = null;
            }
            else {
                if ((admv.b & 0x10) != 0x0) {
                    b2 = true;
                }
                adkp.I(b2, "Feedback only upload hasn't any metadata set.");
                admz admz;
                if ((admz = admv.i) == null) {
                    admz = admz.a;
                }
                final aezp aezp = (aezp)b6;
                final boolean h = aezp.h();
                final ahaz builder2 = ((ahbh)admz).toBuilder();
                if (h) {
                    final String c2 = (String)aezp.c();
                    builder2.copyOnWrite();
                    final admz admz2 = (admz)builder2.instance;
                    admz2.b |= 0x1;
                    admz2.c = c2;
                }
                final aezp aezp2 = (aezp)a3;
                if (aezp2.h()) {
                    final admy admy = (admy)aezp2.c();
                    builder2.copyOnWrite();
                    final admz admz3 = (admz)builder2.instance;
                    admz3.e = admy.d;
                    admz3.b |= 0x4;
                }
                final ahaz builder3 = ((ahbh)admv).toBuilder();
                builder3.copyOnWrite();
                final admv admv3 = (admv)builder3.instance;
                final admz i = (admz)builder2.build();
                i.getClass();
                admv3.i = i;
                admv3.b |= 0x10;
                admv = (admv)builder3.build();
            }
            return admv;
        }
        final Object b7 = this.b;
        final Object a4 = this.a;
        final int t2 = adjv.t;
        admv.getClass();
        final ahaz builder4 = ((ahbh)admv).toBuilder();
        adkp.I(((admv)b7).x ^ true, "Metadata can be cleared only on unconfirmed uploads.");
        return (admv)((ahaz)((asjr)a4).a((Object)builder4)).build();
    }
}
