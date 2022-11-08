import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akov extends agzi implements ahax
{
    public static final akov a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(akov.class, a = new akov());
    }
    
    private akov() {
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
                final ahbe d;
                if ((d = akov.d) == null) {
                    synchronized (akov.class) {
                        if (akov.d == null) {
                            akov.d = (ahbe)new agzb((agzi)akov.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akov.a;
            }
            case 4: {
                return new agza((agzi)akov.a);
            }
            case 3: {
                return new akov();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akov.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
