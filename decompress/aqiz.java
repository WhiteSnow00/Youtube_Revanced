import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqiz extends ahcz implements aheo
{
    public static final aqiz a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aqiz.class, a = new aqiz());
    }
    
    private aqiz() {
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
                if ((c = aqiz.c) == null) {
                    synchronized (aqiz.class) {
                        if (aqiz.c == null) {
                            aqiz.c = (ahev)new ahcs((ahcz)aqiz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqiz.a;
            }
            case 4: {
                return new ahcr((float[][])null, (char[][][])null);
            }
            case 3: {
                return new aqiz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqiz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqja.class });
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
