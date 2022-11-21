import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agva extends ahcz implements aheo
{
    public static final agva a;
    private static volatile ahev e;
    public agvb b;
    public ahdp c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(agva.class, a = new agva());
    }
    
    private agva() {
        this.c = ahcz.emptyProtobufList();
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
                if ((e = agva.e) == null) {
                    synchronized (agva.class) {
                        if (agva.e == null) {
                            agva.e = (ahev)new ahcs((ahcz)agva.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agva.a;
            }
            case 4: {
                return new ahcr((ahcz)agva.a);
            }
            case 3: {
                return new agva();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agva.a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0004\t", new Object[] { "c", aguv.class, "d", aguz.class, "b" });
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
