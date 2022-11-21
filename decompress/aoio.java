import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoio extends ahcz implements aheo
{
    public static final aoio a;
    private static volatile ahev e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(aoio.class, a = new aoio());
    }
    
    private aoio() {
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
                if ((e = aoio.e) == null) {
                    synchronized (aoio.class) {
                        if (aoio.e == null) {
                            aoio.e = (ahev)new ahcs((ahcz)aoio.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoio.a;
            }
            case 4: {
                return new ahcr((ahcz)aoio.a);
            }
            case 3: {
                return new aoio();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoio.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
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
