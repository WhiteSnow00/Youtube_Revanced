import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbz extends agzi implements ahax
{
    public static final ajbz a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ajbz.class, a = new ajbz());
    }
    
    private ajbz() {
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
                if ((d = ajbz.d) == null) {
                    synchronized (ajbz.class) {
                        if (ajbz.d == null) {
                            ajbz.d = (ahbe)new agzb((agzi)ajbz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajbz.a;
            }
            case 4: {
                return new agza((agzi)ajbz.a);
            }
            case 3: {
                return new ajbz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
