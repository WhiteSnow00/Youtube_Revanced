import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajej extends agzi implements ahax
{
    public static final ajej a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    
    static {
        final ajej a2 = new ajej();
        agzi.registerDefaultInstance(ajej.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 188662615, ahcm.k, ajej.class);
    }
    
    private ajej() {
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
                if ((d = ajej.d) == null) {
                    synchronized (ajej.class) {
                        if (ajej.d == null) {
                            ajej.d = (ahbe)new agzb((agzi)ajej.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajej.a;
            }
            case 4: {
                return new agza((agzi)ajej.a);
            }
            case 3: {
                return new ajej();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajej.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
