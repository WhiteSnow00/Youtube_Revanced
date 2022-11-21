import j$.util.Optional;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adln
{
    public Uri a;
    public Optional b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private byte i;
    
    public adln() {
    }
    
    public adln(final adlo adlo) {
        this.b = Optional.empty();
        this.c = adlo.a;
        this.d = adlo.b;
        this.e = adlo.c;
        this.a = adlo.d;
        this.f = adlo.e;
        this.g = adlo.f;
        this.h = adlo.g;
        this.b = adlo.h;
        this.i = 7;
    }
    
    public adln(final byte[] array) {
        this.b = Optional.empty();
    }
    
    public final adlo a() {
        final String c = this.c;
        if (c == null) {
            throw new IllegalStateException("Property \"frontendUploadId\" has not been set");
        }
        final String d = this.d;
        if (d == null) {
            throw new IllegalStateException("Property \"workingDir\" has not been set");
        }
        final String e = this.e;
        if (e == null) {
            throw new IllegalStateException("Property \"storageDir\" has not been set");
        }
        if (this.i != 7) {
            final StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" frontendUploadId");
            }
            if (this.d == null) {
                sb.append(" workingDir");
            }
            if (this.e == null) {
                sb.append(" storageDir");
            }
            if ((this.i & 0x1) == 0x0) {
                sb.append(" confirmed");
            }
            if ((this.i & 0x2) == 0x0) {
                sb.append(" creationFailed");
            }
            if ((this.i & 0x4) == 0x0) {
                sb.append(" unconfirmedFlowFailed");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new adlo(c, d, e, this.a, this.f, this.g, this.h, this.b);
    }
    
    public final void b(final boolean f) {
        this.f = f;
        this.i |= 0x1;
    }
    
    public final void c(final boolean g) {
        this.g = g;
        this.i |= 0x2;
    }
    
    public final void d(final String c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null frontendUploadId");
    }
    
    public final void e(final String e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null storageDir");
    }
    
    public final void f(final boolean h) {
        this.h = h;
        this.i |= 0x4;
    }
    
    public final void g(final String d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null workingDir");
    }
}
