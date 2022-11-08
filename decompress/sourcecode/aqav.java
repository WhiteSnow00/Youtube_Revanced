import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqav extends agzi implements ahax
{
    public static final aqav a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(aqav.class, a = new aqav());
    }
    
    private aqav() {
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
                if ((d = aqav.d) == null) {
                    synchronized (aqav.class) {
                        if (aqav.d == null) {
                            aqav.d = (ahbe)new agzb((agzi)aqav.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqav.a;
            }
            case 4: {
                return new agza((agzi)aqav.a);
            }
            case 3: {
                return new aqav();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqav.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
