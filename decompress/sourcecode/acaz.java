import android.view.View;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acaz implements ors
{
    private final actt a;
    private final wwu b;
    
    public acaz(final actt a, final wwu b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final agyr a() {
        return (agyr)aota.b;
    }
    
    public final void c(final ajzl ajzl, final View view) {
        final int b = ajzl.b;
        if ((b & 0x10) == 0x0) {
            if ((b & 0x40) == 0x0) {
                this.a.f(ajzl, view, this.b.n());
                return;
            }
        }
        this.a.b(ajzl, view, (Object)ajzl, this.b.n());
    }
}
