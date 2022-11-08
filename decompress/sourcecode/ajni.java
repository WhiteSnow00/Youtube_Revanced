import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajni extends agzi implements ahax
{
    public static final ajni a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)ajni.class, (agzi)(a = new ajni()));
    }
    
    private ajni() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajni.d) == null) {
                    synchronized (ajni.class) {
                        if (ajni.d == null) {
                            ajni.d = (ahbe)new agzb((agzi)ajni.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajni.a;
            }
            case 4: {
                return new agza((agzi)ajni.a);
            }
            case 3: {
                return new ajni();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajni.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ajkr.p });
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
