import android.media.AudioAttributes$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axu
{
    public static void a(final AudioAttributes$Builder audioAttributes$Builder, final int spatializationBehavior) {
        audioAttributes$Builder.setSpatializationBehavior(spatializationBehavior);
    }
    
    public static final aze b(final slt slt) {
        return new aze(slt.n());
    }
    
    public static final void c(final aze aze, final slt slt) {
        final int b = aze.b;
        final aye a = aze.a;
        for (int i = 0; i < a.b(); ++i) {
            slt.o(a.a(i));
        }
    }
    
    public static final void d(final int n, final boolean b, final slt slt) {
        if (b) {
            slt.o(n);
        }
    }
}
