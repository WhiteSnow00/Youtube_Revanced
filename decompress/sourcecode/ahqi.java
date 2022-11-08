import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqi extends agzi implements ahax
{
    public static final ahqi a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public boolean d;
    public agzy e;
    public boolean f;
    private int h;
    
    static {
        agzi.registerDefaultInstance(ahqi.class, a = new ahqi());
    }
    
    private ahqi() {
        this.e = agzi.emptyProtobufList();
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
                if ((g = ahqi.g) == null) {
                    synchronized (ahqi.class) {
                        if (ahqi.g == null) {
                            ahqi.g = (ahbe)new agzb((agzi)ahqi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahqi.a;
            }
            case 4: {
                return new agza((agzi)ahqi.a);
            }
            case 3: {
                return new ahqi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqi.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u001b\u0005\u1007\u0003", new Object[] { "h", "b", "c", ahng.k, "d", "e", amxn.class, "f" });
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
