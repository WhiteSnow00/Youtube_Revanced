import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejv extends ahcz implements aheo
{
    public static final aejv a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aejv.class, a = new aejv());
    }
    
    private aejv() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                if ((c = aejv.c) == null) {
                    synchronized (aejv.class) {
                        if (aejv.c == null) {
                            aejv.c = (ahev)new ahcs((ahcz)aejv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aejv.a;
            }
            case 4: {
                return new ahcr((ahcz)aejv.a);
            }
            case 3: {
                return new aejv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aejv.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1007\u0005", new Object[] { "d", "b" });
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
