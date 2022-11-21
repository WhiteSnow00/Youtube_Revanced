import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adju
{
    private final Context a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final vmm f;
    
    public adju(final Context a, final vmm f, final byte[] array) {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.a = a;
        this.f = f;
    }
    
    final void a() {
        this.d = this.e;
        try {
            this.e = qct.c(this.a);
        }
        finally {
            final Throwable t;
            t.toString();
            final int a = adjt.a;
        }
        this.b = this.c;
        this.c = this.f.a;
    }
    
    final boolean b() {
        return this.b || this.c;
    }
    
    final boolean c() {
        return this.d || this.e;
    }
}
