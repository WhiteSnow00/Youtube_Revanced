import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwb extends ahbh implements ahcw
{
    public static final anwb a;
    private static volatile ahdd l;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    public ajut f;
    public aiqj g;
    public anwa h;
    public ahbx i;
    public anvy j;
    public ahab k;
    private ajut m;
    private anuv n;
    private anuv o;
    private anuv p;
    private ahhu q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)anwb.class, (ahbh)(a = new anwb()));
    }
    
    private anwb() {
        this.c = 0;
        this.r = 2;
        this.i = emptyProtobufList();
        this.k = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = anwb.l) == null) {
                    synchronized (anwb.class) {
                        if (anwb.l == null) {
                            anwb.l = (ahdd)new ahba((ahbh)anwb.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return anwb.a;
            }
            case 4: {
                return new ahaz((ahbh)anwb.a);
            }
            case 3: {
                return new anwb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwb.a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u143c\u0000\u0004\u1409\u0006\u0005\u1409\u000b\u0006\u100a\f\u0007\u143c\u0000\b\u1009\b\t\u041b\n\u1409\u0003\u000b\u1409\u0007\f\u1409\u0001\r\u1409\t\u000e\u1409\n", new Object[] { "d", "c", "b", "e", "f", aijz.class, "h", "q", "k", akdi.class, "j", "i", anvz.class, "g", "n", "m", "o", "p" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
