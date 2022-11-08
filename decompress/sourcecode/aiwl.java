import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwl extends agzi implements ahax
{
    public static final aiwl a;
    private static volatile ahbe b;
    private int c;
    private aiwk d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aiwl.class, a = new aiwl());
    }
    
    private aiwl() {
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
                if ((b2 = aiwl.b) == null) {
                    synchronized (aiwl.class) {
                        if (aiwl.b == null) {
                            aiwl.b = (ahbe)new agzb((agzi)aiwl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwl.a;
            }
            case 4: {
                return new agza((agzi)aiwl.a);
            }
            case 3: {
                return new aiwl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwl.a, "\u0001\u0001\u0000\u0001\uf5d8\u2eee\uf5d8\u2eee\u0001\u0000\u0000\u0001\uf5d8\u2eee\u1409\u0000", new Object[] { "c", "d" });
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
