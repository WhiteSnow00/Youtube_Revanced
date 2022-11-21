import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aker extends ahcz implements aheo
{
    public static final aker a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aker.class, a = new aker());
    }
    
    private aker() {
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
                final ahev e;
                if ((e = aker.e) == null) {
                    synchronized (aker.class) {
                        if (aker.e == null) {
                            aker.e = (ahev)new ahcs((ahcz)aker.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aker.a;
            }
            case 4: {
                return new ahcr((ahcz)aker.a);
            }
            case 3: {
                return new aker();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aker.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
