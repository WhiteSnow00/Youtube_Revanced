import java.io.PrintStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslt extends asls
{
    private final PrintStream a;
    
    public aslt(final PrintStream a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        this.a.println(o);
    }
}
