import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbd extends ahcz implements aheo
{
    public static final ahdi a;
    public static final arbd b;
    private static volatile ahev f;
    public int c;
    public int d;
    public ahdh e;
    
    static {
        a = (ahdi)new alxv(17);
        ahcz.registerDefaultInstance(arbd.class, b = new arbd());
    }
    
    private arbd() {
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
                if ((f = arbd.f) == null) {
                    synchronized (arbd.class) {
                        if (arbd.f == null) {
                            arbd.f = (ahev)new ahcs((ahcz)arbd.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return arbd.b;
            }
            case 4: {
                return new ahcr((byte[][])null, (boolean[][])null);
            }
            case 3: {
                return new arbd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbd.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", arbe.a(), "e", arbe.a() });
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
