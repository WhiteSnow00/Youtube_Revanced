import java.io.Serializable;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtz implements Comparator, Serializable
{
    public static final int a(final abtx abtx, final abtx abtx2) {
        final long a = abtx.a;
        final long a2 = abtx2.a;
        if (a != a2) {
            if (a < a2) {
                return -1;
            }
            return 1;
        }
        else {
            if (abtx.a() != abtx2.a()) {
                return abtx2.a() - abtx.a();
            }
            final int n = abtx.c - 1;
            final int n2 = abtx2.c - 1;
            if (n != n2) {
                return n - n2;
            }
            return abtx.b().compareTo(abtx2.b());
        }
    }
}
