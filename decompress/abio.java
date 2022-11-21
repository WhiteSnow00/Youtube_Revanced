import java.util.Collection;
import java.util.List;
import j$.time.Duration;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abio
{
    public Animator$AnimatorListener a;
    private Duration b;
    private afgh c;
    private afgh d;
    
    public final abip a() {
        final Duration b = this.b;
        if (b != null) {
            final afgh c = this.c;
            if (c != null) {
                final afgh d = this.d;
                if (d != null) {
                    return new abip(b, c, d, this.a);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" delayBetweenAnimationsInSequence");
        }
        if (this.c == null) {
            sb.append(" views");
        }
        if (this.d == null) {
            sb.append(" animationSteps");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final List list) {
        this.d = afgh.o(list);
    }
    
    public final void c(final Duration b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null delayBetweenAnimationsInSequence");
    }
    
    public final void d(final List list) {
        this.c = afgh.o(list);
    }
}
