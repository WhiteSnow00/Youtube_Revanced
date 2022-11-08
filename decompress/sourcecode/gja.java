import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gja implements gjc
{
    public final vax a;
    public aioe b;
    public aioe c;
    public aioe d;
    
    public gja(final vax a, final abzh abzh) {
        this.a = a;
        ajkl ajkl;
        if ((abzh.b().b & 0x80000) != 0x0) {
            if ((ajkl = abzh.b().j) == null) {
                ajkl = ajkl.a;
            }
        }
        else {
            ajkl = null;
        }
        if (ajkl != null) {
            aioe b;
            if ((b = ajkl.b) == null) {
                b = aioe.a;
            }
            this.b = b;
            aioe c;
            if ((c = ajkl.c) == null) {
                c = aioe.a;
            }
            this.c = c;
            aioe d;
            if ((d = ajkl.d) == null) {
                d = aioe.a;
            }
            this.d = d;
        }
    }
    
    public final boolean b(final gjc gjc) {
        if (gjc instanceof gja) {
            final aioe b = this.b;
            final gja gja = (gja)gjc;
            if (Objects.equals((Object)b, (Object)gja.b) && Objects.equals((Object)this.c, (Object)gja.c) && Objects.equals((Object)this.d, (Object)gja.d)) {
                return true;
            }
        }
        return false;
    }
    
    public final asgn pR(final int n) {
        return asgn.u((asir)new lff(this, n, 1));
    }
}
