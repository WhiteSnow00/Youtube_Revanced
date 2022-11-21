import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adak implements Callable
{
    public final adal a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;
    public final long h;
    
    public adak(final adal a, final String b, final boolean c, final int d, final String e, final boolean f, final String g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        return this.a.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
