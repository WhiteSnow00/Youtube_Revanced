import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjc extends ahbh implements ahcw
{
    public static final ahjc a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjc.class, (ahbh)(a = new ahjc()));
    }
    
    private ahjc() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahjc.c) == null) {
                    synchronized (ahjc.class) {
                        if (ahjc.c == null) {
                            ahjc.c = (ahdd)new ahba((ahbh)ahjc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahjc.a;
            }
            case 4: {
                return new ahaz((boolean[][][])null, (short[][][])null);
            }
            case 3: {
                return new ahjc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahjb.class });
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
