// 
// Decompiled by Procyon v0.6.0
// 

public final class aeez implements aefe
{
    public final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    private final atnb f;
    private final atnb g;
    private final atnb h;
    private final atnb i;
    private final atnb j;
    private final atnb k;
    
    public aeez(final aefs aefs, final byte[] array) {
        final aecx b = new aecx(aefs, 2, (byte[])null);
        this.b = (atnb)b;
        final atnb c = arol.c(new aefm((atnb)b, 4));
        this.c = c;
        final atnb c2 = arol.c(new aefm(aefs, 2, null));
        this.d = c2;
        final atnb c3 = arol.c((atnb)new abzh((atnb)b, 20));
        this.e = c3;
        final atnb c4 = arol.c(new aefm((atnb)b, 5));
        this.f = c4;
        final atnb c5 = arol.c(new abvz(c, c2, c3, c4, 5, (int[])null));
        this.g = c5;
        final atnb c6 = arol.c(new aefm((atnb)b, 0));
        this.h = c6;
        final aefm i = new aefm(c6, 1);
        this.i = i;
        final atnb c7 = arol.c(new abvz((atnb)b, c6, c3, i, 6, (boolean[])null));
        this.j = c7;
        final atnb c8 = arol.c((atnb)new abrl(c5, c7, c6, 11, (char[][])null));
        this.k = c8;
        this.a = arol.c(new aefm(c8, 3));
    }
}
