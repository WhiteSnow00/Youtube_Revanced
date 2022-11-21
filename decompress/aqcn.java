import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcn extends ahcz implements aheo
{
    public static final aqcn a;
    private static volatile ahev d;
    public int b;
    public aqcl c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqcn.class, a = new aqcn());
    }
    
    private aqcn() {
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
                if ((d = aqcn.d) == null) {
                    synchronized (aqcn.class) {
                        if (aqcn.d == null) {
                            aqcn.d = (ahev)new ahcs((ahcz)aqcn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcn.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcn.a);
            }
            case 3: {
                return new aqcn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcn.a, "\u0001\u0001\u0000\u0001\uefd9\u3d35\uefd9\u3d35\u0001\u0000\u0000\u0001\uefd9\u3d35\u1409\u0000", new Object[] { "b", "c" });
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
