import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdc extends ahcz implements aheo
{
    public static final akdc a;
    private static volatile ahev i;
    public int b;
    public int c;
    public int d;
    public int e;
    public ahdp f;
    public ahdp g;
    public int h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akdc.class, a = new akdc());
    }
    
    private akdc() {
        this.j = 2;
        this.f = ahcz.emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
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
                if ((i = akdc.i) == null) {
                    synchronized (akdc.class) {
                        if (akdc.i == null) {
                            akdc.i = (ahev)new ahcs((ahcz)akdc.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akdc.a;
            }
            case 4: {
                return new ahcr((ahcz)akdc.a);
            }
            case 3: {
                return new akdc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdc.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0002\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u041b\u0005\u041b\u0006\u1004\u0003", new Object[] { "b", "c", "d", "e", "f", anxb.class, "g", anxb.class, "h" });
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
