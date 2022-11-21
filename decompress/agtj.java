import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtj extends ahcz implements aheo
{
    public static final agtj a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public agtk d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(agtj.class, a = new agtj());
    }
    
    private agtj() {
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
                if ((e = agtj.e) == null) {
                    synchronized (agtj.class) {
                        if (agtj.e == null) {
                            agtj.e = (ahev)new ahcs((ahcz)agtj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agtj.a;
            }
            case 4: {
                return new ahcr((ahcz)agtj.a);
            }
            case 3: {
                return new agtj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtj.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002\u041b\u0003\u1409\u0001", new Object[] { "b", "c", agti.class, "d" });
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
