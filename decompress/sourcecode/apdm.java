import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdm extends agzi implements ahax
{
    public static final apdm a;
    private static volatile ahbe b;
    private int c;
    private aiva d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apdm.class, a = new apdm());
    }
    
    private apdm() {
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
                if ((b2 = apdm.b) == null) {
                    synchronized (apdm.class) {
                        if (apdm.b == null) {
                            apdm.b = (ahbe)new agzb((agzi)apdm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apdm.a;
            }
            case 4: {
                return new agza((agzi)apdm.a);
            }
            case 3: {
                return new apdm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdm.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "c", "d" });
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
