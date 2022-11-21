import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrz extends ahcz implements aheo
{
    public static final agrz a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agrz.class, a = new agrz());
    }
    
    private agrz() {
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
                if ((b = agrz.b) == null) {
                    synchronized (agrz.class) {
                        if (agrz.b == null) {
                            agrz.b = (ahev)new ahcs((ahcz)agrz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agrz.a;
            }
            case 4: {
                return new ahcr((ahcz)agrz.a);
            }
            case 3: {
                return new agrz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrz.a, "\u0000\u0000", null);
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
