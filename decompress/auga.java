// 
// Decompiled by Procyon v0.6.0
// 

public final class auga
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;
    public final int h;
    
    public auga(final aufy aufy) {
        this.a = aufy.d;
        final String e = aufy.e;
        final String f = aufy.f;
        this.b = aufy.g;
        this.c = aufy.h;
        this.d = aufy.i;
        final aufv j = aufy.j;
        final aufv a = aufv.a;
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
        this.f = aufy.l;
        this.g = aufy.m;
        this.h = aufy.b(10);
    }
}
