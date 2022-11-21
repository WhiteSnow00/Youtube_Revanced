import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetl extends ahcz implements aheo
{
    public static final aetl a;
    private static volatile ahev g;
    public int b;
    public long c;
    public ahdp d;
    public long e;
    public ahdh f;
    
    static {
        ahcz.registerDefaultInstance(aetl.class, a = new aetl());
    }
    
    private aetl() {
        this.c = -1L;
        this.d = ahcz.emptyProtobufList();
        this.f = ahcz.emptyIntList();
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
                if ((g = aetl.g) == null) {
                    synchronized (aetl.class) {
                        if (aetl.g == null) {
                            aetl.g = (ahev)new ahcs((ahcz)aetl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aetl.a;
            }
            case 4: {
                return new ahcr((ahcz)aetl.a);
            }
            case 3: {
                return new aetl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aetl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u001b\u0003\u1002\u0001\u0004\u0016", new Object[] { "b", "c", "d", aetk.class, "e", "f" });
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
