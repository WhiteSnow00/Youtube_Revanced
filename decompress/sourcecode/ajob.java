import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajob extends agzi implements ahax
{
    public static final ajob a;
    private static volatile ahbe d;
    public boolean b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)ajob.class, (agzi)(a = new ajob()));
    }
    
    private ajob() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajob.d) == null) {
                    synchronized (ajob.class) {
                        if (ajob.d == null) {
                            ajob.d = (ahbe)new agzb((agzi)ajob.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajob.a;
            }
            case 4: {
                return new agza((agzi)ajob.a);
            }
            case 3: {
                return new ajob();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajob.a, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0000\b\u1007\b\t\u100b\t", new Object[] { "e", "b", "c" });
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
