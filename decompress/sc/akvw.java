import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvw extends ahbh implements ahcw
{
    public static final akvw a;
    private static volatile ahdd f;
    public int b;
    public akli c;
    public ahbx d;
    public ajut e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akvw.class, (ahbh)(a = new akvw()));
    }
    
    private akvw() {
        this.g = 2;
        this.d = emptyProtobufList();
        emptyProtobufList();
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
                final ahdd f;
                if ((f = akvw.f) == null) {
                    synchronized (akvw.class) {
                        if (akvw.f == null) {
                            akvw.f = (ahdd)new ahba((ahbh)akvw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akvw.a;
            }
            case 4: {
                return new ahaz((ahbh)akvw.a);
            }
            case 3: {
                return new akvw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvw.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001", new Object[] { "b", "c", "d", anuv.class, "e" });
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
