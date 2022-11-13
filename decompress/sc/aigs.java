import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigs extends ahbh implements ahcw
{
    public static final aigs a;
    private static volatile ahdd b;
    private int c;
    private aigw d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aigs.class, (ahbh)(a = new aigs()));
    }
    
    private aigs() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aigs.b) == null) {
                    synchronized (aigs.class) {
                        if (aigs.b == null) {
                            aigs.b = (ahdd)new ahba((ahbh)aigs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigs.a;
            }
            case 4: {
                return new ahaz((ahbh)aigs.a);
            }
            case 3: {
                return new aigs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigs.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
