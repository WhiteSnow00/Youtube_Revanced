import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adie
{
    private final Context a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final vlf f;
    
    public adie(final Context a, final vlf f, final byte[] array) {
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
            this.e = qca.c(this.a);
        }
        finally {
            final Throwable t;
            t.toString();
            final int a = adid.a;
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
