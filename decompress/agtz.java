import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtz extends ahcz implements aheo
{
    public static final agtz a;
    private static volatile ahev e;
    public int b;
    public agug c;
    public agua d;
    
    static {
        ahcz.registerDefaultInstance(agtz.class, a = new agtz());
    }
    
    private agtz() {
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
                if ((e = agtz.e) == null) {
                    synchronized (agtz.class) {
                        if (agtz.e == null) {
                            agtz.e = (ahev)new ahcs((ahcz)agtz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agtz.a;
            }
            case 4: {
                return new ahcr((ahcz)agtz.a);
            }
            case 3: {
                return new agtz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
