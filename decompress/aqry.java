import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqry extends ahcz implements aheo
{
    public static final aqry a;
    private static volatile ahev h;
    public int b;
    public long c;
    public String d;
    public boolean e;
    public String f;
    public long g;
    
    static {
        ahcz.registerDefaultInstance(aqry.class, a = new aqry());
    }
    
    private aqry() {
        this.d = "";
        this.f = "";
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
                if ((h = aqry.h) == null) {
                    synchronized (aqry.class) {
                        if (aqry.h == null) {
                            aqry.h = (ahev)new ahcs((ahcz)aqry.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqry.a;
            }
            case 4: {
                return new ahcr((ahcz)aqry.a);
            }
            case 3: {
                return new aqry();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqry.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1008\u0003\u0005\u1002\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
