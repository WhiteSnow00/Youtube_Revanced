import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etr
{
    public final rom a;
    public final Set b;
    public aciw c;
    public hw d;
    
    public etr(final rom a) {
        this.a = a;
        this.b = new HashSet();
    }
    
    public final void a(final Object o) {
        ahju ahju = ahju.a;
        if (o instanceof abzh && (ahju = ((abzh)o).b().g) == null) {
            ahju = ahju.a;
        }
        final int b = ahju.b;
        if ((b & 0x1) == 0x0) {
            if ((b & 0x2) == 0x0) {
                return;
            }
        }
        if (this.b.contains(ahju)) {
            return;
        }
        final rom a = this.a;
        ahlg ahlg;
        if ((ahlg = ahju.c) == null) {
            ahlg = ahlg.a;
        }
        ahjr ahjr;
        if ((ahjr = ahju.d) == null) {
            ahjr = ahjr.a;
        }
        a.a(ahlg, ahjr);
        this.b.add(ahju);
    }
}
