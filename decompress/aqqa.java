import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqa extends ahcz implements aheo
{
    public static final aqqa a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqqa.class, a = new aqqa());
    }
    
    private aqqa() {
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
                if ((b = aqqa.b) == null) {
                    synchronized (aqqa.class) {
                        if (aqqa.b == null) {
                            aqqa.b = (ahev)new ahcs((ahcz)aqqa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqqa.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqa.a);
            }
            case 3: {
                return new aqqa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqa.a, "\u0001\u0000", null);
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
