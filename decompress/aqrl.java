import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrl extends ahcz implements aheo
{
    public static final aqrl a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqrl.class, a = new aqrl());
    }
    
    private aqrl() {
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
                if ((b = aqrl.b) == null) {
                    synchronized (aqrl.class) {
                        if (aqrl.b == null) {
                            aqrl.b = (ahev)new ahcs((ahcz)aqrl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrl.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrl.a);
            }
            case 3: {
                return new aqrl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrl.a, "\u0001\u0000", null);
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
