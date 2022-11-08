import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwa extends agzi implements ahax
{
    public static final amwa a;
    private static volatile ahbe d;
    public int b;
    public amvz c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amwa.class, a = new amwa());
    }
    
    private amwa() {
        this.e = 2;
    }
    
    @Override
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
                if ((d = amwa.d) == null) {
                    synchronized (amwa.class) {
                        if (amwa.d == null) {
                            amwa.d = (ahbe)new agzb((agzi)amwa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amwa.a;
            }
            case 4: {
                return new agza((agzi)amwa.a);
            }
            case 3: {
                return new amwa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwa.a, "\u0001\u0001\u0000\u0001\ueaae\u2522\ueaae\u2522\u0001\u0000\u0000\u0001\ueaae\u2522\u1409\u0000", new Object[] { "b", "c" });
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
