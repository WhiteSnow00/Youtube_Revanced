// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import java.util.List;

public final class WindowLayoutInfo
{
    private final List displayFeatures;
    
    public WindowLayoutInfo(final List displayFeatures) {
        displayFeatures.getClass();
        this.displayFeatures = displayFeatures;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && atqz.c(this.getClass(), o.getClass()) && atqz.c(this.displayFeatures, ((WindowLayoutInfo)o).displayFeatures));
    }
    
    public final List getDisplayFeatures() {
        return this.displayFeatures;
    }
    
    @Override
    public int hashCode() {
        return this.displayFeatures.hashCode();
    }
    
    @Override
    public String toString() {
        return atzd.n((Iterable)this.displayFeatures, (CharSequence)", ", (CharSequence)"WindowLayoutInfo{ DisplayFeatures[", (CharSequence)"] }", (atqd)null, 56);
    }
}
