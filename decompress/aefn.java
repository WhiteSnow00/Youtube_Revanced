import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefn
{
    public final List a;
    public final List b;
    
    public aefn(final aheu aheu, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new ArrayList((Collection)aheu.b);
        this.b = new ArrayList((Collection)aheu.a);
    }
    
    @Override
    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
