import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akct extends ahcz implements aheo
{
    public static final akct a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(akct.class, a = new akct());
    }
    
    private akct() {
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
                if ((d = akct.d) == null) {
                    synchronized (akct.class) {
                        if (akct.d == null) {
                            akct.d = (ahev)new ahcs((ahcz)akct.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akct.a;
            }
            case 4: {
                return new ahcr((ahcz)akct.a);
            }
            case 3: {
                return new akct();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akct.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
