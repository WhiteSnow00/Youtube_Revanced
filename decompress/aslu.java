import java.io.PrintWriter;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslu extends asls
{
    private final PrintWriter a;
    
    public aslu(final PrintWriter a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        this.a.println(o);
    }
}
