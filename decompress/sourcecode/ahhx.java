import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhx extends agzi implements ahax
{
    public static final ahhx a;
    private static volatile ahbe d;
    public int b;
    public ahhr c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahhx.class, a = new ahhx());
    }
    
    private ahhx() {
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
                final ahbe d;
                if ((d = ahhx.d) == null) {
                    synchronized (ahhx.class) {
                        if (ahhx.d == null) {
                            ahhx.d = (ahbe)new agzb((agzi)ahhx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahhx.a;
            }
            case 4: {
                return new agza((agzi)ahhx.a);
            }
            case 3: {
                return new ahhx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhx.a, "\u0001\u0001\u0000\u0001\uf2eb\u2c8b\uf2eb\u2c8b\u0001\u0000\u0000\u0001\uf2eb\u2c8b\u1409\u0000", new Object[] { "b", "c" });
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
