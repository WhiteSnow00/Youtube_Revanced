import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrr extends ahcz implements aheo
{
    public static final agrr a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agrr.class, a = new agrr());
    }
    
    private agrr() {
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
                if ((b = agrr.b) == null) {
                    synchronized (agrr.class) {
                        if (agrr.b == null) {
                            agrr.b = (ahev)new ahcs((ahcz)agrr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agrr.a;
            }
            case 4: {
                return new ahcr((ahcz)agrr.a);
            }
            case 3: {
                return new agrr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrr.a, "\u0000\u0000", null);
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
