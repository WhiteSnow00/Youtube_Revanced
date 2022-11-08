import android.view.WindowInsets;
import android.view.WindowInsets$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public class anq extends ans
{
    final WindowInsets$Builder a;
    
    public anq() {
        this.a = new WindowInsets$Builder();
    }
    
    public anq(final aoa aoa) {
        super(aoa);
        final WindowInsets e = aoa.e();
        WindowInsets$Builder a;
        if (e != null) {
            a = new WindowInsets$Builder(e);
        }
        else {
            a = new WindowInsets$Builder();
        }
        this.a = a;
    }
    
    public aoa a() {
        this.h();
        final aoa o = aoa.o(this.a.build());
        o.r(this.b);
        return o;
    }
    
    public void b(final aia aia) {
        this.a.setStableInsets(aia.a());
    }
    
    public void c(final aia aia) {
        this.a.setSystemWindowInsets(aia.a());
    }
    
    public void d(final aia aia) {
        this.a.setMandatorySystemGestureInsets(aia.a());
    }
    
    public void e(final aia aia) {
        this.a.setSystemGestureInsets(aia.a());
    }
    
    public void f(final aia aia) {
        this.a.setTappableElementInsets(aia.a());
    }
}
