import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlg extends ahbh implements ahcw
{
    public static final amlg a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)amlg.class, (ahbh)(a = new amlg()));
    }
    
    private amlg() {
        this.g = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = amlg.b) == null) {
                    synchronized (amlg.class) {
                        if (amlg.b == null) {
                            amlg.b = (ahdd)new ahba((ahbh)amlg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amlg.a;
            }
            case 4: {
                return new ahaz((ahbh)amlg.a);
            }
            case 3: {
                return new amlg();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlg.a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0003\u0002\u1409\u0002\u0005\u1409\u0001\u0006\u1409\u0000", new Object[] { "c", "f", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
