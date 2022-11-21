import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqce extends ahcz implements aheo
{
    public static final aqce a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqce.class, a = new aqce());
    }
    
    private aqce() {
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
                if ((b = aqce.b) == null) {
                    synchronized (aqce.class) {
                        if (aqce.b == null) {
                            aqce.b = (ahev)new ahcs((ahcz)aqce.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqce.a;
            }
            case 4: {
                return new ahcr((ahcz)aqce.a);
            }
            case 3: {
                return new aqce();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqce.a, "\u0001\u0000", null);
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
