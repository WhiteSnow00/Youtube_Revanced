import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqe
{
    public String a;
    public boolean b;
    public String c;
    public byte d;
    public int e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    
    public adqe() {
    }
    
    public adqe(final byte[] array) {
        final afag a = afag.a;
        this.j = a;
        this.g = a;
    }
    
    public final Uri a() {
        final Object f = this.f;
        if (f != null) {
            return (Uri)f;
        }
        throw new IllegalStateException("Property \"sourceUri\" has not been set");
    }
    
    public final apke b() {
        final Object g = this.g;
        if (g != null) {
            return (apke)g;
        }
        throw new IllegalStateException("Property \"uploadFlowSource\" has not been set");
    }
    
    public final String c() {
        final String a = this.a;
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Property \"frontendUploadId\" has not been set");
    }
    
    public final boolean d() {
        if (this.d != 0) {
            return this.b;
        }
        throw new IllegalStateException("Property \"isShortsEligible\" has not been set");
    }
    
    public final int e() {
        final int e = this.e;
        if (e != 0) {
            return e;
        }
        throw new IllegalStateException("Property \"uploadFlowFlavor\" has not been set");
    }
    
    public final void f(final afgh h) {
        if (h != null) {
            this.h = h;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }
    
    public final void g(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null notificationContentTitle");
    }
    
    public final void h(final boolean b) {
        this.b = b;
        this.d |= 0x4;
    }
    
    public final void i(final int e) {
        this.e = e;
        this.d |= 0x1;
    }
    
    public final void j() {
        this.d |= 0x2;
    }
    
    public final void k(final phe f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }
    
    public final void l(final boolean b) {
        this.b = b;
        this.d |= 0x4;
    }
}
