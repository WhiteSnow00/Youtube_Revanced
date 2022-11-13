// 
// Decompiled by Procyon v0.6.0
// 

public final class aude
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;
    public final int h;
    
    public aude(final audc audc) {
        this.a = audc.d;
        final String e = audc.e;
        final String f = audc.f;
        this.b = audc.g;
        this.c = audc.h;
        this.d = audc.i;
        final aucz j = audc.j;
        final aucz a = aucz.a;
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
        this.f = audc.l;
        this.g = audc.m;
        this.h = audc.b(10);
    }
}
