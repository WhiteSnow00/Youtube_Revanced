import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegm implements aegp
{
    private final bu a;
    private rf b;
    private rf c;
    private final aeoe d;
    
    public aegm(final bu a, final aeoe d) {
        this.a = a;
        this.d = d;
    }
    
    public final Intent a() {
        return this.a.getIntent();
    }
    
    public final rf b() {
        return this.c;
    }
    
    public final rf c() {
        return this.b;
    }
    
    public final void d(final rd rd, final rd rd2) {
        this.b = ((qt)this.a).registerForActivityResult((rl)new ro(), rd);
        this.c = ((qt)this.a).registerForActivityResult((rl)new ro(), rd2);
    }
    
    public final boolean e() {
        return true;
    }
    
    public final boolean f() {
        return this.a.isChangingConfigurations();
    }
    
    public final boolean g() {
        return this.a.isFinishing();
    }
    
    public final boolean h() {
        return this.d.b().Z();
    }
}
