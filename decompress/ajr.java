import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajr
{
    public final LocaleList a;
    
    public ajr(final Object o) {
        this.a = (LocaleList)o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals((Object)((ajr)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
