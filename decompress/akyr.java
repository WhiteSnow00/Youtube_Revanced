import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyr extends ahcz implements aheo
{
    public static final akyr a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(akyr.class, a = new akyr());
    }
    
    private akyr() {
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
                if ((d = akyr.d) == null) {
                    synchronized (akyr.class) {
                        if (akyr.d == null) {
                            akyr.d = (ahev)new ahcs((ahcz)akyr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyr.a;
            }
            case 4: {
                return new ahcr((ahcz)akyr.a);
            }
            case 3: {
                return new akyr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
