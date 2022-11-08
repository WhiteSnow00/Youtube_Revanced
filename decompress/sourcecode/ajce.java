import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajce extends agzi implements ahax
{
    public static final ajce a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ajce.class, a = new ajce());
    }
    
    private ajce() {
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
                if ((d = ajce.d) == null) {
                    synchronized (ajce.class) {
                        if (ajce.d == null) {
                            ajce.d = (ahbe)new agzb((agzi)ajce.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajce.a;
            }
            case 4: {
                return new agza((agzi)ajce.a);
            }
            case 3: {
                return new ajce();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajce.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u1007\u0000", new Object[] { "b", "c" });
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
