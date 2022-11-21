import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class bbo extends IOException
{
    public final int a;
    
    public bbo(final int a) {
        this.a = a;
    }
    
    public bbo(final String s, final int a) {
        super(s);
        this.a = a;
    }
    
    public bbo(final String s, final Throwable t, final int a) {
        super(s, t);
        this.a = a;
    }
    
    public bbo(final Throwable t, final int a) {
        super(t);
        this.a = a;
    }
    
    public static boolean sN(IOException cause) {
        while (cause != null) {
            if (cause instanceof bbo && ((bbo)cause).a == 2008) {
                return true;
            }
            cause = (IOException)cause.getCause();
        }
        return false;
    }
}
