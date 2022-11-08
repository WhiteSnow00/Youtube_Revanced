import java.util.concurrent.Callable;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class ghj
{
    public tpn a;
    private final Activity b;
    private final zed c;
    
    public ghj(final Activity b, final zed c, final kct kct, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.a = (tpn)tmy.Z();
        mrm.A((Callable)new exk(this, (asgt)kct.a, 10));
    }
    
    public boolean d() {
        return this.a != null && this.c.h(gej.d(this.b), this.a);
    }
}
