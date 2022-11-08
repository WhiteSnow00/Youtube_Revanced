import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikv extends agzi implements ahax
{
    public static final aikv a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aikv.class, a = new aikv());
    }
    
    private aikv() {
        this.b = 0;
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
                if ((d = aikv.d) == null) {
                    synchronized (aikv.class) {
                        if (aikv.d == null) {
                            aikv.d = (ahbe)new agzb((agzi)aikv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aikv.a;
            }
            case 4: {
                return new agza((agzi)aikv.a);
            }
            case 3: {
                return new aikv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikv.a, "\u0001\u0001\u0001\u0000\uf658\u42cb\uf658\u42cb\u0001\u0000\u0000\u0001\uf658\u42cb\u143c\u0000", new Object[] { "c", "b", aiku.class });
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
