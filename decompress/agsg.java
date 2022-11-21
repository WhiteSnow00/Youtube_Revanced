import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsg extends ahcz implements aheo
{
    public static final agsg a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(agsg.class, a = new agsg());
    }
    
    private agsg() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
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
                if ((e = agsg.e) == null) {
                    synchronized (agsg.class) {
                        if (agsg.e == null) {
                            agsg.e = (ahev)new ahcs((ahcz)agsg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agsg.a;
            }
            case 4: {
                return new ahcr((ahcz)agsg.a);
            }
            case 3: {
                return new agsg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "b", "c", "d", agsf.class });
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
