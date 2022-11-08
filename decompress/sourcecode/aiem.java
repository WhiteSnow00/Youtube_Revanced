import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiem extends agzi implements ahax
{
    public static final aiem a;
    private static volatile ahbe f;
    public int b;
    public aiel c;
    public aiva d;
    public ajkj e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aiem.class, (agzi)(a = new aiem()));
    }
    
    private aiem() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aiem.f) == null) {
                    synchronized (aiem.class) {
                        if (aiem.f == null) {
                            aiem.f = (ahbe)new agzb((agzi)aiem.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aiem.a;
            }
            case 4: {
                return new agza((agzi)aiem.a);
            }
            case 3: {
                return new aiem();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiem.a, "\u0001\u0003\u0000\u0001\uf321\u1e90\uf492\u4933\u0003\u0000\u0000\u0003\uf321\u1e90\u1409\u0001\ueb42\u2621\u1409\u0000\uf492\u4933\u1409\u0003", new Object[] { "b", "d", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
