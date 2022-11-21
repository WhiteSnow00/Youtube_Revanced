import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrh extends ahcz implements aheo
{
    public static final agrh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(agrh.class, a = new agrh());
    }
    
    private agrh() {
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
                if ((b = agrh.b) == null) {
                    synchronized (agrh.class) {
                        if (agrh.b == null) {
                            agrh.b = (ahev)new ahcs((ahcz)agrh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agrh.a;
            }
            case 4: {
                return new ahcr((ahcz)agrh.a);
            }
            case 3: {
                return new agrh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrh.a, "\u0000\u0000", null);
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
