// 
// Decompiled by Procyon v0.6.0
// 

public final class adkx implements atnb
{
    private final tgi a;
    private volatile aotm b;
    
    public adkx(final tgi a) {
        this.a = a;
    }
    
    private final aotm c() {
        synchronized (this) {
            if (this.b == null) {
                this.b = this.a.f();
            }
            return this.b;
        }
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final aotm b() {
        aotm aotm;
        if (this.b != null) {
            aotm = this.b;
        }
        else {
            aotm = this.c();
        }
        return aotm;
    }
}
