import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtt extends agzi implements ahax
{
    public static final ahtt a;
    private static volatile ahbe d;
    public String b;
    public String c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahtt.class, a = new ahtt());
    }
    
    private ahtt() {
        this.b = "";
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
                if ((d = ahtt.d) == null) {
                    synchronized (ahtt.class) {
                        if (ahtt.d == null) {
                            ahtt.d = (ahbe)new agzb((agzi)ahtt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahtt.a;
            }
            case 4: {
                return new agza((agzi)ahtt.a);
            }
            case 3: {
                return new ahtt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
