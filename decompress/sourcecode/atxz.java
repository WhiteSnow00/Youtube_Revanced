import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxz extends agzi implements ahax
{
    public static final atxz a;
    private static volatile ahbe l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public agzy k;
    
    static {
        agzi.registerDefaultInstance(atxz.class, a = new atxz());
    }
    
    private atxz() {
        this.k = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = atxz.l) == null) {
                    synchronized (atxz.class) {
                        if (atxz.l == null) {
                            atxz.l = (ahbe)new agzb((agzi)atxz.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return atxz.a;
            }
            case 4: {
                return new agza((boolean[][])null, (short[][])null);
            }
            case 3: {
                return new atxz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxz.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1002\u0007\n\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", atxy.class });
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
