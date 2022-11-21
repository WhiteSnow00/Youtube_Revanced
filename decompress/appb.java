import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appb extends ahcz implements aheo
{
    public static final appb a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public ahdp f;
    
    static {
        ahcz.registerDefaultInstance(appb.class, a = new appb());
    }
    
    private appb() {
        this.c = 0;
        this.f = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = appb.g) == null) {
                    synchronized (appb.class) {
                        if (appb.g == null) {
                            appb.g = (ahev)new ahcs((ahcz)appb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return appb.a;
            }
            case 4: {
                return new ahcr((short[])null, (short[])null);
            }
            case 3: {
                return new appb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appb.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000", new Object[] { "d", "c", "b", "e", apnc.n, "f", apoy.class, apox.class, apoz.class, appa.class });
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
