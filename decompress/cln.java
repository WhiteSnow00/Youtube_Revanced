import android.os.Build;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cln implements clr
{
    public static final Set a;
    private final String b;
    private final String c;
    
    static {
        a = new HashSet();
    }
    
    public cln(final String b, final String c) {
        this.b = b;
        this.c = c;
        cln.a.add(this);
    }
    
    public abstract boolean a();
    
    @Override
    public final String b() {
        return this.b;
    }
    
    @Override
    public final boolean c() {
        return this.a() || this.d();
    }
    
    public boolean d() {
        final Set a = cle.a;
        final String c = this.c;
        final boolean contains = a.contains(c);
        boolean b = true;
        if (!contains) {
            if (!"eng".equals(Build.TYPE) && !"userdebug".equals(Build.TYPE)) {
                b = false;
            }
            else {
                if (!a.contains(c.concat(":dev"))) {
                    return false;
                }
                b = b;
            }
        }
        return b;
    }
}
