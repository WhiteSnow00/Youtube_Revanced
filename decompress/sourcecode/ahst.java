import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahst extends agzi implements ahax
{
    public static final ahst a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public String d;
    public aooh e;
    
    static {
        agzi.registerDefaultInstance(ahst.class, a = new ahst());
    }
    
    private ahst() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahst.f) == null) {
                    synchronized (ahst.class) {
                        if (ahst.f == null) {
                            ahst.f = (ahbe)new agzb((agzi)ahst.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahst.a;
            }
            case 4: {
                return new agza((agzi)ahst.a);
            }
            case 3: {
                return new ahst();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahst.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0004\u1009\u0003", new Object[] { "b", "c", ahse.c, "d", "e" });
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
