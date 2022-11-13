import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmr extends Exception
{
    public agmr(final String s) {
        super(s);
        if (s == null) {
            return;
        }
        s.toLowerCase(Locale.US).hashCode();
    }
}
