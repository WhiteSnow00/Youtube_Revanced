import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqw extends ahbh implements ahcw
{
    public static final afqw a;
    private static volatile ahdd e;
    public int b;
    public afqx c;
    public ahbp d;
    
    static {
        ahbh.registerDefaultInstance((Class)afqw.class, (ahbh)(a = new afqw()));
    }
    
    private afqw() {
        emptyProtobufList();
        this.d = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = afqw.e) == null) {
                    synchronized (afqw.class) {
                        if (afqw.e == null) {
                            afqw.e = (ahdd)new ahba((ahbh)afqw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afqw.a;
            }
            case 4: {
                return new ahaz((ahbh)afqw.a);
            }
            case 3: {
                return new afqw();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqw.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0004\u001e", new Object[] { "b", "c", "d", afqv.b() });
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
