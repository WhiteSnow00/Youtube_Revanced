import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuq extends ahcz implements aheo
{
    public static final apuq a;
    private static volatile ahev d;
    public apup b;
    public apuo c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(apuq.class, a = new apuq());
    }
    
    private apuq() {
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
                if ((d = apuq.d) == null) {
                    synchronized (apuq.class) {
                        if (apuq.d == null) {
                            apuq.d = (ahev)new ahcs((ahcz)apuq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apuq.a;
            }
            case 4: {
                return new ahcr((ahcz)apuq.a);
            }
            case 3: {
                return new apuq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
