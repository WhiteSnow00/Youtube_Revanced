import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angq extends ahbh implements ahcw
{
    public static final angq a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)angq.class, (ahbh)(a = new angq()));
    }
    
    private angq() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = angq.d) == null) {
                    synchronized (angq.class) {
                        if (angq.d == null) {
                            angq.d = (ahdd)new ahba((ahbh)angq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angq.a;
            }
            case 4: {
                return new ahaz((ahbh)angq.a);
            }
            case 3: {
                return new angq();
            }
            case 2: {
                return newMessageInfo((MessageLite)angq.a, "\u0001\u0004\u0001\u0000\ufba7\u3d38\ue2ca\u7898\u0004\u0000\u0000\u0004\ufba7\u3d38\u143c\u0000\uf8af\u4750\u143c\u0000\uf492\u4933\u143c\u0000\ue2ca\u7898\u143c\u0000", new Object[] { "c", "b", angp.class, ajni.class, ajmo.class, ammq.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
