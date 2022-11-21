import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzq extends ahcz implements aheo
{
    public static final alzq a;
    private static volatile ahev e;
    public int b;
    public float c;
    public float d;
    
    static {
        ahcz.registerDefaultInstance(alzq.class, a = new alzq());
    }
    
    private alzq() {
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
                if ((e = alzq.e) == null) {
                    synchronized (alzq.class) {
                        if (alzq.e == null) {
                            alzq.e = (ahev)new ahcs((ahcz)alzq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alzq.a;
            }
            case 4: {
                return new ahcr((ahcz)alzq.a);
            }
            case 3: {
                return new alzq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
