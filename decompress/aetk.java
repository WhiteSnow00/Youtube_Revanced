import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetk extends ahcz implements aheo
{
    public static final aetk a;
    private static volatile ahev g;
    public int b;
    public aetn c;
    public long d;
    public long e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(aetk.class, a = new aetk());
    }
    
    private aetk() {
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
                if ((g = aetk.g) == null) {
                    synchronized (aetk.class) {
                        if (aetk.g == null) {
                            aetk.g = (ahev)new ahcs((ahcz)aetk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aetk.a;
            }
            case 4: {
                return new ahcr((ahcz)aetk.a);
            }
            case 3: {
                return new aetk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aetk.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
