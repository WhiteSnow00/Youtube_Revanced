import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebt
{
    public final List a;
    public final List b;
    
    public aebt(final aeim aeim, final byte[] array, final byte[] array2) {
        this.a = new ArrayList((Collection)aeim.a);
        this.b = new ArrayList((Collection)aeim.b);
    }
    
    @Override
    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
