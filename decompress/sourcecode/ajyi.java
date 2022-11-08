import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyi extends agzi implements ahax
{
    public static final ajyi a;
    private static volatile ahbe d;
    public String b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ajyi.class, a = new ajyi());
    }
    
    private ajyi() {
        this.b = "";
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
                if ((d = ajyi.d) == null) {
                    synchronized (ajyi.class) {
                        if (ajyi.d == null) {
                            ajyi.d = (ahbe)new agzb((agzi)ajyi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajyi.a;
            }
            case 4: {
                return new agza((agzi)ajyi.a);
            }
            case 3: {
                return new ajyi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", ajyk.a() });
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
