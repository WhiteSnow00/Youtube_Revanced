import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdw extends agzi implements ahax
{
    public static final ajdw a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ajdw.class, a = new ajdw());
    }
    
    private ajdw() {
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
                if ((d = ajdw.d) == null) {
                    synchronized (ajdw.class) {
                        if (ajdw.d == null) {
                            ajdw.d = (ahbe)new agzb((agzi)ajdw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajdw.a;
            }
            case 4: {
                return new agza((agzi)ajdw.a);
            }
            case 3: {
                return new ajdw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdw.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "b", "c" });
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
