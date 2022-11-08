import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbf extends agzi implements ahax
{
    public static final apbf a;
    private static volatile ahbe b;
    private int c;
    private apbc d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apbf.class, a = new apbf());
    }
    
    private apbf() {
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
                if ((b2 = apbf.b) == null) {
                    synchronized (apbf.class) {
                        if (apbf.b == null) {
                            apbf.b = (ahbe)new agzb((agzi)apbf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbf.a;
            }
            case 4: {
                return new agza((agzi)apbf.a);
            }
            case 3: {
                return new apbf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbf.a, "\u0001\u0001\u0000\u0001\uf706\u42f5\uf706\u42f5\u0001\u0000\u0000\u0001\uf706\u42f5\u1409\u0000", new Object[] { "c", "d" });
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
