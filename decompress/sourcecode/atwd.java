import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwd extends agzi implements ahax
{
    public static final atwd a;
    private static volatile ahbe c;
    public agzq b;
    
    static {
        agzi.registerDefaultInstance(atwd.class, a = new atwd());
    }
    
    private atwd() {
        this.b = agzi.emptyIntList();
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
                if ((c = atwd.c) == null) {
                    synchronized (atwd.class) {
                        if (atwd.c == null) {
                            atwd.c = (ahbe)new agzb((agzi)atwd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return atwd.a;
            }
            case 4: {
                return new agza((agzi)atwd.a);
            }
            case 3: {
                return new atwd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwd.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "b", arbt.d });
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
