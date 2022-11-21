import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammk extends ahcz implements aheo
{
    public static final ammk a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public int d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(ammk.class, a = new ammk());
    }
    
    private ammk() {
        this.f = 2;
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ammk.e) == null) {
                    synchronized (ammk.class) {
                        if (ammk.e == null) {
                            ammk.e = (ahev)new ahcs((ahcz)ammk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ammk.a;
            }
            case 4: {
                return new ahcr((ahcz)ammk.a);
            }
            case 3: {
                return new ammk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammk.a, "\u0001\u0002\u0000\u0001\u0001\ufb21\u43ad\u0002\u0000\u0001\u0001\u0001\u100c\u0000\ufb21\u43ad\u041b", new Object[] { "b", "d", amgw.s, "c", ammj.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
