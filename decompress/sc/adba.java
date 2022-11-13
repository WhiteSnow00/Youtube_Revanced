import java.net.ProxySelector;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adba implements afaq
{
    private final int a;
    
    public adba(final int a) {
        this.a = a;
    }
    
    public final Object a() {
        final int a = this.a;
        if (a == 0) {
            return new aclf();
        }
        if (a == 1) {
            return new icw();
        }
        if (a == 2) {
            return new aclf();
        }
        if (a != 3) {
            return ProxySelector.getDefault();
        }
        return afam.c();
    }
}
