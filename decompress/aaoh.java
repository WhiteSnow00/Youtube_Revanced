import java.util.concurrent.TimeUnit;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaoh extends Property
{
    public aaoh(final Class clazz) {
        super(clazz, "countDownProgress");
    }
    
    public final Object get(final Object o) {
        return ((aaoi)o).b;
    }
    
    public final void set(final Object o, final Object o2) {
        final aaoi aaoi = (aaoi)o;
        final Long b = (Long)o2;
        aaoi.b = b;
        ((aaon)aaoi.c).b.o(b, aaoi.a);
        ((aaon)aaoi.c).e.d((Object)new aaob(TimeUnit.MILLISECONDS.toSeconds(b), TimeUnit.MILLISECONDS.toSeconds(aaoi.a)));
        if (b == aaoi.a) {
            ((aaon)aaoi.c).u(true);
        }
    }
}
