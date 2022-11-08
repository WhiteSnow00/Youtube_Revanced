import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxn extends agzi implements ahax
{
    public static final ajxn a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ajxn.class, a = new ajxn());
    }
    
    private ajxn() {
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
                if ((c = ajxn.c) == null) {
                    synchronized (ajxn.class) {
                        if (ajxn.c == null) {
                            ajxn.c = (ahbe)new agzb((agzi)ajxn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajxn.a;
            }
            case 4: {
                return new agza((agzi)ajxn.a);
            }
            case 3: {
                return new ajxn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ajwj.c });
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
