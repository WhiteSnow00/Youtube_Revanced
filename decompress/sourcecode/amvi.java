import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvi extends agzi implements ahax
{
    public static final amvi a;
    private static volatile ahbe d;
    public boolean b;
    public agyc c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(amvi.class, a = new amvi());
    }
    
    private amvi() {
        this.c = agyc.b;
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
                if ((d = amvi.d) == null) {
                    synchronized (amvi.class) {
                        if (amvi.d == null) {
                            amvi.d = (ahbe)new agzb((agzi)amvi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amvi.a;
            }
            case 4: {
                return new agza((agzi)amvi.a);
            }
            case 3: {
                return new amvi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvi.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u1007\u0001\u0004\u100a\u0003", new Object[] { "e", "b", "c" });
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
