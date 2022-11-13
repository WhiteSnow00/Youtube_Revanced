import java.io.InputStream;
import java.io.FileInputStream;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddg implements ddj
{
    final dem a;
    final dge b;
    
    public ddg(final dem a, final dge b) {
        this.a = a;
        this.b = b;
    }
    
    public final ImageHeaderParser$ImageType a(final dde dde) {
        dkm dkm2;
        try {
            final dkm dkm = new dkm((InputStream)new FileInputStream(this.a.c().getFileDescriptor()), this.b);
            try {
                final ImageHeaderParser$ImageType c = dde.c((InputStream)dkm);
                dkm.b();
                this.a.c();
                return c;
            }
            finally {}
        }
        finally {
            dkm2 = null;
        }
        if (dkm2 != null) {
            dkm2.b();
        }
        this.a.c();
    }
}
