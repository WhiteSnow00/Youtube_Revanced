import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyn extends ahcz implements aheo
{
    public static final ahdi a;
    public static final akyn b;
    private static volatile ahev e;
    public ahdh c;
    public String d;
    private int f;
    
    static {
        a = (ahdi)new pub(20);
        ahcz.registerDefaultInstance(akyn.class, b = new akyn());
    }
    
    private akyn() {
        this.c = ahcz.emptyIntList();
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akyn.e) == null) {
                    synchronized (akyn.class) {
                        if (akyn.e == null) {
                            akyn.e = (ahev)new ahcs((ahcz)akyn.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akyn.b;
            }
            case 4: {
                return new ahcr((int[][][])null, (short[][])null);
            }
            case 3: {
                return new akyn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyn.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001e", new Object[] { "f", "d", "c", amxg.a() });
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
