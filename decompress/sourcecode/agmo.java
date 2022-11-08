import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmo extends agzi implements ahax
{
    public static final agmo a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(agmo.class, a = new agmo());
    }
    
    private agmo() {
        this.b = agzi.emptyProtobufList();
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
                if ((c = agmo.c) == null) {
                    synchronized (agmo.class) {
                        if (agmo.c == null) {
                            agmo.c = (ahbe)new agzb((agzi)agmo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agmo.a;
            }
            case 4: {
                return new agza((agzi)agmo.a);
            }
            case 3: {
                return new agmo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agmo.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", agmn.class });
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
