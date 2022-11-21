import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyv extends ahcz implements aheo
{
    public static final alyv a;
    private static volatile ahev i;
    public int b;
    public String c;
    public String d;
    public aluj e;
    public ahdp f;
    public boolean g;
    public long h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alyv.class, a = new alyv());
    }
    
    private alyv() {
        this.j = 2;
        this.c = "";
        this.d = "";
        this.f = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = alyv.i) == null) {
                    synchronized (alyv.class) {
                        if (alyv.i == null) {
                            alyv.i = (ahev)new ahcs((ahcz)alyv.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alyv.a;
            }
            case 4: {
                return new ahcr((ahcz)alyv.a);
            }
            case 3: {
                return new alyv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyv.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u1008\u0001\u0002\u1008\u0000\u0003\u1009\u0002\u0004\u041b\u0005\u1007\u0003\u0006\u1002\u0004", new Object[] { "b", "d", "c", "e", "f", ajqp.class, "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
