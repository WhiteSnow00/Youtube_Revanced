import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuk extends agzi implements ahax
{
    public static final amuk a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public int e;
    public float f;
    public boolean g;
    
    static {
        agzi.registerDefaultInstance(amuk.class, a = new amuk());
    }
    
    private amuk() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = amuk.h) == null) {
                    synchronized (amuk.class) {
                        if (amuk.h == null) {
                            amuk.h = (ahbe)new agzb((agzi)amuk.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amuk.a;
            }
            case 4: {
                return new agza((agzi)amuk.a);
            }
            case 3: {
                return new amuk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amuk.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100b\u0002\u0007\u1001\u0004\b\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
