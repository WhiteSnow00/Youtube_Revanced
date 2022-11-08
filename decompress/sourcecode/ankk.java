import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankk extends agzi implements ahax
{
    public static final ankk a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ankk.class, a = new ankk());
    }
    
    private ankk() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ankk.c) == null) {
                    synchronized (ankk.class) {
                        if (ankk.c == null) {
                            ankk.c = (ahbe)new agzb((agzi)ankk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ankk.a;
            }
            case 4: {
                return new agza((agzi)ankk.a);
            }
            case 3: {
                return new ankk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", angs.d });
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
