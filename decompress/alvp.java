import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvp extends ahcz implements aheo
{
    public static final alvp a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    
    static {
        ahcz.registerDefaultInstance(alvp.class, a = new alvp());
    }
    
    private alvp() {
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
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
                if ((d = alvp.d) == null) {
                    synchronized (alvp.class) {
                        if (alvp.d == null) {
                            alvp.d = (ahev)new ahcs((ahcz)alvp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alvp.a;
            }
            case 4: {
                return new alvo();
            }
            case 3: {
                return new alvp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvp.a, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0002\u0000\u0005\u001b\u0006\u001b", new Object[] { "b", alut.class, "c", alvn.class });
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
