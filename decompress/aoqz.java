import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqz extends ahcz implements aheo
{
    public static final aoqz a;
    private static volatile ahev g;
    public int b;
    public int c;
    public ahdp d;
    public ahor e;
    public ahdp f;
    private int h;
    
    static {
        ahcz.registerDefaultInstance(aoqz.class, a = new aoqz());
    }
    
    private aoqz() {
        this.d = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aoqz.g) == null) {
                    synchronized (aoqz.class) {
                        if (aoqz.g == null) {
                            aoqz.g = (ahev)new ahcs((ahcz)aoqz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoqz.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqz.a);
            }
            case 3: {
                return new aoqz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqz.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0004\u001b\u0005\u1009\u0002\u0007\u001b", new Object[] { "h", "b", "c", "d", ahon.class, "e", "f", ahon.class });
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
