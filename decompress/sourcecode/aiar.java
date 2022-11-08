import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiar extends agzi implements ahax
{
    public static final aiar a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aiar.class, (agzi)(a = new aiar()));
    }
    
    private aiar() {
        agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aiar.b) == null) {
                    synchronized (aiar.class) {
                        if (aiar.b == null) {
                            aiar.b = (ahbe)new agzb((agzi)aiar.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiar.a;
            }
            case 4: {
                return new agza((agzi)aiar.a);
            }
            case 3: {
                return new aiar();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiar.a, "\u0001\u0000", (Object[])null);
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
