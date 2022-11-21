import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsx extends ahcz implements aheo
{
    public static final agsx a;
    private static volatile ahev j;
    public int b;
    public String c;
    public int d;
    public ahfq e;
    public ahfq f;
    public agsz g;
    public agsu h;
    public agsw i;
    
    static {
        ahcz.registerDefaultInstance(agsx.class, a = new agsx());
    }
    
    private agsx() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = agsx.j) == null) {
                    synchronized (agsx.class) {
                        if (agsx.j == null) {
                            agsx.j = (ahev)new ahcs((ahcz)agsx.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agsx.a;
            }
            case 4: {
                return new ahcr((ahcz)agsx.a);
            }
            case 3: {
                return new agsx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsx.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u100c\u0001\u0002\u1009\u0002\u0003\u1009\u0003\u0004\u1009\u0004\u0005\u1009\u0005\u0007\u1008\u0000\b\u1009\u0007", new Object[] { "b", "d", agsv.b(), "e", "f", "g", "h", "c", "i" });
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
