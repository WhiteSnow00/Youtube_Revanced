import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrj extends ahcz implements aheo
{
    public static final aqrj a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(aqrj.class, a = new aqrj());
    }
    
    private aqrj() {
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
                if ((b = aqrj.b) == null) {
                    synchronized (aqrj.class) {
                        if (aqrj.b == null) {
                            aqrj.b = (ahev)new ahcs((ahcz)aqrj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrj.a);
            }
            case 3: {
                return new aqrj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrj.a, "\u0001\u0000", null);
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
