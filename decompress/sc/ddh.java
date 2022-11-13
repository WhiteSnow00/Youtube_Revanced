import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddh implements ddi
{
    final Object a;
    final Object b;
    private final int c;
    
    public ddh(final dem b, final dge a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ddh(final InputStream a, final dge b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ddh(final ByteBuffer a, final dge b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final int a(final dde dde) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                dkm dkm2;
                try {
                    final dkm dkm = new dkm((InputStream)new FileInputStream(((dem)this.b).c().getFileDescriptor()), (dge)this.a);
                    try {
                        final int a = dde.a((InputStream)dkm, (dge)this.a);
                        dkm.b();
                        ((dem)this.b).c();
                        return a;
                    }
                    finally {}
                }
                finally {
                    dkm2 = null;
                }
                if (dkm2 != null) {
                    dkm2.b();
                }
                ((dem)this.b).c();
            }
            else {
                try {
                    return dde.b((ByteBuffer)this.a, (dge)this.b);
                }
                finally {
                    dou.d((ByteBuffer)this.a);
                }
            }
        }
        try {
            return dde.a((InputStream)this.a, (dge)this.b);
        }
        finally {
            ((InputStream)this.a).reset();
        }
    }
}
