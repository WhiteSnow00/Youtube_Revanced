import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsj extends ahcz implements aheo
{
    public static final apsj a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apsj.class, a = new apsj());
    }
    
    private apsj() {
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
                if ((b = apsj.b) == null) {
                    synchronized (apsj.class) {
                        if (apsj.b == null) {
                            apsj.b = (ahev)new ahcs((ahcz)apsj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsj.a;
            }
            case 4: {
                return new ahcr((ahcz)apsj.a);
            }
            case 3: {
                return new apsj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsj.a, "\u0001\u0000", null);
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
