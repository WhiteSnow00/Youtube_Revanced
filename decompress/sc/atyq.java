import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyq extends ahbh implements ahcw
{
    public static final atyq a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public atyp d;
    
    static {
        ahbh.registerDefaultInstance((Class)atyq.class, (ahbh)(a = new atyq()));
    }
    
    private atyq() {
        this.c = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atyq.e) == null) {
                    synchronized (atyq.class) {
                        if (atyq.e == null) {
                            atyq.e = (ahdd)new ahba((ahbh)atyq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atyq.a;
            }
            case 4: {
                return new ahaz((char[][][])null);
            }
            case 3: {
                return new atyq();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\u1009\u0000", new Object[] { "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
