import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agah extends agzi implements ahax
{
    public static final agah a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance(agah.class, a = new agah());
    }
    
    private agah() {
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
                if ((c = agah.c) == null) {
                    synchronized (agah.class) {
                        if (agah.c == null) {
                            agah.c = (ahbe)new agzb((agzi)agah.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agah.a;
            }
            case 4: {
                return new agza((agzi)agah.a);
            }
            case 3: {
                return new agah();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agah.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[] { "b" });
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
