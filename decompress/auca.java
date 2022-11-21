import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auca extends ahcz implements aheo
{
    public static final auca a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(auca.class, a = new auca());
    }
    
    private auca() {
        emptyProtobufList();
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = auca.b) == null) {
                    synchronized (auca.class) {
                        if (auca.b == null) {
                            auca.b = (ahev)new ahcs((ahcz)auca.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return auca.a;
            }
            case 4: {
                return new ahcr((ahcz)auca.a);
            }
            case 3: {
                return new auca();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)auca.a, "\u0001\u0000", null);
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
