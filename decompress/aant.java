import app.revanced.integrations.sponsorblock.PlayerController;

// 
// Decompiled by Procyon v0.6.0
// 

public class aant implements abwp
{
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final boolean h;
    private final String i;
    
    public aant(final long n, final long b, final long c, final long d, final long e, final long f, final long g, final boolean h, final String i) {
        PlayerController.setCurrentVideoTime(n);
        this.a = n;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public aant(final abwp abwp, final boolean b, final String s) {
        this(abwp.g(), abwp.b(), abwp.h(), abwp.f(), abwp.a(), abwp.d(), abwp.c(), b, s);
    }
    
    public long a() {
        return this.e;
    }
    
    public long b() {
        return this.b;
    }
    
    public long c() {
        return this.g;
    }
    
    public long d() {
        return this.f;
    }
    
    public long e() {
        return this.g();
    }
    
    public long f() {
        return this.d;
    }
    
    public long g() {
        return this.a;
    }
    
    public long h() {
        return this.c;
    }
    
    public String i() {
        return this.i;
    }
    
    public boolean j() {
        return this.h;
    }
}
