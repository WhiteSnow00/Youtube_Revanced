// 
// Decompiled by Procyon v0.6.0
// 

public final class dfs implements dfy
{
    public final boolean a;
    public final dfy b;
    private final boolean c;
    private final ddk d;
    private int e;
    private boolean f;
    private final qcy g;
    
    public dfs(final dfy b, final boolean a, final boolean c, final ddk d, final qcy g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        clm.h((Object)b);
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        clm.h((Object)g);
        this.g = g;
    }
    
    public final int a() {
        return this.b.a();
    }
    
    public final Class b() {
        return this.b.b();
    }
    
    public final Object c() {
        return this.b.c();
    }
    
    public final void d() {
        synchronized (this) {
            if (!this.f) {
                ++this.e;
                return;
            }
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }
    
    public final void e() {
        synchronized (this) {
            if (this.e > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.f) {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.f = true;
            if (this.c) {
                this.b.e();
            }
        }
    }
    
    public final void f() {
        synchronized (this) {
            int e = this.e;
            if (e > 0) {
                --e;
                this.e = e;
                monitorexit(this);
                if (e == 0) {
                    this.g.ab(this.d, this);
                }
                return;
            }
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final boolean a = this.a;
            final String string = this.g.toString();
            final String value = String.valueOf(this.d);
            final int e = this.e;
            final boolean f = this.f;
            final String string2 = this.b.toString();
            final StringBuilder sb = new StringBuilder("EngineResource{isMemoryCacheable=");
            sb.append(a);
            sb.append(", listener=");
            sb.append(string);
            sb.append(", key=");
            sb.append(value);
            sb.append(", acquired=");
            sb.append(e);
            sb.append(", isRecycled=");
            sb.append(f);
            sb.append(", resource=");
            sb.append(string2);
            sb.append("}");
            return sb.toString();
        }
    }
}
