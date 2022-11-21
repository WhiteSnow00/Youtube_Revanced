import java.util.AbstractList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acsn implements acsp
{
    public final List a;
    private final int b;
    
    public acsn(final acmr a, final int b) {
        this.b = b;
        this.a = (List)a;
    }
    
    public acsn(final List a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        if (this.b != 0) {
            ((AbstractList)this.a).add(o);
            return;
        }
        this.a.add(o);
    }
}
