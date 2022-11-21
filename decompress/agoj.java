import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoj extends Exception
{
    public agoj(final String s) {
        super(s);
        if (s == null) {
            return;
        }
        s.toLowerCase(Locale.US).hashCode();
    }
}
