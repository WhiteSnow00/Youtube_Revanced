import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etu
{
    public final rqq a;
    public final Set b;
    public ackz c;
    public hw d;
    
    public etu(final rqq a) {
        this.a = a;
        this.b = new HashSet();
    }
    
    public final void a(final Object o) {
        ahls ahls = ahls.a;
        if (o instanceof acbj && (ahls = ((acbj)o).b().g) == null) {
            ahls = ahls.a;
        }
        final int b = ahls.b;
        if ((b & 0x1) == 0x0) {
            if ((b & 0x2) == 0x0) {
                return;
            }
        }
        if (this.b.contains(ahls)) {
            return;
        }
        final rqq a = this.a;
        ahne ahne;
        if ((ahne = ahls.c) == null) {
            ahne = ahne.a;
        }
        ahlp ahlp;
        if ((ahlp = ahls.d) == null) {
            ahlp = ahlp.a;
        }
        a.a(ahne, ahlp);
        this.b.add(ahls);
    }
}
