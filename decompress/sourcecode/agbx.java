import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbx extends agzi implements ahax
{
    public static final agbx a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(agbx.class, a = new agbx());
    }
    
    private agbx() {
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
                if ((c = agbx.c) == null) {
                    synchronized (agbx.class) {
                        if (agbx.c == null) {
                            agbx.c = (ahbe)new agzb((agzi)agbx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agbx.a;
            }
            case 4: {
                return new agza((agzi)agbx.a);
            }
            case 3: {
                return new agbx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbx.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[] { "b" });
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
