import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqra extends ahcz implements aheo
{
    public static final aqra a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqra.class, a = new aqra());
    }
    
    private aqra() {
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
                if ((b = aqra.b) == null) {
                    synchronized (aqra.class) {
                        if (aqra.b == null) {
                            aqra.b = (ahev)new ahcs((ahcz)aqra.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqra.a;
            }
            case 4: {
                return new ahcr((ahcz)aqra.a);
            }
            case 3: {
                return new aqra();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqra.a, "\u0001\u0000", null);
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
