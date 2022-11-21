import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aope extends ahcz implements aheo
{
    public static final aope a;
    private static volatile ahev e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aope.class, a = new aope());
    }
    
    private aope() {
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
                if ((e = aope.e) == null) {
                    synchronized (aope.class) {
                        if (aope.e == null) {
                            aope.e = (ahev)new ahcs((ahcz)aope.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aope.a;
            }
            case 4: {
                return new ahcr((ahcz)aope.a);
            }
            case 3: {
                return new aope();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aope.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aopf.a() });
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
