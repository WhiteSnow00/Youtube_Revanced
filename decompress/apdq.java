import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdq extends ahcz implements aheo
{
    public static final apdq a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apdq.class, a = new apdq());
    }
    
    private apdq() {
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
                if ((b = apdq.b) == null) {
                    synchronized (apdq.class) {
                        if (apdq.b == null) {
                            apdq.b = (ahev)new ahcs((ahcz)apdq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdq.a;
            }
            case 4: {
                return new ahcr((ahcz)apdq.a);
            }
            case 3: {
                return new apdq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdq.a, "\u0001\u0000", null);
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
