import java.util.concurrent.TimeUnit;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.jar.g;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmz implements asmn
{
    public final boolean a;
    public final Object b;
    private final int c;
    
    public abmz(final abnb b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abmz(final a b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object a(final Object o) {
        if (this.c != 0) {
            return g.g((Context)o, (a)this.b, this.a);
        }
        final Object b = this.b;
        final boolean a = this.a;
        askj askj;
        if (!((Optional)o).isPresent()) {
            askj = askj.B(false);
        }
        else if (a) {
            askj = askj.B(true);
        }
        else {
            final abnb abnb = (abnb)b;
            if ((abnb.l != null && (abnb.l.X() || abnb.l.m().ad())) || abnb.a.w()) {
                askj = askj.B(true);
            }
            else {
                final long d = abnb.d;
                if (d > 0L) {
                    askj = ((askj)abnb.n).P(d, TimeUnit.MILLISECONDS, abnb.g, askj.B(false));
                }
                else {
                    askj = askj.B(true);
                }
            }
        }
        return askj;
    }
}
