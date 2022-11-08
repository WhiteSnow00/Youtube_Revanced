import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajde extends agzi implements ahax
{
    public static final ajde a;
    private static volatile ahbe d;
    public agzq b;
    public agzq c;
    
    static {
        agzi.registerDefaultInstance(ajde.class, a = new ajde());
    }
    
    private ajde() {
        this.b = agzi.emptyIntList();
        this.c = agzi.emptyIntList();
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
                if ((d = ajde.d) == null) {
                    synchronized (ajde.class) {
                        if (ajde.d == null) {
                            ajde.d = (ahbe)new agzb((agzi)ajde.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajde.a;
            }
            case 4: {
                return new agza((agzi)ajde.a);
            }
            case 3: {
                return new ajde();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajde.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0016\u0002\u0016", new Object[] { "b", "c" });
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
