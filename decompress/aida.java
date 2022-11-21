import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aida extends ahcz implements aheo
{
    public static final aida a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aida.class, a = new aida());
    }
    
    private aida() {
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
                if ((d = aida.d) == null) {
                    synchronized (aida.class) {
                        if (aida.d == null) {
                            aida.d = (ahev)new ahcs((ahcz)aida.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aida.a;
            }
            case 4: {
                return new ahcr((ahcz)aida.a);
            }
            case 3: {
                return new aida();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aida.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aidb.d });
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
