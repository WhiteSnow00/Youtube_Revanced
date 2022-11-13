import java.util.Collection;
import java.util.Arrays;
import java.util.EnumSet;
import android.os.Handler;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adco
{
    private static final Set d;
    public final adbe a;
    public final Set b;
    public boolean c;
    private final Handler e;
    
    static {
        d = EnumSet.allOf(adcn.class);
    }
    
    public adco(final adbe a, final Handler e) {
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.b = EnumSet.noneOf(adcn.class);
    }
    
    public final void a(final adcn... array) {
        this.b.addAll(Arrays.asList(array));
        if (!this.c) {
            if (this.b.containsAll(adco.d)) {
                this.e.post((Runnable)new adap(this, 3));
                this.c = true;
            }
        }
    }
}
