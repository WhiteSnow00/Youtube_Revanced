import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxm extends agzi implements ahax
{
    public static final atxm a;
    private static volatile ahbe f;
    public int b;
    public long c;
    public boolean d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(atxm.class, a = new atxm());
    }
    
    private atxm() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = atxm.f) == null) {
                    synchronized (atxm.class) {
                        if (atxm.f == null) {
                            atxm.f = (ahbe)new agzb((agzi)atxm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atxm.a;
            }
            case 4: {
                return new agza((agzi)atxm.a);
            }
            case 3: {
                return new atxm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
