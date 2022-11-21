import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardv extends ahcz implements aheo
{
    public static final ardv a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(ardv.class, a = new ardv());
    }
    
    private ardv() {
        this.b = 0;
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
                if ((d = ardv.d) == null) {
                    synchronized (ardv.class) {
                        if (ardv.d == null) {
                            ardv.d = (ahev)new ahcs((ahcz)ardv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ardv.a;
            }
            case 4: {
                return new ahcr((ahcz)ardv.a);
            }
            case 3: {
                return new ardv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardv.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1033\u0000\u0002\u103b\u0000", new Object[] { "c", "b" });
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
