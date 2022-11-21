import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardl extends ahcz implements aheo
{
    public static final ardl a;
    private static volatile ahev e;
    public int b;
    public aras c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(ardl.class, a = new ardl());
    }
    
    private ardl() {
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
                if ((e = ardl.e) == null) {
                    synchronized (ardl.class) {
                        if (ardl.e == null) {
                            ardl.e = (ahev)new ahcs((ahcz)ardl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ardl.a;
            }
            case 4: {
                return new ahcr((ahcz)ardl.a);
            }
            case 3: {
                return new ardl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
