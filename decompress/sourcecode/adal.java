import java.util.Collection;
import java.util.Arrays;
import java.util.EnumSet;
import android.os.Handler;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class adal
{
    private static final Set d;
    public final aczb a;
    public final Set b;
    public boolean c;
    private final Handler e;
    
    static {
        d = EnumSet.allOf(adak.class);
    }
    
    public adal(final aczb a, final Handler e) {
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        this.b = EnumSet.noneOf(adak.class);
    }
    
    public final void a(final adak... array) {
        this.b.addAll(Arrays.asList(array));
        if (!this.c) {
            if (this.b.containsAll(adal.d)) {
                this.e.post((Runnable)new adaj(this, 0));
                this.c = true;
            }
        }
    }
}
