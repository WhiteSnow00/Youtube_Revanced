import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajex extends agzi implements ahax
{
    public static final ajex a;
    public static final agzg b;
    private static volatile ahbe d;
    public float c;
    private int e;
    
    static {
        final ajex a2 = new ajex();
        agzi.registerDefaultInstance(ajex.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqdx.a, a2, (MessageLite)a2, null, 339295757, ahcm.k, ajex.class);
    }
    
    private ajex() {
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
                if ((d = ajex.d) == null) {
                    synchronized (ajex.class) {
                        if (ajex.d == null) {
                            ajex.d = (ahbe)new agzb((agzi)ajex.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajex.a;
            }
            case 4: {
                return new agza((agzi)ajex.a);
            }
            case 3: {
                return new ajex();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajex.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "e", "c" });
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
