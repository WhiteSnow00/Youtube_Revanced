import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcp extends agzi implements ahax
{
    public static final apcp a;
    private static volatile ahbe b;
    private int c;
    private apcq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apcp.class, a = new apcp());
    }
    
    private apcp() {
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
                final ahbe b2;
                if ((b2 = apcp.b) == null) {
                    synchronized (apcp.class) {
                        if (apcp.b == null) {
                            apcp.b = (ahbe)new agzb((agzi)apcp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcp.a;
            }
            case 4: {
                return new agza((agzi)apcp.a);
            }
            case 3: {
                return new apcp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcp.a, "\u0001\u0001\u0000\u0001\ufa35\u38b8\ufa35\u38b8\u0001\u0000\u0000\u0001\ufa35\u38b8\u1409\u0000", new Object[] { "c", "d" });
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
