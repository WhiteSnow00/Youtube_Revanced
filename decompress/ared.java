import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ared extends ahcz implements aheo
{
    public static final ared a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ared.class, a = new ared());
    }
    
    private ared() {
        this.e = 2;
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = ared.d) == null) {
                    synchronized (ared.class) {
                        if (ared.d == null) {
                            ared.d = (ahev)new ahcs((ahcz)ared.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ared.a;
            }
            case 4: {
                return new ahcr((int[][])null, (short[])null);
            }
            case 3: {
                return new ared();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ared.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002\u041b", new Object[] { "b", aref.class, "c", ardx.class });
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
