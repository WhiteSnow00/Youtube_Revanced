import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexg extends ahcz implements aheo
{
    public static final aexg a;
    private static volatile ahev c;
    public aexf b;
    
    static {
        ahcz.registerDefaultInstance(aexg.class, a = new aexg());
    }
    
    private aexg() {
        ahcz.emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aexg.c) == null) {
                    synchronized (aexg.class) {
                        if (aexg.c == null) {
                            aexg.c = (ahev)new ahcs((ahcz)aexg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aexg.a;
            }
            case 4: {
                return new ahcr((ahcz)aexg.a);
            }
            case 3: {
                return new aexg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexg.a, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[] { "b" });
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
