import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aona extends ahbh implements ahcw
{
    public static final aona a;
    private static volatile ahdd l;
    public int b;
    public ahbx c;
    public ahbx d;
    public ahab e;
    public ajut f;
    public akdi g;
    public aida h;
    public aida i;
    public aomz j;
    public ahil k;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)aona.class, (ahbh)(a = new aona()));
    }
    
    private aona() {
        this.n = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = ahab.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = aona.l) == null) {
                    synchronized (aona.class) {
                        if (aona.l == null) {
                            aona.l = (ahdd)new ahba((ahbh)aona.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aona.a;
            }
            case 4: {
                return new ahaz((ahbh)aona.a);
            }
            case 3: {
                return new aona();
            }
            case 2: {
                return newMessageInfo((MessageLite)aona.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0002\b\u0001\u041b\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1009\b\f\u1409\u0007", new Object[] { "b", "c", aonb.class, "d", aonc.class, "m", "e", "f", "g", "h", "i", "k", "j" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
