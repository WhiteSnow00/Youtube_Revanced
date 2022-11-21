import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agug extends ahcz implements aheo
{
    public static final agug a;
    private static volatile ahev h;
    public int b;
    public int c;
    public aguo d;
    public agun e;
    public aguh f;
    public agui g;
    
    static {
        ahcz.registerDefaultInstance(agug.class, a = new agug());
    }
    
    private agug() {
        this.c = 1;
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
                if ((h = agug.h) == null) {
                    synchronized (agug.class) {
                        if (agug.h == null) {
                            agug.h = (ahev)new ahcs((ahcz)agug.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agug.a;
            }
            case 4: {
                return new ahcr((ahcz)agug.a);
            }
            case 3: {
                return new agug();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agug.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0002\u0003\u1009\u0003\u0004\u1009\u0004\u0005\u1009\u0001", new Object[] { "b", "c", afsd.l, "e", "f", "g", "d" });
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
