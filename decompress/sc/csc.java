import androidx.work.impl.WorkDatabase;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csc extends csf
{
    final cof a;
    final UUID b;
    
    public csc(final cof a, final UUID b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final WorkDatabase d = this.a.d;
        ((cft)d).k();
        try {
            c(this.a, this.b.toString());
            ((cft)d).n();
            ((cft)d).l();
            d(this.a);
        }
        finally {
            ((cft)d).l();
        }
    }
}
