import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubo extends ahcz implements aheo
{
    public static final aubo a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aubo.class, a = new aubo());
    }
    
    private aubo() {
        emptyLongList();
        emptyLongList();
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
                if ((b = aubo.b) == null) {
                    synchronized (aubo.class) {
                        if (aubo.b == null) {
                            aubo.b = (ahev)new ahcs((ahcz)aubo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aubo.a;
            }
            case 4: {
                return new ahcr((ahcz)aubo.a);
            }
            case 3: {
                return new aubo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubo.a, "\u0001\u0000", null);
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
