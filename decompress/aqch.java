import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqch extends ahcz implements aheo
{
    public static final aqch a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqch.class, a = new aqch());
    }
    
    private aqch() {
        this.b = 0;
        this.e = 2;
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
                if ((d = aqch.d) == null) {
                    synchronized (aqch.class) {
                        if (aqch.d == null) {
                            aqch.d = (ahev)new ahcs((ahcz)aqch.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqch.a;
            }
            case 4: {
                return new ahcr((ahcz)aqch.a);
            }
            case 3: {
                return new aqch();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqch.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u103c\u0000\u0003\u143c\u0000", new Object[] { "c", "b", aqci.class, aqck.class, aqcj.class });
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
