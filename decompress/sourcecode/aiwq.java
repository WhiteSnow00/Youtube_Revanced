import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwq extends agzi implements ahax
{
    public static final aiwq a;
    private static volatile ahbe b;
    private int c;
    private ajzl d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aiwq.class, a = new aiwq());
    }
    
    private aiwq() {
        this.e = 2;
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
                if ((b2 = aiwq.b) == null) {
                    synchronized (aiwq.class) {
                        if (aiwq.b == null) {
                            aiwq.b = (ahbe)new agzb((agzi)aiwq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwq.a;
            }
            case 4: {
                return new agza((agzi)aiwq.a);
            }
            case 3: {
                return new aiwq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwq.a, "\u0001\u0001\u0000\u0001\uf3fb\u30fa\uf3fb\u30fa\u0001\u0000\u0000\u0001\uf3fb\u30fa\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
