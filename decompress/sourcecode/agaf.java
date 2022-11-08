import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agaf extends agzi implements ahax
{
    public static final agaf a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(agaf.class, a = new agaf());
    }
    
    private agaf() {
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
                if ((c = agaf.c) == null) {
                    synchronized (agaf.class) {
                        if (agaf.c == null) {
                            agaf.c = (ahbe)new agzb((agzi)agaf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agaf.a;
            }
            case 4: {
                return new agza((agzi)agaf.a);
            }
            case 3: {
                return new agaf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agaf.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "b" });
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
