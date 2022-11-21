import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjb extends ahcz implements aheo
{
    public static final aqjb a;
    private static volatile ahev e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aqjb.class, a = new aqjb());
    }
    
    private aqjb() {
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
                final ahev e;
                if ((e = aqjb.e) == null) {
                    synchronized (aqjb.class) {
                        if (aqjb.e == null) {
                            aqjb.e = (ahev)new ahcs((ahcz)aqjb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqjb.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjb.a);
            }
            case 3: {
                return new aqjb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjb.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u100b\u0002", new Object[] { "b", "c", "d" });
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
