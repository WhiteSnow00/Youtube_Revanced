import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrc extends ahcz implements aheo
{
    public static final agrc a;
    private static volatile ahev d;
    public String b;
    public ahdp c;
    
    static {
        ahcz.registerDefaultInstance(agrc.class, a = new agrc());
    }
    
    private agrc() {
        this.b = "";
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
                final ahev d;
                if ((d = agrc.d) == null) {
                    synchronized (agrc.class) {
                        if (agrc.d == null) {
                            agrc.d = (ahev)new ahcs((ahcz)agrc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrc.a;
            }
            case 4: {
                return new ahcr((ahcz)agrc.a);
            }
            case 3: {
                return new agrc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrc.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", new Object[] { "b", "c" });
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
