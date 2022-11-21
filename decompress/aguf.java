import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguf extends ahcz implements aheo
{
    public static final aguf a;
    private static volatile ahev e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(aguf.class, a = new aguf());
    }
    
    private aguf() {
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
                if ((e = aguf.e) == null) {
                    synchronized (aguf.class) {
                        if (aguf.e == null) {
                            aguf.e = (ahev)new ahcs((ahcz)aguf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aguf.a;
            }
            case 4: {
                return new ahcr((ahcz)aguf.a);
            }
            case 3: {
                return new aguf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
