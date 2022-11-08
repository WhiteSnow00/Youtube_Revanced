import java.io.File;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaaz extends zai
{
    private final zrx a;
    private final yyu b;
    private final yzo c;
    private final uyi d;
    
    public aaaz(final zrx a, final yyu b, final yzo c, final uyi d) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final bbk a(final bbk bbk) {
        if (this.d.f(45354110L)) {
            return (bbk)new aaaw(this.a, this.b, this.c, bbk);
        }
        Object o = new aaay(bbk);
        for (final zys zys : this.a.i()) {
            final zrw zrw = (zrw)this.a;
            File f;
            if (zrw.a != null) {
                f = zrw.a.f();
            }
            else {
                f = null;
            }
            String.valueOf(f);
            o = new lwp((lwm)zys, (bbk)o, this.b.a(zys.s()), (bbi)null, 4, (yyt)this.c);
        }
        return (bbk)o;
    }
}
