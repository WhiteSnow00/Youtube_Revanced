import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arca extends ahcz implements aheo
{
    public static final ahdi a;
    public static final arca b;
    private static volatile ahev f;
    public int c;
    public int d;
    public ahdh e;
    
    static {
        a = (ahdi)new alxv(18);
        ahcz.registerDefaultInstance(arca.class, b = new arca());
    }
    
    private arca() {
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
                if ((f = arca.f) == null) {
                    synchronized (arca.class) {
                        if (arca.f == null) {
                            arca.f = (ahev)new ahcs((ahcz)arca.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return arca.b;
            }
            case 4: {
                return new ahcr((boolean[][][])null, (char[][][])null);
            }
            case 3: {
                return new arca();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arca.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", arcc.a(), "e", arcc.a() });
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
