import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlq extends ahcz implements aheo
{
    public static final ajlq a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public long d;
    public ajlx e;
    public boolean f;
    
    static {
        final ajlq a2 = new ajlq();
        ahcz.registerDefaultInstance(ajlq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)amwo.b, a2, (MessageLite)a2, null, 288486286, ahgc.k, ajlq.class);
    }
    
    private ajlq() {
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
                if ((g = ajlq.g) == null) {
                    synchronized (ajlq.class) {
                        if (ajlq.g == null) {
                            ajlq.g = (ahev)new ahcs((ahcz)ajlq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajlq.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlq.a);
            }
            case 3: {
                return new ajlq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlq.a, "\u0001\u0003\u0000\u0001\u0005\t\u0003\u0000\u0000\u0000\u0005\u1002\u0003\b\u1009\u0006\t\u1007\u0007", new Object[] { "c", "d", "e", "f" });
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
