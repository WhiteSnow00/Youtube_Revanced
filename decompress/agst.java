import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agst extends ahcz implements aheo
{
    public static final agst a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(agst.class, a = new agst());
    }
    
    private agst() {
        this.c = "";
        this.d = "";
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = agst.f) == null) {
                    synchronized (agst.class) {
                        if (agst.f == null) {
                            agst.f = (ahev)new ahcs((ahcz)agst.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agst.a;
            }
            case 4: {
                return new ahcr((ahcz)agst.a);
            }
            case 3: {
                return new agst();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agst.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", agsr.class });
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
