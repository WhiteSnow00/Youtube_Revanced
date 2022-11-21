import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpy extends ahcz implements aheo
{
    public static final akpy a;
    private static volatile ahev d;
    public ajsr b;
    public long c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(akpy.class, a = new akpy());
    }
    
    private akpy() {
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
                if ((d = akpy.d) == null) {
                    synchronized (akpy.class) {
                        if (akpy.d == null) {
                            akpy.d = (ahev)new ahcs((ahcz)akpy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpy.a;
            }
            case 4: {
                return new ahcr((ahcz)akpy.a);
            }
            case 3: {
                return new akpy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001", new Object[] { "e", "b", "c" });
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
