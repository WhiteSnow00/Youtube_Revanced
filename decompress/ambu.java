import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambu extends ahcz implements aheo
{
    public static final ambu a;
    private static volatile ahev h;
    public int b;
    public String c;
    public String d;
    public ahdp e;
    public ahdp f;
    public String g;
    
    static {
        ahcz.registerDefaultInstance(ambu.class, a = new ambu());
    }
    
    private ambu() {
        this.c = "";
        final ahbt b = ahbt.b;
        this.d = "";
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = ambu.h) == null) {
                    synchronized (ambu.class) {
                        if (ambu.h == null) {
                            ambu.h = (ahev)new ahcs((ahcz)ambu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ambu.a;
            }
            case 4: {
                return new ahcr((ahcz)ambu.a);
            }
            case 3: {
                return new ambu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ambu.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u001a\u0005\u001b\u0006\u1008\u0003", new Object[] { "b", "c", "d", "e", "f", ajht.class, "g" });
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
