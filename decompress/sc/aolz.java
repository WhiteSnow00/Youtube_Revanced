import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolz extends ahbh implements ahcw
{
    public static final aolz a;
    private static volatile ahdd d;
    public ahbx b;
    public ahbx c;
    
    static {
        ahbh.registerDefaultInstance((Class)aolz.class, (ahbh)(a = new aolz()));
    }
    
    private aolz() {
        this.b = emptyProtobufList();
        this.c = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aolz.d) == null) {
                    synchronized (aolz.class) {
                        if (aolz.d == null) {
                            aolz.d = (ahdd)new ahba((ahbh)aolz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aolz.a;
            }
            case 4: {
                return new ahaz((ahbh)aolz.a);
            }
            case 3: {
                return new aolz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolz.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[] { "b", ahmw.class, "c" });
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
