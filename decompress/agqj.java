import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqj extends ahcz implements aheo
{
    public static final agqj a;
    private static volatile ahev f;
    public int b;
    public long c;
    public ahdk d;
    public ahdp e;
    
    static {
        ahcz.registerDefaultInstance(agqj.class, a = new agqj());
    }
    
    private agqj() {
        ahcz.emptyProtobufList();
        this.d = ahcz.emptyLongList();
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = agqj.f) == null) {
                    synchronized (agqj.class) {
                        if (agqj.f == null) {
                            agqj.f = (ahev)new ahcs((ahcz)agqj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agqj.a;
            }
            case 4: {
                return new ahcr((ahcz)agqj.a);
            }
            case 3: {
                return new agqj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqj.a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005\u1005\u0001\u0006\u0017", new Object[] { "b", "e", agqi.class, "c", "d" });
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
