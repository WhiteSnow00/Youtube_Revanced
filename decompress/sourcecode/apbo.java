import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbo extends agzi implements ahax
{
    public static final apbo a;
    private static volatile ahbe b;
    private int c;
    private aozd d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apbo.class, a = new apbo());
    }
    
    private apbo() {
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
                if ((b2 = apbo.b) == null) {
                    synchronized (apbo.class) {
                        if (apbo.b == null) {
                            apbo.b = (ahbe)new agzb((agzi)apbo.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbo.a;
            }
            case 4: {
                return new agza((agzi)apbo.a);
            }
            case 3: {
                return new apbo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbo.a, "\u0001\u0001\u0000\u0001\uf34b\u40fa\uf34b\u40fa\u0001\u0000\u0000\u0001\uf34b\u40fa\u1409\u0000", new Object[] { "c", "d" });
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
