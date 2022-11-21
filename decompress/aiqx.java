import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqx extends ahcz implements aheo
{
    public static final aiqx a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    
    static {
        ahcz.registerDefaultInstance(aiqx.class, a = new aiqx());
    }
    
    private aiqx() {
        this.c = "";
        this.d = "";
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
                if ((g = aiqx.g) == null) {
                    synchronized (aiqx.class) {
                        if (aiqx.g == null) {
                            aiqx.g = (ahev)new ahcs((ahcz)aiqx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aiqx.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqx.a);
            }
            case 3: {
                return new aiqx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqx.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0005\u1002\u0004", new Object[] { "b", "c", "d", "e", "f" });
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
