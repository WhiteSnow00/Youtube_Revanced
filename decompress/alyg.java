import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyg extends ahcz implements aheo
{
    public static final alyg a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(alyg.class, a = new alyg());
    }
    
    private alyg() {
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
                if ((d = alyg.d) == null) {
                    synchronized (alyg.class) {
                        if (alyg.d == null) {
                            alyg.d = (ahev)new ahcs((ahcz)alyg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alyg.a;
            }
            case 4: {
                return new ahcr((ahcz)alyg.a);
            }
            case 3: {
                return new alyg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", alyf.a() });
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
