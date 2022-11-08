import java.io.PrintStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class asii extends asih
{
    private final PrintStream a;
    
    public asii(final PrintStream a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        this.a.println(o);
    }
}
