import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnb extends IOException
{
    public bnb(final int n) {
        String s;
        if (n != 0) {
            if (n != 1) {
                s = "start exceeds end";
            }
            else {
                s = "not seekable to start";
            }
        }
        else {
            s = "invalid period count";
        }
        super("Illegal clipping: ".concat(s));
    }
}
