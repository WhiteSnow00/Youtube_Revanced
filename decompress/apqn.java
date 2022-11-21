import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqn extends ahcz implements aheo
{
    public static final ahdi a;
    public static final apqn b;
    private static volatile ahev h;
    public ahdh c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;
    
    static {
        a = (ahdi)new alxv(13);
        ahcz.registerDefaultInstance(apqn.class, b = new apqn());
    }
    
    private apqn() {
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
                final ahev h;
                if ((h = apqn.h) == null) {
                    synchronized (apqn.class) {
                        if (apqn.h == null) {
                            apqn.h = (ahev)new ahcs((ahcz)apqn.b);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apqn.b;
            }
            case 4: {
                return new ahcr((ahcz)apqn.b);
            }
            case 3: {
                return new apqn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqn.b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002\u100b\u0000\u0003\u100b\u0001\u0004\u100b\u0002\u0005\u100b\u0003", new Object[] { "i", "c", apqm.a(), "d", "e", "f", "g" });
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
