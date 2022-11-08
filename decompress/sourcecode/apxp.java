import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxp extends agzi implements ahax
{
    public static final apxp a;
    private static volatile ahbe d;
    public int b;
    public apxn c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apxp.class, a = new apxp());
    }
    
    private apxp() {
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
                if ((d = apxp.d) == null) {
                    synchronized (apxp.class) {
                        if (apxp.d == null) {
                            apxp.d = (ahbe)new agzb((agzi)apxp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxp.a;
            }
            case 4: {
                return new agza((agzi)apxp.a);
            }
            case 3: {
                return new apxp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxp.a, "\u0001\u0001\u0000\u0001\uefd9\u3d35\uefd9\u3d35\u0001\u0000\u0000\u0001\uefd9\u3d35\u1409\u0000", new Object[] { "b", "c" });
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
