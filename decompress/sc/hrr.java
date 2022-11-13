// 
// Decompiled by Procyon v0.6.0
// 

public final class hrr implements Runnable
{
    public final hrx a;
    public final long b;
    public final aiqj c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final agmc k;
    
    public hrr(final hrx a, final long b, final aiqj c, final agmc k, final int d, final int e, final int f, final boolean g, final boolean h, final boolean i, final long j, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.k = k;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void run() {
        this.a.d(this.b, this.c, this.k, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
