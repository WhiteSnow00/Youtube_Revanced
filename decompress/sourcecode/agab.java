import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agab extends agzi implements ahax
{
    public static final agab a;
    private static volatile ahbe d;
    public agac b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agab.class, a = new agab());
    }
    
    private agab() {
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
                if ((d = agab.d) == null) {
                    synchronized (agab.class) {
                        if (agab.d == null) {
                            agab.d = (ahbe)new agzb((agzi)agab.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agab.a;
            }
            case 4: {
                return new agza((agzi)agab.a);
            }
            case 3: {
                return new agab();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agab.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "b", "c" });
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
