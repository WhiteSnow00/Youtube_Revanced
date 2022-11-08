import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.CinematicContainerRendererOuterClass$CinematicContainerRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcm
{
    private static final aijb b;
    
    static {
        b = aijb.f;
    }
    
    public static float a(final aija aija) {
        if ((aija.b & 0x200) != 0x0) {
            return aija.k;
        }
        return 260.0f;
    }
    
    public static float b(final aija aija) {
        if ((aija.b & 0x100) != 0x0) {
            return aija.j;
        }
        return 0.667f;
    }
    
    public static int c(final aija aija) {
        if ((aija.b & 0x2) != 0x0) {
            return aija.d;
        }
        return -16777216;
    }
    
    public static long d(final aiiz aiiz) {
        if ((aiiz.b & 0x2) != 0x0) {
            return aiiz.d;
        }
        return 5000L;
    }
    
    public static long e(final aiiz aiiz) {
        float e;
        if ((aiiz.b & 0x4) != 0x0) {
            e = aiiz.e;
        }
        else {
            e = 0.5f;
        }
        return (long)(e * d(aiiz));
    }
    
    public static long f(final aiiz aiiz) {
        if ((aiiz.b & 0x1) != 0x0) {
            return Math.max(0L, aiiz.c - 500L);
        }
        return 4500L;
    }
    
    public static gcg g(final aija aija) {
        final int b = aija.b;
        float n;
        if ((b & 0x8) != 0x0) {
            n = aija.f;
        }
        else {
            n = 2.0f;
        }
        float h;
        if ((b & 0x20) != 0x0) {
            h = aija.h;
        }
        else {
            h = n;
        }
        if ((b & 0x10) != 0x0) {
            n = aija.g;
        }
        return new gcg(h, n);
    }
    
    public static aijb h(final CinematicContainerRendererOuterClass$CinematicContainerRenderer cinematicContainerRendererOuterClass$CinematicContainerRenderer) {
        if ((cinematicContainerRendererOuterClass$CinematicContainerRenderer.b & 0x2) != 0x0) {
            aijb aijb;
            if ((aijb = aijb.b(cinematicContainerRendererOuterClass$CinematicContainerRenderer.e)) == null) {
                aijb = aijb.a;
            }
            return aijb;
        }
        return gcm.b;
    }
    
    public static asgt i(final asgt asgt) {
        return asgt.L((asjc)flt.r).W((Object)Optional.empty()).p().ax().aD();
    }
    
    public static Optional j(final aiiz aiiz) {
        if ((aiiz.b & 0x8) == 0x0) {
            return Optional.of((Object)20L);
        }
        final int f = aiiz.f;
        if (f <= 0) {
            return Optional.empty();
        }
        return Optional.of((Object)(long)f);
    }
    
    public static List k(final List list, final boolean b) {
        final ArrayList list2 = new ArrayList();
        for (final aijd aijd : list) {
            int n = 0;
            if (b) {
                if ((aijd.b & 0x1) != 0x0) {
                    n = aijd.c;
                }
            }
            else if ((aijd.b & 0x2) != 0x0) {
                n = aijd.d;
            }
            list2.add(new gck(aijd.e, n));
        }
        return list2;
    }
}
