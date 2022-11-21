// 
// Decompiled by Procyon v0.6.0
// 

public final class aajd
{
    public final zch a;
    public final zch b;
    public final zch c;
    public final zch d;
    public long e;
    public long f;
    public long g;
    public long h;
    
    public aajd() {
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.a = (zch)new aajc(this, 1);
        this.b = (zch)new aajc(this, 0);
        this.c = (zch)new aajc(this, 2);
        this.d = (zch)new aajc(this, 3);
    }
    
    public final long a() {
        return this.g + this.h;
    }
    
    public final long b() {
        return this.e + this.f;
    }
}
