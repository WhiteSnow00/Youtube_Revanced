import java.util.Collections;
import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwr implements cwy
{
    public final List a;
    
    public cwr() {
        this.a = Collections.singletonList(new czs(new PointF(0.0f, 0.0f)));
    }
    
    public cwr(final List a) {
        this.a = a;
    }
    
    @Override
    public final cvr a() {
        if (this.a.get(0).e()) {
            return (cvr)new cvz(this.a);
        }
        return (cvr)new cvy(this.a);
    }
    
    @Override
    public final List b() {
        return this.a;
    }
    
    @Override
    public final boolean c() {
        return this.a.size() == 1 && this.a.get(0).e();
    }
}
