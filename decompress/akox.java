import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akox extends ahcz implements aheo
{
    public static final akox a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(akox.class, a = new akox());
    }
    
    private akox() {
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
                if ((e = akox.e) == null) {
                    synchronized (akox.class) {
                        if (akox.e == null) {
                            akox.e = (ahev)new ahcs((ahcz)akox.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akox.a;
            }
            case 4: {
                return new ahcr((ahcz)akox.a);
            }
            case 3: {
                return new akox();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akox.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
