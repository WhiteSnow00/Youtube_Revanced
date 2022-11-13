import java.util.concurrent.Callable;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class ghr
{
    public trs a;
    private final Activity b;
    private final zfw c;
    
    public ghr(final Activity b, final zfw c, final jki jki, final msr msr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.a = (trs)tpe.Z();
        msr.Q((Callable)new exo(this, (ashi)jki.b, 10));
    }
    
    public boolean d() {
        return this.a != null && this.c.h(ger.d(this.b), this.a);
    }
}
