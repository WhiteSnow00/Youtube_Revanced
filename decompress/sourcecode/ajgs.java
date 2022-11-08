import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgs extends agzi implements ahax
{
    public static final ajgs a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public Object d;
    private byte f;
    
    static {
        final ajgs a2 = new ajgs();
        agzi.registerDefaultInstance(ajgs.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajfp.a, a2, (MessageLite)a2, null, 379568079, ahcm.k, ajgs.class);
    }
    
    private ajgs() {
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
                final ahbe e;
                if ((e = ajgs.e) == null) {
                    synchronized (ajgs.class) {
                        if (ajgs.e == null) {
                            ajgs.e = (ahbe)new agzb((agzi)ajgs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajgs.a;
            }
            case 4: {
                return new agza((agzi)ajgs.a);
            }
            case 3: {
                return new ajgs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgs.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u103b\u0000\u0002\u143c\u0000", new Object[] { "d", "c", aqbm.class });
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
