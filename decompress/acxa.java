import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxa implements owl
{
    private static boolean c(final String s) {
        return s.startsWith("YouTubeSans") || s.startsWith("YTSans");
    }
    
    private static final Typeface d(final Context context, final afbh afbh) {
        switch (((acwz)afbh.e(acwz.e)).ordinal()) {
            default: {
                return null;
            }
            case 6: {
                return acbx.r.a(context);
            }
            case 5: {
                return acbx.q.a(context);
            }
            case 4: {
                return acbx.p.a(context);
            }
            case 3: {
                return acbx.o.a(context);
            }
            case 2: {
                return acbx.n.a(context);
            }
            case 1: {
                return acbx.m.a(context);
            }
            case 0: {
                return acbx.l.a(context);
            }
        }
    }
    
    public final Typeface a(final Context context, final String s) {
        if (c(s)) {
            for (final acwz acwz : acwz.values()) {
                if (s.equals("YouTubeSans-".concat(String.valueOf(acwz.h)))) {
                    final afbh afbh = afbh.k(acwz);
                    return d(context, afbh);
                }
            }
            final afbh afbh = afag.a;
            return d(context, afbh);
        }
        return null;
    }
    
    public final Typeface b(final Context context, final String s, final int n) {
        final acwz[] values = acwz.values();
        final int length = values.length;
        int i = 0;
        while (true) {
            while (i < length) {
                final acwz acwz = values[i];
                if (n == acwz.i) {
                    final afbh afbh = afbh.k(acwz);
                    if (c(s)) {
                        return d(context, afbh);
                    }
                    return null;
                }
                else {
                    ++i;
                }
            }
            final afbh afbh = afag.a;
            continue;
        }
    }
}
