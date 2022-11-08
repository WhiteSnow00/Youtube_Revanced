// 
// Decompiled by Procyon v0.6.0
// 

public final class aucn
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;
    public final int h;
    
    public aucn(final aucl aucl) {
        this.a = aucl.d;
        final String e = aucl.e;
        final String f = aucl.f;
        this.b = aucl.g;
        this.c = aucl.h;
        this.d = aucl.i;
        final auci j = aucl.j;
        final auci a = auci.a;
        final int ordinal = j.ordinal();
        int e2;
        if (ordinal != 0) {
            e2 = 3;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("Unknown internal builder cache mode");
                    }
                    e2 = 1;
                }
                else {
                    e2 = 2;
                }
            }
        }
        else {
            e2 = 0;
        }
        this.e = e2;
        this.f = aucl.l;
        this.g = aucl.m;
        this.h = aucl.b(10);
    }
}
