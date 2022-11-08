import java.io.OutputStream;
import java.io.BufferedOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class lxb extends BufferedOutputStream
{
    private boolean a;
    
    public lxb(final OutputStream outputStream) {
        super(outputStream);
    }
    
    public lxb(final OutputStream outputStream, final int n) {
        super(outputStream, n);
    }
    
    public final void a(final OutputStream out) {
        dk.h(this.a);
        this.out = out;
        this.count = 0;
        this.a = false;
    }
    
    @Override
    public final void close() {
        this.a = true;
        try {
            this.flush();
        }
        finally {}
        Throwable t = null;
        try {
            this.out.close();
        }
        finally {
            if (t == null) {
                final Throwable t2;
                t = t2;
            }
        }
        if (t == null) {
            return;
        }
        final int a = baw.a;
    }
}
