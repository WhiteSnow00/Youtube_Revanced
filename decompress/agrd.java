import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrd extends ahcz implements aheo
{
    public static final agrd a;
    private static volatile ahev f;
    public agsa b;
    public agrl c;
    public agrc d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(agrd.class, a = new agrd());
    }
    
    private agrd() {
        emptyProtobufList();
        this.e = "";
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
                if ((f = agrd.f) == null) {
                    synchronized (agrd.class) {
                        if (agrd.f == null) {
                            agrd.f = (ahev)new ahcs((ahcz)agrd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agrd.a;
            }
            case 4: {
                return new ahcr((ahcz)agrd.a);
            }
            case 3: {
                return new agrd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrd.a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t\u0006\u0208", new Object[] { "b", "c", "d", "e" });
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
