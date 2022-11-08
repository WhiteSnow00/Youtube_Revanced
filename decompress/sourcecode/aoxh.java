import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxh extends agzi implements ahax
{
    public static final aoxh a;
    private static volatile ahbe b;
    private int c;
    private aiva d;
    private ajzl e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aoxh.class, a = new aoxh());
    }
    
    private aoxh() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aoxh.b) == null) {
                    synchronized (aoxh.class) {
                        if (aoxh.b == null) {
                            aoxh.b = (ahbe)new agzb((agzi)aoxh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aoxh.a;
            }
            case 4: {
                return new agza((agzi)aoxh.a);
            }
            case 3: {
                return new aoxh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoxh.a, "\u0001\u0002\u0000\u0001\uf321\u1e90\uf3fb\u30fa\u0002\u0000\u0000\u0002\uf321\u1e90\u1409\u0000\uf3fb\u30fa\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
