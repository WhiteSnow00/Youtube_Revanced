import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfe extends agzi implements ahax
{
    public static final ajfe a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ajfe.class, a = new ajfe());
    }
    
    private ajfe() {
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
                if ((d = ajfe.d) == null) {
                    synchronized (ajfe.class) {
                        if (ajfe.d == null) {
                            ajfe.d = (ahbe)new agzb((agzi)ajfe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajfe.a;
            }
            case 4: {
                return new agza((agzi)ajfe.a);
            }
            case 3: {
                return new ajfe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
