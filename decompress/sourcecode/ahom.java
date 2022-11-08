import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahom extends agzi implements ahax
{
    public static final ahom a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public int d;
    public int e;
    public ahol f;
    public int g;
    
    static {
        agzi.registerDefaultInstance(ahom.class, a = new ahom());
    }
    
    private ahom() {
        this.e = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahom.h) == null) {
                    synchronized (ahom.class) {
                        if (ahom.h == null) {
                            ahom.h = (ahbe)new agzb((agzi)ahom.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahom.a;
            }
            case 4: {
                return new agza((agzi)ahom.a);
            }
            case 3: {
                return new ahom();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahom.a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1009\u0003\u0005\u100c\u0005\u0006\u100c\u0001\b\u1004\u0002", new Object[] { "b", "c", ahnh.a(), "f", "g", ahnd.a(), "d", ahnj.a(), "e" });
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
