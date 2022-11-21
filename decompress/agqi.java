import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqi extends ahcz implements aheo
{
    public static final agqi a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public agqh d;
    
    static {
        ahcz.registerDefaultInstance(agqi.class, a = new agqi());
    }
    
    private agqi() {
        this.c = ahcz.emptyProtobufList();
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
                if ((e = agqi.e) == null) {
                    synchronized (agqi.class) {
                        if (agqi.e == null) {
                            agqi.e = (ahev)new ahcs((ahcz)agqi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqi.a;
            }
            case 4: {
                return new ahcr((ahcz)agqi.a);
            }
            case 3: {
                return new agqi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "b", "c", agqg.class, "d" });
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
