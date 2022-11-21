import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpr extends ahcz implements aheo
{
    public static final aqpr a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aqpr.class, a = new aqpr());
    }
    
    private aqpr() {
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqpr.c) == null) {
                    synchronized (aqpr.class) {
                        if (aqpr.c == null) {
                            aqpr.c = (ahev)new ahcs((ahcz)aqpr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqpr.a;
            }
            case 4: {
                return new ahcr((short[])null, (boolean[])null);
            }
            case 3: {
                return new aqpr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpr.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
