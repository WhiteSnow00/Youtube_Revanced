import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbn extends agzi implements ahax
{
    public static final agbn a;
    private static volatile ahbe d;
    public int b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(agbn.class, a = new agbn());
    }
    
    private agbn() {
        this.c = agzi.emptyProtobufList();
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
                if ((d = agbn.d) == null) {
                    synchronized (agbn.class) {
                        if (agbn.d == null) {
                            agbn.d = (ahbe)new agzb((agzi)agbn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agbn.a;
            }
            case 4: {
                return new agza((agzi)agbn.a);
            }
            case 3: {
                return new agbn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbn.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "b", "c", agbm.class });
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
