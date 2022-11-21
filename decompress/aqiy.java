import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqiy extends ahcz implements aheo
{
    public static final aqiy a;
    private static volatile ahev d;
    public String b;
    public String c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aqiy.class, a = new aqiy());
    }
    
    private aqiy() {
        this.b = "";
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
                final ahev d;
                if ((d = aqiy.d) == null) {
                    synchronized (aqiy.class) {
                        if (aqiy.d == null) {
                            aqiy.d = (ahev)new ahcs((ahcz)aqiy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqiy.a;
            }
            case 4: {
                return new ahcr((ahcz)aqiy.a);
            }
            case 3: {
                return new aqiy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqiy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
