import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afnr extends agzi implements ahax
{
    public static final afnr a;
    public static final agzg b;
    private static volatile ahbe d;
    public int c;
    private Object e;
    private byte f;
    
    static {
        final afnr a2 = new afnr();
        agzi.registerDefaultInstance(afnr.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)afoh.a, a2, (MessageLite)a2, null, 772, ahcm.k, afnr.class);
    }
    
    private afnr() {
        this.c = 0;
        this.f = 2;
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
                if ((d = afnr.d) == null) {
                    synchronized (afnr.class) {
                        if (afnr.d == null) {
                            afnr.d = (ahbe)new agzb((agzi)afnr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afnr.a;
            }
            case 4: {
                return new agza((agzi)afnr.a);
            }
            case 3: {
                return new afnr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afnr.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u143c\u0000", new Object[] { "e", "c", afpd.class, afpc.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
