import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvm extends ahcz implements aheo
{
    public static final alvm a;
    private static volatile ahev e;
    public int b;
    public alvb c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(alvm.class, a = new alvm());
    }
    
    private alvm() {
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = alvm.e) == null) {
                    synchronized (alvm.class) {
                        if (alvm.e == null) {
                            alvm.e = (ahev)new ahcs((ahcz)alvm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alvm.a;
            }
            case 4: {
                return new alvk();
            }
            case 3: {
                return new alvm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "b", "c", "d", alvl.class });
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
