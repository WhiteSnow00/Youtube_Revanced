import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arat extends ahcz implements aheo
{
    public static final ahdi a;
    public static final arat b;
    private static volatile ahev f;
    public int c;
    public int d;
    public ahdh e;
    
    static {
        a = (ahdi)new alxv(15);
        ahcz.registerDefaultInstance(arat.class, b = new arat());
    }
    
    private arat() {
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
                if ((f = arat.f) == null) {
                    synchronized (arat.class) {
                        if (arat.f == null) {
                            arat.f = (ahev)new ahcs((ahcz)arat.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return arat.b;
            }
            case 4: {
                return new ahcr((short[][])null, (int[][])null);
            }
            case 3: {
                return new arat();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arat.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", arav.a(), "e", arav.a() });
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
