import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class inz
{
    public static aexq a(final aexq aexq) {
        if (!aexq.h()) {
            return aewp.a;
        }
        final amtx c = ((apwi)aexq.c()).c();
        if (c == null) {
            return aewp.a;
        }
        final amth w = jfi.w(c);
        if (w != null && w.g > 0) {
            return aexq.k((Object)(int)TimeUnit.SECONDS.toDays(w.g));
        }
        return aewp.a;
    }
}
