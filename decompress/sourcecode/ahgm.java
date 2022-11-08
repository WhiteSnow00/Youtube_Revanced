import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgm extends agzi implements ahax
{
    public static final ahgm a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public ahgo d;
    
    static {
        agzi.registerDefaultInstance(ahgm.class, a = new ahgm());
    }
    
    private ahgm() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahgm.e) == null) {
                    synchronized (ahgm.class) {
                        if (ahgm.e == null) {
                            ahgm.e = (ahbe)new agzb((agzi)ahgm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahgm.a;
            }
            case 4: {
                return new agza((agzi)ahgm.a);
            }
            case 3: {
                return new ahgm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgm.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
