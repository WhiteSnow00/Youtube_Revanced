// 
// Decompiled by Procyon v0.6.0
// 

public class acqe implements acqf
{
    private static final acqe a;
    private final afbh b;
    
    static {
        a = new acqe();
    }
    
    private acqe() {
        this.b = afag.a;
    }
    
    public acqe(final acbk acbk) {
        this.b = afbh.k(acbk);
    }
    
    public static acqe a() {
        return acqe.a;
    }
    
    public afbh b() {
        return this.b;
    }
    
    public boolean c() {
        return this.b.h() && ((acbk)this.b.c()).a() == acbj.d;
    }
    
    public boolean d() {
        return this.c() && ((acbk)this.b.c()).d();
    }
}
