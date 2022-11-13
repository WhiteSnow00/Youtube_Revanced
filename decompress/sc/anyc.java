import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anyc extends ahbh implements ahcw
{
    public static final anyc a;
    private static volatile ahdd c;
    public ahbx b;
    private int d;
    private ajut e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anyc.class, (ahbh)(a = new anyc()));
    }
    
    private anyc() {
        this.f = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anyc.c) == null) {
                    synchronized (anyc.class) {
                        if (anyc.c == null) {
                            anyc.c = (ahdd)new ahba((ahbh)anyc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anyc.a;
            }
            case 4: {
                return new ahaz((short[][])null, (byte[])null);
            }
            case 3: {
                return new anyc();
            }
            case 2: {
                return newMessageInfo((MessageLite)anyc.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u041b\u0003\u1409\u0000", new Object[] { "d", "b", anyd.class, "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
