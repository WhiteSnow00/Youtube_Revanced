import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmh
{
    public final Uri a;
    public final boolean b;
    
    public cmh(final Uri a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends cmh> class1 = this.getClass();
        Class<?> class2;
        if (o != null) {
            class2 = o.getClass();
        }
        else {
            class2 = null;
        }
        if (!atqz.c(class1, class2)) {
            return false;
        }
        o.getClass();
        final cmh cmh = (cmh)o;
        return atqz.c(this.a, cmh.a) && this.b == cmh.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return hashCode * 31 + n;
    }
}
