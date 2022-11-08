import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class bbl extends IOException
{
    public final int a;
    
    public bbl(final int a) {
        this.a = a;
    }
    
    public bbl(final String s, final int a) {
        super(s);
        this.a = a;
    }
    
    public bbl(final String s, final Throwable t, final int a) {
        super(s, t);
        this.a = a;
    }
    
    public bbl(final Throwable t, final int a) {
        super(t);
        this.a = a;
    }
    
    public static boolean sH(IOException cause) {
        while (cause != null) {
            if (cause instanceof bbl && ((bbl)cause).a == 2008) {
                return true;
            }
            cause = (IOException)cause.getCause();
        }
        return false;
    }
}
