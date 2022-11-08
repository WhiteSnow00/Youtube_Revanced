import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agam extends agzi implements ahax
{
    public static final agam a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(agam.class, a = new agam());
    }
    
    private agam() {
        this.c = agyc.b;
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
                if ((d = agam.d) == null) {
                    synchronized (agam.class) {
                        if (agam.d == null) {
                            agam.d = (ahbe)new agzb((agzi)agam.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agam.a;
            }
            case 4: {
                return new agza((agzi)agam.a);
            }
            case 3: {
                return new agam();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agam.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "b", "c" });
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
