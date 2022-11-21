import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexw extends ahcz implements aheo
{
    public static final aexw a;
    private static volatile ahev c;
    public ahdh b;
    
    static {
        ahcz.registerDefaultInstance(aexw.class, a = new aexw());
    }
    
    private aexw() {
        this.b = ahcz.emptyIntList();
        ahcz.emptyProtobufList();
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
                if ((c = aexw.c) == null) {
                    synchronized (aexw.class) {
                        if (aexw.c == null) {
                            aexw.c = (ahev)new ahcs((ahcz)aexw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aexw.a;
            }
            case 4: {
                return new ahcr((ahcz)aexw.a);
            }
            case 3: {
                return new aexw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexw.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001e", new Object[] { "b", aemb.e });
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
