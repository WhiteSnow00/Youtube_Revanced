import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtn extends ahcz implements aheo
{
    public static final agtn a;
    private static volatile ahev e;
    public String b;
    public int c;
    public int d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(agtn.class, a = new agtn());
    }
    
    private agtn() {
        this.b = "";
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
                if ((e = agtn.e) == null) {
                    synchronized (agtn.class) {
                        if (agtn.e == null) {
                            agtn.e = (ahev)new ahcs((ahcz)agtn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agtn.a;
            }
            case 4: {
                return new ahcr((ahcz)agtn.a);
            }
            case 3: {
                return new agtn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "f", "b", "c", "d" });
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
