import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxn extends agzi implements ahax
{
    public static final atxn a;
    private static volatile ahbe d;
    public int b;
    public atxm c;
    
    static {
        agzi.registerDefaultInstance(atxn.class, a = new atxn());
    }
    
    private atxn() {
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
                if ((d = atxn.d) == null) {
                    synchronized (atxn.class) {
                        if (atxn.d == null) {
                            atxn.d = (ahbe)new agzb((agzi)atxn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atxn.a;
            }
            case 4: {
                return new agza((agzi)atxn.a);
            }
            case 3: {
                return new atxn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
