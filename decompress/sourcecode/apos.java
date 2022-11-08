import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apos extends agzi implements ahax
{
    public static final apos a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apos.class, (agzi)(a = new apos()));
    }
    
    private apos() {
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
                if ((d = apos.d) == null) {
                    synchronized (apos.class) {
                        if (apos.d == null) {
                            apos.d = (ahbe)new agzb((agzi)apos.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apos.a;
            }
            case 4: {
                return new agza((agzi)apos.a);
            }
            case 3: {
                return new apos();
            }
            case 2: {
                return newMessageInfo((MessageLite)apos.a, "\u0001\u0003\u0001\u0000\ue113\u3a90\uf492\u4933\u0003\u0000\u0000\u0003\ue113\u3a90\u143c\u0000\uffdb\u3e3c\u143c\u0000\uf492\u4933\u143c\u0000", new Object[] { "c", "b", appb.class, aoif.class, ajkj.class });
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
