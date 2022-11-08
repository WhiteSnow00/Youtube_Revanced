import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agez extends agzi implements ahax
{
    public static final agez a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(agez.class, a = new agez());
    }
    
    private agez() {
        this.b = 0;
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
                if ((d = agez.d) == null) {
                    synchronized (agez.class) {
                        if (agez.d == null) {
                            agez.d = (ahbe)new agzb((agzi)agez.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agez.a;
            }
            case 4: {
                return new agza((agzi)agez.a);
            }
            case 3: {
                return new agez();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agez.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", agey.class, agex.class });
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
