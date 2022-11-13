import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptt extends ahbh implements ahcw
{
    public static final aptt a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aptt.class, (ahbh)(a = new aptt()));
    }
    
    private aptt() {
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aptt.e) == null) {
                    synchronized (aptt.class) {
                        if (aptt.e == null) {
                            aptt.e = (ahdd)new ahba((ahbh)aptt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aptt.a;
            }
            case 4: {
                return new ahaz((ahbh)aptt.a);
            }
            case 3: {
                return new aptt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
