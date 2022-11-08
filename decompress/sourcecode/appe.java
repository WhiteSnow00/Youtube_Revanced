import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appe extends agzi implements ahax
{
    public static final appe a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)appe.class, (agzi)(a = new appe()));
    }
    
    private appe() {
        this.b = 0;
        this.e = 2;
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
                final ahbe d;
                if ((d = appe.d) == null) {
                    synchronized (appe.class) {
                        if (appe.d == null) {
                            appe.d = (ahbe)new agzb((agzi)appe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appe.a;
            }
            case 4: {
                return new agza((agzi)appe.a);
            }
            case 3: {
                return new appe();
            }
            case 2: {
                return newMessageInfo((MessageLite)appe.a, "\u0001\u0003\u0001\u0000\uf395\u1e2b\uf185\u1e33\u0003\u0000\u0000\u0003\uf395\u1e2b\u143c\u0000\ue4e1\u1e2d\u143c\u0000\uf185\u1e33\u143c\u0000", new Object[] { "c", "b", appi.class, apox.class, apph.class });
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
