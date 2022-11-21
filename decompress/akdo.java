import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdo extends ahcz implements aheo
{
    public static final akdo a;
    private static volatile ahev e;
    public int b;
    public long c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(akdo.class, a = new akdo());
    }
    
    private akdo() {
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
                if ((e = akdo.e) == null) {
                    synchronized (akdo.class) {
                        if (akdo.e == null) {
                            akdo.e = (ahev)new ahcs((ahcz)akdo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akdo.a;
            }
            case 4: {
                return new ahcr((ahcz)akdo.a);
            }
            case 3: {
                return new akdo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
