import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcl extends ahcz implements aheo
{
    public static final arcl a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(arcl.class, a = new arcl());
    }
    
    private arcl() {
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
                if ((c = arcl.c) == null) {
                    synchronized (arcl.class) {
                        if (arcl.c == null) {
                            arcl.c = (ahev)new ahcs((ahcz)arcl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return arcl.a;
            }
            case 4: {
                return new ahcr((ahcz)arcl.a);
            }
            case 3: {
                return new arcl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcl.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", arcg.class });
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
