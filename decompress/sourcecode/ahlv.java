import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlv extends agzi implements ahax
{
    public static final ahlv a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahlv.class, (agzi)(a = new ahlv()));
    }
    
    private ahlv() {
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
                if ((d = ahlv.d) == null) {
                    synchronized (ahlv.class) {
                        if (ahlv.d == null) {
                            ahlv.d = (ahbe)new agzb((agzi)ahlv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlv.a;
            }
            case 4: {
                return new agza((agzi)ahlv.a);
            }
            case 3: {
                return new ahlv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlv.a, "\u0001\u0003\u0001\u0000\ueec5\u2b21\uf492\u4933\u0003\u0000\u0000\u0003\ueec5\u2b21\u143c\u0000\uef92\u3a70\u143c\u0000\uf492\u4933\u143c\u0000", new Object[] { "c", "b", ahlw.class, ahlx.class, ajkj.class });
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
