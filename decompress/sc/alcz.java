import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcz extends ahbh implements ahcw
{
    public static final alcz a;
    private static volatile ahdd m;
    public int b;
    public aklg c;
    public aplf d;
    public alvj e;
    public ahbx f;
    public int g;
    public int h;
    public boolean i;
    public apgy j;
    public boolean k;
    public alcy l;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)alcz.class, (ahbh)(a = new alcz()));
    }
    
    private alcz() {
        this.n = 2;
        this.f = emptyProtobufList();
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
                final ahdd m;
                if ((m = alcz.m) == null) {
                    synchronized (alcz.class) {
                        if (alcz.m == null) {
                            alcz.m = (ahdd)new ahba((ahbh)alcz.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alcz.a;
            }
            case 4: {
                return new ahaz((boolean[][])null, (byte[][][])null);
            }
            case 3: {
                return new alcz();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcz.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0003\u0004\u041b\u0005\u100c\u0004\u0006\u100c\u0005\t\u1007\u0006\n\u1009\u0007\u000b\u1007\b\f\u1009\t", new Object[] { "b", "c", "d", "e", "f", alkt.class, "g", anic.m, "h", akwi.o, "i", "j", "k", "l" });
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
