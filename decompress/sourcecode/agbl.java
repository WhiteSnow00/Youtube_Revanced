import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class agbl extends agzi implements ahax
{
    public static final agbl a;
    private static volatile ahbe g;
    public String b;
    public String c;
    public int d;
    public boolean e;
    public String f;
    
    static {
        agzi.registerDefaultInstance(agbl.class, a = new agbl());
    }
    
    private agbl() {
        this.b = "";
        this.c = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = agbl.g) == null) {
                    synchronized (agbl.class) {
                        if (agbl.g == null) {
                            agbl.g = (ahbe)new agzb((agzi)agbl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agbl.a;
            }
            case 4: {
                return new agza((agzi)agbl.a);
            }
            case 3: {
                return new agbl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbl.a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208", new Object[] { "b", "c", "d", "e", "f" });
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
