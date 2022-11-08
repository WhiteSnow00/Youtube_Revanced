import java.util.concurrent.TimeUnit;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqf implements Comparator
{
    private final boolean a;
    private final int b;
    
    public iqf(final int b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    private static Long b(final aitc aitc) {
        final TimeUnit seconds = TimeUnit.SECONDS;
        aita aita;
        if ((aita = aitc.l) == null) {
            aita = aita.a;
        }
        aitf a;
        if (aita.b == 135744618) {
            a = (aitf)aita.c;
        }
        else {
            a = aitf.a;
        }
        return seconds.toMillis(a.c);
    }
    
    private static String c(final aitc aitc) {
        final int b = aitc.b;
        final ajsq ajsq = null;
        ajsq ajsq2;
        if ((b & 0x1) != 0x0) {
            if ((ajsq2 = aitc.g) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        String w;
        if (abyh.b(ajsq2) == null) {
            w = "";
        }
        else {
            ajsq ajsq3 = ajsq;
            if ((aitc.b & 0x1) != 0x0 && (ajsq3 = aitc.g) == null) {
                ajsq3 = ajsq.a;
            }
            w = aeda.w(abyh.b(ajsq3).toString());
        }
        return w;
    }
    
    public final int a(final aitc aitc, final aitc aitc2) {
        if (this.b == 3) {
            int n;
            if (this.a) {
                n = b(aitc2).compareTo(b(aitc));
            }
            else {
                n = b(aitc).compareTo(b(aitc2));
            }
            return n;
        }
        int n2;
        if (this.a) {
            n2 = c(aitc2).compareTo(c(aitc));
        }
        else {
            n2 = c(aitc).compareTo(c(aitc2));
        }
        return n2;
    }
}
