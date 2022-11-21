import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhx extends ahcz implements aheo
{
    public static final aqhx a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqhx.class, a = new aqhx());
    }
    
    private aqhx() {
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
                final ahev b;
                if ((b = aqhx.b) == null) {
                    synchronized (aqhx.class) {
                        if (aqhx.b == null) {
                            aqhx.b = (ahev)new ahcs((ahcz)aqhx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqhx.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhx.a);
            }
            case 3: {
                return new aqhx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhx.a, "\u0001\u0000", null);
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
