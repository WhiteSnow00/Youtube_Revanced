import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqbq extends ahcz implements aheo
{
    public static final aqbq a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aqbq.class, a = new aqbq());
    }
    
    private aqbq() {
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
                if ((e = aqbq.e) == null) {
                    synchronized (aqbq.class) {
                        if (aqbq.e == null) {
                            aqbq.e = (ahev)new ahcs((ahcz)aqbq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqbq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqbq.a);
            }
            case 3: {
                return new aqbq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
