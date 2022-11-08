import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplt extends agzi implements ahax
{
    public static final aplt a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aplt.class, a = new aplt());
    }
    
    private aplt() {
        this.e = 2;
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = aplt.b) == null) {
                    synchronized (aplt.class) {
                        if (aplt.b == null) {
                            aplt.b = (ahbe)new agzb((agzi)aplt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aplt.a;
            }
            case 4: {
                return new agza((agzi)aplt.a);
            }
            case 3: {
                return new aplt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
