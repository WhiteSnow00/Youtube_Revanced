import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoj extends ahcz implements aheo
{
    public static final ahoj a;
    private static volatile ahev d;
    public ahdp b;
    public int c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(ahoj.class, a = new ahoj());
    }
    
    private ahoj() {
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
                final ahev d;
                if ((d = ahoj.d) == null) {
                    synchronized (ahoj.class) {
                        if (ahoj.d == null) {
                            ahoj.d = (ahev)new ahcs((ahcz)ahoj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahoj.a;
            }
            case 4: {
                return new ahcr((ahcz)ahoj.a);
            }
            case 3: {
                return new ahoj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahoj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000", new Object[] { "e", "b", ahok.class, "c" });
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
