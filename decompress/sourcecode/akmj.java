import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmj extends agzi implements ahax
{
    public static final akmj a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(akmj.class, a = new akmj());
    }
    
    private akmj() {
        this.e = "";
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
                if ((f = akmj.f) == null) {
                    synchronized (akmj.class) {
                        if (akmj.f == null) {
                            akmj.f = (ahbe)new agzb((agzi)akmj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akmj.a;
            }
            case 4: {
                return new agza((agzi)akmj.a);
            }
            case 3: {
                return new akmj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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