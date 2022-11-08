import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgn extends agzi implements ahax
{
    public static final ahgn a;
    private static volatile ahbe d;
    public int b;
    public ahgm c;
    
    static {
        agzi.registerDefaultInstance(ahgn.class, a = new ahgn());
    }
    
    private ahgn() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahgn.d) == null) {
                    synchronized (ahgn.class) {
                        if (ahgn.d == null) {
                            ahgn.d = (ahbe)new agzb((agzi)ahgn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahgn.a;
            }
            case 4: {
                return new agza((agzi)ahgn.a);
            }
            case 3: {
                return new ahgn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgn.a, "\u0001\u0001\u0000\u0001\uecfa\u241c\uecfa\u241c\u0001\u0000\u0000\u0000\uecfa\u241c\u1009\u0000", new Object[] { "b", "c" });
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
