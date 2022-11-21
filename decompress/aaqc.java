import java.util.concurrent.TimeUnit;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaqc extends Property
{
    public aaqc(final Class clazz) {
        super(clazz, "countDownProgress");
    }
    
    public final Object get(final Object o) {
        return ((aaqd)o).b;
    }
    
    public final void set(final Object o, final Object o2) {
        final aaqd aaqd = (aaqd)o;
        final Long b = (Long)o2;
        aaqd.b = b;
        ((aaqi)aaqd.c).b.o(b, aaqd.a);
        ((aaqi)aaqd.c).e.d((Object)new aapy(TimeUnit.MILLISECONDS.toSeconds(b), TimeUnit.MILLISECONDS.toSeconds(aaqd.a)));
        if (b == aaqd.a) {
            ((aaqi)aaqd.c).u(true);
        }
    }
}
