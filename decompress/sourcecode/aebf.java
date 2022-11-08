// 
// Decompiled by Procyon v0.6.0
// 

public final class aebf implements aebk
{
    public final atjj a;
    private final atjj b;
    private final atjj c;
    private final atjj d;
    private final atjj e;
    private final atjj f;
    private final atjj g;
    private final atjj h;
    private final atjj i;
    private final atjj j;
    private final atjj k;
    
    public aebf(final aeby aeby, final byte[] array) {
        final adzd b = new adzd(aeby, 2, (byte[])null);
        this.b = (atjj)b;
        final atjj c = arjc.c((atjj)new aebs((atjj)b, 3));
        this.c = c;
        final atjj c2 = arjc.c((atjj)new aebs(aeby, 0, (byte[])null));
        this.d = c2;
        final atjj c3 = arjc.c((atjj)new abvu((atjj)b, 19));
        this.e = c3;
        final atjj c4 = arjc.c((atjj)new aebs((atjj)b, 4));
        this.f = c4;
        final atjj c5 = arjc.c((atjj)new abwt(c, c2, c3, c4, 3, (short[])null));
        this.g = c5;
        final atjj c6 = arjc.c((atjj)new aebs((atjj)b, 1));
        this.h = c6;
        final abvu i = new abvu(c6, 20);
        this.i = (atjj)i;
        final atjj c7 = arjc.c((atjj)new abwt((atjj)b, c6, c3, (atjj)i, 4, (int[])null));
        this.j = c7;
        final atjj c8 = arjc.c((atjj)new abjy(c5, c7, c6, 12, (short[][])null));
        this.k = c8;
        this.a = arjc.c((atjj)new aebs(c8, 2));
    }
}
