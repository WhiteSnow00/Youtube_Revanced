import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arax extends ahcz implements aheo
{
    public static final ahdi a;
    public static final arax b;
    private static volatile ahev f;
    public int c;
    public int d;
    public ahdh e;
    
    static {
        a = (ahdi)new alxv(16);
        ahcz.registerDefaultInstance(arax.class, b = new arax());
    }
    
    private arax() {
        this.e = ahcz.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = arax.f) == null) {
                    synchronized (arax.class) {
                        if (arax.f == null) {
                            arax.f = (ahev)new ahcs((ahcz)arax.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return arax.b;
            }
            case 4: {
                return new ahcr((short[][][])null, (byte[][])null);
            }
            case 3: {
                return new arax();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arax.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", arba.a(), "e", arba.a() });
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
