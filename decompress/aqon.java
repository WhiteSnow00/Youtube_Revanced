import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqon extends ahcz implements aheo
{
    public static final aqon a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aqon.class, a = new aqon());
    }
    
    private aqon() {
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
                if ((c = aqon.c) == null) {
                    synchronized (aqon.class) {
                        if (aqon.c == null) {
                            aqon.c = (ahev)new ahcs((ahcz)aqon.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqon.a;
            }
            case 4: {
                return new ahcr((ahcz)aqon.a);
            }
            case 3: {
                return new aqon();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqon.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqob.class });
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
