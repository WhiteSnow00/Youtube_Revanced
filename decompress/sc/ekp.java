import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekp extends ekg
{
    public final eka a(final String s, final hyx hyx, final List list) {
        if (s == null || s.isEmpty() || !hyx.C(s)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", s));
        }
        final eka y = hyx.y(s);
        if (y instanceof eju) {
            return ((eju)y).a(hyx, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", s));
    }
}
