import java.io.PrintStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class asix extends asiw
{
    private final PrintStream a;
    
    public asix(final PrintStream a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        this.a.println(o);
    }
}
