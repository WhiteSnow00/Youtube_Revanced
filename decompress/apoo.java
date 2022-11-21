import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoo extends ahcz implements aheo
{
    public static final ahdi a;
    public static final apoo b;
    private static volatile ahev d;
    public ahdh c;
    
    static {
        a = (ahdi)new alxv(12);
        ahcz.registerDefaultInstance(apoo.class, b = new apoo());
    }
    
    private apoo() {
        this.c = ahcz.emptyIntList();
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
                if ((d = apoo.d) == null) {
                    synchronized (apoo.class) {
                        if (apoo.d == null) {
                            apoo.d = (ahev)new ahcs((ahcz)apoo.b);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoo.b;
            }
            case 4: {
                return new ahcr((ahcz)apoo.b);
            }
            case 3: {
                return new apoo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apoo.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "c", apnv.a() });
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
